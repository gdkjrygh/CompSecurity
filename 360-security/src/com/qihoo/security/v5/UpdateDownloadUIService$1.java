// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.qihoo.antivirus.update.b;
import com.qihoo.utils.notice.a;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.b.r;

// Referenced classes of package com.qihoo.security.v5:
//            UpdateDownloadUIService, f

class a extends BroadcastReceiver
{

    final UpdateDownloadUIService a;

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if ("com.qihoo.antivirus.update.action.APP_PROGRESS".equals(s))
        {
            long l = intent.getLongExtra("current", 0L);
            long l3 = intent.getLongExtra("total", 0L);
            if (l3 > 0L && l <= l3)
            {
                int i = (int)((l * 100L) / l3);
                com.qihoo.utils.notice.a.a().a(i);
            }
        } else
        {
            if ("com.qihoo.antivirus.update.action.UPDATE_OVER".equals(s))
            {
                com.qihoo.security.v5.f.a(com.qihoo.security.v5.UpdateDownloadUIService.a(a));
                intent = intent.getStringExtra("app_path");
                b.a(com.qihoo.security.v5.UpdateDownloadUIService.b(a), "i18n_security_lite", 0);
                com.qihoo.utils.notice.a.a().d();
                com.qihoo.utils.notice.a.a().b(intent);
                r.a(context, intent);
                long l1 = (System.currentTimeMillis() - UpdateDownloadUIService.c(a)) / 1000L;
                com.qihoo.security.support.b.b(27013);
                com.qihoo.security.support.b.a(27012, l1);
                com.qihoo.security.support.b.b(27024);
                a.stopSelf();
                return;
            }
            if ("com.qihoo.antivirus.update.action.ERROR".equals(s))
            {
                context = intent.getStringExtra("error_code");
                long l2;
                try
                {
                    com.qihoo.security.support.b.a(27022, Integer.parseInt(context));
                }
                // Misplaced declaration of an exception variable
                catch (Context context) { }
                l2 = (System.currentTimeMillis() - UpdateDownloadUIService.c(a)) / 1000L;
                if (l2 > 0L && l2 < 0x15180L)
                {
                    com.qihoo.security.support.b.a(27027, l2);
                }
                a.stopSelf();
                q.a().a(0x7f0c0176);
                return;
            }
            if ("com.qihoo.antivirus.update.action.CONNECT_RETRY".equals(s))
            {
                com.qihoo.security.support.b.b(27026);
                return;
            }
        }
    }

    (UpdateDownloadUIService updatedownloaduiservice)
    {
        a = updatedownloaduiservice;
        super();
    }
}
