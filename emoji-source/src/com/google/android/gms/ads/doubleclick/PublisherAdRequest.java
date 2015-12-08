// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.at;
import com.google.android.gms.internal.hm;
import java.util.Date;
import java.util.Set;

public final class PublisherAdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.at.a kt = new com.google.android.gms.internal.at.a();

        static com.google.android.gms.internal.at.a a(Builder builder)
        {
            return builder.kt;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            kt.b(class1, bundle);
            return this;
        }

        public Builder addKeyword(String s)
        {
            kt.g(s);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            kt.a(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            kt.a(class1, bundle);
            return this;
        }

        public Builder addTestDevice(String s)
        {
            kt.h(s);
            return this;
        }

        public PublisherAdRequest build()
        {
            return new PublisherAdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            kt.a(date);
            return this;
        }

        public Builder setContentUrl(String s)
        {
            hm.b(s, "Content URL must be non-null.");
            hm.b(s, "Content URL must be non-empty.");
            boolean flag;
            if (s.length() <= 512)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hm.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
                Integer.valueOf(512), Integer.valueOf(s.length())
            });
            kt.i(s);
            return this;
        }

        public Builder setGender(int i)
        {
            kt.e(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            kt.a(location);
            return this;
        }

        public Builder setManualImpressionsEnabled(boolean flag)
        {
            kt.g(flag);
            return this;
        }

        public Builder setPublisherProvidedId(String s)
        {
            kt.j(s);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            kt.h(flag);
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
    private final at ks;

    private PublisherAdRequest(Builder builder)
    {
        ks = new at(Builder.a(builder));
    }


    at T()
    {
        return ks;
    }

    public Date getBirthday()
    {
        return ks.getBirthday();
    }

    public String getContentUrl()
    {
        return ks.getContentUrl();
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return ks.getCustomEventExtrasBundle(class1);
    }

    public int getGender()
    {
        return ks.getGender();
    }

    public Set getKeywords()
    {
        return ks.getKeywords();
    }

    public Location getLocation()
    {
        return ks.getLocation();
    }

    public boolean getManualImpressionsEnabled()
    {
        return ks.getManualImpressionsEnabled();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return ks.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return ks.getNetworkExtrasBundle(class1);
    }

    public String getPublisherProvidedId()
    {
        return ks.getPublisherProvidedId();
    }

    public boolean isTestDevice(Context context)
    {
        return ks.isTestDevice(context);
    }

    static 
    {
        DEVICE_ID_EMULATOR = at.DEVICE_ID_EMULATOR;
    }
}
