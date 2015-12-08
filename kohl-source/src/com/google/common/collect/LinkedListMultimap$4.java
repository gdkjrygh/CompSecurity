// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Multiset, AbstractMapEntry

class this._cls0 extends AbstractCollection
{

    final LinkedListMultimap this$0;

    public Iterator iterator()
    {
        return new Iterator() {

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
                return ((LinkedListMultimap.Node)nodes.next()). new AbstractMapEntry() {

                    final _cls1 this$2;
                    final LinkedListMultimap.Node val$node;

                    public Object getKey()
                    {
                        return node.key;
                    }

                    public Object getValue()
                    {
                        return node.value;
                    }

                    public Object setValue(Object obj)
                    {
                        Object obj1 = node.value;
                        node.value = obj;
                        return obj1;
                    }

            
            {
                this$2 = final__pcls1;
                node = LinkedListMultimap.Node.this;
                super();
            }
                };
            }

            public void remove()
            {
                nodes.remove();
            }

            
            {
                this$1 = LinkedListMultimap._cls4.this;
                nodes = iterator1;
                super();
            }
        };
    }

    public int size()
    {
        return LinkedListMultimap.access$500(LinkedListMultimap.this).size();
    }

    _cls1.val.nodes()
    {
        this$0 = LinkedListMultimap.this;
        super();
    }
}
