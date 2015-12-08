// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.internal.zzat;
import com.google.android.gms.internal.zzbq;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public final class InterstitialAd
{

    private final zzbq zzlm;

    public InterstitialAd(Context context)
    {
        zzlm = new zzbq(context);
    }

    public final void loadAd(AdRequest adrequest)
    {
        zzlm.zza(adrequest.zzY());
    }

    public final void setAdListener(AdListener adlistener)
    {
        zzlm.setAdListener(adlistener);
        if (adlistener != null && (adlistener instanceof zzat))
        {
            zzlm.zza((zzat)adlistener);
        } else
        if (adlistener == null)
        {
            zzlm.zza(null);
            return;
        }
    }

    public final void setAdUnitId(String s)
    {
        zzlm.setAdUnitId(s);
    }

    public final void show()
    {
        zzlm.show();
    }
}
