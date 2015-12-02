// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.a:
//            mi, kq

class kr extends mi
{

    boolean a;
    final int b;
    final kq c;

    kr(kq kq1, int i)
    {
        c = kq1;
        b = i;
        super();
        boolean flag;
        if (b == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    public boolean hasNext()
    {
        return a;
    }

    public boolean hasPrevious()
    {
        return !a;
    }

    public Object next()
    {
        if (!a)
        {
            throw new NoSuchElementException();
        } else
        {
            a = false;
            return c.a;
        }
    }

    public int nextIndex()
    {
        return !a ? 1 : 0;
    }

    public Object previous()
    {
        if (a)
        {
            throw new NoSuchElementException();
        } else
        {
            a = true;
            return c.a;
        }
    }

    public int previousIndex()
    {
        return !a ? 0 : -1;
    }
}
