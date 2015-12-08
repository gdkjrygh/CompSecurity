// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.functions.Predicate;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            Iterators

final class val.predicate
    implements Iterable
{

    final Predicate val$predicate;
    final Iterable val$unfiltered;

    public final Iterator iterator()
    {
        return Iterators.filter(val$unfiltered.iterator(), val$predicate);
    }

    ()
    {
        val$unfiltered = iterable;
        val$predicate = predicate1;
        super();
    }
}
