// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.appbox.ui.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

public class AppBoxReceiver extends BroadcastReceiver
{
    public static interface a
    {

        public abstract void b(String s);

        public abstract void c(String s);

        public abstract void g();
    }


    private a a;

    public AppBoxReceiver()
    {
    }

    public AppBoxReceiver(a a1)
    {
        a = a1;
    }

    public void a(Context context)
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("_qihoo_AppBox_APPLICATION_INSTALL");
        intentfilter.addAction("_qihoo_AppBox_APPLICATION_UNINSTALL");
        intentfilter.addAction("_qihoo_AppBox_APPLICATION_REFRESH");
        context.registerReceiver(this, intentfilter, "com.qihoo.security.lite.PERMISSION", null);
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getStringExtra("packageName");
        intent = intent.getAction();
        if (!"_qihoo_AppBox_APPLICATION_INSTALL".equals(intent)) goto _L2; else goto _L1
_L1:
        if (a != null)
        {
            a.b(context);
        }
_L4:
        return;
_L2:
        if (!"_qihoo_AppBox_APPLICATION_UNINSTALL".equals(intent))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a == null) goto _L4; else goto _L3
_L3:
        a.c(context);
        return;
        if (!"_qihoo_AppBox_APPLICATION_REFRESH".equals(intent) || a == null) goto _L4; else goto _L5
_L5:
        a.g();
        return;
    }
}
