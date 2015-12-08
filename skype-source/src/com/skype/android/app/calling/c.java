// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.calling;

import android.content.Context;
import android.content.Intent;
import com.skype.Conversation;
import com.skype.android.util.CheckedBroadcastReceiver;
import com.skype.android.util.ConversationUtil;
import java.util.Iterator;
import java.util.List;

final class c extends CheckedBroadcastReceiver
{

    private static final String ACTIONS[] = {
        "com.samsung.flipfolder.OPEN", "android.intent.action.USER_BACKGROUND"
    };
    private static final String ACTION_SAMSUNG_FLIP_STATE_CHANGE = "com.samsung.flipfolder.OPEN";
    private static final String ACTION_USER_BACKGROUND = "android.intent.action.USER_BACKGROUND";
    private static final int BACKGROUND_POSITION = 1;
    private static final String EXTRA_SAMSUNG_FLIP_OPEN = "flipOpen";
    private static final int FLIP_STATE_POSITION = 0;
    private ConversationUtil conversationUtil;

    c(ConversationUtil conversationutil)
    {
        super(ACTIONS);
        conversationUtil = conversationutil;
    }

    private void endLiveConversations()
    {
        for (Iterator iterator = conversationUtil.a(true).iterator(); iterator.hasNext(); ((Conversation)iterator.next()).leaveLiveSession()) { }
    }

    public final void onReceiveFiltered(Context context, Intent intent, int i)
    {
        i;
        JVM INSTR tableswitch 0 1: default 24
    //                   0 25
    //                   1 35;
           goto _L1 _L2 _L3
_L1:
        return;
_L2:
        if (intent.getBooleanExtra("flipOpen", true)) goto _L1; else goto _L3
_L3:
        endLiveConversations();
        return;
    }

}
