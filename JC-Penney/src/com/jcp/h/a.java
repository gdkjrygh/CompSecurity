// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.h;

import android.text.TextUtils;
import com.digitalanalytics.api.DigitalAnalytics;
import com.jcp.JCP;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.ae;
import com.jcp.util.af;

// Referenced classes of package com.jcp.h:
//            b, e

public final class a
{

    private static final String a = com/jcp/h/a.getName();
    private static boolean b = false;

    private a()
    {
    }

    private static void A()
    {
        a("Checkout Bag", "2", "jcp rewards account link");
    }

    private static void B()
    {
        a("shopping bag existing customer", "2", "jcp rewards account link");
    }

    private static String a(boolean flag)
    {
        if (flag)
        {
            return "1";
        } else
        {
            return "2";
        }
    }

    public static void a()
    {
        a("app partial account creation", "1", "customer registration");
    }

    private static void a(ProductEntityContainer productentitycontainer, boolean flag)
    {
        if (productentitycontainer != null)
        {
            boolean flag1 = JCP.s().c();
            boolean flag2 = "ENSEMBLE".equalsIgnoreCase(productentitycontainer.getType());
            String s2 = productentitycontainer.getName();
            String s1;
            String as[];
            if (flag1)
            {
                if (flag2)
                {
                    s1 = "Logged in customer ENS";
                } else
                {
                    s1 = "Logged in Customer PDP";
                }
            } else
            if (flag2)
            {
                s1 = "Guest customer Ensemble";
            } else
            {
                s1 = "Guest Customer PDP";
            }
            as = a(3, 0, s2);
            as[2] = (new StringBuilder()).append("SAVED ITEMS(").append(productentitycontainer.getItemId()).append(")").toString();
            a(s1, a(flag), "Add to Saved Items", as);
        }
    }

    public static void a(String s1)
    {
        if (b)
        {
            B();
            b(s1);
        } else
        {
            A();
        }
        b = false;
    }

    public static void a(String s1, String s2)
    {
        a("Manually entered coupon(s)", s2, s1, a(6, 5, "Checkout Page/Shopping Bag"));
    }

    private static void a(String s1, String s2, String s3)
    {
        ae.d(a, "Fire Conversion Event:");
        ae.d(a, (new StringBuilder()).append("id = ").append(s1).toString());
        ae.d(a, (new StringBuilder()).append("action = ").append(s2).toString());
        ae.d(a, (new StringBuilder()).append("category = ").append(s3).toString());
        com.jcp.h.b.a();
        DigitalAnalytics.fireConversionEvent(s1, s2, s3, null, null);
        com.jcp.h.e.a(s1, s2, s3);
    }

    private static void a(String s1, String s2, String s3, String s4, String s5, String as[])
    {
        ae.d(a, "Fire Registration Event:");
        ae.d(a, (new StringBuilder()).append("id = ").append(s1).toString());
        ae.d(a, (new StringBuilder()).append("email = ").append(s2).toString());
        ae.d(a, (new StringBuilder()).append("city = ").append(s3).toString());
        ae.d(a, (new StringBuilder()).append("state = ").append(s4).toString());
        ae.d(a, (new StringBuilder()).append("zip = ").append(s5).toString());
        if (as != null && as.length > 0)
        {
            for (int i1 = 0; i1 < as.length; i1++)
            {
                ae.d(a, (new StringBuilder()).append("attr[").append(i1).append("] = ").append(as[i1]).toString());
            }

        }
        DigitalAnalytics.fireRegistration(s1, s2, s3, s4, s5, as);
        com.jcp.h.e.a(s1, "Registration", null);
    }

    private static void a(String s1, String s2, String s3, String as[])
    {
        ae.d(a, "Fire Conversion Event With Attribute Array:");
        ae.d(a, (new StringBuilder()).append("id = ").append(s1).toString());
        ae.d(a, (new StringBuilder()).append("action = ").append(s2).toString());
        ae.d(a, (new StringBuilder()).append("category = ").append(s3).toString());
        DigitalAnalytics.fireConversionEvent(s1, s2, s3, null, as);
        com.jcp.h.e.a(s1, s2, s3);
    }

