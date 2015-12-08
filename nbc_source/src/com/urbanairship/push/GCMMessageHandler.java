// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.urbanairship.push;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.urbanairship.Logger;
import com.urbanairship.UAirship;

// Referenced classes of package com.urbanairship.push:
//            PushMessage, PushManager

public abstract class GCMMessageHandler
{

    public static final String ACTION_GCM_DELETED_MESSAGES = "com.urbanairship.push.ACTION_GCM_DELETED_MESSAGES";
    public static final String ACTION_GCM_RECEIVE = "com.google.android.c2dm.intent.RECEIVE";
    public static final String EXTRA_GCM_MESSAGE_TYPE = "message_type";
    public static final String EXTRA_GCM_TOTAL_DELETED = "total_deleted";
    public static final String GCM_DELETED_MESSAGES_VALUE = "deleted_messages";

    public GCMMessageHandler()
    {
    }

    static void handleIntentMessage(Intent intent)
    {
        Object obj = new PushMessage(new Bundle(intent.getExtras()));
        Logger.info((new StringBuilder()).append("Received Push from GCM: ").append(obj).toString());
        if ("deleted_messages".equals(intent.getStringExtra("message_type")))
        {
            Logger.info((new StringBuilder()).append("GCM deleted ").append(intent.getStringExtra("total_deleted")).append(" pending messages.").toString());
            obj = PushManager.shared().getIntentReceiver();
            if (obj != null)
            {
                Intent intent1 = new Intent("com.urbanairship.push.ACTION_GCM_DELETED_MESSAGES");
                intent1.setClass(UAirship.shared().getApplicationContext(), ((Class) (obj)));
                intent1.putExtras(intent.getExtras());
                UAirship.shared().getApplicationContext().sendBroadcast(intent1);
            }
            return;
        } else
        {
            PushManager.shared().deliverPush(((PushMessage) (obj)));
            return;
        }
    }
}
