// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            PinEmbed

public final class PinEmbed__JsonHelper
{

    public static PinEmbed a(JsonParser jsonparser)
    {
        PinEmbed pinembed = new PinEmbed();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("src".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                pinembed.b = s;
            } else
            if ("width".equals(s))
            {
                pinembed.c = jsonparser.i();
            } else
            if ("type".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                pinembed.a = s;
            } else
            if ("height".equals(s))
            {
                pinembed.d = jsonparser.i();
            }
            jsonparser.b();
        }
        return pinembed;
    }
}
