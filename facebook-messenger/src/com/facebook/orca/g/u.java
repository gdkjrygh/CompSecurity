// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import com.facebook.fbservice.c.b;
import com.facebook.fbservice.service.OperationResult;
import com.facebook.fbservice.service.ad;
import com.facebook.fbservice.service.e;
import com.facebook.fbservice.service.s;
import com.facebook.messages.model.threads.Message;
import com.facebook.messages.model.threads.c;
import com.facebook.orca.compose.MessageDraft;
import com.facebook.orca.f.k;
import com.facebook.orca.server.AddMembersParams;
import com.facebook.orca.server.DeleteMessagesParams;
import com.facebook.orca.server.DeleteMessagesResult;
import com.facebook.orca.server.DeleteThreadParams;
import com.facebook.orca.server.DeliveredReceiptParams;
import com.facebook.orca.server.FetchGroupThreadsParams;
import com.facebook.orca.server.FetchGroupThreadsResult;
import com.facebook.orca.server.FetchMoreMessagesParams;
import com.facebook.orca.server.FetchMoreMessagesResult;
import com.facebook.orca.server.FetchMoreThreadsParams;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.FetchThreadParams;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.server.MarkThreadParams;
import com.facebook.orca.server.NewMessageResult;
import com.facebook.orca.server.ReadReceiptParams;
import com.facebook.orca.server.ReceiptResult;
import com.facebook.orca.server.RemoveMemberParams;
import com.facebook.orca.server.SendBroadcastResult;
import com.facebook.orca.server.ThreadCriteria;
import com.facebook.orca.server.a;
import com.facebook.orca.server.aa;
import com.facebook.orca.server.ac;
import com.facebook.orca.server.aq;
import com.facebook.orca.server.y;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.orca.threads.i;
import com.facebook.orca.threads.m;
import com.facebook.user.User;
import com.google.common.a.es;
import com.google.common.a.fi;
import com.google.common.a.fk;
import com.google.common.a.ik;
import java.io.IOException;
import java.util.Iterator;

// Referenced classes of package com.facebook.orca.g:
//            h, aa, n, m, 
//            k, v, t, s, 
//            y

public class u extends a
{

    private Class a;
    private final com.facebook.base.broadcast.a b;
    private final k c;
    private final com.facebook.orca.g.k d;
    private final h e;
    private final n f;
    private final com.facebook.orca.g.m g;
    private final t h;
    private final com.facebook.orca.g.y i;
    private final com.facebook.orca.g.aa j;
    private final i k;

    u(com.facebook.base.broadcast.a a1, k k1, com.facebook.orca.g.k k2, h h1, n n1, com.facebook.orca.g.m m1, t t1, 
            com.facebook.orca.g.y y1, com.facebook.orca.g.aa aa1, i i1)
    {
        super("DbServiceHandler");
        a = com/facebook/orca/g/u;
        b = a1;
        c = k1;
        d = k2;
        e = h1;
        f = n1;
        g = m1;
        h = t1;
        i = y1;
        j = aa1;
        k = i1;
    }

    private FetchThreadResult a(FetchThreadParams fetchthreadparams, FetchThreadResult fetchthreadresult, e e1)
    {
        ThreadSummary threadsummary = fetchthreadresult.a();
        Object obj = fetchthreadresult.b();
        if (threadsummary == null || obj == null || ((MessagesCollection) (obj)).e())
        {
            obj = null;
        } else
        {
            obj = fetchthreadresult;
            if (fetchthreadparams.b() != s.STALE_DATA_OKAY)
            {
                try
                {
                    c(fetchthreadparams, b(fetchthreadparams, fetchthreadresult, e1), e1);
                }
                // Misplaced declaration of an exception variable
                catch (e e1)
                {
                    if (fetchthreadparams.c() != s.CHECK_SERVER_FOR_NEW_DATA)
                    {
                        return new FetchThreadResult(b.FROM_CACHE_HAD_SERVER_ERROR, fetchthreadresult.a(), fetchthreadresult.b(), fetchthreadresult.c(), fetchthreadresult.d(), fetchthreadresult.f());
                    } else
                    {
                        throw e1;
                    }
                }
                fetchthreadparams = e.a(threadsummary.a(), fetchthreadparams.f());
                return new FetchThreadResult(b.FROM_SERVER, fetchthreadparams);
            }
        }
        return ((FetchThreadResult) (obj));
    }

