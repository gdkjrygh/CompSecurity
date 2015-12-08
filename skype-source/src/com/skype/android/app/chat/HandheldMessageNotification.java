// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.style.StyleSpan;
import com.skype.Conversation;
import com.skype.SkyLib;
import com.skype.Voicemail;
import com.skype.android.app.BackgroundNavigation;
import com.skype.android.app.main.SplashActivity;
import com.skype.android.app.settings.UserPreferences;
import com.skype.android.config.ecs.EcsConfiguration;
import com.skype.android.util.ConversationUtil;
import com.skype.android.util.DeviceFeatures;
import com.skype.android.util.ImageCache;
import com.skype.android.util.ViewUtil;
import com.skype.android.util.cache.FormattedMessageCache;
import java.util.List;

// Referenced classes of package com.skype.android.app.chat:
//            AbstractMessageNotificationRenderer, MessageHolder, MessageAgent

public class HandheldMessageNotification extends AbstractMessageNotificationRenderer
{

    private static final int CHAT_TITLE_LIMIT = 20;
    private static final String ELLIPSIS = "\u2026";
    private static final int SOUND_NOTIFICATION_INTERVAL_MS = 3000;
    private static final int TICKER_TEXT_LIMIT = 60;
    private BackgroundNavigation backgroundNavigation;
    private EcsConfiguration configuration;
    private long lastNotificationSound;
    private final NotificationManager notificationManager;
    private final UserPreferences userPreferences;

    public HandheldMessageNotification(Context context, SkyLib skylib, ConversationUtil conversationutil, ImageCache imagecache, FormattedMessageCache formattedmessagecache, NotificationManager notificationmanager, UserPreferences userpreferences, 
            BackgroundNavigation backgroundnavigation, EcsConfiguration ecsconfiguration)
    {
        super(context, skylib, conversationutil, formattedmessagecache, imagecache);
        notificationManager = notificationmanager;
        userPreferences = userpreferences;
        backgroundNavigation = backgroundnavigation;
        configuration = ecsconfiguration;
    }

    private android.support.v4.app.x.d buildDummyNotification()
    {
        return createNotificationBuilder(shouldPlayChatSound());
    }

    private android.support.v4.app.x.d buildNotification(Conversation conversation, MessageHolder messageholder)
    {
        android.support.v4.app.x.d d = buildDummyNotification();
        if (configuration.areNotificationActionsEnabled())
        {
            if (!messageholder.isConference())
            {
                d.a(0x7f0201af, context.getString(0x7f08011c), backgroundNavigation.pendingIntentForCallPlacement(conversation));
            }
            d.a(0x7f0201b0, context.getString(0x7f080172), backgroundNavigation.pendingIntentForChatPlacement(conversation));
        }
        return d;
    }

    private android.support.v4.app.x.d createNotificationBuilder(boolean flag)
    {
        android.support.v4.app.x.d d = new android.support.v4.app.x.d(context);
        d.b(true).c(true);
        char c;
        if (userPreferences.isNotificationLightEnabled())
        {
            c = '\u05DC';
        } else
        {
            c = '\0';
        }
        d.b(c, c);
        if (flag)
        {
            d.a(getChatSoundUri());
        }
        return d;
    }

    private void displayNotificationWithoutActions(MessageHolder messageholder, String s, String s1, int i)
    {
        Conversation conversation = getConversation(messageholder);
        boolean flag = shouldPlayChatSound();
        CharSequence charsequence = conversationUtil.m(conversation);
        SpannableStringBuilder spannablestringbuilder = ViewUtil.a(charsequence, s1);
        android.graphics.Bitmap bitmap = getConversationAvatar(conversation, true);
        String s2 = conversation.getIdentityProp();
        s1 = createNotificationBuilder(flag);
        s = s1.a("CHAT_MESSAGE").d(true).a(charsequence).c(spannablestringbuilder).b(s).a(i);
        s.g = bitmap;
        s = s.b(context.getResources().getColor(0x7f0f00d3)).a(getContentIntent(s2)).b(getChatDeleteIntent());
        s.i = getNumberUnreadMessages(conversation);
        s.a(messageholder.getTimestamp() * 1000L);
        notificationManager.notify(MessageAgent.MESSAGE_CHAT_NOTIFICATION_ID, s1.e());
    }

    private long getBackgroundedTime()
    {
        if (userPreferences == null)
        {
            return 0L;
        } else
        {
            return userPreferences.getBackgroundedTime();
        }
    }

    private PendingIntent getChatDeleteIntent()
    {
        Intent intent = new Intent("CHAT_NOTIF_DELETE");
        return PendingIntent.getBroadcast(context, MessageAgent.MESSAGE_CHAT_NOTIFICATION_ID, intent, 0x10000000);
    }

    private Uri getChatSoundUri()
    {
        return Uri.parse((new StringBuilder("android.resource://")).append(context.getPackageName()).append("/2131165194").toString());
    }

    private int getNumberUnreadMessages(Conversation conversation)
    {
        return conversation.getLastMessages((int)((getBackgroundedTime() - 4000L) / 1000L)).m_unconsumedMessageObjectIDList.length;
    }

    private CharSequence getTicket(CharSequence charsequence, CharSequence charsequence1)
    {
        charsequence = ViewUtil.a(charsequence1, truncate(charsequence, 60));
        charsequence.setSpan(new StyleSpan(1), 0, charsequence1.length(), 0);
        return charsequence;
    }

