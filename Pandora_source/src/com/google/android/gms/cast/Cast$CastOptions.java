// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.zzv;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class Builder
    implements com.google.android.gms.common.api.sOptions
{
    public static final class Builder
    {

        CastDevice zzLR;
        Cast.Listener zzLS;
        private int zzLT;

        static int zza(Builder builder1)
        {
            return builder1.zzLT;
        }

        public Cast.CastOptions build()
        {
            return new Cast.CastOptions(this, null);
        }

        public Builder setVerboseLoggingEnabled(boolean flag)
        {
            if (flag)
            {
                zzLT = zzLT | 1;
                return this;
            } else
            {
                zzLT = zzLT & -2;
                return this;
            }
        }

        private Builder(CastDevice castdevice, Cast.Listener listener)
        {
            zzv.zzb(castdevice, "CastDevice parameter cannot be null");
            zzv.zzb(listener, "CastListener parameter cannot be null");
            zzLR = castdevice;
            zzLS = listener;
            zzLT = 0;
        }

        Builder(CastDevice castdevice, Cast.Listener listener, Cast._cls1 _pcls1)
        {
            this(castdevice, listener);
        }
    }


    final CastDevice zzLO;
    final zzLQ zzLP;
    private final int zzLQ;

    public static Builder builder(CastDevice castdevice, Builder.zzLT zzlt)
    {
        return new Builder(castdevice, zzlt, null);
    }

    static int zza(Builder builder1)
    {
        return builder1.zzLQ;
    }

    private Builder(Builder builder1)
    {
        zzLO = builder1.zzLR;
        zzLP = builder1.zzLS;
        zzLQ = Builder.zza(builder1);
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
