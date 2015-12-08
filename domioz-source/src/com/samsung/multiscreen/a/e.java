// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.a;


public final class e
{

    private long a;
    private String b;

    public e()
    {
        a = -1L;
        b = "error";
    }

    public e(long l, String s)
    {
        a = -1L;
        b = "error";
        a = l;
        b = s;
    }

    public e(String s)
    {
        this(-1L, s);
    }

    public static e a(Exception exception)
    {
        return new e(exception.getLocalizedMessage());
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
        String s = (new StringBuilder()).append("[ApplicationError]").append(" code: ").append(a).toString();
        return (new StringBuilder()).append(s).append(", message: ").append(b).toString();
    }
}
