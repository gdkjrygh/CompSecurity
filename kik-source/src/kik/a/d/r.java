// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;

import java.io.Serializable;

public final class r
    implements Serializable
{

    private boolean a;
    private long b;
    private String c;
    private String d;
    private String e;

    private r(boolean flag, long l, String s, String s1, String s2)
    {
        a = flag;
        b = l;
        c = s;
        d = s1;
        e = s2;
    }

    public static r a(long l)
    {
        return new r(false, l, null, null, null);
    }

    public static r a(long l, String s, String s1, String s2)
    {
        return new r(true, l, s, s1, s2);
    }

    public final boolean a()
    {
        return a;
    }

    public final long b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final String d()
    {
        return d;
    }

    public final String e()
    {
        return e;
    }
}
