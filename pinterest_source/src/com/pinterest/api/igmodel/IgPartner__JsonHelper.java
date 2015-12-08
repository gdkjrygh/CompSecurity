// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgPartner

public final class IgPartner__JsonHelper
{

    public static IgPartner a(JsonParser jsonparser)
    {
        IgPartner igpartner = new IgPartner();
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
                igpartner.a = s;
            } else
            if ("auto_follow_allowed".equals(s))
            {
                igpartner.c = Boolean.valueOf(jsonparser.l());
            } else
            if ("contact_name".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igpartner.e = s;
            } else
            if ("account_type".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igpartner.b = s;
            } else
            if ("business_name".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igpartner.d = s;
            } else
            if ("type".equals(s))
            {
                String s1;
                if (jsonparser.c() == JsonToken.m)
                {
                    s1 = null;
                } else
                {
                    s1 = jsonparser.f();
                }
                igpartner.f = s1;
            }
            jsonparser.b();
        }
        return igpartner;
    }
}
