// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;

import com.facebook.auth.f.b;
import com.facebook.common.init.NeedsHighPriorityInitOnBackgroundThread;
import com.facebook.i.a.a.e;
import com.facebook.i.a.n;
import com.facebook.inject.a.a;
import com.facebook.inject.a.g;
import com.facebook.inject.aj;
import com.facebook.inject.c;

// Referenced classes of package com.facebook.messages.ipc.peer:
//            MessageNotificationPeer, i, h, j

public class f extends c
{

    private final j a;

    public f(j j)
    {
        a = j;
    }

    static j a(f f1)
    {
        return f1.a;
    }

    protected void a()
    {
        e(com/facebook/messages/ipc/f);
        e(com/facebook/i/a/n);
        a(com/facebook/i/a/a/e).a(com/facebook/messages/ipc/peer/MessageNotificationPeer).a(new i(this, null)).a();
        a(com/facebook/i/a/a/f).a(com/facebook/messages/ipc/peer/MessageNotificationPeer).a(new h(this, null)).a();
        a(com/facebook/base/c, com/facebook/common/init/NeedsHighPriorityInitOnBackgroundThread).a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer);
        c(com/facebook/auth/f/b).a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer);
    }
}
