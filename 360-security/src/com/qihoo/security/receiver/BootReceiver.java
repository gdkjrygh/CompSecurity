// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.receiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.qihoo.security.service.SecurityService;
import com.qihoo.security.v5.UpdateService;
import com.qihoo360.mobilesafe.b.a;
import com.qihoo360.mobilesafe.share.SharedPref;

public abstract class BootReceiver extends BroadcastReceiver
{

    public BootReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        while (intent == null || !SharedPref.b(context, "setting_auto_start", true) || !SharedPref.b(context, "license", false) || SecurityService.a) 
        {
            return;
        }
        if (SharedPref.c(context))
        {
            UpdateService.a();
            return;
        } else
        {
            a.f(context);
            return;
        }
    }
}
