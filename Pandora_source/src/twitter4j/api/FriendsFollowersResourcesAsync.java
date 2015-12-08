// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;


public interface FriendsFollowersResourcesAsync
{

    public abstract void createFriendship(long l);

    public abstract void createFriendship(long l, boolean flag);

    public abstract void createFriendship(String s);

    public abstract void createFriendship(String s, boolean flag);

    public abstract void destroyFriendship(long l);

    public abstract void destroyFriendship(String s);

    public abstract void getFollowersIDs(long l);

    public abstract void getFollowersIDs(long l, long l1);

    public abstract void getFollowersIDs(String s, long l);

    public abstract void getFollowersList(long l, long l1);

    public abstract void getFollowersList(String s, long l);

    public abstract void getFriendsIDs(long l);

    public abstract void getFriendsIDs(long l, long l1);

    public abstract void getFriendsIDs(String s, long l);

    public abstract void getFriendsList(long l, long l1);

    public abstract void getFriendsList(String s, long l);

    public abstract void getIncomingFriendships(long l);

    public abstract void getOutgoingFriendships(long l);

    public abstract void lookupFriendships(long al[]);

    public abstract void lookupFriendships(String as[]);

    public abstract void showFriendship(long l, long l1);

    public abstract void showFriendship(String s, String s1);

    public abstract void updateFriendship(long l, boolean flag, boolean flag1);

    public abstract void updateFriendship(String s, boolean flag, boolean flag1);
}