    private PendingIntent getVoicemailActionIntent(String s, Voicemail voicemail)
    {
        Intent intent = new Intent(context, com/skype/android/app/main/SplashActivity);
        intent.setAction("com.skype.playVoicemail");
        intent.putExtra("com.skype.identitiy", s);
        intent.addFlags(0x10000000);
        intent.putExtra("voicemailToPlay", voicemail.getObjectID());
        return PendingIntent.getActivity(context, voicemail.getObjectID(), intent, 0x8000000);
    }

    private boolean shouldPlayChatSound()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (userPreferences.isNotificationSoundEnabled())
        {
            flag = flag1;
            if (conversationUtil.a(false).size() == 0)
            {
                flag = flag1;
                if (SystemClock.elapsedRealtime() - lastNotificationSound > 3000L)
                {
                    lastNotificationSound = SystemClock.elapsedRealtime();
                    flag = true;
                }
            }
        }
        return flag;
    }

    private CharSequence truncate(CharSequence charsequence, int i)
    {
        Object obj = charsequence;
        if (charsequence.length() > i)
        {
            obj = (new StringBuilder()).append(charsequence.subSequence(0, i)).append("\u2026").toString();
        }
        return ((CharSequence) (obj));
    }

    public void clearAllMessages()
    {
        notificationManager.cancel(MessageAgent.MESSAGE_CHAT_NOTIFICATION_ID);
    }

    public void clearMessage(int i)
    {
    }

    protected void displayAudioMessage(MessageHolder messageholder)
    {
        String s = context.getString(0x7f0804c9);
        displayNotificationWithoutActions(messageholder, s, s, 0x7f0201c7);
    }

    protected void displayFileTransferMessage(MessageHolder messageholder)
    {
        String s = context.getResources().getQuantityString(0x7f0b0012, 1, new Object[] {
            Integer.valueOf(1)
        });
        displayNotificationWithoutActions(messageholder, s, s, 0x7f0201b5);
    }

    protected void displayLocationMessage(MessageHolder messageholder)
    {
        String s = context.getString(0x7f0804c4);
        displayNotificationWithoutActions(messageholder, s, s, 0x7f0201c2);
    }

    protected void displayMojiMessage(MessageHolder messageholder)
    {
        String s = context.getString(0x7f0804c5);
        displayNotificationWithoutActions(messageholder, s, s, 0x7f0201bc);
    }

    protected void displayMultipleMessages(List list)
    {
        android.support.v4.app.x.d d = createNotificationBuilder(shouldPlayChatSound());
        android.support.v4.app.x.h h = new android.support.v4.app.x.h();
        if (!DeviceFeatures.e())
        {
            h.a("");
        }
        String s = context.getString(0x7f0803fe, new Object[] {
            Integer.valueOf(list.size())
        });
        CharSequence charsequence = null;
        for (int i = 0; i < list.size(); i++)
        {
            Object obj = (MessageHolder)list.get(i);
            CharSequence charsequence1 = getMessageContent(((MessageHolder) (obj)));
            obj = getConversationTitle(getConversation(((MessageHolder) (obj))), ((MessageHolder) (obj)));
            if (i == 0)
            {
                charsequence = ((CharSequence) (obj));
            }
            h.b(concatSenderAndMessage(truncate(((CharSequence) (obj)), 20).toString(), charsequence1.toString()));
        }

        d.a(h).a("CHAT_MESSAGE").d(true).c(s).a(s).b(context.getString(0x7f0803e2, new Object[] {
            charsequence
        })).b(context.getResources().getColor(0x7f0f00d3)).a(0x7f0201c2).a(backgroundNavigation.pendingIntentForRecent()).b(getChatDeleteIntent()).i = list.size();
        notificationManager.notify(MessageAgent.MESSAGE_CHAT_NOTIFICATION_ID, d.e());
    }

    protected void displayPhotoMessage(MessageHolder messageholder)
    {
        String s = context.getString(0x7f0802ec);
        displayNotificationWithoutActions(messageholder, s, s, 0x7f0201bf);
    }

    protected void displayTextMessage(MessageHolder messageholder)
    {
        Conversation conversation = getConversation(messageholder);
        Object obj = getMessageContent(messageholder);
        CharSequence charsequence = getFormattedMessageContent(messageholder);
        CharSequence charsequence1 = getConversationTitle(conversation, messageholder);
        android.support.v4.app.x.d d = buildNotification(conversation, messageholder);
        android.support.v4.app.x.d d1 = d.a(getBigTextStyle(charsequence)).a("CHAT_MESSAGE").d(true);
        d1.g = getConversationAvatar(conversation, false);
        obj = d1.a(0x7f0201c2).a(charsequence1).c(getTicket(((CharSequence) (obj)), charsequence1)).b(charsequence).a(getContentIntent(messageholder.getConversationIdentity())).b(context.getResources().getColor(0x7f0f00d3));
        obj.i = getNumberUnreadMessages(conversation);
        ((android.support.v4.app.x.d) (obj)).a(messageholder.getTimestamp() * 1000L).b().c();
        notificationManager.notify(MessageAgent.MESSAGE_CHAT_NOTIFICATION_ID, d.e());
    }

    protected void displayVideoMessage(MessageHolder messageholder)
    {
        String s = context.getString(0x7f0804c7);
        displayNotificationWithoutActions(messageholder, s, s, 0x7f0201c6);
    }
}
