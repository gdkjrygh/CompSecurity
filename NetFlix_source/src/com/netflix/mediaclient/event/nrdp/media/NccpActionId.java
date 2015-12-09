// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.event.nrdp.media;

import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.event.nrdp.media:
//            NccpError

public class NccpActionId extends NccpError
{

    private int actionId;
    private String bcp47;
    private String message;
    private int reasonCode;

    public NccpActionId(int i, String s, String s1, String s2, String s3, int j, String s4)
    {
        actionId = i;
        message = s1;
        origin = s2;
        bcp47 = s;
        result = s3;
        reasonCode = j;
        transaction = s4;
        type = "Nccp";
    }

    public NccpActionId(JSONObject jsonobject)
        throws JSONException
    {
        super(jsonobject);
    }

    public int getActionId()
    {
        return actionId;
    }

    public String getBcp47()
    {
        return bcp47;
    }

    public String getMessage()
    {
        return message;
    }

    public int getReasonCode()
    {
        return reasonCode;
    }

    protected void populate(JSONObject jsonobject)
        throws JSONException
    {
        actionId = getInt(jsonobject, "actionId", 0);
        reasonCode = getInt(jsonobject, "reasonCode", 0);
        message = getString(jsonobject, "message", null);
        bcp47 = getString(jsonobject, "bcp47", null);
        origin = getString(jsonobject, "origin", null);
        result = getString(jsonobject, "result", null);
        transaction = getString(jsonobject, "transaction", null);
        type = getString(jsonobject, "type", null);
    }

    public String toString()
    {
        return (new StringBuilder()).append("NccpActionId [actionId=").append(actionId).append(", bcp47=").append(bcp47).append(", message=").append(message).append(", reasonCode=").append(reasonCode).append(", origin=").append(origin).append(", result=").append(result).append(", transaction=").append(transaction).append(", type=").append(type).append("]").toString();
    }
}
