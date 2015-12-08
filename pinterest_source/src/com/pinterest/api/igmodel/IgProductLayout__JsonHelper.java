// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgProductLayout

public final class IgProductLayout__JsonHelper
{

    public static IgProductLayout a(JsonParser jsonparser)
    {
        IgProductLayout igproductlayout = new IgProductLayout();
        if (jsonparser.c() == JsonToken.b) goto _L2; else goto _L1
_L1:
        Object obj;
        jsonparser.b();
        obj = null;
_L4:
        return ((IgProductLayout) (obj));
_L2:
        do
        {
            obj = igproductlayout;
            if (jsonparser.a() == JsonToken.c)
            {
                continue;
            }
            obj = jsonparser.d();
            jsonparser.a();
            if ("layout_pattern".equals(obj))
            {
                igproductlayout.c = Boolean.valueOf(jsonparser.l());
            } else
            if ("layout_colors".equals(obj))
            {
                igproductlayout.a = Boolean.valueOf(jsonparser.l());
            } else
            if ("layout_material".equals(obj))
            {
                igproductlayout.b = Boolean.valueOf(jsonparser.l());
            } else
            if ("layout_size".equals(obj))
            {
                igproductlayout.d = Boolean.valueOf(jsonparser.l());
            }
            jsonparser.b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
