// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $Iterables, $Iterators, $Function

static final class erableWithToString extends erableWithToString
{

    final Iterable val$fromIterable;
    final $Function val$function;

    public Iterator iterator()
    {
        return $Iterators.transform(val$fromIterable.iterator(), val$function);
    }

    erableWithToString(Iterable iterable, $Function $function)
    {
        val$fromIterable = iterable;
        val$function = $function;
        super();
    }
}
