// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.DirectMessage;
import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.TwitterException;

public interface DirectMessagesResources
{

    public abstract DirectMessage destroyDirectMessage(long l)
        throws TwitterException;

    public abstract ResponseList getDirectMessages()
        throws TwitterException;

    public abstract ResponseList getDirectMessages(Paging paging)
        throws TwitterException;

    public abstract ResponseList getSentDirectMessages()
        throws TwitterException;

    public abstract ResponseList getSentDirectMessages(Paging paging)
        throws TwitterException;

    public abstract DirectMessage sendDirectMessage(long l, String s)
        throws TwitterException;

    public abstract DirectMessage sendDirectMessage(String s, String s1)
        throws TwitterException;

    public abstract DirectMessage showDirectMessage(long l)
        throws TwitterException;
}
