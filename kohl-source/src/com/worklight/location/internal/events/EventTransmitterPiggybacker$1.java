// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.location.internal.events;

import com.worklight.wlclient.api.WLErrorCode;

// Referenced classes of package com.worklight.location.internal.events:
//            EventTransmitterPiggybacker

static class 
{

    static final int $SwitchMap$com$worklight$wlclient$api$WLErrorCode[];

    static 
    {
        $SwitchMap$com$worklight$wlclient$api$WLErrorCode = new int[WLErrorCode.values().length];
        try
        {
            $SwitchMap$com$worklight$wlclient$api$WLErrorCode[WLErrorCode.UNRESPONSIVE_HOST.ordinal()] = 1;
        }
        catch (NoSuchFieldError nosuchfielderror3) { }
        try
        {
            $SwitchMap$com$worklight$wlclient$api$WLErrorCode[WLErrorCode.REQUEST_TIMEOUT.ordinal()] = 2;
        }
        catch (NoSuchFieldError nosuchfielderror2) { }
        try
        {
            $SwitchMap$com$worklight$wlclient$api$WLErrorCode[WLErrorCode.REQUEST_SERVICE_NOT_FOUND.ordinal()] = 3;
        }
        catch (NoSuchFieldError nosuchfielderror1) { }
        try
        {
            $SwitchMap$com$worklight$wlclient$api$WLErrorCode[WLErrorCode.APP_VERSION_ACCESS_DENIAL.ordinal()] = 4;
        }
        catch (NoSuchFieldError nosuchfielderror)
        {
            return;
        }
    }
}
