// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.d;


public final class h
{

    private final String a;
    private String b;
    private boolean c;

    public h(String s)
    {
        this(s, (byte)0);
    }

    private h(String s, byte byte0)
    {
        a = s;
        c = false;
    }

    public h(String s, boolean flag, String s1)
    {
        a = s;
        c = flag;
        b = s1;
    }

    public final String a()
    {
        return a;
    }

    public final void a(String s)
    {
        b = s;
    }

    public final void a(boolean flag)
    {
        c = flag;
    }

    public final String b()
    {
        return b;
    }

    public final boolean c()
    {
        return c;
    }

    public final boolean equals(Object obj)
    {
        return (obj instanceof h) && a != null && a.equals(((h)obj).a);
    }

    public final int hashCode()
    {
        return a.hashCode();
    }
}
