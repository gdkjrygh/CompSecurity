// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel.metadata:
//            IgAggregateRating

public final class IgAggregateRating__JsonHelper
{

    public static IgAggregateRating a(JsonParser jsonparser)
    {
        IgAggregateRating igaggregaterating = new IgAggregateRating();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("best_rating".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igaggregaterating.a = s;
            } else
            if ("review_count".equals(s))
            {
                igaggregaterating.g = jsonparser.i();
            } else
            if ("rating_value".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igaggregaterating.f = s;
            } else
            if ("name".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igaggregaterating.d = s;
            } else
            if ("id".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igaggregaterating.c = s;
            } else
            if ("rating_count".equals(s))
            {
                igaggregaterating.e = jsonparser.i();
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
                igaggregaterating.h = s;
            } else
            if ("worst_rating".equals(s))
            {
                String s1;
                if (jsonparser.c() == JsonToken.m)
                {
                    s1 = null;
                } else
                {
                    s1 = jsonparser.f();
                }
                igaggregaterating.b = s1;
            }
            jsonparser.b();
        }
        return igaggregaterating;
    }
}
