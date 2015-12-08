// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.app.Notification;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import android.widget.RemoteViews;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.squareup.picasso:
//            Picasso, Request, Utils, MemoryPolicy, 
//            RemoteViewsAction, Callback, FetchAction, GetAction, 
//            BitmapHunter, PicassoDrawable, DeferredRequestCreator, ImageViewAction, 
//            Target, TargetAction, NetworkPolicy, Transformation

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

    private void performRemoteViewInto(RemoteViewsAction remoteviewsaction)
    {
        if (MemoryPolicy.shouldReadFromMemoryCache(memoryPolicy))
        {
            Bitmap bitmap = picasso.quickMemoryCacheCheck(remoteviewsaction.getKey());
            if (bitmap != null)
            {
                remoteviewsaction.complete(bitmap, Picasso.LoadedFrom.MEMORY);
                return;
            }
        }
        if (placeholderResId != 0)
        {
            remoteviewsaction.setImageResource(placeholderResId);
        }
        picasso.enqueueAndSubmit(remoteviewsaction);
    }

    public RequestCreator centerCrop()
    {
        data.centerCrop();
        return this;
    }

    public RequestCreator centerInside()
    {
        data.centerInside();
        return this;
    }

    public RequestCreator config(android.graphics.Bitmap.Config config1)
    {
        data.config(config1);
        return this;
    }

    public RequestCreator error(int i)
    {
        if (i == 0)
        {
            throw new IllegalArgumentException("Error image resource invalid.");
        }
        if (errorDrawable != null)
        {
            throw new IllegalStateException("Error image already set.");
        } else
        {
            errorResId = i;
            return this;
        }
    }

    public RequestCreator error(Drawable drawable)
    {
        if (drawable == null)
        {
            throw new IllegalArgumentException("Error image may not be null.");
        }
        if (errorResId != 0)
        {
            throw new IllegalStateException("Error image already set.");
        } else
        {
            errorDrawable = drawable;
            return this;
        }
    }

    public void fetch()
    {
        fetch(null);
    }

    public void fetch(Callback callback)
    {
        Request request;
        String s;
label0:
        {
            long l = System.nanoTime();
            if (deferred)
            {
                throw new IllegalStateException("Fit cannot be used with fetch.");
            }
            if (data.hasImage())
            {
                if (!data.hasPriority())
                {
                    data.priority(Picasso.Priority.LOW);
                }
                request = createRequest(l);
                s = Utils.createKey(request, new StringBuilder());
                if (picasso.quickMemoryCacheCheck(s) == null)
                {
                    break label0;
                }
                if (picasso.loggingEnabled)
                {
                    Utils.log("Main", "completed", request.plainId(), (new StringBuilder()).append("from ").append(Picasso.LoadedFrom.MEMORY).toString());
                }
                if (callback != null)
                {
                    callback.onSuccess();
                }
            }
            return;
        }
        callback = new FetchAction(picasso, request, memoryPolicy, networkPolicy, tag, s, callback);
        picasso.submit(callback);
    }

    public RequestCreator fit()
    {
        deferred = true;
        return this;
    }

    public Bitmap get()
        throws IOException
    {
        long l = System.nanoTime();
        Utils.checkNotMain();
        if (deferred)
        {
            throw new IllegalStateException("Fit cannot be used with get.");
        }
        if (!data.hasImage())
        {
            return null;
        } else
        {
            Object obj = createRequest(l);
            String s = Utils.createKey(((Request) (obj)), new StringBuilder());
            obj = new GetAction(picasso, ((Request) (obj)), memoryPolicy, networkPolicy, tag, s);
            return BitmapHunter.forRequest(picasso, picasso.dispatcher, picasso.cache, picasso.stats, ((Action) (obj))).hunt();
        }
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
        Bitmap bitmap = picasso.quickMemoryCacheCheck(s);
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

    public void into(RemoteViews remoteviews, int i, int j, Notification notification)
    {
        long l = System.nanoTime();
        if (remoteviews == null)
        {
            throw new IllegalArgumentException("RemoteViews must not be null.");
        }
        if (notification == null)
        {
            throw new IllegalArgumentException("Notification must not be null.");
        }
        if (deferred)
        {
            throw new IllegalStateException("Fit cannot be used with RemoteViews.");
        }
        if (placeholderDrawable != null || placeholderResId != 0 || errorDrawable != null)
        {
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        } else
        {
            Request request = createRequest(l);
            String s = Utils.createKey(request, new StringBuilder());
            performRemoteViewInto(new RemoteViewsAction.NotificationAction(picasso, request, remoteviews, i, j, notification, memoryPolicy, networkPolicy, s, tag, errorResId));
            return;
        }
    }

    public void into(RemoteViews remoteviews, int i, int ai[])
    {
        long l = System.nanoTime();
        if (remoteviews == null)
        {
            throw new IllegalArgumentException("remoteViews must not be null.");
        }
        if (ai == null)
        {
            throw new IllegalArgumentException("appWidgetIds must not be null.");
        }
        if (deferred)
        {
            throw new IllegalStateException("Fit cannot be used with remote views.");
        }
        if (placeholderDrawable != null || placeholderResId != 0 || errorDrawable != null)
        {
            throw new IllegalArgumentException("Cannot use placeholder or error drawables with remote views.");
        } else
        {
            Request request = createRequest(l);
            String s = Utils.createKey(request, new StringBuilder());
            performRemoteViewInto(new RemoteViewsAction.AppWidgetAction(picasso, request, remoteviews, i, ai, memoryPolicy, networkPolicy, s, tag, errorResId));
            return;
        }
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
            Bitmap bitmap = picasso.quickMemoryCacheCheck(s);
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

    public transient RequestCreator memoryPolicy(MemoryPolicy memorypolicy, MemoryPolicy amemorypolicy[])
    {
        if (memorypolicy == null)
        {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        memoryPolicy = memoryPolicy | memorypolicy.index;
        if (amemorypolicy == null)
        {
            throw new IllegalArgumentException("Memory policy cannot be null.");
        }
        if (amemorypolicy.length > 0)
        {
            int j = amemorypolicy.length;
            for (int i = 0; i < j; i++)
            {
                memorypolicy = amemorypolicy[i];
                if (memorypolicy == null)
                {
                    throw new IllegalArgumentException("Memory policy cannot be null.");
                }
                memoryPolicy = memoryPolicy | memorypolicy.index;
            }

        }
        return this;
    }

    public transient RequestCreator networkPolicy(NetworkPolicy networkpolicy, NetworkPolicy anetworkpolicy[])
    {
        if (networkpolicy == null)
        {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        networkPolicy = networkPolicy | networkpolicy.index;
        if (anetworkpolicy == null)
        {
            throw new IllegalArgumentException("Network policy cannot be null.");
        }
        if (anetworkpolicy.length > 0)
        {
            int j = anetworkpolicy.length;
            for (int i = 0; i < j; i++)
            {
                networkpolicy = anetworkpolicy[i];
                if (networkpolicy == null)
                {
                    throw new IllegalArgumentException("Network policy cannot be null.");
                }
                networkPolicy = networkPolicy | networkpolicy.index;
            }

        }
        return this;
    }

    public RequestCreator noFade()
    {
        noFade = true;
        return this;
    }

    public RequestCreator noPlaceholder()
    {
        if (placeholderResId != 0)
        {
            throw new IllegalStateException("Placeholder resource already set.");
        }
        if (placeholderDrawable != null)
        {
            throw new IllegalStateException("Placeholder image already set.");
        } else
        {
            setPlaceholder = false;
            return this;
        }
    }

    public RequestCreator onlyScaleDown()
    {
        data.onlyScaleDown();
        return this;
    }

    public RequestCreator placeholder(int i)
    {
        if (!setPlaceholder)
        {
            throw new IllegalStateException("Already explicitly declared as no placeholder.");
        }
        if (i == 0)
        {
            throw new IllegalArgumentException("Placeholder image resource invalid.");
        }
        if (placeholderDrawable != null)
        {
            throw new IllegalStateException("Placeholder image already set.");
        } else
        {
            placeholderResId = i;
            return this;
        }
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

    public RequestCreator priority(Picasso.Priority priority1)
    {
        data.priority(priority1);
        return this;
    }

    public RequestCreator resize(int i, int j)
    {
        data.resize(i, j);
        return this;
    }

    public RequestCreator resizeDimen(int i, int j)
    {
        Resources resources = picasso.context.getResources();
        return resize(resources.getDimensionPixelSize(i), resources.getDimensionPixelSize(j));
    }

    public RequestCreator rotate(float f)
    {
        data.rotate(f);
        return this;
    }

    public RequestCreator rotate(float f, float f1, float f2)
    {
        data.rotate(f, f1, f2);
        return this;
    }

    public RequestCreator skipMemoryCache()
    {
        return memoryPolicy(MemoryPolicy.NO_CACHE, new MemoryPolicy[] {
            MemoryPolicy.NO_STORE
        });
    }

    public RequestCreator stableKey(String s)
    {
        data.stableKey(s);
        return this;
    }

    public RequestCreator tag(Object obj)
    {
        if (obj == null)
        {
            throw new IllegalArgumentException("Tag invalid.");
        }
        if (tag != null)
        {
            throw new IllegalStateException("Tag already set.");
        } else
        {
            tag = obj;
            return this;
        }
    }

    public RequestCreator transform(Transformation transformation)
    {
        data.transform(transformation);
        return this;
    }

    public RequestCreator transform(List list)
    {
        data.transform(list);
        return this;
    }

    RequestCreator unfit()
    {
        deferred = false;
        return this;
    }

}
