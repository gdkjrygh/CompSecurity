// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            PinImages, PinImageDetail__JsonHelper

public final class PinImages__JsonHelper
{

    public static PinImages a(JsonParser jsonparser)
    {
        PinImages pinimages = new PinImages();
        if (jsonparser.c() == JsonToken.b) goto _L2; else goto _L1
_L1:
        Object obj;
        jsonparser.b();
        obj = null;
_L4:
        return ((PinImages) (obj));
_L2:
        do
        {
            obj = pinimages;
            if (jsonparser.a() == JsonToken.c)
            {
                continue;
            }
            obj = jsonparser.d();
            jsonparser.a();
            if ("136x136".equals(obj))
            {
                pinimages.b = PinImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("200x".equals(obj))
            {
                pinimages.c = PinImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("236x".equals(obj))
            {
                pinimages.d = PinImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("550x".equals(obj))
            {
                pinimages.f = PinImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("474x".equals(obj))
            {
                pinimages.e = PinImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("90x90".equals(obj))
            {
                pinimages.a = PinImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("orig".equals(obj))
            {
                pinimages.h = PinImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("736x".equals(obj))
            {
                pinimages.g = PinImageDetail__JsonHelper.a(jsonparser);
            }
            jsonparser.b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
