// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.umeng.common.net;

import android.os.Handler;
import android.os.Message;
import android.widget.Toast;
import com.umeng.common.Log;
import com.umeng.common.c;
import java.util.Map;

// Referenced classes of package com.umeng.common.net:
//            DownloadingService

class a extends Handler
{

    final DownloadingService a;

    public void handleMessage(Message message)
    {
        Log.c(DownloadingService.a(), (new StringBuilder("IncomingHandler(msg.what:")).append(message.what).append(" msg.arg1:").append(message.arg1).append(" msg.arg2:").append(message.arg2).append(" msg.replyTo:").append(message.replyTo).toString());
        Object obj;
        switch (message.what)
        {
        default:
            super.handleMessage(message);
            return;

        case 4: // '\004'
            obj = message.getData();
            break;
        }
        Log.c(DownloadingService.a(), (new StringBuilder("IncomingHandler(msg.getData():")).append(obj).toString());
        obj = a(((android.os.Bundle) (obj)));
        if (DownloadingService.b(((a) (obj))))
        {
            Log.a(DownloadingService.a(), (new StringBuilder(String.valueOf(((a) (obj)).a))).append(" is already in downloading list. ").toString());
            Toast.makeText(DownloadingService.a(a), com.umeng.common.c.a(DownloadingService.a(a)).f("umeng_common_action_info_exist"), 0).show();
            return;
        } else
        {
            DownloadingService.b().put(obj, message.replyTo);
            DownloadingService.a(a, ((a) (obj)));
            return;
        }
    }

    (DownloadingService downloadingservice)
    {
        a = downloadingservice;
        super();
    }
}
