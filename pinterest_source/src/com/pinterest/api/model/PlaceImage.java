// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonObject;
import java.util.Date;

// Referenced classes of package com.pinterest.api.model:
//            Model, ModelHelper

public class PlaceImage extends Model
{

    private int _originalHeight;
    private String _originalUrl;
    private int _originalWidth;
    private int _thumbHeight;
    private String _thumbUrl;
    private int _thumbWidth;

    public PlaceImage(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject != null)
        {
            _originalUrl = pinterestjsonobject.a("url", "");
            _originalWidth = pinterestjsonobject.a("width", 0);
            _originalHeight = pinterestjsonobject.a("height", 0);
            PinterestJsonObject pinterestjsonobject1 = pinterestjsonobject.c("thumbnails");
            if (pinterestjsonobject1 != null)
            {
                pinterestjsonobject = pinterestjsonobject1.c("100x100");
                pinterestjsonobject1 = pinterestjsonobject1.c("300x300");
                if (pinterestjsonobject == null)
                {
                    pinterestjsonobject = pinterestjsonobject1;
                }
                _thumbUrl = pinterestjsonobject.a("url", "");
                _thumbWidth = pinterestjsonobject.a("width", 0);
                _thumbHeight = pinterestjsonobject.a("height", 0);
            }
        }
    }

    public Date getCacheExpirationDate()
    {
        return null;
    }

    public String getOriginalUrl()
    {
        return _originalUrl;
    }

    public String getThumbUrl()
    {
        return _thumbUrl;
    }

    public String getUid()
    {
        return _originalUrl;
    }

    public boolean isThumbValid()
    {
        return ModelHelper.isValid(_thumbUrl) && _thumbWidth > 0 && _thumbHeight > 0;
    }

    public void setCacheExpirationDate(Date date)
    {
    }
}
