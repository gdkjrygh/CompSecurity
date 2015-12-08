// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel:
//            BoardCoverImages, BoardCoverImages60x__JsonHelper

public final class BoardCoverImages__JsonHelper
{

    public static BoardCoverImages a(JsonParser jsonparser)
    {
        BoardCoverImages boardcoverimages = new BoardCoverImages();
        if (jsonparser.c() == JsonToken.b) goto _L2; else goto _L1
_L1:
        Object obj;
        jsonparser.b();
        obj = null;
_L4:
        return ((BoardCoverImages) (obj));
_L2:
        do
        {
            obj = boardcoverimages;
            if (jsonparser.a() == JsonToken.c)
            {
                continue;
            }
            obj = jsonparser.d();
            jsonparser.a();
            if ("60x60".equals(obj))
            {
                boardcoverimages.a = BoardCoverImages60x__JsonHelper.a(jsonparser);
            }
            jsonparser.b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
