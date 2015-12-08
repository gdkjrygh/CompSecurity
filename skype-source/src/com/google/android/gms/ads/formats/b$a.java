// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;


// Referenced classes of package com.google.android.gms.ads.formats:
//            b

public static final class c
{

    private boolean a;
    private int b;
    private boolean c;

    static boolean a(c c1)
    {
        return c1.a;
    }

    static int b(a a1)
    {
        return a1.b;
    }

    static boolean c(b b1)
    {
        return b1.c;
    }

    public final c a(int i)
    {
        b = i;
        return this;
    }

    public final b a(boolean flag)
    {
        a = flag;
        return this;
    }

    public final b a()
    {
        return new b(this, (byte)0);
    }

    public final nit> b(boolean flag)
    {
        c = flag;
        return this;
    }

    public ()
    {
        a = false;
        b = 0;
        c = false;
    }
}
