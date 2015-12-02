// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.g;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.facebook.d.d.f;
import com.facebook.d.d.j;
import com.facebook.debug.d.e;
import com.facebook.fbservice.c.b;
import com.facebook.orca.server.FetchMoreThreadsParams;
import com.facebook.orca.server.FetchMoreThreadsResult;
import com.facebook.orca.server.FetchThreadListParams;
import com.facebook.orca.server.FetchThreadListResult;
import com.facebook.orca.server.aa;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.ThreadParticipant;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.orca.threads.v;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ik;
import com.google.common.a.kl;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;
import javax.inject.a;

// Referenced classes of package com.facebook.orca.g:
//            aa, z, s, y, 
//            l, j, e, r, 
//            g

class k
{

    private static final String h[] = {
        "unread_count", "unseen_count", "last_seen_time", "last_action_id"
    };
    private final com.facebook.orca.g.aa a;
    private final com.facebook.orca.g.j b;
    private final y c;
    private final r d;
    private final g e;
    private final a f;
    private final com.facebook.orca.g.e g;

    k(com.facebook.orca.g.aa aa1, com.facebook.orca.g.j j1, y y1, r r, g g1, a a1, com.facebook.orca.g.e e1)
    {
        a = aa1;
        b = j1;
        c = y1;
        d = r;
        e = g1;
        f = a1;
        g = e1;
    }

    private es a(Collection collection, int i)
    {
        et et1 = es.e();
        collection = collection.iterator();
        for (int i1 = 0; collection.hasNext() && i1 < i; i1++)
        {
            et1.b(collection.next());
        }

        return et1.b();
    }

    private LinkedHashMap a(FolderName foldername, long l1, int i)
    {
        e e1 = com.facebook.debug.d.e.a("DbFetchThreadsHandler.doThreadListQuery");
        Object obj = b(foldername, l1, i);
        b(((LinkedHashMap) (obj)));
        c(((LinkedHashMap) (obj)));
        foldername = ik.b();
        v v1;
        for (obj = ((LinkedHashMap) (obj)).values().iterator(); ((Iterator) (obj)).hasNext(); foldername.put(v1.a(), v1.z()))
        {
            v1 = (v)((Iterator) (obj)).next();
        }

        e1.a();
        return foldername;
    }

    private Set a()
    {
        Cursor cursor;
        Object obj;
        obj = kl.a();
        cursor = a.e().query(true, "archived_sms_mms_threads", new String[] {
            "thread_id"
        }, null, null, null, null, null, null);
        while (cursor.moveToNext()) 
        {
            ((Set) (obj)).add(cursor.getString(0));
        }
        break MISSING_BLOCK_LABEL_68;
        obj;
        cursor.close();
        throw obj;
        cursor.close();
        return ((Set) (obj));
    }

    private Set a(LinkedHashMap linkedhashmap)
    {
        java.util.HashSet hashset = kl.a();
        for (linkedhashmap = linkedhashmap.values().iterator(); linkedhashmap.hasNext();)
        {
            Object obj = (ThreadSummary)linkedhashmap.next();
            Iterator iterator = ((ThreadSummary) (obj)).j().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                ThreadParticipant threadparticipant1 = (ThreadParticipant)iterator.next();
                if (threadparticipant1.d() != null)
                {
                    hashset.add(threadparticipant1.d());
                }
            } while (true);
            obj = ((ThreadSummary) (obj)).B().iterator();
            while (((Iterator) (obj)).hasNext()) 
            {
                ThreadParticipant threadparticipant = (ThreadParticipant)((Iterator) (obj)).next();
                if (threadparticipant.d() != null)
                {
                    hashset.add(threadparticipant.d());
                }
            }
        }

