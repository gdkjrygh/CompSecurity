// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            Iterators

final class val.size
    implements Iterable
{

    final Iterable val$iterable;
    final int val$size;

    public final Iterator iterator()
    {
        return Iterators.paddedPartition(val$iterable.iterator(), val$size);
    }

    ()
    {
        val$iterable = iterable1;
        val$size = i;
        super();
    }
}
