// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import java.util.Set;

// Referenced classes of package com.paypal.android.sdk:
//            i, cs, x, cr, 
//            aA, R

public final class cq
{

    public static boolean a;
    private static final i b;
    private static Set c = new cr();

    public static String a(cs cs1)
    {
        return b.a(cs1);
    }

    public static String a(String s)
    {
        if (s.equals(aA.b.toString()))
        {
            return b.a(cs.aJ);
        }
        if (s.equals(aA.a.toString()))
        {
            return b.a("INTERNAL_SERVICE_ERROR", cs.aP);
        }
        if (s.equals(aA.c.toString()))
        {
            return b.a(cs.bt);
        } else
        {
            return b.a(s, cs.aP);
        }
    }

    public static void b(String s)
    {
        b.a(s);
        boolean flag;
        if (R.c(s) && c.contains(s))
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
        b = new i(com/paypal/android/sdk/cs, x.a);
    }
}
