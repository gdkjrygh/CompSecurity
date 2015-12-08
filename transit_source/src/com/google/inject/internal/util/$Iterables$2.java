// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $Iterables, $Iterators

static final class erableWithToString extends erableWithToString
{

    final Iterable val$iterators;

    public Iterator iterator()
    {
        return $Iterators.concat(val$iterators.iterator());
    }

    erableWithToString(Iterable iterable)
    {
        val$iterators = iterable;
        super();
    }
}
