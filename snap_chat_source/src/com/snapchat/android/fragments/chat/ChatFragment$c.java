// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import xH;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class <init>
    implements t
{

    private ChatFragment a;

    public final void a(LinearLayoutManager linearlayoutmanager, View view, int i)
    {
        while (i < linearlayoutmanager.m() || i > linearlayoutmanager.o() || !(view.getTag() instanceof xH)) 
        {
            return;
        }
        ChatFragment.a(a, ChatFragment.S(a), i);
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
