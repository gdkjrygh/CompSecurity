// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.PagableResponseList;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.UserList;

public interface ListMembersMethods
{

    public abstract UserList addUserListMember(int i, long l)
        throws TwitterException;

    public abstract UserList addUserListMembers(int i, long al[])
        throws TwitterException;

    public abstract UserList addUserListMembers(int i, String as[])
        throws TwitterException;

    public abstract User checkUserListMembership(String s, int i, long l)
        throws TwitterException;

    public abstract UserList deleteUserListMember(int i, long l)
        throws TwitterException;

    public abstract PagableResponseList getUserListMembers(int i, long l)
        throws TwitterException;

    public abstract PagableResponseList getUserListMembers(long l, int i, long l1)
        throws TwitterException;

    public abstract PagableResponseList getUserListMembers(String s, int i, long l)
        throws TwitterException;

    public abstract User showUserListMembership(int i, long l)
        throws TwitterException;
}
