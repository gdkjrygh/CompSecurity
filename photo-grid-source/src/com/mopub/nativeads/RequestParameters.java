// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import android.location.Location;
import android.text.TextUtils;
import java.util.EnumSet;

public class RequestParameters
{

    private final String a;
    private final Location b;
    private final EnumSet c;

    private RequestParameters(Builder builder)
    {
        a = Builder.a(builder);
        b = Builder.b(builder);
        c = Builder.c(builder);
    }

    RequestParameters(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final String getDesiredAssets()
    {
        String s = "";
        if (c != null)
        {
            s = TextUtils.join(",", c.toArray());
        }
        return s;
    }

    public final String getKeywords()
    {
        return a;
    }

    public final Location getLocation()
    {
        return b;
    }

    private class Builder
    {

        private String a;
        private Location b;
        private EnumSet c;

        static String a(Builder builder)
        {
            return builder.a;
        }

        static Location b(Builder builder)
        {
            return builder.b;
        }

        static EnumSet c(Builder builder)
        {
            return builder.c;
        }

        public final RequestParameters build()
        {
            return new RequestParameters(this, (byte)0);
        }

        public final Builder desiredAssets(EnumSet enumset)
        {
            c = EnumSet.copyOf(enumset);
            return this;
        }

        public final Builder keywords(String s)
        {
            a = s;
            return this;
        }

        public final Builder location(Location location1)
        {
            b = location1;
            return this;
        }

        public Builder()
        {
        }
    }

}
