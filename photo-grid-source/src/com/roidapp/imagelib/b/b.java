// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.b;


public final class b
    implements Cloneable
{

    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;

    public b()
    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
    }

    public b(int i, int j, int k, int l)
    {
        a = 0;
        b = 0;
        c = 0;
        d = 0;
        e = 0;
        f = 0;
        a = i;
        b = j;
        c = k;
        d = l;
    }

    public final void a(int i)
    {
        a = i - 150;
    }

    public final boolean a()
    {
        return a != 0 || b != 0 || c != 0 || d != 0;
    }

    public final b b()
    {
        b b1;
        try
        {
            b1 = (b)super.clone();
        }
        catch (CloneNotSupportedException clonenotsupportedexception)
        {
            clonenotsupportedexception.printStackTrace();
            clonenotsupportedexception = null;
        }
        b1.a = a;
        b1.b = b;
        b1.c = c;
        b1.d = d;
        return b1;
    }

    public final void b(int i)
    {
        b = i - 100;
    }

    public final int c()
    {
        return a + 150;
    }

    public final void c(int i)
    {
        c = i - 100;
    }

    public final Object clone()
    {
        return b();
    }

    public final int d()
    {
        return d + 180;
    }

    public final void d(int i)
    {
        d = i - 180;
    }
}
