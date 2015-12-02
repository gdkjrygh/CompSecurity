// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.antivirus.list;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;

public class PackageReceiver extends BroadcastReceiver
{
    public static interface a
    {

        public abstract void a(String s);

        public abstract void b(String s);

        public abstract void c(String s);
    }


    private a a;

    public PackageReceiver()
    {
    }

    public PackageReceiver(a a1)
    {
        a = a1;
    }

    public void a(Context context)
    {
        try
        {
            IntentFilter intentfilter = new IntentFilter();
            intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
            intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
            intentfilter.addAction("android.intent.action.PACKAGE_REPLACED");
            intentfilter.setPriority(999);
            intentfilter.addDataScheme("package");
            context.registerReceiver(this, intentfilter);
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
        if (intent != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s;
        boolean flag;
        boolean flag1;
        context = intent.getData().getEncodedSchemeSpecificPart();
        s = intent.getAction();
        flag = intent.getBooleanExtra("android.intent.extra.DATA_REMOVED", false);
        flag1 = intent.getBooleanExtra("android.intent.extra.REPLACING", false);
        if (!"android.intent.action.PACKAGE_ADDED".equals(s))
        {
            break; /* Loop/switch isn't completed */
        }
        if (a != null && !flag && !flag1)
        {
            a.a(context);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (!"android.intent.action.PACKAGE_REPLACED".equals(s))
        {
            continue; /* Loop/switch isn't completed */
        }
        if (a == null) goto _L1; else goto _L4
_L4:
        a.c(context);
        return;
        if (!"android.intent.action.PACKAGE_REMOVED".equals(s) || a == null || !flag || flag1) goto _L1; else goto _L5
_L5:
        a.b(context);
        return;
    }
}
