// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.recipe;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel.metadata.recipe:
//            IgCookTimes, TypeTime__JsonHelper

public final class IgCookTimes__JsonHelper
{

    public static IgCookTimes a(JsonParser jsonparser)
    {
        IgCookTimes igcooktimes = new IgCookTimes();
        if (jsonparser.c() == JsonToken.b) goto _L2; else goto _L1
_L1:
        Object obj;
        jsonparser.b();
        obj = null;
_L4:
        return ((IgCookTimes) (obj));
_L2:
        do
        {
            obj = igcooktimes;
            if (jsonparser.a() == JsonToken.c)
            {
                continue;
            }
            obj = jsonparser.d();
            jsonparser.a();
            if ("total".equals(obj))
            {
                igcooktimes.a = TypeTime__JsonHelper.a(jsonparser);
            } else
            if ("cook".equals(obj))
            {
                igcooktimes.c = TypeTime__JsonHelper.a(jsonparser);
            } else
            if ("prep".equals(obj))
            {
                igcooktimes.b = TypeTime__JsonHelper.a(jsonparser);
            }
            jsonparser.b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
