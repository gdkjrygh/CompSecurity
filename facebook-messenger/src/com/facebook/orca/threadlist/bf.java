// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.os.Bundle;
import com.facebook.common.g.c;
import com.facebook.common.time.a;
import com.facebook.fbservice.c.b;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.s;
import com.facebook.orca.server.FetchMoreThreadsParams;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.y;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.google.common.a.ev;
import com.google.common.base.Preconditions;
import com.google.common.d.a.i;

// Referenced classes of package com.facebook.orca.threadlist:
//            bm, bl, bj, bk, 
//            bi, bg, bh

public class bf
{

    public static bm a;
    private static final Class b = com/facebook/orca/threadlist/bf;
    private final com.facebook.orca.f.k c;
    private final k d;
    private final a e;
    private FolderName f;
    private bi g;
    private s h;
    private c i;
    private c j;
    private bl k;
    private bm l;

    public bf(com.facebook.orca.f.k k1, k k2, a a1)
    {
        c = k1;
        d = k2;
        e = a1;
    }

    static c a(bf bf1, c c1)
    {
        bf1.i = c1;
        return c1;
    }

    private static bl a(bl bl1, bl bl2)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (bl1.a || bl2.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (bl1.b || bl2.b)
            {
                flag1 = true;
            }
            if (bl1.a == flag)
            {
                bl2 = bl1;
                if (bl1.b == flag1)
                {
                    break label0;
                }
            }
            bl2 = new bl(flag, flag1);
        }
        return bl2;
    }

    private void a(OperationResult operationresult)
    {
        com.facebook.debug.log.b.b(b, "onFetchThreadsSucceeded");
        operationresult = (FetchThreadListResult)operationresult.i();
        Object obj = operationresult.b();
        long l1 = operationresult.h().d();
        long l2 = operationresult.f();
        long l3 = e.a();
        l = new bm(((ThreadsCollection) (obj)), l2, l1, operationresult.e());
        if (f == FolderName.e)
        {
            obj = (FetchThreadListResult)operationresult.m().get(FolderName.b);
            if (obj != null && ((FetchThreadListResult) (obj)).n() != null)
            {
                obj = new bj(((FetchThreadListResult) (obj)).n(), k.b);
                g.b(bk.THREAD_LIST, ((bj) (obj)));
            }
        }
        obj = operationresult.e();
        if (operationresult.l() && h == s.CHECK_SERVER_FOR_NEW_DATA)
        {
            com.facebook.debug.log.b.b(b, "Subfolder failure. Won't reattempt server fetch. Finished loading");
            g.a(bk.THREAD_LIST, l);
            g.b(bk.THREAD_LIST);
            return;
        }
        if (k.a && h != s.CHECK_SERVER_FOR_NEW_DATA && obj != b.FROM_SERVER)
        {
            com.facebook.debug.log.b.b(b, "Starting load because need to hit server");
            g.a(bk.THREAD_LIST, l);
            a(s.CHECK_SERVER_FOR_NEW_DATA);
            return;
        }
        if (obj == b.FROM_CACHE_STALE)
        {
            com.facebook.debug.log.b.b(b, "Starting load because data from cache was stale");
            g.a(bk.THREAD_LIST, l);
            a(s.CHECK_SERVER_FOR_NEW_DATA);
            return;
        }
        if (l3 - l.b >= 0x1b7740L)
        {
            com.facebook.debug.log.b.b(b, "Starting load because haven't checked the server recently");
            g.a(bk.THREAD_LIST, l);
            a(s.CHECK_SERVER_FOR_NEW_DATA);
            return;
        } else
        {
            com.facebook.debug.log.b.b(b, "Finished loading");
            g.a(bk.THREAD_LIST, l);
            g.b(bk.THREAD_LIST);
            return;
        }
    }

    private void a(ServiceException serviceexception)
    {
        com.facebook.debug.log.b.b(b, "onFetchThreadsError");
        serviceexception = new bj(serviceexception, k.b);
        g.a(bk.THREAD_LIST, serviceexception);
    }

    private void a(s s1)
    {
        if (i != null)
        {
            return;
        } else
        {
            com.facebook.debug.log.b.b(b, "Starting thread list fetch (%s)", new Object[] {
                s1
            });
            h = s1;
            s1 = FetchThreadListParams.newBuilder().a(s1).a(f).a(true).f();
            Object obj = new Bundle();
            ((Bundle) (obj)).putParcelable("fetchThreadListParams", s1);
            s1 = d.a(aq.i, ((Bundle) (obj))).a();
            g.a(bk.THREAD_LIST);
            obj = new bg(this);
            i = com.facebook.common.g.c.a(s1, ((com.facebook.common.g.b) (obj)));
            com.google.common.d.a.i.a(s1, ((com.google.common.d.a.h) (obj)));
            return;
        }
    }

    static void a(bf bf1, OperationResult operationresult)
    {
        bf1.a(operationresult);
    }

    static void a(bf bf1, ServiceException serviceexception)
    {
        bf1.a(serviceexception);
    }

    static c b(bf bf1, c c1)
    {
        bf1.j = c1;
        return c1;
    }

    private void b(OperationResult operationresult)
    {
        if (l == null)
        {
            return;
        } else
        {
            operationresult = (FetchMoreThreadsResult)operationresult.i();
            l = new bm(ThreadsCollection.a(l.a, operationresult.b()), l.b, l.c, operationresult.e());
            g.a(bk.MORE_THREADS, l);
            g.b(bk.MORE_THREADS);
            return;
        }
    }

    private void b(ServiceException serviceexception)
    {
        g.a(bk.MORE_THREADS, new bj(serviceexception, true));
    }

    static void b(bf bf1, OperationResult operationresult)
    {
        bf1.b(operationresult);
    }

    static void b(bf bf1, ServiceException serviceexception)
    {
        bf1.b(serviceexception);
    }

    private void f()
    {
        if (i != null)
        {
            i.a(false);
            i = null;
        }
        if (j != null)
        {
            j.a(false);
            j = null;
        }
        k = null;
        l = null;
    }

    public void a()
    {
        f();
    }

    public void a(bi bi1)
    {
        g = bi1;
    }

    public void a(bl bl1)
    {
label0:
        {
            boolean flag = false;
            com.facebook.debug.log.b.b(b, "startLoad called with %s", new Object[] {
                bl1
            });
            com.facebook.debug.log.b.c(b, "startLoad");
            if (c.a(f))
            {
                com.facebook.debug.log.b.b(b, "Have cached data");
                l = new bm(c.b(f), c.f(f), c.g(f).d(), b.FROM_CACHE_STALE);
                g.a(bk.THREAD_LIST, l);
                flag = true;
            }
            if (i == null)
            {
                k = bl1;
                if (!flag)
                {
                    break label0;
                }
                if (k.a)
                {
                    com.facebook.debug.log.b.b(b, "Starting load because need to hit server");
                    a(s.CHECK_SERVER_FOR_NEW_DATA);
                    return;
                }
            } else
            {
                com.facebook.debug.log.b.b(b, "Load already in progress");
                k = a(k, bl1);
                return;
            }
            if (c.d(f))
            {
                com.facebook.debug.log.b.b(b, "Starting load because data cache said to request new update");
                a(s.PREFER_CACHE_IF_UP_TO_DATE);
                return;
            } else
            {
                com.facebook.debug.log.b.b(b, "Finished loading");
                g.b(bk.THREAD_LIST);
                return;
            }
        }
        com.facebook.debug.log.b.b(b, "No cached data. Starting load");
        a(s.STALE_DATA_OKAY);
    }

    public void a(FolderName foldername)
    {
        Preconditions.checkNotNull(foldername);
        if (foldername != f)
        {
            f = foldername;
            f();
        }
    }

    public boolean b()
    {
        return i != null;
    }

    public boolean c()
    {
        return k.a || c.e(f);
    }

    public boolean d()
    {
        if (k != null)
        {
            return k.b;
        } else
        {
            return false;
        }
    }

    public void e()
    {
        while (i != null || j != null || l == null || l.a.d()) 
        {
            return;
        }
        Object obj = l.a;
        long l1 = ((ThreadsCollection) (obj)).a(((ThreadsCollection) (obj)).e() - 1).l();
        obj = new FetchMoreThreadsParams(f, l1, 10);
        Object obj1 = new Bundle();
        ((Bundle) (obj1)).putParcelable("fetchMoreThreadsParams", ((android.os.Parcelable) (obj)));
        obj = d.a(aq.j, ((Bundle) (obj1))).a();
        g.a(bk.MORE_THREADS);
        obj1 = new bh(this);
        j = com.facebook.common.g.c.a(((com.google.common.d.a.s) (obj)), ((com.facebook.common.g.b) (obj1)));
        com.google.common.d.a.i.a(((com.google.common.d.a.s) (obj)), ((com.google.common.d.a.h) (obj1)));
    }

    static 
    {
        a = new bm(ThreadsCollection.a(), 0L, 0L, b.NO_DATA);
    }
}
