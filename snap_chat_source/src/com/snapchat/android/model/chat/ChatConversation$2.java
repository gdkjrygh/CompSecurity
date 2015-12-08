// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.model.chat;

import Mf;
import Nv;
import com.squareup.otto.Bus;

// Referenced classes of package com.snapchat.android.model.chat:
//            ChatConversation

final class this._cls0
    implements Runnable
{

    final ChatConversation this$0;

    public final void run()
    {
        ChatConversation.a(ChatConversation.this);
        ChatConversation.b(ChatConversation.this);
        Mf.a().a(new Nv(com.snapchat.android.livechat.ource.CHAT_GATEWAY, ChatConversation.c(ChatConversation.this), false, "presence timeout (16000 seconds)"));
    }

    rce()
    {
        this$0 = ChatConversation.this;
        super();
    }
}
