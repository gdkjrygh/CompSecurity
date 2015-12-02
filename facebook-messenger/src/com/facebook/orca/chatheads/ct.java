// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.chatheads;

import android.app.KeyguardManager;
import android.content.ComponentName;
import android.content.Context;
import android.os.PowerManager;
import android.view.WindowManager;
import com.facebook.c.s;
import com.facebook.common.e.h;
import com.facebook.common.hardware.q;
import com.facebook.i.a.a.f;
import com.facebook.inject.d;
import com.facebook.messages.ipc.peer.MessageNotificationPeer;
import com.facebook.n.j;
import com.facebook.orca.chatheads.annotations.ForChatHeads;
import com.facebook.orca.chatheads.b.k;
import com.facebook.orca.f.a;
import com.facebook.orca.threadlist.ForThreadListActivity;

// Referenced classes of package com.facebook.orca.chatheads:
//            al, ae, by, eb, 
//            cz, cn, co

class ct extends d
{

    final cn a;

    private ct(cn cn)
    {
        a = cn;
        super();
    }

    ct(cn cn, co co)
    {
        this(cn);
    }

    public al a()
    {
        return new al((Context)a(android/content/Context), b(com/facebook/orca/chatheads/ae), (com.facebook.prefs.shared.d)a(com/facebook/prefs/shared/d), (s)a(com/facebook/c/s), (WindowManager)a(android/view/WindowManager), (PowerManager)a(android/os/PowerManager), (q)a(com/facebook/common/hardware/q), (KeyguardManager)a(android/app/KeyguardManager), (a)a(com/facebook/orca/f/a), (by)a(com/facebook/orca/chatheads/by), (com.facebook.orca.threads.q)a(com/facebook/orca/threads/q), (com.facebook.common.executors.a)a(com/facebook/common/executors/a), (j)a(com/facebook/n/j, com/facebook/orca/chatheads/annotations/ForChatHeads), (eb)a(com/facebook/orca/chatheads/eb), (k)a(com/facebook/orca/chatheads/b/k), (f)a(com/facebook/i/a/a/f, com/facebook/messages/ipc/peer/MessageNotificationPeer), (ComponentName)a(android/content/ComponentName, com/facebook/orca/threadlist/ForThreadListActivity), (h)a(com/facebook/common/e/h), (cz)a(com/facebook/orca/chatheads/cz));
    }

    public Object b()
    {
        return a();
    }
}
