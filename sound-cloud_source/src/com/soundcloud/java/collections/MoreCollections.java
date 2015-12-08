// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import com.soundcloud.java.checks.Preconditions;
import com.soundcloud.java.functions.Function;
import com.soundcloud.java.functions.Predicate;
import com.soundcloud.java.functions.Predicates;
import com.soundcloud.java.strings.Joiner;
import com.soundcloud.java.strings.Strings;
import java.util.Collection;

// Referenced classes of package com.soundcloud.java.collections:
//            Iterables, FilteredCollection, TransformedCollection

public final class MoreCollections
{

    static final Joiner STANDARD_JOINER = Strings.joinOn(", ").useForNull("null");

    private MoreCollections()
    {
    }

    static Collection cast(Iterable iterable)
    {
        return (Collection)iterable;
    }

    static boolean containsAllImpl(Collection collection, Collection collection1)
    {
        return Iterables.all(collection1, Predicates.in(collection));
    }

    public static Collection filter(Collection collection, Predicate predicate)
    {
        if (collection instanceof FilteredCollection)
        {
            return ((FilteredCollection)collection).createCombined(predicate);
        } else
        {
            return new FilteredCollection((Collection)Preconditions.checkNotNull(collection), (Predicate)Preconditions.checkNotNull(predicate));
        }
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
