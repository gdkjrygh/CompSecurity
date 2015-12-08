// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.common.collect;

import com.google.common.base.p;
import java.util.Iterator;
import java.util.NoSuchElementException;

final class bp
    implements Iterator
{

    bp()
    {
    }

    public final boolean hasNext()
    {
        return false;
    }

    public final Object next()
    {
        throw new NoSuchElementException();
    }

    public final void remove()
    {
        p.b(false, "no calls to next() since the last call to remove()");
    }
}
