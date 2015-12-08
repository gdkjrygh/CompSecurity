// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            w, z

class y extends AbstractSet
{

    final w a;

    y(w w1)
    {
        a = w1;
        super();
    }

    public void clear()
    {
        a.clear();
    }

    public boolean contains(Object obj)
    {
        return (obj instanceof java.util.Map.Entry) && a.a((java.util.Map.Entry)obj) != null;
    }

    public Iterator iterator()
    {
        return new z(this);
    }

    public boolean remove(Object obj)
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

    public int size()
    {
        return a.c;
    }
}
