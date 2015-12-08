// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ar;


public class c
{

    private String a;
    private int b;
    private int c;

    public c(String s)
    {
        a = s;
        b = 0;
        c = 0;
    }

    public c(String s, int i, int j)
    {
        a = s;
        b = i;
        c = j;
    }

    public String a()
    {
        return a;
    }

    public int b()
    {
        return b;
    }

    public int c()
    {
        return c;
    }

    public String d()
    {
        return (new StringBuilder()).append(b()).append("").append(c()).toString();
    }
}
