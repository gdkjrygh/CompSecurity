// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.sdk.cmloginsdkjar.internal;

import com.cleanmaster.sdk.cmloginsdkjar.Settings;

public final class ServerProtocol
{

    public static final String PROXY_API_VERSION = "1";
    private static final String PROXY_BARE_URL_FORMAT = "proxy.%s";
    private static final String PROXY_URL_FORMAT = "https://proxy.%s";

    public ServerProtocol()
    {
    }

    public static final String getAPIVersion()
    {
        return "1";
    }

    public static final String getProxyUrlBase()
    {
        return String.format("https://proxy.%s", new Object[] {
            Settings.getCleanmasterDomain()
        });
    }
}
