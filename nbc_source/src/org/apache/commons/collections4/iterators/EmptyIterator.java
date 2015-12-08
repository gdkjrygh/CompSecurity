// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.collections4.iterators;

import java.util.Iterator;
import org.apache.commons.collections4.ResettableIterator;

// Referenced classes of package org.apache.commons.collections4.iterators:
//            AbstractEmptyIterator

public class EmptyIterator extends AbstractEmptyIterator
    implements ResettableIterator
{

    public static final Iterator INSTANCE;
    public static final ResettableIterator RESETTABLE_INSTANCE;

    protected EmptyIterator()
    {
    }

    public static Iterator emptyIterator()
    {
        return INSTANCE;
    }

    public volatile void add(Object obj)
    {
        super.add(obj);
    }

    public volatile boolean hasNext()
    {
        return super.hasNext();
    }

    public volatile boolean hasPrevious()
    {
        return super.hasPrevious();
    }

    public volatile Object next()
    {
        return super.next();
    }

    public volatile int nextIndex()
    {
        return super.nextIndex();
    }

    public volatile Object previous()
    {
        return super.previous();
    }

    public volatile int previousIndex()
    {
        return super.previousIndex();
    }

    public volatile void remove()
    {
        super.remove();
    }

    public volatile void set(Object obj)
    {
        super.set(obj);
    }

    static 
    {
        RESETTABLE_INSTANCE = new EmptyIterator();
        INSTANCE = RESETTABLE_INSTANCE;
    }
}
