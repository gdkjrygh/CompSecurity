// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.connect;

import dlg;
import dlq;
import dlr;

// Referenced classes of package com.spotify.mobile.android.connect:
//            DiscoveryClient

final class a
    implements dlg
{

    private DiscoveryClient a;

    public final void a(String s, String s1, String s2, String s3)
    {
        if (DiscoveryClient.d(a).b(s))
        {
            if (!DiscoveryClient.e(a))
            {
                DiscoveryClient.d(a).c(dlr.a(s1, s2, s3));
            }
            return;
        } else
        {
            DiscoveryClient.a(a, true);
            s1 = DiscoveryClient.d(a);
            s2 = DiscoveryClient.g(a);
            s1.g = true;
            s1.a(s, s2);
            return;
        }
    }

    (DiscoveryClient discoveryclient)
    {
        a = discoveryclient;
        super();
    }
}
