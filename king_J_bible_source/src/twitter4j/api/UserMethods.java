// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.PagableResponseList;
import twitter4j.ProfileImage;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;

public interface UserMethods
{

    public abstract PagableResponseList getFollowersStatuses(long l)
        throws TwitterException;

    public abstract PagableResponseList getFollowersStatuses(long l, long l1)
        throws TwitterException;

    public abstract PagableResponseList getFollowersStatuses(String s, long l)
        throws TwitterException;

    public abstract PagableResponseList getFriendsStatuses(long l)
        throws TwitterException;

    public abstract PagableResponseList getFriendsStatuses(long l, long l1)
        throws TwitterException;

    public abstract PagableResponseList getFriendsStatuses(String s, long l)
        throws TwitterException;

    public abstract ResponseList getMemberSuggestions(String s)
        throws TwitterException;

    public abstract ProfileImage getProfileImage(String s, twitter4j.ProfileImage.ImageSize imagesize)
        throws TwitterException;

    public abstract ResponseList getSuggestedUserCategories()
        throws TwitterException;

    public abstract ResponseList getUserSuggestions(String s)
        throws TwitterException;

    public abstract ResponseList lookupUsers(long al[])
        throws TwitterException;

    public abstract ResponseList lookupUsers(String as[])
        throws TwitterException;

    public abstract ResponseList searchUsers(String s, int i)
        throws TwitterException;

    public abstract User showUser(long l)
        throws TwitterException;

    public abstract User showUser(String s)
        throws TwitterException;
}
