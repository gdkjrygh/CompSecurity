// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.z;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class D_EMULATOR
{

    private final com.google.android.gms.ads.internal.client. zznO = new com.google.android.gms.ads.internal.client.();

    static com.google.android.gms.ads.internal.client. zza(D_EMULATOR d_emulator)
    {
        return d_emulator.zznO;
    }

    public zznO addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        zznO.(class1, bundle);
        return this;
    }

    public x.zza.zzb addKeyword(String s)
    {
        zznO.(s);
        return this;
    }

    public xtras addNetworkExtras(NetworkExtras networkextras)
    {
        zznO.(networkextras);
        return this;
    }

    public xtras addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zznO.(class1, bundle);
        if (class1.equals(com/google/ads/mediation/admob/AdMobAdapter) && bundle.getBoolean("_emulatorLiveAds"))
        {
            zznO.(AdRequest.DEVICE_ID_EMULATOR);
        }
        return this;
    }

    public D_EMULATOR addTestDevice(String s)
    {
        zznO.(s);
        return this;
    }

    public AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public x.zza.zzG setBirthday(Date date)
    {
        zznO.(date);
        return this;
    }

    public x.zza.zza setContentUrl(String s)
    {
        z.a(s, "Content URL must be non-null.");
        z.a(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        z.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        zznO.(s);
        return this;
    }

    public x.zza.zzI setGender(int i)
    {
        zznO.(i);
        return this;
    }

    public x.zza.zzm setLocation(Location location)
    {
        zznO.(location);
        return this;
    }

    public x.zza.zza setRequestAgent(String s)
    {
        zznO.(s);
        return this;
    }

    public x.zza.zzK tagForChildDirectedTreatment(boolean flag)
    {
        zznO.(flag);
        return this;
    }

    public xtras()
    {
        zznO.(AdRequest.DEVICE_ID_EMULATOR);
    }
}
