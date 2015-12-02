// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.antivirus.update;


public class s
{

    String a;
    private String b;
    private String c;
    private String d;
    private long e;
    private int f;
    private String g;
    private String h;
    private long i;
    private int j;

    public s(String s1, String s2, String s3, long l, int k, String s4, 
            String s5, long l1, int i1, String s6)
    {
        b = s1;
        c = s2;
        d = s3;
        e = l;
        f = k;
        g = s4;
        h = s5;
        i = l1;
        j = i1;
        a = s6;
    }

    public int a()
    {
        return j;
    }

    public String b()
    {
        return b;
    }

    public String c()
    {
        return c;
    }

    public String d()
    {
        return d;
    }

    public long e()
    {
        return e;
    }

    public String f()
    {
        return g;
    }

    public String g()
    {
        return h;
    }

    public long h()
    {
        return i;
    }

    public int i()
    {
        return f;
    }

    public int j()
    {
        int k;
        try
        {
            k = Integer.valueOf(a).intValue();
        }
        catch (Exception exception)
        {
            return 0;
        }
        return k;
    }
}
