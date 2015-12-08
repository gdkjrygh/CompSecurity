// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, LinkedListMultimap

class val.key extends AbstractMapEntry
{

    final val.key this$2;
    final Object val$key;

    public Object getKey()
    {
        return val$key;
    }

    public volatile Object getValue()
    {
        return getValue();
    }

    public Collection getValue()
    {
        return get(val$key);
    }

    l.keyIterator()
    {
        this$2 = final_keyiterator;
        val$key = Object.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/LinkedListMultimap$AsMapEntries$1

/* anonymous class */
    class LinkedListMultimap.AsMapEntries._cls1
        implements Iterator
    {

        final LinkedListMultimap.AsMapEntries this$1;
        final Iterator val$keyIterator;

        public boolean hasNext()
        {
            return keyIterator.hasNext();
        }

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            return ((LinkedListMultimap.AsMapEntries._cls1._cls1) (keyIterator.next())). new LinkedListMultimap.AsMapEntries._cls1._cls1();
        }

        public void remove()
        {
            keyIterator.remove();
        }

            
            {
                this$1 = final_asmapentries;
                keyIterator = Iterator.this;
                super();
            }
    }

}
