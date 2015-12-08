// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import Jo;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements android.view..OnGlobalLayoutListener
{

    private ChatFragment a;

    public final void onGlobalLayout()
    {
        int i = ChatFragment.j(a).getHeight();
        if (i == 0)
        {
            return;
        }
        Jo.a(ChatFragment.j(a), ChatFragment.k(a), new Rect(0, 0, i, i));
        if (android.os.K_INT >= 16)
        {
            ChatFragment.j(a).getViewTreeObserver().removeOnGlobalLayoutListener(this);
            return;
        } else
        {
            ChatFragment.j(a).getViewTreeObserver().removeGlobalOnLayoutListener(this);
            return;
        }
    }

    (ChatFragment chatfragment)
    {
        a = chatfragment;
        super();
    }
}
