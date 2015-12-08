// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.u;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            b

public final class e
    implements Iterator
{

    protected final b a;
    protected int b;

    public e(b b1)
    {
        a = (b)u.a(b1);
        b = -1;
    }

    public final boolean hasNext()
    {
        return b < a.c() - 1;
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder("Cannot advance the iterator beyond ")).append(b).toString());
        } else
        {
            b b1 = a;
            int i = b + 1;
            b = i;
            return b1.a(i);
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
