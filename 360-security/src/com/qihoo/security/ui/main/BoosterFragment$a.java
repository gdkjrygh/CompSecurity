// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.ui.main;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.qihoo360.mobilesafe.share.SharedPref;

// Referenced classes of package com.qihoo.security.ui.main:
//            BoosterFragment

private class <init> extends BroadcastReceiver
{

    final BoosterFragment a;

    public void onReceive(Context context, Intent intent)
    {
        boolean flag = false;
        if (intent != null && "android.intent.action.BATTERY_CHANGED".equals(intent.getAction()))
        {
            int i = intent.getIntExtra("level", 0);
            int j = intent.getIntExtra("scale", 100);
            BoosterFragment.d(a, (i * 100) / j);
            i = intent.getIntExtra("temperature", 0);
            if (Math.round((float)i / 10F) != Math.round((float)BoosterFragment.y(a) / 10F))
            {
                flag = true;
            }
            if (flag)
            {
                BoosterFragment.e(a, i);
                SharedPref.a(BoosterFragment.f(a), "sp_key_battery_temperature", i);
            }
        }
    }

    private (BoosterFragment boosterfragment)
    {
        a = boosterfragment;
        super();
    }

    a(BoosterFragment boosterfragment, a a1)
    {
        this(boosterfragment);
    }
}
