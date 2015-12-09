// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.c;


class w
{

    private final int a[] = new int[256];
    private int b;

    public w()
    {
        b = 0;
    }

    public int a(int i)
    {
        return a[i];
    }

    public boolean a()
    {
        return a.length == b;
    }

    public int b()
    {
        int i = b;
        b = b + 1;
        a[i] = 0;
        return i;
    }

    public void b(int i)
    {
        int ai[] = a;
        ai[i] = ai[i] + 1;
    }

    public void c()
    {
        b = b - 1;
        if (b < 0)
        {
            throw new ArrayIndexOutOfBoundsException(b);
        } else
        {
            return;
        }
    }
}
