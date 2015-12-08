// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.AbstractSet;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            w, ab

final class aa extends AbstractSet
{

    final w a;

    aa(w w1)
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
        return a.containsKey(obj);
    }

    public Iterator iterator()
    {
        return new ab(this);
    }

    public boolean remove(Object obj)
    {
        return a.b(obj) != null;
    }

    public int size()
    {
        return a.c;
    }
}
