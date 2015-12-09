// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.event.nrdp.media.NccpError;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp:
//            BaseNrdpEvent

public class BackgroundEvent extends BaseNrdpEvent
{

    private static final String TAG = "nf-nccp";
    public static final String TYPE = "background";

    public BackgroundEvent(NccpError nccperror)
        throws JSONException
    {
        super("background");
        JSONObject jsonobject1 = nccperror.json;
        JSONObject jsonobject = jsonobject1;
        if (jsonobject1 == null)
        {
            Log.w("nf-nccp", (new StringBuilder()).append("JSON was null for ").append(nccperror).toString());
            jsonobject = new JSONObject();
        }
        jsonobject.put("type", getName());
        json = jsonobject;
    }
}
