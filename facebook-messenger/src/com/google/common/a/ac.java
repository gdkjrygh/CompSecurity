// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.common.a:
//            im, ab, ax, ad, 
//            x

class ac extends im
{

    final ab a;

    ac(ab ab1)
    {
        a = ab1;
        super();
    }

    Map a()
    {
        return a;
    }

    public boolean contains(Object obj)
    {
        return ax.a(a.a.entrySet(), obj);
    }

    public Iterator iterator()
    {
        return new ad(a);
    }

    public boolean remove(Object obj)
    {
        if (!contains(obj))
        {
            return false;
        } else
        {
            obj = (java.util.Map.Entry)obj;
            x.a(a.c, ((java.util.Map.Entry) (obj)).getKey());
            return true;
        }
    }
}
