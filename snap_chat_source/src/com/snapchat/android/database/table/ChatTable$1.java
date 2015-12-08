// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.database.table;

import Mf;
import Mp;
import com.snapchat.android.app.feature.messaging.feed.model.FeedIconChangeType;
import com.snapchat.android.model.chat.Chat;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.StatefulChatFeedItem;
import com.squareup.otto.Bus;
import sz;

// Referenced classes of package com.snapchat.android.database.table:
//            ChatTable

static final class b
    implements Runnable
{

    private Chat a;
    private String b;

    public final void run()
    {
        if (((StatefulChatFeedItem) (a)).mSendReceiveStatus.equals(com.snapchat.android.model.chat.FeedItem.SendReceiveStatus.SENDING))
        {
            a.mSendReceiveStatus = com.snapchat.android.model.chat.FeedItem.SendReceiveStatus.FAILED;
            ChatConversation chatconversation = sz.a(b);
            if (chatconversation != null)
            {
                chatconversation.a(a, FeedIconChangeType.FAILED_TO_SEND);
            }
            Mf.a().a(new Mp(a.ac(), a.d()));
        }
    }

    (Chat chat, String s)
    {
        a = chat;
        b = s;
        super();
    }
}
