// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.branches;

import com.netflix.mediaclient.servicemgr.VideoType;

public class Video
{
    public static class Bookmark
    {

        private int bookmarkPosition;
        private long lastModified;

        public int getBookmarkPosition()
        {
            return bookmarkPosition;
        }

        public long getLastModified()
        {
            return lastModified;
        }

        public void setBookmarkPosition(int i)
        {
            bookmarkPosition = i;
        }

        public void setLastModified(long l)
        {
            lastModified = l;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Bookmark [bookmarkPosition=").append(bookmarkPosition).append(", lastModified=").append(lastModified).append("]").toString();
        }

        public Bookmark()
        {
        }
    }

    public static class BookmarkStill
    {

        public String stillUrl;

        public BookmarkStill()
        {
        }
    }

    public static class Detail
    {

        public String actors;
        public String baseUrl;
        public String bifUrl;
        public String certification;
        public String directors;
        public int endtime;
        public int episodeCount;
        public String genres;
        public String horzDispUrl;
        public String intrUrl;
        public boolean isAutoPlayEnabled;
        public boolean isHdAvailable;
        public boolean isNextPlayableEpisode;
        public boolean isPinProtected;
        public String mdxHorzUrl;
        public String mdxVertUrl;
        public float predictedRating;
        public String quality;
        public String restUrl;
        public int runtime;
        public int seasonCount;
        public String storyImgUrl;
        public String synopsis;
        public String synopsisNarrative;
        public String tvCardUrl;
        public int year;

        public String toString()
        {
            return (new StringBuilder()).append("Detail [year=").append(year).append(", synopsis=").append(synopsis).append(", synopsisNarrative=").append(synopsisNarrative).append(", quality=").append(quality).append(", directors=").append(directors).append(", actors=").append(actors).append(", genres=").append(genres).append(", certification=").append(certification).append(", horzDispUrl=").append(horzDispUrl).append(", restUrl=").append(restUrl).append(", bifUrl=").append(bifUrl).append(", baseUrl=").append(baseUrl).append(", tvCardUrl=").append(tvCardUrl).append(", mdxHorzUrl=").append(mdxHorzUrl).append(", mdxVertUrl=").append(mdxVertUrl).append(", storyImgUrl=").append(storyImgUrl).append(", intrUrl=").append(intrUrl).append(", episodeCount=").append(episodeCount).append(", seasonCount=").append(seasonCount).append(", isHdAvailable=").append(isHdAvailable).append(", isAutoPlayEnabled=").append(isAutoPlayEnabled).append(", isNextPlayableEpisode=").append(isNextPlayableEpisode).append(", predictedRating=").append(predictedRating).append(", isPinProtected=").append(isPinProtected).append(", runtime=").append(runtime).append(", endtime=").append(endtime).append("]").toString();
        }

        public Detail()
        {
        }
    }

    public static class InQueue
    {

        public boolean inQueue;

        public String toString()
        {
            return (new StringBuilder()).append("InQueue [inQueue=").append(inQueue).append("]").toString();
        }

        public InQueue()
        {
        }
    }

    public static class Rating
    {

        public float userRating;

        public String toString()
        {
            return (new StringBuilder()).append("Rating [userRating=").append(userRating).append("]").toString();
        }

        public Rating()
        {
        }
    }

    public static class SearchTitle
    {

        public String certification;
        public int releaseYear;
        public String title;

        public String toString()
        {
            return title;
        }

        public SearchTitle()
        {
        }
    }

    public static class Summary
        implements com.netflix.mediaclient.servicemgr.Video
    {

        protected String boxartUrl;
        protected VideoType enumType;
        public VideoType errorType;
        public String horzDispUrl;
        protected String id;
        protected boolean isEpisode;
        public String squareUrl;
        protected String title;
        public String tvCardUrl;
        protected String type;
        public int videoYear;

        public String getBoxshotURL()
        {
            return boxartUrl;
        }

        public VideoType getErrorType()
        {
            return errorType;
        }

        public String getHorzDispUrl()
        {
            return horzDispUrl;
        }

        public String getId()
        {
            return id;
        }

        public String getSquareUrl()
        {
            return squareUrl;
        }

        public String getTitle()
        {
            return title;
        }

        public String getTvCardUrl()
        {
            return tvCardUrl;
        }

        public VideoType getType()
        {
            if (enumType == null)
            {
                enumType = VideoType.create(type);
            }
            return enumType;
        }

        public boolean isEpisode()
        {
            return isEpisode;
        }

        public void setErrorType(VideoType videotype)
        {
            errorType = videotype;
        }

        public String toString()
        {
            return (new StringBuilder()).append("Summary [id=").append(id).append(", type=").append(type).append(", title=").append(title).append(", isEpisode=").append(isEpisode).append("]").toString();
        }

        public Summary()
        {
        }
    }


    public Video()
    {
    }

    public static boolean isSocialVideoType(VideoType videotype)
    {
        return VideoType.SOCIAL_FRIEND.equals(videotype) || VideoType.SOCIAL_GROUP.equals(videotype) || VideoType.SOCIAL_POPULAR.equals(videotype);
    }
}
