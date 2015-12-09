// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import com.google.android.gms.common.internal.zzv;
import com.google.android.gms.internal.zzht;

class c
{

    private final zzht a;
    private long b;

    public c(zzht zzht1)
    {
        zzv.zzr(zzht1);
        a = zzht1;
    }

    public c(zzht zzht1, long l)
    {
        zzv.zzr(zzht1);
        a = zzht1;
        b = l;
    }

    public void a()
    {
        b = a.elapsedRealtime();
    }

    public boolean a(long l)
    {
        while (b == 0L || a.elapsedRealtime() - b > l) 
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
