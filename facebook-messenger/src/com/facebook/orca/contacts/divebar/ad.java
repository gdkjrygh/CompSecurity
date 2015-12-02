// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.contacts.divebar;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.a.a;
import com.facebook.base.broadcast.q;
import com.facebook.contacts.data.p;
import com.facebook.contacts.server.FetchLastActiveResult;
import com.facebook.contacts.server.SyncToCacheParams;
import com.facebook.contacts.server.d;
import com.facebook.debug.d.e;
import com.facebook.debug.log.b;
import com.facebook.fbservice.ops.k;
import com.facebook.fbservice.ops.m;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.s;
import com.facebook.orca.g.z;
import com.facebook.orca.threads.v;
import com.facebook.user.LastActive;
import com.facebook.user.User;
import com.facebook.user.o;
import com.google.common.a.eo;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ik;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.d.a.i;
import com.google.common.d.a.u;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

// Referenced classes of package com.facebook.orca.contacts.divebar:
//            ae, af, ag, am, 
//            an, e, ai, ah, 
//            aj, ak

public class ad extends a
{

    private final Executor A;
    private final p B;
    private am C;
    private an D;
    private Object E;
    private m F;
    private com.google.common.d.a.s G;
    private boolean H;
    private com.google.common.d.a.s I;
    private final com.facebook.orca.contacts.divebar.e m;
    private final com.facebook.contacts.a.d n;
    private final javax.inject.a o;
    private final javax.inject.a p;
    private final com.facebook.l.k q;
    private final q r;
    private final com.facebook.l.v s = new af(this);
    private final javax.inject.a t;
    private final javax.inject.a u;
    private final javax.inject.a v;
    private final com.facebook.contacts.data.k w;
    private final k x;
    private final com.facebook.common.executors.a y;
    private final u z;

    public ad(Context context, com.facebook.orca.contacts.divebar.e e1, com.facebook.contacts.a.d d1, javax.inject.a a1, javax.inject.a a2, com.facebook.l.k k1, k k2, 
            u u1, Executor executor, javax.inject.a a3, javax.inject.a a4, javax.inject.a a5, com.facebook.common.executors.a a6, com.facebook.contacts.data.k k3, 
            p p1)
    {
        super(context);
        E = new Object();
        H = false;
        y = a6;
        m = e1;
        n = d1;
        o = a1;
        p = a2;
        q = k1;
        u = a4;
        t = a3;
        v = a5;
        w = k3;
        x = k2;
        B = p1;
        z = u1;
        A = executor;
        e1 = new IntentFilter();
        e1.addAction("com.facebook.orca.ACTION_FRIEND_SYNC_PROGRESS");
        e1.addAction("com.facebook.orca.FAVORITE_CONTACT_SYNC_PROGRESS");
        e1.addAction("com.facebook.intent.action.TOP_GROUP_THREADS_SYNC_PROGRESS");
        r = new ae(this, context, e1);
        B.a(new ag(this));
    }

    private es A()
    {
        Object obj = new Bundle();
        ((Bundle) (obj)).putParcelable("syncToCacheParams", new SyncToCacheParams(s.DO_NOT_CHECK_SERVER));
        obj = x.a(d.o, ((Bundle) (obj))).b();
        try
        {
            obj = (OperationResult)((com.google.common.d.a.s) (obj)).get();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.facebook.debug.log.b.c("orca:FriendListsLoader", "Failure during SYNC_TOP_LAST_ACTIVE", ((Throwable) (obj)));
            obj = null;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            com.facebook.debug.log.b.c("orca:FriendListsLoader", "Failure during SYNC_TOP_LAST_ACTIVE", ((Throwable) (obj)));
            obj = null;
        }
        if (obj == null)
        {
            return es.d();
        } else
        {
            return ((FetchLastActiveResult)((OperationResult) (obj)).h()).a();
        }
    }

    private es B()
    {
        com.facebook.user.e e1;
        e e2;
        et et1;
        e2 = e.a("getFavoriteFriends");
        et1 = es.e();
        e1 = (com.facebook.user.e)o.b();
        e1.b();
        Object obj = e.a("#fetch");
_L3:
        User user = e1.c();
        if (user == null) goto _L2; else goto _L1
_L1:
        et1.b(user);
          goto _L3
        obj;
        com.facebook.debug.log.b.c("orca:FriendListsLoader", "Exception reading favorite users", ((Throwable) (obj)));
        e1.d();
_L5:
        e2.a();
        return et1.b();
_L2:
        ((e) (obj)).a();
        e1.d();
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        e1.d();
        throw exception;
    }

