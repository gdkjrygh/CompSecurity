// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.webclient.model;

import com.netflix.mediaclient.service.webclient.model.branches.Video;
import com.netflix.mediaclient.servicemgr.VideoType;

public class SearchVideo extends Video
    implements com.netflix.mediaclient.servicemgr.SearchVideo
{

    public com.netflix.mediaclient.service.webclient.model.branches.Video.SearchTitle searchTitle;
    public com.netflix.mediaclient.service.webclient.model.branches.Video.Summary summary;

    public SearchVideo()
    {
    }

    public String getBoxshotURL()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getBoxshotURL();
        }
    }

    public String getCertification()
    {
        if (searchTitle == null)
        {
            return null;
        } else
        {
            return searchTitle.certification;
        }
    }

    public VideoType getErrorType()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getErrorType();
        }
    }

    public String getHorzDispUrl()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getHorzDispUrl();
        }
    }

    public String getId()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getId();
        }
    }

    public String getSquareUrl()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getSquareUrl();
        }
    }

    public String getTitle()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getTitle();
        }
    }

    public String getTvCardUrl()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getTvCardUrl();
        }
    }

    public VideoType getType()
    {
        if (summary == null)
        {
            return null;
        } else
        {
            return summary.getType();
        }
    }

    public int getYear()
    {
        Integer integer;
        if (searchTitle == null)
        {
            integer = null;
        } else
        {
            integer = Integer.valueOf(searchTitle.releaseYear);
        }
        return integer.intValue();
    }

    public String toString()
    {
        return (new StringBuilder()).append("SearchVideo [getTitle()=").append(getTitle()).append(", getType()=").append(getType()).append("]").toString();
    }
}
