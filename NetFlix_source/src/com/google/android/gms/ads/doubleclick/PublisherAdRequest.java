// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.as;
import com.google.android.gms.internal.fq;
import java.util.Date;
import java.util.Set;

public final class PublisherAdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.as.a kq = new com.google.android.gms.internal.as.a();

        static com.google.android.gms.internal.as.a a(Builder builder)
        {
            return builder.kq;
        }

        public Builder addKeyword(String s)
        {
            kq.g(s);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            kq.a(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            kq.a(class1, bundle);
            return this;
        }

        public Builder addTestDevice(String s)
        {
            kq.h(s);
            return this;
        }

        public PublisherAdRequest build()
        {
            return new PublisherAdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            kq.a(date);
            return this;
        }

        public Builder setContentUrl(String s)
        {
            fq.b(s, "Content URL must be non-null.");
            fq.b(s, "Content URL must be non-empty.");
            boolean flag;
            if (s.length() <= 512)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fq.a(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
                Integer.valueOf(512), Integer.valueOf(s.length())
            });
            kq.i(s);
            return this;
        }

        public Builder setGender(int i)
        {
            kq.d(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            kq.a(location);
            return this;
        }

        public Builder setManualImpressionsEnabled(boolean flag)
        {
            kq.f(flag);
            return this;
        }

        public Builder setPublisherProvidedId(String s)
        {
            kq.j(s);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            kq.g(flag);
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
    private final as kp;

    private PublisherAdRequest(Builder builder)
    {
        kp = new as(Builder.a(builder));
    }


    as O()
    {
        return kp;
    }

    public Date getBirthday()
    {
        return kp.getBirthday();
    }

    public String getContentUrl()
    {
        return kp.getContentUrl();
    }

    public int getGender()
    {
        return kp.getGender();
    }

    public Set getKeywords()
    {
        return kp.getKeywords();
    }

    public Location getLocation()
    {
        return kp.getLocation();
    }

    public boolean getManualImpressionsEnabled()
    {
        return kp.getManualImpressionsEnabled();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return kp.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return kp.getNetworkExtrasBundle(class1);
    }

    public String getPublisherProvidedId()
    {
        return kp.getPublisherProvidedId();
    }

    public boolean isTestDevice(Context context)
    {
        return kp.isTestDevice(context);
    }

    static 
    {
        DEVICE_ID_EMULATOR = as.DEVICE_ID_EMULATOR;
    }
}
