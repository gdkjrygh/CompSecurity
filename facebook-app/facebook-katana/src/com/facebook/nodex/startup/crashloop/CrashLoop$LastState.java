// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.nodex.startup.crashloop;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.facebook.loom.logger.Logger;

public class  extends BroadcastReceiver
{

    public void onReceive(Context context, Intent intent)
    {
        int i = Logger.a(2, com.facebook.loom.logger.IFECYCLE_BROADCAST_RECEIVER_START, 0xb210235);
        Logger.a(2, com.facebook.loom.logger.IFECYCLE_BROADCAST_RECEIVER_END, 0xad64777b, i);
    }

    public ()
    {
    }
}
