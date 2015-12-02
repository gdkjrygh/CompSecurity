// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import com.facebook.debug.log.b;
import com.facebook.orca.common.ui.titlebar.a;

// Referenced classes of package com.facebook.orca.threadlist:
//            t

class w
    implements android.os.MessageQueue.IdleHandler
{

    final t a;

    w(t t1)
    {
        a = t1;
        super();
    }

    public boolean queueIdle()
    {
        if (t.i(a))
        {
            b.c(t.y(), "Thread list was loaded and ui thread is idle. ensuring divebar.");
            t.f(a).k();
        }
        return false;
    }
}
