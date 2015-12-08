// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a;

import java.util.Iterator;

// Referenced classes of package com.c.a.a:
//            ab, r

final class ae
    implements Iterable
{

    final CharSequence a;
    final ab b;

    ae(ab ab1, CharSequence charsequence)
    {
        b = ab1;
        a = charsequence;
        super();
    }

    public final Iterator iterator()
    {
        return ab.a(b, a);
    }

    public final String toString()
    {
        return r.a(", ").a(new StringBuilder("["), iterator()).append(']').toString();
    }
}
