// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import android.os.Bundle;
import com.facebook.auth.viewercontext.ViewerContext;
import com.facebook.contacts.data.l;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ServiceException;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.s;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.ParticipantInfo;
import com.facebook.orca.app.g;
import com.facebook.orca.compose.MessageDraft;
import com.facebook.orca.f.i;
import com.facebook.orca.f.r;
import com.facebook.orca.f.z;
import com.facebook.orca.notify.av;
import com.facebook.orca.prefs.b;
import com.facebook.orca.server.DeleteMessagesParams;
import com.facebook.orca.server.DeleteMessagesResult;
import com.facebook.orca.server.DeleteThreadParams;
import com.facebook.orca.server.FetchMoreMessagesParams;
import com.facebook.orca.server.FetchMoreMessagesResult;
import com.facebook.orca.server.FetchMoreThreadsParams;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.facebook.orca.server.FetchMultipleThreadsParams;
import com.facebook.orca.server.FetchMultipleThreadsResult;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.NewMessageResult;
import com.facebook.orca.server.ReceiptResult;
import com.facebook.orca.server.SendBroadcastResult;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.aa;
import com.facebook.orca.server.ac;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.y;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.orca.threads.m;
import com.facebook.orca.threads.v;
import com.facebook.orca.threads.w;
import com.facebook.user.User;
import com.facebook.user.UserKey;
import com.facebook.user.n;
import com.google.common.a.ax;
import com.google.common.a.em;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.ex;
import com.google.common.a.fi;
import com.google.common.a.hq;
import com.google.common.a.ik;
import com.google.common.a.kl;
import com.google.common.base.Objects;
import com.google.common.base.Optional;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import java.io.IOException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

// Referenced classes of package com.facebook.orca.l:
//            k, w, n, d, 
//            j, b, m, o, 
//            p, q, r, s, 
//            t, u, c, e, 
//            f, g, h, i, 
//            l, v

public class a extends com.facebook.orca.server.a
{

    private static final Class a = com/facebook/orca/l/a;
    private final ExecutorService b;
    private final com.facebook.auth.viewercontext.e c;
    private final l d;
    private final com.facebook.orca.f.g e;
    private final i f;
    private final g g;
    private final av h;
    private final z i;
    private final com.facebook.orca.prefs.av j;
    private final b k;
    private final com.facebook.orca.f.l l;
    private final com.facebook.orca.threads.g m;
    private final r n;
    private final javax.inject.a o;
    private final javax.inject.a p;
    private final javax.inject.a q;
    private final javax.inject.a r;

    public a(ExecutorService executorservice, com.facebook.auth.viewercontext.e e1, l l1, com.facebook.orca.f.g g1, i i1, g g2, av av1, 
            z z1, com.facebook.orca.prefs.av av2, b b1, com.facebook.orca.f.l l2, com.facebook.orca.threads.g g3, r r1, javax.inject.a a1, 
            javax.inject.a a2, javax.inject.a a3, javax.inject.a a4)
    {
        super("MergeServiceHandler");
        b = executorservice;
        c = e1;
        d = l1;
        e = g1;
        f = i1;
        g = g2;
        h = av1;
        i = z1;
        j = av2;
        k = b1;
        l = l2;
        m = g3;
        n = r1;
        o = a1;
        p = a2;
        q = a3;
        r = a4;
    }

    private com.facebook.orca.l.v A(ad ad1, e e1)
    {
        return new k(this, ad1, e1);
    }

    static com.facebook.auth.viewercontext.e a(a a1)
    {
        return a1.c;
    }

    private OperationResult a(ad ad1, FolderName foldername, e e1)
    {
        OperationResult operationresult;
        try
        {
            operationresult = a(ad1, foldername, Optional.absent(), e1);
        }
        catch (IOException ioexception)
        {
            if (!((FetchThreadListParams)ad1.b().getParcelable("fetchThreadListParams")).e())
            {
                throw ioexception;
            } else
            {
                ad1 = (FetchThreadListResult)a(ad1, foldername, Optional.of(s.DO_NOT_CHECK_SERVER), e1).i();
                return OperationResult.a(FetchThreadListResult.newBuilder().a(ad1).a(ServiceException.a(ioexception)).o());
            }
        }
        return operationresult;
    }

