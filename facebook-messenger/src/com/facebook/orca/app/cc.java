// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.app;

import android.content.Context;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.executors.a;
import com.facebook.inject.ab;
import com.facebook.inject.d;
import com.facebook.l.k;
import com.facebook.orca.annotations.IsMusicPresenceEnabled;
import com.facebook.orca.annotations.IsPresenceEnabled;
import com.facebook.push.mqtt.v;
import com.facebook.user.e;
import com.google.common.d.a.u;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.orca.app:
//            h, i

class cc extends d
{

    final h a;

    private cc(h h)
    {
        a = h;
        super();
    }

    cc(h h, i i)
    {
        this(h);
    }

    public k a()
    {
        return new k((Context)e().a(android/content/Context), (v)a(com/facebook/push/mqtt/v), b(com/facebook/user/e), b(java/lang/Boolean, com/facebook/orca/annotations/IsPresenceEnabled), (a)a(com/facebook/common/executors/a), (u)a(com/google/common/d/a/u, com/facebook/common/executors/DefaultExecutorService), (Executor)a(java/util/concurrent/Executor, com/facebook/common/executors/ForUiThread), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (android.support.v4.a.e)a(android/support/v4/a/e), b(java/lang/Boolean, com/facebook/orca/annotations/IsMusicPresenceEnabled));
    }

    public Object b()
    {
        return a();
    }
}
