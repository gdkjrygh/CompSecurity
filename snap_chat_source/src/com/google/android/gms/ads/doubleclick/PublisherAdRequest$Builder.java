// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import com.google.android.gms.ads.mediation.NetworkExtras;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public static final class 
{

    private final com.google.android.gms.internal.uilder.zzlh zzlh = new com.google.android.gms.internal.uilder.zzlh();

    static com.google.android.gms.internal.uilder zza( )
    {
        return .zzlh;
    }

    public final zzlh addNetworkExtras(NetworkExtras networkextras)
    {
        zzlh.zzlh(networkextras);
        return this;
    }

    public final PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public final zzlh setManualImpressionsEnabled(boolean flag)
    {
        zzlh.zzlh(flag);
        return this;
    }

    public ()
    {
    }
}
