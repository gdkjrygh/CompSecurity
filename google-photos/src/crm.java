// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.LongSparseArray;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class crm
    implements Iterator
{

    private int a;
    private crk b;

    crm(crk crk1)
    {
        b = crk1;
        super();
    }

    public final boolean hasNext()
    {
        return a < b.a.size();
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        } else
        {
            cod cod1 = (cod)b.a.valueAt(a);
            a = a + 1;
            return cod1;
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
