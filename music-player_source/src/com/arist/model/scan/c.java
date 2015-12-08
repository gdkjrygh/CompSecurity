// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.arist.model.scan;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.arist.model.scan:
//            MediaScanService

final class c extends Handler
{

    final MediaScanService a;

    c(MediaScanService mediascanservice)
    {
        a = mediascanservice;
        super();
    }

    public final void handleMessage(Message message)
    {
        if (message.what == 0)
        {
            MediaScanService mediascanservice = a;
            MediaScanService.a(1, message.obj);
        } else
        {
            if (message.what == 1)
            {
                message = (String[])message.obj;
                if (message != null && message.length != 0)
                {
                    MediaScanService mediascanservice1 = a;
                    MediaScanService.a(2, Integer.valueOf(0));
                    MediaScanService.a(a, message);
                    return;
                } else
                {
                    MediaScanService.a(a);
                    return;
                }
            }
            if (message.what == 2)
            {
                MediaScanService mediascanservice2 = a;
                MediaScanService.a(2, Integer.valueOf((message.arg1 * 100) / message.arg2));
                return;
            }
            if (message.what == 3)
            {
                MediaScanService.a(a);
                return;
            }
            if (message.what == 4)
            {
                MediaScanService mediascanservice3 = a;
                MediaScanService.a(4, Integer.valueOf(message.arg1));
                a.stopSelf();
                return;
            }
        }
    }
}
