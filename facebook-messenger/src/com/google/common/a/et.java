// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.common.a:
//            eo, hq, es, em

public final class et extends eo
{

    private final ArrayList a = hq.a();

    public et()
    {
    }

    public em a()
    {
        return b();
    }

    public eo a(Iterable iterable)
    {
        return b(iterable);
    }

    public eo a(Object obj)
    {
        return b(obj);
    }

    public eo a(Object aobj[])
    {
        return b(aobj);
    }

    public es b()
    {
        return es.a(a);
    }

    public et b(Iterable iterable)
    {
        if (iterable instanceof Collection)
        {
            Collection collection = (Collection)iterable;
            ArrayList arraylist = a;
            int i = a.size();
            arraylist.ensureCapacity(collection.size() + i);
        }
        super.a(iterable);
        return this;
    }

    public et b(Object obj)
    {
        a.add(Preconditions.checkNotNull(obj));
        return this;
    }

    public transient et b(Object aobj[])
    {
        a.ensureCapacity(a.size() + aobj.length);
        super.a(aobj);
        return this;
    }
}
