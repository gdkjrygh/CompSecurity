// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.people.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class EmptyIterable
    implements Iterable, Iterator
{

    public EmptyIterable()
    {
    }

    public final boolean hasNext()
    {
        return false;
    }

    public final Iterator iterator()
    {
        return this;
    }

    public final Object next()
    {
        throw new NoSuchElementException();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
