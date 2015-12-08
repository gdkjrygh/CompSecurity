// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.api.c;
import com.skype.SkyLib;
import com.skype.android.app.recents.Recent;
import com.skype.android.app.recents.RecentQuery;
import com.skype.android.app.wear.command.LogMessageCompletionCallback;
import com.skype.android.app.wear.command.NotifyRecentConversationListUpdatedCommand;
import com.skype.android.concurrent.AsyncCallback;
import com.skype.android.concurrent.AsyncResult;
import com.skype.android.concurrent.AsyncService;
import com.skype.android.inject.LoginManager;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.Collections;
import java.util.List;

public class FetchRecentConversationListEventHandler extends com.skype.android.app.wear.EventHandler.EventHandlerAdapter
{

    private static final String TAG = "FetchRecentConvoHandler";
    private final AsyncService async;
    private final Context context;
    private final ConversationUtil conversationUtil;
    private final DefaultAvatars defaultAvatars;
    private final ImageCache imageCache;
    private final LoginManager loginManager;
    private final ObjectIdMap map;
    private final FormattedMessageCache messageCache;
    private final SkyLib skyLib;

    public FetchRecentConversationListEventHandler(SkyLib skylib, AsyncService asyncservice, ImageCache imagecache, LoginManager loginmanager, ConversationUtil conversationutil, ObjectIdMap objectidmap, Context context1, 
            FormattedMessageCache formattedmessagecache, DefaultAvatars defaultavatars)
    {
        skyLib = skylib;
        async = asyncservice;
        imageCache = imagecache;
        loginManager = loginmanager;
        conversationUtil = conversationutil;
        map = objectidmap;
        context = context1;
        messageCache = formattedmessagecache;
        defaultAvatars = defaultavatars;
    }

    public void handle(final Context context, final c googleApiClient, String s)
    {
        if (!loginManager.isLoggedOut() && loginManager.loginIfRequired(false))
        {
            s = new RecentQuery(skyLib);
            async.a(s, new AsyncCallback() {

                final FetchRecentConversationListEventHandler this$0;
                final Context val$context;
                final c val$googleApiClient;

                public final void done(AsyncResult asyncresult)
                {
                    Log.i("FetchRecentConvoHandler", (new StringBuilder("done result: ")).append(String.valueOf(asyncresult.e())).toString());
                    if (asyncresult.e())
                    {
                        asyncresult = (List)asyncresult.a();
                        Collections.sort(asyncresult, Recent.TIME_COMPARATOR);
                        (new NotifyRecentConversationListUpdatedCommand(asyncresult, skyLib, imageCache, conversationUtil, map, context, messageCache, defaultAvatars)).send(googleApiClient, LogMessageCompletionCallback.getDataLoggerCallback("FetchRecentConvoHandler", "Recent Conversation List Updated"));
                    }
                }

            
            {
                this$0 = FetchRecentConversationListEventHandler.this;
                context = context1;
                googleApiClient = c;
                super();
            }
            });
            return;
        } else
        {
            Log.e("FetchRecentConvoHandler", "Login failure");
            return;
        }
    }






}
