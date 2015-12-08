// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableSet, $Lists, $Preconditions

public static class 
{

    final ArrayList contents = $Lists.newArrayList();

    public  add(Object obj)
    {
        $Preconditions.checkNotNull(obj, "element cannot be null");
        contents.add(obj);
        return this;
    }

    public transient contents add(Object aobj[])
    {
        $Preconditions.checkNotNull(((Object) (aobj)), "elements cannot be null");
        aobj = Arrays.asList(aobj);
        $Preconditions.checkContentsNotNull(((Iterable) (aobj)), "elements cannot contain null");
        contents.addAll(((Collection) (aobj)));
        return this;
    }

    public contents addAll(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            contents.ensureCapacity(contents.size() + collection.size());
        }
        Object obj;
        for (iterable = iterable.iterator(); iterable.hasNext(); contents.add(obj))
        {
            obj = iterable.next();
            $Preconditions.checkNotNull(obj, "elements contains a null");
        }

        return this;
    }

    public tNull addAll(Iterator iterator)
    {
        Object obj;
        for (; iterator.hasNext(); contents.add(obj))
        {
            obj = iterator.next();
            $Preconditions.checkNotNull(obj, "element cannot be null");
        }

        return this;
    }

    public $ImmutableSet build()
    {
        return $ImmutableSet.copyOf(contents);
    }

    public ()
    {
    }
}
