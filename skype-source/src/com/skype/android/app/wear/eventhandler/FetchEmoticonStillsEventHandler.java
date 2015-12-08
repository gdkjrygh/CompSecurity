// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import android.content.Context;
import com.google.android.gms.common.api.c;
import com.skype.android.app.wear.WearDataRequestCache;
import com.skype.android.app.wear.command.LogMessageCompletionCallback;
import com.skype.android.app.wear.command.NotifyEmoticonsUpdatedCommand;
import com.skype.android.inject.LoginManager;
import com.skype.android.mediacontent.MediaContent;
import com.skype.android.mediacontent.MediaContentRoster;
import com.skype.android.mediacontent.PackInfo;

public class FetchEmoticonStillsEventHandler extends com.skype.android.app.wear.EventHandler.EventHandlerAdapter
{

    private final LoginManager manager;
    private final MediaContentRoster mediaContentRoster;
    private final WearDataRequestCache wearCache;

    public FetchEmoticonStillsEventHandler(LoginManager loginmanager, MediaContentRoster mediacontentroster, WearDataRequestCache weardatarequestcache)
    {
        manager = loginmanager;
        mediaContentRoster = mediacontentroster;
        wearCache = weardatarequestcache;
    }

    private void serializeAndSendEmoticonList(final c googleApiClient, final NotifyEmoticonsUpdatedCommand command)
    {
        if (manager.loginIfRequired(true))
        {
            mediaContentRoster.c();
            mediaContentRoster.a(new com.skype.android.mediacontent.MediaContentRoster.PackInfoRequestCallback() {

                final FetchEmoticonStillsEventHandler this$0;
                final NotifyEmoticonsUpdatedCommand val$command;
                final c val$googleApiClient;

                public final void onAllPacksReady()
                {
                    command.send(googleApiClient, LogMessageCompletionCallback.getDataLoggerCallback("EventHandler", "Notify Emoticon Updated"));
                }

                public final void onContent(PackInfo packinfo, MediaContent mediacontent)
                {
                    if (mediacontent.n() == com.skype.MediaDocument.DOCUMENT_TYPE.MEDIA_EMOTICON)
                    {
                        command.addContent(packinfo, mediacontent);
                    }
                }

                public final void onPackReady(PackInfo packinfo)
                {
                }

                public final void onPackStart(PackInfo packinfo)
                {
                    command.addPackInfo(packinfo);
                }

            
            {
                this$0 = FetchEmoticonStillsEventHandler.this;
                command = notifyemoticonsupdatedcommand;
                googleApiClient = c;
                super();
            }
            });
            return;
        } else
        {
            command.send(googleApiClient, LogMessageCompletionCallback.getDataLoggerCallback("EventHandler", "Notify Empty Emoticon Updated"));
            return;
        }
    }

    public void handle(Context context, c c, String s)
    {
        context = wearCache.getEmoticonListCacheDataUri();
        if (context == null)
        {
            serializeAndSendEmoticonList(c, new NotifyEmoticonsUpdatedCommand(wearCache));
            return;
        } else
        {
            (new NotifyEmoticonsUpdatedCommand(wearCache, context)).send(c, LogMessageCompletionCallback.getDataLoggerCallback("EventHandler", "Notify Emoticon Updated"));
            return;
        }
    }
}
