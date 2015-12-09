// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.common.data;

import java.util.ArrayList;
import java.util.HashSet;

// Referenced classes of package com.google.android.gms.common.data:
//            FilteredDataBuffer, DataBuffer, AbstractDataBuffer

public final class PositionFilteredDataBuffer extends FilteredDataBuffer
{

    private final ArrayList mEntityOffsets = new ArrayList();
    public final HashSet mExcludedPositionSet = new HashSet();

    public PositionFilteredDataBuffer(AbstractDataBuffer abstractdatabuffer)
    {
        super(abstractdatabuffer);
        filterEntities();
    }

    public final int computeRealPosition(int i)
    {
        if (i < 0 || i >= getCount())
        {
            throw new IllegalArgumentException((new StringBuilder("Position ")).append(i).append(" is out of bounds for this buffer").toString());
        } else
        {
            return ((Integer)mEntityOffsets.get(i)).intValue();
        }
    }

    public void filterEntities()
    {
        mEntityOffsets.clear();
        int i = 0;
        for (int j = mDataBuffer.getCount(); i < j; i++)
        {
            if (!mExcludedPositionSet.contains(Integer.valueOf(i)))
            {
                mEntityOffsets.add(Integer.valueOf(i));
            }
        }

    }

    public final int getCount()
    {
        return mDataBuffer.getCount() - mExcludedPositionSet.size();
    }
}
