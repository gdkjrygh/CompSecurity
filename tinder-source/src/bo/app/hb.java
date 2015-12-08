// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class hb
    implements Iterator
{

    hb()
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
        throw new IllegalStateException(String.valueOf("no calls to next() since the last call to remove()"));
    }
}
