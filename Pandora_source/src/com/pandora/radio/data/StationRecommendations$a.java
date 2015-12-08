// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.radio.data;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.pandora.radio.data:
//            StationRecommendations, StationRecommendation

public static class <init>
    implements Iterable, Iterator
{

    private List a;
    private int b;

    public StationRecommendation a()
        throws NoSuchElementException
    {
        if (hasNext())
        {
            List list = a;
            int i = b;
            b = i + 1;
            return (StationRecommendation)list.get(i);
        } else
        {
            throw new NoSuchElementException();
        }
    }

    public int b()
    {
        return a.size();
    }

    public boolean hasNext()
    {
        return b < a.size();
    }

    public Iterator iterator()
    {
        return this;
    }

    public Object next()
    {
        return a();
    }

    public void remove()
    {
        throw new UnsupportedOperationException();
    }

    private (List list)
    {
        b = 0;
        a = list;
    }

    a(List list, a a1)
    {
        this(list);
    }
}
