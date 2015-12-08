// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.functions.Predicate;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            AbstractIterator

final class ator extends AbstractIterator
{

    final Predicate val$predicate;
    final Iterator val$unfiltered;

    protected final Object computeNext()
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

    ator()
    {
        val$unfiltered = iterator;
        val$predicate = predicate1;
        super();
    }
}