    private es C()
    {
        com.facebook.user.e e1;
        e e2;
        et et1;
        e2 = e.a("getTopFriends");
        et1 = es.e();
        e1 = (com.facebook.user.e)o.b();
        e1.a(com.facebook.orca.contacts.divebar.am.a(C));
        Object obj = e.a("#fetch");
_L3:
        User user = e1.c();
        if (user == null) goto _L2; else goto _L1
_L1:
        et1.b(user);
          goto _L3
        obj;
        com.facebook.debug.log.b.c("orca:FriendListsLoader", "Exception reading facebook users", ((Throwable) (obj)));
        e1.d();
_L5:
        e2.a();
        return et1.b();
_L2:
        ((e) (obj)).a();
        e1.d();
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        e1.d();
        throw exception;
    }

    private es D()
    {
        e e1 = e.a("getOnlineFriends");
        es es1 = a(q.c());
        e1.a();
        return es1;
    }

    private es E()
    {
        e e1 = e.a("getMobileFriends");
        es es1 = a(q.d());
        e1.a();
        return es1;
    }

    private es F()
    {
        z z1;
        e e1;
        et et1;
        e1 = e.a("getTopGroups");
        et1 = es.e();
        z1 = (z)p.b();
        Object obj;
        z1.a(com.facebook.orca.contacts.divebar.am.b(C), am.c(C));
        obj = e.a("#fetch");
_L3:
        v v1 = z1.a();
        if (v1 == null) goto _L2; else goto _L1
_L1:
        et1.b(v1.z());
          goto _L3
        obj;
        com.facebook.debug.log.b.c("orca:FriendListsLoader", "Exception reading thread summary", ((Throwable) (obj)));
        z1.b();
_L5:
        e1.a();
        return et1.b();
_L2:
        ((e) (obj)).a();
        z1.b();
        if (true) goto _L5; else goto _L4
_L4:
        Exception exception;
        exception;
        z1.b();
        throw exception;
    }

    private an a(an an1, es es1)
    {
        boolean flag1 = true;
        if (an1 == null)
        {
            return null;
        }
        java.util.HashMap hashmap = ik.a();
        User user;
        for (es1 = es1.iterator(); es1.hasNext(); hashmap.put(user.c(), user.C()))
        {
            user = (User)es1.next();
        }

        es1 = an1.a();
        es es2 = an1.b();
        es es5 = an1.e();
        es es4 = an1.d();
        es es3 = a(es1, ((Map) (hashmap)));
        boolean flag;
        if (es3 != es1)
        {
            n.a(es3);
            flag = true;
            es1 = es3;
        } else
        {
            flag = false;
        }
        es3 = a(es2, ((Map) (hashmap)));
        if (es3 != es2)
        {
            m.a(es3);
            flag = true;
            es2 = es3;
        }
        es3 = a(es5, ((Map) (hashmap)));
        if (es3 != es5)
        {
            m.d(es3);
            flag = true;
        }
        es3 = a(es4, ((Map) (hashmap)));
        if (es3 != es4)
        {
            m.c(es3);
            flag = flag1;
        }
        if (flag)
        {
            return new an(es1, es2, an1.c(), an1.d(), an1.e(), an1.f(), y());
        } else
        {
            return null;
        }
    }

    private es a(es es1, es es2, es es3)
    {
        com.facebook.user.e e1;
        e e2;
        et et1;
        e2 = e.a("getOtherContacts");
        et1 = es.e();
        e1 = (com.facebook.user.e)o.b();
        et et2 = es.e();
        if (es1 != null)
        {
            for (es1 = es1.iterator(); es1.hasNext(); et2.a(((User)es1.next()).c())) { }
        }
        if (es2 != null)
        {
            for (es1 = es2.iterator(); es1.hasNext(); et2.a(((User)es1.next()).c())) { }
        }
        if (es3 != null)
        {
            for (es1 = es3.iterator(); es1.hasNext(); et2.a(((User)es1.next()).c())) { }
        }
        et2.a(((User)v.b()).c());
        e1.a(et2.a());
        e.a("#fetch");
_L3:
        es1 = e1.c();
        if (es1 == null) goto _L2; else goto _L1
_L1:
        et1.b(es1);
          goto _L3
        es1;
        com.facebook.debug.log.b.d("orca:FriendListsLoader", "Exception reading facebook users");
        e1.d();
_L5:
        e2.a();
        return et1.b();
_L2:
        e1.d();
        if (true) goto _L5; else goto _L4
_L4:
        es1;
        e1.d();
        throw es1;
    }

    private es a(es es1, Map map)
    {
        Object obj;
        if (es1 == null)
        {
            obj = null;
        } else
        {
            obj = es1;
            if (!map.isEmpty())
            {
                et et1 = es.e();
                obj = es1.iterator();
                boolean flag = false;
                while (((Iterator) (obj)).hasNext()) 
                {
                    User user = (User)((Iterator) (obj)).next();
                    LastActive lastactive = (LastActive)map.get(user.c());
                    if (Objects.equal(user.C(), lastactive))
                    {
                        et1.b(user);
                    } else
                    {
                        o o1 = new o();
                        o1.a(user);
                        o1.a(lastactive);
                        et1.b(o1.x());
                        flag = true;
                    }
                }
                obj = es1;
                if (flag)
                {
                    return et1.b();
                }
            }
        }
        return ((es) (obj));
    }

