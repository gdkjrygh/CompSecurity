// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ad;
import com.google.a.a.t;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            bl

final class aa extends AbstractCollection
{

    final Collection a;
    final t b;

    aa(Collection collection, t t1)
    {
        a = (Collection)ad.a(collection);
        b = (t)ad.a(t1);
    }

    public final void clear()
    {
        a.clear();
    }

    public final boolean isEmpty()
    {
        return a.isEmpty();
    }

    public final Iterator iterator()
    {
        return bl.a(a.iterator(), b);
    }

    public final int size()
    {
        return a.size();
    }
}
