// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.scheduler;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import hqj;
import olm;

public final class PowerReceiver extends BroadcastReceiver
{

    public PowerReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        ((hqj)olm.a(context, hqj)).a(intent);
    }
}
