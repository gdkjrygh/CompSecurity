// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.wifi;

import com.worklight.location.internal.AbstractAcquisitionError;

public class WLWifiError extends AbstractAcquisitionError
{
    public static final class WLWifiErrorCodes extends Enum
    {

        private static final WLWifiErrorCodes $VALUES[];
        public static final WLWifiErrorCodes DISABLED;
        public static final WLWifiErrorCodes FAILED_START_SCAN;
        public static final WLWifiErrorCodes PERMISSION;

        public static WLWifiErrorCodes valueOf(String s)
        {
            return (WLWifiErrorCodes)Enum.valueOf(com/worklight/location/api/wifi/WLWifiError$WLWifiErrorCodes, s);
        }

        public static WLWifiErrorCodes[] values()
        {
            return (WLWifiErrorCodes[])$VALUES.clone();
        }

        static 
        {
            PERMISSION = new WLWifiErrorCodes("PERMISSION", 0);
            DISABLED = new WLWifiErrorCodes("DISABLED", 1);
            FAILED_START_SCAN = new WLWifiErrorCodes("FAILED_START_SCAN", 2);
            $VALUES = (new WLWifiErrorCodes[] {
                PERMISSION, DISABLED, FAILED_START_SCAN
            });
        }

        private WLWifiErrorCodes(String s, int i)
        {
            super(s, i);
        }
    }


    private final WLWifiErrorCodes code;

    public WLWifiError(WLWifiErrorCodes wlwifierrorcodes, String s)
    {
        super(s);
        code = wlwifierrorcodes;
    }

    public WLWifiErrorCodes getErrorCode()
    {
        return code;
    }

    public volatile Object getErrorCode()
    {
        return getErrorCode();
    }
}
