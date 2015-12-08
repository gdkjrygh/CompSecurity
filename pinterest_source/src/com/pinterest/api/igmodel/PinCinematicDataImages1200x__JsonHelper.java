// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            PinCinematicDataImages1200x

public final class PinCinematicDataImages1200x__JsonHelper
{

    public static PinCinematicDataImages1200x a(JsonParser jsonparser)
    {
        PinCinematicDataImages1200x pincinematicdataimages1200x = new PinCinematicDataImages1200x();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("url".equals(s))
            {
                String s1;
                if (jsonparser.c() == JsonToken.m)
                {
                    s1 = null;
                } else
                {
                    s1 = jsonparser.f();
                }
                pincinematicdataimages1200x.a = s1;
            }
            jsonparser.b();
        }
        return pincinematicdataimages1200x;
    }
}
