// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.b.a;

import android.content.Context;
import com.facebook.auth.annotations.LoggedInUserId;
import com.facebook.config.a.a;
import com.facebook.i.a.a.f;
import com.facebook.inject.d;
import com.facebook.messages.ipc.peer.MessageNotificationPeer;

// Referenced classes of package com.facebook.b.a:
//            b, h

class i extends d
{

    private i()
    {
    }

    i(h h)
    {
        this();
    }

    public b a()
    {
        return new b((Context)a(android/content/Context), b(java/lang/String, com/facebook/auth/annotations/LoggedInUserId), (f)a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer), ((a)a(com/facebook/config/a/a)).j());
    }

    public Object b()
    {
        return a();
    }
}
