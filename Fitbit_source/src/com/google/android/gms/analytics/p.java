// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;


// Referenced classes of package com.google.android.gms.analytics:
//            e, an, c

public class p
{

    private static c a;
    private static volatile boolean b = false;
    private static e c;

    private p()
    {
    }

    public static void a(String s)
    {
        e e1 = b();
        if (e1 != null)
        {
            e1.d(s);
        }
    }

    public static boolean a()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (b() != null)
        {
            flag = flag1;
            if (b().a() == 0)
            {
                flag = true;
            }
        }
        return flag;
    }

    static e b()
    {
        com/google/android/gms/analytics/p;
        JVM INSTR monitorenter ;
        e e1;
        if (!b)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        if (c == null)
        {
            c = new an();
        }
        e1 = c;
        com/google/android/gms/analytics/p;
        JVM INSTR monitorexit ;
        return e1;
        if (a == null)
        {
            a = com.google.android.gms.analytics.c.a();
        }
        if (a == null)
        {
            break MISSING_BLOCK_LABEL_70;
        }
        e1 = a.d();
        com/google/android/gms/analytics/p;
        JVM INSTR monitorexit ;
        return e1;
        Exception exception;
        exception;
        com/google/android/gms/analytics/p;
        JVM INSTR monitorexit ;
        throw exception;
        com/google/android/gms/analytics/p;
        JVM INSTR monitorexit ;
        return null;
    }

    public static void b(String s)
    {
        e e1 = b();
        if (e1 != null)
        {
            e1.b(s);
        }
    }

    public static void c(String s)
    {
        e e1 = b();
        if (e1 != null)
        {
            e1.a(s);
        }
    }

    public static void d(String s)
    {
        e e1 = b();
        if (e1 != null)
        {
            e1.c(s);
        }
    }

}
