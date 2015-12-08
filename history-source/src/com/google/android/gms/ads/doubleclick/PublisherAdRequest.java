// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.bg;
import com.google.android.gms.internal.jx;
import java.util.Date;
import java.util.Set;

public final class PublisherAdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.bg.a lh = new com.google.android.gms.internal.bg.a();

        static com.google.android.gms.internal.bg.a a(Builder builder)
        {
            return builder.lh;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            lh.b(class1, bundle);
            return this;
        }

        public Builder addKeyword(String s)
        {
            lh.r(s);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            lh.a(networkextras);
            return this;
        }

        public Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            lh.a(class1, bundle);
            return this;
        }

        public Builder addTestDevice(String s)
        {
            lh.s(s);
            return this;
        }

        public PublisherAdRequest build()
        {
            return new PublisherAdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            lh.a(date);
            return this;
        }

        public Builder setContentUrl(String s)
        {
            jx.b(s, "Content URL must be non-null.");
            jx.b(s, "Content URL must be non-empty.");
            boolean flag;
            if (s.length() <= 512)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            jx.b(flag, "Content URL must not exceed %d in length.  Provided length was %d.", new Object[] {
                Integer.valueOf(512), Integer.valueOf(s.length())
            });
            lh.t(s);
            return this;
        }

        public Builder setGender(int i)
        {
            lh.h(i);
            return this;
        }

        public Builder setLocation(Location location)
        {
            lh.a(location);
            return this;
        }

        public Builder setManualImpressionsEnabled(boolean flag)
        {
            lh.i(flag);
            return this;
        }

        public Builder setPublisherProvidedId(String s)
        {
            lh.u(s);
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            lh.j(flag);
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
    private final bg lg;

    private PublisherAdRequest(Builder builder)
    {
        lg = new bg(Builder.a(builder));
    }


    public bg Y()
    {
        return lg;
    }

    public Date getBirthday()
    {
        return lg.getBirthday();
    }

    public String getContentUrl()
    {
        return lg.getContentUrl();
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return lg.getCustomEventExtrasBundle(class1);
    }

    public int getGender()
    {
        return lg.getGender();
    }

    public Set getKeywords()
    {
        return lg.getKeywords();
    }

    public Location getLocation()
    {
        return lg.getLocation();
    }

    public boolean getManualImpressionsEnabled()
    {
        return lg.getManualImpressionsEnabled();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return lg.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return lg.getNetworkExtrasBundle(class1);
    }

    public String getPublisherProvidedId()
    {
        return lg.getPublisherProvidedId();
    }

    public boolean isTestDevice(Context context)
    {
        return lg.isTestDevice(context);
    }

    static 
    {
        DEVICE_ID_EMULATOR = bg.DEVICE_ID_EMULATOR;
    }
}
