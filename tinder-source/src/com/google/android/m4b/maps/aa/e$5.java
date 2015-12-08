// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            x, e

static final class nit> extends x
{

    private Iterator a;

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        return a.next();
    }

    (Iterator iterator)
    {
        a = iterator;
        super();
    }
}
