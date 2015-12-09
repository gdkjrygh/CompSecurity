// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.a.a:
//            d, ad, c

abstract class b
    implements Iterator
{

    private int a;
    private Object b;

    protected b()
    {
        a = d.b;
    }

    protected abstract Object a();

    protected final Object b()
    {
        a = d.c;
        return null;
    }

    public final boolean hasNext()
    {
        boolean flag1 = false;
        boolean flag;
        if (a != d.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ad.b(flag);
        flag = flag1;
        switch (c.a[a - 1])
        {
        default:
            a = d.d;
            b = a();
            flag = flag1;
            if (a != d.c)
            {
                a = d.a;
                flag = true;
            }
            // fall through

        case 1: // '\001'
            return flag;

        case 2: // '\002'
            return true;
        }
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            a = d.b;
            Object obj = b;
            b = null;
            return obj;
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
