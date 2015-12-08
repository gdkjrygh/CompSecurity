// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.content.models.overlay.premierleague;

import java.util.List;

public class ConfigurationInfo
{
    public class FeedInfo
    {

        String baseUrl;
        String feedName;
        FeedParams feedParameters;
        int pollIntervalSeconds;
        final ConfigurationInfo this$0;

        public String getBaseUrl()
        {
            return baseUrl;
        }

        public String getFeedName()
        {
            return feedName;
        }

        public FeedParams getFeedParameters()
        {
            return feedParameters;
        }

        public int getPollIntervalSeconds()
        {
            return pollIntervalSeconds;
        }

        public FeedInfo()
        {
            this$0 = ConfigurationInfo.this;
            super();
        }
    }

    public static class FeedParams
    {

        String date;
        String gameId;
        String season;
        String week;

        public String getDate()
        {
            return date;
        }

        public String getGameId()
        {
            return gameId;
        }

        public String getSeason()
        {
            return season;
        }

        public String getWeek()
        {
            return week;
        }

        public FeedParams()
        {
        }
    }


    List liveSources;

    public ConfigurationInfo()
    {
    }

    public List getLiveSources()
    {
        return liveSources;
    }
}
