// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.cast.internal.zzm;

// Referenced classes of package com.google.android.gms.cast:
//            RemoteMediaPlayer

class a extends zzm
{

    final RemoteMediaPlayer a;

    protected void onMetadataUpdated()
    {
        RemoteMediaPlayer.zzb(a);
    }

    protected void onStatusUpdated()
    {
        RemoteMediaPlayer.zza(a);
    }

    (RemoteMediaPlayer remotemediaplayer, String s)
    {
        a = remotemediaplayer;
        super(s);
    }
}
