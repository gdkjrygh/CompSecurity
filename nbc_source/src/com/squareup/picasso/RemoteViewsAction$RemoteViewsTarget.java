// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.widget.RemoteViews;

// Referenced classes of package com.squareup.picasso:
//            RemoteViewsAction

static class viewId
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
            obj = (viewId)obj;
            if (viewId != ((viewId) (obj)).viewId || !remoteViews.equals(((remoteViews) (obj)).remoteViews))
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

    (RemoteViews remoteviews, int i)
    {
        remoteViews = remoteviews;
        viewId = i;
    }
}
