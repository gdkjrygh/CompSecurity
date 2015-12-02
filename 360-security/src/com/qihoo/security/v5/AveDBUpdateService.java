// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.v5;

import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.IBinder;
import com.qihoo.security.SecurityApplication;
import java.lang.ref.WeakReference;
import java.util.HashMap;

// Referenced classes of package com.qihoo.security.v5:
//            c

public class AveDBUpdateService extends Service
{
    public static interface a
    {

        public abstract void a(Bundle bundle);

        public abstract void b(Bundle bundle);

        public abstract void c(Bundle bundle);

        public abstract void d(Bundle bundle);

        public abstract void e(Bundle bundle);

        public abstract void f(Bundle bundle);
    }

    private class b extends BroadcastReceiver
    {

        final AveDBUpdateService a;

        public void onReceive(Context context, Intent intent)
        {
            a a1;
            if (intent != null)
            {
                context = intent.getExtras();
            } else
            {
                context = null;
            }
            a1 = (a)AveDBUpdateService.b().get();
            if (!"com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
            if (a1 != null)
            {
                a1.b(context);
            }
_L4:
            return;
_L2:
            if (!"com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN".equals(intent.getAction()))
            {
                break; /* Loop/switch isn't completed */
            }
            if (a1 != null)
            {
                a1.e(context);
                return;
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!"com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS".equals(intent.getAction()))
            {
                break; /* Loop/switch isn't completed */
            }
            if (a1 != null)
            {
                a1.a(context);
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
            if (!"com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END".equals(intent.getAction()))
            {
                break; /* Loop/switch isn't completed */
            }
            if (a1 != null)
            {
                a1.d(context);
                return;
            }
            if (true) goto _L4; else goto _L6
_L6:
            if (!"com.qihoo.antivirus.update.action.ERROR".equals(intent.getAction()))
            {
                continue; /* Loop/switch isn't completed */
            }
            if (a1 == null) goto _L4; else goto _L7
_L7:
            a1.c(context);
            return;
            if (!"com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER".equals(intent.getAction()) || a1 == null) goto _L4; else goto _L8
_L8:
            a1.f(context);
            return;
        }

        private b()
        {
            a = AveDBUpdateService.this;
            super();
        }

    }


    private static WeakReference a;
    private b b;

    public AveDBUpdateService()
    {
        b = new b();
    }

    public static void a()
    {
        c.b(SecurityApplication.a());
    }

    public static void a(a a1)
    {
        a = new WeakReference(a1);
        a1 = SecurityApplication.a();
        Intent intent = new Intent("com.qihoo.security.action.ACTION_CHECK_UPDATE");
        intent.setClass(a1, com/qihoo/security/v5/AveDBUpdateService);
        a1.startService(intent);
    }

    static WeakReference b()
    {
        return a;
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_BEGIN");
        intentfilter.addAction("com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_END");
        intentfilter.addAction("com.qihoo.antivirus.update.action.DATA_FILE_DOWNLOAD_INI");
        intentfilter.addAction("com.qihoo.antivirus.update.action.DATA_FILE_PROGRESS");
        intentfilter.addAction("com.qihoo.antivirus.update.action.ERROR");
        intentfilter.addAction("com.qihoo.antivirus.update.action.UPDATE_CHECK_OVER");
        registerReceiver(b, intentfilter);
    }

    public void onDestroy()
    {
        super.onDestroy();
        unregisterReceiver(b);
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        if (intent == null || !"com.qihoo.security.action.ACTION_CHECK_UPDATE".equals(intent.getAction())) goto _L2; else goto _L1
_L1:
        Bundle bundle;
        intent = new HashMap();
        intent.put("i18ntype", String.valueOf(1001));
        i = c.a(this, 3, "1.0.8.3742", intent);
        intent = (a)a.get();
        bundle = new Bundle();
        bundle.putInt("errorResult", i);
        i;
        JVM INSTR tableswitch -3 0: default 104
    //                   -3 118
    //                   -2 104
    //                   -1 118
    //                   0 116;
           goto _L3 _L4 _L3 _L4 _L5
_L5:
        break; /* Loop/switch isn't completed */
_L3:
        if (intent != null)
        {
            intent.c(bundle);
        }
_L2:
        return 2;
_L4:
        if (intent != null)
        {
            intent.c(bundle);
        }
        if (true) goto _L2; else goto _L6
_L6:
    }
}
