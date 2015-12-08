// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads;

import android.content.Context;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.cm;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class AdRequest
{
    public static final class Builder
    {

        private Date d;
        private int dI;
        private int dK;
        private final HashSet dM = new HashSet();
        private final HashMap dN = new HashMap();
        private final HashSet dO = new HashSet();

        static Date a(Builder builder)
        {
            return builder.d;
        }

        static int b(Builder builder)
        {
            return builder.dI;
        }

        static HashSet c(Builder builder)
        {
            return builder.dM;
        }

        static HashMap d(Builder builder)
        {
            return builder.dN;
        }

        static int e(Builder builder)
        {
            return builder.dK;
        }

        static HashSet f(Builder builder)
        {
            return builder.dO;
        }

        public Builder addKeyword(String s)
        {
            dM.add(s);
            return this;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            dN.put(networkextras.getClass(), networkextras);
            return this;
        }

        public Builder addTestDevice(String s)
        {
            dO.add(s);
            return this;
        }

        public AdRequest build()
        {
            return new AdRequest(this);
        }

        public Builder setBirthday(Date date)
        {
            d = date;
            return this;
        }

        public Builder setGender(int i)
        {
            dI = i;
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            int i;
            if (flag)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            dK = i;
            return this;
        }

        public Builder()
        {
            dI = -1;
            dK = -1;
        }
    }


    public static final String DEVICE_ID_EMULATOR = cm.l("emulator");
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    public static final int GENDER_FEMALE = 2;
    public static final int GENDER_MALE = 1;
    public static final int GENDER_UNKNOWN = 0;
    private final Date d;
    private final int dI;
    private final Map dJ;
    private final int dK;
    private final Set dL;
    private final Set f;

    private AdRequest(Builder builder)
    {
        d = Builder.a(builder);
        dI = Builder.b(builder);
        f = Collections.unmodifiableSet(Builder.c(builder));
        dJ = Collections.unmodifiableMap(Builder.d(builder));
        dK = Builder.e(builder);
        dL = Collections.unmodifiableSet(Builder.f(builder));
    }


    public Date getBirthday()
    {
        return d;
    }

    public int getGender()
    {
        return dI;
    }

    public Set getKeywords()
    {
        return f;
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return (NetworkExtras)dJ.get(class1);
    }

    public boolean isTestDevice(Context context)
    {
        return dL.contains(cm.l(context));
    }

    Map v()
    {
        return dJ;
    }

    public int w()
    {
        return dK;
    }

}
