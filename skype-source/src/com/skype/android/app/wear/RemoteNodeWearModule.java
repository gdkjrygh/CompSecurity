// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.graphics.Bitmap;
import android.os.Bundle;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.g;
import com.skype.Conversation;
import com.skype.android.app.wear.command.CompletionWearCommand;
import com.skype.android.app.wear.command.DisplayEmoticonPickerCommand;
import com.skype.android.app.wear.command.DisplayLiveConversationNotificationCommand;
import com.skype.android.app.wear.command.LogMessageCompletionCallback;
import com.skype.android.app.wear.command.NodeCompletionWearCommand;
import com.skype.android.app.wear.command.SendUnreadConversationCountCommand;
import com.skype.android.app.wear.command.StartRingingCommand;
import com.skype.android.app.wear.command.StopRingingCommand;
import com.skype.android.app.wear.util.WearDataLayerUtil;

// Referenced classes of package com.skype.android.app.wear:
//            WearModule

public class RemoteNodeWearModule
    implements WearModule
{

    private static final String TAG = "RemoteNodeWearModule";
    private final c googleApiClient;

    public RemoteNodeWearModule(c c1)
    {
        googleApiClient = c1;
    }

    private void checkConnectivityAndRunCommand(final c googleApiClient, final CompletionWearCommand command, final com.skype.android.app.wear.command.CompletionWearCommand.CompletionCallback callback)
    {
        if (googleApiClient.d())
        {
            command.send(googleApiClient, callback);
            return;
        } else
        {
            googleApiClient.a(new com.google.android.gms.common.api.c.b() {

                final RemoteNodeWearModule this$0;
                final com.skype.android.app.wear.command.CompletionWearCommand.CompletionCallback val$callback;
                final CompletionWearCommand val$command;
                final c val$googleApiClient;

                public final void onConnected(Bundle bundle)
                {
                    googleApiClient.b(this);
                    command.send(googleApiClient, callback);
                }

                public final void onConnectionSuspended(int i)
                {
                }

            
            {
                this$0 = RemoteNodeWearModule.this;
                googleApiClient = c1;
                command = completionwearcommand;
                callback = completioncallback;
                super();
            }
            });
            googleApiClient.b();
            return;
        }
    }

    private void checkConnectivityAndRunCommand(final c googleApiClient, final NodeCompletionWearCommand command, final com.skype.android.app.wear.command.NodeCompletionWearCommand.NodeCompletionCallback callback)
    {
        if (googleApiClient.d())
        {
            command.send(googleApiClient, callback);
            return;
        } else
        {
            googleApiClient.a(new com.google.android.gms.common.api.c.b() {

                final RemoteNodeWearModule this$0;
                final com.skype.android.app.wear.command.NodeCompletionWearCommand.NodeCompletionCallback val$callback;
                final NodeCompletionWearCommand val$command;
                final c val$googleApiClient;

                public final void onConnected(Bundle bundle)
                {
                    googleApiClient.b(this);
                    command.send(googleApiClient, callback);
                }

                public final void onConnectionSuspended(int i)
                {
                }

            
            {
                this$0 = RemoteNodeWearModule.this;
                googleApiClient = c1;
                command = nodecompletionwearcommand;
                callback = nodecompletioncallback;
                super();
            }
            });
            googleApiClient.b();
            return;
        }
    }

    public void displayEmoticonPickerAndDisconnectGoogleApiClient(int i, String s, long l)
    {
        s = new DisplayEmoticonPickerCommand(i, s, l);
        checkConnectivityAndRunCommand(googleApiClient, s, LogMessageCompletionCallback.getDataLoggerCallback("RemoteNodeWearModule", (new StringBuilder("Display Emoticon Picker [")).append(i).append("]").toString()).then(new com.skype.android.app.wear.command.CompletionWearCommand.CompletionCallback() {

            final RemoteNodeWearModule this$0;

            public final volatile void onError(g g)
            {
                onError((com.google.android.gms.wearable.c.a)g);
            }

            public final void onError(com.google.android.gms.wearable.c.a a)
            {
                googleApiClient.c();
            }

            public final volatile void onResult(g g)
            {
                onResult((com.google.android.gms.wearable.c.a)g);
            }

            public final void onResult(com.google.android.gms.wearable.c.a a)
            {
                googleApiClient.c();
            }

            
            {
                this$0 = RemoteNodeWearModule.this;
                super();
            }
        }));
    }

    public void startRinging(Conversation conversation, Bitmap bitmap)
    {
        bitmap = WearDataLayerUtil.createAssetFromBitmap(bitmap);
        bitmap = new StartRingingCommand(conversation.getObjectID(), conversation.getDisplaynameProp(), bitmap);
        checkConnectivityAndRunCommand(googleApiClient, bitmap, LogMessageCompletionCallback.getDataLoggerCallback("RemoteNodeWearModule", (new StringBuilder("Start Ringing [")).append(conversation.getObjectID()).append("]").toString()));
    }

    public void stopRinging(int i)
    {
        StopRingingCommand stopringingcommand = new StopRingingCommand(i);
        checkConnectivityAndRunCommand(googleApiClient, stopringingcommand, LogMessageCompletionCallback.getDeleteDataLoggerCallback("RemoteNodeWearModule", (new StringBuilder("Delete Call Data [")).append(i).append("]").toString()));
    }

    public void updateConversationHistory(int i, String s)
    {
    }

    public void updateLiveCallConversation(Conversation conversation, Bitmap bitmap)
    {
        bitmap = new DisplayLiveConversationNotificationCommand(conversation, WearDataLayerUtil.createAssetFromBitmap(bitmap));
        checkConnectivityAndRunCommand(googleApiClient, bitmap, LogMessageCompletionCallback.getDataLoggerCallback("RemoteNodeWearModule", (new StringBuilder("Update Live Call Conversation [")).append(conversation.getObjectID()).append("]").toString()));
    }

    public void updateUnreadConversationCount(int i)
    {
        SendUnreadConversationCountCommand sendunreadconversationcountcommand = new SendUnreadConversationCountCommand(i);
        checkConnectivityAndRunCommand(googleApiClient, sendunreadconversationcountcommand, LogMessageCompletionCallback.getMessageLoggerCallback("RemoteNodeWearModule", (new StringBuilder("Update Unread Conversation Count [")).append(i).append("]").toString()));
    }

}
