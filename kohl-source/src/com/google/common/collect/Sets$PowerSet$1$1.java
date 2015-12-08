// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Sets, AbstractIndexedListIterator

class val.setBits extends AbstractSet
{

    final val.setBits this$1;
    final int val$setBits;

    public Iterator iterator()
    {
        return new ilteredSetIterator(tList, val$setBits);
    }

    public int size()
    {
        return Integer.bitCount(val$setBits);
    }

    tIterator()
    {
        this$1 = final_titerator;
        val$setBits = I.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/Sets$PowerSet$1

/* anonymous class */
    class Sets.PowerSet._cls1 extends AbstractIndexedListIterator
    {

        final Sets.PowerSet this$0;

        protected volatile Object get(int i)
        {
            return get(i);
        }

        protected Set get(int i)
        {
            return i. new Sets.PowerSet._cls1._cls1();
        }

            
            {
                this$0 = Sets.PowerSet.this;
                super(i);
            }
    }

}
