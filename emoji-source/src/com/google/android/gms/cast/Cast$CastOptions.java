// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.internal.hm;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class Builder
    implements com.google.android.gms.common.api.sOptions
{
    public static final class Builder
    {

        CastDevice Ad;
        Cast.Listener Ae;
        private int Af;

        static int a(Builder builder1)
        {
            return builder1.Af;
        }

        public Cast.CastOptions build()
        {
            return new Cast.CastOptions(this, null);
        }

        public Builder setVerboseLoggingEnabled(boolean flag)
        {
            if (flag)
            {
                Af = Af | 1;
                return this;
            } else
            {
                Af = Af & -2;
                return this;
            }
        }

        private Builder(CastDevice castdevice, Cast.Listener listener)
        {
            hm.b(castdevice, "CastDevice parameter cannot be null");
            hm.b(listener, "CastListener parameter cannot be null");
            Ad = castdevice;
            Ae = listener;
            Af = 0;
        }

        Builder(CastDevice castdevice, Cast.Listener listener, Cast._cls1 _pcls1)
        {
            this(castdevice, listener);
        }
    }


    final CastDevice Aa;
    final Builder Ab;
    private final int Ac;

    static int a(Builder.Af af)
    {
        return af.Ac;
    }

    public static Builder builder(CastDevice castdevice, Ac ac)
    {
        return new Builder(castdevice, ac, null);
    }

    private Builder(Builder builder1)
    {
        Aa = builder1.Ad;
        Ab = builder1.Ae;
        Ac = Builder.a(builder1);
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
