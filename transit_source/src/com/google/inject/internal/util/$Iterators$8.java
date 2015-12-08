// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $UnmodifiableIterator, $Iterators

static final class Iterator extends $UnmodifiableIterator
{

    boolean done;
    final Object val$value;

    public boolean hasNext()
    {
        return !done;
    }

    public Object next()
    {
        if (done)
        {
            throw new NoSuchElementException();
        } else
        {
            done = true;
            return val$value;
        }
    }

    Iterator(Object obj)
    {
        val$value = obj;
        super();
    }
}
