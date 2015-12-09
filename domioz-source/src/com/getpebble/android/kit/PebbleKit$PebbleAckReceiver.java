// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.getpebble.android.kit;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.util.UUID;

public abstract class subscribedUuid extends BroadcastReceiver
{

    private final UUID subscribedUuid;

    public void onReceive(Context context, Intent intent)
    {
        receiveAck(context, intent.getIntExtra("transaction_id", -1));
    }

    public abstract void receiveAck(Context context, int i);

    protected (UUID uuid)
    {
        subscribedUuid = uuid;
    }
}
