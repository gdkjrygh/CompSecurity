// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.alibaba.akita.net.util;


// Referenced classes of package com.alibaba.akita.net.util:
//            NetWorkUtil

static class bileNetworkType
{

    static final int $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$ConnectType[];
    static final int $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$MobileNetworkType[];

    static 
    {
        $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$ConnectType = new int[nnectType.values().length];
        try
        {
            $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$ConnectType[nnectType.CONNECT_TYPE_WIFI.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror6) { }
        try
        {
            $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$ConnectType[nnectType.CONNECT_TYPE_MOBILE.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror5) { }
        try
        {
            $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$ConnectType[nnectType.CONNECT_TYPE_DISCONNECT.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror4) { }
        $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$MobileNetworkType = new int[bileNetworkType.values().length];
        try
        {
            $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$MobileNetworkType[bileNetworkType.MOBILE_NETWORK_TYPE_2G.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$MobileNetworkType[bileNetworkType.MOBILE_NETWORK_TYPE_3G.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$MobileNetworkType[bileNetworkType.MOBILE_NETWORK_TYPE_4G.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$alibaba$akita$net$util$NetWorkUtil$MobileNetworkType[bileNetworkType.MOBILE_NETWORK_TYPE_UNKNOWN.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
