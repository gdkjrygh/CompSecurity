// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            PinCinematicData, PinCinematicDataImages__JsonHelper

public final class PinCinematicData__JsonHelper
{

    public static PinCinematicData a(JsonParser jsonparser)
    {
        PinCinematicData pincinematicdata = new PinCinematicData();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("images".equals(s))
            {
                pincinematicdata.d = PinCinematicDataImages__JsonHelper.a(jsonparser);
            } else
            if ("src".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                pincinematicdata.a = s;
            } else
            if ("width".equals(s))
            {
                pincinematicdata.c = jsonparser.i();
            } else
            if ("height".equals(s))
            {
                pincinematicdata.b = jsonparser.i();
            }
            jsonparser.b();
        }
        return pincinematicdata;
    }
}