    private boolean a(s s1, FetchThreadResult fetchthreadresult)
    {
        while (s1 == s.CHECK_SERVER_FOR_NEW_DATA || fetchthreadresult.e() != b.FROM_CACHE_UP_TO_DATE) 
        {
            return true;
        }
        return false;
    }

    private FetchThreadResult b(FetchThreadParams fetchthreadparams, FetchThreadResult fetchthreadresult, e e1)
    {
        MessagesCollection messagescollection;
        Iterator iterator;
        if (!a(fetchthreadparams.b(), fetchthreadresult))
        {
            return fetchthreadresult;
        }
        messagescollection = fetchthreadresult.b();
        iterator = messagescollection.b().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Object obj = (Message)iterator.next();
        if (((Message) (obj)).y()) goto _L4; else goto _L3
_L3:
        long l1 = -1L;
        if (obj != null)
        {
            l1 = ((Message) (obj)).f() - 1L;
        }
        fetchthreadparams = (new ac()).a(fetchthreadparams).a(s.CHECK_SERVER_FOR_NEW_DATA).b(l1).h();
        obj = new Bundle();
        ((Bundle) (obj)).putParcelable("fetchThreadParams", fetchthreadparams);
        fetchthreadparams = (FetchThreadResult)e1.a(new ad(aq.k, ((Bundle) (obj)))).i();
        e1 = j.e();
        e1.beginTransaction();
        f.a(fetchthreadresult, fetchthreadparams);
        g.a(fetchthreadparams.c());
        e1.setTransactionSuccessful();
        e1.endTransaction();
        fetchthreadresult = k.b(fetchthreadparams.b(), messagescollection);
        return new FetchThreadResult(b.FROM_SERVER, fetchthreadparams.a(), fetchthreadresult, fetchthreadparams.c(), null, System.currentTimeMillis());
        fetchthreadparams;
        e1.endTransaction();
        throw fetchthreadparams;
_L2:
        obj = null;
        if (true) goto _L3; else goto _L5
_L5:
    }

    private FetchThreadResult c(FetchThreadParams fetchthreadparams, FetchThreadResult fetchthreadresult, e e1)
    {
        if (!fetchthreadresult.b().d())
        {
            ThreadSummary threadsummary = fetchthreadresult.a();
            MessagesCollection messagescollection = fetchthreadresult.b();
            String s1 = fetchthreadparams.a().a();
            int i1 = fetchthreadparams.f() - messagescollection.f();
            if (i1 > 0)
            {
                fetchthreadparams = messagescollection.a(messagescollection.f() - 1);
                fetchthreadparams = new FetchMoreMessagesParams(ThreadCriteria.a(s1), 0L, fetchthreadparams.f(), i1 + 1);
                Bundle bundle = new Bundle();
                bundle.putParcelable("fetchMoreMessagesParams", fetchthreadparams);
                fetchthreadparams = (FetchMoreMessagesResult)e1.a(new ad(aq.u, bundle)).i();
                f.a(s1, fetchthreadresult, fetchthreadparams);
                fetchthreadparams = fetchthreadparams.a();
                fetchthreadparams = k.b(messagescollection, fetchthreadparams);
                return new FetchThreadResult(b.FROM_SERVER, threadsummary, fetchthreadparams, fetchthreadresult.c(), null, System.currentTimeMillis());
            }
        }
        return fetchthreadresult;
    }

