// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.at;

public final class SearchAdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.at.a kt = new com.google.android.gms.internal.at.a();
        private int tc;
        private int td;
        private int te;
        private int tf;
        private int tg;
        private int th;
        private int ti;
        private int tj;
        private String tk;
        private int tl;
        private String tm;
        private int tn;
        private int to;
        private String tp;

        static int a(Builder builder)
        {
            return builder.tc;
        }

        static int b(Builder builder)
        {
            return builder.td;
        }

        static int c(Builder builder)
        {
            return builder.te;
        }

        static int d(Builder builder)
        {
            return builder.tf;
        }

        static int e(Builder builder)
        {
            return builder.tg;
        }

        static int f(Builder builder)
        {
            return builder.th;
        }

        static int g(Builder builder)
        {
            return builder.ti;
        }

        static int h(Builder builder)
        {
            return builder.tj;
        }

        static String i(Builder builder)
        {
            return builder.tk;
        }

        static int j(Builder builder)
        {
            return builder.tl;
        }

        static String k(Builder builder)
        {
            return builder.tm;
        }

        static int l(Builder builder)
        {
            return builder.tn;
        }

        static int m(Builder builder)
        {
            return builder.to;
        }

        static String n(Builder builder)
        {
            return builder.tp;
        }

        static com.google.android.gms.internal.at.a o(Builder builder)
        {
            return builder.kt;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            kt.b(class1, bundle);
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

        public SearchAdRequest build()
        {
            return new SearchAdRequest(this);
        }

        public Builder setAnchorTextColor(int i1)
        {
            tc = i1;
            return this;
        }

        public Builder setBackgroundColor(int i1)
        {
            td = i1;
            te = Color.argb(0, 0, 0, 0);
            tf = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i1, int j1)
        {
            td = Color.argb(0, 0, 0, 0);
            te = j1;
            tf = i1;
            return this;
        }

        public Builder setBorderColor(int i1)
        {
            tg = i1;
            return this;
        }

        public Builder setBorderThickness(int i1)
        {
            th = i1;
            return this;
        }

        public Builder setBorderType(int i1)
        {
            ti = i1;
            return this;
        }

        public Builder setCallButtonColor(int i1)
        {
            tj = i1;
            return this;
        }

        public Builder setCustomChannels(String s)
        {
            tk = s;
            return this;
        }

        public Builder setDescriptionTextColor(int i1)
        {
            tl = i1;
            return this;
        }

        public Builder setFontFace(String s)
        {
            tm = s;
            return this;
        }

        public Builder setHeaderTextColor(int i1)
        {
            tn = i1;
            return this;
        }

        public Builder setHeaderTextSize(int i1)
        {
            to = i1;
            return this;
        }

        public Builder setLocation(Location location)
        {
            kt.a(location);
            return this;
        }

        public Builder setQuery(String s)
        {
            tp = s;
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            kt.h(flag);
            return this;
        }

        public Builder()
        {
            ti = 0;
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
    private final at ks;
    private final int tc;
    private final int td;
    private final int te;
    private final int tf;
    private final int tg;
    private final int th;
    private final int ti;
    private final int tj;
    private final String tk;
    private final int tl;
    private final String tm;
    private final int tn;
    private final int to;
    private final String tp;

    private SearchAdRequest(Builder builder)
    {
        tc = Builder.a(builder);
        td = Builder.b(builder);
        te = Builder.c(builder);
        tf = Builder.d(builder);
        tg = Builder.e(builder);
        th = Builder.f(builder);
        ti = Builder.g(builder);
        tj = Builder.h(builder);
        tk = Builder.i(builder);
        tl = Builder.j(builder);
        tm = Builder.k(builder);
        tn = Builder.l(builder);
        to = Builder.m(builder);
        tp = Builder.n(builder);
        ks = new at(Builder.o(builder), this);
    }


    at T()
    {
        return ks;
    }

    public int getAnchorTextColor()
    {
        return tc;
    }

    public int getBackgroundColor()
    {
        return td;
    }

    public int getBackgroundGradientBottom()
    {
        return te;
    }

    public int getBackgroundGradientTop()
    {
        return tf;
    }

    public int getBorderColor()
    {
        return tg;
    }

    public int getBorderThickness()
    {
        return th;
    }

    public int getBorderType()
    {
        return ti;
    }

    public int getCallButtonColor()
    {
        return tj;
    }

    public String getCustomChannels()
    {
        return tk;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return ks.getCustomEventExtrasBundle(class1);
    }

    public int getDescriptionTextColor()
    {
        return tl;
    }

    public String getFontFace()
    {
        return tm;
    }

    public int getHeaderTextColor()
    {
        return tn;
    }

    public int getHeaderTextSize()
    {
        return to;
    }

    public Location getLocation()
    {
        return ks.getLocation();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return ks.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return ks.getNetworkExtrasBundle(class1);
    }

    public String getQuery()
    {
        return tp;
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
