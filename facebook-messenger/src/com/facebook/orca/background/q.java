// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import android.os.Bundle;
import com.facebook.auth.b.b;
import com.facebook.backgroundtasks.a;
import com.facebook.fbservice.ops.m;
import com.facebook.orca.server.FetchGroupThreadsParams;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.j;
import com.facebook.orca.server.k;
import com.facebook.orca.server.module.ThreadsQueue;
import com.facebook.prefs.shared.d;
import com.google.common.a.fi;
import com.google.common.d.a.i;
import com.google.common.d.a.s;
import java.util.Set;

// Referenced classes of package com.facebook.orca.background:
//            n, r, MessagesTaskTag

public class q extends a
{

    private static final Class a = com/facebook/orca/background/q;
    private final b b;
    private final com.facebook.fbservice.ops.k c;
    private final d d;
    private final com.facebook.base.broadcast.a e;
    private final com.facebook.common.v.a f;
    private final com.facebook.common.time.a g;

    public q(b b1, com.facebook.fbservice.ops.k k1, d d1, com.facebook.base.broadcast.a a1, com.facebook.common.v.a a2, com.facebook.common.time.a a3)
    {
        super("FETCH_TOP_GROUP_THREADS");
        b = b1;
        c = k1;
        d = d1;
        e = a1;
        f = a2;
        g = a3;
    }

    static com.facebook.common.time.a a(q q1)
    {
        return q1.g;
    }

    static d b(q q1)
    {
        return q1.d;
    }

    static com.facebook.base.broadcast.a c(q q1)
    {
        return q1.e;
    }

    public Set a()
    {
        return fi.b(com/facebook/orca/server/module/ThreadsQueue);
    }

    public boolean b()
    {
        if (!b.b())
        {
            return false;
        }
        long l = d.a(com.facebook.orca.background.n.b, 0L);
        long l1 = g.a() - l;
        if (f.a() || l > 0L && l1 < 0x1499700L)
        {
            com.facebook.debug.log.b.b(a, "Skipped background fetch, last sync was %d ms ago", new Object[] {
                Long.valueOf(l1)
            });
            return false;
        } else
        {
            return true;
        }
    }

    public s c()
    {
        com.facebook.debug.log.b.c(a, "Starting fetch top group threads.");
        Object obj = FetchGroupThreadsParams.newBuilder().a(j.TOP_RANKED).a(20).d();
        Object obj1 = new Bundle();
        ((Bundle) (obj1)).putParcelable("fetchGroupThreadsParams", ((android.os.Parcelable) (obj)));
        obj = c.a(aq.m, ((Bundle) (obj1))).a();
        obj1 = new r(this, a);
        i.a(((s) (obj)), ((com.google.common.d.a.h) (obj1)));
        return ((s) (obj1));
    }

    public Set g()
    {
        return fi.b(com/facebook/orca/background/MessagesTaskTag);
    }

}
