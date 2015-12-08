// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igresponse;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.instagram.common.json.JsonFactoryHolder;
import com.pinterest.api.igmodel.IgPin__JsonHelper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igresponse:
//            IgPinFeedResponse, IgResponse__JsonHelper

public final class IgPinFeedResponse__JsonHelper
{

    public static IgPinFeedResponse a(String s)
    {
        JsonParser jsonparser;
        IgPinFeedResponse igpinfeedresponse;
        jsonparser = JsonFactoryHolder.a.a(s);
        jsonparser.a();
        igpinfeedresponse = new IgPinFeedResponse();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
          goto _L1
_L3:
        s = null;
_L5:
        igpinfeedresponse.a = s;
_L7:
        jsonparser.b();
_L1:
        if (jsonparser.a() == JsonToken.c)
        {
            break MISSING_BLOCK_LABEL_139;
        }
        s = jsonparser.d();
        jsonparser.a();
        if (!"data".equals(s))
        {
            break MISSING_BLOCK_LABEL_129;
        }
        if (jsonparser.c() != JsonToken.d) goto _L3; else goto _L2
_L2:
        ArrayList arraylist = new ArrayList();
_L6:
        s = arraylist;
        if (jsonparser.a() == JsonToken.e) goto _L5; else goto _L4
_L4:
        s = IgPin__JsonHelper.a(jsonparser);
        if (s != null)
        {
            arraylist.add(s);
        }
          goto _L6
          goto _L5
        IgResponse__JsonHelper.a(igpinfeedresponse, s, jsonparser);
          goto _L7
        return igpinfeedresponse;
          goto _L5
    }
}
