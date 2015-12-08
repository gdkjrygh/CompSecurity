// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            ImmutableList, Lists, ImmutableCollection

public static final class ilder extends ilder
{

    private final ArrayList contents = Lists.newArrayList();

    public volatile ilder add(Object obj)
    {
        return add(obj);
    }

    public volatile ilder add(Object aobj[])
    {
        return add(aobj);
    }

    public add add(Object obj)
    {
        contents.add(Preconditions.checkNotNull(obj));
        return this;
    }

    public transient l add(Object aobj[])
    {
        contents.ensureCapacity(contents.size() + aobj.length);
        super.add(aobj);
        return this;
    }

    public volatile ilder addAll(Iterable iterable)
    {
        return addAll(iterable);
    }

    public volatile ilder addAll(Iterator iterator)
    {
        return addAll(iterator);
    }

    public addAll addAll(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            contents.ensureCapacity(contents.size() + collection.size());
        }
        super.addAll(iterable);
        return this;
    }

    public ilder.addAll addAll(Iterator iterator)
    {
        super.addAll(iterator);
        return this;
    }

    public volatile ImmutableCollection build()
    {
        return build();
    }

    public ImmutableList build()
    {
        return ImmutableList.copyOf(contents);
    }

    public ilder()
    {
    }
}
