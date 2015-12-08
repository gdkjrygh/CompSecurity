// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            jv

public static final class a
{

    private final String a;
    private boolean b;
    private boolean c;
    private String d;

    static String a(a a1)
    {
        return a1.a;
    }

    static boolean b(a a1)
    {
        return a1.b;
    }

    static boolean c(b b1)
    {
        return b1.c;
    }

    static String d(c c1)
    {
        return c1.d;
    }

    public final d a(String s)
    {
        d = s;
        return this;
    }

    public final d a(boolean flag)
    {
        b = flag;
        return this;
    }

    public final jv a()
    {
        return new jv(this, (byte)0);
    }

    public final nit> b(boolean flag)
    {
        c = flag;
        return this;
    }

    public (String s)
    {
        b = true;
        c = false;
        a = s;
    }
}
