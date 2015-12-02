// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.a.e;
import com.facebook.auth.b.b;
import com.facebook.backgroundtasks.a;
import com.facebook.backgroundtasks.q;
import com.facebook.backgroundtasks.r;
import com.facebook.debug.log.l;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.s;
import com.facebook.orca.f.k;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.ac;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.module.ThreadsQueue;
import com.google.common.a.fi;
import com.google.common.d.a.i;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.background:
//            e, MessagesTaskTag

public class d extends a
{

    private static Class a = com/facebook/orca/background/d;
    private static final l b = new l();
    private final b c;
    private final javax.inject.a d;
    private final com.facebook.common.p.a e;
    private final com.facebook.fbservice.ops.k f;
    private final BroadcastReceiver g = new com.facebook.orca.background.e(this);
    private List h;

    public d(b b1, javax.inject.a a1, com.facebook.fbservice.ops.k k1, e e1, com.facebook.common.time.a a2)
    {
        super("FETCH_THREADS_INTO_MEMORY_CACHE");
        h = Collections.emptyList();
        c = b1;
        d = a1;
        e = new com.facebook.common.p.a(a2, 30, 60000L);
        f = k1;
        b1 = new IntentFilter();
        b1.addAction("com.facebook.orca.THREADS_SHOWN_IN_LIST");
        e1.a(g, b1);
    }

    static void a(d d1, List list)
    {
        d1.a(list);
    }

    private void a(List list)
    {
        h = list;
        e().b();
    }

    private String d()
    {
        k k1 = (k)d.b();
        for (Iterator iterator = h.iterator(); iterator.hasNext();)
        {
            String s1 = (String)iterator.next();
            com.facebook.orca.threads.ThreadSummary threadsummary = k1.b(s1);
            com.facebook.orca.threads.MessagesCollection messagescollection = k1.c(s1);
            if (threadsummary == null || messagescollection == null)
            {
                return s1;
            }
        }

        return null;
    }

    public Set a()
    {
        return fi.b(com/facebook/orca/server/module/ThreadsQueue);
    }

    public boolean b()
    {
        while (!c.b() || d() == null) 
        {
            return false;
        }
        return true;
    }

    public com.google.common.d.a.s c()
    {
        com.facebook.debug.log.b.c(a, "Starting getThread (db)");
        Object obj = d();
        if (obj == null)
        {
            return null;
        }
        if (!e.a())
        {
            com.facebook.debug.log.b.a(b, a, "Hit in memory caching thread rate limit");
            return null;
        } else
        {
            obj = FetchThreadParams.newBuilder().a(ThreadCriteria.a(((String) (obj)))).a(s.STALE_DATA_OKAY).a(20).h();
            Object obj1 = new Bundle();
            ((Bundle) (obj1)).putParcelable("fetchThreadParams", ((android.os.Parcelable) (obj)));
            obj = f.a(aq.k, ((Bundle) (obj1))).a();
            obj1 = new r(a);
            i.a(((com.google.common.d.a.s) (obj)), ((com.google.common.d.a.h) (obj1)));
            return ((com.google.common.d.a.s) (obj1));
        }
    }

    public Set g()
    {
        return fi.b(com/facebook/orca/background/MessagesTaskTag);
    }

    public Set h()
    {
        return fi.b("FETCH_OUT_OF_DATE_THREADS");
    }

}
