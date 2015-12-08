// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.recipe;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.pinterest.api.igmodel.metadata.IgAggregateRating__JsonHelper;
import com.pinterest.api.igmodel.metadata.IgMetadata__JsonHelper;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel.metadata.recipe:
//            IgRecipe, IgCookTimes__JsonHelper, IgCategorizedIngredient__JsonHelper, IgServingSummary__JsonHelper

public final class IgRecipe__JsonHelper
{

    public static IgRecipe a(JsonParser jsonparser)
    {
        IgRecipe igrecipe = new IgRecipe();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            Object obj = jsonparser.d();
            jsonparser.a();
            if ("cook_times".equals(obj))
            {
                igrecipe.k = IgCookTimes__JsonHelper.a(jsonparser);
            } else
            if ("categorized_ingredients".equals(obj))
            {
                if (jsonparser.c() == JsonToken.d)
                {
                    ArrayList arraylist = new ArrayList();
                    do
                    {
                        obj = arraylist;
                        if (jsonparser.a() == JsonToken.e)
                        {
                            break;
                        }
                        obj = IgCategorizedIngredient__JsonHelper.a(jsonparser);
                        if (obj != null)
                        {
                            arraylist.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igrecipe.l = ((List) (obj));
            } else
            if ("servings_summary".equals(obj))
            {
                igrecipe.j = IgServingSummary__JsonHelper.a(jsonparser);
            } else
            if ("name".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igrecipe.o = ((String) (obj));
            } else
            if ("description".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igrecipe.i = ((String) (obj));
            } else
            if ("id".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igrecipe.n = ((String) (obj));
            } else
            if ("aggregate_rating".equals(obj))
            {
                igrecipe.h = IgAggregateRating__JsonHelper.a(jsonparser);
            } else
            if ("type".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igrecipe.p = ((String) (obj));
            } else
            if ("diets".equals(obj))
            {
                if (jsonparser.c() == JsonToken.d)
                {
                    ArrayList arraylist1 = new ArrayList();
                    do
                    {
                        obj = arraylist1;
                        if (jsonparser.a() == JsonToken.e)
                        {
                            break;
                        }
                        if (jsonparser.c() == JsonToken.m)
                        {
                            obj = null;
                        } else
                        {
                            obj = jsonparser.f();
                        }
                        if (obj != null)
                        {
                            arraylist1.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igrecipe.m = ((List) (obj));
            } else
            {
                IgMetadata__JsonHelper.a(igrecipe, ((String) (obj)), jsonparser);
            }
            jsonparser.b();
        }
        return igrecipe;
    }
}
