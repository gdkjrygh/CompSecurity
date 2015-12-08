// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.videoplayer;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import dvv;

// Referenced classes of package com.spotify.mobile.android.spotlets.videoplayer:
//            FullscreenVideoActivity

final class a extends BroadcastReceiver
{

    private FullscreenVideoActivity a;

    public final void onReceive(Context context, Intent intent)
    {
        a.startService(dvv.a(a.getApplicationContext(), "com.spotify.mobile.android.service.action.client.FOREGROUND"));
    }

    (FullscreenVideoActivity fullscreenvideoactivity)
    {
        a = fullscreenvideoactivity;
        super();
    }
}
