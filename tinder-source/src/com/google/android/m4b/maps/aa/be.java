// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.ListIterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            y, ae, aa, as

class be extends y
{

    private final aa b;
    private final ae c;

    be(aa aa, ae ae1)
    {
        b = aa;
        c = ae1;
    }

    be(aa aa, Object aobj[])
    {
        this(aa, ae.b(aobj, aobj.length));
    }

    final int a(Object aobj[], int i)
    {
        return c.a(aobj, i);
    }

    public final as a(int i)
    {
        return c.a(i);
    }

    public Object get(int i)
    {
        return c.get(i);
    }

    aa h()
    {
        return b;
    }

    public ListIterator listIterator(int i)
    {
        return a(i);
    }
}
