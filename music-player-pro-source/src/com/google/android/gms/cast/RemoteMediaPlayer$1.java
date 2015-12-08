// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.it;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class GA extends it
{

    final RemoteMediaPlayer GA;

    protected void onMetadataUpdated()
    {
        RemoteMediaPlayer.b(GA);
    }

    protected void onStatusUpdated()
    {
        RemoteMediaPlayer.a(GA);
    }

    (RemoteMediaPlayer remotemediaplayer)
    {
        GA = remotemediaplayer;
        super();
    }
}
