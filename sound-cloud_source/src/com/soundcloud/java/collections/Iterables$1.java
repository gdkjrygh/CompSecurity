// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            Iterables, Iterators

final class val.inputs
    implements Iterable
{

    final Iterable val$inputs;

    public final Iterator iterator()
    {
        return Iterators.concat(Iterables.access$000(val$inputs));
    }

    ()
    {
        val$inputs = iterable;
        super();
    }
}
