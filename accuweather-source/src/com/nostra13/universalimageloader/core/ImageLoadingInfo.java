// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core;

import com.nostra13.universalimageloader.core.assist.ImageLoadingListener;
import com.nostra13.universalimageloader.core.assist.ImageLoadingProgressListener;
import com.nostra13.universalimageloader.core.assist.ImageSize;
import com.nostra13.universalimageloader.core.imageaware.ImageAware;
import java.util.concurrent.locks.ReentrantLock;

// Referenced classes of package com.nostra13.universalimageloader.core:
//            DisplayImageOptions

final class ImageLoadingInfo
{

    final ImageAware imageAware;
    final ImageLoadingListener listener;
    final ReentrantLock loadFromUriLock;
    final String memoryCacheKey;
    final DisplayImageOptions options;
    final ImageLoadingProgressListener progressListener;
    final ImageSize targetSize;
    final String uri;

    public ImageLoadingInfo(String s, ImageAware imageaware, ImageSize imagesize, String s1, DisplayImageOptions displayimageoptions, ImageLoadingListener imageloadinglistener, ImageLoadingProgressListener imageloadingprogresslistener, 
            ReentrantLock reentrantlock)
    {
        uri = s;
        imageAware = imageaware;
        targetSize = imagesize;
        options = displayimageoptions;
        listener = imageloadinglistener;
        progressListener = imageloadingprogresslistener;
        loadFromUriLock = reentrantlock;
        memoryCacheKey = s1;
    }
}
