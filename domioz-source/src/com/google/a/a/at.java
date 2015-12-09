// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.a;

import java.util.Iterator;

// Referenced classes of package com.google.a.a:
//            ao, w

final class at
    implements Iterable
{

    final CharSequence a;
    final ao b;

    at(ao ao1, CharSequence charsequence)
    {
        b = ao1;
        a = charsequence;
        super();
    }

    public final Iterator iterator()
    {
        return ao.a(b, a);
    }

    public final String toString()
    {
        return w.a(", ").a(new StringBuilder("["), iterator()).append(']').toString();
    }
}
