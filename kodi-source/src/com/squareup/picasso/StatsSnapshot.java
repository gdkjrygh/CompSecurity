// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import java.io.PrintWriter;

public class StatsSnapshot
{

    public final long averageDownloadSize;
    public final long averageOriginalBitmapSize;
    public final long averageTransformedBitmapSize;
    public final long cacheHits;
    public final long cacheMisses;
    public final int downloadCount;
    public final int maxSize;
    public final int originalBitmapCount;
    public final int size;
    public final long timeStamp;
    public final long totalDownloadSize;
    public final long totalOriginalBitmapSize;
    public final long totalTransformedBitmapSize;
    public final int transformedBitmapCount;

    public StatsSnapshot(int i, int j, long l, long l1, long l2, long l3, long l4, long l5, 
            long l6, long l7, int k, int i1, int j1, 
            long l8)
    {
        maxSize = i;
        size = j;
        cacheHits = l;
        cacheMisses = l1;
        totalDownloadSize = l2;
        totalOriginalBitmapSize = l3;
        totalTransformedBitmapSize = l4;
        averageDownloadSize = l5;
        averageOriginalBitmapSize = l6;
        averageTransformedBitmapSize = l7;
        downloadCount = k;
        originalBitmapCount = i1;
        transformedBitmapCount = j1;
        timeStamp = l8;
    }

    public void dump(PrintWriter printwriter)
    {
        printwriter.println("===============BEGIN PICASSO STATS ===============");
        printwriter.println("Memory Cache Stats");
        printwriter.print("  Max Cache Size: ");
        printwriter.println(maxSize);
        printwriter.print("  Cache Size: ");
        printwriter.println(size);
        printwriter.print("  Cache % Full: ");
        printwriter.println((int)Math.ceil(((float)size / (float)maxSize) * 100F));
        printwriter.print("  Cache Hits: ");
        printwriter.println(cacheHits);
        printwriter.print("  Cache Misses: ");
        printwriter.println(cacheMisses);
        printwriter.println("Network Stats");
        printwriter.print("  Download Count: ");
        printwriter.println(downloadCount);
        printwriter.print("  Total Download Size: ");
        printwriter.println(totalDownloadSize);
        printwriter.print("  Average Download Size: ");
        printwriter.println(averageDownloadSize);
        printwriter.println("Bitmap Stats");
        printwriter.print("  Total Bitmaps Decoded: ");
        printwriter.println(originalBitmapCount);
        printwriter.print("  Total Bitmap Size: ");
        printwriter.println(totalOriginalBitmapSize);
        printwriter.print("  Total Transformed Bitmaps: ");
        printwriter.println(transformedBitmapCount);
        printwriter.print("  Total Transformed Bitmap Size: ");
        printwriter.println(totalTransformedBitmapSize);
        printwriter.print("  Average Bitmap Size: ");
        printwriter.println(averageOriginalBitmapSize);
        printwriter.print("  Average Transformed Bitmap Size: ");
        printwriter.println(averageTransformedBitmapSize);
        printwriter.println("===============END PICASSO STATS ===============");
        printwriter.flush();
    }

    public String toString()
    {
        return (new StringBuilder()).append("StatsSnapshot{maxSize=").append(maxSize).append(", size=").append(size).append(", cacheHits=").append(cacheHits).append(", cacheMisses=").append(cacheMisses).append(", downloadCount=").append(downloadCount).append(", totalDownloadSize=").append(totalDownloadSize).append(", averageDownloadSize=").append(averageDownloadSize).append(", totalOriginalBitmapSize=").append(totalOriginalBitmapSize).append(", totalTransformedBitmapSize=").append(totalTransformedBitmapSize).append(", averageOriginalBitmapSize=").append(averageOriginalBitmapSize).append(", averageTransformedBitmapSize=").append(averageTransformedBitmapSize).append(", originalBitmapCount=").append(originalBitmapCount).append(", transformedBitmapCount=").append(transformedBitmapCount).append(", timeStamp=").append(timeStamp).append('}').toString();
    }
}
