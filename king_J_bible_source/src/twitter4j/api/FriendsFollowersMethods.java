// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.IDs;
import twitter4j.TwitterException;

public interface FriendsFollowersMethods
{

    public abstract IDs getFollowersIDs(long l)
        throws TwitterException;

    public abstract IDs getFollowersIDs(long l, long l1)
        throws TwitterException;

    public abstract IDs getFollowersIDs(String s, long l)
        throws TwitterException;

    public abstract IDs getFriendsIDs(long l)
        throws TwitterException;

    public abstract IDs getFriendsIDs(long l, long l1)
        throws TwitterException;

    public abstract IDs getFriendsIDs(String s, long l)
        throws TwitterException;
}
