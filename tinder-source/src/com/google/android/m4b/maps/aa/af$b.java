// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.io.Serializable;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            af, al

static class b
    implements Serializable
{

    private static final long serialVersionUID = 0L;
    private final Object a[];
    private final Object b[];

    final Object a(b b1)
    {
        for (int i = 0; i < a.length; i++)
        {
            b1.a(a[i], b[i]);
        }

        return b1.a();
    }

    Object readResolve()
    {
        return a(new <init>());
    }

    (af af1)
    {
        a = new Object[af1.size()];
        b = new Object[af1.size()];
        af1 = af1.f().iterator();
        for (int i = 0; af1.hasNext(); i++)
        {
            java.util.ntry ntry = (java.util.ntry)af1.next();
            a[i] = ntry.getKey();
            b[i] = ntry.getValue();
        }

    }
}
