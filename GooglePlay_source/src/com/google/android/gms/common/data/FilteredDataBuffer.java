// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.common.internal.Asserts;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, DataBufferIterator

public abstract class FilteredDataBuffer
    implements DataBuffer
{

    public final DataBuffer mDataBuffer;

    public FilteredDataBuffer(DataBuffer databuffer)
    {
        Asserts.checkNotNull(databuffer);
        boolean flag;
        if (!(databuffer instanceof FilteredDataBuffer))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Asserts.checkState(flag, "Not possible to have nested FilteredDataBuffers.");
        mDataBuffer = databuffer;
    }

    public abstract int computeRealPosition(int i);

    public final Object get(int i)
    {
        return mDataBuffer.get(computeRealPosition(i));
    }

    public final Bundle getMetadata()
    {
        return mDataBuffer.getMetadata();
    }

    public Iterator iterator()
    {
        return new DataBufferIterator(this);
    }

    public void release()
    {
        mDataBuffer.release();
    }
}
