// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.device;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.device:
//            BaseDeviceEvent

public class NetworkConnected extends BaseDeviceEvent
{

    public static final String TYPE = "networkconnected";

    public NetworkConnected()
    {
        super("networkconnected");
    }

    public JSONObject getData()
        throws JSONException
    {
        JSONObject jsonobject = new JSONObject();
        jsonobject.put("type", getType());
        return jsonobject;
    }
}
