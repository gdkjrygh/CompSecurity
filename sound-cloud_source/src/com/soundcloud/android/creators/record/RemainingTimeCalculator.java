// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.creators.record;

import android.os.Environment;
import android.os.StatFs;
import java.io.File;

public class RemainingTimeCalculator
{

    public static final int KEEP_BLOCKS = 100;
    private long blocksChangedTime;
    private final int bytesPerSecond;
    private int encodedBytesPerSecond;
    private long encodedBytesPerSecondTotal;
    private File encodedFile;
    private long fileSizeChangedTime;
    private long lastBlocks;
    private long lastFileSize;
    private int numDatapoints;
    private final File sdCardDirectory = Environment.getExternalStorageDirectory();

    public RemainingTimeCalculator(int i)
    {
        bytesPerSecond = i;
    }

    public boolean isDiskSpaceAvailable()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if ("mounted".equals(Environment.getExternalStorageState()))
        {
            flag = flag1;
            if ((new StatFs(sdCardDirectory.getAbsolutePath())).getAvailableBlocks() > 100)
            {
                flag = true;
            }
        }
        return flag;
    }

    public void reset()
    {
        encodedFile = null;
        fileSizeChangedTime = -1L;
        blocksChangedTime = -1L;
        numDatapoints = 0;
        encodedBytesPerSecond = 0;
        encodedBytesPerSecondTotal = 0L;
    }

    public void setEncodedFile(File file)
    {
        encodedFile = file;
    }

    public long timeRemaining()
    {
        if (!"mounted".equals(Environment.getExternalStorageState()))
        {
            return 0L;
        }
        StatFs statfs = new StatFs(sdCardDirectory.getAbsolutePath());
        long l2 = Math.max(0, statfs.getAvailableBlocks() - 100);
        long l = statfs.getBlockSize();
        long l1 = System.currentTimeMillis();
        if (blocksChangedTime == -1L || l2 != lastBlocks)
        {
            blocksChangedTime = l1;
            lastBlocks = l2;
        }
        if (encodedFile != null)
        {
            encodedFile = new File(encodedFile.getAbsolutePath());
            l2 = encodedFile.length();
            if (fileSizeChangedTime == -1L || l2 > lastFileSize)
            {
                long l3 = lastFileSize;
                long l4 = fileSizeChangedTime;
                fileSizeChangedTime = l1;
                lastFileSize = l2;
                int i = (int)((double)(l2 - l3) / ((double)(l1 - l4) / 1000D));
                l2 = encodedBytesPerSecondTotal;
                encodedBytesPerSecondTotal = (long)i + l2;
                double d = encodedBytesPerSecondTotal;
                i = numDatapoints + 1;
                numDatapoints = i;
                encodedBytesPerSecond = (int)(d / (double)i);
                if (numDatapoints % 5 == 0)
                {
                    encodedBytesPerSecondTotal = 0L;
                    numDatapoints = 0;
                }
            }
        }
        l2 = bytesPerSecond + encodedBytesPerSecond;
        return Math.max(0L, (l * lastBlocks) / l2 - (l1 - blocksChangedTime) / 1000L);
    }
}
