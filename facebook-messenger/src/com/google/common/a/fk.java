// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.ArrayList;
import java.util.Collection;

// Referenced classes of package com.google.common.a:
//            eo, hq, fi, em

public class fk extends eo
{

    final ArrayList a = hq.a();

    public fk()
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

    public fi b()
    {
        return fi.a(a);
    }

    public fk b(Iterable iterable)
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

    public fk b(Object obj)
    {
        a.add(Preconditions.checkNotNull(obj));
        return this;
    }

    public transient fk b(Object aobj[])
    {
        a.ensureCapacity(a.size() + aobj.length);
        super.a(aobj);
        return this;
    }
}
