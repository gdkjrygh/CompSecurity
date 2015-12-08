// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import com.google.android.gms.ads.mediation.NetworkExtras;
import com.google.android.gms.internal.zzbo;

public final class PublisherAdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.internal.zzbo.zza zzlh = new com.google.android.gms.internal.zzbo.zza();

        static com.google.android.gms.internal.zzbo.zza zza(Builder builder)
        {
            return builder.zzlh;
        }

        public final Builder addNetworkExtras(NetworkExtras networkextras)
        {
            zzlh.zza(networkextras);
            return this;
        }

        public final PublisherAdRequest build()
        {
            return new PublisherAdRequest(this);
        }

        public final Builder setManualImpressionsEnabled(boolean flag)
        {
            zzlh.zzj(flag);
            return this;
        }

        public Builder()
        {
        }
    }


    public static final String DEVICE_ID_EMULATOR;
    private final zzbo zzlg;

    private PublisherAdRequest(Builder builder)
    {
        zzlg = new zzbo(Builder.zza(builder));
    }


    public final zzbo zzY()
    {
        return zzlg;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzbo.DEVICE_ID_EMULATOR;
    }
}
