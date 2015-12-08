// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.IDs;
import twitter4j.PagableResponseList;
import twitter4j.Relationship;
import twitter4j.ResponseList;
import twitter4j.User;

public interface FriendsFollowersResources
{

    public abstract User createFriendship(long l);

    public abstract User createFriendship(long l, boolean flag);

    public abstract User createFriendship(String s);

    public abstract User createFriendship(String s, boolean flag);

    public abstract User destroyFriendship(long l);

    public abstract User destroyFriendship(String s);

    public abstract IDs getFollowersIDs(long l);

    public abstract IDs getFollowersIDs(long l, long l1);

    public abstract IDs getFollowersIDs(String s, long l);

    public abstract PagableResponseList getFollowersList(long l, long l1);

    public abstract PagableResponseList getFollowersList(String s, long l);

    public abstract IDs getFriendsIDs(long l);

    public abstract IDs getFriendsIDs(long l, long l1);

    public abstract IDs getFriendsIDs(String s, long l);

    public abstract PagableResponseList getFriendsList(long l, long l1);

    public abstract PagableResponseList getFriendsList(String s, long l);

    public abstract IDs getIncomingFriendships(long l);

    public abstract IDs getOutgoingFriendships(long l);

    public abstract ResponseList lookupFriendships(long al[]);

    public abstract ResponseList lookupFriendships(String as[]);

    public abstract Relationship showFriendship(long l, long l1);

    public abstract Relationship showFriendship(String s, String s1);

    public abstract Relationship updateFriendship(long l, boolean flag, boolean flag1);

    public abstract Relationship updateFriendship(String s, boolean flag, boolean flag1);
}
