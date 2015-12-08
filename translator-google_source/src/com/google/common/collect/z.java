// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.collect:
//            w

final class z extends AbstractCollection
{

    final w a;

    z(w w1)
    {
        a = w1;
        super();
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        return a.containsValue(obj);
    }

    public final Iterator iterator()
    {
        return a.valueIterator();
    }

    public final int size()
    {
        return a.size();
    }
}
