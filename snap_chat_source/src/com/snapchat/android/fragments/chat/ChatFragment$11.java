// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import android.text.Editable;
import com.snapchat.android.Timber;
import com.snapchat.android.model.chat.CashFeedItem;
import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.ui.CursorCallbackEditText;
import com.snapchat.android.util.CashUtils;
import com.snapchat.android.util.debug.ReleaseManager;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class e
    implements 
{

    private ChatConversation a;
    private int b;
    private CashFeedItem c;
    private String d;
    private Editable e;
    private ChatFragment f;

    public final void a()
    {
        if (ReleaseManager.f())
        {
            Timber.c("ChatFragment", "CASH-LOG: RECONFIRMED transaction recipient[%s] amount[%s]", new Object[] {
                a.mTheirUsername, CashUtils.a(b)
            });
        }
        ChatFragment.a(f, c);
        ChatFragment.a(f, a, c, d);
    }

    public final void b()
    {
        if (ReleaseManager.f())
        {
            Timber.c("ChatFragment", "CASH-LOG: RECONFIRM CANCELED recipient[%s] amount[%s]", new Object[] {
                a.mTheirUsername, CashUtils.a(b)
            });
        }
        e.clearSpans();
        ChatFragment.q(f).setText(e);
        ChatFragment.A(f);
    }

    _cls9(ChatFragment chatfragment, ChatConversation chatconversation, int i, CashFeedItem cashfeeditem, String s, Editable editable)
    {
        f = chatfragment;
        a = chatconversation;
        b = i;
        c = cashfeeditem;
        d = s;
        e = editable;
        super();
    }
}
