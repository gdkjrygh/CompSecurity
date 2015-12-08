// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear.eventhandler;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.gms.common.api.c;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.android.app.chat.MessageHolderUtil;
import com.skype.android.app.transfer.TransferUtil;
import com.skype.android.app.wear.WearConversationHistoryLoader;
import com.skype.android.app.wear.command.LogMessageCompletionCallback;
import com.skype.android.app.wear.command.NotifyConversationHistoryUpdatedCommand;
import com.skype.android.inject.LoginManager;
import com.skype.android.res.DefaultAvatars;
import com.skype.android.skylib.ObjectIdMap;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.ImageCache;
import com.skype.android.util.cache.FormattedMessageCache;

public class FetchConversationHistoryEventHandler extends com.skype.android.app.wear.EventHandler.EventHandlerAdapter
{

    private static final String TAG = "FetchRecentConvoHistory";
    private final ConversationUtil conversationUtil;
    private final DefaultAvatars defaultAvatars;
    private final ImageCache imageCache;
    private final SkyLib lib;
    private final LoginManager loginManager;
    private final ObjectIdMap map;
    private final FormattedMessageCache messageCache;
    private final MessageHolderUtil messageHolderUtil;
    private final TransferUtil transferUtil;

    public FetchConversationHistoryEventHandler(LoginManager loginmanager, ObjectIdMap objectidmap, FormattedMessageCache formattedmessagecache, MessageHolderUtil messageholderutil, TransferUtil transferutil, ConversationUtil conversationutil, SkyLib skylib, 
            ImageCache imagecache, DefaultAvatars defaultavatars)
    {
        loginManager = loginmanager;
        map = objectidmap;
        messageCache = formattedmessagecache;
        messageHolderUtil = messageholderutil;
        transferUtil = transferutil;
        conversationUtil = conversationutil;
        lib = skylib;
        imageCache = imagecache;
        defaultAvatars = defaultavatars;
    }

    private Bitmap getConversationAvatar(int i)
    {
        Conversation conversation = (Conversation)map.a(i, com/skype/Conversation);
        if (conversation != null)
        {
            Object obj = imageCache.a(conversation);
            if (obj != null)
            {
                return ((Bitmap) (obj));
            }
            if (conversation.getTypeProp() == com.skype.Conversation.TYPE.DIALOG)
            {
                obj = com.skype.android.res.DefaultAvatars.AvatarType.c;
            } else
            {
                obj = com.skype.android.res.DefaultAvatars.AvatarType.d;
            }
            return defaultAvatars.b(((com.skype.android.res.DefaultAvatars.AvatarType) (obj)), com.skype.android.res.DefaultAvatars.AvatarSize.b, conversation.getIdentityProp());
        } else
        {
            return null;
        }
    }

    public void handle(Context context, c c, String s)
    {
        if (!loginManager.isLoggedOut() && loginManager.loginIfRequired(false))
        {
            context = new WearConversationHistoryLoader(map, messageCache, messageHolderUtil, transferUtil, conversationUtil, context, lib);
            int i = Integer.parseInt(s.substring(s.lastIndexOf('/') + 1));
            context = context.getWearConversationHistory(i);
            (new NotifyConversationHistoryUpdatedCommand(i, getConversationAvatar(i), context)).send(c, LogMessageCompletionCallback.getDataLoggerCallback("FetchRecentConvoHistory", "Conversation History Updated"));
        }
    }
}
