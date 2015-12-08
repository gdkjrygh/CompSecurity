// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.y;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.y:
//            n, g

public final class a
    implements Iterable
{

    private CharSequence a;
    private n b;

    public final Iterator iterator()
    {
        n n1 = b;
        CharSequence charsequence = a;
        return n1.c.a(n1, charsequence);
    }

    public final String toString()
    {
        return g.a(", ").a(new StringBuilder("["), iterator()).append(']').toString();
    }

    public (n n1, CharSequence charsequence)
    {
        b = n1;
        a = charsequence;
        super();
    }
}
