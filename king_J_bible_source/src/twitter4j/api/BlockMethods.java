// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.IDs;
import twitter4j.ResponseList;
import twitter4j.TwitterException;
import twitter4j.User;

public interface BlockMethods
{

    public abstract User createBlock(long l)
        throws TwitterException;

    public abstract User createBlock(String s)
        throws TwitterException;

    public abstract User destroyBlock(long l)
        throws TwitterException;

    public abstract User destroyBlock(String s)
        throws TwitterException;

    public abstract boolean existsBlock(long l)
        throws TwitterException;

    public abstract boolean existsBlock(String s)
        throws TwitterException;

    public abstract ResponseList getBlockingUsers()
        throws TwitterException;

    public abstract ResponseList getBlockingUsers(int i)
        throws TwitterException;

    public abstract IDs getBlockingUsersIDs()
        throws TwitterException;
}