    private es a(Collection collection)
    {
        com.facebook.user.e e1;
        et et1;
        et1 = es.e();
        e1 = (com.facebook.user.e)o.b();
        e1.a(collection);
_L3:
        collection = e1.c();
        if (collection == null) goto _L2; else goto _L1
_L1:
        et1.b(collection);
          goto _L3
        collection;
        com.facebook.debug.log.b.c("orca:FriendListsLoader", "Exception reading facebook users", collection);
        e1.d();
_L5:
        return et1.b();
_L2:
        e1.d();
        if (true) goto _L5; else goto _L4
_L4:
        collection;
        e1.d();
        throw collection;
    }

    static com.google.common.d.a.s a(ad ad1, com.google.common.d.a.s s1)
    {
        ad1.I = s1;
        return s1;
    }

    private void a(OperationResult operationresult)
    {
        operationresult = (FetchLastActiveResult)operationresult.i();
        com.facebook.debug.log.b.b("orca:FriendListsLoader", (new StringBuilder()).append("onFetchLastActiveSucceeded. freshness=").append(operationresult.e()).toString());
        Object obj = E;
        obj;
        JVM INSTR monitorenter ;
        try
        {
            for (; H && f(); E.wait(5000L)) { }
            break MISSING_BLOCK_LABEL_85;
        }
        // Misplaced declaration of an exception variable
        catch (OperationResult operationresult) { }
        finally { }
        throw new RuntimeException(operationresult);
        obj;
        JVM INSTR monitorexit ;
        throw operationresult;
        if (H || !f()) goto _L2; else goto _L1
_L1:
        an an1 = D;
        if (operationresult.a().size() <= 0 || operationresult.e() == com.facebook.fbservice.c.b.NO_DATA) goto _L2; else goto _L3
_L3:
        an1 = a(an1, operationresult.a());
        operationresult = an1;
        if (an1 == null)
        {
            break MISSING_BLOCK_LABEL_147;
        }
        D = an1;
        operationresult = an1;
_L6:
        if (!f())
        {
            break MISSING_BLOCK_LABEL_191;
        }
        if (operationresult == null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        com.facebook.debug.log.b.b("orca:FriendListsLoader", (new StringBuilder()).append("onFetchLastActiveSucceeded. sending updated result to client. ").append(operationresult.toString()).toString());
        a(((an) (operationresult)));
_L4:
        obj;
        JVM INSTR monitorexit ;
        return;
        operationresult = new an(null, null, null, null, null, null, y());
        com.facebook.debug.log.b.b("orca:FriendListsLoader", (new StringBuilder()).append("onFetchLastActiveSucceeded. no changes detected. skipping update. ").append(operationresult.toString()).toString());
        a(((an) (operationresult)));
          goto _L4
_L2:
        operationresult = null;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void a(ad ad1)
    {
        ad1.z();
    }

    static void a(ad ad1, OperationResult operationresult)
    {
        ad1.a(operationresult);
    }

    static void a(ad ad1, an an1)
    {
        ad1.a(an1);
    }

    private void a(an an1)
    {
        y.b(new ai(this, an1));
    }

    static boolean a(ad ad1, boolean flag)
    {
        ad1.H = flag;
        return flag;
    }

    static an b(ad ad1)
    {
        return ad1.D;
    }

    static Object c(ad ad1)
    {
        return ad1.E;
    }

    private void u()
    {
        if (F != null && F.c())
        {
            return;
        } else
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("syncToCacheParams", new SyncToCacheParams(s.CHECK_SERVER_FOR_NEW_DATA));
            F = x.a(d.o, bundle);
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "start SYNC_TOP_LAST_ACTIVE");
            G = F.a();
            com.google.common.d.a.i.a(G, new ah(this));
            return;
        }
    }

    private void v()
    {
        if (I != null)
        {
            return;
        } else
        {
            I = z.c(new aj(this));
            com.google.common.d.a.i.a(I, new ak(this), A);
            return;
        }
    }

    private boolean w()
    {
        return w.a(com.facebook.contacts.data.i.a, -1L) <= 0L;
    }

