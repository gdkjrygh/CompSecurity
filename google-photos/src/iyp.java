// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public final class iyp
    implements Iterator
{

    private Iterator a;
    private int b;

    public iyp(Iterator iterator, int i)
    {
        a = iterator;
        b = i;
        super();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        Object aobj[] = new Object[b];
        int i;
        for (i = 0; i < b && a.hasNext(); i++)
        {
            aobj[i] = a.next();
        }

        for (int j = i; j < b; j++)
        {
            aobj[j] = null;
        }

        List list = Collections.unmodifiableList(Arrays.asList(aobj));
        if (i == b)
        {
            return list;
        } else
        {
            return list.subList(0, i);
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
