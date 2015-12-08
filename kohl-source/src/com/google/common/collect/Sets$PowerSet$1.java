// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractIndexedListIterator, Sets

class istIterator extends AbstractIndexedListIterator
{

    final _cls1.val.setBits this$0;

    protected volatile Object get(int i)
    {
        return get(i);
    }

    protected Set get(final int setBits)
    {
        return new AbstractSet() {

            final Sets.PowerSet._cls1 this$1;
            final int val$setBits;

            public Iterator iterator()
            {
                return new Sets.PowerSet.BitFilteredSetIterator(inputList, setBits);
            }

            public int size()
            {
                return Integer.bitCount(setBits);
            }

            
            {
                this$1 = Sets.PowerSet._cls1.this;
                setBits = i;
                super();
            }
        };
    }

    _cls1.val.setBits(int i)
    {
        this$0 = this._cls0.this;
        super(i);
    }
}
