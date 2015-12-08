// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.go;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class Ba extends go
{

    final RemoteMediaPlayer Ba;

    protected void onMetadataUpdated()
    {
        RemoteMediaPlayer.b(Ba);
    }

    protected void onStatusUpdated()
    {
        RemoteMediaPlayer.a(Ba);
    }

    (RemoteMediaPlayer remotemediaplayer)
    {
        Ba = remotemediaplayer;
        super();
    }
}
