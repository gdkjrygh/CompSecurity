// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.skype.android.push:
//            SkyLibPushMessage, PushServiceType, PushEventType

public class CallPushMessage extends SkyLibPushMessage
{

    private static final String EXTRA_GENERIC_PAYLOAD = "genericPayload";
    private static final String EXTRA_NODE_PAYLOAD = "specificPayload";
    private static final String EXTRA_SERVICE_PAYLOAD = "servicePayload";
    private static final Logger log = Logger.getLogger("CallPushMessage");
    private String callId;
    private String conversationId;
    private byte genericNotificationPayload[];
    private byte nodeSpecificNotificationPayload[];
    private String servicePayload;

    public CallPushMessage(PushServiceType pushservicetype, PushEventType pusheventtype, Intent intent)
    {
        super(pushservicetype, pusheventtype, intent);
        conversationId = intent.getStringExtra("conversationId");
        callId = intent.getStringExtra("callId");
        pushservicetype = intent.getExtras();
        nodeSpecificNotificationPayload = Base64.decode(pushservicetype.getString("specificPayload", ""), 0);
        genericNotificationPayload = Base64.decode(pushservicetype.getString("genericPayload", ""), 0);
        servicePayload = pushservicetype.getString("servicePayload", "");
        includeCallIdIntoServicePayload();
    }

    private void includeCallIdIntoServicePayload()
    {
        if (TextUtils.isEmpty(callId))
        {
            break MISSING_BLOCK_LABEL_97;
        }
        Object obj;
        if (!TextUtils.isEmpty(servicePayload))
        {
            break MISSING_BLOCK_LABEL_49;
        }
        obj = new JSONObject();
_L1:
        if (((JSONObject) (obj)).has("callId"))
        {
            log.log(Level.WARNING, "servicePayload already contains CallId, skipping modification");
            return;
        }
        break MISSING_BLOCK_LABEL_78;
        try
        {
            obj = new JSONObject(servicePayload);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            log.log(Level.WARNING, "Failed convert servicePayload to JSONObject", ((Throwable) (obj)));
            return;
        }
          goto _L1
        ((JSONObject) (obj)).put("callId", callId);
        servicePayload = ((JSONObject) (obj)).toString();
    }

    public String getCallId()
    {
        return callId;
    }

    public String getConversationId()
    {
        return conversationId;
    }

    public byte[] getGenericNotificationPayload()
    {
        return genericNotificationPayload;
    }

    public byte[] getNodeSpecificNotificationPayload()
    {
        return nodeSpecificNotificationPayload;
    }

    public String getServicePayload()
    {
        return servicePayload;
    }

}
