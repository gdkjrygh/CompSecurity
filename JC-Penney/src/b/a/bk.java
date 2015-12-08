// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import android.content.Context;

// Referenced classes of package b.a:
//            k, af, cr

public final class bk
{

    private static k a = null;
    private static Context b = null;
    private static af c = null;
    private static cr d = null;

    static k a()
    {
        return a;
    }

    public static void a(Context context)
    {
        b = context;
    }

    public static void a(af af)
    {
        c = af;
    }

    public static void a(cr cr)
    {
        d = cr;
    }

    public static void a(k k)
    {
        a = k;
    }

    static Context b()
    {
        return b;
    }

    static af c()
    {
        return c;
    }

    static cr d()
    {
        return d;
    }

}
