// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.service;

import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import com.qihoo.security.app.UiProcessService;
import com.qihoo.security.dialog.DataFailDialog;
import com.qihoo360.mobilesafe.b.q;
import com.qihoo360.mobilesafe.support.BsPatch;
import java.io.File;

public class BsPatchService extends UiProcessService
{

    private static final String c = com/qihoo/security/service/BsPatchService.getSimpleName();
    private boolean d;

    public BsPatchService()
    {
        d = false;
    }

    static Context a(BsPatchService bspatchservice)
    {
        return bspatchservice.b;
    }

    static Context b(BsPatchService bspatchservice)
    {
        return bspatchservice.b;
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
        super.onStartCommand(intent, i, j);
        if (intent != null)
        {
            String s = intent.getAction();
            if (!d)
            {
                d = true;
                if ("com.qihoo.security.action.ACTION_BSPATCH".equals(s))
                {
                    String s1 = intent.getStringExtra("target_path");
                    intent = intent.getStringExtra("patch_path");
                    if (s1 != null && intent != null && intent.endsWith(".patch"))
                    {
                        File file = new File(s1);
                        if (file.exists() && file.canWrite())
                        {
                            (new Thread(new Runnable(file, s1, intent) {

                                final File a;
                                final String b;
                                final String c;
                                final BsPatchService d;

                                public void run()
                                {
                                    BsPatch.applyPatch(b, b, c);
                                    if (!a.exists() || !a.isFile())
                                    {
                                        Intent intent1 = new Intent(BsPatchService.a(d), com/qihoo/security/dialog/DataFailDialog);
                                        intent1.addFlags(0x10000000);
                                        BsPatchService.b(d).startActivity(intent1);
                                    }
                                    d.stopSelf();
                                }

            
            {
                d = BsPatchService.this;
                a = file;
                b = s;
                c = s1;
                super();
            }
                            })).start();
                            return 1;
                        } else
                        {
                            q.a().a(0x7f0c018c, 0x7f020143);
                            stopSelf();
                            return 1;
                        }
                    } else
                    {
                        stopSelf();
                        return 1;
                    }
                } else
                {
                    stopSelf();
                    return 1;
                }
            }
        }
        return 1;
    }

}
