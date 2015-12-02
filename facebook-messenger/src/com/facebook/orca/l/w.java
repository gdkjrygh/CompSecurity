// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.l;

import com.facebook.fbservice.c.b;
import com.facebook.orca.server.FetchMoreMessagesResult;
import com.facebook.orca.server.FetchThreadResult;
import com.facebook.orca.threads.FolderCounts;
import com.facebook.orca.threads.FolderName;
import com.facebook.orca.threads.MessagesCollection;
import com.facebook.orca.threads.ThreadSummary;
import com.facebook.orca.threads.ThreadsCollection;
import com.facebook.orca.threads.v;
import com.facebook.user.UserKey;
import com.google.common.a.ax;
import com.google.common.a.es;
import com.google.common.a.et;
import com.google.common.a.ev;
import com.google.common.a.ew;
import com.google.common.a.gg;
import com.google.common.a.hq;
import com.google.common.a.iw;
import com.google.common.a.jr;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.facebook.orca.l:
//            af, ac, ah, ag, 
//            ad, y, aj, ai, 
//            ae, z, x, aa, 
//            ab

public class w
{

    public w()
    {
    }

    public static FetchMoreMessagesResult a(int i, FetchMoreMessagesResult fetchmoremessagesresult, Collection collection)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(fetchmoremessagesresult);
        arraylist.addAll(collection);
        collection = a(fetchmoremessagesresult.a().a(), i, a(((Function) (new af(null))), ((Collection) (arraylist))));
        long l = g(a(((Function) (new ac(null))), ((Collection) (arraylist))));
        return new FetchMoreMessagesResult(fetchmoremessagesresult.e(), collection, l);
    }

    public static FetchThreadResult a(int i, FetchThreadResult fetchthreadresult, Collection collection)
    {
        java.util.ArrayList arraylist = hq.a();
        arraylist.add(fetchthreadresult);
        arraylist.addAll(collection);
        collection = a(fetchthreadresult.a(), a(((Function) (new ah(null))), collection));
        MessagesCollection messagescollection = a(fetchthreadresult.a().a(), i, a(((Function) (new ag(null))), ((Collection) (arraylist))));
        long l = g(a(((Function) (new ad(null))), ((Collection) (arraylist))));
        return new FetchThreadResult(fetchthreadresult.e(), collection, messagescollection, fetchthreadresult.c(), fetchthreadresult.d(), l);
    }

    public static MessagesCollection a(String s, int i, Collection collection)
    {
        boolean flag = false;
        Object obj = ax.a(collection, new y());
        Iterator iterator = ((Collection) (obj)).iterator();
        int j;
        for (j = 0; iterator.hasNext(); j = ((Collection)iterator.next()).size() + j) { }
        obj = a(i, ((Comparator) (new aj())), ((Collection) (obj)));
        if (((es) (obj)).size() == j)
        {
            flag = b(collection);
        }
        return new MessagesCollection(s, ((es) (obj)), flag);
    }

    public static ThreadSummary a(ThreadSummary threadsummary, Collection collection)
    {
        boolean flag;
        if (threadsummary.y() == FolderName.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag);
        Preconditions.checkArgument(threadsummary.h());
        if (collection == null || collection.isEmpty())
        {
            return threadsummary;
        }
        Object obj = collection.iterator();
        while (((Iterator) (obj)).hasNext()) 
        {
            ThreadSummary threadsummary1 = (ThreadSummary)((Iterator) (obj)).next();
            boolean flag1;
            if (threadsummary1.y() == FolderName.d)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            Preconditions.checkArgument(flag1);
            Preconditions.checkArgument(threadsummary1.h());
        }
        Iterator iterator = collection.iterator();
        obj = threadsummary;
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            ThreadSummary threadsummary2 = (ThreadSummary)iterator.next();
            if (((ThreadSummary) (obj)).c() < threadsummary2.c())
            {
                obj = threadsummary2;
            }
        } while (true);
        v v1 = new v();
        v1.a(threadsummary).a(FolderName.e);
        if (threadsummary != obj)
        {
            v1.c(((ThreadSummary) (obj)).c()).a(((ThreadSummary) (obj)).d()).b(((ThreadSummary) (obj)).e()).d(((ThreadSummary) (obj)).l()).d(((ThreadSummary) (obj)).n()).a(((ThreadSummary) (obj)).p()).e(((ThreadSummary) (obj)).o());
        }
        obj = hq.a();
        ((List) (obj)).add(threadsummary);
        ((List) (obj)).addAll(collection);
        v1.b(b(new ai(null), ((Collection) (obj)))).e(b(new ae(null), ((Collection) (obj)))).e(es.a(collection)).z();
        return v1.z();
    }

    public static ThreadsCollection a(int i, Collection collection)
    {
        boolean flag = false;
        Object obj = ax.a(collection, new z());
        Iterator iterator = ((Collection) (obj)).iterator();
        int j;
        for (j = 0; iterator.hasNext(); j = ((Collection)iterator.next()).size() + j) { }
        obj = a(i, ((Comparator) (new com.facebook.orca.threads.w())), ((Collection) (obj)));
        if (((es) (obj)).size() == j)
        {
            flag = c(collection);
        }
        return new ThreadsCollection(((es) (obj)), flag);
    }

    public static es a(int i, Comparator comparator, Collection collection)
    {
        comparator = new x(comparator);
        java.util.ArrayList arraylist = hq.a();
        collection = collection.iterator();
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            jr jr1 = gg.g(((Collection)collection.next()).iterator());
            if (jr1.hasNext())
            {
                arraylist.add(jr1);
            }
        } while (true);
        Collections.sort(arraylist, comparator);
        collection = es.e();
        int j = 0;
        do
        {
            if (arraylist.size() <= 0 || !((jr)arraylist.get(0)).hasNext() || j >= i)
            {
                break;
            }
            jr jr2 = (jr)arraylist.remove(0);
            collection.b(jr2.next());
            int k = j + 1;
            j = k;
            if (jr2.hasNext())
            {
                j = Collections.binarySearch(arraylist, jr2, comparator);
                if (j < 0)
                {
                    arraylist.add(-j - 1, jr2);
                    j = k;
                } else
                {
                    arraylist.add(j, jr2);
                    j = k;
                }
            }
        } while (true);
        return collection.b();
    }

    public static es a(Collection collection)
    {
        Object obj = null;
        int i = 0;
        Iterator iterator = collection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Collection collection1 = (Collection)iterator.next();
            if (collection1 != null && collection1.size() > 0)
            {
                obj = collection1;
                i++;
            }
        } while (true);
        if (i == 0)
        {
            return es.d();
        }
        if (i == 1)
        {
            return es.a(((Collection) (obj)));
        }
        obj = es.e();
        for (collection = collection.iterator(); collection.hasNext(); ((et) (obj)).b((Collection)collection.next())) { }
        return ((et) (obj)).b();
    }

    public static es a(Comparator comparator, Collection collection)
    {
        return a(0x7fffffff, comparator, collection);
    }

    public static transient es a(Collection acollection[])
    {
        return a(((Collection) (Arrays.asList(acollection))));
    }

    public static ev a(Map map, iw iw1)
    {
        ew ew1 = ev.k();
        Iterator iterator = iw1.g().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            Object obj = (UserKey)iterator.next();
            ThreadSummary threadsummary = (ThreadSummary)map.get(obj);
            if (threadsummary != null)
            {
                Object obj1 = iw1.c(obj);
                java.util.ArrayList arraylist = hq.a();
                obj1 = ((Collection) (obj1)).iterator();
                do
                {
                    if (!((Iterator) (obj1)).hasNext())
                    {
                        break;
                    }
                    ThreadSummary threadsummary1 = (ThreadSummary)map.get((UserKey)((Iterator) (obj1)).next());
                    if (threadsummary1 != null)
                    {
                        arraylist.add(threadsummary1);
                    }
                } while (true);
                if (!arraylist.isEmpty())
                {
                    threadsummary = a(threadsummary, ((Collection) (arraylist)));
                    ew1.b(obj, threadsummary);
                    obj = arraylist.iterator();
                    while (((Iterator) (obj)).hasNext()) 
                    {
                        ew1.b(((ThreadSummary)((Iterator) (obj)).next()).i(), threadsummary);
                    }
                }
            }
        } while (true);
        return ew1.b();
    }

    private static Collection a(Function function, Collection collection)
    {
        return ax.a(collection, new aa(function));
    }

    private static boolean b(Function function, Collection collection)
    {
        return f(ax.a(collection, new ab(function)));
    }

    static boolean b(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!((MessagesCollection)collection.next()).d())
            {
                return false;
            }
        }

        return true;
    }

    public static boolean c(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (!((ThreadsCollection)collection.next()).c())
            {
                return false;
            }
        }

        return true;
    }

    public static b d(Collection collection)
    {
        Object obj = b.FROM_SERVER;
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) 
        {
            collection = (b)iterator.next();
            if (collection == b.NO_DATA)
            {
                collection = b.NO_DATA;
            } else
            if (collection == b.FROM_CACHE_INCOMPLETE && obj != b.NO_DATA)
            {
                collection = b.FROM_CACHE_INCOMPLETE;
            } else
            if (collection == b.FROM_CACHE_STALE && obj != b.NO_DATA && obj != b.FROM_CACHE_INCOMPLETE)
            {
                collection = b.FROM_CACHE_STALE;
            } else
            if (obj != b.FROM_SERVER)
            {
                collection = ((Collection) (obj));
            }
            obj = collection;
        }
        return ((b) (obj));
    }

    public static FolderCounts e(Collection collection)
    {
        int i = 0;
        long l1 = 0x7fffffffffffffffL;
        long l = 0x8000000000000000L;
        collection = collection.iterator();
        int j = 0;
        do
        {
            if (!collection.hasNext())
            {
                break;
            }
            FolderCounts foldercounts = (FolderCounts)collection.next();
            if (foldercounts != null)
            {
                j += foldercounts.a();
                i += foldercounts.b();
                l1 = Math.min(l1, foldercounts.c());
                l = Math.max(l, foldercounts.d());
            }
        } while (true);
        return new FolderCounts(j, i, l1, l);
    }

    public static boolean f(Collection collection)
    {
        for (collection = collection.iterator(); collection.hasNext();)
        {
            if (((Boolean)collection.next()).booleanValue())
            {
                return true;
            }
        }

        return false;
    }

    public static long g(Collection collection)
    {
        collection = collection.iterator();
        long l;
        for (l = 0x8000000000000000L; collection.hasNext(); l = Math.max(l, ((Long)collection.next()).longValue())) { }
        return l;
    }
}
