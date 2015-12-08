// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            InterestImages, InterestImageDetail__JsonHelper

public final class InterestImages__JsonHelper
{

    public static InterestImages a(JsonParser jsonparser)
    {
        InterestImages interestimages = new InterestImages();
        if (jsonparser.c() == JsonToken.b) goto _L2; else goto _L1
_L1:
        Object obj;
        jsonparser.b();
        obj = null;
_L4:
        return ((InterestImages) (obj));
_L2:
        do
        {
            obj = interestimages;
            if (jsonparser.a() == JsonToken.c)
            {
                continue;
            }
            obj = jsonparser.d();
            jsonparser.a();
            if ("300x300(ir.24)".equals(obj))
            {
                interestimages.e = InterestImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("600x".equals(obj))
            {
                interestimages.c = InterestImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("150x150(ir.48)".equals(obj))
            {
                interestimages.f = InterestImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("150x150(ir.12)".equals(obj))
            {
                interestimages.h = InterestImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("474x".equals(obj))
            {
                interestimages.b = InterestImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("150x150(ir.24)".equals(obj))
            {
                interestimages.g = InterestImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("75x75".equals(obj))
            {
                interestimages.a = InterestImageDetail__JsonHelper.a(jsonparser);
            } else
            if ("300x300(ir.48)".equals(obj))
            {
                interestimages.d = InterestImageDetail__JsonHelper.a(jsonparser);
            }
            jsonparser.b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
