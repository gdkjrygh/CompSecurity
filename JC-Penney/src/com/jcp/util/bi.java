// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import com.jcp.h.d;
import com.jcp.productlistentity.ProductListFilterEntity;
import com.jcp.productlistentity.ProductListValueEntity;
import java.util.Iterator;
import java.util.List;

public final class bi
{

    public static int a(Context context)
    {
        return (int)context.getResources().getDimension(0x7f0800ed);
    }

    public static d a(ProductListFilterEntity productlistfilterentity)
    {
        return a(productlistfilterentity, ((d) (null)));
    }

    private static d a(ProductListFilterEntity productlistfilterentity, d d1)
    {
        String s;
        Object obj;
label0:
        {
            s = productlistfilterentity.getName();
            obj = new StringBuilder("");
            productlistfilterentity = productlistfilterentity.getValues();
            if (productlistfilterentity != null && !productlistfilterentity.isEmpty())
            {
                productlistfilterentity = productlistfilterentity.iterator();
                do
                {
                    if (!productlistfilterentity.hasNext())
                    {
                        break;
                    }
                    ProductListValueEntity productlistvalueentity = (ProductListValueEntity)productlistfilterentity.next();
                    if (productlistvalueentity.getSelected().booleanValue())
                    {
                        if (((StringBuilder) (obj)).length() > 0)
                        {
                            ((StringBuilder) (obj)).append(",");
                        }
                        ((StringBuilder) (obj)).append(productlistvalueentity.getName());
                    }
                } while (true);
            }
            obj = ((StringBuilder) (obj)).toString();
            productlistfilterentity = d1;
            if (!TextUtils.isEmpty(s))
            {
                productlistfilterentity = d1;
                if (!TextUtils.isEmpty(((CharSequence) (obj))))
                {
                    if (d1 != null)
                    {
                        break label0;
                    }
                    productlistfilterentity = new d(s, ((String) (obj)));
                }
            }
            return productlistfilterentity;
        }
        a(d1, s, ((String) (obj)));
        return d1;
    }

    public static d a(List list)
    {
        Object obj1 = null;
        Object obj = obj1;
        if (list != null)
        {
            obj = obj1;
            if (!list.isEmpty())
            {
                obj = list.iterator();
                for (list = null; ((Iterator) (obj)).hasNext(); list = a((ProductListFilterEntity)((Iterator) (obj)).next(), ((d) (list)))) { }
                obj = list;
            }
        }
        return ((d) (obj));
    }

    public static String a(String s)
    {
        String s1 = "";
        if ("featured".equalsIgnoreCase(s))
        {
            s1 = "Featured";
        } else
        {
            if (s.equalsIgnoreCase("pricelowtohigh"))
            {
                return "Price Low to High";
            }
            if (s.equalsIgnoreCase("pricehightolow"))
            {
                return "Price High to Low";
            }
            if ("ratingshightolow".equalsIgnoreCase(s))
            {
                return "Ratings High to Low";
            }
            if ("newarrivals".equalsIgnoreCase(s))
            {
                return "New Arrivals";
            }
            if ("bestsellers".equalsIgnoreCase(s))
            {
                return "Best Sellers";
            }
            if ("best match".equalsIgnoreCase(s))
            {
                return "Best Match";
            }
        }
        return s1;
    }

    private static String a(String s, String s1)
    {
        if (TextUtils.isEmpty(s))
        {
            return s1;
        } else
        {
            return (new StringBuilder()).append(s).append('|').append(s1).toString();
        }
    }

    private static void a(d d1, String s, String s1)
    {
        d1.a(a(d1.a(), s));
        d1.b(a(d1.b(), s1));
    }

    public static int b(Context context)
    {
        return (int)context.getResources().getDimension(0x7f0800ee);
    }

    public static int c(Context context)
    {
        return (int)context.getResources().getDimension(0x7f0800ef);
    }

    public static int d(Context context)
    {
        return (int)context.getResources().getDimension(0x7f0800f0);
    }
}
