// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.background;

import android.os.Bundle;
import com.facebook.backgroundtasks.a;
import com.facebook.backgroundtasks.r;
import com.facebook.debug.log.l;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.s;
import com.facebook.orca.f.k;
import com.facebook.orca.g.b;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.module.ThreadsQueue;
import com.facebook.orca.server.y;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.FolderType;
import com.google.common.a.fi;
import com.google.common.d.a.i;
import java.util.Set;

// Referenced classes of package com.facebook.orca.background:
//            MessagesTaskTag

public class c extends a
{

    private static Class a = com/facebook/orca/background/c;
    private static final l b = new l();
    private static final l c = new l();
    private final com.facebook.auth.b.b d;
    private final javax.inject.a e;
    private final javax.inject.a f;
    private final javax.inject.a g;
    private final com.facebook.fbservice.ops.k h;
    private final com.facebook.common.v.a i;
    private final com.facebook.common.time.a j;
    private final com.facebook.common.p.a k;

    public c(com.facebook.auth.b.b b1, javax.inject.a a1, javax.inject.a a2, javax.inject.a a3, com.facebook.fbservice.ops.k k1, com.facebook.common.v.a a4, com.facebook.common.time.a a5)
    {
        super("FETCH_THREAD_LIST");
        d = b1;
        e = a1;
        f = a2;
        g = a3;
        h = k1;
        i = a4;
        j = a5;
        k = new com.facebook.common.p.a(a5, 10, 60000L);
    }

    private s a(FolderName foldername)
    {
        if (!((b)f.b()).a(foldername))
        {
            return s.CHECK_SERVER_FOR_NEW_DATA;
        }
        if (((k)g.b()).d(foldername))
        {
            return s.PREFER_CACHE_IF_UP_TO_DATE;
        } else
        {
            return null;
        }
    }

    public Set a()
    {
        return fi.b(com/facebook/orca/server/module/ThreadsQueue);
    }

    public boolean b()
    {
        if (!d.b())
        {
            return false;
        }
        FolderName foldername = FolderName.a((FolderType)e.b());
        if (foldername == FolderName.a)
        {
            com.facebook.debug.log.b.a(b, a, "User not authenticated to access folders");
            return false;
        }
        long l1 = ((k)g.b()).f(foldername);
        l1 = j.a() - l1;
        if (i.a() && l1 < 0x1499700L)
        {
            com.facebook.debug.log.b.b(a, "Skipped background fetch, last sync was %d ms ago", new Object[] {
                Long.valueOf(l1)
            });
            return false;
        }
        return a(foldername) != null;
    }

    public com.google.common.d.a.s c()
    {
        Object obj = FolderName.a((FolderType)e.b());
        Object obj1 = a(((FolderName) (obj)));
        if (obj1 == null)
        {
            return null;
        }
        if (!k.a())
        {
            com.facebook.debug.log.b.a(c, a, "Hit fetch thread list rate limit");
            return null;
        } else
        {
            com.facebook.debug.log.b.c(a, (new StringBuilder()).append("Starting fetch threads (").append(obj1).append(")").toString());
            obj = FetchThreadListParams.newBuilder().a(((s) (obj1))).a(((FolderName) (obj))).f();
            obj1 = new Bundle();
            ((Bundle) (obj1)).putParcelable("fetchThreadListParams", ((android.os.Parcelable) (obj)));
            obj = h.a(aq.i, ((Bundle) (obj1))).a();
            obj1 = new r(a);
            com.google.common.d.a.i.a(((com.google.common.d.a.s) (obj)), ((com.google.common.d.a.h) (obj1)));
            return ((com.google.common.d.a.s) (obj1));
        }
    }

    public Set g()
    {
        return fi.b(com/facebook/orca/background/MessagesTaskTag);
    }

}
