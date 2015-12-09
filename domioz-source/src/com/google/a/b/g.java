// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Iterator;
import java.util.Map;

// Referenced classes of package com.google.a.b:
//            cf, f, z, h, 
//            e

final class g extends cf
{

    final f a;

    g(f f1)
    {
        a = f1;
        super();
    }

    final Map a()
    {
        return a;
    }

    public final boolean contains(Object obj)
    {
        return z.a(a.a.entrySet(), obj);
    }

    public final Iterator iterator()
    {
        return new h(a);
    }

    public final boolean remove(Object obj)
    {
        if (!contains(obj))
        {
            return false;
        } else
        {
            obj = (java.util.Map.Entry)obj;
            e.a(a.b, ((java.util.Map.Entry) (obj)).getKey());
            return true;
        }
    }
}
