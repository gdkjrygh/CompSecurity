// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import com.google.android.gms.ads.internal.client.zzx;
import com.google.android.gms.ads.mediation.NetworkExtras;

public final class PublisherAdRequest
{
    public static final class Builder
    {

        private final com.google.android.gms.ads.internal.client.zzx.zza zznL = new com.google.android.gms.ads.internal.client.zzx.zza();

        static com.google.android.gms.ads.internal.client.zzx.zza zza(Builder builder)
        {
            return builder.zznL;
        }

        public Builder addNetworkExtras(NetworkExtras networkextras)
        {
            zznL.zza(networkextras);
            return this;
        }

        public PublisherAdRequest build()
        {
            return new PublisherAdRequest(this);
        }

        public Builder()
        {
        }
    }


    public static final String DEVICE_ID_EMULATOR;
    private final zzx zznK;

    private PublisherAdRequest(Builder builder)
    {
        zznK = new zzx(Builder.zza(builder));
    }


    public zzx zzaF()
    {
        return zznK;
    }

    static 
    {
        DEVICE_ID_EMULATOR = zzx.DEVICE_ID_EMULATOR;
    }
}
