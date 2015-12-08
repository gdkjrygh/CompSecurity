// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core;

import android.content.Context;
import com.nostra13.universalimageloader.cache.disc.DiscCacheAware;
import com.nostra13.universalimageloader.cache.disc.impl.FileCountLimitedDiscCache;
import com.nostra13.universalimageloader.cache.disc.impl.TotalSizeLimitedDiscCache;
import com.nostra13.universalimageloader.cache.disc.impl.UnlimitedDiscCache;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.cache.disc.naming.HashCodeFileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.MemoryCacheAware;
import com.nostra13.universalimageloader.cache.memory.impl.LruMemoryCache;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.assist.deque.LIFOLinkedBlockingDeque;
import com.nostra13.universalimageloader.core.decode.BaseImageDecoder;
import com.nostra13.universalimageloader.core.decode.ImageDecoder;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.display.SimpleBitmapDisplayer;
import com.nostra13.universalimageloader.core.download.BaseImageDownloader;
import com.nostra13.universalimageloader.core.download.ImageDownloader;
import com.nostra13.universalimageloader.utils.StorageUtils;
import java.io.File;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

public class DefaultConfigurationFactory
{
    private static class DefaultThreadFactory
        implements ThreadFactory
    {

        private static final AtomicInteger poolNumber = new AtomicInteger(1);
        private final ThreadGroup group;
        private final String namePrefix;
        private final AtomicInteger threadNumber = new AtomicInteger(1);
        private final int threadPriority;

        public Thread newThread(Runnable runnable)
        {
            runnable = new Thread(group, runnable, (new StringBuilder()).append(namePrefix).append(threadNumber.getAndIncrement()).toString(), 0L);
            if (runnable.isDaemon())
            {
                runnable.setDaemon(false);
            }
            runnable.setPriority(threadPriority);
            return runnable;
        }


        DefaultThreadFactory(int i)
        {
            threadPriority = i;
            Object obj = System.getSecurityManager();
            if (obj != null)
            {
                obj = ((SecurityManager) (obj)).getThreadGroup();
            } else
            {
                obj = Thread.currentThread().getThreadGroup();
            }
            group = ((ThreadGroup) (obj));
            namePrefix = (new StringBuilder()).append("uil-pool-").append(poolNumber.getAndIncrement()).append("-thread-").toString();
        }
    }


    public DefaultConfigurationFactory()
    {
    }

    public static BitmapDisplayer createBitmapDisplayer()
    {
        return new SimpleBitmapDisplayer();
    }

    public static DiscCacheAware createDiscCache(Context context, FileNameGenerator filenamegenerator, int i, int j)
    {
        if (i > 0)
        {
            return new TotalSizeLimitedDiscCache(StorageUtils.getIndividualCacheDirectory(context), filenamegenerator, i);
        }
        if (j > 0)
        {
            return new FileCountLimitedDiscCache(StorageUtils.getIndividualCacheDirectory(context), filenamegenerator, j);
        } else
        {
            return new UnlimitedDiscCache(StorageUtils.getCacheDirectory(context), filenamegenerator);
        }
    }

    public static Executor createExecutor(int i, int j, QueueProcessingType queueprocessingtype)
    {
        boolean flag;
        if (queueprocessingtype == QueueProcessingType.LIFO)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            queueprocessingtype = new LIFOLinkedBlockingDeque();
        } else
        {
            queueprocessingtype = new LinkedBlockingQueue();
        }
        queueprocessingtype = (BlockingQueue)queueprocessingtype;
        return new ThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, queueprocessingtype, createThreadFactory(j));
    }

    public static FileNameGenerator createFileNameGenerator()
    {
        return new HashCodeFileNameGenerator();
    }

    public static ImageDecoder createImageDecoder(boolean flag)
    {
        return new BaseImageDecoder(flag);
    }

    public static ImageDownloader createImageDownloader(Context context)
    {
        return new BaseImageDownloader(context);
    }

    public static MemoryCacheAware createMemoryCache(int i)
    {
        int j = i;
        if (i == 0)
        {
            j = (int)(Runtime.getRuntime().maxMemory() / 8L);
        }
        return new LruMemoryCache(j);
    }

    public static DiscCacheAware createReserveDiscCache(File file)
    {
        File file1 = new File(file, "uil-images");
        if (file1.exists() || file1.mkdir())
        {
            file = file1;
        }
        return new TotalSizeLimitedDiscCache(file, 0x200000);
    }

    private static ThreadFactory createThreadFactory(int i)
    {
        return new DefaultThreadFactory(i);
    }
}
