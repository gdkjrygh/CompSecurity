// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.backgroundtasks;

import android.os.Handler;
import android.os.HandlerThread;
import com.facebook.base.c;
import com.facebook.common.v.a;
import com.facebook.common.v.f;
import com.facebook.debug.log.b;
import com.facebook.fbservice.service.ac;
import com.facebook.fbservice.service.n;
import java.util.Set;

// Referenced classes of package com.facebook.backgroundtasks:
//            j, d

public class e
    implements c, n
{

    private static Class a = com/facebook/backgroundtasks/e;
    private final f b;
    private final a c;
    private final android.support.v4.a.e d;
    private final Set e;
    private final d f;
    private final com.facebook.common.executors.a g;
    private final boolean h;
    private final com.facebook.common.time.a i;
    private j j;

    public e(f f1, a a1, android.support.v4.a.e e1, Set set, d d1, com.facebook.common.executors.a a2, boolean flag, 
            com.facebook.common.time.a a3)
    {
        b = f1;
        c = a1;
        d = e1;
        g = a2;
        e = set;
        f = d1;
        h = flag;
        i = a3;
    }

    public void a()
    {
        if (!h)
        {
            com.facebook.debug.log.b.b(a, "Background tasks are not enabled. Not starting background task thread.");
            return;
        }
        if (e.isEmpty())
        {
            com.facebook.debug.log.b.b(a, "No background tasks. Not starting background task thread.");
            return;
        } else
        {
            com.facebook.debug.log.b.b(a, "Starting background task thread.");
            Object obj = new HandlerThread("BackgroundTaskManager", 10);
            ((HandlerThread) (obj)).start();
            obj = new Handler(((HandlerThread) (obj)).getLooper());
            j = new j(b, c, d, e, f, g, ((Handler) (obj)), i);
            j.a();
            return;
        }
    }

    public void a(Class class1)
    {
        if (j != null)
        {
            j.b(class1);
        }
    }

    public void a(Class class1, ac ac)
    {
        if (j != null)
        {
            j.a(class1);
        }
    }

    public void b()
    {
        if (j != null)
        {
            j.b();
        }
    }

}
