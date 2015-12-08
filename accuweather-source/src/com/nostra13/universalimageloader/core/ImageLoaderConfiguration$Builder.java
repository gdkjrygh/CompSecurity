// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core;

import android.content.Context;
import com.nostra13.universalimageloader.cache.disc.DiscCacheAware;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.MemoryCacheAware;
import com.nostra13.universalimageloader.cache.memory.impl.FuzzyKeyMemoryCache;
import com.nostra13.universalimageloader.core.assist.MemoryCacheUtil;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.decode.ImageDecoder;
import com.nostra13.universalimageloader.core.download.ImageDownloader;
import com.nostra13.universalimageloader.core.process.BitmapProcessor;
import com.nostra13.universalimageloader.utils.L;
import java.util.concurrent.Executor;

// Referenced classes of package com.nostra13.universalimageloader.core:
//            ImageLoaderConfiguration, DefaultConfigurationFactory, DisplayImageOptions

public static class context
{

    public static final QueueProcessingType DEFAULT_TASK_PROCESSING_TYPE;
    public static final int DEFAULT_THREAD_POOL_SIZE = 3;
    public static final int DEFAULT_THREAD_PRIORITY = 4;
    private static final String WARNING_OVERLAP_DISC_CACHE_NAME_GENERATOR = "discCache() and discCacheFileNameGenerator() calls overlap each other";
    private static final String WARNING_OVERLAP_DISC_CACHE_PARAMS = "discCache(), discCacheSize() and discCacheFileCount calls overlap each other";
    private static final String WARNING_OVERLAP_EXECUTOR = "threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.";
    private static final String WARNING_OVERLAP_MEMORY_CACHE = "memoryCache() and memoryCacheSize() calls overlap each other";
    private Context context;
    private boolean customExecutor;
    private boolean customExecutorForCachedImages;
    private ImageDecoder decoder;
    private DisplayImageOptions defaultDisplayImageOptions;
    private boolean denyCacheImageMultipleSizesInMemory;
    private DiscCacheAware discCache;
    private int discCacheFileCount;
    private FileNameGenerator discCacheFileNameGenerator;
    private int discCacheSize;
    private ImageDownloader downloader;
    private android.graphics.ageDownloader imageCompressFormatForDiscCache;
    private int imageQualityForDiscCache;
    private int maxImageHeightForDiscCache;
    private int maxImageHeightForMemoryCache;
    private int maxImageWidthForDiscCache;
    private int maxImageWidthForMemoryCache;
    private MemoryCacheAware memoryCache;
    private int memoryCacheSize;
    private BitmapProcessor processorForDiscCache;
    private Executor taskExecutor;
    private Executor taskExecutorForCachedImages;
    private QueueProcessingType tasksProcessingType;
    private int threadPoolSize;
    private int threadPriority;
    private boolean writeLogs;

    private void initEmptyFieldsWithDefaultValues()
    {
        if (taskExecutor == null)
        {
            taskExecutor = DefaultConfigurationFactory.createExecutor(threadPoolSize, threadPriority, tasksProcessingType);
        } else
        {
            customExecutor = true;
        }
        if (taskExecutorForCachedImages == null)
        {
            taskExecutorForCachedImages = DefaultConfigurationFactory.createExecutor(threadPoolSize, threadPriority, tasksProcessingType);
        } else
        {
            customExecutorForCachedImages = true;
        }
        if (discCache == null)
        {
            if (discCacheFileNameGenerator == null)
            {
                discCacheFileNameGenerator = DefaultConfigurationFactory.createFileNameGenerator();
            }
            discCache = DefaultConfigurationFactory.createDiscCache(context, discCacheFileNameGenerator, discCacheSize, discCacheFileCount);
        }
        if (memoryCache == null)
        {
            memoryCache = DefaultConfigurationFactory.createMemoryCache(memoryCacheSize);
        }
        if (denyCacheImageMultipleSizesInMemory)
        {
            memoryCache = new FuzzyKeyMemoryCache(memoryCache, MemoryCacheUtil.createFuzzyKeyComparator());
        }
        if (downloader == null)
        {
            downloader = DefaultConfigurationFactory.createImageDownloader(context);
        }
        if (decoder == null)
        {
            decoder = DefaultConfigurationFactory.createImageDecoder(writeLogs);
        }
        if (defaultDisplayImageOptions == null)
        {
            defaultDisplayImageOptions = DisplayImageOptions.createSimple();
        }
    }

    public ImageLoaderConfiguration build()
    {
        initEmptyFieldsWithDefaultValues();
        return new ImageLoaderConfiguration(this, null);
    }

    public initEmptyFieldsWithDefaultValues defaultDisplayImageOptions(DisplayImageOptions displayimageoptions)
    {
        defaultDisplayImageOptions = displayimageoptions;
        return this;
    }

    public defaultDisplayImageOptions denyCacheImageMultipleSizesInMemory()
    {
        denyCacheImageMultipleSizesInMemory = true;
        return this;
    }

    public denyCacheImageMultipleSizesInMemory discCache(DiscCacheAware disccacheaware)
    {
        if (discCacheSize > 0 || discCacheFileCount > 0)
        {
            L.w("discCache(), discCacheSize() and discCacheFileCount calls overlap each other", new Object[0]);
        }
        if (discCacheFileNameGenerator != null)
        {
            L.w("discCache() and discCacheFileNameGenerator() calls overlap each other", new Object[0]);
        }
        discCache = disccacheaware;
        return this;
    }

