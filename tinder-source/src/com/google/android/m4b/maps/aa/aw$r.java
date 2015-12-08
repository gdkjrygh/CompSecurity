// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aw

final class a extends AbstractSet
{

    private aw a;

    public final void clear()
    {
        a.clear();
    }

    public final boolean contains(Object obj)
    {
        return a.containsKey(obj);
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return new <init>(a);
    }

    public final boolean remove(Object obj)
    {
        return a.remove(obj) != null;
    }

    public final int size()
    {
        return a.size();
    }

    (aw aw1)
    {
        a = aw1;
        super();
    }
}
