// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core;

import android.graphics.Bitmap;
import android.os.Handler;
import com.nostra13.universalimageloader.cache.disc.DiscCacheAware;
import com.nostra13.universalimageloader.cache.memory.MemoryCacheAware;
import com.nostra13.universalimageloader.core.assist.FailReason;
import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;
import com.nostra13.universalimageloader.core.assist.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.assist.ImageScaleType;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.assist.ViewScaleType;
import com.nostra13.universalimageloader.core.decode.ImageDecoder;
import com.nostra13.universalimageloader.core.decode.ImageDecodingInfo;
import com.nostra13.universalimageloader.core.download.ImageDownloader;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.core.process.BitmapProcessor;
import com.nostra13.universalimageloader.utils.IoUtils;
import com.nostra13.universalimageloader.utils.L;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.nostra13.universalimageloader.core:
//            ImageLoaderEngine, ImageLoaderConfiguration, ImageLoadingInfo, DisplayImageOptions, 
//            DisplayBitmapTask

final class LoadAndDisplayImageTask
    implements Runnable, com.nostra13.universalimageloader.utils.IoUtils.CopyListener
{
    class TaskCancelledException extends Exception
    {

        final LoadAndDisplayImageTask this$0;

        TaskCancelledException()
        {
            this$0 = LoadAndDisplayImageTask.this;
            super();
        }
    }


    private static final int BUFFER_SIZE = 32768;
    private static final String ERROR_POST_PROCESSOR_NULL = "Post-processor returned null [%s]";
    private static final String ERROR_PRE_PROCESSOR_NULL = "Pre-processor returned null [%s]";
    private static final String ERROR_PROCESSOR_FOR_DISC_CACHE_NULL = "Bitmap processor for disc cache returned null [%s]";
    private static final String LOG_CACHE_IMAGE_IN_MEMORY = "Cache image in memory [%s]";
    private static final String LOG_CACHE_IMAGE_ON_DISC = "Cache image on disc [%s]";
    private static final String LOG_DELAY_BEFORE_LOADING = "Delay %d ms before loading...  [%s]";
    private static final String LOG_GET_IMAGE_FROM_MEMORY_CACHE_AFTER_WAITING = "...Get cached bitmap from memory after waiting. [%s]";
    private static final String LOG_LOAD_IMAGE_FROM_DISC_CACHE = "Load image from disc cache [%s]";
    private static final String LOG_LOAD_IMAGE_FROM_NETWORK = "Load image from network [%s]";
    private static final String LOG_POSTPROCESS_IMAGE = "PostProcess image before displaying [%s]";
    private static final String LOG_PREPROCESS_IMAGE = "PreProcess image before caching in memory [%s]";
    private static final String LOG_PROCESS_IMAGE_BEFORE_CACHE_ON_DISC = "Process image before cache on disc [%s]";
    private static final String LOG_RESIZE_CACHED_IMAGE_FILE = "Resize image in disc cache [%s]";
    private static final String LOG_RESUME_AFTER_PAUSE = ".. Resume loading [%s]";
    private static final String LOG_START_DISPLAY_IMAGE_TASK = "Start display image task [%s]";
    private static final String LOG_TASK_CANCELLED_IMAGEAWARE_COLLECTED = "ImageAware was collected by GC. Task is cancelled. [%s]";
    private static final String LOG_TASK_CANCELLED_IMAGEAWARE_REUSED = "ImageAware is reused for another image. Task is cancelled. [%s]";
    private static final String LOG_TASK_INTERRUPTED = "Task was interrupted [%s]";
    private static final String LOG_WAITING_FOR_IMAGE_LOADED = "Image already is loading. Waiting... [%s]";
    private static final String LOG_WAITING_FOR_RESUME = "ImageLoader is paused. Waiting...  [%s]";
    private final ImageLoaderConfiguration configuration;
    private final ImageDecoder decoder;
    private final ImageDownloader downloader;
    private final ImageLoaderEngine engine;
    private final Handler handler;
    final ImageAware imageAware;
    private final ImageLoadingInfo imageLoadingInfo;
    final ImageLoadingListener listener;
    private LoadedFrom loadedFrom;
    private final String memoryCacheKey;
    private final ImageDownloader networkDeniedDownloader;
    final DisplayImageOptions options;
    final ImageLoadingProgressListener progressListener;
    private final ImageDownloader slowNetworkDownloader;
    private final ImageSize targetSize;
    final String uri;
    private final boolean writeLogs;

    public LoadAndDisplayImageTask(ImageLoaderEngine imageloaderengine, ImageLoadingInfo imageloadinginfo, Handler handler1)
    {
        loadedFrom = LoadedFrom.NETWORK;
        engine = imageloaderengine;
        imageLoadingInfo = imageloadinginfo;
        handler = handler1;
        configuration = imageloaderengine.configuration;
        downloader = configuration.downloader;
        networkDeniedDownloader = configuration.networkDeniedDownloader;
        slowNetworkDownloader = configuration.slowNetworkDownloader;
        decoder = configuration.decoder;
        writeLogs = configuration.writeLogs;
        uri = imageloadinginfo.uri;
        memoryCacheKey = imageloadinginfo.memoryCacheKey;
        imageAware = imageloadinginfo.imageAware;
        targetSize = imageloadinginfo.targetSize;
        options = imageloadinginfo.options;
        listener = imageloadinginfo.listener;
        progressListener = imageloadinginfo.progressListener;
    }

    private void checkTaskInterrupted()
        throws TaskCancelledException
    {
        if (isTaskInterrupted())
        {
            throw new TaskCancelledException();
        } else
        {
            return;
        }
    }

    private void checkTaskNotActual()
        throws TaskCancelledException
    {
        checkViewCollected();
        checkViewReused();
    }

    private void checkViewCollected()
        throws TaskCancelledException
    {
        if (isViewCollected())
        {
            throw new TaskCancelledException();
        } else
        {
            return;
        }
    }

    private void checkViewReused()
        throws TaskCancelledException
    {
        if (isViewReused())
        {
            throw new TaskCancelledException();
        } else
        {
            return;
        }
    }

    private Bitmap decodeImage(String s)
        throws IOException
    {
        ViewScaleType viewscaletype = imageAware.getScaleType();
        s = new ImageDecodingInfo(memoryCacheKey, s, targetSize, viewscaletype, getDownloader(), options);
        return decoder.decode(s);
    }

    private boolean delayIfNeed()
    {
        if (options.shouldDelayBeforeLoading())
        {
            log("Delay %d ms before loading...  [%s]", new Object[] {
                Integer.valueOf(options.getDelayBeforeLoading()), memoryCacheKey
            });
            try
            {
                Thread.sleep(options.getDelayBeforeLoading());
            }
            catch (InterruptedException interruptedexception)
            {
                L.e("Task was interrupted [%s]", new Object[] {
                    memoryCacheKey
                });
                return true;
            }
            return isTaskNotActual();
        } else
        {
            return false;
        }
    }

    private boolean downloadImage(File file)
        throws IOException
    {
        java.io.InputStream inputstream = getDownloader().getStream(uri, options.getExtraForDownloader());
        file = new BufferedOutputStream(new FileOutputStream(file), 32768);
        boolean flag = IoUtils.copyStream(inputstream, file, this);
        IoUtils.closeSilently(file);
        IoUtils.closeSilently(inputstream);
        return flag;
        Exception exception;
        exception;
        IoUtils.closeSilently(file);
        throw exception;
        file;
        IoUtils.closeSilently(inputstream);
        throw file;
    }

    private void fireCancelEvent()
    {
        if (options.isSyncLoading() || isTaskInterrupted())
        {
            return;
        } else
        {
            handler.post(new Runnable() {

                final LoadAndDisplayImageTask this$0;

                public void run()
                {
                    listener.onLoadingCancelled(uri, imageAware.getWrappedView());
                }

            
            {
                this$0 = LoadAndDisplayImageTask.this;
                super();
            }
            });
            return;
        }
    }

    private void fireFailEvent(final com.nostra13.universalimageloader.core.assist.FailReason.FailType failType, final Throwable failCause)
    {
        if (options.isSyncLoading() || isTaskInterrupted() || isTaskNotActual())
        {
            return;
        } else
        {
            handler.post(new Runnable() {

                final LoadAndDisplayImageTask this$0;
                final Throwable val$failCause;
                final com.nostra13.universalimageloader.core.assist.FailReason.FailType val$failType;

                public void run()
                {
                    if (options.shouldShowImageOnFail())
                    {
                        imageAware.setImageDrawable(options.getImageOnFail(configuration.resources));
                    }
                    listener.onLoadingFailed(uri, imageAware.getWrappedView(), new FailReason(failType, failCause));
                }

            
            {
                this$0 = LoadAndDisplayImageTask.this;
                failType = failtype;
                failCause = throwable;
                super();
            }
            });
            return;
        }
    }

    private boolean fireProgressEvent(final int current, final int total)
    {
        if (options.isSyncLoading() || isTaskInterrupted() || isTaskNotActual())
        {
            return false;
        } else
        {
            handler.post(new Runnable() {

                final LoadAndDisplayImageTask this$0;
                final int val$current;
                final int val$total;

                public void run()
                {
                    progressListener.onProgressUpdate(uri, imageAware.getWrappedView(), current, total);
                }

            
            {
                this$0 = LoadAndDisplayImageTask.this;
                current = i;
                total = j;
                super();
            }
            });
            return true;
        }
    }

    private ImageDownloader getDownloader()
    {
        if (engine.isNetworkDenied())
        {
            return networkDeniedDownloader;
        }
        if (engine.isSlowNetwork())
        {
            return slowNetworkDownloader;
        } else
        {
            return downloader;
        }
    }

    private File getImageFileInDiscCache()
    {
        File file;
label0:
        {
            File file1 = configuration.discCache.get(uri);
            File file2 = file1.getParentFile();
            if (file2 != null)
            {
                file = file1;
                if (file2.exists())
                {
                    break label0;
                }
                file = file1;
                if (file2.mkdirs())
                {
                    break label0;
                }
            }
            file1 = configuration.reserveDiscCache.get(uri);
            file2 = file1.getParentFile();
            file = file1;
            if (file2 != null)
            {
                file = file1;
                if (!file2.exists())
                {
                    file2.mkdirs();
                    file = file1;
                }
            }
        }
        return file;
    }

    private boolean isTaskInterrupted()
    {
        if (Thread.interrupted())
        {
            log("Task was interrupted [%s]");
            return true;
        } else
        {
            return false;
        }
    }

    private boolean isTaskNotActual()
    {
        return isViewCollected() || isViewReused();
    }

    private boolean isViewCollected()
    {
        if (imageAware.isCollected())
        {
            log("ImageAware was collected by GC. Task is cancelled. [%s]");
            return true;
        } else
        {
            return false;
        }
    }

    private boolean isViewReused()
    {
        String s = engine.getLoadingUriForView(imageAware);
        boolean flag;
        if (!memoryCacheKey.equals(s))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            log("ImageAware is reused for another image. Task is cancelled. [%s]");
            return true;
        } else
        {
            return false;
        }
    }

    private void log(String s)
    {
        if (writeLogs)
        {
            L.d(s, new Object[] {
                memoryCacheKey
            });
        }
    }

    private transient void log(String s, Object aobj[])
    {
        if (writeLogs)
        {
            L.d(s, aobj);
        }
    }

    private boolean resizeAndSaveImage(File file, int i, int j)
        throws IOException
    {
        Object obj;
        obj = new ImageSize(i, j);
        Object obj1 = (new DisplayImageOptions.Builder()).cloneFrom(options).imageScaleType(ImageScaleType.IN_SAMPLE_INT).build();
        obj = new ImageDecodingInfo(memoryCacheKey, com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.FILE.wrap(file.getAbsolutePath()), ((ImageSize) (obj)), ViewScaleType.FIT_INSIDE, getDownloader(), ((DisplayImageOptions) (obj1)));
        obj1 = decoder.decode(((ImageDecodingInfo) (obj)));
        obj = obj1;
        if (obj1 != null)
        {
            obj = obj1;
            if (configuration.processorForDiscCache != null)
            {
                log("Process image before cache on disc [%s]");
                obj1 = configuration.processorForDiscCache.process(((Bitmap) (obj1)));
                obj = obj1;
                if (obj1 == null)
                {
                    L.e("Bitmap processor for disc cache returned null [%s]", new Object[] {
                        memoryCacheKey
                    });
                    obj = obj1;
                }
            }
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_210;
        }
        file = new BufferedOutputStream(new FileOutputStream(file), 32768);
        ((Bitmap) (obj)).compress(configuration.imageCompressFormatForDiscCache, configuration.imageQualityForDiscCache, file);
        IoUtils.closeSilently(file);
        ((Bitmap) (obj)).recycle();
        return true;
        Exception exception;
        exception;
        IoUtils.closeSilently(file);
        throw exception;
    }

    private boolean tryCacheImageOnDisc(File file)
        throws TaskCancelledException
    {
        boolean flag;
        log("Cache image on disc [%s]");
        flag = false;
        boolean flag2 = downloadImage(file);
        boolean flag1;
        flag1 = flag2;
        if (!flag2)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        flag = flag2;
        int i = configuration.maxImageWidthForDiscCache;
        flag = flag2;
        int j = configuration.maxImageHeightForDiscCache;
        if (i <= 0)
        {
            flag1 = flag2;
            if (j <= 0)
            {
                break MISSING_BLOCK_LABEL_87;
            }
        }
        flag = flag2;
        log("Resize image in disc cache [%s]");
        flag = flag2;
        flag1 = resizeAndSaveImage(file, i, j);
        flag = flag1;
        try
        {
            configuration.discCache.put(uri, file);
        }
        catch (IOException ioexception)
        {
            L.e(ioexception);
            flag1 = flag;
            if (file.exists())
            {
                file.delete();
                return flag;
            }
        }
        return flag1;
    }

    private Bitmap tryLoadBitmap()
        throws TaskCancelledException
    {
        Bitmap bitmap;
        Bitmap bitmap1;
        Bitmap bitmap2;
        Object obj1;
        Bitmap bitmap3;
        Bitmap bitmap4;
        Object obj2;
        Object obj3;
        Object obj4;
        File file;
        file = getImageFileInDiscCache();
        obj1 = null;
        obj2 = null;
        obj3 = null;
        obj4 = null;
        bitmap = null;
        bitmap3 = ((Bitmap) (obj1));
        bitmap1 = obj2;
        bitmap4 = obj3;
        bitmap2 = obj4;
        String s = com.nostra13.universalimageloader.core.download.ImageDownloader.Scheme.FILE.wrap(file.getAbsolutePath());
        bitmap3 = ((Bitmap) (obj1));
        bitmap1 = obj2;
        bitmap4 = obj3;
        bitmap2 = obj4;
        if (!file.exists())
        {
            break MISSING_BLOCK_LABEL_149;
        }
        bitmap3 = ((Bitmap) (obj1));
        bitmap1 = obj2;
        bitmap4 = obj3;
        bitmap2 = obj4;
        log("Load image from disc cache [%s]");
        bitmap3 = ((Bitmap) (obj1));
        bitmap1 = obj2;
        bitmap4 = obj3;
        bitmap2 = obj4;
        loadedFrom = LoadedFrom.DISC_CACHE;
        bitmap3 = ((Bitmap) (obj1));
        bitmap1 = obj2;
        bitmap4 = obj3;
        bitmap2 = obj4;
        checkTaskNotActual();
        bitmap3 = ((Bitmap) (obj1));
        bitmap1 = obj2;
        bitmap4 = obj3;
        bitmap2 = obj4;
        bitmap = decodeImage(s);
        if (bitmap == null) goto _L2; else goto _L1
_L1:
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        if (bitmap.getWidth() <= 0) goto _L2; else goto _L3
_L3:
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        obj1 = bitmap;
        if (bitmap.getHeight() > 0) goto _L4; else goto _L2
_L2:
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        log("Load image from network [%s]");
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        loadedFrom = LoadedFrom.NETWORK;
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        if (!options.isCacheOnDisc()) goto _L6; else goto _L5
_L5:
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        if (!tryCacheImageOnDisc(file)) goto _L6; else goto _L7
_L7:
        obj1 = s;
_L8:
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        checkTaskNotActual();
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        bitmap = decodeImage(((String) (obj1)));
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        if (bitmap.getWidth() <= 0)
        {
            break MISSING_BLOCK_LABEL_338;
        }
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        obj1 = bitmap;
        if (bitmap.getHeight() > 0)
        {
            break; /* Loop/switch isn't completed */
        }
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        fireFailEvent(com.nostra13.universalimageloader.core.assist.FailReason.FailType.DECODING_ERROR, null);
        return bitmap;
_L6:
        bitmap3 = bitmap;
        bitmap1 = bitmap;
        bitmap4 = bitmap;
        bitmap2 = bitmap;
        obj1 = uri;
        if (true) goto _L8; else goto _L4
        Object obj;
        obj;
        fireFailEvent(com.nostra13.universalimageloader.core.assist.FailReason.FailType.NETWORK_DENIED, null);
        return bitmap3;
        obj;
        throw obj;
        obj;
        L.e(((Throwable) (obj)));
        fireFailEvent(com.nostra13.universalimageloader.core.assist.FailReason.FailType.IO_ERROR, ((Throwable) (obj)));
        obj1 = bitmap1;
        if (file.exists())
        {
            file.delete();
            return bitmap1;
        }
          goto _L4
        obj;
        L.e(((Throwable) (obj)));
        fireFailEvent(com.nostra13.universalimageloader.core.assist.FailReason.FailType.OUT_OF_MEMORY, ((Throwable) (obj)));
        return bitmap4;
        obj;
        L.e(((Throwable) (obj)));
        fireFailEvent(com.nostra13.universalimageloader.core.assist.FailReason.FailType.UNKNOWN, ((Throwable) (obj)));
        obj1 = bitmap2;
_L4:
        return ((Bitmap) (obj1));
    }

    private boolean waitIfPaused()
    {
        AtomicBoolean atomicboolean;
        atomicboolean = engine.getPause();
        if (!atomicboolean.get())
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Object obj = engine.getPauseLock();
        obj;
        JVM INSTR monitorenter ;
        if (!atomicboolean.get())
        {
            break MISSING_BLOCK_LABEL_54;
        }
        log("ImageLoader is paused. Waiting...  [%s]");
        engine.getPauseLock().wait();
        log(".. Resume loading [%s]");
        return isTaskNotActual();
        Object obj1;
        obj1;
        L.e("Task was interrupted [%s]", new Object[] {
            memoryCacheKey
        });
        obj;
        JVM INSTR monitorexit ;
        return true;
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
    }

    String getLoadingUri()
    {
        return uri;
    }

    public boolean onBytesCopied(int i, int j)
    {
        return progressListener == null || fireProgressEvent(i, j);
    }

    public void run()
    {
        ReentrantLock reentrantlock;
        while (waitIfPaused() || delayIfNeed()) 
        {
            return;
        }
        reentrantlock = imageLoadingInfo.loadFromUriLock;
        log("Start display image task [%s]");
        if (reentrantlock.isLocked())
        {
            log("Image already is loading. Waiting... [%s]");
        }
        reentrantlock.lock();
        Bitmap bitmap;
        checkTaskNotActual();
        bitmap = (Bitmap)configuration.memoryCache.get(memoryCacheKey);
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_314;
        }
        bitmap = tryLoadBitmap();
        if (bitmap == null)
        {
            reentrantlock.unlock();
            return;
        }
        checkTaskNotActual();
        checkTaskInterrupted();
        Object obj = bitmap;
        if (!options.shouldPreProcess())
        {
            break MISSING_BLOCK_LABEL_152;
        }
        log("PreProcess image before caching in memory [%s]");
        bitmap = options.getPreProcessor().process(bitmap);
        obj = bitmap;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_152;
        }
        L.e("Pre-processor returned null [%s]", new Object[] {
            memoryCacheKey
        });
        obj = bitmap;
        bitmap = ((Bitmap) (obj));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_196;
        }
        bitmap = ((Bitmap) (obj));
        if (!options.isCacheInMemory())
        {
            break MISSING_BLOCK_LABEL_196;
        }
        log("Cache image in memory [%s]");
        configuration.memoryCache.put(memoryCacheKey, obj);
        bitmap = ((Bitmap) (obj));
