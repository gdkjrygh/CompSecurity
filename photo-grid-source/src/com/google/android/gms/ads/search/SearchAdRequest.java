// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.search;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzy;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class SearchAdRequest
{

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
    private final zzy a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private final int f;
    private final int g;
    private final int h;
    private final int i;
    private final String j;
    private final int k;
    private final String l;
    private final int m;
    private final int n;
    private final String o;

    private SearchAdRequest(Builder builder)
    {
        b = Builder.a(builder);
        c = Builder.b(builder);
        d = Builder.c(builder);
        e = Builder.d(builder);
        f = Builder.e(builder);
        g = Builder.f(builder);
        h = Builder.g(builder);
        i = Builder.h(builder);
        j = Builder.i(builder);
        k = Builder.j(builder);
        l = Builder.k(builder);
        m = Builder.l(builder);
        n = Builder.m(builder);
        o = Builder.n(builder);
        a = new zzy(Builder.o(builder), this);
    }

    SearchAdRequest(Builder builder, byte byte0)
    {
        this(builder);
    }

    final zzy a()
    {
        return a;
    }

    public final int getAnchorTextColor()
    {
        return b;
    }

    public final int getBackgroundColor()
    {
        return c;
    }

    public final int getBackgroundGradientBottom()
    {
        return d;
    }

    public final int getBackgroundGradientTop()
    {
        return e;
    }

    public final int getBorderColor()
    {
        return f;
    }

    public final int getBorderThickness()
    {
        return g;
    }

    public final int getBorderType()
    {
        return h;
    }

    public final int getCallButtonColor()
    {
        return i;
    }

    public final String getCustomChannels()
    {
        return j;
    }

    public final Bundle getCustomEventExtrasBundle(Class class1)
    {
        return a.getCustomEventExtrasBundle(class1);
    }

    public final int getDescriptionTextColor()
    {
        return k;
    }

    public final String getFontFace()
    {
        return l;
    }

    public final int getHeaderTextColor()
    {
        return m;
    }

    public final int getHeaderTextSize()
    {
        return n;
    }

    public final Location getLocation()
    {
        return a.getLocation();
    }

    public final NetworkExtras getNetworkExtras(Class class1)
    {
        return a.getNetworkExtras(class1);
    }

    public final Bundle getNetworkExtrasBundle(Class class1)
    {
        return a.getNetworkExtrasBundle(class1);
    }

    public final String getQuery()
    {
        return o;
    }

    public final boolean isTestDevice(Context context)
    {
        return a.isTestDevice(context);
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzy.DEVICE_ID_EMULATOR;
    }

    private class Builder
    {

        private final com.google.android.gms.ads.internal.client.zzy.zza a = new com.google.android.gms.ads.internal.client.zzy.zza();
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private int g;
        private int h;
        private int i;
        private String j;
        private int k;
        private String l;
        private int m;
        private int n;
        private String o;

        static int a(Builder builder)
        {
            return builder.b;
        }

        static int b(Builder builder)
        {
            return builder.c;
        }

        static int c(Builder builder)
        {
            return builder.d;
        }

        static int d(Builder builder)
        {
            return builder.e;
        }

        static int e(Builder builder)
        {
            return builder.f;
        }

        static int f(Builder builder)
        {
            return builder.g;
        }

        static int g(Builder builder)
        {
            return builder.h;
        }

        static int h(Builder builder)
        {
            return builder.i;
        }

        static String i(Builder builder)
        {
            return builder.j;
        }

        static int j(Builder builder)
        {
            return builder.k;
        }

        static String k(Builder builder)
        {
            return builder.l;
        }

        static int l(Builder builder)
        {
            return builder.m;
        }

        static int m(Builder builder)
        {
            return builder.n;
        }

        static String n(Builder builder)
        {
            return builder.o;
        }

        static com.google.android.gms.ads.internal.client.zzy.zza o(Builder builder)
        {
            return builder.a;
        }

        public final Builder addCustomEventExtrasBundle(Class class1, Bundle bundle)
        {
            a.zzb(class1, bundle);
            return this;
        }

        public final Builder addNetworkExtras(NetworkExtras networkextras)
        {
            a.zza(networkextras);
            return this;
        }

        public final Builder addNetworkExtrasBundle(Class class1, Bundle bundle)
        {
            a.zza(class1, bundle);
            return this;
        }

        public final Builder addTestDevice(String s)
        {
            a.zzG(s);
            return this;
        }

        public final SearchAdRequest build()
        {
            return new SearchAdRequest(this, (byte)0);
        }

        public final Builder setAnchorTextColor(int i1)
        {
            b = i1;
            return this;
        }

        public final Builder setBackgroundColor(int i1)
        {
            c = i1;
            d = Color.argb(0, 0, 0, 0);
            e = Color.argb(0, 0, 0, 0);
            return this;
        }

        public final Builder setBackgroundGradient(int i1, int j1)
        {
            c = Color.argb(0, 0, 0, 0);
            d = j1;
            e = i1;
            return this;
        }

        public final Builder setBorderColor(int i1)
        {
            f = i1;
            return this;
        }

        public final Builder setBorderThickness(int i1)
        {
            g = i1;
            return this;
        }

        public final Builder setBorderType(int i1)
        {
            h = i1;
            return this;
        }

        public final Builder setCallButtonColor(int i1)
        {
            i = i1;
            return this;
        }

        public final Builder setCustomChannels(String s)
        {
            j = s;
            return this;
        }

        public final Builder setDescriptionTextColor(int i1)
        {
            k = i1;
            return this;
        }

        public final Builder setFontFace(String s)
        {
            l = s;
            return this;
        }

        public final Builder setHeaderTextColor(int i1)
        {
            m = i1;
            return this;
        }

        public final Builder setHeaderTextSize(int i1)
        {
            n = i1;
            return this;
        }

        public final Builder setLocation(Location location)
        {
            a.zzb(location);
            return this;
        }

        public final Builder setQuery(String s)
        {
            o = s;
            return this;
        }

        public final Builder setRequestAgent(String s)
        {
            a.zzK(s);
            return this;
        }

        public final Builder tagForChildDirectedTreatment(boolean flag)
        {
            a.zzj(flag);
            return this;
        }

        public Builder()
        {
            h = 0;
        }
    }

}
