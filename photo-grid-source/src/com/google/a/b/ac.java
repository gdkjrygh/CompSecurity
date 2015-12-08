// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.AbstractCollection;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            v, ad

final class ac extends AbstractCollection
{

    final v a;

    private ac(v v1)
    {
        a = v1;
        super();
    }

    ac(v v1, byte byte0)
    {
        this(v1);
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
        return new ad(this);
    }

    public final int size()
    {
        return v.b(a);
    }
}
