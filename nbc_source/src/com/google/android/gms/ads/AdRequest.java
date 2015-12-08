// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.internal.client.zzx;
import java.util.Date;

public final class AdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.ads.internal.client.zzx.zza zznL = new com.google.android.gms.ads.internal.client.zzx.zza();

        static com.google.android.gms.ads.internal.client.zzx.zza zza(Builder builder)
        {
            return builder.zznL;
        }

        public Builder addKeyword(String s)
        {
            zznL.zzE(s);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            zznL.zza(class1, bundle);
            if (class1.equals(com/google/ads/mediation/admob/AdMobAdapter) && bundle.getBoolean("_emulatorLiveAds"))
            {
                zznL.zzG(AdRequest.DEVICE_ID_EMULATOR);
            }
            return this;
        }

        public Builder addTestDevice(String s)
        {
            zznL.zzF(s);
            return this;
        }

        public AdRequest build()
        {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            zznL.zza(date);
            return this;
        }

        public Builder setGender(int i)
        {
            zznL.zzm(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            zznL.zza(location);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            zznL.zzk(flag);
            return this;
        }

        public Builder()
        {
            zznL.zzF(AdRequest.DEVICE_ID_EMULATOR);
        }
    }


    public static final String DEVICE_ID_EMULATOR;
    private final zzx zznK;

    private AdRequest(Builder builder)
    {
        zznK = new zzx(Builder.zza(builder));
    }


    public zzx zzaF()
    {
        return zznK;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzx.DEVICE_ID_EMULATOR;
    }
}
