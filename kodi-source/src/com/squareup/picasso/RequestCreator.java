// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.squareup.picasso:
//            Picasso, Request, Utils, PicassoDrawable, 
//            DeferredRequestCreator, MemoryPolicy, Callback, ImageViewAction, 
//            Target, TargetAction

public class RequestCreator
{

    private static final AtomicInteger nextId = new AtomicInteger();
    private final Request.Builder data;
    private boolean deferred;
    private Drawable errorDrawable;
    private int errorResId;
    private int memoryPolicy;
    private int networkPolicy;
    private boolean noFade;
    private final Picasso picasso;
    private Drawable placeholderDrawable;
    private int placeholderResId;
    private boolean setPlaceholder;
    private Object tag;

    RequestCreator()
    {
        setPlaceholder = true;
        picasso = null;
        data = new Request.Builder(null, 0, null);
    }

    RequestCreator(Picasso picasso1, Uri uri, int i)
    {
        setPlaceholder = true;
        if (picasso1.shutdown)
        {
            throw new IllegalStateException("Picasso instance already shut down. Cannot submit new requests.");
        } else
        {
            picasso = picasso1;
            data = new Request.Builder(uri, i, picasso1.defaultBitmapConfig);
            return;
        }
    }

    private Request createRequest(long l)
    {
        int i = nextId.getAndIncrement();
        Request request = data.build();
        request.id = i;
        request.started = l;
        boolean flag = picasso.loggingEnabled;
        if (flag)
        {
            Utils.log("Main", "created", request.plainId(), request.toString());
        }
        Request request1 = picasso.transformRequest(request);
        if (request1 != request)
        {
            request1.id = i;
            request1.started = l;
            if (flag)
            {
                Utils.log("Main", "changed", request1.logId(), (new StringBuilder()).append("into ").append(request1).toString());
            }
        }
        return request1;
    }

    private Drawable getPlaceholderDrawable()
    {
        if (placeholderResId != 0)
        {
            return picasso.context.getResources().getDrawable(placeholderResId);
        } else
        {
            return placeholderDrawable;
        }
    }

    public RequestCreator centerCrop()
    {
        data.centerCrop();
        return this;
    }

    public RequestCreator fit()
    {
        deferred = true;
        return this;
    }

    public void into(ImageView imageview)
    {
        into(imageview, null);
    }

    public void into(ImageView imageview, Callback callback)
    {
        long l;
        l = System.nanoTime();
        Utils.checkMain();
        if (imageview == null)
        {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (data.hasImage()) goto _L2; else goto _L1
_L1:
        picasso.cancelRequest(imageview);
        if (setPlaceholder)
        {
            PicassoDrawable.setPlaceholder(imageview, getPlaceholderDrawable());
        }
_L4:
        return;
_L2:
        Request request;
        String s;
        if (deferred)
        {
            if (data.hasSize())
            {
                throw new IllegalStateException("Fit cannot be used with resize.");
            }
            int i = imageview.getWidth();
            int j = imageview.getHeight();
            if (i == 0 || j == 0)
            {
                if (setPlaceholder)
                {
                    PicassoDrawable.setPlaceholder(imageview, getPlaceholderDrawable());
                }
                picasso.defer(imageview, new DeferredRequestCreator(this, imageview, callback));
                return;
            }
            data.resize(i, j);
        }
        request = createRequest(l);
        s = Utils.createKey(request);
        if (!MemoryPolicy.shouldReadFromMemoryCache(memoryPolicy))
        {
            break; /* Loop/switch isn't completed */
        }
        android.graphics.Bitmap bitmap = picasso.quickMemoryCacheCheck(s);
        if (bitmap == null)
        {
            break; /* Loop/switch isn't completed */
        }
        picasso.cancelRequest(imageview);
        PicassoDrawable.setBitmap(imageview, picasso.context, bitmap, Picasso.LoadedFrom.MEMORY, noFade, picasso.indicatorsEnabled);
        if (picasso.loggingEnabled)
        {
            Utils.log("Main", "completed", request.plainId(), (new StringBuilder()).append("from ").append(Picasso.LoadedFrom.MEMORY).toString());
        }
        if (callback != null)
        {
            callback.onSuccess();
            return;
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (setPlaceholder)
        {
            PicassoDrawable.setPlaceholder(imageview, getPlaceholderDrawable());
        }
        imageview = new ImageViewAction(picasso, imageview, request, memoryPolicy, networkPolicy, errorResId, errorDrawable, s, tag, callback, noFade);
        picasso.enqueueAndSubmit(imageview);
        return;
    }

    public void into(Target target)
    {
        Drawable drawable = null;
        Request request = null;
        long l = System.nanoTime();
        Utils.checkMain();
        if (target == null)
        {
            throw new IllegalArgumentException("Target must not be null.");
        }
        if (deferred)
        {
            throw new IllegalStateException("Fit cannot be used with a Target.");
        }
        if (!data.hasImage())
        {
            picasso.cancelRequest(target);
            drawable = request;
            if (setPlaceholder)
            {
                drawable = getPlaceholderDrawable();
            }
            target.onPrepareLoad(drawable);
            return;
        }
        request = createRequest(l);
        String s = Utils.createKey(request);
        if (MemoryPolicy.shouldReadFromMemoryCache(memoryPolicy))
        {
            android.graphics.Bitmap bitmap = picasso.quickMemoryCacheCheck(s);
            if (bitmap != null)
            {
                picasso.cancelRequest(target);
                target.onBitmapLoaded(bitmap, Picasso.LoadedFrom.MEMORY);
                return;
            }
        }
        if (setPlaceholder)
        {
            drawable = getPlaceholderDrawable();
        }
        target.onPrepareLoad(drawable);
        target = new TargetAction(picasso, target, request, memoryPolicy, networkPolicy, errorDrawable, s, tag, errorResId);
        picasso.enqueueAndSubmit(target);
    }

    public RequestCreator placeholder(Drawable drawable)
    {
        if (!setPlaceholder)
        {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (placeholderResId != 0)
        {
            throw new IllegalStateException("Placeholder image already set.");
        } else
        {
            placeholderDrawable = drawable;
            return this;
        }
    }

    public RequestCreator resize(int i, int j)
    {
        data.resize(i, j);
        return this;
    }

    RequestCreator unfit()
    {
        deferred = false;
        return this;
    }

}
