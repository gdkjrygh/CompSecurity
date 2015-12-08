// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;

// Referenced classes of package com.google.android.gms.internal:
//            zzeo, zzat, zzab, zzei, 
//            zzhy, zzme

public class zzem
{

    public zzem()
    {
    }

    public void zza(Context context, zzeo zzeo1)
    {
        zza(context, zzeo1, true);
    }

    public void zza(Context context, zzeo zzeo1, boolean flag)
    {
        if (zzeo1.zzuw == 4 && zzeo1.zzup == null)
        {
            if (zzeo1.zzuo != null)
            {
                zzeo1.zzuo.onAdClicked();
            }
            zzab.zzaJ().zza(context, zzeo1.zzun, zzeo1.zzuv);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, "com.google.android.gms.ads.AdActivity");
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", zzeo1.zzlP.zzzK);
        intent.putExtra("shouldCallOnOverlayOpened", flag);
        zzeo.zza(intent, zzeo1);
        if (!zzme.zzkk())
        {
            intent.addFlags(0x80000);
        }
        if (!(context instanceof Activity))
        {
            intent.addFlags(0x10000000);
        }
        context.startActivity(intent);
    }
}
