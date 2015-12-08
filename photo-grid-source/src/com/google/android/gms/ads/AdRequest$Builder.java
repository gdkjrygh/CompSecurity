// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.bl;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public final class D_EMULATOR
{

    private final com.google.android.gms.ads.internal.client. a = new com.google.android.gms.ads.internal.client.();

    static com.google.android.gms.ads.internal.client. a(D_EMULATOR d_emulator)
    {
        return d_emulator.a;
    }

    public final a addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        a.(class1, bundle);
        return this;
    }

    public final y.zza.zzb addKeyword(String s)
    {
        a.(s);
        return this;
    }

    public final xtras addNetworkExtras(NetworkExtras networkextras)
    {
        a.(networkextras);
        return this;
    }

    public final xtras addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        a.(class1, bundle);
        if (class1.equals(com/google/ads/mediation/admob/AdMobAdapter) && bundle.getBoolean("_emulatorLiveAds"))
        {
            a.(AdRequest.DEVICE_ID_EMULATOR);
        }
        return this;
    }

    public final D_EMULATOR addTestDevice(String s)
    {
        a.(s);
        return this;
    }

    public final AdRequest build()
    {
        return new AdRequest(this, (byte)0);
    }

    public final y.zza.zzG setBirthday(Date date)
    {
        a.(date);
        return this;
    }

    public final y.zza.zza setContentUrl(String s)
    {
        bl.a(s, "Content URL must be non-null.");
        bl.a(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bl.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        a.(s);
        return this;
    }

    public final y.zza.zzI setGender(int i)
    {
        a.(i);
        return this;
    }

    public final y.zza.zzm setLocation(Location location)
    {
        a.(location);
        return this;
    }

    public final y.zza.zzb setRequestAgent(String s)
    {
        a.(s);
        return this;
    }

    public final y.zza.zzK tagForChildDirectedTreatment(boolean flag)
    {
        a.(flag);
        return this;
    }

    public xtras()
    {
        a.(AdRequest.DEVICE_ID_EMULATOR);
    }
}
