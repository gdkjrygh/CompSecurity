// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wearable;

import android.app.RemoteInput;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.wearable.o;
import com.skype.Conversation;
import com.skype.ConversationImpl;
import com.skype.SkyLib;
import com.skype.android.SkypeBroadcastReceiver;
import com.skype.android.SkypeBroadcastReceiverComponent;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.KpiAttributeValue;
import com.skype.android.app.wear.MessageSentTelemetryEvent;
import com.skype.android.app.wear.MessageViewedTelemetryEvent;
import com.skype.android.app.wear.RemoteNodeWearModule;
import com.skype.android.app.wear.WearModule;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.inject.LoginManager;
import com.skype.android.util.ConversationUtil;
import com.skype.android.wakeup.DreamKeeper;
import java.util.logging.Logger;

public class WearReplyReceiver extends SkypeBroadcastReceiver
{

    private static final int BACKGROUND_TIMEOUT = 10000;
    public static final String EXTRA_VOICE_REPLY = "com.skype.android.app.wearable.EXTRA_VOICE_REPLY";
    private static Logger log = Logger.getLogger("WearReplyReceiver");
    Analytics analytics;
    ConversationUtil conversationUtil;
    DreamKeeper dreamKeeper;
    EcsConfiguration ecsConfiguration;
    SkyLib lib;
    LoginManager loginManager;

    public WearReplyReceiver()
    {
    }

    private CharSequence getMessageText(Intent intent)
    {
        intent = RemoteInput.getResultsFromIntent(intent);
        if (intent != null)
        {
            return intent.getCharSequence("com.skype.android.app.wearable.EXTRA_VOICE_REPLY");
        } else
        {
            return null;
        }
    }

    public void onReceive(Context context, Intent intent)
    {
        getComponent(context).inject(this);
        if ("com.skype.action.REPLY_MESSAGE".equals(intent.getAction()))
        {
            context = intent.getStringExtra("conversationId");
            long l = intent.getLongExtra("messageTimestamp", 0L);
            if (context != null)
            {
                dreamKeeper.a(10000L);
                if (loginManager.loginIfRequired(false))
                {
                    ConversationImpl conversationimpl = new ConversationImpl();
                    if (lib.getConversationByIdentity(context, conversationimpl, true))
                    {
                        conversationimpl.postText(getMessageText(intent).toString());
                        ConversationUtil.a(conversationimpl, (int)l);
                        analytics.a(new MessageViewedTelemetryEvent(conversationimpl, KpiAttributeValue.h, KpiAttributeValue.h, KpiAttributeValue.j));
                        analytics.a(new MessageSentTelemetryEvent(conversationimpl, KpiAttributeValue.h, KpiAttributeValue.h, KpiAttributeValue.j));
                    }
                }
            }
        } else
        if ("com.skype.action.REPLY_WITH_EMOTICON".equals(intent.getAction()) && ecsConfiguration.isWearRemoteControlEnabled())
        {
            int i = intent.getIntExtra("conversationId", -1);
            String s = intent.getStringExtra("emoticonDataUri");
            long l1 = intent.getLongExtra("messageTimestamp", 0L);
            if (i >= 0)
            {
                (new RemoteNodeWearModule((new com.google.android.gms.common.api.c.a(context)).a(new com.google.android.gms.common.api.c.c() {

                    final WearReplyReceiver this$0;

                    public final void onConnectionFailed(ConnectionResult connectionresult)
                    {
                        WearReplyReceiver.log.info("Failed to connect to Google Play Services.");
                    }

            
            {
                this$0 = WearReplyReceiver.this;
                super();
            }
                }).b(o.l).b())).displayEmoticonPickerAndDisconnectGoogleApiClient(i, s, l1);
                return;
            }
        }
    }


}
