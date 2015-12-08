// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import android.app.Activity;

// Referenced classes of package com.roidapp.cloudlib.ads:
//            t, o

public final class s
{

    private static boolean a;
    private static o b;

    public static void a()
    {
        b = null;
        a = false;
    }

    public static void a(Activity activity)
    {
        if (!a)
        {
            t t1 = new t((byte)0);
            b = t1;
            t1.a(activity);
            a = true;
        }
    }

    public static void b()
    {
        if (b != null)
        {
            b.a();
        }
    }

    public static void b(Activity activity)
    {
        if (b != null)
        {
            b.b(activity);
        }
    }

    public static boolean c()
    {
        if (b != null)
        {
            return b.b();
        } else
        {
            return false;
        }
    }

    public static boolean d()
    {
        if (b != null)
        {
            return b.c();
        } else
        {
            return false;
        }
    }
}
