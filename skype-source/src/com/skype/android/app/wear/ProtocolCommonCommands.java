// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.wear;

import android.os.Bundle;
import com.google.android.gms.wearable.Asset;
import com.google.android.gms.wearable.h;

public class ProtocolCommonCommands
{

    public static final String DATA_KEY_CONVERSATION_HISTORY = "notificationChatHistory";
    public static final String DATA_KEY_CONVERSATION_ID = "conversationId";
    public static final String DATA_KEY_DATA_ITEM_URI = "dataItemUri";
    public static final String DATA_KEY_DISPLAY_NAME = "displayName";
    public static final String DATA_KEY_EMOTICON_DATA_URI = "emoticonDataUri";
    public static final String DATA_KEY_EMOTICON_JSON_DEFINITION = "emoticonJsonDefinition";
    public static final String DATA_KEY_IS_LIVE = "isLive";
    public static final String DATA_KEY_IS_MUTE = "isMute";
    public static final String DATA_KEY_IS_ON_HOLD = "isOnHold";
    public static final String DATA_KEY_LIVE_START_TIMESTAMP = "liveStartTimestamp";
    public static final String DATA_KEY_MESSAGE_TIMESTAMP = "messageTimestamp";
    public static final String DATA_KEY_RECENT_CONVERSATION_LIST_JSON_DEFINITION = "recentConversationListJsonDefinition";
    public static final String DATA_KEY_TIMESTAMP = "timestamp";
    public static final String DATA_KEY_USER_AVATAR = "userAvatar";

    public ProtocolCommonCommands()
    {
    }

    public static Asset getAvatarAsset(h h1)
    {
        return h1.f("userAvatar");
    }

    public static Asset getConversationHistoryJsonAsset(h h1)
    {
        return h1.f("notificationChatHistory");
    }

    public static int getConversationId(Bundle bundle)
    {
        if (bundle == null)
        {
            return 0;
        } else
        {
            return bundle.getInt("conversationId");
        }
    }

    public static int getConversationId(h h1)
    {
        return h1.c("conversationId");
    }

    public static String getDataItemUri(Bundle bundle)
    {
        return bundle.getString("dataItemUri");
    }

    public static String getDisplayName(Bundle bundle)
    {
        if (bundle == null)
        {
            return null;
        } else
        {
            return bundle.getString("displayName");
        }
    }

    public static String getDisplayName(h h1)
    {
        return h1.e("displayName");
    }

    public static Asset getEmoticonJsonAsset(h h1)
    {
        return h1.f("emoticonJsonDefinition");
    }

    public static long getLiveStartTimestamp(h h1)
    {
        return h1.d("liveStartTimestamp");
    }

    public static long getMessageTimestamp(h h1)
    {
        return h1.d("messageTimestamp");
    }

    public static Asset getRecentConversationListJsonAsset(h h1)
    {
        return h1.f("recentConversationListJsonDefinition");
    }

    public static long getTimestamp(h h1)
    {
        return h1.d("timestamp");
    }

    public static boolean isLive(h h1)
    {
        return h1.b("isLive");
    }

    public static boolean isMute(h h1)
    {
        return h1.b("isMute");
    }

    public static boolean isOnHold(Bundle bundle)
    {
        return bundle.getBoolean("isOnHold");
    }

    public static boolean isOnHold(h h1)
    {
        return h1.b("isOnHold");
    }

    public static void putAvatarAsset(h h1, Asset asset)
    {
        h1.a("userAvatar", asset);
    }

    public static void putConversationHistory(h h1, Asset asset)
    {
        h1.a("notificationChatHistory", asset);
    }

    public static void putConversationId(Bundle bundle, int i)
    {
        bundle.putInt("conversationId", i);
    }

    public static void putConversationId(h h1, int i)
    {
        h1.a("conversationId", i);
    }

    public static void putDisplayName(Bundle bundle, String s)
    {
        bundle.putString("displayName", s);
    }

    public static void putDisplayName(h h1, String s)
    {
        h1.a("displayName", s);
    }

    public static void putEmoticonBitmapJson(h h1, Asset asset)
    {
        h1.a("emoticonJsonDefinition", asset);
    }

    public static void putEmoticonDataUri(h h1, String s)
    {
        h1.a("emoticonDataUri", s);
    }

    public static void putIsLive(h h1, boolean flag)
    {
        h1.a("isLive", flag);
    }

    public static void putIsMute(h h1, boolean flag)
    {
        h1.a("isMute", flag);
    }

    public static void putIsOnHold(h h1, boolean flag)
    {
        h1.a("isOnHold", flag);
    }

    public static void putLiveStartTimestamp(h h1, long l)
    {
        h1.a("liveStartTimestamp", l);
    }

    public static void putMessageTimestamp(h h1, long l)
    {
        h1.a("messageTimestamp", l);
    }

    public static void putRecentConversationListJson(h h1, Asset asset)
    {
        h1.a("recentConversationListJsonDefinition", asset);
    }

    public static void putTimestamp(h h1, long l)
    {
        h1.a("timestamp", l);
    }
}
