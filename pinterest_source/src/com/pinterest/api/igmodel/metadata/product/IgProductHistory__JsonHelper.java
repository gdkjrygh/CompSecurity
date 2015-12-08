// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.product;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel.metadata.product:
//            IgProductHistory, HistoryProduct__JsonHelper

public final class IgProductHistory__JsonHelper
{

    public static IgProductHistory a(JsonParser jsonparser)
    {
        IgProductHistory igproducthistory;
        igproducthistory = new IgProductHistory();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
          goto _L1
_L5:
        Object obj = null;
_L7:
        igproducthistory.a = ((List) (obj));
_L3:
        jsonparser.b();
_L1:
        if (jsonparser.a() == JsonToken.c)
        {
            break MISSING_BLOCK_LABEL_116;
        }
        obj = jsonparser.d();
        jsonparser.a();
        if (!"products".equals(obj)) goto _L3; else goto _L2
_L2:
        if (jsonparser.c() != JsonToken.d) goto _L5; else goto _L4
_L4:
        ArrayList arraylist = new ArrayList();
_L8:
        obj = arraylist;
        if (jsonparser.a() == JsonToken.e) goto _L7; else goto _L6
_L6:
        HistoryProduct historyproduct = HistoryProduct__JsonHelper.a(jsonparser);
        if (historyproduct != null)
        {
            arraylist.add(historyproduct);
        }
          goto _L8
          goto _L7
        return igproducthistory;
    }
}
