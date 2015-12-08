// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import Fd;
import android.text.Spannable;
import android.view.View;
import java.util.List;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatConversation

public interface ChatFeedItem
{
    public static final class FeedIconPriority extends Enum
    {

        private static final FeedIconPriority $VALUES[];
        public static final FeedIconPriority CURRENTLY_TICKING;
        public static final FeedIconPriority FAILED;
        public static final FeedIconPriority IN_APP_PURCHASE_PROCESSING;
        public static final FeedIconPriority MOST_RECENT;
        public static final FeedIconPriority NEW;
        public static final FeedIconPriority RECENTLY_OPENED_LAST_SNAP;
        public static final FeedIconPriority RECENTLY_SENT;
        public static final FeedIconPriority SENDING;
        public static final FeedIconPriority UNOPENED_SNAP_AVAILABLE_NEXT;

        public static FeedIconPriority valueOf(String s)
        {
            return (FeedIconPriority)Enum.valueOf(com/snapchat/android/model/chat/ChatFeedItem$FeedIconPriority, s);
        }

        public static FeedIconPriority[] values()
        {
            return (FeedIconPriority[])$VALUES.clone();
        }

        static 
        {
            MOST_RECENT = new FeedIconPriority("MOST_RECENT", 0);
            NEW = new FeedIconPriority("NEW", 1);
            RECENTLY_SENT = new FeedIconPriority("RECENTLY_SENT", 2);
            FAILED = new FeedIconPriority("FAILED", 3);
            SENDING = new FeedIconPriority("SENDING", 4);
            RECENTLY_OPENED_LAST_SNAP = new FeedIconPriority("RECENTLY_OPENED_LAST_SNAP", 5);
            UNOPENED_SNAP_AVAILABLE_NEXT = new FeedIconPriority("UNOPENED_SNAP_AVAILABLE_NEXT", 6);
            IN_APP_PURCHASE_PROCESSING = new FeedIconPriority("IN_APP_PURCHASE_PROCESSING", 7);
            CURRENTLY_TICKING = new FeedIconPriority("CURRENTLY_TICKING", 8);
            $VALUES = (new FeedIconPriority[] {
                MOST_RECENT, NEW, RECENTLY_SENT, FAILED, SENDING, RECENTLY_OPENED_LAST_SNAP, UNOPENED_SNAP_AVAILABLE_NEXT, IN_APP_PURCHASE_PROCESSING, CURRENTLY_TICKING
            });
        }

        private FeedIconPriority(String s, int i)
        {
            super(s, i);
        }
    }


    public abstract boolean Q();

    public abstract boolean R();

    public abstract boolean S();

    public abstract boolean T();

    public abstract long W();

    public abstract long Y();

    public abstract Fd a(View view, ChatConversation chatconversation);

    public abstract String a();

    public abstract long ae();

    public abstract boolean ak();

    public abstract String an();

    public abstract Spannable ao();

    public abstract boolean aq();

    public abstract int b(ChatConversation chatconversation);

    public abstract String b();

    public abstract void c(long l);

    public abstract boolean c();

    public abstract String d();

    public abstract String j();

    public abstract List k();

    public abstract boolean p();

    public abstract boolean q();

    public abstract boolean r();
}
