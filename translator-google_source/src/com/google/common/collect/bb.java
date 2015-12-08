// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            de, Lists, Ordering, ImmutableMultimap, 
//            af

public class bb
{

    de a;
    Comparator b;
    Comparator c;

    public bb()
    {
        a = new ImmutableMultimap.BuilderMultimap();
    }

    public ImmutableMultimap b()
    {
        if (c != null)
        {
            for (Iterator iterator = a.asMap().values().iterator(); iterator.hasNext(); Collections.sort((List)(Collection)iterator.next(), c)) { }
        }
        if (b != null)
        {
            ImmutableMultimap.BuilderMultimap buildermultimap = new ImmutableMultimap.BuilderMultimap();
            Object obj = Lists.a(a.asMap().entrySet());
            Collections.sort(((List) (obj)), Ordering.from(b).onKeys());
            java.util.Map.Entry entry;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); buildermultimap.putAll(entry.getKey(), (Iterable)entry.getValue()))
            {
                entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            }

            a = buildermultimap;
        }
        return ImmutableMultimap.copyOf(a);
    }

    public bb b(Object obj, Object obj1)
    {
        af.a(obj, obj1);
        a.put(obj, obj1);
        return this;
    }
}
