// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wearable;

import android.content.Context;
import android.content.Intent;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.SkypeBroadcastReceiver;
import com.skype.android.SkypeBroadcastReceiverComponent;
import com.skype.android.util.TimeUtil;
import com.skype.android.wakeup.DreamKeeper;

public class CarReadReceiver extends SkypeBroadcastReceiver
{

    private static final int BACKGROUND_TIMEOUT = 10000;
    public static final String REPLY_ACTION = "com.skype.action.READ_MESSAGE_CAR";
    DreamKeeper dreamKeeper;
    SkyLib lib;

    public CarReadReceiver()
    {
    }

    public void onReceive(Context context, Intent intent)
    {
        getComponent(context).inject(this);
        if ("com.skype.action.READ_MESSAGE_CAR".equals(intent.getAction()))
        {
            context = intent.getStringExtra("conversationId");
            if (context != null)
            {
                dreamKeeper.a(10000L);
                intent = new ConversationImpl();
                lib.getConversationByIdentity(context, intent, true);
                intent.setConsumedHorizon((int)TimeUtil.a(), true);
            }
        }
    }
}
