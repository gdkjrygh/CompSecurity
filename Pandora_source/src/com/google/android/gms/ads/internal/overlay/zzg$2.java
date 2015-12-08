// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.internal.overlay;

import android.content.Context;
import android.widget.VideoView;

// Referenced classes of package com.google.android.gms.ads.internal.overlay:
//            zzg

class a extends VideoView
{

    final zzg a;

    protected void onWindowVisibilityChanged(int i)
    {
        super.onWindowVisibilityChanged(i);
        if (i == 0 && zzg.zza(a) == null)
        {
            zzg.zzb(a);
        }
        if (i == 8)
        {
            zzg.zza(a, zzg.zzc(a));
            zzg.zza(a, null);
        }
    }

    (zzg zzg1, Context context)
    {
        a = zzg1;
        super(context);
    }
}
