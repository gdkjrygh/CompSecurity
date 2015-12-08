// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.branches;


// Referenced classes of package com.netflix.mediaclient.service.webclient.model.branches:
//            Video

public static class 
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

    public ()
    {
    }
}
