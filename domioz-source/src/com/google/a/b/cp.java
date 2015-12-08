// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.ListIterator;

// Referenced classes of package com.google.a.b:
//            ak, ar, am, dj

final class cp extends ak
{

    private final am a;
    private final ar b;

    private cp(am am, ar ar1)
    {
        a = am;
        b = ar1;
    }

    cp(am am, Object aobj[])
    {
        this(am, ar.b(aobj));
    }

    final int a(Object aobj[], int i)
    {
        return b.a(aobj, i);
    }

    public final dj a(int i)
    {
        return b.a(i);
    }

    final am c()
    {
        return a;
    }

    public final Object get(int i)
    {
        return b.get(i);
    }

    public final ListIterator listIterator(int i)
    {
        return a(i);
    }
}
