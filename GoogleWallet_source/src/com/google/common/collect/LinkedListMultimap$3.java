// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSequentialList;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, TransformedListIterator

final class this._cls0 extends AbstractSequentialList
{

    final LinkedListMultimap this$0;

    public final ListIterator listIterator(int i)
    {
        final deIterator final_listiterator = new deIterator(LinkedListMultimap.this, i);
        return new TransformedListIterator(final_listiterator) {

            final LinkedListMultimap._cls3 this$1;
            final LinkedListMultimap.NodeIterator val$nodeItr;

            private static Object transform(java.util.Map.Entry entry)
            {
                return entry.getValue();
            }

            public final void set(Object obj)
            {
                nodeItr.setValue(obj);
            }

            final volatile Object transform(Object obj)
            {
                return transform((java.util.Map.Entry)obj);
            }

            
            {
                this$1 = LinkedListMultimap._cls3.this;
                nodeItr = nodeiterator;
                super(final_listiterator);
            }
        };
    }

    public final int size()
    {
        return LinkedListMultimap.access$900(LinkedListMultimap.this);
    }

    or()
    {
        this$0 = LinkedListMultimap.this;
        super();
    }
}
