// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.recipe;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;

// Referenced classes of package com.pinterest.api.igmodel.metadata.recipe:
//            TypeTime

public final class TypeTime__JsonHelper
{

    public static TypeTime a(JsonParser jsonparser)
    {
        TypeTime typetime = new TypeTime();
        if (jsonparser.c() == JsonToken.b) goto _L2; else goto _L1
_L1:
        Object obj;
        jsonparser.b();
        obj = null;
_L4:
        return ((TypeTime) (obj));
_L2:
        do
        {
            obj = typetime;
            if (jsonparser.a() == JsonToken.c)
            {
                continue;
            }
            obj = jsonparser.d();
            jsonparser.a();
            if ("h".equals(obj))
            {
                typetime.a = jsonparser.i();
            } else
            if ("m".equals(obj))
            {
                typetime.b = jsonparser.i();
            }
            jsonparser.b();
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }
}
