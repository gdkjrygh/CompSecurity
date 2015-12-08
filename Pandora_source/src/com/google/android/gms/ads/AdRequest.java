// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzt;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.zzv;
import java.util.Date;
import java.util.Set;
import p.br.a;

public final class AdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.ads.internal.client.zzt.zza zzlZ = new com.google.android.gms.ads.internal.client.zzt.zza();

        static com.google.android.gms.ads.internal.client.zzt.zza zza(Builder builder)
        {
            return builder.zzlZ;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            zzlZ.zzb(class1, bundle);
            return this;
        }

        public Builder addKeyword(String s)
        {
            zzlZ.zzt(s);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            zzlZ.zza(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            zzlZ.zza(class1, bundle);
            if (class1.equals(p/br/a) && bundle.getBoolean("_emulatorLiveAds"))
            {
                zzlZ.zzv(AdRequest.DEVICE_ID_EMULATOR);
            }
            return this;
        }

        public Builder addTestDevice(String s)
        {
            zzlZ.zzu(s);
            return this;
        }

        public AdRequest build()
        {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            zzlZ.zza(date);
            return this;
        }

        public Builder setContentUrl(String s)
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
            zzlZ.zzw(s);
            return this;
        }

        public Builder setGender(int i)
        {
            zzlZ.zzi(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            zzlZ.zza(location);
            return this;
        }

        public Builder setRequestAgent(String s)
        {
            zzlZ.zzy(s);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            zzlZ.zzl(flag);
            return this;
        }

        public Builder()
        {
            zzlZ.zzu(AdRequest.DEVICE_ID_EMULATOR);
        }
    }


    public static final String DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    private final zzt zzlY;

    private AdRequest(Builder builder)
    {
        zzlY = new zzt(Builder.zza(builder));
    }


    public Date getBirthday()
    {
        return zzlY.getBirthday();
    }

    public String getContentUrl()
    {
        return zzlY.getContentUrl();
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return zzlY.getCustomEventExtrasBundle(class1);
    }

    public int getGender()
    {
        return zzlY.getGender();
    }

    public Set getKeywords()
    {
        return zzlY.getKeywords();
    }

    public Location getLocation()
    {
        return zzlY.getLocation();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return zzlY.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return zzlY.getNetworkExtrasBundle(class1);
    }

    public boolean isTestDevice(Context context)
    {
        return zzlY.isTestDevice(context);
    }

    zzt zzac()
    {
        return zzlY;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzt.DEVICE_ID_EMULATOR;
    }
}