        return hashset;
    }

    private FolderCounts b(FolderName foldername)
    {
        e e1;
        e1 = com.facebook.debug.d.e.a("DbFetchThreadsHandler.getFolderCounts");
        foldername = String.format("folder='%1$s'", new Object[] {
            foldername.b()
        });
        foldername = a.e().query("folder_counts", h, foldername, null, null, null, null);
        FolderCounts foldercounts;
        if (!foldername.moveToNext())
        {
            break MISSING_BLOCK_LABEL_102;
        }
        foldercounts = new FolderCounts(foldername.getInt(0), foldername.getInt(1), foldername.getLong(2), foldername.getLong(3));
        foldername.close();
        e1.a();
        return foldercounts;
        foldername.close();
        e1.a();
        return null;
        Exception exception;
        exception;
        foldername.close();
        e1.a();
        throw exception;
    }

    private LinkedHashMap b(FolderName foldername, long l1, int i)
    {
        z z1;
        LinkedHashMap linkedhashmap;
        Set set = null;
        if (foldername.equals(FolderName.d))
        {
            set = a();
        }
        linkedhashmap = ik.b();
        z1 = (z)f.b();
        z1.a(foldername, l1, set, Integer.toString(i));
_L1:
        foldername = z1.a();
        if (foldername == null)
        {
            break MISSING_BLOCK_LABEL_84;
        }
        linkedhashmap.put(foldername.a(), foldername);
          goto _L1
        foldername;
        z1.b();
        throw foldername;
        z1.b();
        return linkedhashmap;
    }

    private void b(LinkedHashMap linkedhashmap)
    {
        Object obj;
        long l1 = System.currentTimeMillis();
        f f1 = com.facebook.d.d.e.a(new j[] {
            com.facebook.d.d.e.a((new StringBuilder()).append("thread_id IN ").append(com.facebook.common.w.k.b(linkedhashmap.keySet())).toString()), com.facebook.d.d.e.a("msg_type", Integer.toString(901)), com.facebook.d.d.e.c("timestamp_ms", Long.toString(l1 - 0x5265c00L))
        });
        obj = a.e();
        String s1 = f1.a();
        String as[] = f1.b();
        obj = ((SQLiteDatabase) (obj)).query(true, "messages", new String[] {
            "thread_id"
        }, s1, as, "thread_id", null, null, null);
        while (((Cursor) (obj)).moveToNext()) 
        {
            ((v)linkedhashmap.get(((Cursor) (obj)).getString(0))).e(true);
        }
        break MISSING_BLOCK_LABEL_166;
        linkedhashmap;
        ((Cursor) (obj)).close();
        throw linkedhashmap;
        ((Cursor) (obj)).close();
        return;
    }

    private void c(LinkedHashMap linkedhashmap)
    {
        Object obj;
        f f1 = com.facebook.d.d.e.a(new j[] {
            com.facebook.d.d.e.a((new StringBuilder()).append("thread_id IN ").append(com.facebook.common.w.k.b(linkedhashmap.keySet())).toString())
        });
        obj = a.e();
        String s1 = f1.a();
        String as[] = f1.b();
        obj = ((SQLiteDatabase) (obj)).query(true, "unread_mms_sms_threads", new String[] {
            "thread_id"
        }, s1, as, "thread_id", null, null, null);
        while (((Cursor) (obj)).moveToNext()) 
        {
            ((v)linkedhashmap.get(((Cursor) (obj)).getString(0))).b(true);
        }
        break MISSING_BLOCK_LABEL_128;
        linkedhashmap;
        ((Cursor) (obj)).close();
        throw linkedhashmap;
        ((Cursor) (obj)).close();
        return;
    }

    long a(FolderName foldername)
    {
        foldername = a.e().rawQuery("SELECT MIN(timestamp_ms) FROM folders WHERE folder=?", new String[] {
            foldername.b()
        });
        long l1;
        if (!foldername.moveToNext())
        {
            break MISSING_BLOCK_LABEL_50;
        }
        l1 = foldername.getLong(0);
        foldername.close();
        return l1;
        foldername.close();
        return -1L;
        Exception exception;
        exception;
        foldername.close();
        throw exception;
    }

    FetchMoreThreadsResult a(FetchMoreThreadsParams fetchmorethreadsparams)
    {
        FolderName foldername = fetchmorethreadsparams.a();
        long l1 = c.a(com.facebook.orca.g.s.a(foldername), -1L);
        Object obj = a(foldername, fetchmorethreadsparams.b(), fetchmorethreadsparams.c());
        boolean flag = false;
        String s1 = com.facebook.orca.g.l.a(foldername);
        if (((LinkedHashMap) (obj)).containsKey(s1))
        {
            flag = true;
            ((LinkedHashMap) (obj)).remove(s1);
        }
        fetchmorethreadsparams = new ThreadsCollection(a(((LinkedHashMap) (obj)).values(), fetchmorethreadsparams.c()), flag);
        obj = a(((LinkedHashMap) (obj)));
        obj = b.a(((Collection) (obj)));
        return new FetchMoreThreadsResult(b.FROM_CACHE_UP_TO_DATE, foldername, fetchmorethreadsparams, ((es) (obj)), l1);
    }

    FetchThreadListResult a(FetchThreadListParams fetchthreadlistparams)
    {
        e e1;
        boolean flag;
        flag = true;
        e1 = com.facebook.debug.d.e.a("DbFetchThreadsHandler.fetchThreadListFromDb");
        FolderName foldername;
        long l1;
        long l2;
        boolean flag1;
        foldername = fetchthreadlistparams.b();
        l1 = c.a(com.facebook.orca.g.s.a(foldername), -1L);
        flag1 = c.a(s.c(foldername), true);
        l2 = c.a(com.facebook.orca.g.s.b(foldername), -1L);
        if (l1 != -1L)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        fetchthreadlistparams = FetchThreadListResult.a(foldername);
        e1.a();
        return fetchthreadlistparams;
        if (!flag1) goto _L2; else goto _L1
_L1:
        b b1 = b.FROM_CACHE_STALE;
_L3:
        Object obj;
        Object obj1;
        obj1 = a(fetchthreadlistparams.b(), -1L, fetchthreadlistparams.d() + 1);
        obj = a(((LinkedHashMap) (obj1)));
        obj = b.a(((Collection) (obj)));
        String s1 = com.facebook.orca.g.l.a(foldername);
        if (!((LinkedHashMap) (obj1)).containsKey(s1))
        {
            break MISSING_BLOCK_LABEL_285;
        }
        ((LinkedHashMap) (obj1)).remove(s1);
_L4:
        obj1 = a(((LinkedHashMap) (obj1)).values(), fetchthreadlistparams.d());
        ThreadsCollection threadscollection = new ThreadsCollection(((es) (obj1)), flag);
        fetchthreadlistparams = b(fetchthreadlistparams.b());
        if (!((es) (obj1)).isEmpty())
        {
            g.a(((ThreadSummary)((es) (obj1)).get(0)).l());
        }
        fetchthreadlistparams = FetchThreadListResult.newBuilder().a(b1).a(foldername).a(threadscollection).a(((es) (obj))).a(fetchthreadlistparams).a(l1).b(l2).o();
        e1.a();
        return fetchthreadlistparams;
_L2:
        b1 = b.FROM_CACHE_UP_TO_DATE;
          goto _L3
        fetchthreadlistparams;
        e1.a();
        throw fetchthreadlistparams;
        flag = false;
          goto _L4
    }

}
