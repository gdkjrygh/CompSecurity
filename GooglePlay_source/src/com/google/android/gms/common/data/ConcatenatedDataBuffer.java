// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;

// Referenced classes of package com.google.android.gms.common.data:
//            DataBuffer, ExclusionFilterable, TextFilterable, DataBufferIterator

public final class ConcatenatedDataBuffer
    implements DataBuffer, ExclusionFilterable, TextFilterable
{

    public Bundle mBundle;
    private final ArrayList mCumulativeCountList = new ArrayList();
    public final ArrayList mDataBufferList = new ArrayList();
    private int mTotalCount;

    public ConcatenatedDataBuffer()
    {
    }

    public final void computeCounts()
    {
        int j = 0;
        mCumulativeCountList.clear();
        int i = 0;
        for (int l = mDataBufferList.size(); i < l;)
        {
            DataBuffer databuffer = (DataBuffer)mDataBufferList.get(i);
            int k = j;
            if (databuffer != null)
            {
                k = j + databuffer.getCount();
            }
            mCumulativeCountList.add(Integer.valueOf(k));
            i++;
            j = k;
        }

        mTotalCount = j;
    }

    public final void filterOut(String s)
    {
        int i = 0;
        for (int j = mDataBufferList.size(); i < j; i++)
        {
            DataBuffer databuffer = (DataBuffer)mDataBufferList.get(i);
            if (databuffer instanceof ExclusionFilterable)
            {
                ((ExclusionFilterable)databuffer).filterOut(s);
            }
        }

        computeCounts();
    }

    public final Object get(int i)
    {
        this;
        JVM INSTR monitorenter ;
        int j = 0;
        int k = mDataBufferList.size();
_L2:
        if (j >= k)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        int l = ((Integer)mCumulativeCountList.get(j)).intValue();
        if (i >= l)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        Object obj = (DataBuffer)mDataBufferList.get(j);
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_88;
        }
        obj = ((DataBuffer) (obj)).get((i - l) + ((DataBuffer) (obj)).getCount());
        this;
        JVM INSTR monitorexit ;
        return obj;
        this;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        j++;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final int getCount()
    {
        this;
        JVM INSTR monitorenter ;
        int i = mTotalCount;
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Bundle getMetadata()
    {
        this;
        JVM INSTR monitorenter ;
        Bundle bundle = mBundle;
        this;
        JVM INSTR monitorexit ;
        return bundle;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final Iterator iterator()
    {
        return new DataBufferIterator(this);
    }

    public final void release()
    {
        this;
        JVM INSTR monitorenter ;
        int i = 0;
        int j = mDataBufferList.size();
_L2:
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_42;
        }
        DataBuffer databuffer = (DataBuffer)mDataBufferList.get(i);
        if (databuffer == null)
        {
            break MISSING_BLOCK_LABEL_69;
        }
        databuffer.release();
        break MISSING_BLOCK_LABEL_69;
        mDataBufferList.clear();
        mCumulativeCountList.clear();
        mBundle = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        i++;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
