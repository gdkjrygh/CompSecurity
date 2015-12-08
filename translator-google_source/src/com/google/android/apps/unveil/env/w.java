// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.env;

import android.os.SystemClock;

public final class w
{

    private final String a = null;
    private long b;
    private long c;
    private boolean d;

    public w()
    {
    }

    public final void a()
    {
        if (d)
        {
            return;
        } else
        {
            b = SystemClock.uptimeMillis();
            d = true;
            return;
        }
    }

    public final void b()
    {
        if (!d)
        {
            return;
        } else
        {
            long l = SystemClock.uptimeMillis();
            long l1 = c;
            c = (l - b) + l1;
            d = false;
            return;
        }
    }

    public final void c()
    {
        b = SystemClock.uptimeMillis();
        c = 0L;
    }

    public final long d()
    {
        if (d)
        {
            long l = SystemClock.uptimeMillis();
            c = c + (l - b);
            b = l;
        }
        return c;
    }

    public final String toString()
    {
        if (a != null)
        {
            String s = a;
            long l = c;
            return (new StringBuilder(String.valueOf(s).length() + 26)).append("[").append(s).append(": ").append(l).append("ms]").toString();
        } else
        {
            long l1 = c;
            return (new StringBuilder(22)).append(l1).append("ms").toString();
        }
    }
}
