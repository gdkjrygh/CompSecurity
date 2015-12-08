// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.photos.analytics.alive;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dtb;
import mtj;

public final class AliveLogReceiver extends BroadcastReceiver
{

    public AliveLogReceiver()
    {
    }

    public final void onReceive(Context context, Intent intent)
    {
        mtj.a(context, new dtb(intent));
    }
}
