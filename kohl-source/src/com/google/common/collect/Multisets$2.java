// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            AbstractMultiset, Multisets, Multiset, Sets, 
//            AbstractIterator

static final class iset extends AbstractMultiset
{

    final Set entrySet = new AbstractSet() {

        final Multisets._cls2 this$0;

        public boolean contains(Object obj)
        {
            boolean flag1 = false;
            boolean flag = flag1;
            if (obj instanceof Multiset.Entry)
            {
                obj = (Multiset.Entry)obj;
                int i = ((Multiset.Entry) (obj)).getCount();
                flag = flag1;
                if (i > 0)
                {
                    flag = flag1;
                    if (count(((Multiset.Entry) (obj)).getElement()) == i)
                    {
                        flag = true;
                    }
                }
            }
            return flag;
        }

        public boolean isEmpty()
        {
            return elementSet().isEmpty();
        }

        public Iterator iterator()
        {
            return multiset1.entrySet().iterator(). new AbstractIterator() {

                final _cls1 this$1;
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
                this$1 = final__pcls1;
                iterator1 = Iterator.this;
                super();
            }
            };
        }

        public int size()
        {
            return elementSet().size();
        }

            
            {
                this$0 = Multisets._cls2.this;
                super();
            }
    };
    final Multiset val$multiset1;
    final Multiset val$multiset2;

    public int count(Object obj)
    {
        int i = val$multiset1.count(obj);
        if (i == 0)
        {
            return 0;
        } else
        {
            return Math.min(i, val$multiset2.count(obj));
        }
    }

    Set createElementSet()
    {
        return Sets.intersection(val$multiset1.elementSet(), val$multiset2.elementSet());
    }

    public Set entrySet()
    {
        return entrySet;
    }

    _cls1.this._cls0(Multiset multiset, Multiset multiset3)
    {
        val$multiset1 = multiset;
        val$multiset2 = multiset3;
        super();
    }
}
