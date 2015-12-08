// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

final class u
{

    private final long a;
    private final long b;
    private final long c;
    private String d;

    u(long l, long l1, long l2)
    {
        a = l;
        b = l1;
        c = l2;
    }

    final long a()
    {
        return a;
    }

    final void a(String s)
    {
        if (s == null || TextUtils.isEmpty(s.trim()))
        {
            return;
        } else
        {
            d = s;
            return;
        }
    }

    final long b()
    {
        return c;
    }

    final String c()
    {
        return d;
    }
}
