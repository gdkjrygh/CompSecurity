// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.a.b;

import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.a.b:
//            y

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
        y.a(false);
    }
}
