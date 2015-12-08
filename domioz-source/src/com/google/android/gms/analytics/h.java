// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            aj, b

public final class h
{

    private static volatile b a = new aj();

    public static void a(String s)
    {
        b b1 = a;
        if (b1 != null)
        {
            b1.d(s);
        }
    }

    public static boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (a != null)
        {
            flag = flag1;
            if (a.a() == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    static b b()
    {
        return a;
    }

    public static void b(String s)
    {
        b b1 = a;
        if (b1 != null)
        {
            b1.b(s);
        }
    }

    public static void c(String s)
    {
        b b1 = a;
        if (b1 != null)
        {
            b1.a(s);
        }
    }

    public static void d(String s)
    {
        b b1 = a;
        if (b1 != null)
        {
            b1.c(s);
        }
    }

}