_L2:
        obj = bitmap;
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        obj = bitmap;
        if (!options.shouldPostProcess())
        {
            break MISSING_BLOCK_LABEL_258;
        }
        log("PostProcess image before displaying [%s]");
        bitmap = options.getPostProcessor().process(bitmap);
        obj = bitmap;
        if (bitmap != null)
        {
            break MISSING_BLOCK_LABEL_258;
        }
        L.e("Post-processor returned null [%s]", new Object[] {
            memoryCacheKey
        });
        obj = bitmap;
        checkTaskNotActual();
        checkTaskInterrupted();
        reentrantlock.unlock();
        obj = new DisplayBitmapTask(((Bitmap) (obj)), imageLoadingInfo, engine, loadedFrom);
        ((DisplayBitmapTask) (obj)).setLoggingEnabled(writeLogs);
        if (options.isSyncLoading())
        {
            ((DisplayBitmapTask) (obj)).run();
            return;
        } else
        {
            handler.post(((Runnable) (obj)));
            return;
        }
        loadedFrom = LoadedFrom.MEMORY_CACHE;
        log("...Get cached bitmap from memory after waiting. [%s]");
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        fireCancelEvent();
        reentrantlock.unlock();
        return;
        obj;
        reentrantlock.unlock();
        throw obj;
    }

}
