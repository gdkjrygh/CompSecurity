// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Predicate;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractIterator, Iterators

static final class ator extends AbstractIterator
{

    final Predicate val$predicate;
    final Iterator val$unfiltered;

    protected Object computeNext()
    {
        while (val$unfiltered.hasNext()) 
        {
            Object obj = val$unfiltered.next();
            if (val$predicate.apply(obj))
            {
                return obj;
            }
        }
        return endOfData();
    }

    ator(Iterator iterator, Predicate predicate1)
    {
        val$unfiltered = iterator;
        val$predicate = predicate1;
        super();
    }
}
