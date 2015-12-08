// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            AbstractMapEntry, LinkedListMultimap, Multiset

class val.node extends AbstractMapEntry
{

    final alue this$2;
    final alue val$node;

    public Object getKey()
    {
        return val$node.ey;
    }

    public Object getValue()
    {
        return val$node.alue;
    }

    public Object setValue(Object obj)
    {
        Object obj1 = val$node.alue;
        val$node.alue = obj;
        return obj1;
    }

    ._cls0()
    {
        this$2 = final__pcls0;
        val$node = val.node.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/LinkedListMultimap$4

/* anonymous class */
    class LinkedListMultimap._cls4 extends AbstractCollection
    {

        final LinkedListMultimap this$0;

        public Iterator iterator()
        {
            return (new LinkedListMultimap.NodeIterator(LinkedListMultimap.this, null)). new LinkedListMultimap._cls4._cls1();
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


    // Unreferenced inner class com/google/common/collect/LinkedListMultimap$4$1

/* anonymous class */
    class LinkedListMultimap._cls4._cls1
        implements Iterator
    {

        final LinkedListMultimap._cls4 this$1;
        final Iterator val$nodes;

        public boolean hasNext()
        {
            return nodes.hasNext();
        }

        public volatile Object next()
        {
            return next();
        }

        public java.util.Map.Entry next()
        {
            return ((LinkedListMultimap.Node)nodes.next()). new LinkedListMultimap._cls4._cls1._cls1();
        }

        public void remove()
        {
            nodes.remove();
        }

            
            {
                this$1 = final__pcls4;
                nodes = Iterator.this;
                super();
            }
    }

}
