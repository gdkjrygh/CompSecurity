// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            AggregatedStats

public final class AggregatedStats__JsonHelper
{

    public static AggregatedStats a(JsonParser jsonparser)
    {
        AggregatedStats aggregatedstats = new AggregatedStats();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("id".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                aggregatedstats.c = s;
            } else
            if ("saves".equals(s))
            {
                aggregatedstats.a = jsonparser.i();
            } else
            if ("likes".equals(s))
            {
                aggregatedstats.b = jsonparser.i();
            }
            jsonparser.b();
        }
        return aggregatedstats;
    }
}
