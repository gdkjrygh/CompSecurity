// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            be, t, bk, aq, 
//            ae, aa

final class an extends be
    implements t
{

    an(aq aq1, ae ae)
    {
        super(aq1, ae);
    }

    final ae b(int i, int j)
    {
        return (new bk(super.b(i, j), comparator())).b();
    }

    public final Comparator comparator()
    {
        return ((aq)super.h()).comparator();
    }

    public final boolean contains(Object obj)
    {
        return indexOf(obj) >= 0;
    }

    final aa h()
    {
        return (aq)super.h();
    }

    public final int indexOf(Object obj)
    {
        int i = ((aq)super.h()).d(obj);
        if (i >= 0 && get(i).equals(obj))
        {
            return i;
        } else
        {
            return -1;
        }
    }

    public final int lastIndexOf(Object obj)
    {
        return indexOf(obj);
    }
}
