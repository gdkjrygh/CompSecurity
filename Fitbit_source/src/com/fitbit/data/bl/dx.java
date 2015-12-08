// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Intent;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Pair;
import com.fitbit.FitBitApplication;
import com.fitbit.data.bl.a.a;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Operation;
import com.fitbit.data.repo.aj;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            e, dz, dq, ec, 
//            dp, eb, dt, du, 
//            ds, dn, ea, do, 
//            dv, dr, ai, dw, 
//            c, bs, aq

public class dx extends e
{

    public static final String a = "com.fitbit.data.bl.SyncPendingObjectsOperation.BROADCAST_ACTION";
    public static final ReentrantReadWriteLock b = new ReentrantReadWriteLock();
    private static final String d = "SyncPendingObjectsOperation";
    private static final String e = "SyncPendingObjectsOperation";
    private List f;
    private List g;
    private boolean h;
    private String i;

    public dx(bs bs1, boolean flag, Object obj)
    {
        this(bs1, flag, obj, true);
        b();
    }

    public dx(bs bs1, boolean flag, Object obj, boolean flag1)
    {
        super(bs1, flag);
        i = "SyncPendingObjectsOperation";
        h = flag1;
        f = new ArrayList();
        f.add(new dz(bs1));
        f.add(new dq(bs1));
        f.add(new ec(bs1));
        f.add(new dp(bs1));
        f.add(new eb(bs1));
        f.add(new dt(bs1));
        f.add(new du(bs1));
        f.add(new ds(bs1));
        f.add(new dn(bs1));
        f.add(new ea(bs1));
        f.add(new do(e()));
        f.add(new dv(e()));
        f.add(new dr(e()));
        g = new ArrayList();
        b();
    }

    public transient dx(bs bs1, boolean flag, Object obj, boolean flag1, dw adw[])
    {
        super(bs1, flag);
        i = "SyncPendingObjectsOperation";
        h = flag1;
        f = new ArrayList();
        if (f != null)
        {
            int k = adw.length;
            for (int j = 0; j < k; j++)
            {
                bs1 = adw[j];
                f.add(bs1);
            }

        }
        g = new ArrayList();
        b();
    }

    private void a(List list)
    {
        Operation operation;
        for (list = list.iterator(); list.hasNext(); operation.b(false))
        {
            operation = (Operation)list.next();
            operation.a(false);
        }

    }

    private transient void a(a aa[])
    {
        int j;
        int k;
        k = aa.length;
        j = 0;
_L2:
        a a1;
        boolean flag;
        if (j >= k)
        {
            break; /* Loop/switch isn't completed */
        }
        a1 = aa[j];
        Iterator iterator = g.iterator();
        a a2;
        do
        {
            if (!iterator.hasNext())
            {
                break MISSING_BLOCK_LABEL_150;
            }
            a2 = (a)iterator.next();
        } while (a2.c() == null || !a2.c().equals(a1.c()));
        flag = true;
_L3:
        if (!flag)
        {
            com.fitbit.e.a.a("SyncPendingObjectsOperation", "Adding after syncPendings: %s", new Object[] {
                a1.c()
            });
            g.add(a1);
        } else
        {
            com.fitbit.e.a.a("SyncPendingObjectsOperation", "Operation already added after syncPendings: %s", new Object[] {
                a1.c()
            });
        }
        j++;
        if (true) goto _L2; else goto _L1
_L1:
        return;
        flag = false;
          goto _L3
    }

