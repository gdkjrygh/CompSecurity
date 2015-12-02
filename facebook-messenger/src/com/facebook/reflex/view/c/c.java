// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.reflex.view.c;

import com.google.common.a.hq;
import java.util.ArrayList;

public class c
{

    private final ArrayList a = hq.a();
    private int b;
    private int c;
    private int d;

    public c()
    {
        b = 0;
        c = 0;
        d = 0;
    }

    public int a()
    {
        return d;
    }

    public int a(int i)
    {
        if (a.isEmpty())
        {
            return c;
        }
        if (i >= a.size())
        {
            return a();
        }
        for (; b < i; b = b + 1)
        {
            int j = c;
            c = ((Integer)a.get(b)).intValue() + j;
        }

        while (b > i && b > 0) 
        {
            b = b - 1;
            c = c - ((Integer)a.get(b)).intValue();
        }
        return c;
    }

    public void a(int i, int j)
    {
        for (; i > a.size(); d(0)) { }
        if (i == a.size())
        {
            d(j);
        } else
        {
            int k = ((Integer)a.set(i, Integer.valueOf(j))).intValue();
            d = d + (j - k);
            if (i < b)
            {
                c = (j - k) + c;
                return;
            }
        }
    }

    public int b()
    {
        return a.size();
    }

    public int b(int i)
    {
        if (a.isEmpty())
        {
            return b;
        }
        do
        {
            int j = c;
            if (((Integer)a.get(b)).intValue() + j > i || b >= a.size() - 1)
            {
                break;
            }
            j = c;
            c = ((Integer)a.get(b)).intValue() + j;
            b = b + 1;
        } while (true);
        int k = c;
        if (((Integer)a.get(b)).intValue() + k <= i)
        {
            return a.size();
        }
        for (; c > i && b > 0; c = c - ((Integer)a.get(b)).intValue())
        {
            b = b - 1;
        }

        return b;
    }

    public int c(int i)
    {
        return ((Integer)a.get(i)).intValue();
    }

    public void d(int i)
    {
        a.add(Integer.valueOf(i));
        d = d + i;
    }
}
