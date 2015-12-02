// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.content.Context;
import com.facebook.analytics.cn;
import com.facebook.auth.b.b;
import com.facebook.common.v.a;
import com.facebook.i.a.a.f;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.messages.ipc.peer.MessageNotificationPeer;
import com.facebook.orca.annotations.IsSmsNotifyEnabled;
import com.facebook.orca.annotations.MessagesForegroundProviderUri;
import com.facebook.push.c2dm.y;

// Referenced classes of package com.facebook.orca.notify:
//            av, as, am, x, 
//            y

class ah extends d
{

    final x a;

    private ah(x x)
    {
        a = x;
        super();
    }

    ah(x x, com.facebook.orca.notify.y y1)
    {
        this(x);
    }

    public av a()
    {
        return new av((Context)e().a(android/content/Context), (as)a(com/facebook/orca/notify/as), (a)a(com/facebook/common/v/a), c(com/facebook/orca/notify/am), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (b)a(com/facebook/auth/b/b), (String)a(java/lang/String, com/facebook/orca/annotations/MessagesForegroundProviderUri), (cn)a(com/facebook/analytics/cn), b(java/lang/Boolean, com/facebook/orca/annotations/IsSmsNotifyEnabled), (y)a(com/facebook/push/c2dm/y), (f)a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer));
    }

    public Object b()
    {
        return a();
    }
}
