// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.cache;

import com.google.common.collect.Iterators;
import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.cache:
//            LocalCache

static final class  extends AbstractQueue
{

    public final Iterator iterator()
    {
        return Iterators.emptyIterator();
    }

    public final boolean offer(Object obj)
    {
        return true;
    }

    public final Object peek()
    {
        return null;
    }

    public final Object poll()
    {
        return null;
    }

    public final int size()
    {
        return 0;
    }

    ()
    {
    }
}
