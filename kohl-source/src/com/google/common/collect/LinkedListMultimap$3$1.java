// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Multiset

class val.nodes
    implements Iterator
{

    final val.nodes this$1;
    final Iterator val$nodes;

    public boolean hasNext()
    {
        return val$nodes.hasNext();
    }

    public Object next()
    {
        return (()val$nodes.next()).value;
    }

    public void remove()
    {
        val$nodes.remove();
    }

    is._cls0()
    {
        this$1 = final__pcls0;
        val$nodes = Iterator.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/LinkedListMultimap$3

/* anonymous class */
    class LinkedListMultimap._cls3 extends AbstractCollection
    {

        final LinkedListMultimap this$0;

        public Iterator iterator()
        {
            return (new LinkedListMultimap.NodeIterator(LinkedListMultimap.this, null)). new LinkedListMultimap._cls3._cls1();
        }

        public int size()
        {
            return LinkedListMultimap.access$500(LinkedListMultimap.this).size();
        }

            
            {
                this$0 = LinkedListMultimap.this;
                super();
            }
    }

}
