// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.app.KeyguardManager;
import com.facebook.b.a.b;
import com.facebook.common.hardware.q;
import com.facebook.i.a.a.f;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.messages.ipc.peer.MessageNotificationPeer;
import com.facebook.orca.chatheads.annotations.IsChatHeadsEnabled;

// Referenced classes of package com.facebook.orca.notify:
//            d, ak, at, x, 
//            y

class z extends d
{

    final x a;

    private z(x x)
    {
        a = x;
        super();
    }

    z(x x, y y)
    {
        this(x);
    }

    public com.facebook.orca.notify.d a()
    {
        return new com.facebook.orca.notify.d(b(java/lang/Boolean, com/facebook/orca/chatheads/annotations/IsChatHeadsEnabled), (ak)a(com/facebook/orca/notify/ak), (KeyguardManager)e().a(android/app/KeyguardManager), (at)a(com/facebook/orca/notify/at), (b)a(com/facebook/b/a/b), (f)a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer), (q)a(com/facebook/common/hardware/q));
    }

    public Object b()
    {
        return a();
    }
}
