// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import twitter4j.Paging;
import twitter4j.ResponseList;

public interface TimelinesResources
{

    public abstract ResponseList getHomeTimeline();

    public abstract ResponseList getHomeTimeline(Paging paging);

    public abstract ResponseList getMentions();

    public abstract ResponseList getMentions(Paging paging);

    public abstract ResponseList getMentionsTimeline();

    public abstract ResponseList getMentionsTimeline(Paging paging);

    public abstract ResponseList getRetweetsOfMe();

    public abstract ResponseList getRetweetsOfMe(Paging paging);

    public abstract ResponseList getUserTimeline();

    public abstract ResponseList getUserTimeline(long l);

    public abstract ResponseList getUserTimeline(long l, Paging paging);

    public abstract ResponseList getUserTimeline(String s);

    public abstract ResponseList getUserTimeline(String s, Paging paging);

    public abstract ResponseList getUserTimeline(Paging paging);
}
