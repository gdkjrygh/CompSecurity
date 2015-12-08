// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import com.snapchat.android.model.chat.ChatConversation;
import com.snapchat.android.model.chat.ChatMedia;
import sD;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class c
    implements com.snapchat.android.ui..a
{

    private ChatConversation a;
    private ChatMedia b;
    private ChatFragment c;

    public final void a(com.snapchat.android.ui..ResourceStatus resourcestatus)
    {
        a[resourcestatus.ordinal()];
        JVM INSTR tableswitch 1 4: default 40
    //                   1 41
    //                   2 96
    //                   3 96
    //                   4 96;
           goto _L1 _L2 _L3 _L3 _L3
_L1:
        return;
_L2:
        if (a != null && b.o() && a.mIsUserInConversation)
        {
            ChatFragment.P(c).a(a, b, false);
            b.a(false);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L3:
        if (a != null && !b.o() && !b.mHasBeenShown)
        {
            ChatFragment.P(c).a(a, b, true);
            b.a(true);
            return;
        }
        if (true) goto _L1; else goto _L4
_L4:
    }

    tus(ChatFragment chatfragment, ChatMedia chatmedia)
    {
        c = chatfragment;
        b = chatmedia;
        super();
        a = ChatFragment.n(c);
    }
}
