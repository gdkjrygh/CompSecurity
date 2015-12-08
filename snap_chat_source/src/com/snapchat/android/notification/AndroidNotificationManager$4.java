// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.notification;

import com.snapchat.android.model.chat.ChatConversation;
import java.util.List;

// Referenced classes of package com.snapchat.android.notification:
//            AndroidNotificationManager

public final class b
    implements Runnable
{

    private List a;
    private ChatConversation b;

    public final void run()
    {
        synchronized (a)
        {
            b.a(1);
        }
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public (List list, ChatConversation chatconversation)
    {
        a = list;
        b = chatconversation;
        super();
    }
}
