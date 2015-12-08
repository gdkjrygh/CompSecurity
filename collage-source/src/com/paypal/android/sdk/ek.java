// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Set;

// Referenced classes of package com.paypal.android.sdk:
//            hs, em, ih, el, 
//            aq, gd

public final class ek
{

    public static boolean a;
    private static final hs b;
    private static Set c = new el();

    public static String a(em em1)
    {
        return b.a(em1);
    }

    public static String a(String s)
    {
        if (s.equals(aq.b.toString()))
        {
            return b.a(em.aK);
        }
        if (s.equals(aq.a.toString()))
        {
            return b.a("INTERNAL_SERVICE_ERROR", em.aQ);
        }
        if (s.equals(aq.c.toString()))
        {
            return b.a(em.bu);
        } else
        {
            return b.a(s, em.aQ);
        }
    }

    public static void b(String s)
    {
        b.a(s);
        boolean flag;
        if (gd.d(s) && c.contains(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    public static String c(String s)
    {
        String s2 = b.a();
        String s1 = s2;
        if (!s2.contains("_"))
        {
            s1 = (new StringBuilder()).append(s2).append("_").append(s).toString();
        }
        return s1;
    }

    static 
    {
        b = new hs(com/paypal/android/sdk/em, ih.a);
    }
}
