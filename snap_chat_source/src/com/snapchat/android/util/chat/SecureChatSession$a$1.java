// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;

import com.snapchat.android.Timber;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatSession

final class this._cls1
    implements Runnable
{

    final is._cls0 this$1;

    public final void run()
    {
        if (!d())
        {
            Timber.f("SecureChatSession", "CHAT-LOG: SecureChatSession ran into soft-timeout", new Object[0]);
            for (Iterator iterator = SecureChatSession.l(_fld0).iterator(); iterator.hasNext(); iterator.next()) { }
        }
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
