// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.lrc;


public final class h
{

    private long a;
    private String b;

    public h()
    {
        a = 0L;
        b = "";
    }

    public final double a()
    {
        return (double)a;
    }

    public final void a(String s)
    {
        s = s.split(":|\\.");
        int i = Integer.parseInt(s[0]);
        int j = Integer.parseInt(s[1]);
        a = Integer.parseInt(s[2]) * 10 + (i * 60 * 1000 + j * 1000);
    }

    public final String b()
    {
        return b;
    }

    public final void b(String s)
    {
        b = s;
    }

    public final String toString()
    {
        return (new StringBuilder("LrcCeil [time=")).append(a).append(", lyric=").append(b).append("]").toString();
    }
}
