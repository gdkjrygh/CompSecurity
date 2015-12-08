// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Iterables, Iterators

class atStart
    implements Iterator
{

    boolean atStart;
    final val.iterator this$0;
    final Iterator val$iterator;

    public boolean hasNext()
    {
        return val$iterator.hasNext();
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        Object obj = val$iterator.next();
        atStart = false;
        return obj;
        Exception exception;
        exception;
        atStart = false;
        throw exception;
    }

    public void remove()
    {
        if (atStart)
        {
            throw new IllegalStateException();
        } else
        {
            val$iterator.remove();
            return;
        }
    }

    bleWithToString()
    {
        this$0 = final_blewithtostring;
        val$iterator = Iterator.this;
        super();
        atStart = true;
    }

    // Unreferenced inner class com/google/common/collect/Iterables$11

/* anonymous class */
    static final class Iterables._cls11 extends Iterables.IterableWithToString
    {

        final Iterable val$iterable;
        final int val$numberToSkip;

        public Iterator iterator()
        {
            Iterator iterator1 = iterable.iterator();
            Iterators.skip(iterator1, numberToSkip);
            return iterator1. new Iterables._cls11._cls1();
        }

            
            {
                iterable = iterable1;
                numberToSkip = i;
                super();
            }
    }

}
