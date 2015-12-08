// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igresponse;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igresponse:
//            SearchNag, Nag__JsonHelper

public final class SearchNag__JsonHelper
{

    public static SearchNag a(JsonParser jsonparser)
    {
        SearchNag searchnag = new SearchNag();
        if (jsonparser.c() == JsonToken.b) goto _L2; else goto _L1
_L1:
        Object obj;
        jsonparser.b();
        obj = null;
_L4:
        return ((SearchNag) (obj));
_L2:
        do
        {
            obj = searchnag;
            if (jsonparser.a() == JsonToken.c)
            {
                continue;
            }
            obj = jsonparser.d();
            jsonparser.a();
            if ("nag".equals(obj))
            {
                searchnag.a = Nag__JsonHelper.a(jsonparser);
            }
            jsonparser.b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
