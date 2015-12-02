// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.ipc.peer;

import com.facebook.base.broadcast.CrossFbAppBroadcast;
import com.facebook.base.j;
import com.facebook.config.a.a;
import com.facebook.i.a.a.e;
import com.facebook.i.a.a.f;
import com.facebook.i.a.a.g;
import com.facebook.i.a.c;
import com.facebook.inject.d;
import com.google.common.a.fi;
import com.google.common.a.fk;

// Referenced classes of package com.facebook.messages.ipc.peer:
//            MessageNotificationPeer, f, j, d, 
//            g

class h extends d
{

    final com.facebook.messages.ipc.peer.f a;

    private h(com.facebook.messages.ipc.peer.f f1)
    {
        a = f1;
        super();
    }

    h(com.facebook.messages.ipc.peer.f f1, com.facebook.messages.ipc.peer.g g1)
    {
        this(f1);
    }

    public f a()
    {
        e e1;
        fk fk1;
        e1 = (e)a(com/facebook/i/a/a/e, com/facebook/messages/ipc/peer/MessageNotificationPeer);
        fk1 = fi.e();
        if (com.facebook.messages.ipc.peer.f.a(a) != j.Dash) goto _L2; else goto _L1
_L1:
        fk1.b(e1.a(com.facebook.messages.ipc.peer.d.a, 0));
_L4:
        String s = (new StringBuilder()).append("com.facebook.messages.ipc.peers.").append(((a)a(com/facebook/config/a/a)).j().name()).toString();
        return new g(e1, fk1.b(), (c)a(com/facebook/i/a/c), s, (com.facebook.base.broadcast.j)a(com/facebook/base/broadcast/j, com/facebook/base/broadcast/CrossFbAppBroadcast), com/facebook/messages/ipc/peer/f.getClassLoader(), (com.facebook.common.e.h)a(com/facebook/common/e/h), true);
_L2:
        if (com.facebook.messages.ipc.peer.f.a(a) == j.Messenger)
        {
            fk1.b(e1.a(com.facebook.messages.ipc.peer.d.e, 499));
            fk1.b(e1.a(d.m, 0));
            fk1.b(e1.a(d.o, 0));
        } else
        if (com.facebook.messages.ipc.peer.f.a(a) == j.Fb4a)
        {
            fk1.b(e1.a(d.m, 1));
            fk1.b(e1.a(d.o, 1));
        } else
        if (com.facebook.messages.ipc.peer.f.a(a) == j.PMA)
        {
            fk1.b(e1.a(d.m, 2));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Object b()
    {
        return a();
    }
}
