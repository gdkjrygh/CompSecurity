// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.bl;
import com.google.android.gms.internal.wg;

final class p
{

    private final wg a;
    private long b;

    public p(wg wg1)
    {
        bl.a(wg1);
        a = wg1;
    }

    public p(wg wg1, long l)
    {
        bl.a(wg1);
        a = wg1;
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
