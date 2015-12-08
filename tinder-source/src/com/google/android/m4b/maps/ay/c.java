// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.ay;

import android.os.Looper;
import com.google.android.m4b.maps.y.j;

// Referenced classes of package com.google.android.m4b.maps.ay:
//            b

public final class c extends b
{

    private static final c a = new c(Looper.getMainLooper().getThread(), "Not on the main thread", "Should not be on the main thread");
    private final Thread b;
    private final String c;
    private final String d;

    private c(Thread thread, String s, String s1)
    {
        b = thread;
        c = s;
        d = s1;
    }

    public static b c()
    {
        return a;
    }

    public static void d()
    {
        a.a();
    }

    public static void e()
    {
        a.b();
    }

    public final void a()
    {
        boolean flag;
        if (Thread.currentThread() == b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, c);
    }

    public final void b()
    {
        boolean flag;
        if (Thread.currentThread() != b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j.b(flag, d);
    }

}
