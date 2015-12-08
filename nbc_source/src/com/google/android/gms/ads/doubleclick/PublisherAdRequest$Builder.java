// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.ads.doubleclick;

import com.google.android.gms.ads.mediation.NetworkExtras;

// Referenced classes of package com.google.android.gms.ads.doubleclick:
//            PublisherAdRequest

public static final class 
{

    private final com.google.android.gms.ads.internal.client. zznL = new com.google.android.gms.ads.internal.client.();

    static com.google.android.gms.ads.internal.client. zza( )
    {
        return .zznL;
    }

    public zznL addNetworkExtras(NetworkExtras networkextras)
    {
        zznL.(networkextras);
        return this;
    }

    public PublisherAdRequest build()
    {
        return new PublisherAdRequest(this, null);
    }

    public ()
    {
    }
}
