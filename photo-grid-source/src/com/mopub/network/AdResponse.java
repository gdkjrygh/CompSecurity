// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.network;

import com.mopub.common.util.DateAndTime;
import java.io.Serializable;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONObject;

public class AdResponse
    implements Serializable
{

    private final String a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final String h;
    private final String i;
    private final Integer j;
    private final Integer k;
    private final Integer l;
    private final Integer m;
    private final String n;
    private final boolean o;
    private final String p;
    private final JSONObject q;
    private final String r;
    private final Map s;
    private final long t;

    private AdResponse(Builder builder)
    {
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
        k = Builder.k(builder);
        l = Builder.l(builder);
        m = Builder.m(builder);
        n = Builder.n(builder);
        o = Builder.o(builder);
        p = Builder.p(builder);
        q = Builder.q(builder);
        r = Builder.r(builder);
        s = Builder.s(builder);
        t = DateAndTime.now().getTime();
    }

    AdResponse(Builder builder, byte byte0)
    {
        this(builder);
    }

    public Integer getAdTimeoutMillis()
    {
        return l;
    }

    public String getAdType()
    {
        return a;
    }

    public String getAdUnitId()
    {
        return b;
    }

    public String getClickTrackingUrl()
    {
        return f;
    }

    public String getCustomEventClassName()
    {
        return r;
    }

    public String getDspCreativeId()
    {
        return n;
    }

    public String getFailoverUrl()
    {
        return h;
    }

    public String getFullAdType()
    {
        return c;
    }

    public Integer getHeight()
    {
        return k;
    }

    public String getImpressionTrackingUrl()
    {
        return g;
    }

    public JSONObject getJsonBody()
    {
        return q;
    }

    public String getNetworkType()
    {
        return d;
    }

    public String getRedirectUrl()
    {
        return e;
    }

    public Integer getRefreshTimeMillis()
    {
        return m;
    }

    public String getRequestId()
    {
        return i;
    }

    public Map getServerExtras()
    {
        return new TreeMap(s);
    }

    public String getStringBody()
    {
        return p;
    }

    public long getTimestamp()
    {
        return t;
    }

    public Integer getWidth()
    {
        return j;
    }

    public boolean hasJson()
    {
        return q != null;
    }

    public boolean isScrollable()
    {
        return o;
    }

    public Builder toBuilder()
    {
        return (new Builder()).setAdType(a).setNetworkType(d).setRedirectUrl(e).setClickTrackingUrl(f).setImpressionTrackingUrl(g).setFailoverUrl(h).setDimensions(j, k).setAdTimeoutDelayMilliseconds(l).setRefreshTimeMilliseconds(m).setDspCreativeId(n).setScrollable(Boolean.valueOf(o)).setResponseBody(p).setJsonBody(q).setCustomEventClassName(r).setServerExtras(s);
    }

    private class Builder
    {

        private String a;
        private String b;
        private String c;
        private String d;
        private String e;
        private String f;
        private String g;
        private String h;
        private String i;
        private Integer j;
        private Integer k;
        private Integer l;
        private Integer m;
        private String n;
        private boolean o;
        private String p;
        private JSONObject q;
        private String r;
        private Map s;

        static String a(Builder builder)
        {
            return builder.a;
        }

        static String b(Builder builder)
        {
            return builder.b;
        }

        static String c(Builder builder)
        {
            return builder.c;
        }

        static String d(Builder builder)
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

        static String i(Builder builder)
        {
            return builder.i;
        }

        static Integer j(Builder builder)
        {
            return builder.j;
        }

        static Integer k(Builder builder)
        {
            return builder.k;
        }

        static Integer l(Builder builder)
        {
            return builder.l;
        }

        static Integer m(Builder builder)
        {
            return builder.m;
        }

        static String n(Builder builder)
        {
            return builder.n;
        }

        static boolean o(Builder builder)
        {
            return builder.o;
        }

        static String p(Builder builder)
        {
            return builder.p;
        }

        static JSONObject q(Builder builder)
        {
            return builder.q;
        }

        static String r(Builder builder)
        {
            return builder.r;
        }

        static Map s(Builder builder)
        {
            return builder.s;
        }

        public AdResponse build()
        {
            return new AdResponse(this, (byte)0);
        }

        public Builder setAdTimeoutDelayMilliseconds(Integer integer)
        {
            l = integer;
            return this;
        }

        public Builder setAdType(String s1)
        {
            a = s1;
            return this;
        }

        public Builder setAdUnitId(String s1)
        {
            b = s1;
            return this;
        }

        public Builder setClickTrackingUrl(String s1)
        {
            f = s1;
            return this;
        }

        public Builder setCustomEventClassName(String s1)
        {
            r = s1;
            return this;
        }

        public Builder setDimensions(Integer integer, Integer integer1)
        {
            j = integer;
            k = integer1;
            return this;
        }

        public Builder setDspCreativeId(String s1)
        {
            n = s1;
            return this;
        }

        public Builder setFailoverUrl(String s1)
        {
            h = s1;
            return this;
        }

        public Builder setFullAdType(String s1)
        {
            c = s1;
            return this;
        }

        public Builder setImpressionTrackingUrl(String s1)
        {
            g = s1;
            return this;
        }

        public Builder setJsonBody(JSONObject jsonobject)
        {
            q = jsonobject;
            return this;
        }

        public Builder setNetworkType(String s1)
        {
            d = s1;
            return this;
        }

        public Builder setRedirectUrl(String s1)
        {
            e = s1;
            return this;
        }

        public Builder setRefreshTimeMilliseconds(Integer integer)
        {
            m = integer;
            return this;
        }

        public Builder setRequestId(String s1)
        {
            i = s1;
            return this;
        }

        public Builder setResponseBody(String s1)
        {
            p = s1;
            return this;
        }

        public Builder setScrollable(Boolean boolean1)
        {
            boolean flag;
            if (boolean1 == null)
            {
                flag = o;
            } else
            {
                flag = boolean1.booleanValue();
            }
            o = flag;
            return this;
        }

        public Builder setServerExtras(Map map)
        {
            if (map == null)
            {
                s = new TreeMap();
                return this;
            } else
            {
                s = new TreeMap(map);
                return this;
            }
        }

        public Builder()
        {
            o = false;
            s = new TreeMap();
        }
    }

}
