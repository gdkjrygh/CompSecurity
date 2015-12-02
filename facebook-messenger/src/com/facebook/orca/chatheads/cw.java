// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.i.a.a.f;
import com.facebook.inject.d;
import com.facebook.messages.ipc.peer.MessageNotificationPeer;
import com.facebook.orca.chatheads.annotations.IsChatHeadsEnabled;

// Referenced classes of package com.facebook.orca.chatheads:
//            ch, by, cn, co

class cw extends d
{

    final cn a;

    private cw(cn cn)
    {
        a = cn;
        super();
    }

    cw(cn cn, co co)
    {
        this(cn);
    }

    public ch a()
    {
        return new ch((f)a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (by)a(com/facebook/orca/chatheads/by), b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsEnabled), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId));
    }

    public Object b()
    {
        return a();
    }
}
