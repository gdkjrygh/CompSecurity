// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.iq;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class FK extends iq
{

    final RemoteMediaPlayer FK;

    protected void onMetadataUpdated()
    {
        RemoteMediaPlayer.b(FK);
    }

    protected void onStatusUpdated()
    {
        RemoteMediaPlayer.a(FK);
    }

    (RemoteMediaPlayer remotemediaplayer)
    {
        FK = remotemediaplayer;
        super();
    }
}
