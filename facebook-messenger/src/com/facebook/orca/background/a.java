// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.a.e;
import com.facebook.auth.b.b;
import com.facebook.backgroundtasks.r;
import com.facebook.debug.log.l;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.s;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.ac;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.module.ThreadsQueue;
import com.facebook.orca.threads.FolderName;
import com.google.common.a.fi;
import com.google.common.d.a.i;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.facebook.orca.background:
//            b, MessagesTaskTag

public class a extends com.facebook.backgroundtasks.a
{

    private static Class a = com/facebook/orca/background/a;
    private static final l b = new l();
    private final b c;
    private final com.facebook.orca.g.b d;
    private final k e;
    private final com.facebook.common.p.a f;
    private final BroadcastReceiver g = new com.facebook.orca.background.b(this);

    public a(b b1, com.facebook.orca.g.b b2, k k1, e e1, com.facebook.common.time.a a1)
    {
        super("FETCH_OUT_OF_DATE_THREADS");
        c = b1;
        d = b2;
        e = k1;
        f = new com.facebook.common.p.a(a1, 20, 60000L);
        b1 = new IntentFilter();
        b1.addAction("com.facebook.orca.ACTION_THREAD_UPDATED_FOR_UI");
        e1.a(g, b1);
    }

    static void a(a a1)
    {
        a1.j();
    }

    public Set a()
    {
        return fi.b(com/facebook/orca/server/module/ThreadsQueue);
    }

    public boolean b()
    {
        while (!c.b() || d.b(FolderName.b).isEmpty()) 
        {
            return false;
        }
        return true;
    }

    public com.google.common.d.a.s c()
    {
        com.facebook.debug.log.b.c(a, "Starting fetch thread (server)");
        Object obj = d.b(FolderName.b);
        if (((List) (obj)).isEmpty())
        {
            return null;
        }
        if (!f.a())
        {
            com.facebook.debug.log.b.a(b, a, "Hit fetch thread rate limit");
            return null;
        } else
        {
            obj = (String)((List) (obj)).iterator().next();
            obj = FetchThreadParams.newBuilder().a(ThreadCriteria.a(((String) (obj)))).a(s.CHECK_SERVER_FOR_NEW_DATA).a(20).h();
            Object obj1 = new Bundle();
            ((Bundle) (obj1)).putParcelable("fetchThreadParams", ((android.os.Parcelable) (obj)));
            obj = e.a(aq.k, ((Bundle) (obj1))).a();
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
        return fi.b("FETCH_THREAD_LIST");
    }

}
