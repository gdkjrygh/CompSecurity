// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, DataHolder, DataBufferIterator

public abstract class AbstractDataBuffer
    implements DataBuffer
{

    public final DataHolder mDataHolder;

    public AbstractDataBuffer(DataHolder dataholder)
    {
        mDataHolder = dataholder;
        if (mDataHolder != null)
        {
            mDataHolder.mLeakIdentifier = this;
        }
    }

    public int getCount()
    {
        if (mDataHolder == null)
        {
            return 0;
        } else
        {
            return mDataHolder.mRowCount;
        }
    }

    public Bundle getMetadata()
    {
        return mDataHolder.mMetadata;
    }

    public Iterator iterator()
    {
        return new DataBufferIterator(this);
    }

    public void release()
    {
        if (mDataHolder != null)
        {
            mDataHolder.close();
        }
    }
}
