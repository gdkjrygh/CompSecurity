// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
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
        context = intent.getExtras();
        if (context != null)
        {
            context = ((Context) ((Object[])(Object[])context.get("pdus")));
            int i = 0;
            while (i < context.length) 
            {
                try
                {
                    intent = new JSONObject();
                    intent.put("cmd", "received");
                    SmsMessage smsmessage = SmsMessage.createFromPdu((byte[])(byte[])context[i]);
                    JSONObject jsonobject = new JSONObject();
                    intent.put("data", jsonobject);
                    JSONObject jsonobject1 = new JSONObject();
                    jsonobject.put("message", jsonobject1);
                    jsonobject1.put("messageID", "");
                    jsonobject1.put("type", "sms");
                    jsonobject1.put("serviceID", "sim0");
                    jsonobject1.put("from", smsmessage.getOriginatingAddress());
                    jsonobject1.put("timestamp", (new SimpleDateFormat("yyyy-MM-dd hh:mm:ss")).format(new Date()));
                    jsonobject1.put("body", smsmessage.getMessageBody().toString());
                    mMessaging.broadcastMessage(intent.toString());
                }
                // Misplaced declaration of an exception variable
                catch (Context context)
                {
                    context.printStackTrace();
                    return;
                }
                i++;
            }
        }
    }

    ssagingReceiver(Messaging messaging)
    {
        this$0 = MessagingSmsManager.this;
        super(MessagingSmsManager.this, messaging);
    }
}
