// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.kn;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public final class b
    implements Iterator
{

    protected final DataBuffer TU;
    protected int TV;

    public b(DataBuffer databuffer)
    {
        TU = (DataBuffer)kn.k(databuffer);
        TV = -1;
    }

    public final boolean hasNext()
    {
        return TV < TU.getCount() - 1;
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder("Cannot advance the iterator beyond ")).append(TV).toString());
        } else
        {
            DataBuffer databuffer = TU;
            int i = TV + 1;
            TV = i;
            return databuffer.get(i);
        }
    }

    public final void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
