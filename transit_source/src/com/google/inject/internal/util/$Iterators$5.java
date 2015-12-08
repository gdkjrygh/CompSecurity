// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $Iterators, $Function

static final class val.function
    implements Iterator
{

    final Iterator val$fromIterator;
    final $Function val$function;

    public boolean hasNext()
    {
        return val$fromIterator.hasNext();
    }

    public Object next()
    {
        Object obj = val$fromIterator.next();
        return val$function.apply(obj);
    }

    public void remove()
    {
        val$fromIterator.remove();
    }

    (Iterator iterator, $Function $function)
    {
        val$fromIterator = iterator;
        val$function = $function;
        super();
    }
}
