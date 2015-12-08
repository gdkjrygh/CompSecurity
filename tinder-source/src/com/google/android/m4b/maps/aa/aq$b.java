// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Comparator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            aq

static final class b
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private Comparator a;
    private Object b[];

    final Object readResolve()
    {
        return (new <init>(a)).c((Object[])b).b();
    }

    public (Comparator comparator, Object aobj[])
    {
        a = comparator;
        b = aobj;
    }
}
