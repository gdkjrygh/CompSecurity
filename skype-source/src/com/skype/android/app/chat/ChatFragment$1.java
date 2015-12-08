// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.chat;

import android.os.Handler;
import android.view.View;

// Referenced classes of package com.skype.android.app.chat:
//            ChatFragment, ChatListManager

final class this._cls0
    implements android.view.tener
{

    final ChatFragment this$0;

    public final void onClick(View view)
    {
        ChatFragment.access$000(ChatFragment.this).removeMessages(10);
        ChatFragment.access$100(ChatFragment.this).scrollToLastHeartedMessage();
        heartNotification.setVisibility(8);
    }

    ()
    {
        this$0 = ChatFragment.this;
        super();
    }
}
