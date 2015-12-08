// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;

import Br;

// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatSession

final class val.serverString
    implements Runnable
{

    final SecureChatSession this$0;
    final String val$serverString;

    public final void run()
    {
        Br.a(SecureChatSession.e(SecureChatSession.this)).a(val$serverString);
    }

    ()
    {
        this$0 = final_securechatsession;
        val$serverString = String.this;
        super();
    }
}
