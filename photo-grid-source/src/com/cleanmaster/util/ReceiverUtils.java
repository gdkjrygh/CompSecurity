// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import com.cleanmaster.func.cache.a;

public class ReceiverUtils extends BroadcastReceiver
{

    private static ReceiverUtils a;

    public ReceiverUtils()
    {
    }

    public static void a(Context context)
    {
        if (context == null)
        {
            return;
        }
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("android.intent.action.PACKAGE_ADDED");
        intentfilter.addAction("android.intent.action.PACKAGE_REMOVED");
        intentfilter.addDataScheme("package");
        if (a == null)
        {
            a = new ReceiverUtils();
        }
        context.registerReceiver(a, intentfilter);
    }

    public void onReceive(Context context, Intent intent)
    {
        String s = intent.getAction();
        if ("android.intent.action.PACKAGE_ADDED".equals(s))
        {
            intent = intent.getData();
            if (intent != null)
            {
                intent = intent.getSchemeSpecificPart();
            } else
            {
                intent = "";
            }
            com.cleanmaster.func.cache.a.a().a(intent, context);
        } else
        if ("android.intent.action.PACKAGE_REMOVED".equals(s))
        {
            context = intent.getData();
            if (context != null)
            {
                context = context.getSchemeSpecificPart();
            } else
            {
                context = "";
            }
            com.cleanmaster.func.cache.a.a().a(context);
            return;
        }
    }
}
