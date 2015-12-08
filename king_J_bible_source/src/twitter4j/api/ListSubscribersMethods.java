// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.PagableResponseList;
import twitter4j.TwitterException;
import twitter4j.User;
import twitter4j.UserList;

public interface ListSubscribersMethods
{

    public abstract User checkUserListSubscription(String s, int i, long l)
        throws TwitterException;

    public abstract UserList createUserListSubscription(int i)
        throws TwitterException;

    public abstract UserList destroyUserListSubscription(int i)
        throws TwitterException;

    public abstract PagableResponseList getUserListSubscribers(int i, long l)
        throws TwitterException;

    public abstract PagableResponseList getUserListSubscribers(String s, int i, long l)
        throws TwitterException;

    public abstract User showUserListSubscription(int i, long l)
        throws TwitterException;

    public abstract UserList subscribeUserList(String s, int i)
        throws TwitterException;

    public abstract UserList unsubscribeUserList(String s, int i)
        throws TwitterException;
}