    private boolean a(ai ai1)
    {
        ai1 = ai1.b().values().iterator();
_L12:
        if (!ai1.hasNext()) goto _L2; else goto _L1
_L1:
        Iterator iterator = ((Map)ai1.next()).entrySet().iterator();
_L10:
        Iterator iterator1;
        if (!iterator.hasNext())
        {
            continue; /* Loop/switch isn't completed */
        }
        iterator1 = ((List)((java.util.Map.Entry)iterator.next()).getValue()).iterator();
_L6:
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((Operation)iterator1.next()).d()) goto _L6; else goto _L5
_L5:
        boolean flag = true;
_L8:
        if (!flag)
        {
            return true;
        }
        break; /* Loop/switch isn't completed */
_L2:
        return false;
_L4:
        flag = false;
        if (true) goto _L8; else goto _L7
_L7:
        if (true) goto _L10; else goto _L9
_L9:
        if (true) goto _L12; else goto _L11
_L11:
    }

    private void b()
    {
        if (f != null)
        {
            StringBuilder stringbuilder = new StringBuilder();
            dw dw1;
            for (Iterator iterator = f.iterator(); iterator.hasNext(); stringbuilder.append((new StringBuilder()).append("[").append(dw1.c()).append("]").toString()))
            {
                dw1 = (dw)iterator.next();
            }

            i = (new StringBuilder()).append(i).append(": ").append(stringbuilder.toString()).toString();
        }
    }

    private boolean b(ai ai1)
    {
        ai1 = ai1.b().values().iterator();
_L2:
        Iterator iterator;
        if (!ai1.hasNext())
        {
            break MISSING_BLOCK_LABEL_102;
        }
        iterator = ((Map)ai1.next()).entrySet().iterator();
_L4:
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        Iterator iterator1 = ((List)((java.util.Map.Entry)iterator.next()).getValue()).iterator();
_L6:
        if (!iterator1.hasNext()) goto _L4; else goto _L3
_L3:
        if (!((Operation)iterator1.next()).f()) goto _L6; else goto _L5
_L5:
        return true;
        return false;
    }

    private Pair c(ai ai1)
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        for (ai1 = ai1.b().values().iterator(); ai1.hasNext();)
        {
            Iterator iterator = ((Map)ai1.next()).entrySet().iterator();
            while (iterator.hasNext()) 
            {
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                Iterator iterator1 = ((List)entry.getValue()).iterator();
                boolean flag = false;
                boolean flag1 = false;
                do
                {
                    if (!iterator1.hasNext())
                    {
                        break;
                    }
                    Operation operation = (Operation)iterator1.next();
                    if (operation.d())
                    {
                        flag1 = true;
                    }
                    if (operation.f())
                    {
                        flag = true;
                    }
                } while (true);
                if (!flag1 && flag)
                {
                    arraylist.addAll((Collection)entry.getValue());
                } else
                {
                    arraylist1.addAll((Collection)entry.getValue());
                }
            }
        }

        return new Pair(arraylist, arraylist1);
    }

    private void c(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        if (!a1.a())
        {
            _cls1 _lcls1 = new _cls1(e(), true);
            a a2;
            for (Iterator iterator = g.iterator(); iterator.hasNext(); _lcls1.a(a2))
            {
                a2 = (a)iterator.next();
                com.fitbit.e.a.a("SyncPendingObjectsOperation", "Processing after syncPendings: %s", new Object[] {
                    a2.c()
                });
            }

            _lcls1.b(a1);
        }
    }

    protected java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock a()
    {
        return null;
    }

    protected void a(h.a a1)
        throws ServerCommunicationException, JSONException
    {
        Object obj;
        Object obj1;
        boolean flag;
        boolean flag2;
        if (h)
        {
            e().a(true);
        } else
        {
            e().b(true);
        }
        i().lock();
        obj1 = com.fitbit.data.bl.aq.a().w();
        obj = ((aj) (obj1)).getAllOperationsWithCreationOrder();
        a(((List) (obj)));
        com.fitbit.e.a.a("SyncManager", "Processing pending entries: %s", new Object[] {
            Integer.valueOf(((List) (obj)).size())
        });
        flag = false;
_L11:
        if (((List) (obj)).isEmpty()) goto _L2; else goto _L1
_L1:
        flag2 = a1.a();
        if (!flag2) goto _L3; else goto _L2
_L2:
        i().unlock();
        c(a1);
        if (flag)
        {
            LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncPendingObjectsOperation.BROADCAST_ACTION"));
        }
        ai ai1;
        Object obj2;
        Exception exception;
        Object obj3;
        Object obj4;
        boolean flag1;
        boolean flag3;
        if (h)
        {
            e().a(false);
            return;
        } else
        {
            e().b(false);
            return;
        }
_L3:
        ai1 = new ai(((List) (obj)));
        ((aj) (obj1)).deleteAll(ai1.a());
        if (a(ai1)) goto _L5; else goto _L4
_L4:
        com.fitbit.e.a.a("SyncManager", "Operation list contains only entries with failed operations, breaking", new Object[0]);
          goto _L2
        a1;
_L17:
        i().unlock();
        throw a1;
        a1;
_L20:
        if (flag)
        {
            LocalBroadcastManager.getInstance(FitBitApplication.a()).sendBroadcast(new Intent("com.fitbit.data.bl.SyncPendingObjectsOperation.BROADCAST_ACTION"));
        }
        if (h)
        {
            e().a(false);
        } else
        {
            e().b(false);
        }
        throw a1;
        a1;
        obj1 = new ArrayList();
        for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); ((List) (obj1)).add(((Operation)((Iterator) (obj)).next()).toString())) { }
        com.fitbit.e.a.a("SyncManager", "Operations merge failed for : %s", new Object[] {
            obj1
        });
        throw a1;
