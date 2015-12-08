// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.y;
import com.google.android.gms.internal.io;

final class k
{

    private final io a;
    private long b;

    public k(io io1)
    {
        y.a(io1);
        a = io1;
    }

    public k(io io1, long l)
    {
        y.a(io1);
        a = io1;
        b = l;
    }

    public final void a()
    {
        b = a.b();
    }

    public final boolean a(long l)
    {
        while (b == 0L || a.b() - b > l) 
        {
            return true;
        }
        return false;
    }

    public final void b()
    {
        b = 0L;
    }
}
