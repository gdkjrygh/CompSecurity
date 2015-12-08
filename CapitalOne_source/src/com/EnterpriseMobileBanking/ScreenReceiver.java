// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.EnterpriseMobileBanking;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class ScreenReceiver extends BroadcastReceiver
{

    public static boolean mScreenOnFlag = true;

    public ScreenReceiver()
    {
    }

    public static boolean getScreenFlag()
    {
        return mScreenOnFlag;
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.SCREEN_OFF"))
        {
            mScreenOnFlag = false;
        } else
        if (intent.getAction().equals("android.intent.action.SCREEN_ON"))
        {
            mScreenOnFlag = true;
            return;
        }
    }

}
