// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.br;

import com.google.android.m4b.maps.cc.h;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.m4b.maps.br:
//            e

public static final class c
    implements Iterator
{

    private final ArrayList a;
    private final int b;
    private int c;

    public final h a()
    {
        Object obj = a;
        int i = c;
        c = i + 1;
        obj = (h)((ArrayList) (obj)).get(i);
        for (; c < b && a.get(c) == null; c = c + 1) { }
        return ((h) (obj));
    }

    public final boolean hasNext()
    {
        return c < b;
    }

    public final Object next()
    {
        return a();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }

    public tion(ArrayList arraylist)
    {
        a = arraylist;
        b = arraylist.size();
        for (c = 0; c < b && a.get(c) == null; c = c + 1) { }
    }
}
