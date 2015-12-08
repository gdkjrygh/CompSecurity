// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzu;
import com.google.android.gms.internal.zzlb;

class zzaj
{

    private final zzlb a;
    private long b;

    public zzaj(zzlb zzlb1)
    {
        zzu.a(zzlb1);
        a = zzlb1;
    }

    public zzaj(zzlb zzlb1, long l)
    {
        zzu.a(zzlb1);
        a = zzlb1;
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
