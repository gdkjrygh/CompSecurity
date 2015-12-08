// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            Iterables, Iterators

static final class rableWithToString extends rableWithToString
{

    final Iterable val$iterable;
    final int val$limitSize;

    public Iterator iterator()
    {
        return Iterators.limit(val$iterable.iterator(), val$limitSize);
    }

    rableWithToString(Iterable iterable1, int i)
    {
        val$iterable = iterable1;
        val$limitSize = i;
        super();
    }
}
