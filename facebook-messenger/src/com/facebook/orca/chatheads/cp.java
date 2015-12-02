// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.i.a.a.f;
import com.facebook.inject.d;
import com.facebook.messages.ipc.peer.MessageNotificationPeer;
import com.facebook.orca.f.a;

// Referenced classes of package com.facebook.orca.chatheads:
//            cn, co

class cp extends d
{

    final cn a;

    private cp(cn cn)
    {
        a = cn;
        super();
    }

    cp(cn cn, co co)
    {
        this(cn);
    }

    public a a()
    {
        return new a((f)a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer));
    }

    public Object b()
    {
        return a();
    }
}
