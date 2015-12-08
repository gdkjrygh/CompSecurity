// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model.branches;

import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.servicemgr.VideoType;

// Referenced classes of package com.netflix.mediaclient.service.webclient.model.branches:
//            Video

public static class 
    implements Video
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

    public ()
    {
    }
}
