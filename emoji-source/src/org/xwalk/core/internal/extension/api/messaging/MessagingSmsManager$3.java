// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import android.content.Context;
import android.content.Intent;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.messaging:
//            MessagingSmsManager, Messaging

class ssagingReceiver extends ssagingReceiver
{

    final MessagingSmsManager this$0;

    public void onReceive(Context context, Intent intent)
    {
        JSONObject jsonobject;
        int i;
        boolean flag;
        if (getResultCode() != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        context = intent.getStringExtra("asyncCallId");
        i = Integer.valueOf(intent.getStringExtra("instanceid")).intValue();
        intent = new JSONObject();
        intent.put("asyncCallId", context);
        if (flag)
        {
            context = "deliveryerror";
        } else
        {
            context = "deliverysuccess";
        }
        try
        {
            intent.put("cmd", context);
            context = new JSONObject();
            intent.put("data", context);
            jsonobject = new JSONObject();
            context.put("event", jsonobject);
            jsonobject.put("serviceID", "sim0");
            jsonobject.put("messageID", "");
            jsonobject.put("recipients", "");
            jsonobject.put("deliveryTimestamps", (new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date()));
            context.put("error", flag);
            mMessaging.postMessage(i, intent.toString());
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
        }
        return;
    }

    ssagingReceiver(Messaging messaging)
    {
        this$0 = MessagingSmsManager.this;
        super(MessagingSmsManager.this, messaging);
    }
}
