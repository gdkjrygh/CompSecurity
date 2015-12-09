// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.x;
import com.google.android.gms.common.internal.z;
import java.util.Date;
import java.util.List;
import java.util.Set;

public final class PublisherAdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.ads.internal.client.zzx.zza zznO = new com.google.android.gms.ads.internal.client.zzx.zza();

        static com.google.android.gms.ads.internal.client.zzx.zza zza(Builder builder)
        {
            return builder.zznO;
        }

        public Builder addCategoryExclusion(String s)
        {
            zznO.zzL(s);
            return this;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            zznO.zzb(class1, bundle);
            return this;
        }

        public Builder addCustomTargeting(String s, String s1)
        {
            zznO.zzb(s, s1);
            return this;
        }

        public Builder addCustomTargeting(String s, List list)
        {
            if (list != null)
            {
                zznO.zzb(s, x.a(",").a(list));
            }
            return this;
        }

        public Builder addKeyword(String s)
        {
            zznO.zzF(s);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            zznO.zza(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            zznO.zza(class1, bundle);
            return this;
        }

        public Builder addTestDevice(String s)
        {
            zznO.zzG(s);
            return this;
        }

        public PublisherAdRequest build()
        {
            return new PublisherAdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            zznO.zza(date);
            return this;
        }

        public Builder setContentUrl(String s)
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
            zznO.zzI(s);
            return this;
        }

        public Builder setGender(int i)
        {
            zznO.zzm(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            zznO.zza(location);
            return this;
        }

        public Builder setManualImpressionsEnabled(boolean flag)
        {
            zznO.setManualImpressionsEnabled(flag);
            return this;
        }

        public Builder setPublisherProvidedId(String s)
        {
            zznO.zzJ(s);
            return this;
        }

        public Builder setRequestAgent(String s)
        {
            zznO.zzK(s);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            zznO.zzj(flag);
            return this;
        }

        public Builder()
        {
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
    private final zzx zznN;

    private PublisherAdRequest(Builder builder)
    {
        zznN = new zzx(Builder.zza(builder));
    }


    public static void updateCorrelator()
    {
        zzx.updateCorrelator();
    }

    public Date getBirthday()
    {
        return zznN.getBirthday();
    }

    public String getContentUrl()
    {
        return zznN.getContentUrl();
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return zznN.getCustomEventExtrasBundle(class1);
    }

    public Bundle getCustomTargeting()
    {
        return zznN.getCustomTargeting();
    }

    public int getGender()
    {
        return zznN.getGender();
    }

    public Set getKeywords()
    {
        return zznN.getKeywords();
    }

    public Location getLocation()
    {
        return zznN.getLocation();
    }

    public boolean getManualImpressionsEnabled()
    {
        return zznN.getManualImpressionsEnabled();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return zznN.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return zznN.getNetworkExtrasBundle(class1);
    }

    public String getPublisherProvidedId()
    {
        return zznN.getPublisherProvidedId();
    }

    public boolean isTestDevice(Context context)
    {
        return zznN.isTestDevice(context);
    }

    public zzx zzaF()
    {
        return zznN;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzx.DEVICE_ID_EMULATOR;
    }
}
