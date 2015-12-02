// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.content.Context;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.i.a.a.f;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.messages.ipc.c;
import com.facebook.messages.ipc.e;
import com.facebook.messages.ipc.k;
import com.facebook.messages.ipc.peer.MessageNotificationPeer;

// Referenced classes of package com.facebook.orca.notify:
//            e, x, y

class aa extends d
{

    final x a;

    private aa(x x)
    {
        a = x;
        super();
    }

    aa(x x, y y)
    {
        this(x);
    }

    public com.facebook.orca.notify.e a()
    {
        return new com.facebook.orca.notify.e((Context)e().a(android/content/Context), (e)a(com/facebook/messages/ipc/e), (c)a(com/facebook/messages/ipc/c), (k)a(com/facebook/messages/ipc/k), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), (f)a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer));
    }

    public Object b()
    {
        return a();
    }
}
