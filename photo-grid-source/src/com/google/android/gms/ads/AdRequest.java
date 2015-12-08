// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.mediation.NetworkExtras;
import java.util.Date;
import java.util.Set;

public final class AdRequest
{

    public static final String DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    private final zzy a;

    private AdRequest(Builder builder)
    {
        a = new zzy(Builder.a(builder));
    }

    AdRequest(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final Date getBirthday()
    {
        return a.getBirthday();
    }

    public final String getContentUrl()
    {
        return a.getContentUrl();
    }

    public final Bundle getCustomEventExtrasBundle(Class class1)
    {
        return a.getCustomEventExtrasBundle(class1);
    }

    public final int getGender()
    {
        return a.getGender();
    }

    public final Set getKeywords()
    {
        return a.getKeywords();
    }

    public final Location getLocation()
    {
        return a.getLocation();
    }

    public final NetworkExtras getNetworkExtras(Class class1)
    {
        return a.getNetworkExtras(class1);
    }

    public final Bundle getNetworkExtrasBundle(Class class1)
    {
        return a.getNetworkExtrasBundle(class1);
    }

    public final boolean isTestDevice(Context context)
    {
        return a.isTestDevice(context);
    }

    public final zzy zzaF()
    {
        return a;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzy.DEVICE_ID_EMULATOR;
    }

    private class Builder
    {

        private final com.google.android.gms.ads.internal.client.zzy.zza a = new com.google.android.gms.ads.internal.client.zzy.zza();

        static com.google.android.gms.ads.internal.client.zzy.zza a(Builder builder)
        {
            return builder.a;
        }

        public final Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            a.zzb(class1, bundle);
            return this;
        }

        public final Builder addKeyword(String s)
        {
            a.zzF(s);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkextras)
        {
            a.zza(networkextras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            a.zza(class1, bundle);
            if (class1.equals(com/google/ads/mediation/admob/AdMobAdapter) && bundle.getBoolean("_emulatorLiveAds"))
            {
                a.zzH(AdRequest.DEVICE_ID_EMULATOR);
            }
            return this;
        }

        public final Builder addTestDevice(String s)
        {
            a.zzG(s);
            return this;
        }

        public final AdRequest build()
        {
            return new AdRequest(this, (byte)0);
        }

        public final Builder setBirthday(Date date)
        {
            a.zza(date);
            return this;
        }

        public final Builder setContentUrl(String s)
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
            a.zzI(s);
            return this;
        }

        public final Builder setGender(int i)
        {
            a.zzm(i);
            return this;
        }

        public final Builder setLocation(Location location)
        {
            a.zzb(location);
            return this;
        }

        public final Builder setRequestAgent(String s)
        {
            a.zzK(s);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean flag)
        {
            a.zzj(flag);
            return this;
        }

        public Builder()
        {
            a.zzG(AdRequest.DEVICE_ID_EMULATOR);
        }
    }

}