    private OperationResult a(ad ad1, FolderName foldername, Optional optional, e e1)
    {
        com.facebook.fbservice.service.OperationType operationtype = ad1.a();
        ad1 = ad1.b();
        FetchThreadListParams fetchthreadlistparams = (FetchThreadListParams)ad1.getParcelable("fetchThreadListParams");
        foldername = FetchThreadListParams.newBuilder().a(fetchthreadlistparams).a(foldername).a((s)optional.or(fetchthreadlistparams.a())).f();
        ad1 = (Bundle)ad1.clone();
        ad1.putParcelable("fetchThreadListParams", foldername);
        return e1.a(new ad(operationtype, ad1));
    }

    static OperationResult a(a a1, ad ad1, FolderName foldername, e e1)
    {
        return a1.a(ad1, foldername, e1);
    }

    private FetchMultipleThreadsParams a(FetchMultipleThreadsParams fetchmultiplethreadsparams)
    {
        Object obj = fetchmultiplethreadsparams.b();
        fetchmultiplethreadsparams = es.e();
        obj = ((es) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            FetchThreadParams fetchthreadparams = (FetchThreadParams)((Iterator) (obj)).next();
            ThreadCriteria threadcriteria = fetchthreadparams.a();
            if (threadcriteria.b() != null)
            {
                if (threadcriteria.b().a() == n.FACEBOOK)
                {
                    fetchmultiplethreadsparams.b(fetchthreadparams);
                }
            } else
            if (!com.facebook.orca.threads.m.g(threadcriteria.a()))
            {
                fetchmultiplethreadsparams.b(fetchthreadparams);
            }
        } while (true);
        return new FetchMultipleThreadsParams(FolderName.b, fetchmultiplethreadsparams.b());
    }

    private FetchMultipleThreadsParams a(FolderName foldername, FetchMultipleThreadsParams fetchmultiplethreadsparams)
    {
        boolean flag;
        if (foldername == FolderName.b || foldername == FolderName.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        if (foldername == FolderName.b)
        {
            return a(fetchmultiplethreadsparams);
        } else
        {
            return b(fetchmultiplethreadsparams);
        }
    }

    private FetchMultipleThreadsResult a(Collection collection, FetchThreadParams fetchthreadparams, e e1)
    {
        if (collection.isEmpty())
        {
            return FetchMultipleThreadsResult.a;
        }
        et et1 = es.e();
        UserKey userkey;
        for (collection = collection.iterator(); collection.hasNext(); et1.b((new ac()).a(fetchthreadparams).a(ThreadCriteria.a(userkey)).h()))
        {
            userkey = (UserKey)collection.next();
        }

        collection = new FetchMultipleThreadsParams(FolderName.e, et1.b());
        fetchthreadparams = new Bundle();
        fetchthreadparams.putParcelable("fetchMultipleThreadsParams", collection);
        return (FetchMultipleThreadsResult)u(new ad(aq.l, fetchthreadparams), e1).i();
    }

    private FetchThreadResult a(FetchThreadParams fetchthreadparams, Collection collection)
    {
        Object obj = null;
        et et1 = es.e();
        Iterator iterator = collection.iterator();
        collection = obj;
        while (iterator.hasNext()) 
        {
            FetchThreadResult fetchthreadresult = (FetchThreadResult)iterator.next();
            ThreadSummary threadsummary = fetchthreadresult.a();
            if (collection == null && !com.facebook.orca.threads.m.g(threadsummary.a()))
            {
                collection = fetchthreadresult;
            } else
            {
                et1.b(fetchthreadresult);
            }
        }
        return w.a(fetchthreadparams.f(), collection, et1.b());
    }

    private FetchThreadResult a(FolderName foldername, FetchThreadResult fetchthreadresult)
    {
        if (fetchthreadresult.a() == null)
        {
            return fetchthreadresult;
        } else
        {
            foldername = a(foldername, fetchthreadresult.a());
            return new FetchThreadResult(fetchthreadresult.e(), foldername, fetchthreadresult.b(), fetchthreadresult.c(), fetchthreadresult.d(), fetchthreadresult.f());
        }
    }

    private ReceiptResult a(FolderName foldername, ReceiptResult receiptresult)
    {
        foldername = a(foldername, receiptresult.a());
        return new ReceiptResult(receiptresult.e(), foldername, receiptresult.f());
    }

    private ThreadSummary a(FolderName foldername, ThreadSummary threadsummary)
    {
        return ThreadSummary.newBuilder().a(threadsummary).a(foldername).z();
    }

    private ThreadsCollection a(FolderName foldername, ThreadsCollection threadscollection)
    {
        et et1 = es.e();
        for (Iterator iterator = threadscollection.b().iterator(); iterator.hasNext(); et1.b(a(foldername, (ThreadSummary)iterator.next()))) { }
        return new ThreadsCollection(et1.b(), threadscollection.c());
    }

    private es a(s s1, e e1, Collection collection)
    {
        Object obj = ik.a();
        Object obj1 = collection.iterator();
        do
        {
            if (!((Iterator) (obj1)).hasNext())
            {
                break;
            }
            ThreadSummary threadsummary1 = (ThreadSummary)((Iterator) (obj1)).next();
            if (threadsummary1.h())
            {
                ((Map) (obj)).put(threadsummary1.i(), threadsummary1);
            }
        } while (true);
        obj1 = d.a(((Map) (obj)).keySet());
        java.util.HashSet hashset = kl.a();
        Iterator iterator = ((ex) (obj1)).l().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UserKey userkey1 = (UserKey)iterator.next();
            if (!((Map) (obj)).keySet().contains(userkey1))
            {
                hashset.add(userkey1);
            }
        } while (true);
        iterator = ((ex) (obj1)).p().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            UserKey userkey2 = (UserKey)iterator.next();
            if (!((Map) (obj)).keySet().contains(userkey2))
            {
                hashset.add(userkey2);
            }
        } while (true);
        s1 = a(((Collection) (hashset)), (new ac()).a(0).a(s1).h(), e1);
        e1 = es.e();
        a(((et) (e1)), ((List) (s1.a())));
        for (s1 = e1.b().iterator(); s1.hasNext(); ((Map) (obj)).put(e1.i(), e1))
        {
            e1 = ((FetchThreadResult)s1.next()).a();
        }

