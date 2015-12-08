// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            PinRecommendationReason, IgPin__JsonHelper, IgInterest__JsonHelper, IgBoard__JsonHelper

public final class PinRecommendationReason__JsonHelper
{

    public static PinRecommendationReason a(JsonParser jsonparser)
    {
        PinRecommendationReason pinrecommendationreason = new PinRecommendationReason();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("reason".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                pinrecommendationreason.a = s;
            } else
            if ("pin".equals(s))
            {
                pinrecommendationreason.c = IgPin__JsonHelper.a(jsonparser);
            } else
            if ("interest".equals(s))
            {
                pinrecommendationreason.d = IgInterest__JsonHelper.a(jsonparser);
            } else
            if ("board".equals(s))
            {
                pinrecommendationreason.b = IgBoard__JsonHelper.a(jsonparser);
            }
            jsonparser.b();
        }
        return pinrecommendationreason;
    }
}
