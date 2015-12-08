// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableCollection, $UnmodifiableIterator

private static class elements extends $ImmutableCollection
{

    private final Object elements[];

    public boolean isEmpty()
    {
        return false;
    }

    public $UnmodifiableIterator iterator()
    {
        return new $UnmodifiableIterator() {

            int i;
            final .ImmutableCollection.ArrayImmutableCollection this$0;

            public boolean hasNext()
            {
                return i < elements.length;
            }

            public Object next()
            {
                if (!hasNext())
                {
                    throw new NoSuchElementException();
                } else
                {
                    Object aobj[] = elements;
                    int j = i;
                    i = j + 1;
                    return aobj[j];
                }
            }

            
            {
                this$0 = .ImmutableCollection.ArrayImmutableCollection.this;
                super();
                i = 0;
            }
        };
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return elements.length;
    }


    _cls1.i(Object aobj[])
    {
        elements = aobj;
    }
}