        s1 = w.a(((Map) (obj)), ((com.google.common.a.iw) (obj1)));
        e1 = kl.a();
        obj = es.e();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            ThreadSummary threadsummary = (ThreadSummary)collection.next();
            UserKey userkey = threadsummary.i();
            if (userkey != null && s1.containsKey(userkey))
            {
                threadsummary = (ThreadSummary)s1.get(userkey);
                userkey = threadsummary.i();
                if (!e1.contains(userkey))
                {
                    ((et) (obj)).b(threadsummary);
                    e1.add(userkey);
                }
            } else
            {
                ((et) (obj)).b(threadsummary);
            }
        } while (true);
        return ((et) (obj)).b();
    }

    private ev a(com.facebook.orca.l.v v1, es es1)
    {
        ViewerContext viewercontext = c.c();
        Object obj = hq.a();
        for (Iterator iterator = es1.iterator(); iterator.hasNext(); ((List) (obj)).add(new com.facebook.orca.l.n(this, (FolderName)iterator.next(), viewercontext, v1))) { }
        v1 = ev.k();
        obj = b.invokeAll(((Collection) (obj)));
        int i1 = 0;
        do
        {
            if (i1 >= es1.size())
            {
                break;
            }
            try
            {
                v1.b(es1.get(i1), ((Future)((List) (obj)).get(i1)).get());
            }
            // Misplaced declaration of an exception variable
            catch (com.facebook.orca.l.v v1)
            {
                v1 = v1.getCause();
                Throwables.propagateIfPossible(v1, java/lang/Exception);
                throw Throwables.propagate(v1);
            }
            i1++;
        } while (true);
        return v1.b();
    }

    static Class a()
    {
        return a;
    }

    private List a(Collection collection, ad ad1, e e1)
    {
        FetchMoreMessagesParams fetchmoremessagesparams = (FetchMoreMessagesParams)ad1.b().getParcelable("fetchMoreMessagesParams");
        java.util.ArrayList arraylist = hq.a();
        for (collection = collection.iterator(); collection.hasNext(); arraylist.add((FetchMoreMessagesResult)e1.a(ad1).i()))
        {
            FetchMoreMessagesParams fetchmoremessagesparams1 = new FetchMoreMessagesParams(ThreadCriteria.a((UserKey)collection.next()), fetchmoremessagesparams.b(), fetchmoremessagesparams.c(), fetchmoremessagesparams.d());
            ad1.b().putParcelable("fetchMoreMessagesParams", fetchmoremessagesparams1);
        }

        return arraylist;
    }

    private void a(FetchThreadListResult fetchthreadlistresult)
    {
        h.a(fetchthreadlistresult.h());
        i.a();
        j.a();
        if (fetchthreadlistresult.i() != null)
        {
            k.a(fetchthreadlistresult.i());
        }
    }

    private void a(FetchThreadResult fetchthreadresult, FetchThreadResult fetchthreadresult1)
    {
        ThreadSummary threadsummary;
label0:
        {
            for (threadsummary = fetchthreadresult.a(); threadsummary == null || fetchthreadresult1 != null && fetchthreadresult1.a() != null && threadsummary.c() == fetchthreadresult1.a().c();)
            {
                return;
            }

            if (!threadsummary.h())
            {
                break label0;
            }
            fetchthreadresult = fetchthreadresult.b().b().iterator();
            UserKey userkey;
            Object obj;
            do
            {
                if (!fetchthreadresult.hasNext())
                {
                    break label0;
                }
                fetchthreadresult1 = (Message)fetchthreadresult.next();
                userkey = fetchthreadresult1.i().e();
                obj = c.c().a();
                obj = new UserKey(n.FACEBOOK, ((String) (obj)));
            } while (Objects.equal(userkey, obj));
            i.a(((UserKey) (obj)), fetchthreadresult1.f());
        }
        fetchthreadresult = threadsummary.a();
        g.a(fetchthreadresult, threadsummary.c());
    }

    private void a(et et1, List list)
    {
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            FetchThreadResult fetchthreadresult = (FetchThreadResult)list.next();
            if (fetchthreadresult.a() != null)
            {
                et1.b(fetchthreadresult);
            }
        } while (true);
    }

    private void a(String s1, e e1)
    {
        if (e.a((FolderName)r.b(), ThreadCriteria.a(s1)) != null)
        {
            return;
        } else
        {
            s1 = (new ac()).a(s.DO_NOT_CHECK_SERVER).a(ThreadCriteria.a(s1)).a(20).h();
            Bundle bundle = new Bundle();
            bundle.putParcelable("fetchThreadParams", s1);
            d(new ad(aq.k, bundle), e1);
            return;
        }
    }

    private OperationResult b(ad ad1, FolderName foldername, e e1)
    {
        com.facebook.fbservice.service.OperationType operationtype = ad1.a();
        ad1 = ad1.b();
        FetchMoreThreadsParams fetchmorethreadsparams = (FetchMoreThreadsParams)ad1.getParcelable("fetchMoreThreadsParams");
        foldername = new FetchMoreThreadsParams(foldername, fetchmorethreadsparams.b(), fetchmorethreadsparams.c());
        ad1 = (Bundle)ad1.clone();
        ad1.putParcelable("fetchMoreThreadsParams", foldername);
        return e1.a(new ad(operationtype, ad1));
    }

    static OperationResult b(a a1, ad ad1, FolderName foldername, e e1)
    {
        return a1.b(ad1, foldername, e1);
    }

    private FetchMultipleThreadsParams b(FetchMultipleThreadsParams fetchmultiplethreadsparams)
    {
        Object obj = fetchmultiplethreadsparams.b();
        fetchmultiplethreadsparams = es.e();
        obj = ((es) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            FetchThreadParams fetchthreadparams = (FetchThreadParams)((Iterator) (obj)).next();
            ThreadCriteria threadcriteria = fetchthreadparams.a();
            if (threadcriteria.b() != null)
            {
                if (threadcriteria.b().a() == n.PHONE_NUMBER)
                {
                    fetchmultiplethreadsparams.b(fetchthreadparams);
                }
            } else
            if (com.facebook.orca.threads.m.g(threadcriteria.a()))
            {
                fetchmultiplethreadsparams.b(fetchthreadparams);
            }
        } while (true);
        return new FetchMultipleThreadsParams(FolderName.d, fetchmultiplethreadsparams.b());
    }

    private void b()
    {
        i.a();
    }

    private OperationResult c(ad ad1, FolderName foldername, e e1)
    {
        com.facebook.fbservice.service.OperationType operationtype = ad1.a();
        ad1 = ad1.b();
        foldername = a(foldername, (FetchMultipleThreadsParams)ad1.getParcelable("fetchMultipleThreadsParams"));
        if (foldername.b().size() == 0)
        {
            return OperationResult.a(FetchMultipleThreadsResult.a);
        } else
        {
            ad1 = (Bundle)ad1.clone();
            ad1.putParcelable("fetchMultipleThreadsParams", foldername);
            return e1.a(new ad(operationtype, ad1));
        }
    }

    static OperationResult c(a a1, ad ad1, FolderName foldername, e e1)
    {
        return a1.c(ad1, foldername, e1);
    }

    private com.facebook.orca.l.v y(ad ad1, e e1)
    {
        return new d(this, ad1, e1);
    }

    private com.facebook.orca.l.v z(ad ad1, e e1)
    {
        return new j(this, ad1, e1);
    }

    protected OperationResult b(ad ad1, e e1)
    {
        Object obj1 = ad1.b();
        FetchThreadListParams fetchthreadlistparams = (FetchThreadListParams)((Bundle) (obj1)).getParcelable("fetchThreadListParams");
        FolderName foldername = fetchthreadlistparams.b();
        Object obj = e.a(fetchthreadlistparams);
        if (fetchthreadlistparams != obj)
        {
            ((Bundle) (obj1)).putParcelable("fetchThreadListParams", ((android.os.Parcelable) (obj)));
            fetchthreadlistparams = ((FetchThreadListParams) (obj));
        }
        obj = fetchthreadlistparams.a();
        boolean flag1 = e.a(foldername, ((s) (obj)));
        if (!m.a(foldername))
        {
            ad1 = e1.a(ad1);
            if (!flag1)
            {
                a((FetchThreadListResult)ad1.h());
            }
            return ad1;
        }
        if (flag1)
        {
            return OperationResult.a(e.a(foldername));
        }
        obj = a(y(ad1, e1), m.c(foldername));
        ad1 = ev.k();
        FetchThreadListResult fetchthreadlistresult;
        for (obj = ((Map) (obj)).entrySet().iterator(); ((Iterator) (obj)).hasNext(); ad1.b(((java.util.Map.Entry) (obj1)).getKey(), fetchthreadlistresult))
        {
            obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            fetchthreadlistresult = (FetchThreadListResult)((OperationResult)((java.util.Map.Entry) (obj1)).getValue()).i();
        }

        obj = ad1.b();
        Object obj2 = ((ev) (obj)).c();
        Collection collection7 = ax.a(((Collection) (obj2)), new com.facebook.orca.l.b(this));
        ad1 = ax.a(collection7, new com.facebook.orca.l.m(this));
        obj1 = ax.a(((Collection) (obj2)), new o(this));
        Collection collection = ax.a(((Collection) (obj2)), new p(this));
        Collection collection1 = ax.a(((Collection) (obj2)), new q(this));
        Collection collection2 = ax.a(((Collection) (obj2)), new com.facebook.orca.l.r(this));
        Collection collection3 = ax.a(((Collection) (obj2)), new com.facebook.orca.l.s(this));
        Collection collection4 = ax.a(((Collection) (obj2)), new t(this));
        Collection collection5 = ax.a(((Collection) (obj2)), new u(this));
        Collection collection6 = ax.a(((Collection) (obj2)), new c(this));
        boolean flag2 = false;
        obj2 = ((Collection) (obj2)).iterator();
        do
        {
            flag1 = flag2;
            if (!((Iterator) (obj2)).hasNext())
            {
                break;
            }
            if (((FetchThreadListResult)((Iterator) (obj2)).next()).n() == null)
            {
                continue;
            }
            flag1 = true;
            break;
        } while (true);
        if (((Boolean)o.b()).booleanValue())
        {
            ad1 = w.a(new w(), ad1);
            ad1 = a(fetchthreadlistparams.a(), e1, ad1);
            boolean flag = true;
            if (ad1.size() > fetchthreadlistparams.d())
            {
                flag = false;
                ad1 = ad1.a(0, fetchthreadlistparams.d());
            }
            boolean flag3;
            if (w.c(collection7) && !flag)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            ad1 = new ThreadsCollection(ad1, flag3);
        } else
        {
            ad1 = w.a(fetchthreadlistparams.d(), collection7);
        }
        ad1 = a(foldername, ad1);
        ad1 = FetchThreadListResult.newBuilder().a(w.d(((Collection) (obj1)))).a(foldername).a(ad1).a(w.a(collection)).a(w.a(collection1)).b(w.a(collection2)).a(com.facebook.orca.l.w.e(collection3)).a(((FetchThreadListResult)((ev) (obj)).get(FolderName.b)).i()).a(w.f(collection4)).a(com.facebook.orca.l.w.g(collection5)).b(com.facebook.orca.l.w.g(collection6)).b(flag1).a(((Map) (obj))).o();
        f.a(ad1);
        a(ad1);
        return OperationResult.a(ad1);
    }

    protected OperationResult c(ad ad1, e e1)
    {
        FetchMoreThreadsParams fetchmorethreadsparams = (FetchMoreThreadsParams)ad1.b().getParcelable("fetchMoreThreadsParams");
        FolderName foldername = fetchmorethreadsparams.a();
        if (!m.a(foldername))
        {
            ad1 = e1.a(ad1);
            b();
            return ad1;
        }
        Object obj = a(z(ad1, e1), m.c(foldername));
        ad1 = ev.k();
        java.util.Map.Entry entry;
        FetchMoreThreadsResult fetchmorethreadsresult;
        for (obj = ((ev) (obj)).a().iterator(); ((Iterator) (obj)).hasNext(); ad1.b(entry.getKey(), fetchmorethreadsresult))
        {
            entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            fetchmorethreadsresult = (FetchMoreThreadsResult)((OperationResult)entry.getValue()).i();
        }

        obj = ad1.b();
        Object obj1 = ((ev) (obj)).c();
        ad1 = ax.a(((Collection) (obj1)), new com.facebook.orca.l.e(this));
        Object obj2 = ax.a(ad1, new f(this));
        Collection collection = ax.a(((Collection) (obj1)), new com.facebook.orca.l.g(this));
        Collection collection1 = ax.a(((Collection) (obj1)), new h(this));
        obj1 = ax.a(((Collection) (obj1)), new com.facebook.orca.l.i(this));
        if (((Boolean)o.b()).booleanValue())
        {
            obj2 = w.a(new w(), ((Collection) (obj2)));
            e1 = a(s.PREFER_CACHE_IF_UP_TO_DATE, e1, ((Collection) (obj2)));
            obj2 = e1.iterator();
            int i1;
            for (i1 = 0; ((Iterator) (obj2)).hasNext() && ((ThreadSummary)((Iterator) (obj2)).next()).l() > fetchmorethreadsparams.b(); i1++) { }
            boolean flag = true;
            int k1 = fetchmorethreadsparams.c() + i1;
            int j1 = k1;
            if (e1.size() < k1)
            {
                flag = false;
                j1 = e1.size();
            }
            e1 = e1.a(i1, j1);
            boolean flag1;
            if (w.c(ad1) && !flag)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            ad1 = new ThreadsCollection(e1, flag1);
        } else
        {
            ad1 = w.a(fetchmorethreadsparams.c(), ad1);
        }
        ad1 = a(foldername, ad1);
        ad1 = new FetchMoreThreadsResult(w.d(collection), foldername, ad1, w.a(collection1), com.facebook.orca.l.w.g(((Collection) (obj1))), ((ev) (obj)));
        f.a(ad1);
        b();
        return OperationResult.a(ad1);
    }

    protected OperationResult d(ad ad1, e e1)
    {
        FolderName foldername = (FolderName)r.b();
        FetchThreadResult fetchthreadresult1 = e.a(ad1, foldername);
        if (m.a(foldername) && fetchthreadresult1 != null)
        {
            return OperationResult.a(fetchthreadresult1);
        }
        FetchThreadParams fetchthreadparams = (FetchThreadParams)ad1.b().getParcelable("fetchThreadParams");
        ad1 = e1.a(ad1);
        FetchThreadResult fetchthreadresult = (FetchThreadResult)ad1.i();
        if (!m.a(foldername))
        {
            a(fetchthreadresult, fetchthreadresult1);
            return ad1;
        }
        ex ex1 = ex.c();
        java.util.HashSet hashset;
        if (fetchthreadresult.a() != null)
        {
            ad1 = fetchthreadresult.a().i();
        } else
        if (fetchthreadresult.d() != null)
        {
            ad1 = fetchthreadresult.d().c();
        } else
        {
            ad1 = null;
        }
        if (((Boolean)o.b()).booleanValue() && ad1 != null)
        {
            ex1 = d.b(ad1);
        }
        hashset = kl.a();
        hashset.addAll(ex1.l());
        hashset.addAll(ex1.p());
        hashset.remove(ad1);
        ad1 = fetchthreadresult;
        if (!hashset.isEmpty())
        {
            ad1 = a(hashset, fetchthreadparams, e1);
            e1 = es.e();
            e1.b(fetchthreadresult);
            a(e1, ad1.a());
            e1 = e1.b();
            ad1 = fetchthreadresult;
            if (e1.size() > 1)
            {
                ad1 = a(fetchthreadparams, e1);
            }
        }
        ad1 = a(foldername, ad1);
        f.a(fetchthreadparams, ad1);
        a(ad1, fetchthreadresult1);
        return OperationResult.a(ad1);
    }

    protected OperationResult e(ad ad1, e e1)
    {
        e1 = (FetchThreadResult)e1.a(ad1).i();
        FolderName foldername = (FolderName)r.b();
        ad1 = e1;
        if (m.a(foldername))
        {
            ad1 = a(foldername, e1);
            f.a(ad1);
        }
        e1 = ad1.a();
        i.a();
        g.a(e1.a());
        return OperationResult.a(ad1);
    }

    protected OperationResult f(ad ad1, e e1)
    {
        SendBroadcastResult sendbroadcastresult = (SendBroadcastResult)e1.a(ad1).i();
        FolderName foldername = (FolderName)r.b();
        i.a();
        for (Iterator iterator = sendbroadcastresult.b().iterator(); iterator.hasNext(); g.a(ad1.a()))
        {
            e1 = (FetchThreadResult)iterator.next();
            ad1 = e1;
            if (m.a(foldername))
            {
                ad1 = a(foldername, e1);
                f.a(ad1);
            }
            ad1 = ad1.a();
        }

        return OperationResult.a(sendbroadcastresult);
    }

    protected OperationResult g(ad ad1, e e1)
    {
        e1 = e1.a(ad1);
        ad1 = (Message)ad1.b().getParcelable("outgoingMessage");
        FolderName foldername = (FolderName)r.b();
        if (m.a(foldername))
        {
            f.a(foldername, ad1);
        }
        return e1;
    }

    protected OperationResult h(ad ad1, e e1)
    {
        ad1 = (FetchThreadResult)e1.a(ad1).i();
        return OperationResult.a(a((FolderName)r.b(), ad1));
    }

    protected OperationResult i(ad ad1, e e1)
    {
        ad1 = (FetchThreadResult)e1.a(ad1).i();
        return OperationResult.a(a((FolderName)r.b(), ad1));
    }

    protected OperationResult j(ad ad1, e e1)
    {
        MarkThreadParams markthreadparams = (MarkThreadParams)ad1.b().getParcelable("markThreadParams");
        FolderName foldername = (FolderName)r.b();
        if (m.a(foldername))
        {
            f.a(foldername, markthreadparams);
        }
        return e1.a(ad1);
    }

    protected OperationResult k(ad ad1, e e1)
    {
        ad1 = (ReceiptResult)e1.a(ad1).i();
        return OperationResult.a(a((FolderName)r.b(), ad1));
    }

    protected OperationResult l(ad ad1, e e1)
    {
        ad1 = (ReceiptResult)e1.a(ad1).i();
        return OperationResult.a(a((FolderName)r.b(), ad1));
    }

    protected OperationResult m(ad ad1, e e1)
    {
        Object obj = (DeleteThreadParams)ad1.b().getParcelable("deleteThreadParams");
        ad1 = e1.a(ad1);
        e1 = ((DeleteThreadParams) (obj)).a();
        obj = (FolderName)r.b();
        if (m.a(((FolderName) (obj))))
        {
            f.a(((FolderName) (obj)), e1);
        }
        g.c(e1);
        return ad1;
    }

    protected OperationResult n(ad ad1, e e1)
    {
        DeleteMessagesParams deletemessagesparams = (DeleteMessagesParams)ad1.b().getParcelable("deleteMessagesParams");
        String s1 = deletemessagesparams.a();
        fi fi1 = deletemessagesparams.b();
        ad1 = e1.a(ad1);
        e1 = (DeleteMessagesResult)ad1.i();
        FolderName foldername = (FolderName)r.b();
        if (m.a(foldername))
        {
            f.a(foldername, deletemessagesparams, e1);
        }
        String s2;
        for (Iterator iterator = e1.a().c().iterator(); iterator.hasNext(); n.a(s1, s2))
        {
            s2 = (String)iterator.next();
        }

        if (e1.b())
        {
            g.c(s1);
            return ad1;
        } else
        {
            g.a(s1);
            g.a(s1, fi1);
            return ad1;
        }
    }

    protected OperationResult o(ad ad1, e e1)
    {
        e1 = (FetchThreadResult)e1.a(ad1).i();
        FolderName foldername = (FolderName)r.b();
        ad1 = e1;
        if (m.a(foldername))
        {
            ad1 = a(foldername, e1);
            f.b(ad1);
        }
        i.a();
        return OperationResult.a(ad1);
    }

    protected OperationResult p(ad ad1, e e1)
    {
        e1 = e1.a(ad1);
        Object obj = ad1.b();
        ad1 = ((Bundle) (obj)).getString("threadId");
        obj = (MessageDraft)((Bundle) (obj)).getParcelable("draft");
        FolderName foldername = (FolderName)r.b();
        if (m.a(foldername))
        {
            f.a(foldername, ad1, ((MessageDraft) (obj)));
        }
        return e1;
    }

    protected OperationResult q(ad ad1, e e1)
    {
        com.facebook.fbservice.service.OperationType operationtype = ad1.a();
        Bundle bundle = ad1.b();
        FolderName foldername = (FolderName)bundle.getParcelable("folderName");
        if (!m.a(foldername))
        {
            return e1.a(ad1);
        } else
        {
            a(new com.facebook.orca.l.l(this, bundle, operationtype, e1), m.c(foldername));
            long l1 = System.currentTimeMillis();
            f.a(foldername, l1);
            return OperationResult.b();
        }
    }

    protected OperationResult r(ad ad1, e e1)
    {
        String s1 = ad1.b().getString("threadId");
        a(s1, e1);
        ad1 = e1.a(ad1);
        Object obj = (NewMessageResult)ad1.i();
        if (obj != null)
        {
            e1 = ((NewMessageResult) (obj)).b();
            Object obj1 = (FolderName)r.b();
            if (m.a(((FolderName) (obj1))))
            {
                f.a(((FolderName) (obj1)), ((NewMessageResult) (obj)));
            }
            obj = c.c().a();
            obj = new UserKey(n.FACEBOOK, ((String) (obj)));
            if (!Objects.equal(e1.i().e(), obj))
            {
                i.a(e1.i().e(), e1.f());
            }
            g.a(s1);
            obj1 = e.a((FolderName)r.b(), ThreadCriteria.a(s1));
            if (obj1 != null && !com.facebook.orca.threads.m.g(s1) && ((ThreadSummary) (obj1)).h() && e1.i().b() && !e1.i().e().equals(obj))
            {
                l.a(e1);
            }
        }
        return ad1;
    }

    protected OperationResult t(ad ad1, e e1)
    {
        FetchMoreMessagesParams fetchmoremessagesparams;
        Object obj;
        if (!((Boolean)o.b()).booleanValue() || !((Boolean)p.b()).booleanValue() || !((Boolean)q.b()).booleanValue())
        {
            return e1.a(ad1);
        }
        fetchmoremessagesparams = (FetchMoreMessagesParams)ad1.b().getParcelable("fetchMoreMessagesParams");
        obj = (new ac()).a(s.STALE_DATA_OKAY).a(fetchmoremessagesparams.a()).a(0).h();
        Bundle bundle = new Bundle();
        bundle.putParcelable("fetchThreadParams", ((android.os.Parcelable) (obj)));
        obj = (FetchThreadResult)e1.a(new ad(aq.k, bundle)).i();
        if (!((FetchThreadResult) (obj)).a().h()) goto _L2; else goto _L1
_L1:
        obj = ((FetchThreadResult) (obj)).a().i();
        obj = d.b(((UserKey) (obj)));
        java.util.HashSet hashset = kl.a();
        hashset.addAll(((ex) (obj)).o());
        hashset.addAll(((ex) (obj)).p());
        e1 = a(hashset, ad1, e1);
        obj = e1.iterator();
_L6:
        if (!((Iterator) (obj)).hasNext()) goto _L4; else goto _L3
_L3:
        String s1;
        ad1 = (FetchMoreMessagesResult)((Iterator) (obj)).next();
        s1 = ad1.a().a();
        if (s1 == null || com.facebook.orca.threads.m.g(s1)) goto _L6; else goto _L5
_L5:
        e1.remove(ad1);
_L8:
        return OperationResult.a(w.a(fetchmoremessagesparams.d(), ad1, e1));
_L2:
        return e1.a(ad1);
_L4:
        ad1 = null;
        if (true) goto _L8; else goto _L7
_L7:
    }

    protected OperationResult u(ad ad1, e e1)
    {
        FolderName foldername = ((FetchMultipleThreadsParams)ad1.b().getParcelable("fetchMultipleThreadsParams")).a();
        if (!foldername.equals(FolderName.e))
        {
            throw new IllegalArgumentException(com.facebook.common.w.m.a("Fetching multiple threads for %1$s not currently supported", new Object[] {
                foldername.toString()
            }));
        } else
        {
            e1 = a(A(ad1, e1), es.a(FolderName.b, FolderName.d));
            ad1 = (FetchMultipleThreadsResult)((OperationResult)e1.get(FolderName.b)).i();
            e1 = (FetchMultipleThreadsResult)((OperationResult)e1.get(FolderName.d)).i();
            return OperationResult.a(new FetchMultipleThreadsResult(w.a(new Collection[] {
                ad1.a(), e1.a()
            })));
        }
    }

}
