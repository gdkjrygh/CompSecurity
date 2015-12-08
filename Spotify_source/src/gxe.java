// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Iterator;

public final class gxe
    implements Iterator
{

    private final Iterator a;

    public gxe(Iterator iterator)
    {
        a = iterator;
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final Object next()
    {
        return a.next();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
