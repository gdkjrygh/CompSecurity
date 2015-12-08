// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.music.spotlets.radio.service;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.spotify.music.spotlets.radio.service:
//            RadioActionsService

final class a
    implements ServiceConnection
{

    private RadioActionsService a;

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        RadioActionsService.e(a);
        RadioActionsService.f(a);
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
    }

    (RadioActionsService radioactionsservice)
    {
        a = radioactionsservice;
        super();
    }
}
