// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import com.google.a.a.t;
import java.util.Iterator;

// Referenced classes of package com.google.a.b:
//            ah, bl

final class bk extends ah
{

    final Iterable a;
    final t b;

    bk(Iterable iterable, t t)
    {
        a = iterable;
        b = t;
        super();
    }

    public final Iterator iterator()
    {
        return bl.a(a.iterator(), b);
    }
}
