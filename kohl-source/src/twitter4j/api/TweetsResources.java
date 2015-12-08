// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.IDs;
import twitter4j.OEmbed;
import twitter4j.OEmbedRequest;
import twitter4j.ResponseList;
import twitter4j.Status;
import twitter4j.StatusUpdate;
import twitter4j.TwitterException;

public interface TweetsResources
{

    public abstract Status destroyStatus(long l)
        throws TwitterException;

    public abstract OEmbed getOEmbed(OEmbedRequest oembedrequest)
        throws TwitterException;

    public abstract IDs getRetweeterIds(long l, int i, long l1)
        throws TwitterException;

    public abstract IDs getRetweeterIds(long l, long l1)
        throws TwitterException;

    public abstract ResponseList getRetweets(long l)
        throws TwitterException;

    public abstract Status retweetStatus(long l)
        throws TwitterException;

    public abstract Status showStatus(long l)
        throws TwitterException;

    public abstract Status updateStatus(String s)
        throws TwitterException;

    public abstract Status updateStatus(StatusUpdate statusupdate)
        throws TwitterException;
}
