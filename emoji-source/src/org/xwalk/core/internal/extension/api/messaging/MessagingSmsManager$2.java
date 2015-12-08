// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.xwalk.core.internal.extension.api.messaging;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package org.xwalk.core.internal.extension.api.messaging:
//            MessagingSmsManager, Messaging

class ssagingReceiver extends ssagingReceiver
{

    final MessagingSmsManager this$0;

    public void onReceive(Context context, Intent intent)
    {
        Activity activity = (Activity)MessagingSmsManager.access$000(MessagingSmsManager.this).get();
        if (activity == null)
        {
            return;
        }
        String s;
        String s1;
        Object obj;
        int i;
        boolean flag;
        if (getResultCode() != -1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        obj = intent.getStringExtra("asyncCallId");
        s = intent.getStringExtra("message");
        s1 = intent.getStringExtra("to");
        i = Integer.valueOf(intent.getStringExtra("instanceid")).intValue();
        try
        {
            intent = new JSONObject();
            intent.put("type", "sms");
            intent.put("from", "");
            intent.put("read", true);
            intent.put("to", s1);
            intent.put("body", s);
            intent.put("messageClass", "class1");
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context.printStackTrace();
            return;
        }
        if (flag)
        {
            context = "failed";
        } else
        {
            context = "sending";
        }
        intent.put("state", context);
        if (flag)
        {
            context = "error";
        } else
        {
            context = "pending";
        }
        intent.put("deliveryStatus", context);
        context = new JSONObject();
        context.put("asyncCallId", obj);
        context.put("cmd", "msg_smsSend_ret");
        obj = new JSONObject();
        context.put("data", obj);
        ((JSONObject) (obj)).put("error", flag);
        ((JSONObject) (obj)).put("body", intent);
        mMessaging.postMessage(i, context.toString());
        context = new JSONObject();
        context.put("cmd", "sent");
        context.put("data", intent);
        mMessaging.broadcastMessage(context.toString());
        context = new ContentValues();
        context.put("address", s1);
        context.put("body", s);
        activity.getContentResolver().insert(Uri.parse("content://sms/sent"), context);
        return;
    }

    ssagingReceiver(Messaging messaging)
    {
        this$0 = MessagingSmsManager.this;
        super(MessagingSmsManager.this, messaging);
    }
}
