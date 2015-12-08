// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.inject.internal.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.inject.internal.util:
//            $ImmutableList, $Lists, $Preconditions

public static class 
{

    private final ArrayList contents = $Lists.newArrayList();

    public  add(Object obj)
    {
        $Preconditions.checkNotNull(obj, "element cannot be null");
        contents.add(obj);
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

    public $ImmutableList build()
    {
        return $ImmutableList.copyOf(contents);
    }

    public ()
    {
    }
}
