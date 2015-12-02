// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Set;

public final class bux
{

    public static boolean a;
    private static final byg b;
    private static Set c = new buy();

    public static String a(buz buz1)
    {
        return b.a(buz1);
    }

    public static String a(String s)
    {
        if (s.equals(brf.b.toString()))
        {
            return b.a(buz.aK);
        }
        if (s.equals(brf.a.toString()))
        {
            return b.a("INTERNAL_SERVICE_ERROR", buz.aQ);
        }
        if (s.equals(brf.c.toString()))
        {
            return b.a(buz.bu);
        } else
        {
            return b.a(s, buz.aQ);
        }
    }

    public static void b(String s)
    {
        b.a(s);
        boolean flag;
        if (bwq.d(s) && c.contains(s))
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
        b = new byg(buz, cdr.a);
    }
}
