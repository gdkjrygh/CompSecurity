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

final class Stats
{
    static final class StatsHandler extends Handler
    {

        private final Stats stats;

        public final void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                Picasso.HANDLER.post(message. new Runnable() {

                    final StatsHandler this$0;
                    final Message val$msg;

                    public final void run()
                    {
                        throw new AssertionError((new StringBuilder("Unhandled stats message.")).append(msg.what).toString());
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

    final StatsSnapshot createSnapshot()
    {
        return new StatsSnapshot(cache.maxSize(), cache.size(), cacheHits, cacheMisses, totalDownloadSize, totalOriginalBitmapSize, totalTransformedBitmapSize, averageDownloadSize, averageOriginalBitmapSize, averageTransformedBitmapSize, downloadCount, originalBitmapCount, transformedBitmapCount, System.currentTimeMillis());
    }

    final void dispatchBitmapDecoded(Bitmap bitmap)
    {
        processBitmap(bitmap, 2);
    }

    final void dispatchBitmapTransformed(Bitmap bitmap)
    {
        processBitmap(bitmap, 3);
    }

    final void dispatchCacheHit()
    {
        handler.sendEmptyMessage(0);
    }

    final void dispatchCacheMiss()
    {
        handler.sendEmptyMessage(1);
    }

    final void dispatchDownloadFinished(long l)
    {
        handler.sendMessage(handler.obtainMessage(4, Long.valueOf(l)));
    }

    final void performBitmapDecoded(long l)
    {
        originalBitmapCount = originalBitmapCount + 1;
        totalOriginalBitmapSize = totalOriginalBitmapSize + l;
        averageOriginalBitmapSize = getAverage(originalBitmapCount, totalOriginalBitmapSize);
    }

    final void performBitmapTransformed(long l)
    {
        transformedBitmapCount = transformedBitmapCount + 1;
        totalTransformedBitmapSize = totalTransformedBitmapSize + l;
        averageTransformedBitmapSize = getAverage(originalBitmapCount, totalTransformedBitmapSize);
    }

    final void performCacheHit()
    {
        cacheHits = cacheHits + 1L;
    }

    final void performCacheMiss()
    {
        cacheMisses = cacheMisses + 1L;
    }

    final void performDownloadFinished(Long long1)
    {
        downloadCount = downloadCount + 1;
        totalDownloadSize = totalDownloadSize + long1.longValue();
        averageDownloadSize = getAverage(downloadCount, totalDownloadSize);
    }
}
