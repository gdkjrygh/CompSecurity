// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import java.util.List;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.squareup.picasso:
//            Picasso, Utils, LruCache, PicassoExecutorService, 
//            Stats, Dispatcher, Cache, Downloader

public static final class nContext
{

    private Cache cache;
    private final Context context;
    private Downloader downloader;
    private boolean indicatorsEnabled;
    private  listener;
    private boolean loggingEnabled;
    private List requestHandlers;
    private ExecutorService service;
    private ransformer transformer;

    public final Picasso build()
    {
        Context context1 = context;
        if (downloader == null)
        {
            downloader = Utils.createDefaultDownloader(context1);
        }
        if (cache == null)
        {
            cache = new LruCache(context1);
        }
        if (service == null)
        {
            service = new PicassoExecutorService();
        }
        if (transformer == null)
        {
            transformer = ransformer.IDENTITY;
        }
        Stats stats = new Stats(cache);
        return new Picasso(context1, new Dispatcher(context1, service, Picasso.HANDLER, downloader, cache, stats), cache, listener, transformer, requestHandlers, stats, indicatorsEnabled, loggingEnabled);
    }

    public final loggingEnabled downloader(Downloader downloader1)
    {
        if (downloader1 == null)
        {
            throw new IllegalArgumentException("Downloader must not be null.");
        }
        if (downloader != null)
        {
            throw new IllegalStateException("Downloader already set.");
        } else
        {
            downloader = downloader1;
            return this;
        }
    }

    public final downloader memoryCache(Cache cache1)
    {
        if (cache1 == null)
        {
            throw new IllegalArgumentException("Memory cache must not be null.");
        }
        if (cache != null)
        {
            throw new IllegalStateException("Memory cache already set.");
        } else
        {
            cache = cache1;
            return this;
        }
    }

    public final ransformer requestTransformer(ransformer ransformer)
    {
        if (ransformer == null)
        {
            throw new IllegalArgumentException("Transformer must not be null.");
        }
        if (transformer != null)
        {
            throw new IllegalStateException("Transformer already set.");
        } else
        {
            transformer = ransformer;
            return this;
        }
    }

    public ransformer(Context context1)
    {
        if (context1 == null)
        {
            throw new IllegalArgumentException("Context must not be null.");
        } else
        {
            context = context1.getApplicationContext();
            return;
        }
    }
}
