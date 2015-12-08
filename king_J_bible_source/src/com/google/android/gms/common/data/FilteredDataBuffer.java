// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import com.google.android.gms.internal.fb;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer

public abstract class FilteredDataBuffer extends DataBuffer
{

    protected final DataBuffer mDataBuffer;

    public FilteredDataBuffer(DataBuffer databuffer)
    {
        super(null);
        fb.d(databuffer);
        boolean flag;
        if (!(databuffer instanceof FilteredDataBuffer))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fb.a(flag, "Not possible to have nested FilteredDataBuffers.");
        mDataBuffer = databuffer;
    }

    public void close()
    {
        mDataBuffer.close();
    }

    protected abstract int computeRealPosition(int i);

    public Object get(int i)
    {
        return mDataBuffer.get(computeRealPosition(i));
    }

    public Bundle getMetadata()
    {
        return mDataBuffer.getMetadata();
    }

    public boolean isClosed()
    {
        return mDataBuffer.isClosed();
    }
}
