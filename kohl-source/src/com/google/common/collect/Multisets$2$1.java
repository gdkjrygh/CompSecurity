// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            Multiset, AbstractMultiset, Multisets, Sets, 
//            AbstractIterator

class this._cls0 extends AbstractSet
{

    final ementSet this$0;

    public boolean contains(Object obj)
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (obj instanceof )
        {
            obj = ()obj;
            int i = (() (obj)).getCount();
            flag = flag1;
            if (i > 0)
            {
                flag = flag1;
                if (unt((() (obj)).getElement()) == i)
                {
                    flag = true;
                }
            }
        }
        return flag;
    }

    public boolean isEmpty()
    {
        return ementSet().isEmpty();
    }

    public Iterator iterator()
    {
        return new AbstractIterator() {

            final Multisets._cls2._cls1 this$1;
            final Iterator val$iterator1;

            protected Multiset.Entry computeNext()
            {
                while (iterator1.hasNext()) 
                {
                    Multiset.Entry entry = (Multiset.Entry)iterator1.next();
                    Object obj = entry.getElement();
                    int i = Math.min(entry.getCount(), multiset2.count(obj));
                    if (i > 0)
                    {
                        return Multisets.immutableEntry(obj, i);
                    }
                }
                return (Multiset.Entry)endOfData();
            }

            protected volatile Object computeNext()
            {
                return computeNext();
            }

            
            {
                this$1 = Multisets._cls2._cls1.this;
                iterator1 = iterator2;
                super();
            }
        };
    }

    public int size()
    {
        return ementSet().size();
    }

    et()
    {
        this$0 = this._cls0.this;
        super();
    }

    // Unreferenced inner class com/google/common/collect/Multisets$2

/* anonymous class */
    static final class Multisets._cls2 extends AbstractMultiset
    {

        final Set entrySet = new Multisets._cls2._cls1();
        final Multiset val$multiset1;
        final Multiset val$multiset2;

        public int count(Object obj)
        {
            int i = multiset1.count(obj);
            if (i == 0)
            {
                return 0;
            } else
            {
                return Math.min(i, multiset2.count(obj));
            }
        }

        Set createElementSet()
        {
            return Sets.intersection(multiset1.elementSet(), multiset2.elementSet());
        }

        public Set entrySet()
        {
            return entrySet;
        }

            
            {
                multiset1 = multiset;
                multiset2 = multiset3;
                super();
            }
    }

}
