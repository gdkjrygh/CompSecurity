// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.adv;


public class c
    implements Comparable
{

    private int a;
    private int b;
    private String c;

    public c()
    {
    }

    public int a()
    {
        return b;
    }

    public int a(c c1)
    {
        if (a > c1.a)
        {
            return -1;
        }
        return a >= c1.a ? 0 : 1;
    }

    public void a(int i)
    {
        a = i;
    }

    public void a(String s)
    {
        c = s;
    }

    public String b()
    {
        return c;
    }

    public void b(int i)
    {
        b = i;
    }

    public int compareTo(Object obj)
    {
        return a((c)obj);
    }
}
