// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.IDs;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;

public interface FriendshipMethods
{

    public abstract User createFriendship(long l)
        throws TwitterException;

    public abstract User createFriendship(long l, boolean flag)
        throws TwitterException;

    public abstract User createFriendship(String s)
        throws TwitterException;

    public abstract User createFriendship(String s, boolean flag)
        throws TwitterException;

    public abstract User destroyFriendship(long l)
        throws TwitterException;

    public abstract User destroyFriendship(String s)
        throws TwitterException;

    public abstract boolean existsFriendship(String s, String s1)
        throws TwitterException;

    public abstract IDs getIncomingFriendships(long l)
        throws TwitterException;

    public abstract IDs getNoRetweetIds()
        throws TwitterException;

    public abstract IDs getOutgoingFriendships(long l)
        throws TwitterException;

    public abstract ResponseList lookupFriendships(long al[])
        throws TwitterException;

    public abstract ResponseList lookupFriendships(String as[])
        throws TwitterException;

    public abstract Relationship showFriendship(long l, long l1)
        throws TwitterException;

    public abstract Relationship showFriendship(String s, String s1)
        throws TwitterException;

    public abstract Relationship updateFriendship(long l, boolean flag, boolean flag1)
        throws TwitterException;

    public abstract Relationship updateFriendship(String s, boolean flag, boolean flag1)
        throws TwitterException;
}
