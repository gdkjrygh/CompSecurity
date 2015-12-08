// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.h;

import android.text.TextUtils;
import com.digitalanalytics.api.DigitalAnalytics;
import com.jcp.model.CartItemsDetails;
import com.jcp.util.ae;

// Referenced classes of package com.jcp.h:
//            j, e

public final class k
{

    private static final String a = com/jcp/h/k.getName();

    private k()
    {
    }

    public static void a(j j1, String s, String s1)
    {
        a(j1, a(s, s1, j1));
        e.a((new StringBuilder()).append("Shop5:").append(j1.b()).toString(), (new StringBuilder()).append("Shop5Price:").append(j1.h()).toString(), (new StringBuilder()).append("Shop5Category").append(j1.i()).toString());
    }

    private static void a(j j1, String as[])
    {
        String s = j1.b();
        String s1 = j1.f();
        String s2 = j1.g();
        String s3 = j1.h();
        String s4 = j1.i();
        String s5 = j1.a();
        ae.d(a, "Fire fireShopActionFiveTag :");
        ae.d(a, (new StringBuilder()).append("Product Id = ").append(s).toString());
        ae.d(a, (new StringBuilder()).append("Product Name = ").append(s1).toString());
        ae.d(a, (new StringBuilder()).append("Product Category = ").append(s4).toString());
        ae.d(a, (new StringBuilder()).append("Currency Code = ").append(s5).toString());
        ae.d(a, (new StringBuilder()).append("Product Unit Price = ").append(s3).toString());
        ae.d(a, (new StringBuilder()).append("Product Quantity = ").append(s2).toString());
        ae.d(a, (new StringBuilder()).append("brand = ").append(j1.k()).toString());
        if (as != null && as.length > 0)
        {
            for (int i = 0; i < as.length; i++)
            {
                ae.d(a, (new StringBuilder()).append("attr[").append(i).append("] = ").append(as[i]).toString());
            }

        }
        boolean flag = DigitalAnalytics.fireShopAction5(s, s1, s2, s3, s4, s5, as).booleanValue();
        ae.d(a, (new StringBuilder()).append("fireShopAction5 flag = ").append(flag).toString());
    }

    public static void a(CartItemsDetails cartitemsdetails, String s)
    {
        a(j.a(cartitemsdetails), s, "");
    }

    private static String[] a(String s, String s1, j j1)
    {
        String as[] = new String[25];
        for (int i = 0; i < as.length; i++)
        {
            as[i] = "";
        }

        if (!TextUtils.isEmpty(s))
        {
            as[5] = s;
        }
        if (!TextUtils.isEmpty(s1))
        {
            as[14] = s1;
        }
        as[11] = j1.d();
        as[12] = j1.c();
        as[13] = j1.e();
        as[15] = j1.j();
        as[23] = j1.k();
        as[24] = j1.b();
        return as;
    }

}
