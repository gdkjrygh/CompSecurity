// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import java.util.Iterator;

// Referenced classes of package com.c.b:
//            bz, az

final class cb
    implements Iterator
{

    Iterator a;
    final bz b;

    cb(bz bz1)
    {
        b = bz1;
        super();
        a = bz.a(b).iterator();
    }

    public final boolean hasNext()
    {
        return a.hasNext();
    }

    public final volatile Object next()
    {
        return (String)a.next();
    }

    public final void remove()
    {
        throw new UnsupportedOperationException();
    }
}
