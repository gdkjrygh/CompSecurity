// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.models.news;

import android.text.TextUtils;
import java.util.List;

// Referenced classes of package com.accuweather.android.models.news:
//            NewsModel, NewsMediaContentImage, NewsMediaThumbnail

public class NewsResult
{

    private String Description;
    private String LastUpdated;
    private String Link;
    private String PubDate;
    private String Title;
    private List mediaContent;
    private List mediaThumbnails;

    public NewsResult()
    {
    }

    public String getDescription()
    {
        return Description;
    }

    public String getLastUpdated()
    {
        return LastUpdated;
    }

    public String getLink()
    {
        return Link;
    }

    public List getMediaContent()
    {
        return mediaContent;
    }

    public List getMediaThumbnails()
    {
        return mediaThumbnails;
    }

    public String getPubDate()
    {
        return PubDate;
    }

    public String getTitle()
    {
        return Title;
    }

    public void setDescription(String s)
    {
        Description = s;
    }

    public void setLastUpdated(String s)
    {
        LastUpdated = s;
    }

    public void setLink(String s)
    {
        Link = s;
    }

    public void setMediaContent(List list)
    {
        mediaContent = list;
    }

    public void setMediaThumbnails(List list)
    {
        mediaThumbnails = list;
    }

    public void setPubDate(String s)
    {
        PubDate = s;
    }

    public void setTitle(String s)
    {
        Title = s;
    }

    public NewsModel toNewsModel()
    {
        NewsModel newsmodel = new NewsModel();
        if (getDescription() != null)
        {
            newsmodel.setDescription(getDescription());
        }
        if (getLastUpdated() == null);
        if (getLink() != null)
        {
            newsmodel.setUrl(getLink());
        }
        if (getTitle() != null)
        {
            newsmodel.setTitle(getTitle());
        }
        if (getPubDate() != null)
        {
            newsmodel.setDate(getPubDate());
        }
        if (getMediaContent() != null && !getMediaContent().isEmpty() && !TextUtils.isEmpty(((NewsMediaContentImage)getMediaContent().get(0)).getUrl()))
        {
            newsmodel.setImageUrl(((NewsMediaContentImage)getMediaContent().get(0)).getUrl());
        } else
        if (getMediaThumbnails() != null && !getMediaThumbnails().isEmpty() && !TextUtils.isEmpty(((NewsMediaThumbnail)getMediaThumbnails().get(0)).getUrl()))
        {
            newsmodel.setImageUrl(((NewsMediaThumbnail)getMediaThumbnails().get(0)).getUrl());
            return newsmodel;
        }
        return newsmodel;
    }
}
