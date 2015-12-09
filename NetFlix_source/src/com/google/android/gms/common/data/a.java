// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.internal.fq;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public final class a
    implements Iterator
{

    private int BC;
    private final DataBuffer mDataBuffer;

    public a(DataBuffer databuffer)
    {
        mDataBuffer = (DataBuffer)fq.f(databuffer);
        BC = -1;
    }

    public boolean hasNext()
    {
        return BC < mDataBuffer.getCount() - 1;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder()).append("Cannot advance the iterator beyond ").append(BC).toString());
        } else
        {
            DataBuffer databuffer = mDataBuffer;
            int i = BC + 1;
            BC = i;
            return databuffer.get(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
