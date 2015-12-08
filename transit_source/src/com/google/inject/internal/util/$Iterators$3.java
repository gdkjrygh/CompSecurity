// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $UnmodifiableIterator, $Iterators

static final class Iterator extends $UnmodifiableIterator
{

    final Iterator val$iterator;

    public boolean hasNext()
    {
        return val$iterator.hasNext();
    }

    public Object next()
    {
        return val$iterator.next();
    }

    Iterator(Iterator iterator1)
    {
        val$iterator = iterator1;
        super();
    }
}
