// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.api.geo;

import com.worklight.location.internal.AbstractAcquisitionError;

public class WLGeoError extends AbstractAcquisitionError
{
    public static final class WLGeoErrorCodes extends Enum
    {

        private static final WLGeoErrorCodes $VALUES[];
        public static final WLGeoErrorCodes PERMISSION_DENIED;
        public static final WLGeoErrorCodes POSITION_UNAVAILABLE;
        public static final WLGeoErrorCodes TIMEOUT;

        public static WLGeoErrorCodes valueOf(String s)
        {
            return (WLGeoErrorCodes)Enum.valueOf(com/worklight/location/api/geo/WLGeoError$WLGeoErrorCodes, s);
        }

        public static WLGeoErrorCodes[] values()
        {
            return (WLGeoErrorCodes[])$VALUES.clone();
        }

        static 
        {
            PERMISSION_DENIED = new WLGeoErrorCodes("PERMISSION_DENIED", 0);
            POSITION_UNAVAILABLE = new WLGeoErrorCodes("POSITION_UNAVAILABLE", 1);
            TIMEOUT = new WLGeoErrorCodes("TIMEOUT", 2);
            $VALUES = (new WLGeoErrorCodes[] {
                PERMISSION_DENIED, POSITION_UNAVAILABLE, TIMEOUT
            });
        }

        private WLGeoErrorCodes(String s, int i)
        {
            super(s, i);
        }
    }


    private final WLGeoErrorCodes errorCode;

    public WLGeoError(WLGeoErrorCodes wlgeoerrorcodes, String s)
    {
        super(s);
        errorCode = wlgeoerrorcodes;
    }

    public WLGeoErrorCodes getErrorCode()
    {
        return errorCode;
    }

    public volatile Object getErrorCode()
    {
        return getErrorCode();
    }

    public String toString()
    {
        String s;
        if (errorCode == WLGeoErrorCodes.POSITION_UNAVAILABLE)
        {
            s = "Position unavailable";
        } else
        if (errorCode == WLGeoErrorCodes.PERMISSION_DENIED)
        {
            s = "Permission denied";
        } else
        {
            s = "Timeout";
        }
        return (new StringBuilder()).append(s).append(": ").append(message).toString();
    }
}
