// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.media.MediaPlayer;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzi, zzg

class zzAk
    implements Runnable
{

    final MediaPlayer zzAk;
    final zzi zzAl;

    public void run()
    {
        if (zzi.zza(zzAl) != null)
        {
            zzi.zza(zzAl).onPrepared(zzAk);
        }
    }

    (zzi zzi1, MediaPlayer mediaplayer)
    {
        zzAl = zzi1;
        zzAk = mediaplayer;
        super();
    }
}
