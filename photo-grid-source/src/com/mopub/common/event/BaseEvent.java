// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.common.event;

import com.mopub.common.ClientMetadata;
import com.mopub.common.Preconditions;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class BaseEvent
{

    private final Integer A;
    private final long B = System.currentTimeMillis();
    private ClientMetadata C;
    private final double D;
    private final ScribeCategory a;
    private final Name b;
    private final Category c;
    private final SdkProduct d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final Double i;
    private final Double j;
    private final Integer k;
    private final Integer l;
    private final Double m;
    private final Double n;
    private final Double o;
    private final com.mopub.common.ClientMetadata.MoPubNetworkType p;
    private final String q;
    private final String r;
    private final String s;
    private final String t;
    private final String u;
    private final String v;
    private final Double w;
    private final String x;
    private final Integer y;
    private final String z;

    public BaseEvent(Builder builder)
    {
        Preconditions.checkNotNull(builder);
        a = Builder.a(builder);
        b = Builder.b(builder);
        c = Builder.c(builder);
        d = Builder.d(builder);
        e = Builder.e(builder);
        f = Builder.f(builder);
        g = Builder.g(builder);
        h = Builder.h(builder);
        i = Builder.i(builder);
        j = Builder.j(builder);
        m = Builder.k(builder);
        n = Builder.l(builder);
        o = Builder.m(builder);
        w = Builder.n(builder);
        x = Builder.o(builder);
        y = Builder.p(builder);
        z = Builder.q(builder);
        A = Builder.r(builder);
        D = Builder.s(builder);
        C = ClientMetadata.getInstance();
        if (C != null)
        {
            k = Integer.valueOf(C.getDeviceScreenWidthDip());
            l = Integer.valueOf(C.getDeviceScreenHeightDip());
            p = C.getActiveNetworkType();
            q = C.getNetworkOperator();
            r = C.getNetworkOperatorName();
            s = C.getIsoCountryCode();
            t = C.getSimOperator();
            u = C.getSimOperatorName();
            v = C.getSimIsoCountryCode();
            return;
        } else
        {
            k = null;
            l = null;
            p = null;
            q = null;
            r = null;
            s = null;
            t = null;
            u = null;
            v = null;
            return;
        }
    }

    public String getAdCreativeId()
    {
        return f;
    }

    public Double getAdHeightPx()
    {
        return j;
    }

    public String getAdNetworkType()
    {
        return h;
    }

    public String getAdType()
    {
        return g;
    }

    public String getAdUnitId()
    {
        return e;
    }

    public Double getAdWidthPx()
    {
        return i;
    }

    public String getAppName()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return C.getAppName();
        }
    }

    public String getAppPackageName()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return C.getAppPackageName();
        }
    }

    public AppPlatform getAppPlatform()
    {
        return AppPlatform.ANDROID;
    }

    public String getAppVersion()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return C.getAppVersion();
        }
    }

    public Category getCategory()
    {
        return c;
    }

    public String getClientAdvertisingId()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return C.getDeviceId();
        }
    }

    public Boolean getClientDoNotTrack()
    {
        boolean flag;
        if (C == null || C.isDoNotTrackSet())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public String getDeviceManufacturer()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return C.getDeviceManufacturer();
        }
    }

    public String getDeviceModel()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return C.getDeviceModel();
        }
    }

    public String getDeviceOsVersion()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return C.getDeviceOsVersion();
        }
    }

    public String getDeviceProduct()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return C.getDeviceProduct();
        }
    }

    public Integer getDeviceScreenHeightDip()
    {
        return l;
    }

    public Integer getDeviceScreenWidthDip()
    {
        return k;
    }

    public Double getGeoAccuracy()
    {
        return o;
    }

    public Double getGeoLat()
    {
        return m;
    }

    public Double getGeoLon()
    {
        return n;
    }

    public Name getName()
    {
        return b;
    }

    public String getNetworkIsoCountryCode()
    {
        return s;
    }

    public String getNetworkOperatorCode()
    {
        return q;
    }

    public String getNetworkOperatorName()
    {
        return r;
    }

    public String getNetworkSimCode()
    {
        return t;
    }

    public String getNetworkSimIsoCountryCode()
    {
        return v;
    }

    public String getNetworkSimOperatorName()
    {
        return u;
    }

    public com.mopub.common.ClientMetadata.MoPubNetworkType getNetworkType()
    {
        return p;
    }

    public String getObfuscatedClientAdvertisingId()
    {
        return "ifa:XXXX";
    }

    public Double getPerformanceDurationMs()
    {
        return w;
    }

    public String getRequestId()
    {
        return x;
    }

    public Integer getRequestRetries()
    {
        return A;
    }

    public Integer getRequestStatusCode()
    {
        return y;
    }

    public String getRequestUri()
    {
        return z;
    }

    public double getSamplingRate()
    {
        return D;
    }

    public ScribeCategory getScribeCategory()
    {
        return a;
    }

    public SdkProduct getSdkProduct()
    {
        return d;
    }

    public String getSdkVersion()
    {
        if (C == null)
        {
            return null;
        } else
        {
            return C.getSdkVersion();
        }
    }

    public Long getTimestampUtcMs()
    {
        return Long.valueOf(B);
    }

    public String toString()
    {
        return (new StringBuilder("BaseEvent\nScribeCategory: ")).append(getScribeCategory()).append("\nName: ").append(getName()).append("\nCategory: ").append(getCategory()).append("\nSdkProduct: ").append(getSdkProduct()).append("\nSdkVersion: ").append(getSdkVersion()).append("\nAdUnitId: ").append(getAdUnitId()).append("\nAdCreativeId: ").append(getAdCreativeId()).append("\nAdType: ").append(getAdType()).append("\nAdNetworkType: ").append(getAdNetworkType()).append("\nAdWidthPx: ").append(getAdWidthPx()).append("\nAdHeightPx: ").append(getAdHeightPx()).append("\nAppPlatform: ").append(getAppPlatform()).append("\nAppName: ").append(getAppName()).append("\nAppPackageName: ").append(getAppPackageName()).append("\nAppVersion: ").append(getAppVersion()).append("\nDeviceManufacturer: ").append(getDeviceManufacturer()).append("\nDeviceModel: ").append(getDeviceModel()).append("\nDeviceProduct: ").append(getDeviceProduct()).append("\nDeviceOsVersion: ").append(getDeviceOsVersion()).append("\nDeviceScreenWidth: ").append(getDeviceScreenWidthDip()).append("\nDeviceScreenHeight: ").append(getDeviceScreenHeightDip()).append("\nGeoLat: ").append(getGeoLat()).append("\nGeoLon: ").append(getGeoLon()).append("\nGeoAccuracy: ").append(getGeoAccuracy()).append("\nPerformanceDurationMs: ").append(getPerformanceDurationMs()).append("\nNetworkType: ").append(getNetworkType()).append("\nNetworkOperatorCode: ").append(getNetworkOperatorCode()).append("\nNetworkOperatorName: ").append(getNetworkOperatorName()).append("\nNetworkIsoCountryCode: ").append(getNetworkIsoCountryCode()).append("\nNetworkSimCode: ").append(getNetworkSimCode()).append("\nNetworkSimOperatorName: ").append(getNetworkSimOperatorName()).append("\nNetworkSimIsoCountryCode: ").append(getNetworkSimIsoCountryCode()).append("\nRequestId: ").append(getRequestId()).append("\nRequestStatusCode: ").append(getRequestStatusCode()).append("\nRequestUri: ").append(getRequestUri()).append("\nRequestRetries: ").append(getRequestRetries()).append("\nSamplingRate: ").append(getSamplingRate()).append("\nTimestampUtcMs: ").append((new SimpleDateFormat()).format(new Date(getTimestampUtcMs().longValue()))).append("\n").toString();
    }

    private class Builder
    {

        private ScribeCategory a;
        private Name b;
        private Category c;
        private SdkProduct d;
        private String e;
        private String f;
        private String g;
        private String h;
        private Double i;
        private Double j;
        private Double k;
        private Double l;
        private Double m;
        private Double n;
        private String o;
        private Integer p;
        private String q;
        private Integer r;
        private double s;

        static ScribeCategory a(Builder builder)
        {
            return builder.a;
        }

        static Name b(Builder builder)
        {
            return builder.b;
        }

        static Category c(Builder builder)
        {
            return builder.c;
        }

        static SdkProduct d(Builder builder)
        {
            return builder.d;
        }

        static String e(Builder builder)
        {
            return builder.e;
        }

        static String f(Builder builder)
        {
            return builder.f;
        }

        static String g(Builder builder)
        {
            return builder.g;
        }

        static String h(Builder builder)
        {
            return builder.h;
        }

        static Double i(Builder builder)
        {
            return builder.i;
        }

        static Double j(Builder builder)
        {
            return builder.j;
        }

        static Double k(Builder builder)
        {
            return builder.k;
        }

        static Double l(Builder builder)
        {
            return builder.l;
        }

        static Double m(Builder builder)
        {
            return builder.m;
        }

        static Double n(Builder builder)
        {
            return builder.n;
        }

        static String o(Builder builder)
        {
            return builder.o;
        }

        static Integer p(Builder builder)
        {
            return builder.p;
        }

        static String q(Builder builder)
        {
            return builder.q;
        }

        static Integer r(Builder builder)
        {
            return builder.r;
        }

        static double s(Builder builder)
        {
            return builder.s;
        }

        public abstract BaseEvent build();

        public Builder withAdCreativeId(String s1)
        {
            f = s1;
            return this;
        }

        public Builder withAdHeightPx(Double double1)
        {
            j = double1;
            return this;
        }

        public Builder withAdNetworkType(String s1)
        {
            h = s1;
            return this;
        }

        public Builder withAdType(String s1)
        {
            g = s1;
            return this;
        }

        public Builder withAdUnitId(String s1)
        {
            e = s1;
            return this;
        }

        public Builder withAdWidthPx(Double double1)
        {
            i = double1;
            return this;
        }

        public Builder withGeoAccuracy(Double double1)
        {
            m = double1;
            return this;
        }

        public Builder withGeoLat(Double double1)
        {
            k = double1;
            return this;
        }

        public Builder withGeoLon(Double double1)
        {
            l = double1;
            return this;
        }

        public Builder withPerformanceDurationMs(Double double1)
        {
            n = double1;
            return this;
        }

        public Builder withRequestId(String s1)
        {
            o = s1;
            return this;
        }

        public Builder withRequestRetries(Integer integer)
        {
            r = integer;
            return this;
        }

        public Builder withRequestStatusCode(Integer integer)
        {
            p = integer;
            return this;
        }

        public Builder withRequestUri(String s1)
        {
            q = s1;
            return this;
        }

        public Builder withSdkProduct(SdkProduct sdkproduct)
        {
            d = sdkproduct;
            return this;
        }

        public Builder(ScribeCategory scribecategory, Name name, Category category, double d1)
        {
            Preconditions.checkNotNull(scribecategory);
            Preconditions.checkNotNull(name);
            Preconditions.checkNotNull(category);
            boolean flag;
            if (d1 >= 0.0D && d1 <= 1.0D)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            Preconditions.checkArgument(flag);
            a = scribecategory;
            b = name;
            c = category;
            s = d1;
        }
    }


    private class AppPlatform extends Enum
    {

        public static final AppPlatform ANDROID;
        public static final AppPlatform IOS;
        public static final AppPlatform MOBILE_WEB;
        public static final AppPlatform NONE;
        private static final AppPlatform b[];
        private final int a;

        public static AppPlatform valueOf(String s1)
        {
            return (AppPlatform)Enum.valueOf(com/mopub/common/event/BaseEvent$AppPlatform, s1);
        }

        public static AppPlatform[] values()
        {
            return (AppPlatform[])b.clone();
        }

        public final int getType()
        {
            return a;
        }

        static 
        {
            NONE = new AppPlatform("NONE", 0, 0);
            IOS = new AppPlatform("IOS", 1, 1);
            ANDROID = new AppPlatform("ANDROID", 2, 2);
            MOBILE_WEB = new AppPlatform("MOBILE_WEB", 3, 3);
            b = (new AppPlatform[] {
                NONE, IOS, ANDROID, MOBILE_WEB
            });
        }

        private AppPlatform(String s1, int i1, int j1)
        {
            super(s1, i1);
            a = j1;
        }
    }

}
