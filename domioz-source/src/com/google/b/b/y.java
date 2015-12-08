// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.b.b;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.b.b:
//            w, z

final class y extends AbstractSet
{

    final w a;

    y(w w1)
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
        return (obj instanceof java.util.Map.Entry) && a.a((java.util.Map.Entry)obj) != null;
    }

    public final Iterator iterator()
    {
        return new z(this);
    }

    public final boolean remove(Object obj)
    {
        if (obj instanceof java.util.Map.Entry)
        {
            if ((obj = a.a((java.util.Map.Entry)obj)) != null)
            {
                a.a(((ad) (obj)), true);
                return true;
            }
        }
        return false;
    }

    public final int size()
    {
        return a.c;
    }
}
