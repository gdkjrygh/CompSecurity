// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            bb, de, Lists, Ordering, 
//            ImmutableSetMultimap, ImmutableMultimap

public final class bh extends bb
{

    public bh()
    {
        a = new ImmutableSetMultimap.BuilderMultimap();
    }

    public final ImmutableSetMultimap a()
    {
        if (b != null)
        {
            ImmutableSetMultimap.BuilderMultimap buildermultimap = new ImmutableSetMultimap.BuilderMultimap();
            Object obj = Lists.a(a.asMap().entrySet());
            Collections.sort(((List) (obj)), Ordering.from(b).onKeys());
            java.util.Map.Entry entry;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); buildermultimap.putAll(entry.getKey(), (Iterable)entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            }

            a = buildermultimap;
        }
        return ImmutableSetMultimap.access$000(a, c);
    }

    public final bh a(Object obj, Object obj1)
    {
        a.put(p.a(obj), p.a(obj1));
        return this;
    }

    public final ImmutableMultimap b()
    {
        return a();
    }

    public final bb b(Object obj, Object obj1)
    {
        return a(obj, obj1);
    }
}
