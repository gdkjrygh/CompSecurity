// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.product;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel.metadata.product:
//            HistoryProduct, IgOfferSummary__JsonHelper

public final class HistoryProduct__JsonHelper
{

    public static HistoryProduct a(JsonParser jsonparser)
    {
        HistoryProduct historyproduct = new HistoryProduct();
        if (jsonparser.c() == JsonToken.b) goto _L2; else goto _L1
_L1:
        Object obj;
        jsonparser.b();
        obj = null;
_L4:
        return ((HistoryProduct) (obj));
_L2:
        do
        {
            obj = historyproduct;
            if (jsonparser.a() == JsonToken.c)
            {
                continue;
            }
            obj = jsonparser.d();
            jsonparser.a();
            if ("offer_summary".equals(obj))
            {
                historyproduct.a = IgOfferSummary__JsonHelper.a(jsonparser);
            }
            jsonparser.b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
