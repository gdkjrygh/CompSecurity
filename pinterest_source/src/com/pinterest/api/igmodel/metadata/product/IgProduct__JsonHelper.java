// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.product;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.pinterest.api.igmodel.metadata.IgMetadata__JsonHelper;

// Referenced classes of package com.pinterest.api.igmodel.metadata.product:
//            IgProduct, IgOfferSummary__JsonHelper

public final class IgProduct__JsonHelper
{

    public static IgProduct a(JsonParser jsonparser)
    {
        IgProduct igproduct = new IgProduct();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("offer_summary".equals(s))
            {
                igproduct.n = IgOfferSummary__JsonHelper.a(jsonparser);
            } else
            if ("product_id".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igproduct.l = s;
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
                igproduct.k = s;
            } else
            if ("description".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igproduct.i = s;
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
                igproduct.j = s;
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
                igproduct.m = s;
            } else
            if ("brand".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igproduct.h = s;
            } else
            {
                IgMetadata__JsonHelper.a(igproduct, s, jsonparser);
            }
            jsonparser.b();
        }
        return igproduct;
    }
}
