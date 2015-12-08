// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;

import com.snapchat.android.Timber;
import com.snapchat.android.analytics.AnalyticsEvents;

// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatSession

final class this._cls0
    implements Runnable
{

    final SecureChatSession this$0;

    public final void run()
    {
        Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession executing DISCONNECT runnable", new Object[0]);
        if (SecureChatSession.a(SecureChatSession.this) != DISCONNECTED._fld7133d94d)
        {
            Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession DISCONNECT returning because intended connection state != DISCONNECTED", new Object[0]);
            return;
        }
        if (SecureChatSession.b(SecureChatSession.this) == nnectionState.DISCONNECTED)
        {
            Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession DISCONNECT returning because connection state == DISCONNECTED", new Object[0]);
            return;
        } else
        {
            AnalyticsEvents.A();
            SecureChatSession.c(SecureChatSession.this);
            return;
        }
    }

    nnectionState()
    {
        this$0 = SecureChatSession.this;
        super();
    }
}
