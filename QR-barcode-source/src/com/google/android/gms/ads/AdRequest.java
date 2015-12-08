// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.internal.bg;
import java.util.Date;
import java.util.Set;

public final class AdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.bg.a le = new com.google.android.gms.internal.bg.a();

        static com.google.android.gms.internal.bg.a a(Builder builder)
        {
            return builder.le;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            le.b(class1, bundle);
            return this;
        }

        public Builder addKeyword(String s)
        {
            le.r(s);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            le.a(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            le.a(class1, bundle);
            return this;
        }

        public Builder addTestDevice(String s)
        {
            le.s(s);
            return this;
        }

        public AdRequest build()
        {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            le.a(date);
            return this;
        }

        public Builder setContentUrl(String s)
        {
            o.b(s, "Content URL must be non-null.");
            o.b(s, "Content URL must be non-empty.");
            boolean flag;
            if (s.length() <= 512)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            o.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
                Integer.valueOf(512), Integer.valueOf(s.length())
            });
            le.t(s);
            return this;
        }

        public Builder setGender(int i)
        {
            le.g(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            le.a(location);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            le.h(flag);
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
    private final bg ld;

    private AdRequest(Builder builder)
    {
        ld = new bg(Builder.a(builder));
    }


    bg V()
    {
        return ld;
    }

    public Date getBirthday()
    {
        return ld.getBirthday();
    }

    public String getContentUrl()
    {
        return ld.getContentUrl();
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return ld.getCustomEventExtrasBundle(class1);
    }

    public int getGender()
    {
        return ld.getGender();
    }

    public Set getKeywords()
    {
        return ld.getKeywords();
    }

    public Location getLocation()
    {
        return ld.getLocation();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return ld.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return ld.getNetworkExtrasBundle(class1);
    }

    public boolean isTestDevice(Context context)
    {
        return ld.isTestDevice(context);
    }

    static 
    {
        DEVICE_ID_EMULATOR = bg.DEVICE_ID_EMULATOR;
    }
}
