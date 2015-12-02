// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import com.facebook.i.a.a.f;
import com.facebook.inject.d;
import com.facebook.messages.ipc.peer.MessageNotificationPeer;
import com.google.common.base.Optional;
import com.google.inject.a;

// Referenced classes of package com.facebook.orca.notify:
//            at, x, y

class ag extends d
{

    final x a;

    private ag(x x)
    {
        a = x;
        super();
    }

    ag(x x, y y)
    {
        this(x);
    }

    public at a()
    {
        Optional optional = Optional.absent();
        if (d(com.google.inject.a.a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer)))
        {
            optional = Optional.of(a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer));
        }
        return new at(optional);
    }

    public Object b()
    {
        return a();
    }
}
