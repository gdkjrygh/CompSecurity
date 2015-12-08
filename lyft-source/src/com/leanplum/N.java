// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import android.os.Handler;

final class N
{

    private static N a;
    private Handler b;

    N()
    {
        b = new Handler();
    }

    static N a()
    {
        if (a == null)
        {
            a = new N();
        }
        return a;
    }

    public final Boolean a(Runnable runnable)
    {
        return Boolean.valueOf(b.post(runnable));
    }

    public final Boolean a(Runnable runnable, long l)
    {
        return Boolean.valueOf(b.postDelayed(runnable, l));
    }
}
