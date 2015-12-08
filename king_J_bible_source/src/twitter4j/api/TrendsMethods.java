// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.api;

import java.util.Date;
import twitter4j.ResponseList;
import twitter4j.TwitterException;

public interface TrendsMethods
{

    public abstract ResponseList getDailyTrends()
        throws TwitterException;

    public abstract ResponseList getDailyTrends(Date date, boolean flag)
        throws TwitterException;

    public abstract ResponseList getWeeklyTrends()
        throws TwitterException;

    public abstract ResponseList getWeeklyTrends(Date date, boolean flag)
        throws TwitterException;
}
