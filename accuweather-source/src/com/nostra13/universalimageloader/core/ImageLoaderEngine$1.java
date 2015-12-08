// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nostra13.universalimageloader.core;

import com.nostra13.universalimageloader.cache.disc.DiscCacheAware;
import java.io.File;
import java.util.concurrent.Executor;

// Referenced classes of package com.nostra13.universalimageloader.core:
//            ImageLoaderEngine, ImageLoaderConfiguration, LoadAndDisplayImageTask

class ask
    implements Runnable
{

    final ImageLoaderEngine this$0;
    final LoadAndDisplayImageTask val$task;

    public void run()
    {
        boolean flag = configuration.discCache.get(val$task.getLoadingUri()).exists();
        ImageLoaderEngine.access$000(ImageLoaderEngine.this);
        if (flag)
        {
            ImageLoaderEngine.access$100(ImageLoaderEngine.this).execute(val$task);
            return;
        } else
        {
            ImageLoaderEngine.access$200(ImageLoaderEngine.this).execute(val$task);
            return;
        }
    }

    ask()
    {
        this$0 = final_imageloaderengine;
        val$task = LoadAndDisplayImageTask.this;
        super();
    }
}
