// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.recipe;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel.metadata.recipe:
//            IgCategorizedIngredient, IgIngredient__JsonHelper

public final class IgCategorizedIngredient__JsonHelper
{

    public static IgCategorizedIngredient a(JsonParser jsonparser)
    {
        IgCategorizedIngredient igcategorizedingredient;
        igcategorizedingredient = new IgCategorizedIngredient();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
          goto _L1
_L3:
        Object obj = null;
_L5:
        igcategorizedingredient.d = ((List) (obj));
_L7:
        jsonparser.b();
_L1:
        if (jsonparser.a() == JsonToken.c)
        {
            break MISSING_BLOCK_LABEL_227;
        }
        obj = jsonparser.d();
        jsonparser.a();
        if (!"ingredients".equals(obj))
        {
            break MISSING_BLOCK_LABEL_116;
        }
        if (jsonparser.c() != JsonToken.d) goto _L3; else goto _L2
_L2:
        ArrayList arraylist = new ArrayList();
_L6:
        obj = arraylist;
        if (jsonparser.a() == JsonToken.e) goto _L5; else goto _L4
_L4:
        obj = IgIngredient__JsonHelper.a(jsonparser);
        if (obj != null)
        {
            arraylist.add(obj);
        }
          goto _L6
        if ("id".equals(obj))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                obj = null;
            } else
            {
                obj = jsonparser.f();
            }
            igcategorizedingredient.a = ((String) (obj));
        } else
        if ("category".equals(obj))
        {
            if (jsonparser.c() == JsonToken.m)
            {
                obj = null;
            } else
            {
                obj = jsonparser.f();
            }
            igcategorizedingredient.b = ((String) (obj));
        } else
        if ("type".equals(obj))
        {
            String s;
            if (jsonparser.c() == JsonToken.m)
            {
                s = null;
            } else
            {
                s = jsonparser.f();
            }
            igcategorizedingredient.c = s;
        }
          goto _L7
        return igcategorizedingredient;
          goto _L5
    }
}
