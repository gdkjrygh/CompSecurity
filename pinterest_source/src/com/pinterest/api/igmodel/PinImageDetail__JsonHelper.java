// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            PinImageDetail

public final class PinImageDetail__JsonHelper
{

    public static PinImageDetail a(JsonParser jsonparser)
    {
        PinImageDetail pinimagedetail = new PinImageDetail();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("width".equals(s))
            {
                pinimagedetail.b = jsonparser.i();
            } else
            if ("url".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                pinimagedetail.a = s;
            } else
            if ("height".equals(s))
            {
                pinimagedetail.c = jsonparser.i();
            }
            jsonparser.b();
        }
        return pinimagedetail;
    }
}
