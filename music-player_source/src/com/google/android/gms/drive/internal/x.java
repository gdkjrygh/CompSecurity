// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.drive.internal;

import com.google.android.gms.internal.kp;
import com.google.android.gms.internal.kv;

public final class x extends kv
{

    public static final x a[] = new x[0];
    public int b;
    public String c;
    public long d;
    public long e;
    private int f;

    public x()
    {
        b = 1;
        c = "";
        d = -1L;
        e = -1L;
        f = -1;
    }

    public final int a()
    {
        if (f < 0)
        {
            b();
        }
        return f;
    }

    public final void a(kp kp1)
    {
        kp1.a(1, b);
        kp1.a(2, c);
        kp1.b(3, d);
        kp1.b(4, e);
    }

    public final int b()
    {
        int i = kp.a(b) + 0 + kp.b(2, c) + kp.c(3, d) + kp.c(4, e);
        f = i;
        return i;
    }

}
