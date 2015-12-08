// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.PagableResponseList;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.UserList;

public interface ListMethods
{

    public abstract UserList createUserList(String s, boolean flag, String s1)
        throws TwitterException;

    public abstract UserList destroyUserList(int i)
        throws TwitterException;

    public abstract ResponseList getAllUserLists(long l)
        throws TwitterException;

    public abstract ResponseList getAllUserLists(String s)
        throws TwitterException;

    public abstract PagableResponseList getUserListMemberships(long l)
        throws TwitterException;

    public abstract PagableResponseList getUserListMemberships(long l, long l1)
        throws TwitterException;

    public abstract PagableResponseList getUserListMemberships(long l, long l1, boolean flag)
        throws TwitterException;

    public abstract PagableResponseList getUserListMemberships(String s, long l)
        throws TwitterException;

    public abstract PagableResponseList getUserListMemberships(String s, long l, boolean flag)
        throws TwitterException;

    public abstract ResponseList getUserListStatuses(int i, Paging paging)
        throws TwitterException;

    public abstract ResponseList getUserListStatuses(long l, int i, Paging paging)
        throws TwitterException;

    public abstract ResponseList getUserListStatuses(String s, int i, Paging paging)
        throws TwitterException;

    public abstract PagableResponseList getUserListSubscriptions(String s, long l)
        throws TwitterException;

    public abstract PagableResponseList getUserLists(long l, long l1)
        throws TwitterException;

    public abstract PagableResponseList getUserLists(String s, long l)
        throws TwitterException;

    public abstract UserList showUserList(int i)
        throws TwitterException;

    public abstract UserList showUserList(String s, int i)
        throws TwitterException;

    public abstract UserList updateUserList(int i, String s, boolean flag, String s1)
        throws TwitterException;
}
