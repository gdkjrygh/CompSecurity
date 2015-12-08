// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import NQ;
import PG;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.model.CashTransaction;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.ui.CursorCallbackEditText;
import com.snapchat.android.util.debug.ReleaseManager;
import com.squareup.otto.Bus;
import java.util.HashMap;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements Runnable
{

    private  a;

    public final void run()
    {
        ChatFragment.q(a.a).setText("");
    }

    ( )
    {
        a = ;
        super();
    }

    // Unreferenced inner class com/snapchat/android/fragments/chat/ChatFragment$14

/* anonymous class */
    final class ChatFragment._cls14
        implements sl.b
    {

        final ChatFragment a;
        private CashFeedItem b;
        private ChatConversation c;

        public final void a()
        {
            if (ReleaseManager.f())
            {
                Timber.c("ChatFragment", "CASH-LOG: SENDING transaction id[%s] recipient[%s] amount[%s]", new Object[] {
                    b.d(), c.mTheirUsername, b.mCashTransaction.a()
                });
            }
            PG.a(new ChatFragment._cls14._cls1(this));
            ChatFragment.a(a, null);
            ChatFragment.E(a).remove(c.mTheirUsername);
            ChatFragment.A(a);
            ChatFragment.i(a).a(new NQ());
            AnalyticsEvents.b(b.mCashTransaction.a(), b.mCashTransaction.mFromRain);
        }

        public final void b()
        {
            ChatFragment.A(a);
        }

            
            {
                a = chatfragment;
                b = cashfeeditem;
                c = chatconversation;
                super();
            }
    }

}
