// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.connect;

import com.spotify.mobile.android.connect.model.DiscoveredDevice;
import com.spotify.mobile.android.connect.model.Message;
import dll;
import dlm;
import dlq;
import dlr;
import dlx;
import dvq;
import ghf;

// Referenced classes of package com.spotify.mobile.android.connect:
//            DiscoveryClient

final class a
    implements dlm
{

    private DiscoveryClient a;

    public final void a(float f)
    {
        if (DiscoveryClient.f(a) != null)
        {
            DiscoveryClient.f(a).a(f);
        }
    }

    public final void a(DiscoveredDevice discovereddevice)
    {
        DiscoveryClient.a(a, null);
        DiscoveryClient.c(a).c.e();
        if (discovereddevice != null && !DiscoveryClient.e(a))
        {
            discovereddevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_LOGIN_FAILED);
            DiscoveryClient.a(a).a(discovereddevice);
        }
        DiscoveryClient.a(a, "Cast Receiver app disconnected", discovereddevice);
        if (DiscoveryClient.f(a) != null)
        {
            DiscoveryClient.f(a).a();
        }
    }

    public final void a(DiscoveredDevice discovereddevice, boolean flag)
    {
        DiscoveryClient.a(a, "Cast Receiver app started", discovereddevice);
        DiscoveryClient.a(a, discovereddevice);
        DiscoveryClient.a(a, false);
        DiscoveryClient.c(a).c.f();
        if (flag)
        {
            DiscoveryClient.d(a).c(dlr.a(discovereddevice));
        }
    }

    public final void a(String s, String s1)
    {
        s1 = dlr.a(s1);
        Object obj;
        switch (a[((Message) (s1)).type.al()])
        {
        default:
            return;

        case 1: // '\001'
            com.fasterxml.jackson.databind.JsonNode jsonnode = ((Message) (s1)).payload;
            s1 = (DiscoveredDevice)dlr.a(((Message) (s1)).payload, com/spotify/mobile/android/connect/model/DiscoveredDevice);
            if (s1 != null)
            {
                s1.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_INVALID_PUBLIC_KEY);
                s = s1;
            } else
            {
                s = DiscoveryClient.a(s);
            }
            DiscoveryClient.a(a).a(s);
            return;

        case 2: // '\002'
            s1 = ((Message) (s1)).payload;
            DiscoveryClient.a(a, s);
            return;

        case 3: // '\003'
            obj = ((Message) (s1)).payload;
            obj = (DiscoveredDevice)dlr.a(((Message) (s1)).payload, com/spotify/mobile/android/connect/model/DiscoveredDevice);
            s1 = ((String) (obj));
            break;
        }
        if (obj == null)
        {
            s1 = DiscoveryClient.a(s);
        }
        DiscoveryClient.a(a, s1.getErrorCode());
        DiscoveryClient.a(a).a(s1);
    }

    public final void b(DiscoveredDevice discovereddevice)
    {
        DiscoveryClient.a(a, null);
        if (discovereddevice != null)
        {
            discovereddevice.setStatus(DiscoveredDevice.DEVICE_FAILURE_STATUS_LOGIN_FAILED);
            DiscoveryClient.a(a).a(discovereddevice);
        }
        DiscoveryClient.a(a, "Cast Receiver app startup failed", discovereddevice);
        DiscoveryClient.a(a, false);
    }

    vice(DiscoveryClient discoveryclient)
    {
        a = discoveryclient;
        super();
    }
}
