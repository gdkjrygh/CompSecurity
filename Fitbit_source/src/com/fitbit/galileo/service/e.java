// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.galileo.service;

import com.fitbit.bluetooth.Manufacturer;
import com.fitbit.bluetooth.k;
import com.fitbit.bluetooth.n;

public class e
{

    private int a;
    private long b;
    private double c;

    public e(int i, long l)
    {
        a = i;
        b = l;
        c = Math.log(l / 60000L) / Math.log(i);
    }

    public long a(int i)
    {
        double d = Math.min(c, i);
        return Math.min(Math.round(Math.pow(a, d) * 60000D), b);
    }

    public long a(int i, long l)
    {
        if (n.a().a().equals(Manufacturer.c)) goto _L2; else goto _L1
_L1:
        return l;
_L2:
        int j = i;
        if (i < 0)
        {
            j = 0;
        }
        switch (j)
        {
        default:
            return a(j - 2);

        case 1: // '\001'
            return l * 3L;

        case 0: // '\0'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }
}
