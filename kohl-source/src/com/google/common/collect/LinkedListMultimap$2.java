// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.collect:
//            LinkedListMultimap, Multiset

class this._cls0 extends AbstractSet
{

    final LinkedListMultimap this$0;

    public boolean contains(Object obj)
    {
        return LinkedListMultimap.access$500(LinkedListMultimap.this).contains(obj);
    }

    public Iterator iterator()
    {
        return new stinctKeyIterator(LinkedListMultimap.this, null);
    }

    public boolean removeAll(Collection collection)
    {
        Preconditions.checkNotNull(collection);
        return super.removeAll(collection);
    }

    public int size()
    {
        return LinkedListMultimap.access$500(LinkedListMultimap.this).elementSet().size();
    }

    stinctKeyIterator()
    {
        this$0 = LinkedListMultimap.this;
        super();
    }
}
