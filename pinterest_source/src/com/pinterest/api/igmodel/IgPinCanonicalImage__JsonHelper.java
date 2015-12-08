// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgPinCanonicalImage, PinImageDetail__JsonHelper

public final class IgPinCanonicalImage__JsonHelper
{

    public static IgPinCanonicalImage a(JsonParser jsonparser)
    {
        IgPinCanonicalImage igpincanonicalimage = new IgPinCanonicalImage();
        if (jsonparser.c() == JsonToken.b) goto _L2; else goto _L1
_L1:
        Object obj;
        jsonparser.b();
        obj = null;
_L4:
        return ((IgPinCanonicalImage) (obj));
_L2:
        do
        {
            obj = igpincanonicalimage;
            if (jsonparser.a() == JsonToken.c)
            {
                continue;
            }
            obj = jsonparser.d();
            jsonparser.a();
            if ("550x".equals(obj))
            {
                igpincanonicalimage.b = PinImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("736x".equals(obj))
            {
                igpincanonicalimage.a = PinImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("236x".equals(obj))
            {
                igpincanonicalimage.c = PinImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("200x".equals(obj))
            {
                igpincanonicalimage.d = PinImageDetail__JsonHelper.a(jsonparser);
            }
            jsonparser.b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
