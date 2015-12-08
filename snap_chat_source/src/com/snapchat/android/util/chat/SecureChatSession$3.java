// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;

import com.snapchat.android.Timber;

// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatSession

final class this._cls0
    implements Runnable
{

    final SecureChatSession this$0;

    public final void run()
    {
        if (SecureChatSession.a(SecureChatSession.this) == CONNECTED._fld7133d94d)
        {
            Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession START SESSION RECONNECT", new Object[0]);
            SecureChatSession.d(SecureChatSession.this);
        }
    }

    ()
    {
        this$0 = SecureChatSession.this;
        super();
    }
}
