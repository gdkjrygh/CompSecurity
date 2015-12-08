// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.internal.zzbo;
import di;
import java.util.Date;

public final class AdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.zzbo.zza zzlh = new com.google.android.gms.internal.zzbo.zza();

        static com.google.android.gms.internal.zzbo.zza zza(Builder builder)
        {
            return builder.zzlh;
        }

        public final Builder addKeyword(String s)
        {
            zzlh.zzr(s);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            zzlh.zza(class1, bundle);
            if (class1.equals(di) && bundle.getBoolean("_emulatorLiveAds"))
            {
                zzlh.zzt(AdRequest.DEVICE_ID_EMULATOR);
            }
            return this;
        }

        public final Builder addTestDevice(String s)
        {
            zzlh.zzs(s);
            return this;
        }

        public final AdRequest build()
        {
            return new AdRequest(this);
        }

        public final Builder setBirthday(Date date)
        {
            zzlh.zza(date);
            return this;
        }

        public final Builder setGender(int i)
        {
            zzlh.zzh(i);
            return this;
        }

        public final Builder setLocation(Location location)
        {
            zzlh.zza(location);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean flag)
        {
            zzlh.zzk(flag);
            return this;
        }

        public Builder()
        {
            zzlh.zzs(AdRequest.DEVICE_ID_EMULATOR);
        }
    }


    public static final String DEVICE_ID_EMULATOR;
    private final zzbo zzlg;

    private AdRequest(Builder builder)
    {
        zzlg = new zzbo(Builder.zza(builder));
    }


    final zzbo zzY()
    {
        return zzlg;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzbo.DEVICE_ID_EMULATOR;
    }
}
