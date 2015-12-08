// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.aa;

import com.google.android.m4b.maps.y.f;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.aa:
//            bd, d, e

static final class init> extends bd
{

    private Iterable b;
    private f c;

    public final Iterator iterator()
    {
        return e.a(b.iterator(), c);
    }

    (Iterable iterable, f f)
    {
        b = iterable;
        c = f;
        super();
    }
}
