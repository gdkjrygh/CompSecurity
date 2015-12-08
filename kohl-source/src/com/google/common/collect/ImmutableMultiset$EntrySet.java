// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableSet, ImmutableMultiset, ImmutableMap, ObjectArrays, 
//            UnmodifiableIterator, Multisets

private static class multiset extends ImmutableSet
{

    private static final long serialVersionUID = 0L;
    final ImmutableMultiset multiset;

    public boolean contains(Object obj)
    {
        if (obj instanceof multiset)
        {
            obj = (multiset)obj;
            break MISSING_BLOCK_LABEL_12;
        }
        do
        {
            return false;
        } while (((multiset) (obj)).multiset() <= 0 || multiset.count(((multiset) (obj)).multiset()) != ((multiset) (obj)).multiset());
        return true;
    }

    public int hashCode()
    {
        return ImmutableMultiset.access$000(multiset).hashCode();
    }

    boolean isPartialView()
    {
        return multiset.isPartialView();
    }

    public UnmodifiableIterator iterator()
    {
        return new UnmodifiableIterator() {

            final ImmutableMultiset.EntrySet this$0;
            final Iterator val$mapIterator;

            public boolean hasNext()
            {
                return mapIterator.hasNext();
            }

            public Multiset.Entry next()
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)mapIterator.next();
                return Multisets.immutableEntry(entry.getKey(), ((Integer)entry.getValue()).intValue());
            }

            public volatile Object next()
            {
                return next();
            }

            
            {
                this$0 = ImmutableMultiset.EntrySet.this;
                mapIterator = iterator1;
                super();
            }
        };
    }

    public volatile Iterator iterator()
    {
        return iterator();
    }

    public int size()
    {
        return ImmutableMultiset.access$000(multiset).size();
    }

    public Object[] toArray()
    {
        return toArray(new Object[size()]);
    }

    public Object[] toArray(Object aobj[])
    {
        int i = size();
        if (aobj.length >= i) goto _L2; else goto _L1
_L1:
        Object aobj1[] = ObjectArrays.newArray(aobj, i);
_L4:
        i = 0;
        for (aobj = iterator(); ((Iterator) (aobj)).hasNext();)
        {
            aobj1[i] = (iterator)((Iterator) (aobj)).next();
            i++;
        }

        break; /* Loop/switch isn't completed */
_L2:
        aobj1 = aobj;
        if (aobj.length > i)
        {
            aobj[i] = null;
            aobj1 = aobj;
        }
        if (true) goto _L4; else goto _L3
_L3:
        return aobj1;
    }

    Object writeReplace()
    {
        return this;
    }

    public (ImmutableMultiset immutablemultiset)
    {
        multiset = immutablemultiset;
    }
}
