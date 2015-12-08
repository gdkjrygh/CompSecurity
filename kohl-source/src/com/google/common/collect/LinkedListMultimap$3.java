// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Multiset

class this._cls0 extends AbstractCollection
{

    final LinkedListMultimap this$0;

    public Iterator iterator()
    {
        return new Iterator() {

            final LinkedListMultimap._cls3 this$1;
            final Iterator val$nodes;

            public boolean hasNext()
            {
                return nodes.hasNext();
            }

            public Object next()
            {
                return ((LinkedListMultimap.Node)nodes.next()).value;
            }

            public void remove()
            {
                nodes.remove();
            }

            
            {
                this$1 = LinkedListMultimap._cls3.this;
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
