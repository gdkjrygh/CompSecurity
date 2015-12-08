// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mopub.nativeads;

import java.util.Map;

public class ViewBinder
{

    final int a;
    final int b;
    final int c;
    final int d;
    final int e;
    final int f;
    final Map g;

    private ViewBinder(Builder builder)
    {
        a = Builder.a(builder);
        b = Builder.b(builder);
        c = Builder.c(builder);
        d = Builder.d(builder);
        e = Builder.e(builder);
        f = Builder.f(builder);
        g = Builder.g(builder);
    }

    ViewBinder(Builder builder, byte byte0)
    {
        this(builder);
    }

    private class Builder
    {

        private final int a;
        private int b;
        private int c;
        private int d;
        private int e;
        private int f;
        private Map g;

        static int a(Builder builder)
        {
            return builder.a;
        }

        static int b(Builder builder)
        {
            return builder.b;
        }

        static int c(Builder builder)
        {
            return builder.c;
        }

        static int d(Builder builder)
        {
            return builder.d;
        }

        static int e(Builder builder)
        {
            return builder.e;
        }

        static int f(Builder builder)
        {
            return builder.f;
        }

        static Map g(Builder builder)
        {
            return builder.g;
        }

        public final Builder addExtra(String s, int i)
        {
            g.put(s, Integer.valueOf(i));
            return this;
        }

        public final Builder addExtras(Map map)
        {
            g = new HashMap(map);
            return this;
        }

        public final ViewBinder build()
        {
            return new ViewBinder(this, (byte)0);
        }

        public final Builder callToActionId(int i)
        {
            d = i;
            return this;
        }

        public final Builder iconImageId(int i)
        {
            f = i;
            return this;
        }

        public final Builder mainImageId(int i)
        {
            e = i;
            return this;
        }

        public final Builder textId(int i)
        {
            c = i;
            return this;
        }

        public final Builder titleId(int i)
        {
            b = i;
            return this;
        }

        public Builder(int i)
        {
            g = Collections.emptyMap();
            a = i;
            g = new HashMap();
        }
    }

}
