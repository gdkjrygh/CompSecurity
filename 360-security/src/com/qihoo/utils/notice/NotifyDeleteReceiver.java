// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.utils.notice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NotifyDeleteReceiver extends BroadcastReceiver
{

    public static boolean a = true;

    public NotifyDeleteReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("com.qihoo.security.action.LANGUAGE_UPGRADE".equals(context))
        {
            a = true;
        } else
        {
            if ("com.qihoo.security.action.LANGUAGE_NEW".equals(context))
            {
                a = true;
                return;
            }
            if (!"com.qihoo.security.action.LANGUAGE_AUTO_DOWN_FINISH".equals(context) && !"com.qihoo.security.notify.ACTION_MALWARE".equals(context) && !"com.qihoo.security.notify.ACTION_RISKY_APP".equals(context) && !"com.qihoo.security.notify.ACTION_SAFE_APP".equals(context) && "com.qihoo.security.notify.ACTION_ANTIVIRUS_UPGRADE".equals(context))
            {
                return;
            }
        }
    }

}
