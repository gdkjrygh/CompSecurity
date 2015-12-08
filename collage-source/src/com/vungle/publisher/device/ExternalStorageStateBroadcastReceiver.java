// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.device;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.vungle.publisher.bm;
import com.vungle.publisher.bn;
import com.vungle.publisher.event.EventBus;

public class ExternalStorageStateBroadcastReceiver extends BroadcastReceiver
{

    public Context a;
    EventBus b;

    ExternalStorageStateBroadcastReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context = intent.getAction();
        if ("android.intent.action.MEDIA_MOUNTED".equals(context))
        {
            b.a(new bm());
        } else
        if ("android.intent.action.MEDIA_UNMOUNTED".equals(context))
        {
            b.a(new bn());
            return;
        }
    }
}
