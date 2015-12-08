// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.base.Preconditions;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            CollectPreconditions, Iterators

public final class Collections2
{
    static final class TransformedCollection extends AbstractCollection
    {

        final Collection fromCollection;
        final Function function;

        public final void clear()
        {
            fromCollection.clear();
        }

        public final boolean isEmpty()
        {
            return fromCollection.isEmpty();
        }

        public final Iterator iterator()
        {
            return Iterators.transform(fromCollection.iterator(), function);
        }

        public final int size()
        {
            return fromCollection.size();
        }

        TransformedCollection(Collection collection, Function function1)
        {
            fromCollection = (Collection)Preconditions.checkNotNull(collection);
            function = (Function)Preconditions.checkNotNull(function1);
        }
    }


    static final Joiner STANDARD_JOINER = Joiner.on(", ").useForNull("null");

    static Collection cast(Iterable iterable)
    {
        return (Collection)iterable;
    }

    static StringBuilder newStringBuilderForCollection(int i)
    {
        CollectPreconditions.checkNonnegative(i, "size");
        return new StringBuilder((int)Math.min((long)i << 3, 0x40000000L));
    }

    static boolean safeContains(Collection collection, Object obj)
    {
        Preconditions.checkNotNull(collection);
        boolean flag;
        try
        {
            flag = collection.contains(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return false;
        }
        return flag;
    }

    public static Collection transform(Collection collection, Function function)
    {
        return new TransformedCollection(collection, function);
    }

}
