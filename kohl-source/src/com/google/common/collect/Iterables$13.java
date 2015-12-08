// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Queue;

// Referenced classes of package com.google.common.collect:
//            Iterables

static final class val.iterable
    implements Iterable
{

    final Iterable val$iterable;

    public Iterator iterator()
    {
        return new sumingQueueIterator((Queue)val$iterable, null);
    }

    sumingQueueIterator(Iterable iterable1)
    {
        val$iterable = iterable1;
        super();
    }
}
