// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            ao

static final class mparator extends mparator
{

    private static final long serialVersionUID = 0L;
    private final Comparator a;

    final Object readResolve()
    {
        return a(new <init>(a));
    }

    (ao ao1)
    {
        super(ao1);
        a = ao1.comparator();
    }
}
