// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.branches;


// Referenced classes of package com.netflix.mediaclient.service.webclient.model.branches:
//            Video

public class Episode extends Video
{
    public static class Detail extends Video.Detail
    {

        public String boxartUrl;
        private int episodeNumber;
        private String id;
        private String nextEpisodeId;
        private String nextEpisodeTitle;
        private String seasonId;
        private int seasonNumber;
        private String showId;
        private String showRestUrl;
        private String showTitle;
        private String title;

        public String getBaseUrl()
        {
            return baseUrl;
        }

        public String getBoxshotURL()
        {
            return boxartUrl;
        }

        public int getEpisodeNumber()
        {
            return episodeNumber;
        }

        public String getId()
        {
            return id;
        }

        public String getInterestingUrl()
        {
            return intrUrl;
        }

        public String getNextEpisodeId()
        {
            return nextEpisodeId;
        }

        public String getNextEpisodeTitle()
        {
            return nextEpisodeTitle;
        }

        public String getSeasonId()
        {
            return seasonId;
        }

        public int getSeasonNumber()
        {
            return seasonNumber;
        }

        public String getShowId()
        {
            return showId;
        }

        public String getShowRestUrl()
        {
            return showRestUrl;
        }

        public String getShowTitle()
        {
            return showTitle;
        }

        public String getTitle()
        {
            return title;
        }

        public boolean isAutoPlayEnabled()
        {
            return isAutoPlayEnabled;
        }

        public boolean isNextPlayableEpisode()
        {
            return isNextPlayableEpisode;
        }

        public Detail setId(String s)
        {
            id = s;
            return this;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Detail [super=").append(super.toString()).append(", id=").append(id).append(", seasonNumber=").append(seasonNumber).append(", episodeNumber=").append(episodeNumber).append(", showTitle=").append(showTitle).append(", title=").append(title).append(", nextEpisodeId=").append(nextEpisodeId).append(", nextEpisodeTitle=").append(nextEpisodeTitle).append("]").toString();
        }

        public Detail()
        {
        }
    }


    public Video.Bookmark bookmark;
    public Video.BookmarkStill bookmarkStill;
    public Detail detail;
    public Video.Summary summary;

    public Episode()
    {
    }
}
