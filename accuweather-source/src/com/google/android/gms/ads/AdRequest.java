// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.au;
import com.google.android.gms.internal.hn;
import java.util.Date;
import java.util.Set;

public final class AdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.au.a kr = new com.google.android.gms.internal.au.a();

        static com.google.android.gms.internal.au.a a(Builder builder)
        {
            return builder.kr;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            kr.b(class1, bundle);
            return this;
        }

        public Builder addKeyword(String s)
        {
            kr.g(s);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            kr.a(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            kr.a(class1, bundle);
            return this;
        }

        public Builder addTestDevice(String s)
        {
            kr.h(s);
            return this;
        }

        public AdRequest build()
        {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            kr.a(date);
            return this;
        }

        public Builder setContentUrl(String s)
        {
            hn.b(s, "Content URL must be non-null.");
            hn.b(s, "Content URL must be non-empty.");
            boolean flag;
            if (s.length() <= 512)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            hn.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
                Integer.valueOf(512), Integer.valueOf(s.length())
            });
            kr.i(s);
            return this;
        }

        public Builder setGender(int i)
        {
            kr.e(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            kr.a(location);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            kr.h(flag);
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
    public static final int MAX_CONTENT_URL_LENGTH = 512;
    private final au kq;

    private AdRequest(Builder builder)
    {
        kq = new au(Builder.a(builder));
    }


    au O()
    {
        return kq;
    }

    public Date getBirthday()
    {
        return kq.getBirthday();
    }

    public String getContentUrl()
    {
        return kq.getContentUrl();
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return kq.getCustomEventExtrasBundle(class1);
    }

    public int getGender()
    {
        return kq.getGender();
    }

    public Set getKeywords()
    {
        return kq.getKeywords();
    }

    public Location getLocation()
    {
        return kq.getLocation();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return kq.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return kq.getNetworkExtrasBundle(class1);
    }

    public boolean isTestDevice(Context context)
    {
        return kq.isTestDevice(context);
    }

    static 
    {
        DEVICE_ID_EMULATOR = au.DEVICE_ID_EMULATOR;
    }
}
