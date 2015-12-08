// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.zzv;
import java.util.Date;
import p.br.a;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class D_EMULATOR
{

    private final com.google.android.gms.ads.internal.client. zzlZ = new com.google.android.gms.ads.internal.client.();

    static com.google.android.gms.ads.internal.client. zza(D_EMULATOR d_emulator)
    {
        return d_emulator.zzlZ;
    }

    public zzlZ addCustomEventExtrasBundle(Class class1, Bundle bundle)
    {
        zzlZ.(class1, bundle);
        return this;
    }

    public t.zza.zzb addKeyword(String s)
    {
        zzlZ.(s);
        return this;
    }

    public xtras addNetworkExtras(NetworkExtras networkextras)
    {
        zzlZ.(networkextras);
        return this;
    }

    public xtras addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zzlZ.(class1, bundle);
        if (class1.equals(p/br/a) && bundle.getBoolean("_emulatorLiveAds"))
        {
            zzlZ.(AdRequest.DEVICE_ID_EMULATOR);
        }
        return this;
    }

    public D_EMULATOR addTestDevice(String s)
    {
        zzlZ.(s);
        return this;
    }

    public AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public t.zza.zzu setBirthday(Date date)
    {
        zzlZ.(date);
        return this;
    }

    public t.zza.zza setContentUrl(String s)
    {
        zzv.zzb(s, "Content URL must be non-null.");
        zzv.zzh(s, "Content URL must be non-empty.");
        boolean flag;
        if (s.length() <= 512)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        zzv.zzb(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
            Integer.valueOf(512), Integer.valueOf(s.length())
        });
        zzlZ.(s);
        return this;
    }

    public t.zza.zzw setGender(int i)
    {
        zzlZ.(i);
        return this;
    }

    public t.zza.zzi setLocation(Location location)
    {
        zzlZ.(location);
        return this;
    }

    public t.zza.zza setRequestAgent(String s)
    {
        zzlZ.(s);
        return this;
    }

    public t.zza.zzy tagForChildDirectedTreatment(boolean flag)
    {
        zzlZ.(flag);
        return this;
    }

    public xtras()
    {
        zzlZ.(AdRequest.DEVICE_ID_EMULATOR);
    }
}