    private boolean x()
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (C.a())
        {
            flag = flag1;
            if (w.a(com.facebook.contacts.data.i.c, -1L) < 0L)
            {
                flag = true;
            }
        }
        return flag;
    }

    private boolean y()
    {
        com.facebook.debug.log.b.b("orca:FriendListsLoader", "waitingForContactSynch");
        if (w())
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "Waiting for contacts");
            return true;
        }
        if (x())
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "Waiting for favorites");
            return true;
        } else
        {
            return false;
        }
    }

    private void z()
    {
        com.facebook.debug.log.b.b("orca:FriendListsLoader", "onPresenceReceived");
        q();
    }

    public void a(am am1)
    {
        boolean flag;
        if (C == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkState(flag);
        C = am1;
    }

    public Object d()
    {
        return r();
    }

    protected void i()
    {
        super.i();
        Preconditions.checkNotNull(C);
        if (I != null)
        {
            I.cancel(true);
        }
        com.facebook.debug.log.b.b("orca:FriendListsLoader", "onStartLoading");
        if (D != null)
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "Using cached result");
            b(D);
        }
        if (D == null)
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "Forcing a load");
            j();
        }
        r.a();
        if (C.e() || C.d())
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "presenceManager.addPresenceReceivedListener");
            q.a(s);
        }
    }

    protected void l()
    {
        super.l();
        com.facebook.debug.log.b.b("orca:FriendListsLoader", "onStopLoading");
        b();
        if (!f())
        {
            v();
        }
    }

    protected void p()
    {
        com.facebook.debug.log.b.b("orca:FriendListsLoader", "onReset");
        l();
        D = null;
        r.b();
        q.b(s);
    }

    public an r()
    {
        boolean flag1;
        flag1 = false;
        com.facebook.debug.log.b.b("orca:FriendListsLoader", "starting loadInBackground");
        Object obj = E;
        obj;
        JVM INSTR monitorenter ;
        boolean flag2;
        H = true;
        flag2 = y();
        if (!C.c() || flag2) goto _L2; else goto _L1
_L1:
        u();
        B.a();
        boolean flag = true;
_L4:
        es es1;
        es es2;
        es es3;
        es es4;
        es es5;
        Object obj1;
        com.facebook.debug.log.b.b("orca:FriendListsLoader", (new StringBuilder()).append("loadInBackground. waitForLastActiveData=").append(flag).toString());
        obj1 = s();
        com.facebook.debug.log.b.b("orca:FriendListsLoader", "loadInBackground. loadLocalData loaded");
        es1 = ((an) (obj1)).a();
        es2 = ((an) (obj1)).b();
        es3 = ((an) (obj1)).c();
        es4 = ((an) (obj1)).d();
        es5 = ((an) (obj1)).e();
        obj1 = ((an) (obj1)).f();
        Exception exception;
        if (flag2 || flag)
        {
            flag1 = true;
        }
        D = new an(es1, es2, es3, es4, es5, ((es) (obj1)), flag1);
        H = false;
        E.notifyAll();
        obj;
        JVM INSTR monitorexit ;
        com.facebook.debug.log.b.b("orca:FriendListsLoader", (new StringBuilder()).append("loadInBackground result=").append(D.toString()).toString());
        return D;
        exception;
        H = false;
        throw exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        flag = false;
        if (true) goto _L4; else goto _L3
_L3:
    }

    an s()
    {
        es es4 = null;
        e.b(3L);
        e e1 = e.a("loadInBackground");
        Object obj;
        Object obj1;
        es es1;
        es es2;
        es es3;
        if (C.a())
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "checking favorite friends");
            obj = B();
            n.a(((es) (obj)));
        } else
        {
            obj = null;
        }
        if (C.b())
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "checking top friends");
            obj1 = C();
            m.a(((es) (obj1)));
        } else
        {
            obj1 = null;
        }
        if (C.d() && ((Boolean)t.b()).booleanValue())
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "checking online friends");
            es1 = D();
            m.b(es1);
        } else
        {
            es1 = null;
        }
        if (C.e() && ((Boolean)t.b()).booleanValue())
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "checking mobile friends");
            es2 = E();
            m.d(es2);
        } else
        {
            es2 = null;
        }
        if (C.f() && ((Boolean)u.b()).booleanValue())
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "checking other contacts");
            es3 = a(((es) (obj)), ((es) (obj1)), es1);
            m.c(es3);
        } else
        {
            es3 = null;
        }
        if (C.g())
        {
            com.facebook.debug.log.b.b("orca:FriendListsLoader", "checking top Groups");
            es4 = F();
            m.e(es4);
        }
        obj = new an(((es) (obj)), ((es) (obj1)), es1, es3, es2, es4);
        obj1 = a(((an) (obj)), A());
        if (obj1 != null)
        {
            obj = obj1;
        }
        e1.a();
        e.c("orca:FriendListsLoader");
        return ((an) (obj));
    }

    public void t()
    {
        com.facebook.debug.log.b.b("orca:FriendListsLoader", "onFriendSyncProgress");
        q();
    }
}
