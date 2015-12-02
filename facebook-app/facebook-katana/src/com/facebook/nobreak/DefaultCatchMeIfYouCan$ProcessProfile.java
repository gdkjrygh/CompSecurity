// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nobreak;


public class f
{

    public final String a;
    public final int b;
    public final long c;
    public final boolean d;
    public final boolean e;
    public final boolean f;

    public String toString()
    {
        return (new StringBuilder("('")).append(a).append("', ").append(b).append(", ").append(c).append(", silent [").append(d).append("], restart [").append(e).append("], logout [").append(f).append("])").toString();
    }

    public (String s, int i, long l)
    {
        this(s, i, l, true, false, false);
    }

    public <init>(String s, int i, long l, boolean flag, boolean flag1, boolean flag2)
    {
        a = s;
        b = i;
        c = l;
        d = flag;
        e = flag1;
        f = flag2;
    }
}
