// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgDomain, IgUser__JsonHelper

public final class IgDomain__JsonHelper
{

    public static IgDomain a(JsonParser jsonparser)
    {
        IgDomain igdomain = new IgDomain();
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
                igdomain.a = s;
            } else
            if ("official_user".equals(s))
            {
                igdomain.c = IgUser__JsonHelper.a(jsonparser);
            } else
            if ("name".equals(s))
            {
                String s1;
                if (jsonparser.c() == JsonToken.m)
                {
                    s1 = null;
                } else
                {
                    s1 = jsonparser.f();
                }
                igdomain.b = s1;
            }
            jsonparser.b();
        }
        return igdomain;
    }
}
