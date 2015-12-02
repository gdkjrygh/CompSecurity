// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.baidu.android.pushservice.c.b;
import com.baidu.android.pushservice.c.g;
import com.baidu.android.pushservice.c.h;
import com.baidu.android.pushservice.c.j;
import com.baidu.android.pushservice.c.l;

// Referenced classes of package com.baidu.android.pushservice:
//            a, PushSettings, ab

public class RegistrationReceiver extends BroadcastReceiver
{

    private static final String TAG = "RegistrationReceiver";

    public RegistrationReceiver()
    {
    }

    private static void handleRegisterLappSync(Context context, Intent intent)
    {
        intent = intent.getStringExtra("r_sync_from");
        if (context.getPackageName().equals(intent))
        {
            return;
        } else
        {
            g.a(context).b();
            return;
        }
    }

    private static void handleRegisterSDKSync(Context context, Intent intent)
    {
        intent = intent.getStringExtra("r_sync_sdk_from");
        if (context.getPackageName().equals(intent))
        {
            return;
        } else
        {
            j.a(context).b();
            return;
        }
    }

    private static void handleRegisterSync(Context context, Intent intent)
    {
        String s = intent.getStringExtra("r_sync_from");
        if (!context.getPackageName().equals(s))
        {
            String s1 = intent.getStringExtra("r_sync_rdata");
            if (s1 != null)
            {
                if (com.baidu.android.pushservice.a.b())
                {
                    Log.i("RegistrationReceiver", (new StringBuilder("handleRegisterSync rdatav1: ")).append(s1).append(" from: ").append(s).toString());
                }
                b.a(context).a(context, "r", s1);
            }
            intent = intent.getStringExtra("r_sync_rdata_v2");
            if (intent != null)
            {
                if (com.baidu.android.pushservice.a.b())
                {
                    Log.i("RegistrationReceiver", (new StringBuilder("handleRegisterSync rdataV2: ")).append(s1).append(" from: ").append(s).toString());
                }
                b.a(context).a(context, "r_v2", intent);
                return;
            }
        }
    }

    private static void handleRegisterWebSync(Context context, Intent intent)
    {
        intent = intent.getStringExtra("r_sync_from");
        if (context.getPackageName().equals(intent))
        {
            return;
        } else
        {
            l.a(context).b();
            return;
        }
    }

    static void packageUninstalled(Context context, h h1)
    {
        Intent intent = new Intent();
        intent.setAction("com.baidu.android.pushservice.action.METHOD");
        intent.putExtra("method", "com.baidu.android.pushservice.action.UNBINDAPP");
        intent.putExtra("package_name", h1.c());
        intent.putExtra("app_id", h1.a());
        intent.putExtra("user_id", h1.e);
        a.a(context, intent);
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if ("android.intent.action.PACKAGE_REMOVED".equals(s))
        {
            s = intent.getData().getSchemeSpecificPart();
            boolean flag = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
            Log.i("RegistrationReceiver", (new StringBuilder("start for ACTION_PACKAGE_REMOVED\uFF0Creplacing\uFF1A")).append(flag).append(" ,packageName: ").append(s).toString());
            if (!flag)
            {
                PushSettings.a(context, s);
            }
            h h1 = b.a(context).a(s);
            if (!flag && h1 != null && !context.getPackageName().equals(h1.c()))
            {
                Log.i("RegistrationReceiver", (new StringBuilder("unregister registered push client : ")).append(s).toString());
                packageUninstalled(context, h1);
                return;
            } else
            {
                Log.i("RegistrationReceiver", (new StringBuilder("replacing or not registered push client : ")).append(s).toString());
                a.a(context, intent);
                return;
            }
        } else
        {
            (new Thread(new ab(this, s, intent, context))).start();
            a.a(context, intent);
            return;
        }
    }




}
