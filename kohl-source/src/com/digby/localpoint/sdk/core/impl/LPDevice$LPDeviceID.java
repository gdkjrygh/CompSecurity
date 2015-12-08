// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.digby.localpoint.sdk.core.impl;

import com.digby.localpoint.sdk.core.ILPID;

// Referenced classes of package com.digby.localpoint.sdk.core.impl:
//            LPDevice

private class deviceId
    implements ILPID
{

    private final String deviceId;
    final LPDevice this$0;

    public String getValue()
    {
        return deviceId;
    }

    public (String s)
    {
        this$0 = LPDevice.this;
        super();
        lpdevice = s;
        if (s == null)
        {
            lpdevice = "";
        }
        deviceId = LPDevice.this;
    }
}
