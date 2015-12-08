// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel:
//            IgBuyableProduct, IgProductLayout__JsonHelper, IgVariations__JsonHelper, IgProductVariant__JsonHelper

public final class IgBuyableProduct__JsonHelper
{

    public static IgBuyableProduct a(JsonParser jsonparser)
    {
        IgBuyableProduct igbuyableproduct = new IgBuyableProduct();
        if (jsonparser.c() != JsonToken.b)
        {
            jsonparser.b();
            return null;
        }
        while (jsonparser.a() != JsonToken.c) 
        {
            String s = jsonparser.d();
            jsonparser.a();
            if ("is_available".equals(s))
            {
                igbuyableproduct.p = Boolean.valueOf(jsonparser.l());
            } else
            if ("link".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.x = s;
            } else
            if ("description".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.m = s;
            } else
            if ("availability".equals(s))
            {
                igbuyableproduct.g = Integer.valueOf(jsonparser.i());
            } else
            if ("title".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.f = s;
            } else
            if ("merchant_item_group_id".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.z = s;
            } else
            if ("merchant_name".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.l = s;
            } else
            if ("favicon_link".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.e = s;
            } else
            if ("id".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.a = s;
            } else
            if ("display_active_max_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.v = s;
            } else
            if ("display_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.n = s;
            } else
            if ("merchant_id".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.q = s;
            } else
            if ("layout".equals(s))
            {
                igbuyableproduct.A = IgProductLayout__JsonHelper.a(jsonparser);
            } else
            if ("price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.o = s;
            } else
            if ("currency".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.d = s;
            } else
            if ("display_min_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.t = s;
            } else
            if ("active_max_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.w = s;
            } else
            if ("display_active_min_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.b = s;
            } else
            if ("sale_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.k = s;
            } else
            if ("display_max_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.s = s;
            } else
            if ("active_min_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.u = s;
            } else
            if ("short_description".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.j = s;
            } else
            if ("canonical_merchant_domain".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.i = s;
            } else
            if ("display_sale_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.r = s;
            } else
            if ("min_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.h = s;
            } else
            if ("variations".equals(s))
            {
                igbuyableproduct.C = IgVariations__JsonHelper.a(jsonparser);
            } else
            if ("max_price".equals(s))
            {
                if (jsonparser.c() == JsonToken.m)
                {
                    s = null;
                } else
                {
                    s = jsonparser.f();
                }
                igbuyableproduct.y = s;
            } else
            if ("has_swatches".equals(s))
            {
                igbuyableproduct.c = Boolean.valueOf(jsonparser.l());
            } else
            if ("items".equals(s))
            {
                Object obj;
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
                        obj = IgProductVariant__JsonHelper.a(jsonparser);
                        if (obj != null)
                        {
                            arraylist.add(obj);
                        }
                    } while (true);
                } else
                {
                    obj = null;
                }
                igbuyableproduct.B = ((List) (obj));
            }
            jsonparser.b();
        }
        return igbuyableproduct;
    }
}
