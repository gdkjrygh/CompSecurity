// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// Referenced classes of package com.squareup.picasso:
//            Picasso, Request

abstract class Action
{
    static class RequestWeakReference extends WeakReference
    {

        final Action action;

        public RequestWeakReference(Action action1, Object obj, ReferenceQueue referencequeue)
        {
            super(obj, referencequeue);
            action = action1;
        }
    }


    boolean cancelled;
    final Drawable errorDrawable;
    final int errorResId;
    final String key;
    final boolean noFade;
    final Picasso picasso;
    final Request request;
    final boolean skipCache;
    final WeakReference target;
    boolean willReplay;

    Action(Picasso picasso1, Object obj, Request request1, boolean flag, boolean flag1, int i, Drawable drawable, 
            String s)
    {
        picasso = picasso1;
        request = request1;
        target = new RequestWeakReference(this, obj, picasso1.referenceQueue);
        skipCache = flag;
        noFade = flag1;
        errorResId = i;
        errorDrawable = drawable;
        key = s;
    }

    void cancel()
    {
        cancelled = true;
    }

    abstract void complete(Bitmap bitmap, Picasso.LoadedFrom loadedfrom);

    abstract void error();

    String getKey()
    {
        return key;
    }

    Picasso getPicasso()
    {
        return picasso;
    }

    Request getRequest()
    {
        return request;
    }

    Object getTarget()
    {
        return target.get();
    }

    boolean isCancelled()
    {
        return cancelled;
    }

    boolean willReplay()
    {
        return willReplay;
    }
}
