// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.spotify.mobile.android.service:
//            SpotifyService

final class a extends BroadcastReceiver
{

    private SpotifyService a;

    public final void onReceive(Context context, Intent intent)
    {
        SpotifyService.r(a);
    }

    _cls9(SpotifyService spotifyservice)
    {
        a = spotifyservice;
        super();
    }
}
