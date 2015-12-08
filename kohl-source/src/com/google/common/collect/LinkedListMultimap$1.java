// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.ListIterator;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Iterators, Multiset

class val.key extends AbstractSequentialList
{

    final LinkedListMultimap this$0;
    final Object val$key;

    public ListIterator listIterator(int i)
    {
        return new lueForKeyIterator(LinkedListMultimap.this, val$key, i);
    }

    public boolean removeAll(Collection collection)
    {
        return Iterators.removeAll(iterator(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return Iterators.retainAll(iterator(), collection);
    }

    public int size()
    {
        return LinkedListMultimap.access$500(LinkedListMultimap.this).count(val$key);
    }

    lueForKeyIterator()
    {
        this$0 = final_linkedlistmultimap;
        val$key = Object.this;
        super();
    }
}
