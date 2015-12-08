// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;

import RO;
import sA;

// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatService

final class val.message
    implements Runnable
{

    final SecureChatService this$0;
    final RO val$message;

    public final void run()
    {
        SecureChatService.b(SecureChatService.this).a(val$message);
    }

    ()
    {
        this$0 = final_securechatservice;
        val$message = RO.this;
        super();
    }
}
