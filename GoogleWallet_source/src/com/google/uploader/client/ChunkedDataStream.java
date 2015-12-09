// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.uploader.client;

import com.google.common.base.Preconditions;
import java.io.IOException;

// Referenced classes of package com.google.uploader.client:
//            PartialDataStream, DataStream

final class ChunkedDataStream extends PartialDataStream
{

    public ChunkedDataStream(DataStream datastream, int i)
        throws IOException
    {
        super(datastream, findSize(datastream, i));
    }

    private static long findSize(DataStream datastream, int i)
        throws IOException
    {
        long l;
        long l1;
        long l3;
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Chunk granularity must be greater than 0.");
        if ((long)i < datastream.getReadAheadLimit())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Chunk granularity must be smaller than the read ahead limit.");
        l3 = datastream.getReadPosition();
        l1 = datastream.getSize();
        if (l1 >= 0L)
        {
            long l2 = datastream.getMarkPosition() + datastream.getReadAheadLimit();
            l = l1;
            if (l2 > 0L)
            {
                l = l1;
                if (l2 < l1)
                {
                    l = l2;
                }
            }
        } else
        {
            for (; datastream.hasMoreData() && datastream.getReadPosition() - datastream.getMarkPosition() < datastream.getReadAheadLimit(); datastream.skip(datastream.getReadAheadLimit())) { }
            l = datastream.getReadPosition();
            datastream.rewind();
            datastream.skip(l3 - datastream.getMarkPosition());
        }
        return ((l - l3) / (long)i) * (long)i;
    }
}
