// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.Paging;

public interface ListsResourcesAsync
{

    public abstract void createUserList(String s, boolean flag, String s1);

    public abstract void createUserListMember(long l, long l1);

    public abstract void createUserListMember(long l, String s, long l1);

    public abstract void createUserListMembers(long l, String s, long al[]);

    public abstract void createUserListMembers(long l, String s, String as[]);

    public abstract void createUserListMembers(long l, long al[]);

    public abstract void createUserListMembers(long l, String as[]);

    public abstract void createUserListSubscription(long l);

    public abstract void createUserListSubscription(long l, String s);

    public abstract void destroyUserList(long l);

    public abstract void destroyUserList(long l, String s);

    public abstract void destroyUserListMember(long l, long l1);

    public abstract void destroyUserListMember(long l, String s, long l1);

    public abstract void destroyUserListSubscription(long l);

    public abstract void destroyUserListSubscription(long l, String s);

    public abstract void getUserListMembers(long l, long l1);

    public abstract void getUserListMembers(long l, String s, long l1);

    public abstract void getUserListMemberships(long l);

    public abstract void getUserListMemberships(long l, long l1);

    public abstract void getUserListMemberships(long l, long l1, boolean flag);

    public abstract void getUserListMemberships(String s, long l);

    public abstract void getUserListMemberships(String s, long l, boolean flag);

    public abstract void getUserListStatuses(long l, String s, Paging paging);

    public abstract void getUserListStatuses(long l, Paging paging);

    public abstract void getUserListSubscribers(long l, long l1);

    public abstract void getUserListSubscribers(long l, String s, long l1);

    public abstract void getUserListSubscriptions(String s, long l);

    public abstract void getUserLists(long l);

    public abstract void getUserLists(String s);

    public abstract void showUserList(long l);

    public abstract void showUserList(long l, String s);

    public abstract void showUserListMembership(long l, long l1);

    public abstract void showUserListMembership(long l, String s, long l1);

    public abstract void showUserListSubscription(long l, long l1);

    public abstract void showUserListSubscription(long l, String s, long l1);

    public abstract void updateUserList(long l, String s, String s1, boolean flag, String s2);

    public abstract void updateUserList(long l, String s, boolean flag, String s1);
}
