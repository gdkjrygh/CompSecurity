// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.product;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel.metadata.product:
//            IgOfferSummary

public final class IgOfferSummary__JsonHelper
{

    public static IgOfferSummary a(JsonParser jsonparser)
    {
        IgOfferSummary igoffersummary = new IgOfferSummary();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igoffersummary.b = s;
            } else
            if ("min_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igoffersummary.d = s;
            } else
            if ("in_stock".equals(s))
            {
                igoffersummary.a = Boolean.valueOf(jsonparser.l());
            } else
            if ("max_price".equals(s))
            {
                String s1;
                if (jsonparser.c() == JsonToken.m)
                {
                    s1 = null;
                } else
                {
                    s1 = jsonparser.f();
                }
                igoffersummary.c = s1;
            }
            jsonparser.b();
        }
        return igoffersummary;
    }
}