_L5:
        obj2 = f.iterator();
_L12:
        if (!((Iterator) (obj2)).hasNext()) goto _L7; else goto _L6
_L6:
        obj3 = (dw)((Iterator) (obj2)).next();
        com.fitbit.e.a.a("SyncManager", "Processing: %s", new Object[] {
            obj3.toString()
        });
        flag3 = a1.a();
        if (!flag3) goto _L8; else goto _L7
_L7:
        obj3 = c(ai1);
        obj2 = (List)((Pair) (obj3)).first;
        obj3 = (List)((Pair) (obj3)).second;
        ((aj) (obj1)).deleteAll(((List) (obj2)));
        ((aj) (obj1)).saveAll(((List) (obj3)));
        flag3 = b(ai1);
        if (!flag3) goto _L10; else goto _L9
_L9:
        if (a1.a())
        {
            break MISSING_BLOCK_LABEL_777;
        }
        obj = ((aj) (obj1)).getAllOperationsWithCreationOrder();
        com.fitbit.e.a.a("SyncManager", "Requery pending entries: %s", new Object[] {
            Integer.valueOf(((List) (obj)).size())
        });
        flag = true;
_L18:
        flag1 = flag;
        com.fitbit.e.a.a("SyncManager", "Finished processing of pending entries, cancelled = %s", new Object[] {
            Boolean.valueOf(a1.a())
        });
          goto _L11
_L8:
        a(((dw) (obj3)).a(ai1));
          goto _L12
        exception;
        obj4 = c(ai1);
        obj3 = (List)((Pair) (obj4)).first;
        obj4 = (List)((Pair) (obj4)).second;
        ((aj) (obj1)).deleteAll(((List) (obj3)));
        ((aj) (obj1)).saveAll(((List) (obj4)));
        flag3 = b(ai1);
        if (!flag3) goto _L14; else goto _L13
_L13:
        if (a1.a()) goto _L16; else goto _L15
_L15:
        com.fitbit.e.a.a("SyncManager", "Requery pending entries: %s", new Object[] {
            Integer.valueOf(((aj) (obj1)).getAllOperationsWithCreationOrder().size())
        });
        flag = true;
_L19:
        flag1 = flag;
        com.fitbit.e.a.a("SyncManager", "Finished processing of pending entries, cancelled = %s", new Object[] {
            Boolean.valueOf(a1.a())
        });
        flag1 = flag;
        throw exception;
        a1;
        flag = flag1;
          goto _L17
_L10:
        ((List) (obj)).clear();
        com.fitbit.e.a.a("SyncManager", "Operation list contains only unprocessed operations, finishing", new Object[0]);
          goto _L18
_L14:
        ((List) (obj)).clear();
        com.fitbit.e.a.a("SyncManager", "Operation list contains only unprocessed operations, finishing", new Object[0]);
          goto _L19
        a1;
          goto _L20
        a1;
        flag = false;
          goto _L17
        a1;
        flag = true;
          goto _L17
_L16:
        flag = true;
          goto _L19
        flag = true;
          goto _L18
    }

    protected boolean a(h.a a1, boolean flag)
        throws ServerCommunicationException, JSONException
    {
        return super.a(a1, flag);
    }

    public String c()
    {
        return i;
    }


    /* member class not found */
    class _cls1 {}

}
