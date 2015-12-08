// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.e;
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
        if (obj instanceof java.util.ntry)
        {
            obj = (java.util.ntry)obj;
            Object obj1 = ((java.util.ntry) (obj)).getKey();
            if (obj1 != null)
            {
                obj1 = a.get(obj1);
                if (obj1 != null && a.c.a(((java.util.ntry) (obj)).getValue(), obj1))
                {
                    return true;
                }
            }
        }
        return false;
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
        if (obj instanceof java.util.ntry)
        {
            obj = (java.util.ntry)obj;
            Object obj1 = ((java.util.ntry) (obj)).getKey();
            if (obj1 != null && a.remove(obj1, ((java.util.ntry) (obj)).getValue()))
            {
                return true;
            }
        }
        return false;
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
