// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.pandora.android.provider.b;
import com.pandora.radio.data.o;
import com.pandora.radio.util.k;
import java.io.File;
import java.io.IOException;
import p.cw.c;
import p.dw.a;

public class UpgradeBroadcastReceiver extends BroadcastReceiver
{

    public UpgradeBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.MY_PACKAGE_REPLACED")) goto _L2; else goto _L1
_L1:
        return;
_L2:
        int i;
        i = b.a.j();
        Log.d("UpgradeBroadcastReceiver", (new StringBuilder()).append(context.getPackageName()).append(": MY_PACKAGE_REPLACED received, new package ").append("version code = ").append(i).toString());
        if (i >= 6000)
        {
            (new Thread(new File(context.getCacheDir(), "picasso-cache"), context.getFilesDir(), goAsync()) {

                final File a;
                final File b;
                final android.content.BroadcastReceiver.PendingResult c;
                final UpgradeBroadcastReceiver d;

                public void run()
                {
                    if (a.exists() && a.isDirectory())
                    {
                        p.dw.a.a(a);
                        p.dw.a.b(b);
                    }
                    c.finish();
                    return;
                    Object obj;
                    obj;
                    p.df.a.b("UpgradeBroadcastReceiver", "Art cache cleaning failed", ((Throwable) (obj)));
                    c.finish();
                    return;
                    obj;
                    c.finish();
                    throw obj;
                }

            
            {
                d = UpgradeBroadcastReceiver.this;
                a = file;
                b = file1;
                c = pendingresult;
                super();
            }
            }).start();
        }
        intent = b.a.b().j();
        if (intent.w() || i < 6200) goto _L1; else goto _L3
_L3:
        context = com.pandora.radio.util.k.b.a;
        intent = intent.v();
        if (!intent.equals("high")) goto _L5; else goto _L4
_L4:
        context = com.pandora.radio.util.k.b.c;
_L7:
        b.a.b().o().a(context, com.pandora.radio.util.k.c.b);
        return;
_L5:
        if (intent.equals("normal"))
        {
            context = com.pandora.radio.util.k.b.b;
        }
        if (true) goto _L7; else goto _L6
_L6:
    }
}
