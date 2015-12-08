// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;


// Referenced classes of package com.worklight.location.internal.wifi:
//            WifiException

static class orCodes
{

    static final int $SwitchMap$com$worklight$location$api$wifi$WLWifiError$WLWifiErrorCodes[];

    static 
    {
        $SwitchMap$com$worklight$location$api$wifi$WLWifiError$WLWifiErrorCodes = new int[com.worklight.location.api.wifi.fiErrorCodes.values().length];
        try
        {
            $SwitchMap$com$worklight$location$api$wifi$WLWifiError$WLWifiErrorCodes[com.worklight.location.api.wifi.fiErrorCodes.DISABLED.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$worklight$location$api$wifi$WLWifiError$WLWifiErrorCodes[com.worklight.location.api.wifi.fiErrorCodes.FAILED_START_SCAN.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$worklight$location$api$wifi$WLWifiError$WLWifiErrorCodes[com.worklight.location.api.wifi.fiErrorCodes.PERMISSION.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
