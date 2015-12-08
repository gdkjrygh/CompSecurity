// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            Iterators

final class val.type
    implements Iterable
{

    final Class val$type;
    final Iterable val$unfiltered;

    public final Iterator iterator()
    {
        return Iterators.filter(val$unfiltered.iterator(), val$type);
    }

    ()
    {
        val$unfiltered = iterable;
        val$type = class1;
        super();
    }
}
