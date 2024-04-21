package hello.core.member;

public interface MemberService {
    void join(Member member);

    void findMember(Long memberId);
}
