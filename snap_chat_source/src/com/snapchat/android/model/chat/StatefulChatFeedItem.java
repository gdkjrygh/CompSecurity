// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import Bt;
import Ks;
import android.app.Application;
import android.content.res.Resources;
import com.snapchat.android.SnapchatApplication;
import java.util.List;
import java.util.Observable;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatFeedItem, ChatConversation

public abstract class StatefulChatFeedItem extends Observable
    implements ChatFeedItem
{
    public static final class SendReceiveStatus extends Enum
    {

        private static final SendReceiveStatus $VALUES[];
        public static final SendReceiveStatus FAILED;
        public static final SendReceiveStatus FAILED_NON_RECOVERABLE;
        public static final SendReceiveStatus FAILED_NOTIFIED_USER;
        public static final SendReceiveStatus FAILED_TIMED_OUT;
        public static final SendReceiveStatus RECEIVED;
        public static final SendReceiveStatus RECEIVING;
        public static final SendReceiveStatus SENDING;
        public static final SendReceiveStatus SENT;
        public static final SendReceiveStatus UNKNOWN;

        public static SendReceiveStatus valueOf(String s)
        {
            return (SendReceiveStatus)Enum.valueOf(com/snapchat/android/model/chat/StatefulChatFeedItem$SendReceiveStatus, s);
        }

        public static SendReceiveStatus[] values()
        {
            return (SendReceiveStatus[])$VALUES.clone();
        }

        static 
        {
            UNKNOWN = new SendReceiveStatus("UNKNOWN", 0);
            RECEIVING = new SendReceiveStatus("RECEIVING", 1);
            RECEIVED = new SendReceiveStatus("RECEIVED", 2);
            SENDING = new SendReceiveStatus("SENDING", 3);
            SENT = new SendReceiveStatus("SENT", 4);
            FAILED = new SendReceiveStatus("FAILED", 5);
            FAILED_NOTIFIED_USER = new SendReceiveStatus("FAILED_NOTIFIED_USER", 6);
            FAILED_NON_RECOVERABLE = new SendReceiveStatus("FAILED_NON_RECOVERABLE", 7);
            FAILED_TIMED_OUT = new SendReceiveStatus("FAILED_TIMED_OUT", 8);
            $VALUES = (new SendReceiveStatus[] {
                UNKNOWN, RECEIVING, RECEIVED, SENDING, SENT, FAILED, FAILED_NOTIFIED_USER, FAILED_NON_RECOVERABLE, FAILED_TIMED_OUT
            });
        }

        private SendReceiveStatus(String s, int i)
        {
            super(s, i);
        }
    }


    private long mGroupId;
    private List mRecipients;
    public SendReceiveStatus mSendReceiveStatus;
    private String mSender;

    public StatefulChatFeedItem(String s, List list)
    {
        mSender = s;
        mRecipients = list;
        mSendReceiveStatus = SendReceiveStatus.UNKNOWN;
    }

    public final boolean Q()
    {
        return mSendReceiveStatus == SendReceiveStatus.SENDING;
    }

    public final boolean R()
    {
        return mSendReceiveStatus.compareTo(SendReceiveStatus.FAILED) >= 0;
    }

    public boolean S()
    {
        return mSendReceiveStatus == SendReceiveStatus.FAILED_NOTIFIED_USER;
    }

    public final boolean T()
    {
        return mSendReceiveStatus == SendReceiveStatus.FAILED || mSendReceiveStatus == SendReceiveStatus.FAILED_NOTIFIED_USER;
    }

    public void X_()
    {
        mSendReceiveStatus = SendReceiveStatus.FAILED_NON_RECOVERABLE;
    }

    public String a()
    {
        int i;
        if (R() && T())
        {
            i = 0x7f080131;
        } else
        if (p())
        {
            i = 0x7f08012e;
        } else
        if (Q())
        {
            i = 0x7f080251;
        } else
        {
            i = 0x7f0802c9;
        }
        return SnapchatApplication.get().getResources().getString(i);
    }

    public final String ac()
    {
        return Ks.a(mSender, mRecipients);
    }

    public final String ad()
    {
        return (String)mRecipients.get(0);
    }

    public final long ae()
    {
        return mGroupId;
    }

    public boolean ak()
    {
        return false;
    }

    public int b(ChatConversation chatconversation)
    {
        ChatFeedItem.FeedIconPriority feediconpriority = ChatFeedItem.FeedIconPriority.MOST_RECENT;
        if (!R() || !T()) goto _L2; else goto _L1
_L1:
        chatconversation = ChatFeedItem.FeedIconPriority.FAILED;
_L4:
        return chatconversation.ordinal();
_L2:
        if (Q())
        {
            chatconversation = ChatFeedItem.FeedIconPriority.SENDING;
        } else
        if (!Ks.a(this))
        {
            chatconversation = feediconpriority;
            if (Bt.q() != null)
            {
                chatconversation = feediconpriority;
                if (!aq())
                {
                    chatconversation = ChatFeedItem.FeedIconPriority.NEW;
                }
            }
        } else
        {
            chatconversation = feediconpriority;
            if (System.currentTimeMillis() - W() < 1000L)
            {
                chatconversation = ChatFeedItem.FeedIconPriority.RECENTLY_SENT;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void c(long l)
    {
        mGroupId = l;
    }

    public final String j()
    {
        return mSender;
    }

    public final List k()
    {
        return mRecipients;
    }

    public final boolean p()
    {
        return mSendReceiveStatus == SendReceiveStatus.FAILED_NON_RECOVERABLE;
    }

    public final boolean q()
    {
        return mSendReceiveStatus == SendReceiveStatus.SENT;
    }

    public final boolean r()
    {
        return mSendReceiveStatus == SendReceiveStatus.RECEIVED;
    }
}
