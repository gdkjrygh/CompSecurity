// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.common.b;

import com.google.common.base.Preconditions;

public class e
{

    private final Object a[];
    private int b;
    private int c;
    private int d;

    public e(int i)
    {
        b = 0;
        c = 0;
        d = 0;
        a = (Object[])new Object[i];
    }

    public Object a()
    {
        Object obj;
        boolean flag;
        if (b > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Underflow");
        obj = a[c];
        a[c] = null;
        c = (c + 1) % a.length;
        b = b - 1;
        return obj;
    }

    public Object a(int i)
    {
        if (b <= i)
        {
            throw new IndexOutOfBoundsException();
        } else
        {
            int j = c;
            int k = a.length;
            return a[(j + i) % k];
        }
    }

    public void a(Object obj)
    {
        boolean flag;
        if (b < a.length)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag, "Overflow");
        a[d] = obj;
        d = (d + 1) % a.length;
        b = b + 1;
    }

    public boolean b()
    {
        return b == a.length;
    }

    public int c()
    {
        return b;
    }
}
