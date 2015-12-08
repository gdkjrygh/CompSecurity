// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import FD;
import android.support.v7.widget.RecyclerView;
import com.snapchat.android.model.chat.ChatConversation;
import oy;
import xe;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class <init> extends android.support.v7.widget.ragment.b
{

    private ChatFragment a;

    public final void a(RecyclerView recyclerview, int i)
    {
        if (!ChatFragment.Q(a).d() && ChatFragment.n(a) != null && ChatFragment.x(a).m() < ChatFragment.E())
        {
            if (ChatFragment.n(a).mIterToken != null)
            {
                i = 1;
            } else
            {
                i = 0;
            }
            if (i != 0)
            {
                ChatFragment.R(a).a(ChatFragment.n(a).mId, true);
            }
        }
    }

    private (ChatFragment chatfragment)
    {
        a = chatfragment;
        super();
    }

    a(ChatFragment chatfragment, byte byte0)
    {
        this(chatfragment);
    }
}
