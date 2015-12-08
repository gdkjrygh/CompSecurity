// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.optional;

import java.util.Iterator;

final class val.optionals
    implements Iterable
{

    final Iterable val$optionals;

    public final Iterator iterator()
    {
        class _cls1 extends AbstractIterator
        {

            private final Iterator iterator;
            final Optional._cls1 this$0;

            protected Object computeNext()
            {
                while (iterator.hasNext()) 
                {
                    Optional optional = (Optional)iterator.next();
                    if (optional.isPresent())
                    {
                        return optional.get();
                    }
                }
                return endOfData();
            }

            _cls1()
            {
                this$0 = Optional._cls1.this;
                super();
                iterator = (Iterator)Preconditions.checkNotNull(optionals.iterator());
            }
        }

        return new _cls1();
    }

    _cls1()
    {
        val$optionals = iterable;
        super();
    }
}
