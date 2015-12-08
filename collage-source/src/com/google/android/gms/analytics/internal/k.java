// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.z;
import com.google.android.gms.internal.ix;

class k
{

    private final ix a;
    private long b;

    public k(ix ix1)
    {
        z.a(ix1);
        a = ix1;
    }

    public k(ix ix1, long l)
    {
        z.a(ix1);
        a = ix1;
        b = l;
    }

    public void a()
    {
        b = a.b();
    }

    public boolean a(long l)
    {
        while (b == 0L || a.b() - b > l) 
        {
            return true;
        }
        return false;
    }

    public void b()
    {
        b = 0L;
    }
}