    public discCache discCacheExtraOptions(int i, int j, android.graphics.Configuration.Builder builder, int k, BitmapProcessor bitmapprocessor)
    {
        maxImageWidthForDiscCache = i;
        maxImageHeightForDiscCache = j;
        imageCompressFormatForDiscCache = builder;
        imageQualityForDiscCache = k;
        processorForDiscCache = bitmapprocessor;
        return this;
    }

    public processorForDiscCache discCacheFileCount(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxFileCount must be a positive number");
        }
        if (discCache != null || discCacheSize > 0)
        {
            L.w("discCache(), discCacheSize() and discCacheFileCount calls overlap each other", new Object[0]);
        }
        discCacheSize = 0;
        discCacheFileCount = i;
        return this;
    }

    public discCacheFileCount discCacheFileNameGenerator(FileNameGenerator filenamegenerator)
    {
        if (discCache != null)
        {
            L.w("discCache() and discCacheFileNameGenerator() calls overlap each other", new Object[0]);
        }
        discCacheFileNameGenerator = filenamegenerator;
        return this;
    }

    public discCacheFileNameGenerator discCacheSize(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("maxCacheSize must be a positive number");
        }
        if (discCache != null || discCacheFileCount > 0)
        {
            L.w("discCache(), discCacheSize() and discCacheFileCount calls overlap each other", new Object[0]);
        }
        discCacheSize = i;
        return this;
    }

    public discCacheSize imageDecoder(ImageDecoder imagedecoder)
    {
        decoder = imagedecoder;
        return this;
    }

    public decoder imageDownloader(ImageDownloader imagedownloader)
    {
        downloader = imagedownloader;
        return this;
    }

    public downloader memoryCache(MemoryCacheAware memorycacheaware)
    {
        if (memoryCacheSize != 0)
        {
            L.w("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
        }
        memoryCache = memorycacheaware;
        return this;
    }

    public memoryCache memoryCacheExtraOptions(int i, int j)
    {
        maxImageWidthForMemoryCache = i;
        maxImageHeightForMemoryCache = j;
        return this;
    }

    public maxImageHeightForMemoryCache memoryCacheSize(int i)
    {
        if (i <= 0)
        {
            throw new IllegalArgumentException("memoryCacheSize must be a positive number");
        }
        if (memoryCache != null)
        {
            L.w("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
        }
        memoryCacheSize = i;
        return this;
    }

    public memoryCacheSize memoryCacheSizePercentage(int i)
    {
        if (i <= 0 || i >= 100)
        {
            throw new IllegalArgumentException("availableMemoryPercent must be in range (0 < % < 100)");
        }
        if (memoryCache != null)
        {
            L.w("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
        }
        memoryCacheSize = (int)((float)Runtime.getRuntime().maxMemory() * ((float)i / 100F));
        return this;
    }

    public memoryCacheSize taskExecutor(Executor executor)
    {
        if (threadPoolSize != 3 || threadPriority != 4 || tasksProcessingType != DEFAULT_TASK_PROCESSING_TYPE)
        {
            L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        taskExecutor = executor;
        return this;
    }

    public taskExecutor taskExecutorForCachedImages(Executor executor)
    {
        if (threadPoolSize != 3 || threadPriority != 4 || tasksProcessingType != DEFAULT_TASK_PROCESSING_TYPE)
        {
            L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        taskExecutorForCachedImages = executor;
        return this;
    }

    public taskExecutorForCachedImages tasksProcessingOrder(QueueProcessingType queueprocessingtype)
    {
        if (taskExecutor != null || taskExecutorForCachedImages != null)
        {
            L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        tasksProcessingType = queueprocessingtype;
        return this;
    }

    public tasksProcessingType threadPoolSize(int i)
    {
        if (taskExecutor != null || taskExecutorForCachedImages != null)
        {
            L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        threadPoolSize = i;
        return this;
    }

    public threadPoolSize threadPriority(int i)
    {
        if (taskExecutor != null || taskExecutorForCachedImages != null)
        {
            L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
        }
        if (i < 1)
        {
            threadPriority = 1;
            return this;
        }
        if (i > 10)
        {
            threadPriority = 10;
            return this;
        } else
        {
            threadPriority = i;
            return this;
        }
    }

    public threadPriority writeDebugLogs()
    {
        writeLogs = true;
        return this;
    }

    static 
    {
        DEFAULT_TASK_PROCESSING_TYPE = QueueProcessingType.FIFO;
    }






















    public (Context context1)
    {
        maxImageWidthForMemoryCache = 0;
        maxImageHeightForMemoryCache = 0;
        maxImageWidthForDiscCache = 0;
        maxImageHeightForDiscCache = 0;
        imageCompressFormatForDiscCache = null;
        imageQualityForDiscCache = 0;
        processorForDiscCache = null;
        taskExecutor = null;
        taskExecutorForCachedImages = null;
        customExecutor = false;
        customExecutorForCachedImages = false;
        threadPoolSize = 3;
        threadPriority = 4;
        denyCacheImageMultipleSizesInMemory = false;
        tasksProcessingType = DEFAULT_TASK_PROCESSING_TYPE;
        memoryCacheSize = 0;
        discCacheSize = 0;
        discCacheFileCount = 0;
        memoryCache = null;
        discCache = null;
        discCacheFileNameGenerator = null;
        downloader = null;
        defaultDisplayImageOptions = null;
        writeLogs = false;
        context = context1.getApplicationContext();
    }
}
