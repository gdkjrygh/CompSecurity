// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

// Referenced classes of package com.soundcloud.java.collections:
//            UnmodifiableIterator

final class Iterator extends UnmodifiableIterator
{

    final Iterator val$iterator;
    final boolean val$pad;
    final int val$size;

    public final boolean hasNext()
    {
        return val$iterator.hasNext();
    }

    public final volatile Object next()
    {
        return next();
    }

    public final List next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        Object aobj[] = new Object[val$size];
        int i;
        for (i = 0; i < val$size && val$iterator.hasNext(); i++)
        {
            aobj[i] = val$iterator.next();
        }

        for (int j = i; j < val$size; j++)
        {
            aobj[j] = null;
        }

        List list = Collections.unmodifiableList(Arrays.asList(aobj));
        if (val$pad || i == val$size)
        {
            return list;
        } else
        {
            return list.subList(0, i);
        }
    }

    Iterator()
    {
        val$iterator = iterator1;
        val$size = i;
        val$pad = flag;
        super();
    }
}
