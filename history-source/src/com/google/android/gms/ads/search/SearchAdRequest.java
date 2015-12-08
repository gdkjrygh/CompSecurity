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

        private final com.google.android.gms.internal.bg.a lh = new com.google.android.gms.internal.bg.a();
        private int xA;
        private int xB;
        private int xC;
        private int xD;
        private int xE;
        private int xF;
        private int xG;
        private int xH;
        private String xI;
        private int xJ;
        private String xK;
        private int xL;
        private int xM;
        private String xN;

        static int a(Builder builder)
        {
            return builder.xA;
        }

        static int b(Builder builder)
        {
            return builder.xB;
        }

        static int c(Builder builder)
        {
            return builder.xC;
        }

        static int d(Builder builder)
        {
            return builder.xD;
        }

        static int e(Builder builder)
        {
            return builder.xE;
        }

        static int f(Builder builder)
        {
            return builder.xF;
        }

        static int g(Builder builder)
        {
            return builder.xG;
        }

        static int h(Builder builder)
        {
            return builder.xH;
        }

        static String i(Builder builder)
        {
            return builder.xI;
        }

        static int j(Builder builder)
        {
            return builder.xJ;
        }

        static String k(Builder builder)
        {
            return builder.xK;
        }

        static int l(Builder builder)
        {
            return builder.xL;
        }

        static int m(Builder builder)
        {
            return builder.xM;
        }

        static String n(Builder builder)
        {
            return builder.xN;
        }

        static com.google.android.gms.internal.bg.a o(Builder builder)
        {
            return builder.lh;
        }

        public Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            lh.b(class1, bundle);
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

        public SearchAdRequest build()
        {
            return new SearchAdRequest(this);
        }

        public Builder setAnchorTextColor(int i1)
        {
            xA = i1;
            return this;
        }

        public Builder setBackgroundColor(int i1)
        {
            xB = i1;
            xC = Color.argb(0, 0, 0, 0);
            xD = Color.argb(0, 0, 0, 0);
            return this;
        }

        public Builder setBackgroundGradient(int i1, int j1)
        {
            xB = Color.argb(0, 0, 0, 0);
            xC = j1;
            xD = i1;
            return this;
        }

        public Builder setBorderColor(int i1)
        {
            xE = i1;
            return this;
        }

        public Builder setBorderThickness(int i1)
        {
            xF = i1;
            return this;
        }

        public Builder setBorderType(int i1)
        {
            xG = i1;
            return this;
        }

        public Builder setCallButtonColor(int i1)
        {
            xH = i1;
            return this;
        }

        public Builder setCustomChannels(String s)
        {
            xI = s;
            return this;
        }

        public Builder setDescriptionTextColor(int i1)
        {
            xJ = i1;
            return this;
        }

        public Builder setFontFace(String s)
        {
            xK = s;
            return this;
        }

        public Builder setHeaderTextColor(int i1)
        {
            xL = i1;
            return this;
        }

        public Builder setHeaderTextSize(int i1)
        {
            xM = i1;
            return this;
        }

        public Builder setLocation(Location location)
        {
            lh.a(location);
            return this;
        }

        public Builder setQuery(String s)
        {
            xN = s;
            return this;
        }

        public Builder tagForChildDirectedTreatment(boolean flag)
        {
            lh.j(flag);
            return this;
        }

        public Builder()
        {
            xG = 0;
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
    private final bg lg;
    private final int xA;
    private final int xB;
    private final int xC;
    private final int xD;
    private final int xE;
    private final int xF;
    private final int xG;
    private final int xH;
    private final String xI;
    private final int xJ;
    private final String xK;
    private final int xL;
    private final int xM;
    private final String xN;

    private SearchAdRequest(Builder builder)
    {
        xA = Builder.a(builder);
        xB = Builder.b(builder);
        xC = Builder.c(builder);
        xD = Builder.d(builder);
        xE = Builder.e(builder);
        xF = Builder.f(builder);
        xG = Builder.g(builder);
        xH = Builder.h(builder);
        xI = Builder.i(builder);
        xJ = Builder.j(builder);
        xK = Builder.k(builder);
        xL = Builder.l(builder);
        xM = Builder.m(builder);
        xN = Builder.n(builder);
        lg = new bg(Builder.o(builder), this);
    }


    bg Y()
    {
        return lg;
    }

    public int getAnchorTextColor()
    {
        return xA;
    }

    public int getBackgroundColor()
    {
        return xB;
    }

    public int getBackgroundGradientBottom()
    {
        return xC;
    }

    public int getBackgroundGradientTop()
    {
        return xD;
    }

    public int getBorderColor()
    {
        return xE;
    }

    public int getBorderThickness()
    {
        return xF;
    }

    public int getBorderType()
    {
        return xG;
    }

    public int getCallButtonColor()
    {
        return xH;
    }

    public String getCustomChannels()
    {
        return xI;
    }

    public Bundle getCustomEventExtrasBundle(Class class1)
    {
        return lg.getCustomEventExtrasBundle(class1);
    }

    public int getDescriptionTextColor()
    {
        return xJ;
    }

    public String getFontFace()
    {
        return xK;
    }

    public int getHeaderTextColor()
    {
        return xL;
    }

    public int getHeaderTextSize()
    {
        return xM;
    }

    public Location getLocation()
    {
        return lg.getLocation();
    }

    public NetworkExtras getNetworkExtras(Class class1)
    {
        return lg.getNetworkExtras(class1);
    }

    public Bundle getNetworkExtrasBundle(Class class1)
    {
        return lg.getNetworkExtrasBundle(class1);
    }

    public String getQuery()
    {
        return xN;
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
