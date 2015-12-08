// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgPinGalleryItem, IgPinCanonicalImage__JsonHelper

public final class IgPinGalleryItem__JsonHelper
{

    public static IgPinGalleryItem a(JsonParser jsonparser)
    {
        IgPinGalleryItem igpingalleryitem = new IgPinGalleryItem();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("image_signature".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igpingalleryitem.a = s;
            } else
            if ("canonical_images".equals(s))
            {
                igpingalleryitem.b = IgPinCanonicalImage__JsonHelper.a(jsonparser);
            }
            jsonparser.b();
        }
        return igpingalleryitem;
    }
}
