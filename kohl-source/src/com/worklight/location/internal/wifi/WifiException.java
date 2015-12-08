// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.wifi;


public class WifiException extends Exception
{

    private final com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes errorCode;

    public WifiException(com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes wlwifierrorcodes)
    {
        super(getErrorMessage(wlwifierrorcodes));
        errorCode = wlwifierrorcodes;
    }

    private static String getErrorMessage(com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes wlwifierrorcodes)
    {
        static class _cls1
        {

            static final int $SwitchMap$com$worklight$location$api$wifi$WLWifiError$WLWifiErrorCodes[];

            static 
            {
                $SwitchMap$com$worklight$location$api$wifi$WLWifiError$WLWifiErrorCodes = new int[com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes.values().length];
                try
                {
                    $SwitchMap$com$worklight$location$api$wifi$WLWifiError$WLWifiErrorCodes[com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes.DISABLED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$worklight$location$api$wifi$WLWifiError$WLWifiErrorCodes[com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes.FAILED_START_SCAN.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$worklight$location$api$wifi$WLWifiError$WLWifiErrorCodes[com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes.PERMISSION.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls1..SwitchMap.com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes[wlwifierrorcodes.ordinal()])
        {
        default:
            throw new AssertionError((new StringBuilder()).append("Invalid enum ").append(wlwifierrorcodes).toString());

        case 1: // '\001'
            return "The WiFi on the device is turned off";

        case 2: // '\002'
            return "The device failed to start scanning. It is recommended that you try again after a few seconds";

        case 3: // '\003'
            return "There is a permissions problem.";
        }
    }

    public com.worklight.location.api.wifi.WLWifiError.WLWifiErrorCodes getErrorCode()
    {
        return errorCode;
    }
}
