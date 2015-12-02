// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadview;

import android.os.Bundle;
import com.facebook.common.e.h;
import com.facebook.common.g.c;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.s;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.threads.model.ThreadViewSpec;
import com.facebook.orca.f.r;
import com.facebook.orca.server.FetchMoreMessagesParams;
import com.facebook.orca.server.FetchMoreMessagesResult;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.ac;
import com.facebook.orca.server.aq;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.l;
import com.facebook.user.RecipientInfo;
import com.facebook.user.UserKey;
import com.google.common.a.es;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.d.a.i;
import java.util.List;

// Referenced classes of package com.facebook.orca.threadview:
//            cp, co, z, cm, 
//            cn, cl, cj, ck

public class ci
{

    public static cp a = new cp(null, null, null);
    private static final Class b = com/facebook/orca/threadview/ci;
    private final com.facebook.orca.f.k c;
    private final k d;
    private final l e;
    private final r f;
    private final z g;
    private final com.facebook.orca.threads.i h;
    private final h i;
    private ThreadViewSpec j;
    private cl k;
    private String l;
    private c m;
    private c n;
    private s o;
    private co p;
    private cp q;
    private boolean r;

    public ci(com.facebook.orca.f.k k1, k k2, l l1, r r1, z z1, com.facebook.orca.threads.i i1, h h1)
    {
        c = k1;
        d = k2;
        e = l1;
        f = r1;
        g = z1;
        h = i1;
        i = h1;
    }

    static c a(ci ci1, c c1)
    {
        ci1.m = c1;
        return c1;
    }

