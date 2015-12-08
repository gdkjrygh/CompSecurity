// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bd

static final class nit> extends bd
{

    private Iterable b;

    public final Iterator iterator()
    {
        return b.iterator();
    }

    (Iterable iterable, Iterable iterable1)
    {
        b = iterable1;
        super(iterable);
    }
}
