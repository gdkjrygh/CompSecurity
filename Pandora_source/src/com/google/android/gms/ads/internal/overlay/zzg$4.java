// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.media.MediaPlayer;
import android.widget.VideoView;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

class a
    implements Runnable
{

    final int a;
    final zzg b;

    public void run()
    {
        if (zzg.zza(b) != null)
        {
            zzg.zza(b).seekTo(a);
            zzg.zzd(b).start();
            zzg.zzd(b).pause();
        }
    }

    (zzg zzg1, int i)
    {
        b = zzg1;
        a = i;
        super();
    }
}
