// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import android.content.Context;
import android.content.Intent;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.messaging:
//            MessagingSmsManager, Messaging

class ssagingReceiver extends ssagingReceiver
{

    final MessagingSmsManager this$0;

    public void onReceive(Context context, Intent intent)
    {
        intent = new JSONObject();
        if (MessagingSmsManager.access$100(MessagingSmsManager.this, "sim0"))
        {
            context = "serviceadded";
        } else
        {
            context = "serviceremoved";
        }
        try
        {
            intent.put("cmd", context);
            context = new JSONObject();
            intent.put("data", context);
            JSONObject jsonobject = new JSONObject();
            context.put("event", jsonobject);
            jsonobject.put("serviceID", "sim0");
            mMessaging.broadcastMessage(intent.toString());
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
