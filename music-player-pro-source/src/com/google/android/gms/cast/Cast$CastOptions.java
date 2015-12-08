// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.jx;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class Builder
    implements com.google.android.gms.common.api.sOptions
{
    public static final class Builder
    {

        CastDevice FC;
        Cast.Listener FD;
        private int FE;

        static int a(Builder builder1)
        {
            return builder1.FE;
        }

        public Cast.CastOptions build()
        {
            return new Cast.CastOptions(this, null);
        }

        public Builder setVerboseLoggingEnabled(boolean flag)
        {
            if (flag)
            {
                FE = FE | 1;
                return this;
            } else
            {
                FE = FE & -2;
                return this;
            }
        }

        private Builder(CastDevice castdevice, Cast.Listener listener)
        {
            jx.b(castdevice, "CastDevice parameter cannot be null");
            jx.b(listener, "CastListener parameter cannot be null");
            FC = castdevice;
            FD = listener;
            FE = 0;
        }

        Builder(CastDevice castdevice, Cast.Listener listener, Cast._cls1 _pcls1)
        {
            this(castdevice, listener);
        }
    }


    final Builder FA;
    private final int FB;
    final CastDevice Fz;

    static int a(Builder.FE fe)
    {
        return fe.FB;
    }

    public static Builder builder(CastDevice castdevice, FB fb)
    {
        return new Builder(castdevice, fb, null);
    }

    private Builder(Builder builder1)
    {
        Fz = builder1.FC;
        FA = builder1.FD;
        FB = Builder.a(builder1);
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
