// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.c.d;

import java.util.Enumeration;
import java.util.Iterator;

final class e
    implements Iterator
{

    private Enumeration a;

    public e(Enumeration enumeration)
    {
        a = enumeration;
    }

    public final boolean hasNext()
    {
        return a.hasMoreElements();
    }

    public final Object next()
    {
        return a.nextElement();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Not supported");
    }
}
