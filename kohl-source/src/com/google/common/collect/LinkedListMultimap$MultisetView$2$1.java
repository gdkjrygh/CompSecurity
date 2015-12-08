// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Multiset

class val.keyIterator
    implements Iterator
{

    final val.keyIterator this$2;
    final Iterator val$keyIterator;

    public boolean hasNext()
    {
        return val$keyIterator.hasNext();
    }

    public val.keyIterator next()
    {
        return new Multisets.AbstractEntry() {

            final LinkedListMultimap.MultisetView._cls2._cls1 this$3;
            final Object val$key;

            public int getCount()
            {
                return LinkedListMultimap.access$500(this$0).count(key);
            }

            public Object getElement()
            {
                return key;
            }

            
            {
                this$3 = LinkedListMultimap.MultisetView._cls2._cls1.this;
                key = obj;
                super();
            }
        };
    }

    public volatile Object next()
    {
        return next();
    }

    public void remove()
    {
        val$keyIterator.remove();
    }

    is._cls1()
    {
        this$2 = final__pcls1;
        val$keyIterator = Iterator.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/LinkedListMultimap$MultisetView$2

/* anonymous class */
    class LinkedListMultimap.MultisetView._cls2 extends AbstractSet
    {

        final LinkedListMultimap.MultisetView this$1;

        public Iterator iterator()
        {
            return (new LinkedListMultimap.DistinctKeyIterator(this$0, null)). new LinkedListMultimap.MultisetView._cls2._cls1();
        }

        public int size()
        {
            return LinkedListMultimap.access$500(this$0).elementSet().size();
        }

            
            {
                this$1 = LinkedListMultimap.MultisetView.this;
                super();
            }
    }

}
