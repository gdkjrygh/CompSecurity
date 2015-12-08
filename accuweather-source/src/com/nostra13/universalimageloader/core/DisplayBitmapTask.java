// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core;

import android.graphics.Bitmap;
import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;
import com.nostra13.universalimageloader.core.assist.LoadedFrom;
import com.nostra13.universalimageloader.core.display.BitmapDisplayer;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import com.nostra13.universalimageloader.utils.L;

// Referenced classes of package com.nostra13.universalimageloader.core:
//            ImageLoadingInfo, DisplayImageOptions, ImageLoaderEngine

final class DisplayBitmapTask
    implements Runnable
{

    private static final String LOG_DISPLAY_IMAGE_IN_IMAGEAWARE = "Display image in ImageAware (loaded from %1$s) [%2$s]";
    private static final String LOG_TASK_CANCELLED_IMAGEAWARE_COLLECTED = "ImageAware was collected by GC. Task is cancelled. [%s]";
    private static final String LOG_TASK_CANCELLED_IMAGEAWARE_REUSED = "ImageAware is reused for another image. Task is cancelled. [%s]";
    private final Bitmap bitmap;
    private final BitmapDisplayer displayer;
    private final ImageLoaderEngine engine;
    private final ImageAware imageAware;
    private final String imageUri;
    private final ImageLoadingListener listener;
    private final LoadedFrom loadedFrom;
    private boolean loggingEnabled;
    private final String memoryCacheKey;

    public DisplayBitmapTask(Bitmap bitmap1, ImageLoadingInfo imageloadinginfo, ImageLoaderEngine imageloaderengine, LoadedFrom loadedfrom)
    {
        bitmap = bitmap1;
        imageUri = imageloadinginfo.uri;
        imageAware = imageloadinginfo.imageAware;
        memoryCacheKey = imageloadinginfo.memoryCacheKey;
        displayer = imageloadinginfo.options.getDisplayer();
        listener = imageloadinginfo.listener;
        engine = imageloaderengine;
        loadedFrom = loadedfrom;
    }

    private boolean isViewWasReused()
    {
        String s = engine.getLoadingUriForView(imageAware);
        return !memoryCacheKey.equals(s);
    }

    public void run()
    {
        if (imageAware.isCollected())
        {
            if (loggingEnabled)
            {
                L.d("ImageAware was collected by GC. Task is cancelled. [%s]", new Object[] {
                    memoryCacheKey
                });
            }
            listener.onLoadingCancelled(imageUri, imageAware.getWrappedView());
            return;
        }
        if (isViewWasReused())
        {
            if (loggingEnabled)
            {
                L.d("ImageAware is reused for another image. Task is cancelled. [%s]", new Object[] {
                    memoryCacheKey
                });
            }
            listener.onLoadingCancelled(imageUri, imageAware.getWrappedView());
            return;
        }
        if (loggingEnabled)
        {
            L.d("Display image in ImageAware (loaded from %1$s) [%2$s]", new Object[] {
                loadedFrom, memoryCacheKey
            });
        }
        displayer.display(bitmap, imageAware, loadedFrom);
        listener.onLoadingComplete(imageUri, imageAware.getWrappedView(), bitmap);
        engine.cancelDisplayTaskFor(imageAware);
    }

    void setLoggingEnabled(boolean flag)
    {
        loggingEnabled = flag;
    }
}
