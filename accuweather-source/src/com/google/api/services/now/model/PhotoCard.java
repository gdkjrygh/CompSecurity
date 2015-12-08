// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.services.now.model;

import com.google.api.client.json.GenericJson;
import com.google.api.client.util.GenericData;
import java.util.List;

// Referenced classes of package com.google.api.services.now.model:
//            Image, TemplatedString

public final class PhotoCard extends GenericJson
{

    private Image logo;
    private List tappableImages;
    private TemplatedString title;

    public PhotoCard()
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

    public PhotoCard clone()
    {
        return (PhotoCard)super.clone();
    }

    public volatile Object clone()
        throws CloneNotSupportedException
    {
        return clone();
    }

    public Image getLogo()
    {
        return logo;
    }

    public List getTappableImages()
    {
        return tappableImages;
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

    public PhotoCard set(String s, Object obj)
    {
        return (PhotoCard)super.set(s, obj);
    }

    public PhotoCard setLogo(Image image)
    {
        logo = image;
        return this;
    }

    public PhotoCard setTappableImages(List list)
    {
        tappableImages = list;
        return this;
    }

    public PhotoCard setTitle(TemplatedString templatedstring)
    {
        title = templatedstring;
        return this;
    }
}
