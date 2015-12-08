// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class D_EMULATOR
{

    private final com.google.android.gms.ads.internal.client. zznL = new com.google.android.gms.ads.internal.client.();

    static com.google.android.gms.ads.internal.client. zza(D_EMULATOR d_emulator)
    {
        return d_emulator.zznL;
    }

    public zznL addKeyword(String s)
    {
        zznL.(s);
        return this;
    }

    public x.zza.zzE addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zznL.(class1, bundle);
        if (class1.equals(com/google/ads/mediation/admob/AdMobAdapter) && bundle.getBoolean("_emulatorLiveAds"))
        {
            zznL.(AdRequest.DEVICE_ID_EMULATOR);
        }
        return this;
    }

    public D_EMULATOR addTestDevice(String s)
    {
        zznL.(s);
        return this;
    }

    public AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public x.zza.zzF setBirthday(Date date)
    {
        zznL.(date);
        return this;
    }

    public x.zza.zza setGender(int i)
    {
        zznL.(i);
        return this;
    }

    public x.zza.zzm setLocation(Location location)
    {
        zznL.(location);
        return this;
    }

    public x.zza.zza tagForChildDirectedTreatment(boolean flag)
    {
        zznL.(flag);
        return this;
    }

    public x.zza()
    {
        zznL.(AdRequest.DEVICE_ID_EMULATOR);
    }
}