    public static void a(boolean flag, ProductEntityContainer productentitycontainer)
    {
        a(productentitycontainer, flag);
    }

    public static void a(boolean flag, String s1)
    {
        b(flag, s1);
    }

    private static String[] a(int i1, int j1, String s1)
    {
        String as[] = new String[i1];
        for (i1 = 0; i1 < as.length; i1++)
        {
            as[i1] = "";
        }

        as[j1] = s1;
        return as;
    }

    public static void b()
    {
        a("app partial account creation", "2", "customer registration");
    }

    private static void b(String s1)
    {
        if (!TextUtils.isEmpty(s1))
        {
            String as[] = new String[5];
            for (int i1 = 0; i1 < 5; i1++)
            {
                as[i1] = "";
            }

            as[4] = "Rewards Link Account Existing Customer Shopping Bag";
            a(s1, null, null, null, null, as);
        }
    }

    private static void b(boolean flag, String s1)
    {
        String s2;
        if (JCP.s().c())
        {
            s2 = "Logged In Customer Gallery";
        } else
        {
            s2 = "Guest Customer Gallery";
        }
        s1 = a(3, 0, s1);
        s1[2] = s2;
        a(s2, a(flag), "Add to Saved Items", s1);
    }

    public static void c()
    {
        a("partial account creation", "1", "jcp rewards registration");
    }

    public static void d()
    {
        a("partial account creation", "2", "jcp rewards registration");
    }

    public static void e()
    {
        a("partial account creation decline", "2", "jcp rewards registration");
    }

    public static void f()
    {
        a("partial account creation", "1", "jcp rewards account link");
    }

    public static void g()
    {
        a("partial account creation", "2", "jcp rewards account link");
    }

    public static void h()
    {
        a("CAM", "1", "jcp rewards registration");
    }

    public static void i()
    {
        a("CAM", "2", "jcp rewards registration");
    }

    public static void j()
    {
        a("CAM", "1", "jcp rewards account link");
    }

    public static void k()
    {
        a("CAM", "2", "jcp rewards account link");
    }

    public static void l()
    {
        a("Resend Email", "1", "jcp rewards account link");
    }

    public static void m()
    {
        a("Linking", "1", "jcp rewards registration");
    }

    public static void n()
    {
        a("Linking", "2", "jcp rewards registration");
    }

    public static void o()
    {
        a("Linking", "1", "jcp rewards account link");
    }

    public static void p()
    {
        a("Linking", "2", "jcp rewards account link");
    }

    public static void q()
    {
        a("Linked Account Dashboard Apply", "1", "JCP Rewards Redemption");
    }

    public static void r()
    {
        a("Linked Account Bag Apply", "1", "JCP Rewards Redemption");
    }

    public static void s()
    {
        a("Linked Account Bag Manual", "1", "JCP Rewards Redemption");
    }

    public static void t()
    {
        a("Non-Linked Account Bag Manual", "1", "JCP Rewards Redemption");
    }

    public static void u()
    {
        b = false;
        a("Checkout Bag", "1", "jcp rewards account link");
    }

    public static void v()
    {
        b = true;
        a("shopping bag existing customer", "1", "jcp rewards account link");
    }

    public static void w()
    {
        a("Guest Checkout", "1", "Checkout");
        a("Guest Checkout", "2", "Checkout");
    }

    public static void x()
    {
        a("Authenticated Customers Checkout", "1", "Checkout");
        a("Authenticated Customers Checkout", "2", "Checkout");
    }

    public static void y()
    {
        a("Find Coupons", "1", "Coupon Finder");
    }

    public static void z()
    {
        a("Find Coupons", "2", "Coupon Finder");
    }

}
