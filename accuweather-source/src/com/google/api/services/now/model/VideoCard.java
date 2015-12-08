// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;

// Referenced classes of package com.google.api.services.now.model:
//            TemplatedString, Image, TappableImage

public final class VideoCard extends GenericJson
{

    private String backgroundColor;
    private TemplatedString content;
    private Long durationSeconds;
    private Image logo;
    private TappableImage tappableImage;
    private TemplatedString title;

    public VideoCard()
    {
    }

    public volatile GenericJson clone()
    {
        return clone();
    }

    public volatile GenericData clone()
    {
        return clone();
    }

    public VideoCard clone()
    {
        return (VideoCard)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public String getBackgroundColor()
    {
        return backgroundColor;
    }

    public TemplatedString getContent()
    {
        return content;
    }

    public Long getDurationSeconds()
    {
        return durationSeconds;
    }

    public Image getLogo()
    {
        return logo;
    }

    public TappableImage getTappableImage()
    {
        return tappableImage;
    }

    public TemplatedString getTitle()
    {
        return title;
    }

    public volatile GenericJson set(String s, Object obj)
    {
        return set(s, obj);
    }

    public volatile GenericData set(String s, Object obj)
    {
        return set(s, obj);
    }

    public VideoCard set(String s, Object obj)
    {
        return (VideoCard)super.set(s, obj);
    }

    public VideoCard setBackgroundColor(String s)
    {
        backgroundColor = s;
        return this;
    }

    public VideoCard setContent(TemplatedString templatedstring)
    {
        content = templatedstring;
        return this;
    }

    public VideoCard setDurationSeconds(Long long1)
    {
        durationSeconds = long1;
        return this;
    }

    public VideoCard setLogo(Image image)
    {
        logo = image;
        return this;
    }

    public VideoCard setTappableImage(TappableImage tappableimage)
    {
        tappableImage = tappableimage;
        return this;
    }

    public VideoCard setTitle(TemplatedString templatedstring)
    {
        title = templatedstring;
        return this;
    }
}
