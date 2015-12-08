// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.base.Device;
import com.pinterest.network.json.PinterestJsonObject;
import org.apache.commons.lang3.StringUtils;

// Referenced classes of package com.pinterest.api.model:
//            Pin

public class Object
{

    private String _imageSignature;
    private Integer _largeHeight;
    private String _largeUrl;
    private Integer _largeWidth;
    private Integer _mediumHeight;
    private String _mediumUrl;
    private Integer _mediumWidth;
    private Pin _pin;

    public static Object make(PinterestJsonObject pinterestjsonobject)
    {
        Object obj = new <init>();
        obj.setImageSignature(pinterestjsonobject.a("image_signature", null));
        PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("canonical_images");
        if (Device.shouldLoadBigImages())
        {
            pinterestjsonobject = "736x";
        } else
        {
            pinterestjsonobject = "550x";
        }
        pinterestjsonobject = pinterestjsonobject1.c(pinterestjsonobject);
        obj.setLargeImage(pinterestjsonobject.a("url", ""), Integer.valueOf(pinterestjsonobject.a("width", 0)), Integer.valueOf(pinterestjsonobject.a("height", 0)));
        if (Device.shouldLoadBigImages())
        {
            pinterestjsonobject = "236x";
        } else
        {
            pinterestjsonobject = "200x";
        }
        pinterestjsonobject = pinterestjsonobject1.c(pinterestjsonobject);
        obj.setMediumImage(pinterestjsonobject.a("url", ""), Integer.valueOf(pinterestjsonobject.a("width", 0)), Integer.valueOf(pinterestjsonobject.a("height", 0)));
        return obj;
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (Object.a)obj;
            return StringUtils.equals(_imageSignature, ((_imageSignature) (obj))._imageSignature);
        }
    }

    public String getEmbedUrl()
    {
        return getPin().getEmbedUrl();
    }

    public String getImageSignature()
    {
        return _imageSignature;
    }

    public Integer getLargeHeight()
    {
        return _largeHeight;
    }

    public String getLargeUrl()
    {
        return _largeUrl;
    }

    public Integer getLargeWidth()
    {
        return _largeWidth;
    }

    public Integer getMediumHeight()
    {
        return _mediumHeight;
    }

    public String getMediumUrl()
    {
        return _mediumUrl;
    }

    public Integer getMediumWidth()
    {
        return _mediumWidth;
    }

    public Pin getPin()
    {
        if (_pin == null)
        {
            throw new IllegalStateException("Pin needs to be set on a GalleryItem before it is used in the Gallery");
        } else
        {
            return _pin;
        }
    }

    public int hashCode()
    {
        return _imageSignature.hashCode();
    }

    public boolean isGif()
    {
        return getPin().isGif();
    }

    public boolean isVideo()
    {
        return getPin().getVideo() == Boolean.TRUE;
    }

    public void setImageSignature(String s)
    {
        _imageSignature = s;
    }

    public void setLargeImage(String s, Integer integer, Integer integer1)
    {
        _largeUrl = s;
        _largeWidth = integer;
        _largeHeight = integer1;
    }

    public void setMediumImage(String s, Integer integer, Integer integer1)
    {
        _mediumUrl = s;
        _mediumWidth = integer;
        _mediumHeight = integer1;
    }

    public void setPin(Pin pin)
    {
        _pin = pin;
    }

    public Object()
    {
    }
}
