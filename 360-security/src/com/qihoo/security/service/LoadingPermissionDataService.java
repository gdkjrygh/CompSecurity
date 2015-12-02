// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.content.Intent;
import android.os.IBinder;
import android.text.TextUtils;
import com.qihoo.security.SecurityApplication;
import com.qihoo.security.app.UiProcessService;
import com.qihoo.security.h.c;
import com.qihoo.security.h.d;
import com.qihoo.security.h.f;

public class LoadingPermissionDataService extends UiProcessService
{

    public LoadingPermissionDataService()
    {
    }

    private void a()
    {
        c c1;
        if (SecurityApplication.a() != null)
        {
            if ((c1 = c.a()).b() != 4)
            {
                c1.c();
                return;
            }
        }
    }

    static void a(LoadingPermissionDataService loadingpermissiondataservice)
    {
        loadingpermissiondataservice.a();
    }

    public IBinder onBind(Intent intent)
    {
        return null;
    }

    public void onCreate()
    {
        super.onCreate();
    }

    public void onDestroy()
    {
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int i, int j)
    {
        String s;
        super.onStartCommand(intent, i, j);
        if (intent == null)
        {
            stopSelf();
            return 1;
        }
        s = intent.getAction();
        if ("com.qihoo360.mobilesafe.shield.loading".equals(s))
        {
            (new Thread(new Runnable() {

                final LoadingPermissionDataService a;

                public void run()
                {
                    LoadingPermissionDataService.a(a);
                    a.stopSelf();
                }

            
            {
                a = LoadingPermissionDataService.this;
                super();
            }
            })).start();
            return 1;
        }
        if (!"com.qihoo360.mobilesafe.shield.pkgadd".equals(s)) goto _L2; else goto _L1
_L1:
        (new Thread(new Runnable(intent) {

            final Intent a;
            final LoadingPermissionDataService b;

            public void run()
            {
                LoadingPermissionDataService.a(b);
                d.a(a.getStringExtra("pkgname"), a.getIntExtra("pkguid", -1));
            }

            
            {
                b = LoadingPermissionDataService.this;
                a = intent;
                super();
            }
        })).start();
_L4:
        stopSelf();
        return 1;
_L2:
        if ("com.qihoo360.mobilesafe.shield.pkgremoved".equals(s))
        {
            (new Thread(new Runnable(intent) {

                final Intent a;
                final LoadingPermissionDataService b;

                public void run()
                {
                    LoadingPermissionDataService.a(b);
                    d.b(a.getStringExtra("pkgname"), a.getIntExtra("pkguid", -1));
                }

            
            {
                b = LoadingPermissionDataService.this;
                a = intent;
                super();
            }
            })).start();
        } else
        {
            if ("com.qihoo360.mobilesafe.shield.updatefile".equals(s))
            {
                (new Thread(new Runnable(intent) {

                    final Intent a;
                    final LoadingPermissionDataService b;

                    public void run()
                    {
                        LoadingPermissionDataService.a(b);
                        if (TextUtils.isEmpty(a.getStringExtra("FILE_PATH")))
                        {
                            b.stopSelf();
                        }
                    }

            
            {
                b = LoadingPermissionDataService.this;
                a = intent;
                super();
            }
                })).start();
                return 1;
            }
            if ("com.qihoo360.mobilesafe.shield.pkgsavailable".equals(s))
            {
                (new Thread(new Runnable(intent) {

                    final Intent a;
                    final LoadingPermissionDataService b;

                    public void run()
                    {
                        String as[] = a.getStringArrayExtra("pkgslist");
                        f.a().a(as);
                    }

            
            {
                b = LoadingPermissionDataService.this;
                a = intent;
                super();
            }
                })).start();
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public boolean onUnbind(Intent intent)
    {
        return super.onUnbind(intent);
    }
}
