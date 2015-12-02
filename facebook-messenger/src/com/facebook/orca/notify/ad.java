// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.notify;

import android.content.ComponentName;
import com.facebook.b.a.b;
import com.facebook.common.executors.DefaultExecutorService;
import com.facebook.common.executors.ForUiThread;
import com.facebook.common.v.f;
import com.facebook.config.a.a;
import com.facebook.inject.d;
import com.facebook.messages.ipc.peer.MessageNotificationPeer;
import com.facebook.orca.annotations.IsInAppNotificationsEnabled;
import com.facebook.orca.emoji.z;
import com.facebook.orca.threadlist.ForThreadListActivity;
import com.facebook.orca.threads.r;
import com.facebook.orca.threadview.do;
import java.util.concurrent.ExecutorService;

// Referenced classes of package com.facebook.orca.notify:
//            j, x, y

class ad extends d
{

    final x a;

    private ad(x x)
    {
        a = x;
        super();
    }

    ad(x x, y y)
    {
        this(x);
    }

    public j a()
    {
        return new j(b(java/lang/Boolean, com/facebook/orca/annotations/IsInAppNotificationsEnabled), (a)a(com/facebook/config/a/a), (z)a(com/facebook/orca/emoji/z), (do)a(com/facebook/orca/threadview/do), (r)a(com/facebook/orca/threads/r), (ExecutorService)a(java/util/concurrent/ExecutorService, com/facebook/common/executors/DefaultExecutorService), (ExecutorService)a(java/util/concurrent/ExecutorService, com/facebook/common/executors/ForUiThread), (f)a(com/facebook/common/v/f), (com.facebook.i.a.a.f)a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer), (ComponentName)a(android/content/ComponentName, com/facebook/orca/threadlist/ForThreadListActivity), (b)a(com/facebook/b/a/b));
    }

    public Object b()
    {
        return a();
    }
}
