// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.chat;

import android.view.View;
import com.snapchat.android.model.chat.ChatConversation;

// Referenced classes of package com.snapchat.android.fragments.chat:
//            ChatFragment

final class a
    implements android.view.ngeListener
{

    private ChatFragment a;

    public final void onFocusChange(View view, boolean flag)
    {
        if (ChatFragment.n(a) != null)
        {
            ChatFragment.n(a).e(false);
        }
    }

    (ChatFragment chatfragment)
    {
        a = chatfragment;
        super();
    }
}
