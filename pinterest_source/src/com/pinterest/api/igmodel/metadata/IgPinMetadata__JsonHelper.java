// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.pinterest.api.igmodel.metadata.article.IgArticle__JsonHelper;
import com.pinterest.api.igmodel.metadata.movie.IgMovie__JsonHelper;
import com.pinterest.api.igmodel.metadata.product.IgProductHistory__JsonHelper;
import com.pinterest.api.igmodel.metadata.product.IgProduct__JsonHelper;
import com.pinterest.api.igmodel.metadata.recipe.IgRecipe__JsonHelper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel.metadata:
//            IgPinMetadata

public final class IgPinMetadata__JsonHelper
{

    public static IgPinMetadata a(JsonParser jsonparser)
    {
        IgPinMetadata igpinmetadata;
        igpinmetadata = new IgPinMetadata();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
          goto _L1
_L3:
        Object obj = null;
_L5:
        igpinmetadata.a = ((List) (obj));
_L7:
        jsonparser.b();
_L1:
        if (jsonparser.a() == JsonToken.c)
        {
            break MISSING_BLOCK_LABEL_245;
        }
        obj = jsonparser.d();
        jsonparser.a();
        if (!"products_history".equals(obj))
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
        obj = IgProductHistory__JsonHelper.a(jsonparser);
        if (obj != null)
        {
            arraylist.add(obj);
        }
          goto _L6
        if ("movie".equals(obj))
        {
            igpinmetadata.c = IgMovie__JsonHelper.a(jsonparser);
        } else
        if ("recipe".equals(obj))
        {
            igpinmetadata.d = IgRecipe__JsonHelper.a(jsonparser);
        } else
        if ("article".equals(obj))
        {
            igpinmetadata.e = IgArticle__JsonHelper.a(jsonparser);
        } else
        if ("products".equals(obj))
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
                    obj1 = IgProduct__JsonHelper.a(jsonparser);
                    if (obj1 != null)
                    {
                        arraylist1.add(obj1);
                    }
                } while (true);
            } else
            {
                obj1 = null;
            }
            igpinmetadata.b = ((List) (obj1));
        }
          goto _L7
        return igpinmetadata;
          goto _L5
    }
}
