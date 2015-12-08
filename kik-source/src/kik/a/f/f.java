// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f;

import kik.a.f.g.c;

public final class f extends Exception
{

    private String a;
    private int b;
    private int c;
    private c d;

    public f(String s, int i, int j, c c1)
    {
        super((new StringBuilder("Server requested redirect to ")).append(s).append(":").append(i).append("with ttl of").append(j).append(" security=").append(c1).toString());
        a = s;
        b = i;
        c = j;
        d = c1;
    }

    public final String a()
    {
        if (a == null)
        {
            return "";
        } else
        {
            return a;
        }
    }

    public final int b()
    {
        return b;
    }

    public final int c()
    {
        return c;
    }

    public final c d()
    {
        return d;
    }
}
