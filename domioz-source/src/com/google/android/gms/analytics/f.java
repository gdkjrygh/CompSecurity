// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics;

import android.text.TextUtils;

public final class f
{

    private String a;
    private final long b;
    private final long c;
    private final String d;
    private String e;
    private String f;

    public f(long l, long l1, String s)
    {
        f = "https:";
        a = null;
        b = l;
        c = l1;
        d = s;
    }

    public final String a()
    {
        return a;
    }

    public final void a(String s)
    {
        a = s;
    }

    public final long b()
    {
        return b;
    }

    public final void b(String s)
    {
        if (s != null && !TextUtils.isEmpty(s.trim()))
        {
            e = s;
            if (s.toLowerCase().startsWith("http:"))
            {
                f = "http:";
                return;
            }
        }
    }

    public final long c()
    {
        return c;
    }

    public final String d()
    {
        return f;
    }
}
