// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.cast.companionlibrary.notification;

import android.graphics.Bitmap;
import com.google.android.gms.cast.m;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.CastException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.NoConnectionException;
import com.google.android.libraries.cast.companionlibrary.cast.exceptions.TransientNetworkDisconnectionException;
import com.google.android.libraries.cast.companionlibrary.utils.FetchBitmapTask;
import com.google.android.libraries.cast.companionlibrary.utils.LogUtils;
import com.google.android.libraries.cast.companionlibrary.utils.Utils;

// Referenced classes of package com.google.android.libraries.cast.companionlibrary.notification:
//            VideoCastNotificationService

class val.info extends FetchBitmapTask
{

    final VideoCastNotificationService this$0;
    final m val$info;

    protected void onPostExecute(Bitmap bitmap)
    {
        VideoCastNotificationService.access$502(VideoCastNotificationService.this, Utils.scaleAndCenterCropBitmap(bitmap, VideoCastNotificationService.access$600(VideoCastNotificationService.this), VideoCastNotificationService.access$600(VideoCastNotificationService.this)));
        VideoCastNotificationService.access$800(VideoCastNotificationService.this, val$info, VideoCastNotificationService.access$500(VideoCastNotificationService.this), VideoCastNotificationService.access$700(VideoCastNotificationService.this));
_L2:
        if (VideoCastNotificationService.access$300(VideoCastNotificationService.this) && VideoCastNotificationService.access$400(VideoCastNotificationService.this) != null)
        {
            startForeground(1, VideoCastNotificationService.access$400(VideoCastNotificationService.this));
        }
        if (this == VideoCastNotificationService.access$900(VideoCastNotificationService.this))
        {
            VideoCastNotificationService.access$902(VideoCastNotificationService.this, null);
        }
        return;
        bitmap;
_L3:
        LogUtils.LOGE(VideoCastNotificationService.access$000(), (new StringBuilder("Failed to set notification for ")).append(val$info.toString()).toString(), bitmap);
        if (true) goto _L2; else goto _L1
_L1:
        bitmap;
          goto _L3
        bitmap;
          goto _L3
    }

    protected volatile void onPostExecute(Object obj)
    {
        onPostExecute((Bitmap)obj);
    }

    nException()
    {
        this$0 = final_videocastnotificationservice;
        val$info = m.this;
        super();
    }
}
