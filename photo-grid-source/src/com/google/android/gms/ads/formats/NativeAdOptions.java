// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.formats;


public final class NativeAdOptions
{

    public static final int ORIENTATION_ANY = 0;
    public static final int ORIENTATION_LANDSCAPE = 2;
    public static final int ORIENTATION_PORTRAIT = 1;
    private final boolean a;
    private final int b;
    private final boolean c;

    private NativeAdOptions(Builder builder)
    {
        a = Builder.a(builder);
        b = Builder.b(builder);
        c = Builder.c(builder);
    }

    NativeAdOptions(Builder builder, byte byte0)
    {
        this(builder);
    }

    public final int getImageOrientation()
    {
        return b;
    }

    public final boolean shouldRequestMultipleImages()
    {
        return c;
    }

    public final boolean shouldReturnUrlsForImageAssets()
    {
        return a;
    }

    private class Builder
    {

        private boolean a;
        private int b;
        private boolean c;

        static boolean a(Builder builder)
        {
            return builder.a;
        }

        static int b(Builder builder)
        {
            return builder.b;
        }

        static boolean c(Builder builder)
        {
            return builder.c;
        }

        public final NativeAdOptions build()
        {
            return new NativeAdOptions(this, (byte)0);
        }

        public final Builder setImageOrientation(int i)
        {
            b = i;
            return this;
        }

        public final Builder setRequestMultipleImages(boolean flag)
        {
            c = flag;
            return this;
        }

        public final Builder setReturnUrlsForImageAssets(boolean flag)
        {
            a = flag;
            return this;
        }

        public Builder()
        {
            a = false;
            b = 0;
            c = false;
        }
    }

}
