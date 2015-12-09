// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.connect;

import com.spotify.mobile.android.connect.model.DiscoveredDevice;
import dlk;
import dlx;

// Referenced classes of package com.spotify.mobile.android.connect:
//            DiscoveryClient

public final class a
    implements dlk
{

    private DiscoveryClient a;

    public final void a(DiscoveredDevice discovereddevice)
    {
        DiscoveryClient.a(a).a("DELETE", dlx.a(discovereddevice.getDeviceId()), discovereddevice);
    }

    public final void b(DiscoveredDevice discovereddevice)
    {
        DiscoveryClient.a(a).a("PUT", dlx.a(discovereddevice.getDeviceId()), discovereddevice);
        DiscoveryClient.b(a);
    }

    vice(DiscoveryClient discoveryclient)
    {
        a = discoveryclient;
        super();
    }
}
