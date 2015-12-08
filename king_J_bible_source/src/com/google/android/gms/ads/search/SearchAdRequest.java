// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.as;

public final class SearchAdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.as.a kq = new com.google.android.gms.internal.as.a();
        private int rR;
        private int rS;
        private int rT;
        private int rU;
        private int rV;
        private int rW;
        private int rX;
        private int rY;
        private String rZ;
        private int sa;
        private String sb;
        private int sc;
        private int sd;
        private String se;

        static int a(Builder builder)
        {
            return builder.rR;
        }

        static int b(Builder builder)
        {
            return builder.rS;
        }

        static int c(Builder builder)
        {
            return builder.rT;
        }

        static int d(Builder builder)
        {
            return builder.rU;
        }

        static int e(Builder builder)
        {
            return builder.rV;
        }

        static int f(Builder builder)
        {
            return builder.rW;
        }

        static int g(Builder builder)
        {
            return builder.rX;
        }

        static int h(Builder builder)
        {
            return builder.rY;
        }

        static String i(Builder builder)
        {
            return builder.rZ;
        }

        static int j(Builder builder)
        {
            return builder.sa;
        }

        static String k(Builder builder)
        {
            return builder.sb;
        }

        static int l(Builder builder)
        {
            return builder.sc;
        }

        static int m(Builder builder)
        {
            return builder.sd;
        }

        static String n(Builder builder)
        {
            return builder.se;
        }

        static com.google.android.gms.internal.as.a o(Builder builder)
        {
            return builder.kq;
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

        public SearchAdRequest build()
        {
            return new SearchAdRequest(this);
        }

        public Builder setAnchorTextColor(int i1)
        {
            rR = i1;
            return this;
        }

        public Builder setBackgroundColor(int i1)
        {
            rS = i1;
            rT = Color.argb(0, 0, 0, 0);
            rU = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i1, int j1)
        {
            rS = Color.argb(0, 0, 0, 0);
            rT = j1;
            rU = i1;
            return this;
        }

        public Builder setBorderColor(int i1)
        {
            rV = i1;
            return this;
        }

        public Builder setBorderThickness(int i1)
        {
            rW = i1;
            return this;
        }

        public Builder setBorderType(int i1)
        {
            rX = i1;
            return this;
        }

        public Builder setCallButtonColor(int i1)
        {
            rY = i1;
            return this;
        }

        public Builder setCustomChannels(String s)
        {
            rZ = s;
            return this;
        }

        public Builder setDescriptionTextColor(int i1)
        {
            sa = i1;
            return this;
        }

        public Builder setFontFace(String s)
        {
            sb = s;
            return this;
        }

        public Builder setHeaderTextColor(int i1)
        {
            sc = i1;
            return this;
        }

        public Builder setHeaderTextSize(int i1)
        {
            sd = i1;
            return this;
        }

        public Builder setLocation(Location location)
        {
            kq.a(location);
            return this;
        }

        public Builder setQuery(String s)
        {
            se = s;
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            kq.g(flag);
            return this;
        }

        public Builder()
        {
            rX = 0;
        }
    }


    public static final int BORDER_TYPE_DASHED = 1;
    public static final int BORDER_TYPE_DOTTED = 2;
    public static final int BORDER_TYPE_NONE = 0;
    public static final int BORDER_TYPE_SOLID = 3;
    public static final int CALL_BUTTON_COLOR_DARK = 2;
    public static final int CALL_BUTTON_COLOR_LIGHT = 0;
    public static final int CALL_BUTTON_COLOR_MEDIUM = 1;
    public static final String DEVICE_ID_EMULATOR;
    public static final int ERROR_CODE_INTERNAL_ERROR = 0;
    public static final int ERROR_CODE_INVALID_REQUEST = 1;
    public static final int ERROR_CODE_NETWORK_ERROR = 2;
    public static final int ERROR_CODE_NO_FILL = 3;
    private final as kp;
    private final int rR;
    private final int rS;
    private final int rT;
    private final int rU;
    private final int rV;
    private final int rW;
    private final int rX;
    private final int rY;
    private final String rZ;
    private final int sa;
    private final String sb;
    private final int sc;
    private final int sd;
    private final String se;

    private SearchAdRequest(Builder builder)
    {
        rR = Builder.a(builder);
        rS = Builder.b(builder);
        rT = Builder.c(builder);
        rU = Builder.d(builder);
        rV = Builder.e(builder);
        rW = Builder.f(builder);
        rX = Builder.g(builder);
        rY = Builder.h(builder);
        rZ = Builder.i(builder);
        sa = Builder.j(builder);
        sb = Builder.k(builder);
        sc = Builder.l(builder);
        sd = Builder.m(builder);
        se = Builder.n(builder);
        kp = new as(Builder.o(builder), this);
    }


    as O()
    {
        return kp;
    }

    public int getAnchorTextColor()
    {
        return rR;
    }

    public int getBackgroundColor()
    {
        return rS;
    }

    public int getBackgroundGradientBottom()
    {
        return rT;
    }

    public int getBackgroundGradientTop()
    {
        return rU;
    }

    public int getBorderColor()
    {
        return rV;
    }

    public int getBorderThickness()
    {
        return rW;
    }

    public int getBorderType()
    {
        return rX;
    }

    public int getCallButtonColor()
    {
        return rY;
    }

    public String getCustomChannels()
    {
        return rZ;
    }

    public int getDescriptionTextColor()
    {
        return sa;
    }

    public String getFontFace()
    {
        return sb;
    }

    public int getHeaderTextColor()
    {
        return sc;
    }

    public int getHeaderTextSize()
    {
        return sd;
    }

    public Location getLocation()
    {
        return kp.getLocation();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return kp.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return kp.getNetworkExtrasBundle(class1);
    }

    public String getQuery()
    {
        return se;
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
