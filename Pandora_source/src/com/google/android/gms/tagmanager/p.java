// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;

import android.text.TextUtils;

class p
{

    private final long a;
    private final long b;
    private final long c;
    private String d;

    p(long l, long l1, long l2)
    {
        a = l;
        b = l1;
        c = l2;
    }

    long a()
    {
        return a;
    }

    void a(String s)
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

    long b()
    {
        return c;
    }

    String c()
    {
        return d;
    }
}
