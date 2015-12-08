// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.device;

import com.samsung.multiscreen.net.b.a;

public final class g
{

    private long a;
    private String b;

    public g()
    {
        a = -1L;
        b = "error";
    }

    public g(long l, String s)
    {
        a = -1L;
        b = "error";
        a = l;
        b = s;
    }

    public g(String s)
    {
        this(-1L, s);
    }

    public static g a(a a1)
    {
        return new g(a1.a(), a1.b());
    }

    public final long a()
    {
        return a;
    }

    public final String b()
    {
        return b;
    }

    public final String toString()
    {
        String s = (new StringBuilder()).append("[DeviceError]").append(" code: ").append(a).toString();
        return (new StringBuilder()).append(s).append(", message: ").append(b).toString();
    }
}
