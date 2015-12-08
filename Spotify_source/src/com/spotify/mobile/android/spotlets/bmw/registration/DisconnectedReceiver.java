// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.bmw.registration;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.bmw.service.BmwService;

public class DisconnectedReceiver extends BroadcastReceiver
{

    public DisconnectedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        context.stopService(new Intent(context, com/spotify/mobile/android/spotlets/bmw/service/BmwService));
    }
}
