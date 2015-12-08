// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.j;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            as

abstract class a extends as
{

    private final int a;
    private int b;

    protected a(int i, int k)
    {
        j.b(k, i);
        a = i;
        b = k;
    }

    protected abstract Object a(int i);

    public final boolean hasNext()
    {
        return b < a;
    }

    public final boolean hasPrevious()
    {
        return b > 0;
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            int i = b;
            b = i + 1;
            return a(i);
        }
    }

    public final int nextIndex()
    {
        return b;
    }

    public final Object previous()
    {
        if (!hasPrevious())
        {
            throw new NoSuchElementException();
        } else
        {
            int i = b - 1;
            b = i;
            return a(i);
        }
    }

    public final int previousIndex()
    {
        return b - 1;
    }
}
