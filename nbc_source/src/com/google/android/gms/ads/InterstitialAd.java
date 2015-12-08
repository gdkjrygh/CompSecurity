// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzz;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest, AdListener

public final class InterstitialAd
{

    private final zzz zznQ;

    public InterstitialAd(Context context)
    {
        zznQ = new zzz(context);
    }

    public void loadAd(AdRequest adrequest)
    {
        zznQ.zza(adrequest.zzaF());
    }

    public void setAdListener(AdListener adlistener)
    {
        zznQ.setAdListener(adlistener);
        if (adlistener != null && (adlistener instanceof zza))
        {
            zznQ.zza((zza)adlistener);
        } else
        if (adlistener == null)
        {
            zznQ.zza(null);
            return;
        }
    }

    public void setAdUnitId(String s)
    {
        zznQ.setAdUnitId(s);
    }

    public void show()
    {
        zznQ.show();
    }
}
