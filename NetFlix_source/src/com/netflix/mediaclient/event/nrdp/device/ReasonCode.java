// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.device;

import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.device:
//            BaseDeviceEvent

public class ReasonCode extends BaseDeviceEvent
{

    public static final String TYPE = "nrdp-webapi-nccpreasoncode";

    public ReasonCode(JSONObject jsonobject)
    {
        super("nrdp-webapi-nccpreasoncode");
        json = jsonobject;
        try
        {
            jsonobject.put("type", getType());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return;
        }
    }
}
