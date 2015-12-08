// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.text.Spanned;
import com.pinterest.network.json.PinterestJsonObject;

// Referenced classes of package com.pinterest.api.model:
//            ModelHelper, Pin

public abstract class PinMetadata
{

    private String _imageLargeUrl;
    private String _imageSmallUrl;
    private String _locale;
    private String _location;
    private Pin _pin;
    private String _reference;
    private String _title;
    private String _url;
    private String _websiteName;

    public PinMetadata(Pin pin, PinterestJsonObject pinterestjsonobject)
    {
        if (pin == null || pinterestjsonobject == null)
        {
            return;
        } else
        {
            setPin(pin);
            setTitle(pinterestjsonobject.a("title", "").replace("\\n", ""));
            setUrl(pinterestjsonobject.a("url", ""));
            setWebsiteName(pinterestjsonobject.a("site_name", ""));
            setImageSmallUrl(pinterestjsonobject.a("favicon_link", ""));
            setImageLargeUrl(pinterestjsonobject.a("apple_touch_icon_link", ""));
            setLocale(pinterestjsonobject.a("locale", ""));
            return;
        }
    }

    public abstract String getDescription();

    public String getImageLargeUrl()
    {
        return _imageLargeUrl;
    }

    public String getImageSmallUrl()
    {
        return _imageSmallUrl;
    }

    public String getImageUrl()
    {
        if (ModelHelper.isValid(getImageLargeUrl()))
        {
            return getImageLargeUrl();
        }
        if (ModelHelper.isValid(getImageSmallUrl()))
        {
            return getImageSmallUrl();
        } else
        {
            return null;
        }
    }

    public String getLocale()
    {
        return _locale;
    }

    public String getLocation()
    {
        return _location;
    }

    public abstract Spanned getMetadataDisplay();

    public Pin getPin()
    {
        return _pin;
    }

    public String getReference()
    {
        return _reference;
    }

    public String getTitle()
    {
        return _title;
    }

    public String getUrl()
    {
        return _url;
    }

    public String getWebsiteName()
    {
        return _websiteName;
    }

    public void setImageLargeUrl(String s)
    {
        _imageLargeUrl = s;
    }

    public void setImageSmallUrl(String s)
    {
        _imageSmallUrl = s;
    }

    public void setLocale(String s)
    {
        _locale = s;
    }

    public void setLocation(String s)
    {
        _location = s;
    }

    public void setPin(Pin pin)
    {
        _pin = pin;
    }

    public void setReference(String s)
    {
        _reference = s;
    }

    public void setTitle(String s)
    {
        _title = s;
    }

    public void setUrl(String s)
    {
        _url = s;
    }

    public void setWebsiteName(String s)
    {
        _websiteName = s;
    }
}
