// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.bmw.registration;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.spotify.mobile.android.spotlets.bmw.service.BmwService;

public class ConnectedReceiver extends BroadcastReceiver
{

    public ConnectedReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        Intent intent1 = new Intent(context, com/spotify/mobile/android/spotlets/bmw/service/BmwService);
        intent1.putExtras(intent);
        context.startService(intent1);
    }
}
