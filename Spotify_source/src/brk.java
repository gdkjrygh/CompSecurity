// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class brk
    implements Iterator
{

    private bri a;
    private int b;

    public brk(bri bri1)
    {
        a = (bri)btl.a(bri1);
        b = -1;
    }

    public final boolean hasNext()
    {
        return b < a.b() - 1;
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder("Cannot advance the iterator beyond ")).append(b).toString());
        } else
        {
            bri bri1 = a;
            int i = b + 1;
            b = i;
            return bri1.a(i);
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
