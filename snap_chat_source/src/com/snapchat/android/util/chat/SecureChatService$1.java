// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.util.chat;


// Referenced classes of package com.snapchat.android.util.chat:
//            SecureChatService

public final class this._cls0
    implements Runnable
{

    final SecureChatService this$0;

    public final void run()
    {
        if (!SecureChatService.a(SecureChatService.this))
        {
            stopSelf();
        }
    }

    public ()
    {
        this$0 = SecureChatService.this;
        super();
    }
}
