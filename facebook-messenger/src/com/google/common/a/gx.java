// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.a;

import java.util.AbstractSequentialList;
import java.util.Collection;
import java.util.ListIterator;

// Referenced classes of package com.google.common.a:
//            ho, gg, gw, jf

class gx extends AbstractSequentialList
{

    final Object a;
    final gw b;

    gx(gw gw1, Object obj)
    {
        b = gw1;
        a = obj;
        super();
    }

    public ListIterator listIterator(int i)
    {
        return new ho(b, a, i);
    }

    public boolean removeAll(Collection collection)
    {
        return gg.a(iterator(), collection);
    }

    public boolean retainAll(Collection collection)
    {
        return gg.b(iterator(), collection);
    }

    public int size()
    {
        return gw.d(b).a(a);
    }
}
