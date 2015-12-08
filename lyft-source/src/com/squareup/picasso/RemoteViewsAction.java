// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.graphics.Bitmap;
import android.widget.RemoteViews;

// Referenced classes of package com.squareup.picasso:
//            Action, Picasso, Request

abstract class RemoteViewsAction extends Action
{

    final RemoteViews remoteViews;
    private RemoteViewsTarget target;
    final int viewId;

    RemoteViewsAction(Picasso picasso, Request request, RemoteViews remoteviews, int i, int j, int k, int l, 
            Object obj, String s)
    {
        super(picasso, null, request, k, l, j, null, s, obj, false);
        remoteViews = remoteviews;
        viewId = i;
    }

    void complete(Bitmap bitmap, Picasso.LoadedFrom loadedfrom)
    {
        remoteViews.setImageViewBitmap(viewId, bitmap);
        update();
    }

    public void error()
    {
        if (errorResId != 0)
        {
            setImageResource(errorResId);
        }
    }

    RemoteViewsTarget getTarget()
    {
        if (target == null)
        {
            target = new RemoteViewsTarget(remoteViews, viewId);
        }
        return target;
    }

    volatile Object getTarget()
    {
        return getTarget();
    }

    void setImageResource(int i)
    {
        remoteViews.setImageViewResource(viewId, i);
        update();
    }

    abstract void update();

    private class RemoteViewsTarget
    {

        final RemoteViews remoteViews;
        final int viewId;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (RemoteViewsTarget)obj;
                if (viewId != ((RemoteViewsTarget) (obj)).viewId || !remoteViews.equals(((RemoteViewsTarget) (obj)).remoteViews))
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            return remoteViews.hashCode() * 31 + viewId;
        }

        RemoteViewsTarget(RemoteViews remoteviews, int i)
        {
            remoteViews = remoteviews;
            viewId = i;
        }
    }

}
