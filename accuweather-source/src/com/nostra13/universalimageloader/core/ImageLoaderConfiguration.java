// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.nostra13.universalimageloader.cache.disc.DiscCacheAware;
import com.nostra13.universalimageloader.cache.disc.naming.FileNameGenerator;
import com.nostra13.universalimageloader.cache.memory.MemoryCacheAware;
import com.nostra13.universalimageloader.cache.memory.impl.FuzzyKeyMemoryCache;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.MemoryCacheUtil;
import com.nostra13.universalimageloader.core.assist.QueueProcessingType;
import com.nostra13.universalimageloader.core.decode.ImageDecoder;
import com.nostra13.universalimageloader.core.download.ImageDownloader;
import com.nostra13.universalimageloader.core.download.NetworkDeniedImageDownloader;
import com.nostra13.universalimageloader.core.download.SlowNetworkImageDownloader;
import com.nostra13.universalimageloader.core.process.BitmapProcessor;
import com.nostra13.universalimageloader.utils.L;
import com.nostra13.universalimageloader.utils.StorageUtils;
import java.util.concurrent.Executor;

// Referenced classes of package com.nostra13.universalimageloader.core:
//            DefaultConfigurationFactory, DisplayImageOptions

public final class ImageLoaderConfiguration
{
    public static class Builder
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
        private android.graphics.Bitmap.CompressFormat imageCompressFormatForDiscCache;
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
            return new ImageLoaderConfiguration(this);
        }

        public Builder defaultDisplayImageOptions(DisplayImageOptions displayimageoptions)
        {
            defaultDisplayImageOptions = displayimageoptions;
            return this;
        }

        public Builder denyCacheImageMultipleSizesInMemory()
        {
            denyCacheImageMultipleSizesInMemory = true;
            return this;
        }

        public Builder discCache(DiscCacheAware disccacheaware)
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

        public Builder discCacheExtraOptions(int i, int j, android.graphics.Bitmap.CompressFormat compressformat, int k, BitmapProcessor bitmapprocessor)
        {
            maxImageWidthForDiscCache = i;
            maxImageHeightForDiscCache = j;
            imageCompressFormatForDiscCache = compressformat;
            imageQualityForDiscCache = k;
            processorForDiscCache = bitmapprocessor;
            return this;
        }

        public Builder discCacheFileCount(int i)
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

        public Builder discCacheFileNameGenerator(FileNameGenerator filenamegenerator)
        {
            if (discCache != null)
            {
                L.w("discCache() and discCacheFileNameGenerator() calls overlap each other", new Object[0]);
            }
            discCacheFileNameGenerator = filenamegenerator;
            return this;
        }

        public Builder discCacheSize(int i)
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

        public Builder imageDecoder(ImageDecoder imagedecoder)
        {
            decoder = imagedecoder;
            return this;
        }

        public Builder imageDownloader(ImageDownloader imagedownloader)
        {
            downloader = imagedownloader;
            return this;
        }

        public Builder memoryCache(MemoryCacheAware memorycacheaware)
        {
            if (memoryCacheSize != 0)
            {
                L.w("memoryCache() and memoryCacheSize() calls overlap each other", new Object[0]);
            }
            memoryCache = memorycacheaware;
            return this;
        }

        public Builder memoryCacheExtraOptions(int i, int j)
        {
            maxImageWidthForMemoryCache = i;
            maxImageHeightForMemoryCache = j;
            return this;
        }

        public Builder memoryCacheSize(int i)
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

        public Builder memoryCacheSizePercentage(int i)
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

        public Builder taskExecutor(Executor executor)
        {
            if (threadPoolSize != 3 || threadPriority != 4 || tasksProcessingType != DEFAULT_TASK_PROCESSING_TYPE)
            {
                L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
            }
            taskExecutor = executor;
            return this;
        }

        public Builder taskExecutorForCachedImages(Executor executor)
        {
            if (threadPoolSize != 3 || threadPriority != 4 || tasksProcessingType != DEFAULT_TASK_PROCESSING_TYPE)
            {
                L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
            }
            taskExecutorForCachedImages = executor;
            return this;
        }

        public Builder tasksProcessingOrder(QueueProcessingType queueprocessingtype)
        {
            if (taskExecutor != null || taskExecutorForCachedImages != null)
            {
                L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
            }
            tasksProcessingType = queueprocessingtype;
            return this;
        }

        public Builder threadPoolSize(int i)
        {
            if (taskExecutor != null || taskExecutorForCachedImages != null)
            {
                L.w("threadPoolSize(), threadPriority() and tasksProcessingOrder() calls can overlap taskExecutor() and taskExecutorForCachedImages() calls.", new Object[0]);
            }
            threadPoolSize = i;
            return this;
        }

        public Builder threadPriority(int i)
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

        public Builder writeDebugLogs()
        {
            writeLogs = true;
            return this;
        }

        static 
        {
            DEFAULT_TASK_PROCESSING_TYPE = QueueProcessingType.FIFO;
        }






















        public Builder(Context context1)
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


    final boolean customExecutor;
    final boolean customExecutorForCachedImages;
    final ImageDecoder decoder;
    final DisplayImageOptions defaultDisplayImageOptions;
    final DiscCacheAware discCache;
    final ImageDownloader downloader;
    final android.graphics.Bitmap.CompressFormat imageCompressFormatForDiscCache;
    final int imageQualityForDiscCache;
    final int maxImageHeightForDiscCache;
    final int maxImageHeightForMemoryCache;
    final int maxImageWidthForDiscCache;
    final int maxImageWidthForMemoryCache;
    final MemoryCacheAware memoryCache;
    final ImageDownloader networkDeniedDownloader;
    final BitmapProcessor processorForDiscCache;
    final DiscCacheAware reserveDiscCache;
    final Resources resources;
    final ImageDownloader slowNetworkDownloader;
    final Executor taskExecutor;
    final Executor taskExecutorForCachedImages;
    final QueueProcessingType tasksProcessingType;
    final int threadPoolSize;
    final int threadPriority;
    final boolean writeLogs;

    private ImageLoaderConfiguration(Builder builder)
    {
        resources = builder.context.getResources();
        maxImageWidthForMemoryCache = builder.maxImageWidthForMemoryCache;
        maxImageHeightForMemoryCache = builder.maxImageHeightForMemoryCache;
        maxImageWidthForDiscCache = builder.maxImageWidthForDiscCache;
        maxImageHeightForDiscCache = builder.maxImageHeightForDiscCache;
        imageCompressFormatForDiscCache = builder.imageCompressFormatForDiscCache;
        imageQualityForDiscCache = builder.imageQualityForDiscCache;
        processorForDiscCache = builder.processorForDiscCache;
        taskExecutor = builder.taskExecutor;
        taskExecutorForCachedImages = builder.taskExecutorForCachedImages;
        threadPoolSize = builder.threadPoolSize;
        threadPriority = builder.threadPriority;
        tasksProcessingType = builder.tasksProcessingType;
        discCache = builder.discCache;
        memoryCache = builder.memoryCache;
        defaultDisplayImageOptions = builder.defaultDisplayImageOptions;
        writeLogs = builder.writeLogs;
        downloader = builder.downloader;
        decoder = builder.decoder;
        customExecutor = builder.customExecutor;
        customExecutorForCachedImages = builder.customExecutorForCachedImages;
        networkDeniedDownloader = new NetworkDeniedImageDownloader(downloader);
        slowNetworkDownloader = new SlowNetworkImageDownloader(downloader);
        reserveDiscCache = DefaultConfigurationFactory.createReserveDiscCache(StorageUtils.getCacheDirectory(builder.context, false));
    }


    public static ImageLoaderConfiguration createDefault(Context context)
    {
        return (new Builder(context)).build();
    }

    ImageSize getMaxImageSize()
    {
        DisplayMetrics displaymetrics = resources.getDisplayMetrics();
        int j = maxImageWidthForMemoryCache;
        int i = j;
        if (j <= 0)
        {
            i = displaymetrics.widthPixels;
        }
        int k = maxImageHeightForMemoryCache;
        j = k;
        if (k <= 0)
        {
            j = displaymetrics.heightPixels;
        }
        return new ImageSize(i, j);
    }
}
