// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.util.SparseArray;

public final class ln
{

    private static ln d;
    private int a;
    private SparseArray b;
    private String c;

    public ln()
    {
        b = new SparseArray();
    }

    public static ln a()
    {
        if (d == null)
        {
            d = new ln();
        }
        return d;
    }

    public final String a(int i)
    {
        if (b != null)
        {
            return (String)b.get(i);
        } else
        {
            return null;
        }
    }

    public final void a(SparseArray sparsearray)
    {
        b = sparsearray;
    }

    public final void a(String s)
    {
        c = s;
    }

    public final int b()
    {
        return a;
    }

    public final void b(int i)
    {
        a = i;
    }

    public final void c()
    {
        a = 0;
        b.clear();
        b = null;
        c = null;
        d = null;
    }

    public final String d()
    {
        return c;
    }
}
