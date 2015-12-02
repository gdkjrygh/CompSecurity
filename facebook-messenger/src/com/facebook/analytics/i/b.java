// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.analytics.i;

import com.facebook.common.w.m;

public class b
{

    public b()
    {
    }

    public static String a(long l)
    {
        return m.a("%.3f", new Object[] {
            Double.valueOf((double)l / 1000D)
        });
    }
}
