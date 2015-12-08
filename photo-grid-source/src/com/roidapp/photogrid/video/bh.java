// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.video;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.IBinder;

// Referenced classes of package com.roidapp.photogrid.video:
//            k, TrackSelector

final class bh
    implements ServiceConnection
{

    final TrackSelector a;

    private bh(TrackSelector trackselector)
    {
        a = trackselector;
        super();
    }

    bh(TrackSelector trackselector, byte byte0)
    {
        this(trackselector);
    }

    public final void onServiceConnected(ComponentName componentname, IBinder ibinder)
    {
        TrackSelector.a(a, ((k)ibinder).a);
        TrackSelector.b(a).startService(TrackSelector.K(a));
    }

    public final void onServiceDisconnected(ComponentName componentname)
    {
        TrackSelector.a(a, null);
    }
}
