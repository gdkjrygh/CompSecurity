// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.ae;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            ah, bl

final class bj extends ah
{

    final Iterable a;
    final ae b;

    bj(Iterable iterable, ae ae)
    {
        a = iterable;
        b = ae;
        super();
    }

    public final Iterator iterator()
    {
        return bl.a(a.iterator(), b);
    }
}
