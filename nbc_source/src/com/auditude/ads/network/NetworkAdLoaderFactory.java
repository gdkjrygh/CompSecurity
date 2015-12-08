// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.auditude.ads.network;

import com.auditude.ads.network.vast.VASTAdLoader;
import com.auditude.ads.util.StringUtil;

// Referenced classes of package com.auditude.ads.network:
//            INetworkAdLoader

public class NetworkAdLoaderFactory
{

    public NetworkAdLoaderFactory()
    {
    }

    public static INetworkAdLoader getLoaderForType(String s)
    {
        if (!StringUtil.isNullOrEmpty(s))
        {
            if (s.toLowerCase().equals("vast"))
            {
                return new VASTAdLoader();
            }
            if (s.toLowerCase().equals("vpaid"))
            {
                return null;
            }
        }
        return null;
    }
}
