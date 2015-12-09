// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.destination.util;

import com.google.android.gms.common.data.DataBuffer;
import com.google.android.gms.common.data.FilteredDataBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public final class GamesShuffleFilteredDataBuffer extends FilteredDataBuffer
{

    private final List mEntityOffsets;
    private final int mSizeLimit;

    public GamesShuffleFilteredDataBuffer(DataBuffer databuffer, int i, long l)
    {
        super(databuffer);
        mSizeLimit = i;
        int j = mSizeLimit;
        int k = mDataBuffer.getCount();
        if (j > k)
        {
            throw new IllegalArgumentException("numIndexes must be smaller or equal to max");
        }
        databuffer = new ArrayList(k);
        for (i = 0; i < k; i++)
        {
            databuffer.add(Integer.valueOf(i));
        }

        Collections.shuffle(databuffer, new Random(l));
        mEntityOffsets = databuffer.subList(0, j);
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

    public final int getCount()
    {
        return Math.min(mSizeLimit, mDataBuffer.getCount());
    }
}
