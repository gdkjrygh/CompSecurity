// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.u;

class q
{

    private final com.google.android.gms.d.q a;
    private long b;

    public q(com.google.android.gms.d.q q1)
    {
        u.a(q1);
        a = q1;
    }

    public q(com.google.android.gms.d.q q1, long l)
    {
        u.a(q1);
        a = q1;
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
