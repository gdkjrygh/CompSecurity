// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.Paging;
import twitter4j.ResponseList;
import twitter4j.TwitterException;

public interface TimelineMethods
{

    public abstract ResponseList getFriendsTimeline()
        throws TwitterException;

    public abstract ResponseList getFriendsTimeline(Paging paging)
        throws TwitterException;

    public abstract ResponseList getHomeTimeline()
        throws TwitterException;

    public abstract ResponseList getHomeTimeline(Paging paging)
        throws TwitterException;

    public abstract ResponseList getMentions()
        throws TwitterException;

    public abstract ResponseList getMentions(Paging paging)
        throws TwitterException;

    public abstract ResponseList getPublicTimeline()
        throws TwitterException;

    public abstract ResponseList getRetweetedByMe()
        throws TwitterException;

    public abstract ResponseList getRetweetedByMe(Paging paging)
        throws TwitterException;

    public abstract ResponseList getRetweetedByUser(long l, Paging paging)
        throws TwitterException;

    public abstract ResponseList getRetweetedByUser(String s, Paging paging)
        throws TwitterException;

    public abstract ResponseList getRetweetedToMe()
        throws TwitterException;

    public abstract ResponseList getRetweetedToMe(Paging paging)
        throws TwitterException;

    public abstract ResponseList getRetweetedToUser(long l, Paging paging)
        throws TwitterException;

    public abstract ResponseList getRetweetedToUser(String s, Paging paging)
        throws TwitterException;

    public abstract ResponseList getRetweetsOfMe()
        throws TwitterException;

    public abstract ResponseList getRetweetsOfMe(Paging paging)
        throws TwitterException;

    public abstract ResponseList getUserTimeline()
        throws TwitterException;

    public abstract ResponseList getUserTimeline(long l)
        throws TwitterException;

    public abstract ResponseList getUserTimeline(long l, Paging paging)
        throws TwitterException;

    public abstract ResponseList getUserTimeline(String s)
        throws TwitterException;

    public abstract ResponseList getUserTimeline(String s, Paging paging)
        throws TwitterException;

    public abstract ResponseList getUserTimeline(Paging paging)
        throws TwitterException;
}
