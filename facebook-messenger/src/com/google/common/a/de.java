// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.common.a:
//            bj, dc

final class de extends AbstractCollection
{

    final bj a;

    de(bj bj1)
    {
        a = bj1;
        super();
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        return a.containsValue(obj);
    }

    public boolean isEmpty()
    {
        return a.isEmpty();
    }

    public Iterator iterator()
    {
        return new dc(a);
    }

    public int size()
    {
        return a.size();
    }
}
