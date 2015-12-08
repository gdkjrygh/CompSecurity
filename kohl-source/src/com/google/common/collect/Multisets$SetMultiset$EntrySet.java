// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multisets

class this._cls0 extends AbstractSet
{

    final _cls1.elements this$0;

    public Iterator iterator()
    {
        return new Iterator() {

            final Iterator elements;
            final Multisets.SetMultiset.EntrySet this$1;

            public boolean hasNext()
            {
                return elements.hasNext();
            }

            public Multiset.Entry next()
            {
                return Multisets.immutableEntry(elements.next(), 1);
            }

            public volatile Object next()
            {
                return next();
            }

            public void remove()
            {
                elements.remove();
            }

            
            {
                this$1 = Multisets.SetMultiset.EntrySet.this;
                super();
                elements = _flddelegate.iterator();
            }
        };
    }

    public int size()
    {
        return elements.size();
    }

    _cls1.elements()
    {
        this$0 = this._cls0.this;
        super();
    }
}
