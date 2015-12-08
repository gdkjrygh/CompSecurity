// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.collect:
//            da, d, ag, f, 
//            AbstractMapBasedMultimap

final class e extends da
{

    final d a;

    e(d d1)
    {
        a = d1;
        super();
    }

    final Map a()
    {
        return a;
    }

    public final boolean contains(Object obj)
    {
        return ag.a(a.a.entrySet(), obj);
    }

    public final Iterator iterator()
    {
        return new f(a);
    }

    public final boolean remove(Object obj)
    {
        if (!contains(obj))
        {
            return false;
        } else
        {
            obj = (java.util.Map.Entry)obj;
            AbstractMapBasedMultimap.access$400(a.b, ((java.util.Map.Entry) (obj)).getKey());
            return true;
        }
    }
}
