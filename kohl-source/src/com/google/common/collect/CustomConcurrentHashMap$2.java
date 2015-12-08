// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractQueue;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            CustomConcurrentHashMap, Iterators

static final class ferenceEntry extends AbstractQueue
{

    public Iterator iterator()
    {
        return Iterators.emptyIterator();
    }

    public boolean offer(ferenceEntry ferenceentry)
    {
        return true;
    }

    public volatile boolean offer(Object obj)
    {
        return offer((ferenceEntry)obj);
    }

    public ferenceEntry peek()
    {
        return null;
    }

    public volatile Object peek()
    {
        return peek();
    }

    public ferenceEntry poll()
    {
        return null;
    }

    public volatile Object poll()
    {
        return poll();
    }

    public int size()
    {
        return 0;
    }

    ferenceEntry()
    {
    }
}
