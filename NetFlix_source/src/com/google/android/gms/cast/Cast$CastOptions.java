// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.fq;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class Builder
    implements com.google.android.gms.common.api.sOptions
{
    public static final class Builder
    {

        CastDevice xW;
        Cast.Listener xX;
        private int xY;

        static int a(Builder builder1)
        {
            return builder1.xY;
        }

        public Cast.CastOptions build()
        {
            return new Cast.CastOptions(this, null);
        }

        public Builder setVerboseLoggingEnabled(boolean flag)
        {
            if (flag)
            {
                xY = xY | 1;
                return this;
            } else
            {
                xY = xY & -2;
                return this;
            }
        }

        private Builder(CastDevice castdevice, Cast.Listener listener)
        {
            fq.b(castdevice, "CastDevice parameter cannot be null");
            fq.b(listener, "CastListener parameter cannot be null");
            xW = castdevice;
            xX = listener;
            xY = 0;
        }

        Builder(CastDevice castdevice, Cast.Listener listener, Cast._cls1 _pcls1)
        {
            this(castdevice, listener);
        }
    }


    final CastDevice xT;
    final Builder xU;
    private final int xV;

    static int a(Builder.xY xy)
    {
        return xy.xV;
    }

    public static Builder builder(CastDevice castdevice, xV xv)
    {
        return new Builder(castdevice, xv, null);
    }

    private Builder(Builder builder1)
    {
        xT = builder1.xW;
        xU = builder1.xX;
        xV = Builder.a(builder1);
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
