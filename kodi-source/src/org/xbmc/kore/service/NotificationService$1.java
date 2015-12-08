// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xbmc.kore.service;

import android.app.Notification;
import android.app.NotificationManager;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.widget.RemoteViews;
import com.squareup.picasso.Target;
import org.xbmc.kore.utils.UIUtils;
import org.xbmc.kore.utils.Utils;

// Referenced classes of package org.xbmc.kore.service:
//            NotificationService

class val.expandedIconResId
    implements Target
{

    final NotificationService this$0;
    final RemoteViews val$collapsedRV;
    final int val$expandedIconResId;
    final RemoteViews val$expandedRV;
    final Notification val$notification;
    final int val$posterHeight;
    final int val$posterWidth;
    final String val$title;

    private void showNotification(Bitmap bitmap)
    {
        val$collapsedRV.setImageViewBitmap(0x7f0e002c, bitmap);
        if (Utils.isJellybeanOrLater())
        {
            val$notification.bigContentView = val$expandedRV;
            val$expandedRV.setImageViewBitmap(val$expandedIconResId, bitmap);
        }
        ((NotificationManager)getSystemService("notification")).notify(1, val$notification);
        Target _tmp = NotificationService.access$002(null);
    }

    public void onBitmapFailed(Drawable drawable)
    {
        showNotification(Utils.drawableToBitmap(UIUtils.getCharacterAvatar(NotificationService.this, val$title), val$posterWidth, val$posterHeight));
    }

    public void onBitmapLoaded(Bitmap bitmap, com.squareup.picasso. )
    {
        showNotification(bitmap);
    }

    public void onPrepareLoad(Drawable drawable)
    {
    }

    ()
    {
        this$0 = final_notificationservice;
        val$title = s;
        val$posterWidth = i;
        val$posterHeight = j;
        val$collapsedRV = remoteviews;
        val$notification = notification1;
        val$expandedRV = remoteviews1;
        val$expandedIconResId = I.this;
        super();
    }
}
