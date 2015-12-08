// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.es;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class yI extends es
{

    final RemoteMediaPlayer yI;

    protected void onMetadataUpdated()
    {
        RemoteMediaPlayer.b(yI);
    }

    protected void onStatusUpdated()
    {
        RemoteMediaPlayer.a(yI);
    }

    (RemoteMediaPlayer remotemediaplayer)
    {
        yI = remotemediaplayer;
        super();
    }
}
