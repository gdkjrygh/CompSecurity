// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.graphics.Color;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.au;

public final class SearchAdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.au.a kr = new com.google.android.gms.internal.au.a();
        private int sZ;
        private int ta;
        private int tb;
        private int tc;
        private int td;
        private int te;
        private int tf;
        private int tg;
        private String th;
        private int ti;
        private String tj;
        private int tk;
        private int tl;
        private String tm;

        static int a(Builder builder)
        {
            return builder.sZ;
        }

        static int b(Builder builder)
        {
            return builder.ta;
        }

        static int c(Builder builder)
        {
            return builder.tb;
        }

        static int d(Builder builder)
        {
            return builder.tc;
        }

        static int e(Builder builder)
        {
            return builder.td;
        }

        static int f(Builder builder)
        {
            return builder.te;
        }

        static int g(Builder builder)
        {
            return builder.tf;
        }

        static int h(Builder builder)
        {
            return builder.tg;
        }

        static String i(Builder builder)
        {
            return builder.th;
        }

        static int j(Builder builder)
        {
            return builder.ti;
        }

        static String k(Builder builder)
        {
            return builder.tj;
        }

        static int l(Builder builder)
        {
            return builder.tk;
        }

        static int m(Builder builder)
        {
            return builder.tl;
        }

        static String n(Builder builder)
        {
            return builder.tm;
        }

        static com.google.android.gms.internal.au.a o(Builder builder)
        {
            return builder.kr;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            kr.b(class1, bundle);
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

        public SearchAdRequest build()
        {
            return new SearchAdRequest(this);
        }

        public Builder setAnchorTextColor(int i1)
        {
            sZ = i1;
            return this;
        }

        public Builder setBackgroundColor(int i1)
        {
            ta = i1;
            tb = Color.argb(0, 0, 0, 0);
            tc = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i1, int j1)
        {
            ta = Color.argb(0, 0, 0, 0);
            tb = j1;
            tc = i1;
            return this;
        }

        public Builder setBorderColor(int i1)
        {
            td = i1;
            return this;
        }

        public Builder setBorderThickness(int i1)
        {
            te = i1;
            return this;
        }

        public Builder setBorderType(int i1)
        {
            tf = i1;
            return this;
        }

        public Builder setCallButtonColor(int i1)
        {
            tg = i1;
            return this;
        }

        public Builder setCustomChannels(String s)
        {
            th = s;
            return this;
        }

        public Builder setDescriptionTextColor(int i1)
        {
            ti = i1;
            return this;
        }

        public Builder setFontFace(String s)
        {
            tj = s;
            return this;
        }

        public Builder setHeaderTextColor(int i1)
        {
            tk = i1;
            return this;
        }

        public Builder setHeaderTextSize(int i1)
        {
            tl = i1;
            return this;
        }

        public Builder setLocation(Location location)
        {
            kr.a(location);
            return this;
        }

        public Builder setQuery(String s)
        {
            tm = s;
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            kr.h(flag);
            return this;
        }

        public Builder()
        {
            tf = 0;
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
    private final au kq;
    private final int sZ;
    private final int ta;
    private final int tb;
    private final int tc;
    private final int td;
    private final int te;
    private final int tf;
    private final int tg;
    private final String th;
    private final int ti;
    private final String tj;
    private final int tk;
    private final int tl;
    private final String tm;

    private SearchAdRequest(Builder builder)
    {
        sZ = Builder.a(builder);
        ta = Builder.b(builder);
        tb = Builder.c(builder);
        tc = Builder.d(builder);
        td = Builder.e(builder);
        te = Builder.f(builder);
        tf = Builder.g(builder);
        tg = Builder.h(builder);
        th = Builder.i(builder);
        ti = Builder.j(builder);
        tj = Builder.k(builder);
        tk = Builder.l(builder);
        tl = Builder.m(builder);
        tm = Builder.n(builder);
        kq = new au(Builder.o(builder), this);
    }


    au O()
    {
        return kq;
    }

    public int getAnchorTextColor()
    {
        return sZ;
    }

    public int getBackgroundColor()
    {
        return ta;
    }

    public int getBackgroundGradientBottom()
    {
        return tb;
    }

    public int getBackgroundGradientTop()
    {
        return tc;
    }

    public int getBorderColor()
    {
        return td;
    }

    public int getBorderThickness()
    {
        return te;
    }

    public int getBorderType()
    {
        return tf;
    }

    public int getCallButtonColor()
    {
        return tg;
    }

    public String getCustomChannels()
    {
        return th;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return kq.getCustomEventExtrasBundle(class1);
    }

    public int getDescriptionTextColor()
    {
        return ti;
    }

    public String getFontFace()
    {
        return tj;
    }

    public int getHeaderTextColor()
    {
        return tk;
    }

    public int getHeaderTextSize()
    {
        return tl;
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

    public String getQuery()
    {
        return tm;
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
