// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.qihoo360.common.utils.Utils;
import com.qihoo360.mobilesafe.b.b;

public class CommonReceiver extends BroadcastReceiver
{
    public static interface a
    {

        public abstract void a();

        public abstract void a(int i);

        public abstract void c();

        public abstract void c(String s);
    }


    private static final String a = com/qihoo/security/receiver/CommonReceiver.getSimpleName();
    private final com.qihoo.security.notify.b b;
    private long c;
    private final a d;

    public CommonReceiver(com.qihoo.security.notify.b b1, a a1)
    {
        b = b1;
        d = a1;
        c = 0L;
    }

    public void a(Context context)
    {
        try
        {
            IntentFilter intentfilter = new IntentFilter("android.intent.action.SCREEN_OFF");
            intentfilter.addAction("android.intent.action.SCREEN_ON");
            intentfilter.addAction("android.intent.action.PHONE_STATE");
            IntentFilter intentfilter1 = new IntentFilter();
            intentfilter1.addAction("com.qihoo.security.action.RELOAD_CONFIG");
            context.registerReceiver(this, intentfilter);
            context.registerReceiver(this, intentfilter1, "com.qihoo.security.lite.PERMISSION", null);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public void b(Context context)
    {
        try
        {
            context.unregisterReceiver(this);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if (!TextUtils.isEmpty(s)) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (!s.equals("android.intent.action.SCREEN_ON"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (d != null)
        {
            d.a();
        }
        long l = System.currentTimeMillis();
        if (l - c >= 30000L || l <= c)
        {
            c = l;
            com.qihoo360.mobilesafe.b.b.a();
            if (b != null)
            {
                b.c();
                return;
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!s.equals("android.intent.action.SCREEN_OFF"))
        {
            break; /* Loop/switch isn't completed */
        }
        if (d != null)
        {
            d.c();
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
        if (!"android.intent.action.PHONE_STATE".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (d != null)
        {
            context = (TelephonyManager)Utils.getSystemService(context, "phone");
            d.a(context.getCallState());
            return;
        }
        continue; /* Loop/switch isn't completed */
        if (!"com.qihoo.security.action.RELOAD_CONFIG".equals(s)) goto _L1; else goto _L5
_L5:
        context = intent.getExtras();
        if (context != null)
        {
            context = context.getString("CONFIG_FILENAME");
            if (!TextUtils.isEmpty(context))
            {
                d.c(context);
                return;
            }
        }
        if (true) goto _L1; else goto _L6
_L6:
    }

}
