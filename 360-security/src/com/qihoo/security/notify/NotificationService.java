// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.notify;

import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import com.qihoo.security.app.UiProcessService;
import com.qihoo.security.locale.d;
import com.qihoo.security.opti.a.b;
import com.qihoo.utils.notice.c;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.b.q;

public class NotificationService extends UiProcessService
{

    private final Handler c = new Handler() {

        final NotificationService a;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 4104: 
                com.qihoo.security.notify.NotificationService.a(a);
                break;
            }
        }

            
            {
                a = NotificationService.this;
                super();
            }
    };

    public NotificationService()
    {
    }

    private void a()
    {
        b b1 = new b(b);
        b1.a(new com.qihoo.security.opti.a.b.a() {

            final NotificationService a;

            public void a()
            {
                q.a().a(0x7f0c007e);
            }

            public void a(int i, int j)
            {
                j = (int)(((long)j * 100L) / Utils.getMemoryTotalKb());
                String s = a.a.a(0x7f0c007d, new Object[] {
                    Integer.valueOf(i), Integer.valueOf(j)
                });
                q.a().a(s);
            }

            
            {
                a = NotificationService.this;
                super();
            }
        });
        b1.b();
    }

    static void a(NotificationService notificationservice)
    {
        notificationservice.a();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent != null)
        {
            String s = intent.getAction();
            i = intent.getIntExtra("com.qihoo.security.index.FUNCTION_NOTIFICATION", 0);
            if ("com.qihoo.security.notify.ACTION_BOOST".equals(s))
            {
                c.handleMessage(c.obtainMessage(i));
                com.qihoo.utils.notice.c.a(b, intent);
                com.qihoo360.mobilesafe.b.a.g(b);
                return 1;
            }
        }
        return 1;
    }
}
