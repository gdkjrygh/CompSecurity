// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import com.google.android.gms.common.internal.Preconditions;
import java.util.Iterator;
import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public class DataBufferIterator
    implements Iterator
{

    protected final DataBuffer mDataBuffer;
    protected int mPosition;

    public DataBufferIterator(DataBuffer databuffer)
    {
        mDataBuffer = (DataBuffer)Preconditions.checkNotNull(databuffer);
        mPosition = -1;
    }

    public boolean hasNext()
    {
        return mPosition < mDataBuffer.getCount() - 1;
    }

    public Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder("Cannot advance the iterator beyond ")).append(mPosition).toString());
        } else
        {
            DataBuffer databuffer = mDataBuffer;
            int i = mPosition + 1;
            mPosition = i;
            return databuffer.get(i);
        }
    }

    public void remove()
    {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
