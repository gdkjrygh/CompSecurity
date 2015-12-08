// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgVariations

public final class IgVariations__JsonHelper
{

    public static IgVariations a(JsonParser jsonparser)
    {
        IgVariations igvariations;
        igvariations = new IgVariations();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
          goto _L1
_L3:
        Object obj = null;
_L5:
        igvariations.b = ((List) (obj));
_L7:
        jsonparser.b();
_L1:
        if (jsonparser.a() == JsonToken.c)
        {
            break MISSING_BLOCK_LABEL_215;
        }
        obj = jsonparser.d();
        jsonparser.a();
        if (!"size".equals(obj))
        {
            break MISSING_BLOCK_LABEL_131;
        }
        if (jsonparser.c() != JsonToken.d) goto _L3; else goto _L2
_L2:
        ArrayList arraylist = new ArrayList();
_L6:
        obj = arraylist;
        if (jsonparser.a() == JsonToken.e) goto _L5; else goto _L4
_L4:
        if (jsonparser.c() == JsonToken.m)
        {
            obj = null;
        } else
        {
            obj = jsonparser.f();
        }
        if (obj != null)
        {
            arraylist.add(obj);
        }
          goto _L6
        if ("colors".equals(obj))
        {
            Object obj1;
            if (jsonparser.c() == JsonToken.d)
            {
                ArrayList arraylist1 = new ArrayList();
                do
                {
                    obj1 = arraylist1;
                    if (jsonparser.a() == JsonToken.e)
                    {
                        break;
                    }
                    if (jsonparser.c() == JsonToken.m)
                    {
                        obj1 = null;
                    } else
                    {
                        obj1 = jsonparser.f();
                    }
                    if (obj1 != null)
                    {
                        arraylist1.add(obj1);
                    }
                } while (true);
            } else
            {
                obj1 = null;
            }
            igvariations.a = ((List) (obj1));
        }
          goto _L7
        return igvariations;
    }
}