    protected OperationResult b(ad ad1, e e1)
    {
        com.facebook.debug.d.e e2;
        FetchThreadListParams fetchthreadlistparams;
        Object obj;
        boolean flag1;
        flag1 = false;
        obj = ad1.a();
        fetchthreadlistparams = (FetchThreadListParams)ad1.b().getParcelable("fetchThreadListParams");
        ad1 = fetchthreadlistparams.a();
        e2 = com.facebook.debug.d.e.a("DbServiceHandler.handleFetchThreadList");
        Object obj1 = d.a(fetchthreadlistparams);
        com.facebook.orca.g.v.a[ad1.ordinal()];
        JVM INSTR tableswitch 1 3: default 370
    //                   1 102
    //                   2 382
    //                   3 119;
           goto _L1 _L2 _L3 _L4
_L12:
        boolean flag;
        if (!flag) goto _L6; else goto _L5
_L5:
        ad1 = OperationResult.a(((android.os.Parcelable) (obj1)));
_L10:
        e2.a();
        return ad1;
_L2:
        long l1;
        SQLiteDatabase sqlitedatabase;
        if (((FetchThreadListResult) (obj1)).e() != b.NO_DATA)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        if (((FetchThreadListResult) (obj1)).e() == b.FROM_CACHE_UP_TO_DATE)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        continue; /* Loop/switch isn't completed */
_L6:
        l1 = ((FetchThreadListResult) (obj1)).k();
        flag = flag1;
        if (l1 > 0L)
        {
            flag = true;
        }
        ad1 = FetchThreadListParams.newBuilder().a(fetchthreadlistparams).a(s.CHECK_SERVER_FOR_NEW_DATA).a(fetchthreadlistparams.b());
        if (!flag)
        {
            l1 = -1L;
        }
        obj1 = ad1.a(l1).f();
        ad1 = new Bundle();
        ad1.putParcelable("fetchThreadListParams", ((android.os.Parcelable) (obj1)));
        ad1 = e1.a(new ad(((com.facebook.fbservice.service.OperationType) (obj)), ad1));
        e1 = (FetchThreadListResult)ad1.i();
        obj = com.facebook.debug.d.e.a("DbServiceHandler.handleFetchThreadList#insertData");
        sqlitedatabase = j.e();
        sqlitedatabase.beginTransaction();
        f.a(e1);
        g.a(e1.c());
        sqlitedatabase.setTransactionSuccessful();
        sqlitedatabase.endTransaction();
        ((com.facebook.debug.d.e) (obj)).a();
        if (flag) goto _L8; else goto _L7
_L7:
        if (((FetchThreadListParams) (obj1)).b() != FolderName.d)
        {
            continue; /* Loop/switch isn't completed */
        }
_L8:
        ad1 = d.a(fetchthreadlistparams);
        ad1 = OperationResult.a(FetchThreadListResult.newBuilder().a(ad1).a(e1.i()).o());
        if (true) goto _L10; else goto _L9
_L9:
        ad1;
        sqlitedatabase.endTransaction();
        ((com.facebook.debug.d.e) (obj)).a();
        throw ad1;
        ad1;
        e2.a();
        throw ad1;
_L1:
        flag = false;
        continue; /* Loop/switch isn't completed */
_L3:
        flag = true;
        if (true) goto _L12; else goto _L11
_L11:
    }

    protected OperationResult c(ad ad1, e e1)
    {
        FetchMoreThreadsParams fetchmorethreadsparams = (FetchMoreThreadsParams)ad1.b().getParcelable("fetchMoreThreadsParams");
        FetchMoreThreadsResult fetchmorethreadsresult = d.a(fetchmorethreadsparams);
        if (fetchmorethreadsresult.b().c() || fetchmorethreadsresult.b().e() == fetchmorethreadsparams.c())
        {
            return OperationResult.a(fetchmorethreadsresult);
        }
        ad1 = e1.a(ad1);
        e1 = (FetchMoreThreadsResult)ad1.i();
        f.a(e1);
        if (fetchmorethreadsparams.a() == FolderName.d)
        {
            return OperationResult.a(d.a(fetchmorethreadsparams));
        } else
        {
            return ad1;
        }
    }

