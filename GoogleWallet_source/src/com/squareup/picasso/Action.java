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
    static final class RequestWeakReference extends WeakReference
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
    final Object tag;
    final WeakReference target;
    boolean willReplay;

    Action(Picasso picasso1, Object obj, Request request1, boolean flag, boolean flag1, int i, Drawable drawable, 
            String s, Object obj1)
    {
        picasso = picasso1;
        request = request1;
        if (obj == null)
        {
            picasso1 = null;
        } else
        {
            picasso1 = new RequestWeakReference(this, obj, picasso1.referenceQueue);
        }
        target = picasso1;
        skipCache = flag;
        noFade = flag1;
        errorResId = i;
        errorDrawable = drawable;
        key = s;
        if (obj1 == null)
        {
            obj1 = this;
        }
        tag = obj1;
    }

    void cancel()
    {
        cancelled = true;
    }

    abstract void complete(Bitmap bitmap, Picasso.LoadedFrom loadedfrom);

    abstract void error();

    final String getKey()
    {
        return key;
    }

    final Picasso getPicasso()
    {
        return picasso;
    }

    final Picasso.Priority getPriority()
    {
        return request.priority;
    }

    final Request getRequest()
    {
        return request;
    }

    final Object getTag()
    {
        return tag;
    }

    final Object getTarget()
    {
        if (target == null)
        {
            return null;
        } else
        {
            return target.get();
        }
    }

    final boolean isCancelled()
    {
        return cancelled;
    }

    final boolean willReplay()
    {
        return willReplay;
    }
}
