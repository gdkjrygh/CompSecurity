// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            XWalkMediaCodec, DeviceCapabilities

class DeviceCapabilitiesCodecs
{

    private XWalkMediaCodec mediaCodec;

    public DeviceCapabilitiesCodecs(DeviceCapabilities devicecapabilities)
    {
        mediaCodec = XWalkMediaCodec.Create(devicecapabilities);
    }

    public JSONObject getInfo()
    {
        return mediaCodec.getCodecsInfo();
    }
}
