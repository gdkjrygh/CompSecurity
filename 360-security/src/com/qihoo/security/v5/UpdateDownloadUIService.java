// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import android.widget.Toast;
import com.qihoo.antivirus.update.b;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.app.UiProcessService;
import com.qihoo.utils.notice.a;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.b.r;

// Referenced classes of package com.qihoo.security.v5:
//            DownloadApkDialog, f

public class UpdateDownloadUIService extends UiProcessService
{

    private boolean c;
    private int d;
    private BroadcastReceiver e;
    private int f;
    private long g;

    public UpdateDownloadUIService()
    {
        c = false;
    }

    static Context a(UpdateDownloadUIService updatedownloaduiservice)
    {
        return updatedownloaduiservice.b;
    }

    private void a()
    {
        e = new BroadcastReceiver() {

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
                        com.qihoo.antivirus.update.b.a(com.qihoo.security.v5.UpdateDownloadUIService.b(a), "i18n_security_lite", 0);
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

            
            {
                a = UpdateDownloadUIService.this;
                super();
            }
        };
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.qihoo.antivirus.update.action.APP_PROGRESS");
        intentfilter.addAction("com.qihoo.antivirus.update.action.UPDATE_OVER");
        intentfilter.addAction("com.qihoo.antivirus.update.action.ERROR");
        intentfilter.addAction("com.qihoo.antivirus.update.action.CONNECT_RETRY");
        registerReceiver(e, intentfilter, "com.qihoo.security.lite.PERMISSION", null);
    }

    static Context b(UpdateDownloadUIService updatedownloaduiservice)
    {
        return updatedownloaduiservice.b;
    }

    private void b()
    {
        com.qihoo.antivirus.update.b.a(b, "i18n_security_lite", 0);
    }

    static long c(UpdateDownloadUIService updatedownloaduiservice)
    {
        return updatedownloaduiservice.g;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        SecurityApplication.a(true);
        a();
    }

    public void onDestroy()
    {
        b();
        SecurityApplication.a(false);
        unregisterReceiver(e);
        com.qihoo.utils.notice.a.a().d();
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        boolean flag1;
        flag1 = false;
        super.onStartCommand(intent, i, j);
        this;
        JVM INSTR monitorenter ;
        if (!c)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        q.a().a(0x7f0c018b, 0x7f020143);
        this;
        JVM INSTR monitorexit ;
        return 1;
        c = true;
        this;
        JVM INSTR monitorexit ;
        if (intent != null)
        {
            intent = intent.getExtras();
            boolean flag;
            if (intent != null)
            {
                flag1 = intent.getBoolean("uiforce");
                flag = intent.getBoolean("ispatch");
                f = intent.getInt("type", 0);
            } else
            {
                flag = false;
            }
            com.qihoo.antivirus.update.b.a(b, flag);
            com.qihoo.security.support.b.b(27029);
            g = System.currentTimeMillis();
            Toast.makeText(this, 0x7f0c01bc, 1).show();
            com.qihoo.utils.notice.a.a().c();
            if (flag1)
            {
                intent = new Intent(b, com/qihoo/security/v5/DownloadApkDialog);
                intent.putExtra("uiforce", true);
                intent.putExtra("progress", d);
                intent.addFlags(0x10000000);
                b.startActivity(intent);
                return 1;
            } else
            {
                return 1;
            }
        } else
        {
            stopSelf();
            return 1;
        }
        intent;
        this;
        JVM INSTR monitorexit ;
        throw intent;
    }

    public void onTaskRemoved(Intent intent)
    {
        SecurityApplication.a(false);
        unregisterReceiver(e);
        b();
        com.qihoo.utils.notice.a.a().d();
        super.onTaskRemoved(intent);
    }
}
