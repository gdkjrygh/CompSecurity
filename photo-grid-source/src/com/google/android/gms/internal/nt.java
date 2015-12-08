// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.concurrent.Future;

// Referenced classes of package com.google.android.gms.internal:
//            rf, nu, nv, ry, 
//            ho, fz

public final class nt
{

    ry a;
    ho b;
    public final fz c = new nu(this);
    public final fz d = new nv(this);
    private final Object e = new Object();
    private String f;
    private String g;
    private rf h;

    public nt(String s, String s1)
    {
        h = new rf();
        g = s1;
        f = s;
    }

    static Object a(nt nt1)
    {
        return nt1.e;
    }

    static rf b(nt nt1)
    {
        return nt1.h;
    }

    static String c(nt nt1)
    {
        return nt1.f;
    }

    static String d(nt nt1)
    {
        return nt1.g;
    }

    public final Future a()
    {
        return h;
    }
}
