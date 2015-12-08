// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.widget.RemoteViews;
import com.umeng.common.Log;
import com.umeng.common.a.a;
import java.util.Map;

// Referenced classes of package com.umeng.common.net:
//            DownloadingService, c

class e
    implements DownloadingService.a
{

    final DownloadingService a;

    e(DownloadingService downloadingservice)
    {
        a = downloadingservice;
        super();
    }

    public void a(int i)
    {
        boolean flag = false;
        if (DownloadingService.c().containsKey(Integer.valueOf(i)))
        {
            DownloadingService.d d = (DownloadingService.d)DownloadingService.c().get(Integer.valueOf(i));
            long al[] = d.f;
            int j = ((flag) ? 1 : 0);
            if (al != null)
            {
                j = ((flag) ? 1 : 0);
                if (al[1] > 0L)
                {
                    int k = (int)(((float)al[0] / (float)al[1]) * 100F);
                    j = k;
                    if (k > 100)
                    {
                        j = 99;
                    }
                }
            }
            Notification notification = com.umeng.common.net.DownloadingService.a(a, d.e, i, j);
            d.b = notification;
            DownloadingService.b(a).notify(i, notification);
        }
    }

    public void a(int i, int j)
    {
        if (DownloadingService.c().containsKey(Integer.valueOf(i)))
        {
            Object obj = (DownloadingService.d)DownloadingService.c().get(Integer.valueOf(i));
            a.a a1 = ((DownloadingService.d) (obj)).e;
            obj = ((DownloadingService.d) (obj)).b;
            ((Notification) (obj)).contentView.setProgressBar(com.umeng.common.a.a.c(com.umeng.common.net.DownloadingService.a(a)), 100, j, false);
            ((Notification) (obj)).contentView.setTextViewText(com.umeng.common.a.a.b(com.umeng.common.net.DownloadingService.a(a)), (new StringBuilder(String.valueOf(String.valueOf(j)))).append("%").toString());
            DownloadingService.b(a).notify(i, ((Notification) (obj)));
            Log.c(com.umeng.common.net.DownloadingService.a(), String.format("%3$10s Notification: mNotificationId = %1$15s\t|\tprogress = %2$15s", new Object[] {
                Integer.valueOf(i), Integer.valueOf(j), a1.b
            }));
        }
    }

    public void a(int i, Exception exception)
    {
        if (DownloadingService.c().containsKey(Integer.valueOf(i)))
        {
            Object obj = (DownloadingService.d)DownloadingService.c().get(Integer.valueOf(i));
            exception = ((DownloadingService.d) (obj)).e;
            obj = ((DownloadingService.d) (obj)).b;
            ((Notification) (obj)).contentView.setTextViewText(com.umeng.common.a.a.d(com.umeng.common.net.DownloadingService.a(a)), (new StringBuilder(String.valueOf(((a.a) (exception)).b))).append(" \u4E0B\u8F7D\u5931\u8D25\uFF0C\u8BF7\u68C0\u67E5\u7F51\u7EDC\u3002").toString());
            DownloadingService.b(a).notify(i, ((Notification) (obj)));
            com.umeng.common.net.DownloadingService.a(a, i);
        }
    }

    public void a(int i, String s)
    {
        a.a a1;
        if (!DownloadingService.c().containsKey(Integer.valueOf(i)))
        {
            break MISSING_BLOCK_LABEL_225;
        }
        Object obj = (DownloadingService.d)DownloadingService.c().get(Integer.valueOf(i));
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_225;
        }
        a1 = ((DownloadingService.d) (obj)).e;
        ((DownloadingService.d) (obj)).b.contentView.setTextViewText(com.umeng.common.a.a.b(com.umeng.common.net.DownloadingService.a(a)), (new StringBuilder(String.valueOf(String.valueOf(100)))).append("%").toString());
        com.umeng.common.net.c.a(com.umeng.common.net.DownloadingService.a(a)).a(a1.a, a1.c, 100);
        obj = new Bundle();
        ((Bundle) (obj)).putString("filename", s);
        s = Message.obtain();
        s.what = 5;
        s.arg1 = 1;
        s.obj = a1;
        s.arg2 = i;
        s.setData(((Bundle) (obj)));
        DownloadingService.c(a).sendMessage(s);
        s = Message.obtain();
        s.what = 5;
        s.arg1 = 1;
        s.setData(((Bundle) (obj)));
        if (DownloadingService.b().get(a1) != null)
        {
            ((Messenger)DownloadingService.b().get(a1)).send(s);
        }
        com.umeng.common.net.DownloadingService.a(a, i);
        return;
        s;
        com.umeng.common.net.DownloadingService.a(a, i);
        return;
    }
}
