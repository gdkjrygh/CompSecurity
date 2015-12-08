// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.cast;

import com.google.android.gms.common.internal.o;

// Referenced classes of package com.google.android.gms.cast:
//            Cast, CastDevice

public static final class Builder
    implements com.google.android.gms.common.api.sOptions
{
    public static final class Builder
    {

        CastDevice EN;
        Cast.Listener EO;
        private int EP;

        static int a(Builder builder1)
        {
            return builder1.EP;
        }

        public Cast.CastOptions build()
        {
            return new Cast.CastOptions(this, null);
        }

        public Builder setVerboseLoggingEnabled(boolean flag)
        {
            if (flag)
            {
                EP = EP | 1;
                return this;
            } else
            {
                EP = EP & -2;
                return this;
            }
        }

        private Builder(CastDevice castdevice, Cast.Listener listener)
        {
            o.b(castdevice, "CastDevice parameter cannot be null");
            o.b(listener, "CastListener parameter cannot be null");
            EN = castdevice;
            EO = listener;
            EP = 0;
        }

        Builder(CastDevice castdevice, Cast.Listener listener, Cast._cls1 _pcls1)
        {
            this(castdevice, listener);
        }
    }


    final CastDevice EK;
    final Builder EL;
    private final int EM;

    static int a(Builder.EP ep)
    {
        return ep.EM;
    }

    public static Builder builder(CastDevice castdevice, EM em)
    {
        return new Builder(castdevice, em, null);
    }

    private Builder(Builder builder1)
    {
        EK = builder1.EN;
        EL = builder1.EO;
        EM = Builder.a(builder1);
    }

    Builder(Builder builder1, Builder builder2)
    {
        this(builder1);
    }
}
