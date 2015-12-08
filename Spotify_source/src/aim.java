// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public final class aim
{

    private static aif a = new aif();

    public static void a()
    {
        a.c();
    }

    public static void a(Context context)
    {
        aif aif1 = a;
        if (aif1.C != null || context == null)
        {
            return;
        } else
        {
            aif1.C = context;
            aif1.e = new aki(aif1);
            aif1.e.a(new aik(aif1), true);
            return;
        }
    }

    public static void a(String s)
    {
        aif aif1;
        for (aif1 = a; !aif1.N || s.length() == 0 || aif1.e == null;)
        {
            return;
        }

        aif1.e.a(new ain(aif1, s), true);
    }

    public static void b()
    {
        a.d();
    }

    public static void b(String s)
    {
        aif aif1 = a;
        if (!aif1.N || s.length() == 0 || aif1.e == null)
        {
            return;
        } else
        {
            aif1.e.a(new ail(aif1, s), true);
            return;
        }
    }

    public static void c()
    {
        aif aif1 = a;
        if (aif1.N && aif1.e != null)
        {
            aif1.e.a(new air(aif1), true);
        }
    }

    public static void d()
    {
        aif aif1 = a;
        if (aif1.N && aif1.e != null)
        {
            aif1.e.a(new aii(aif1), true);
        }
    }

    public static void e()
    {
        aif aif1 = a;
        if (aif1.N && aif1.e != null)
        {
            aif1.e.a(new aiq(aif1), true);
        }
    }

}
