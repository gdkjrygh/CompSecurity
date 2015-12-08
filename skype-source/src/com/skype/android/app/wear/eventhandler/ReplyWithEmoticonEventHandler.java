// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import android.content.Context;
import android.net.Uri;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.e;
import com.google.android.gms.common.api.g;
import com.google.android.gms.common.api.h;
import com.google.android.gms.wearable.a;
import com.google.android.gms.wearable.b;
import com.google.android.gms.wearable.o;
import com.skype.Conversation;
import com.skype.android.analytics.Analytics;
import com.skype.android.analytics.KpiAttributeValue;
import com.skype.android.app.wear.MessageSentTelemetryEvent;
import com.skype.android.app.wear.MessageViewedTelemetryEvent;
import com.skype.android.app.wear.RemoteDeviceCapabilities;
import com.skype.android.app.wear.command.DismissEmoticonPickerCommand;
import com.skype.android.app.wear.command.LogMessageCompletionCallback;
import com.skype.android.inject.LoginManager;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.wakeup.DreamKeeper;
import java.util.List;
import java.util.Set;

public class ReplyWithEmoticonEventHandler extends com.skype.android.app.wear.EventHandler.EventHandlerAdapter
{

    private static final int BACKGROUND_TIMEOUT = 10000;
    private final Analytics analytics;
    private final ConversationUtil conversationUtil;
    private final DreamKeeper dreamKeeper;
    private final LoginManager loginManager;
    private final ObjectIdMap map;

    public ReplyWithEmoticonEventHandler(ConversationUtil conversationutil, DreamKeeper dreamkeeper, LoginManager loginmanager, ObjectIdMap objectidmap, Analytics analytics1)
    {
        conversationUtil = conversationutil;
        loginManager = loginmanager;
        dreamKeeper = dreamkeeper;
        map = objectidmap;
        analytics = analytics1;
    }

    private void dismissPickerIfMultipleNodes(Context context, final c googleApiClient)
    {
        o.b.a(googleApiClient, RemoteDeviceCapabilities.WEAR_REMOTE_CONTROL_CAPABILITY).a(new h() {

            final ReplyWithEmoticonEventHandler this$0;
            final c val$googleApiClient;

            public final volatile void onResult(g g)
            {
                onResult((com.google.android.gms.wearable.a.b)g);
            }

            public final void onResult(com.google.android.gms.wearable.a.b b1)
            {
                if (b1.getStatus().d() && b1.a().b().size() > 1)
                {
                    (new DismissEmoticonPickerCommand()).send(googleApiClient, LogMessageCompletionCallback.getMessageLoggerCallback("EventHandler", "Dismiss Emoticon Picker"));
                }
            }

            
            {
                this$0 = ReplyWithEmoticonEventHandler.this;
                googleApiClient = c;
                super();
            }
        });
    }

    public void handle(Context context, c c, String s)
    {
        dismissPickerIfMultipleNodes(context, c);
        c = Uri.parse(s).getPathSegments();
        int i = Integer.parseInt((String)c.get(c.size() - 3));
        context = (String)c.get(c.size() - 2);
        int j = Integer.parseInt((String)c.get(c.size() - 1));
        dreamKeeper.a(10000L);
        if (loginManager.loginIfRequired(false))
        {
            c = (Conversation)map.a(i, com/skype/Conversation);
            c.postText((new StringBuilder("(")).append(context).append(")").toString());
            ConversationUtil.a(c, j);
            analytics.a(new MessageViewedTelemetryEvent(c, KpiAttributeValue.h, KpiAttributeValue.h, KpiAttributeValue.j));
            analytics.a(new MessageSentTelemetryEvent(c, KpiAttributeValue.h, KpiAttributeValue.h, KpiAttributeValue.j));
        }
    }
}
