// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.NoSuchElementException;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBufferIterator, DataBuffer, DataBufferRef

public final class SingleRefDataBufferIterator extends DataBufferIterator
{

    private Object mDataBufferRef;

    public SingleRefDataBufferIterator(DataBuffer databuffer)
    {
        super(databuffer);
    }

    public final Object next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException((new StringBuilder("Cannot advance the iterator beyond ")).append(mPosition).toString());
        }
        mPosition = mPosition + 1;
        if (mPosition == 0)
        {
            mDataBufferRef = mDataBuffer.get(0);
            if (!(mDataBufferRef instanceof DataBufferRef))
            {
                throw new IllegalStateException((new StringBuilder("DataBuffer reference of type ")).append(mDataBufferRef.getClass()).append(" is not movable").toString());
            }
        } else
        {
            ((DataBufferRef)mDataBufferRef).setDataRow(mPosition);
        }
        return mDataBufferRef;
    }
}