    protected OperationResult d(ad ad1, e e1)
    {
        Object obj;
        com.facebook.debug.d.e e2;
        Object obj1;
        s s1;
        int i1;
        h.a();
        obj1 = (FetchThreadParams)ad1.b().getParcelable("fetchThreadParams");
        s1 = ((FetchThreadParams) (obj1)).b();
        i1 = ((FetchThreadParams) (obj1)).f();
        obj = ((FetchThreadParams) (obj1)).a();
        e2 = com.facebook.debug.d.e.a("DbServiceHandler.handleFetchThread");
        if (((ThreadCriteria) (obj)).a() == null) goto _L2; else goto _L1
_L1:
        obj = e.a(((ThreadCriteria) (obj)).a(), i1);
_L5:
        if (s1 != s.DO_NOT_CHECK_SERVER) goto _L4; else goto _L3
_L3:
        ad1 = OperationResult.a(((android.os.Parcelable) (obj)));
_L6:
        e2.a();
        return ad1;
_L2:
label0:
        {
            if (((ThreadCriteria) (obj)).b() == null)
            {
                break label0;
            }
            obj = e.a(((ThreadCriteria) (obj)).b(), i1);
        }
          goto _L5
        throw new IllegalArgumentException("No threadid or userkey specified for thread fetch");
        ad1;
        e2.a();
        throw ad1;
_L4:
        obj1 = a(((FetchThreadParams) (obj1)), ((FetchThreadResult) (obj)), e1);
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_159;
        }
        ad1 = OperationResult.a(((android.os.Parcelable) (obj1)));
          goto _L6
        e1 = (FetchThreadResult)e1.a(ad1).i();
        ad1 = j.e();
        ad1.beginTransaction();
        if (e1.a() != null)
        {
            f.a(((FetchThreadResult) (obj)), e1);
        }
        if (e1.c() != null)
        {
            g.a(e1.c());
        }
        ad1.setTransactionSuccessful();
        ad1.endTransaction();
        if (e1.a() == null)
        {
            break MISSING_BLOCK_LABEL_280;
        }
        ad1 = e1.a().a();
        ad1 = e.a(ad1, i1);
        ad1 = new FetchThreadResult(b.FROM_SERVER, ad1);
_L7:
        ad1 = OperationResult.a(ad1);
          goto _L6
        e1;
        ad1.endTransaction();
        throw e1;
        ad1 = new FetchThreadResult(b.FROM_SERVER, e1);
          goto _L7
    }

    protected OperationResult e(ad ad1, e e1)
    {
        FetchThreadResult fetchthreadresult;
        h.a();
        e1 = e1.a(ad1);
        fetchthreadresult = (FetchThreadResult)e1.i();
        ad1 = j.e();
        ad1.beginTransaction();
        f.a(fetchthreadresult);
        g.a(fetchthreadresult.c());
        ad1.setTransactionSuccessful();
        ad1.endTransaction();
        return e1;
        e1;
        ad1.endTransaction();
        throw e1;
    }

    protected OperationResult f(ad ad1, e e1)
    {
        Object obj;
        h.a();
        e1 = e1.a(ad1);
        obj = (SendBroadcastResult)e1.i();
        ad1 = j.e();
        ad1.beginTransaction();
        FetchThreadResult fetchthreadresult;
        for (obj = ((SendBroadcastResult) (obj)).b().iterator(); ((Iterator) (obj)).hasNext(); g.a(fetchthreadresult.c()))
        {
            fetchthreadresult = (FetchThreadResult)((Iterator) (obj)).next();
            f.a(fetchthreadresult);
        }

        break MISSING_BLOCK_LABEL_94;
        e1;
        ad1.endTransaction();
        throw e1;
        ad1.setTransactionSuccessful();
        ad1.endTransaction();
        return e1;
    }

    protected OperationResult g(ad ad1, e e1)
    {
        h.a();
        ad1 = (Message)ad1.b().getParcelable("outgoingMessage");
        f.a(ad1);
        f.a(ad1.e(), null);
        return OperationResult.b();
    }

    protected OperationResult h(ad ad1, e e1)
    {
        Object obj;
        obj = (AddMembersParams)ad1.b().getParcelable("addMembersParams");
        e1 = e1.a(ad1);
        obj = (FetchThreadResult)e1.i();
        ad1 = j.e();
        ad1.beginTransaction();
        f.a(((FetchThreadResult) (obj)));
        g.a(((FetchThreadResult) (obj)).c());
        ad1.setTransactionSuccessful();
        ad1.endTransaction();
        return e1;
        e1;
        ad1.endTransaction();
        throw e1;
    }

    protected OperationResult i(ad ad1, e e1)
    {
        Object obj;
        obj = (RemoveMemberParams)ad1.b().getParcelable("removeMemberParams");
        e1 = e1.a(ad1);
        c.a().b();
        obj = (FetchThreadResult)e1.i();
        ad1 = j.e();
        ad1.beginTransaction();
        f.a(((FetchThreadResult) (obj)));
        g.a(((FetchThreadResult) (obj)).c());
        ad1.setTransactionSuccessful();
        b.a("com.facebook.intent.action.TOP_GROUP_THREADS_SYNC_PROGRESS");
        ad1.endTransaction();
        return e1;
        e1;
        ad1.endTransaction();
        throw e1;
    }

    protected OperationResult j(ad ad1, e e1)
    {
        MarkThreadParams markthreadparams = (MarkThreadParams)ad1.b().getParcelable("markThreadParams");
        f.a(markthreadparams);
        return e1.a(ad1);
    }

    protected OperationResult k(ad ad1, e e1)
    {
        ad1 = (ReadReceiptParams)ad1.b().getParcelable("readReceiptParams");
        f.a(ad1);
        ad1 = e.a(ad1.b(), 0);
        return OperationResult.a(new ReceiptResult(ad1.e(), ad1.a(), ad1.f()));
    }

    protected OperationResult l(ad ad1, e e1)
    {
        ad1 = (DeliveredReceiptParams)ad1.b().getParcelable("deliveredReceiptParams");
        f.a(ad1);
        ad1 = e.a(ad1.b(), 0);
        return OperationResult.a(new ReceiptResult(ad1.e(), ad1.a(), ad1.f()));
    }

    protected OperationResult m(ad ad1, e e1)
    {
        DeleteThreadParams deletethreadparams = (DeleteThreadParams)ad1.b().getParcelable("deleteThreadParams");
        ad1 = e1.a(ad1);
        f.a(deletethreadparams);
        return ad1;
    }

    protected OperationResult n(ad ad1, e e1)
    {
        boolean flag = true;
        ad1 = (DeleteMessagesParams)ad1.b().getParcelable("deleteMessagesParams");
        Object obj = fi.e();
        Iterator iterator = ad1.b().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s1 = (String)iterator.next();
            if (com.facebook.orca.threads.m.f(s1) || com.facebook.orca.threads.m.h(s1) || com.facebook.orca.threads.m.i(s1))
            {
                ((fk) (obj)).b(s1);
            }
        } while (true);
        obj = ((fk) (obj)).b();
        if (!((fi) (obj)).isEmpty())
        {
            obj = new DeleteMessagesParams(ad1.a(), ((fi) (obj)));
            Bundle bundle = new Bundle();
            bundle.putParcelable("deleteMessagesParams", ((android.os.Parcelable) (obj)));
            e1.a(new ad(aq.h, bundle));
        }
        e1 = ik.a(f.a(ad1));
        obj = e.a(ad1.a(), -1L, -1L, 1);
        if (((FetchMoreMessagesResult) (obj)).a() != null && ((FetchMoreMessagesResult) (obj)).a().e())
        {
            f.a(new DeleteThreadParams(ad1.a()));
        } else
        {
            flag = false;
        }
        return OperationResult.a(new DeleteMessagesResult(e1, flag));
    }

    protected OperationResult o(ad ad1, e e1)
    {
        FetchThreadResult fetchthreadresult;
        ad1.b();
        e1 = e1.a(ad1);
        fetchthreadresult = (FetchThreadResult)e1.i();
        ad1 = j.e();
        ad1.beginTransaction();
        f.a(fetchthreadresult);
        g.a(fetchthreadresult.c());
        ad1.setTransactionSuccessful();
        ad1.endTransaction();
        return e1;
        e1;
        ad1.endTransaction();
        throw e1;
    }

    protected OperationResult p(ad ad1, e e1)
    {
        e1 = ad1.b();
        ad1 = e1.getString("threadId");
        e1 = (MessageDraft)e1.getParcelable("draft");
        f.a(ad1, e1);
        return OperationResult.b();
    }

    protected OperationResult r(ad ad1, e e1)
    {
        e1 = (Message)ad1.b().getParcelable("message");
        ad1 = FolderName.b;
        if (c.SMS.equals(e1.A()) || c.MMS.equals(e1.A()))
        {
            ad1 = FolderName.d;
        }
        ad1 = com.facebook.orca.g.s.c(ad1);
        i.b(ad1, true);
        ad1 = new NewMessageResult(b.FROM_SERVER, e1.e(), e1, null, System.currentTimeMillis());
        return OperationResult.a(f.a(ad1));
    }

    protected OperationResult s(ad ad1, e e1)
    {
        FetchGroupThreadsParams fetchgroupthreadsparams;
        FetchGroupThreadsResult fetchgroupthreadsresult;
        fetchgroupthreadsparams = (FetchGroupThreadsParams)ad1.b().getParcelable("fetchGroupThreadsParams");
        e1 = e1.a(ad1);
        fetchgroupthreadsresult = (FetchGroupThreadsResult)e1.i();
        ad1 = j.e();
        ad1.beginTransaction();
        f.a(fetchgroupthreadsparams, fetchgroupthreadsresult);
        g.a(fetchgroupthreadsresult.b());
        ad1.setTransactionSuccessful();
        ad1.endTransaction();
        return e1;
        e1;
        ad1.endTransaction();
        throw e1;
    }

    protected OperationResult t(ad ad1, e e1)
    {
        Object obj;
        Object obj1;
        int i1;
        long l1;
        long l2;
        obj1 = (FetchMoreMessagesParams)ad1.b().getParcelable("fetchMoreMessagesParams");
        obj = ((FetchMoreMessagesParams) (obj1)).a();
        ((FetchMoreMessagesParams) (obj1)).b();
        l1 = ((FetchMoreMessagesParams) (obj1)).b();
        l2 = ((FetchMoreMessagesParams) (obj1)).c();
        i1 = ((FetchMoreMessagesParams) (obj1)).d();
        obj1 = com.facebook.debug.d.e.a("DbServiceHandler.handleFetchThread");
        if (((ThreadCriteria) (obj)).a() == null)
        {
            break MISSING_BLOCK_LABEL_128;
        }
        obj = e.a(((ThreadCriteria) (obj)).a(), l1, l2, i1);
_L1:
        MessagesCollection messagescollection = ((FetchMoreMessagesResult) (obj)).a();
        if (obj == FetchMoreMessagesResult.a || messagescollection.b().size() != i1 && !messagescollection.d())
        {
            break MISSING_BLOCK_LABEL_176;
        }
        ad1 = OperationResult.a(((android.os.Parcelable) (obj)));
        ((com.facebook.debug.d.e) (obj1)).a();
        return ad1;
label0:
        {
            if (((ThreadCriteria) (obj)).b() == null)
            {
                break label0;
            }
            obj = e.a(((ThreadCriteria) (obj)).b(), l1, l2, i1);
        }
          goto _L1
        throw new IllegalArgumentException("No threadid or userkey specified for more messages fetch");
        ad1;
        ((com.facebook.debug.d.e) (obj1)).a();
        throw ad1;
        ad1 = e1.a(ad1);
        e1 = (FetchMoreMessagesResult)ad1.i();
        f.a(((FetchMoreMessagesResult) (obj)), e1);
        ((com.facebook.debug.d.e) (obj1)).a();
        return ad1;
    }
}
