// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import PG;
import android.view.View;
import com.snapchat.android.analytics.AnalyticsEvents;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.ui.ChatCameraButton;
import com.snapchat.android.ui.CursorCallbackEditText;
import com.snapchat.android.ui.cash.CashTooltip;
import com.snapchat.android.util.CashUtils;
import sf;
import sl;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements Runnable
{

    private a a;

    public final void run()
    {
        sf sf1 = a.a.a.h;
        sf.a(ChatFragment.q(a.a.a), a.a);
        ChatFragment.A(a.a.a);
        AnalyticsEvents.n(CashUtils.a(a.a));
    }

    ethod(ethod ethod)
    {
        a = ethod;
        super();
    }

    // Unreferenced inner class com/snapchat/android/fragments/chat/ChatFragment$6

/* anonymous class */
    final class ChatFragment._cls6
        implements android.view.View.OnClickListener
    {

        final ChatFragment a;

        public final void onClick(View view)
        {
            boolean flag1 = false;
            if (ChatFragment.o(a).c)
            {
                ChatFragment.m(a);
            } else
            {
                if (ChatFragment.o(a).b)
                {
                    AnalyticsEvents.s();
                    ChatFragment.a(a, com.snapchat.android.ui.CashSwiperView.SwipeActivationMethod.DOLLARS);
                    return;
                }
                if (ChatFragment.o(a).a)
                {
                    if (ChatFragment.n(a) != null)
                    {
                        AnalyticsEvents.s();
                        ChatFragment.y(a);
                        ChatFragment.c(a, ChatFragment.q(a).hasFocus());
                        ChatFragment.z(a).a();
                        view = a.h;
                        int i = sf.a(ChatFragment.q(a));
                        view = a.h;
                        int j = sf.a(ChatFragment.q(a).getEditableText());
                        int k = ChatFragment.q(a).getSelectionEnd();
                        view = a.i;
                        view = sl.a(ChatFragment.n(a), j + i, false);
                        a.i.a(view, new ChatFragment._cls6._cls1(this, view, k, i));
                        return;
                    }
                } else
                {
                    view = a.getView();
                    ChatFragment chatfragment = a;
                    boolean flag = flag1;
                    if (view != null)
                    {
                        flag = flag1;
                        if (ChatFragment.B(a) - view.getHeight() > 100)
                        {
                            flag = true;
                        }
                    }
                    ChatFragment.c(chatfragment, flag);
                    ChatFragment.C(a);
                    return;
                }
            }
        }

            
            {
                a = chatfragment;
                super();
            }
    }


    // Unreferenced inner class com/snapchat/android/fragments/chat/ChatFragment$6$1

/* anonymous class */
    final class ChatFragment._cls6._cls1
        implements sl.a
    {

        final int a;
        final int b;
        final ChatFragment._cls6 c;
        private CashFeedItem d;

        public final void a()
        {
            ChatFragment.a(c.a, d);
            PG.a(new ChatFragment._cls6._cls1._cls1(this));
        }

        public final void b()
        {
            ChatFragment.A(c.a);
        }

            
            {
                c = _pcls6;
                d = cashfeeditem;
                a = i;
                b = j;
                super();
            }
    }

}
