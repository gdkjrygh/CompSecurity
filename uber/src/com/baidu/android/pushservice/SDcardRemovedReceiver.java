// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.baidu.android.pushservice;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.baidu.android.pushservice.util.PushDatabase;
import com.baidu.frontia.a.b.a.a;

public class SDcardRemovedReceiver extends BroadcastReceiver
{

    private static String a = "SDRev";

    public SDcardRemovedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        if (intent.getAction().equals("android.intent.action.MEDIA_BAD_REMOVAL") || intent.getAction().equals("android.intent.action.MEDIA_REMOVED"))
        {
            com.baidu.frontia.a.b.a.a.b(a, "sdcard removed");
            PushDatabase.close();
        }
    }

}
