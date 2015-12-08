// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bw;

import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.bw:
//            e

public static final class a
    implements Iterator
{

    private tion a;

    public final a a()
    {
        a a1 = new <init>(a.c, a.d);
        a = a.b;
        return a1;
    }

    public final boolean hasNext()
    {
        return a != null;
    }

    public final Object next()
    {
        return a();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    public tion(tion tion)
    {
        a = tion;
    }
}