    private static co a(co co1, co co2)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (co1.a || co2.a)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (co1.b || co2.b)
            {
                flag1 = true;
            }
            if (co1.a == flag)
            {
                co2 = co1;
                if (co1.b == flag1)
                {
                    break label0;
                }
            }
            co2 = new co(flag, flag1);
        }
        return co2;
    }

    private cp a(ThreadSummary threadsummary, MessagesCollection messagescollection)
    {
        messagescollection = e.a(messagescollection);
        return new cp(threadsummary, messagescollection, g.a(messagescollection, f.a(ThreadViewSpec.a(threadsummary.a()))));
    }

    private void a(OperationResult operationresult)
    {
        operationresult = (FetchThreadResult)operationresult.i();
        if (operationresult.a() != null)
        {
            a(((FetchThreadResult) (operationresult)));
            return;
        }
        if (operationresult.d() != null)
        {
            b(operationresult);
            return;
        } else
        {
            i.a(b.getSimpleName(), "Successful fetch w/o thread or user");
            a(ServiceException.a(new AssertionError()));
            return;
        }
    }

    private void a(ServiceException serviceexception)
    {
        serviceexception = new cm(serviceexception, p.b);
        k.a(cn.THREAD_VIEW, serviceexception);
    }

    private void a(s s1)
    {
        if (m != null)
        {
            return;
        } else
        {
            com.facebook.debug.log.b.b(b, "Starting thread fetch (%s)", new Object[] {
                s1
            });
            o = s1;
            Object obj = new Bundle();
            ((Bundle) (obj)).putParcelable("fetchThreadParams", (new ac()).a(ThreadCriteria.a(j)).a(s1).a(20).h());
            s1 = d.a(aq.k, ((Bundle) (obj))).a();
            k.a(cn.THREAD_VIEW);
            obj = new cj(this);
            m = com.facebook.common.g.c.a(s1, ((com.facebook.common.g.b) (obj)));
            com.google.common.d.a.i.a(s1, ((com.google.common.d.a.h) (obj)));
            return;
        }
    }

    private void a(FetchThreadResult fetchthreadresult)
    {
        ThreadSummary threadsummary = fetchthreadresult.a();
        MessagesCollection messagescollection = fetchthreadresult.b();
        if (l != null)
        {
            Preconditions.checkState(Objects.equal(l, threadsummary.a()));
        } else
        {
            l = threadsummary.a();
        }
        q = a(threadsummary, messagescollection);
        a(q);
        k.a(cn.THREAD_VIEW, q);
        fetchthreadresult = fetchthreadresult.e();
        if (p.a && o != s.CHECK_SERVER_FOR_NEW_DATA && fetchthreadresult != com.facebook.fbservice.c.b.FROM_SERVER && fetchthreadresult != com.facebook.fbservice.c.b.FROM_CACHE_HAD_SERVER_ERROR)
        {
            com.facebook.debug.log.b.b(b, "Starting load because need to hit server");
            a(s.CHECK_SERVER_FOR_NEW_DATA);
            return;
        }
        if (fetchthreadresult == com.facebook.fbservice.c.b.FROM_CACHE_STALE)
        {
            com.facebook.debug.log.b.b(b, "Starting load because data from cache was stale");
            a(s.PREFER_CACHE_IF_UP_TO_DATE);
            return;
        } else
        {
            com.facebook.debug.log.b.b(b, "Finished loading");
            k.b(cn.THREAD_VIEW);
            return;
        }
    }

    static void a(ci ci1, OperationResult operationresult)
    {
        ci1.a(operationresult);
    }

    static void a(ci ci1, ServiceException serviceexception)
    {
        ci1.a(serviceexception);
    }

    private void a(cp cp1)
    {
        if (!com.facebook.debug.log.b.b(2))
        {
            return;
        } else
        {
            StringBuilder stringbuilder = new StringBuilder();
            stringbuilder.append("Messages:\n");
            a(stringbuilder, cp1, 10);
            com.facebook.debug.log.b.a(b, stringbuilder.toString());
            return;
        }
    }

    private void a(StringBuilder stringbuilder, cp cp1, int i1)
    {
        if (cp1.b == null || cp1.b.e() && (cp1.c == null || cp1.c.isEmpty()))
        {
            stringbuilder.append("    none\n");
        } else
        {
            int k1 = 0;
            int j1;
            for (j1 = 0; j1 < i1 && k1 < cp1.c.size(); k1++)
            {
                Message message = (Message)cp1.c.get(k1);
                stringbuilder.append("   ").append(message).append("(PENDING) \n");
                j1++;
            }

            boolean flag = false;
            k1 = j1;
            j1 = ((flag) ? 1 : 0);
            while (k1 < i1 && j1 < cp1.b.f()) 
            {
                Message message1 = cp1.b.a(j1);
                stringbuilder.append("   ").append(message1).append("\n");
                k1++;
                j1++;
            }
        }
    }

    static c b(ci ci1, c c1)
    {
        ci1.n = c1;
        return c1;
    }

    private void b()
    {
        p = null;
        q = null;
        l = null;
        if (m != null)
        {
            m.a(false);
            m = null;
        }
        if (n != null)
        {
            n.a(false);
            n = null;
        }
    }

    private void b(OperationResult operationresult)
    {
        if (q != null)
        {
            r = false;
            if (q.a != null && q.b != null)
            {
                operationresult = (FetchMoreMessagesResult)operationresult.i();
                operationresult = h.a(q.b, operationresult.a());
                q = new cp(q.a, operationresult, q.c);
                a(q);
                k.a(cn.MORE_MESSAGES, q);
                return;
            }
        }
    }

    private void b(ServiceException serviceexception)
    {
        k.a(cn.MORE_MESSAGES, new cm(serviceexception, r));
        r = false;
    }

    private void b(FetchThreadResult fetchthreadresult)
    {
        com.facebook.debug.log.b.b(b, "Got canonical user but no thread");
        k.a(fetchthreadresult.d());
        k.b(cn.THREAD_VIEW);
    }

    static void b(ci ci1, OperationResult operationresult)
    {
        ci1.b(operationresult);
    }

    static void b(ci ci1, ServiceException serviceexception)
    {
        ci1.b(serviceexception);
    }

    public void a(ThreadViewSpec threadviewspec)
    {
        if (!ThreadViewSpec.a(j, threadviewspec))
        {
            j = threadviewspec;
            b();
        }
    }

    public void a(cl cl1)
    {
        k = cl1;
    }

    public void a(co co1)
    {
        if (!j.a()) goto _L2; else goto _L1
_L1:
        l = j.d();
_L4:
        boolean flag1 = false;
        boolean flag;
        if (l != null)
        {
            Object obj = c.b(l);
            MessagesCollection messagescollection = c.c(l);
            if (obj != null && messagescollection != null)
            {
                q = a(((ThreadSummary) (obj)), messagescollection);
                a(q);
                k.a(cn.THREAD_VIEW, q);
                flag = true;
            } else
            {
                flag = flag1;
                if (obj != null)
                {
                    k.a(((ThreadSummary) (obj)));
                    flag = flag1;
                }
            }
        } else
        {
            Object obj1 = f.a(j);
            flag = flag1;
            if (obj1 != null)
            {
                flag = flag1;
                if (!((List) (obj1)).isEmpty())
                {
                    obj1 = new cp(null, null, es.a(((java.util.Collection) (obj1))));
                    a(((cp) (obj1)));
                    k.a(cn.THREAD_VIEW, ((cp) (obj1)));
                    flag = flag1;
                }
            }
        }
        if (m == null)
        {
            p = co1;
            if (flag)
            {
                if (co1.a)
                {
                    com.facebook.debug.log.b.b(b, "Starting load because need to hit server");
                    a(s.CHECK_SERVER_FOR_NEW_DATA);
                    return;
                }
                if (c.d(l))
                {
                    com.facebook.debug.log.b.b(b, "Starting load because data cache said to request new update");
                    a(s.PREFER_CACHE_IF_UP_TO_DATE);
                    return;
                } else
                {
                    com.facebook.debug.log.b.b(b, "Finished loading");
                    k.b(cn.THREAD_VIEW);
                    return;
                }
            }
            com.facebook.debug.log.b.b(b, "No cached data. Starting load");
            a(s.STALE_DATA_OKAY);
            return;
        } else
        {
            com.facebook.debug.log.b.b(b, "Load already in progress");
            p = a(p, co1);
            return;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (j.b())
        {
            obj = UserKey.a(j.e().a());
            if (obj != null)
            {
                obj = c.c(((UserKey) (obj)));
                if (obj != null)
                {
                    l = ((ThreadSummary) (obj)).a();
                }
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(boolean flag)
    {
        if (m == null && n == null && q != null && q.a != null && q.b != null)
        {
            Object obj = q.b.b();
            if (((es) (obj)).size() != 0 && !q.b.d())
            {
                long l1 = ((Message)((es) (obj)).get(((es) (obj)).size() - 1)).f();
                obj = new FetchMoreMessagesParams(ThreadCriteria.a(l), 0L, l1, 20);
                Object obj1 = new Bundle();
                ((Bundle) (obj1)).putParcelable("fetchMoreMessagesParams", ((android.os.Parcelable) (obj)));
                obj = d.a(aq.u, ((Bundle) (obj1))).a();
                k.a(cn.MORE_MESSAGES);
                r = flag;
                obj1 = new ck(this);
                n = com.facebook.common.g.c.a(((com.google.common.d.a.s) (obj)), ((com.facebook.common.g.b) (obj1)));
                com.google.common.d.a.i.a(((com.google.common.d.a.s) (obj)), ((com.google.common.d.a.h) (obj1)));
                return;
            }
        }
    }

    public boolean a()
    {
        return p.a || c.e(l);
    }

}
