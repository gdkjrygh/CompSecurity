// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.common.collect:
//            Iterables, Iterators

static final class rableWithToString extends rableWithToString
{

    final Iterable val$iterable;
    final int val$numberToSkip;

    public Iterator iterator()
    {
        final Iterator iterator = val$iterable.iterator();
        Iterators.skip(iterator, val$numberToSkip);
        return new Iterator() {

            boolean atStart;
            final Iterables._cls11 this$0;
            final Iterator val$iterator;

            public boolean hasNext()
            {
                return iterator.hasNext();
            }

            public Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                }
                Object obj = iterator.next();
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
                    iterator.remove();
                    return;
                }
            }

            
            {
                this$0 = Iterables._cls11.this;
                iterator = iterator1;
                super();
                atStart = true;
            }
        };
    }

    _cls1.atStart(Iterable iterable1, int i)
    {
        val$iterable = iterable1;
        val$numberToSkip = i;
        super();
    }
}
