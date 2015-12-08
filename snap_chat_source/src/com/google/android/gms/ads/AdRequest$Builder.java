// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import di;
import java.util.Date;

// Referenced classes of package com.google.android.gms.ads:
//            AdRequest

public static final class D_EMULATOR
{

    private final com.google.android.gms.internal.LATOR zzlh = new com.google.android.gms.internal.LATOR();

    static com.google.android.gms.internal.LATOR zza(D_EMULATOR d_emulator)
    {
        return d_emulator.zzlh;
    }

    public final zzlh addKeyword(String s)
    {
        zzlh.LATOR(s);
        return this;
    }

    public final zzlh addNetworkExtrasBundle(Class class1, Bundle bundle)
    {
        zzlh.LATOR(class1, bundle);
        if (class1.equals(di) && bundle.getBoolean("_emulatorLiveAds"))
        {
            zzlh.LATOR(AdRequest.DEVICE_ID_EMULATOR);
        }
        return this;
    }

    public final D_EMULATOR addTestDevice(String s)
    {
        zzlh.LATOR(s);
        return this;
    }

    public final AdRequest build()
    {
        return new AdRequest(this, null);
    }

    public final zzlh setBirthday(Date date)
    {
        zzlh.LATOR(date);
        return this;
    }

    public final zzlh setGender(int i)
    {
        zzlh.LATOR(i);
        return this;
    }

    public final zzlh setLocation(Location location)
    {
        zzlh.LATOR(location);
        return this;
    }

    public final zzlh tagForChildDirectedTreatment(boolean flag)
    {
        zzlh.LATOR(flag);
        return this;
    }

    public ()
    {
        zzlh.(AdRequest.DEVICE_ID_EMULATOR);
    }
}
