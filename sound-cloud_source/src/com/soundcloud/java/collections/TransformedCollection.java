// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Function;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.soundcloud.java.collections:
//            Iterators

class TransformedCollection extends AbstractCollection
{

    final Collection fromCollection;
    final Function function;

    TransformedCollection(Collection collection, Function function1)
    {
        fromCollection = (Collection)Preconditions.checkNotNull(collection);
        function = (Function)Preconditions.checkNotNull(function1);
    }

    public void clear()
    {
        fromCollection.clear();
    }

    public boolean isEmpty()
    {
        return fromCollection.isEmpty();
    }

    public Iterator iterator()
    {
        return Iterators.transform(fromCollection.iterator(), function);
    }

    public int size()
    {
        return fromCollection.size();
    }
}
