// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.device_capabilities;

import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.device_capabilities:
//            XWalkMediaCodec, DeviceCapabilities

class MediaCodecNull extends XWalkMediaCodec
{

    public MediaCodecNull(DeviceCapabilities devicecapabilities)
    {
    }

    public JSONObject getCodecsInfo()
    {
        return new JSONObject();
    }
}
