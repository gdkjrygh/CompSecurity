// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgProductVariant, IgPinGalleryItem__JsonHelper, IgProductVariantVariant__JsonHelper

public final class IgProductVariant__JsonHelper
{

    public static IgProductVariant a(JsonParser jsonparser)
    {
        IgProductVariant igproductvariant = new IgProductVariant();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            Object obj = jsonparser.d();
            jsonparser.a();
            if ("active_price".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igproductvariant.a = ((String) (obj));
            } else
            if ("max_quantity".equals(obj))
            {
                igproductvariant.c = Integer.valueOf(jsonparser.i());
            } else
            if ("sale_price".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igproductvariant.g = ((String) (obj));
            } else
            if ("display_active_price".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igproductvariant.h = ((String) (obj));
            } else
            if ("images".equals(obj))
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
                        obj = IgPinGalleryItem__JsonHelper.a(jsonparser);
                        if (obj != null)
                        {
                            arraylist.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igproductvariant.k = ((List) (obj));
            } else
            if ("variant".equals(obj))
            {
                igproductvariant.m = IgProductVariantVariant__JsonHelper.a(jsonparser);
            } else
            if ("availability".equals(obj))
            {
                igproductvariant.j = Integer.valueOf(jsonparser.i());
            } else
            if ("item_id".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igproductvariant.f = ((String) (obj));
            } else
            if ("swatch_image".equals(obj))
            {
                igproductvariant.l = IgPinGalleryItem__JsonHelper.a(jsonparser);
            } else
            if ("display_price".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igproductvariant.b = ((String) (obj));
            } else
            if ("price".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igproductvariant.d = ((String) (obj));
            } else
            if ("display_sale_price".equals(obj))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    obj = null;
                } else
                {
                    obj = jsonparser.f();
                }
                igproductvariant.i = ((String) (obj));
            } else
            if ("currency".equals(obj))
            {
                String s;
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igproductvariant.e = s;
            }
            jsonparser.b();
        }
        return igproductvariant;
    }
}
