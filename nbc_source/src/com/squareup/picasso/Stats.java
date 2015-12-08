// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;

// Referenced classes of package com.squareup.picasso:
//            Utils, StatsSnapshot, Cache, Picasso

class Stats
{
    private static class StatsHandler extends Handler
    {

        private final Stats stats;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Picasso.HANDLER.post(message. new Runnable() {

                    final StatsHandler this$0;
                    final Message val$msg;

                    public void run()
                    {
                        throw new AssertionError((new StringBuilder()).append("Unhandled stats message.").append(msg.what).toString());
                    }

            
            {
                this$0 = final_statshandler;
                msg = Message.this;
                super();
            }
                });
                return;

            case 0: // '\0'
                stats.performCacheHit();
                return;

            case 1: // '\001'
                stats.performCacheMiss();
                return;

            case 2: // '\002'
                stats.performBitmapDecoded(message.arg1);
                return;

            case 3: // '\003'
                stats.performBitmapTransformed(message.arg1);
                return;

            case 4: // '\004'
                stats.performDownloadFinished((Long)message.obj);
                break;
            }
        }

        public StatsHandler(Looper looper, Stats stats1)
        {
            super(looper);
            stats = stats1;
        }
    }


    private static final int BITMAP_DECODE_FINISHED = 2;
    private static final int BITMAP_TRANSFORMED_FINISHED = 3;
    private static final int CACHE_HIT = 0;
    private static final int CACHE_MISS = 1;
    private static final int DOWNLOAD_FINISHED = 4;
    private static final String STATS_THREAD_NAME = "Picasso-Stats";
    long averageDownloadSize;
    long averageOriginalBitmapSize;
    long averageTransformedBitmapSize;
    final Cache cache;
    long cacheHits;
    long cacheMisses;
    int downloadCount;
    final Handler handler;
    int originalBitmapCount;
    final HandlerThread statsThread = new HandlerThread("Picasso-Stats", 10);
    long totalDownloadSize;
    long totalOriginalBitmapSize;
    long totalTransformedBitmapSize;
    int transformedBitmapCount;

    Stats(Cache cache1)
    {
        cache = cache1;
        statsThread.start();
        Utils.flushStackLocalLeaks(statsThread.getLooper());
        handler = new StatsHandler(statsThread.getLooper(), this);
    }

    private static long getAverage(int i, long l)
    {
        return l / (long)i;
    }

    private void processBitmap(Bitmap bitmap, int i)
    {
        int j = Utils.getBitmapBytes(bitmap);
        handler.sendMessage(handler.obtainMessage(i, j, 0));
    }

    StatsSnapshot createSnapshot()
    {
        return new StatsSnapshot(cache.maxSize(), cache.size(), cacheHits, cacheMisses, totalDownloadSize, totalOriginalBitmapSize, totalTransformedBitmapSize, averageDownloadSize, averageOriginalBitmapSize, averageTransformedBitmapSize, downloadCount, originalBitmapCount, transformedBitmapCount, System.currentTimeMillis());
    }

    void dispatchBitmapDecoded(Bitmap bitmap)
    {
        processBitmap(bitmap, 2);
    }

    void dispatchBitmapTransformed(Bitmap bitmap)
    {
        processBitmap(bitmap, 3);
    }

    void dispatchCacheHit()
    {
        handler.sendEmptyMessage(0);
    }

    void dispatchCacheMiss()
    {
        handler.sendEmptyMessage(1);
    }

    void dispatchDownloadFinished(long l)
    {
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(l)));
    }

    void performBitmapDecoded(long l)
    {
        originalBitmapCount = originalBitmapCount + 1;
        totalOriginalBitmapSize = totalOriginalBitmapSize + l;
        averageOriginalBitmapSize = getAverage(originalBitmapCount, totalOriginalBitmapSize);
    }

    void performBitmapTransformed(long l)
    {
        transformedBitmapCount = transformedBitmapCount + 1;
        totalTransformedBitmapSize = totalTransformedBitmapSize + l;
        averageTransformedBitmapSize = getAverage(originalBitmapCount, totalTransformedBitmapSize);
    }

    void performCacheHit()
    {
        cacheHits = cacheHits + 1L;
    }

    void performCacheMiss()
    {
        cacheMisses = cacheMisses + 1L;
    }

    void performDownloadFinished(Long long1)
    {
        downloadCount = downloadCount + 1;
        totalDownloadSize = totalDownloadSize + long1.longValue();
        averageDownloadSize = getAverage(downloadCount, totalDownloadSize);
    }

    void shutdown()
    {
        statsThread.quit();
    }
}
