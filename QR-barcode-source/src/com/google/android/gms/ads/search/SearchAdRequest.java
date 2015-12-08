// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.bg;

public final class SearchAdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.bg.a le = new com.google.android.gms.internal.bg.a();
        private int xl;
        private int xm;
        private int xn;
        private int xo;
        private int xp;
        private int xq;
        private int xr;
        private int xs;
        private String xt;
        private int xu;
        private String xv;
        private int xw;
        private int xx;
        private String xy;

        static int a(Builder builder)
        {
            return builder.xl;
        }

        static int b(Builder builder)
        {
            return builder.xm;
        }

        static int c(Builder builder)
        {
            return builder.xn;
        }

        static int d(Builder builder)
        {
            return builder.xo;
        }

        static int e(Builder builder)
        {
            return builder.xp;
        }

        static int f(Builder builder)
        {
            return builder.xq;
        }

        static int g(Builder builder)
        {
            return builder.xr;
        }

        static int h(Builder builder)
        {
            return builder.xs;
        }

        static String i(Builder builder)
        {
            return builder.xt;
        }

        static int j(Builder builder)
        {
            return builder.xu;
        }

        static String k(Builder builder)
        {
            return builder.xv;
        }

        static int l(Builder builder)
        {
            return builder.xw;
        }

        static int m(Builder builder)
        {
            return builder.xx;
        }

        static String n(Builder builder)
        {
            return builder.xy;
        }

        static com.google.android.gms.internal.bg.a o(Builder builder)
        {
            return builder.le;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            le.b(class1, bundle);
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

        public SearchAdRequest build()
        {
            return new SearchAdRequest(this);
        }

        public Builder setAnchorTextColor(int i1)
        {
            xl = i1;
            return this;
        }

        public Builder setBackgroundColor(int i1)
        {
            xm = i1;
            xn = Color.argb(0, 0, 0, 0);
            xo = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i1, int j1)
        {
            xm = Color.argb(0, 0, 0, 0);
            xn = j1;
            xo = i1;
            return this;
        }

        public Builder setBorderColor(int i1)
        {
            xp = i1;
            return this;
        }

        public Builder setBorderThickness(int i1)
        {
            xq = i1;
            return this;
        }

        public Builder setBorderType(int i1)
        {
            xr = i1;
            return this;
        }

        public Builder setCallButtonColor(int i1)
        {
            xs = i1;
            return this;
        }

        public Builder setCustomChannels(String s)
        {
            xt = s;
            return this;
        }

        public Builder setDescriptionTextColor(int i1)
        {
            xu = i1;
            return this;
        }

        public Builder setFontFace(String s)
        {
            xv = s;
            return this;
        }

        public Builder setHeaderTextColor(int i1)
        {
            xw = i1;
            return this;
        }

        public Builder setHeaderTextSize(int i1)
        {
            xx = i1;
            return this;
        }

        public Builder setLocation(Location location)
        {
            le.a(location);
            return this;
        }

        public Builder setQuery(String s)
        {
            xy = s;
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            le.h(flag);
            return this;
        }

        public Builder()
        {
            xr = 0;
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
    private final bg ld;
    private final int xl;
    private final int xm;
    private final int xn;
    private final int xo;
    private final int xp;
    private final int xq;
    private final int xr;
    private final int xs;
    private final String xt;
    private final int xu;
    private final String xv;
    private final int xw;
    private final int xx;
    private final String xy;

    private SearchAdRequest(Builder builder)
    {
        xl = Builder.a(builder);
        xm = Builder.b(builder);
        xn = Builder.c(builder);
        xo = Builder.d(builder);
        xp = Builder.e(builder);
        xq = Builder.f(builder);
        xr = Builder.g(builder);
        xs = Builder.h(builder);
        xt = Builder.i(builder);
        xu = Builder.j(builder);
        xv = Builder.k(builder);
        xw = Builder.l(builder);
        xx = Builder.m(builder);
        xy = Builder.n(builder);
        ld = new bg(Builder.o(builder), this);
    }


    bg V()
    {
        return ld;
    }

    public int getAnchorTextColor()
    {
        return xl;
    }

    public int getBackgroundColor()
    {
        return xm;
    }

    public int getBackgroundGradientBottom()
    {
        return xn;
    }

    public int getBackgroundGradientTop()
    {
        return xo;
    }

    public int getBorderColor()
    {
        return xp;
    }

    public int getBorderThickness()
    {
        return xq;
    }

    public int getBorderType()
    {
        return xr;
    }

    public int getCallButtonColor()
    {
        return xs;
    }

    public String getCustomChannels()
    {
        return xt;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return ld.getCustomEventExtrasBundle(class1);
    }

    public int getDescriptionTextColor()
    {
        return xu;
    }

    public String getFontFace()
    {
        return xv;
    }

    public int getHeaderTextColor()
    {
        return xw;
    }

    public int getHeaderTextSize()
    {
        return xx;
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

    public String getQuery()
    {
        return xy;
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
