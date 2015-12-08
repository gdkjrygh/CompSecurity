// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import me.lyft.android.LyftApplication;

public class BaseBrodcastReceiver extends BroadcastReceiver
{

    public BaseBrodcastReceiver()
    {
    }

    protected void handleReceive(Context context, Intent intent)
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        ((LyftApplication)context.getApplicationContext()).inject(this);
        handleReceive(context, intent);
    }
}
