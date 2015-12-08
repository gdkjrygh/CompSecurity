// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Multiset

class val.key extends val.key
{

    final val.key this$3;
    final Object val$key;

    public int getCount()
    {
        return LinkedListMultimap.access$500().count(val$key);
    }

    public Object getElement()
    {
        return val$key;
    }

    ._cls1()
    {
        this$3 = final__pcls1;
        val$key = Object.this;
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


    // Unreferenced inner class com/google/common/collect/LinkedListMultimap$MultisetView$2$1

/* anonymous class */
    class LinkedListMultimap.MultisetView._cls2._cls1
        implements Iterator
    {

        final LinkedListMultimap.MultisetView._cls2 this$2;
        final Iterator val$keyIterator;

        public boolean hasNext()
        {
            return keyIterator.hasNext();
        }

        public Multiset.Entry next()
        {
            return ((LinkedListMultimap.MultisetView._cls2._cls1._cls1) (keyIterator.next())). new LinkedListMultimap.MultisetView._cls2._cls1._cls1();
        }

        public volatile Object next()
        {
            return next();
        }

        public void remove()
        {
            keyIterator.remove();
        }

            
            {
                this$2 = final__pcls2;
                keyIterator = Iterator.this;
                super();
            }
    }

}
