// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import com.google.common.base.Preconditions;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.common.a:
//            gw, jf, hg

class gy extends AbstractSet
{

    final gw a;

    gy(gw gw1)
    {
        a = gw1;
        super();
    }

    public boolean contains(Object obj)
    {
        return gw.d(a).contains(obj);
    }

    public Iterator iterator()
    {
        return new hg(a, null);
    }

    public boolean removeAll(Collection collection)
    {
        Preconditions.checkNotNull(collection);
        return super.removeAll(collection);
    }

    public int size()
    {
        return gw.d(a).f().size();
    }
}
