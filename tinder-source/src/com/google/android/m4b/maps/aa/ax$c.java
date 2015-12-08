// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Set;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ax

static abstract class  extends AbstractMap
{

    private transient Set a;
    private transient Set b;
    private transient Collection c;

    abstract Set a();

    Set b()
    {
        return new <init>(this);
    }

    public Set entrySet()
    {
        Set set1 = a;
        Set set = set1;
        if (set1 == null)
        {
            set = a();
            a = set;
        }
        return set;
    }

    public Set keySet()
    {
        Set set1 = b;
        Set set = set1;
        if (set1 == null)
        {
            set = b();
            b = set;
        }
        return set;
    }

    public Collection values()
    {
        Collection collection = c;
        Object obj = collection;
        if (collection == null)
        {
            obj = new <init>(this);
            c = ((Collection) (obj));
        }
        return ((Collection) (obj));
    }

    ()
    {
    }
}
