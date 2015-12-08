// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.samsung.multiscreen.b;


public final class f
{

    private int a;
    private String b;

    protected f()
    {
        a = -1;
        b = "error";
    }

    protected f(String s)
    {
        a = -1;
        b = "error";
        a = -1;
        b = s;
    }

    public f(String s, byte byte0)
    {
        a = -1;
        b = "error";
        b = s;
    }

    public final String a()
    {
        return b;
    }

    public final String toString()
    {
        String s = (new StringBuilder()).append("[ChannelError]").append(" code: ").append(a).toString();
        return (new StringBuilder()).append(s).append(", message: ").append(b).toString();
    }
}
