// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import com.umeng.common.Log;
import java.io.File;

// Referenced classes of package com.umeng.common.net:
//            DownloadingService

class d extends Handler
{

    final DownloadingService a;

    d(DownloadingService downloadingservice)
    {
        a = downloadingservice;
        super();
    }

    public void handleMessage(Message message)
    {
        a.a a1 = (a.a)message.obj;
        int i = message.arg2;
        Intent intent;
        boolean flag;
        try
        {
            message = message.getData().getString("filename");
            Log.c(DownloadingService.a(), "Cancel old notification....");
            Notification notification = new Notification(0x1080082, "\u4E0B\u8F7D\u5B8C\u6210\uFF0C\u8BF7\u70B9\u51FB\u5B89\u88C5", System.currentTimeMillis());
            intent = new Intent("android.intent.action.VIEW");
            intent.addFlags(0x10000000);
            intent.setDataAndType(Uri.fromFile(new File(message)), "application/vnd.android.package-archive");
            PendingIntent pendingintent = PendingIntent.getActivity(DownloadingService.a(a), 0, intent, 0x8000000);
            notification.setLatestEventInfo(DownloadingService.a(a), a1.b, "\u4E0B\u8F7D\u5B8C\u6210\uFF0C\u8BF7\u70B9\u51FB\u5B89\u88C5", pendingintent);
            notification.flags = 16;
            DownloadingService.a(a, (NotificationManager)a.getSystemService("notification"));
            DownloadingService.b(a).notify(i + 1, notification);
            Log.c(DownloadingService.a(), "Show new  notification....");
            flag = DownloadingService.a(DownloadingService.a(a));
            Log.c(DownloadingService.a(), String.format("isAppOnForeground = %1$B", new Object[] {
                Boolean.valueOf(flag)
            }));
        }
        // Misplaced declaration of an exception variable
        catch (Message message)
        {
            Log.b(DownloadingService.a(), (new StringBuilder("can not install. ")).append(message.getMessage()).toString());
            DownloadingService.b(a).cancel(i + 1);
            return;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_235;
        }
        DownloadingService.b(a).cancel(i + 1);
        DownloadingService.a(a).startActivity(intent);
        Log.a(DownloadingService.a(), String.format("%1$10s downloaded. Saved to: %2$s", new Object[] {
            a1.b, message
        }));
        return;
    }
}
