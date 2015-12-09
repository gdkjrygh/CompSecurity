// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.NetworkTimeoutException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.Operation;
import com.fitbit.data.repo.aj;
import com.fitbit.data.repo.ao;
import com.fitbit.e.a;
import com.fitbit.mixpanel.f;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            aq, bs, ai

public abstract class dw
{

    private static final String a = "SyncPendingObjectOperation";
    protected boolean b;
    private bs c;

    public dw(bs bs)
    {
        c = bs;
    }

    private static void a(Iterator iterator, Iterator iterator1)
    {
        for (; iterator.hasNext(); ((Operation)iterator.next()).a(true)) { }
        while (iterator1.hasNext()) 
        {
            iterator = ((List)((java.util.Map.Entry)iterator1.next()).getValue()).iterator();
            while (iterator.hasNext()) 
            {
                ((Operation)iterator.next()).a(true);
            }
        }
    }

    private static void a(Map map, boolean flag)
    {
        for (map = map.values().iterator(); map.hasNext();)
        {
            Iterator iterator = ((List)map.next()).iterator();
            while (iterator.hasNext()) 
            {
                ((Operation)iterator.next()).b(flag);
            }
        }

    }

    protected void a(com.fitbit.data.domain.Operation.OperationType operationtype, String s)
    {
        if (com.fitbit.data.domain.Operation.OperationType.CREATE.equals(operationtype))
        {
            f.c(s);
        }
    }

    protected void a(Map map, ao ao1, a a1)
        throws NetworkTimeoutException, ServerCommunicationException
    {
        aj aj1 = com.fitbit.data.bl.aq.a().w();
        if (map != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Iterator iterator1;
        a(map, true);
        iterator1 = map.entrySet().iterator();
        map = null;
_L8:
        Entity entity;
        List list;
        while (iterator1.hasNext()) 
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator1.next();
            Long long1 = (Long)entry.getKey();
            list = (List)entry.getValue();
            entity = ao1.getById(long1.longValue());
            if (entity == null)
            {
                aj1.deleteAll(list);
            } else
            {
label0:
                {
                    Iterator iterator = list.iterator();
                    boolean flag = false;
                    do
                    {
                        if (!iterator.hasNext())
                        {
                            break;
                        }
                        flag = ((Operation)iterator.next()).d() | flag;
                    } while (!flag);
                    if (!flag)
                    {
                        break label0;
                    }
                    com.fitbit.e.a.a("SyncManager", "Operations contains error for entity %s", new Object[] {
                        entity
                    });
                }
            }
        }
        if (true) goto _L1; else goto _L3
_L3:
        Object obj;
        Iterator iterator2;
        boolean flag1;
        iterator2 = list.iterator();
        flag1 = false;
        obj = null;
_L4:
        Operation operation1;
        if (!iterator2.hasNext())
        {
            break MISSING_BLOCK_LABEL_275;
        }
        operation1 = (Operation)iterator2.next();
        com.fitbit.e.a.a("SyncManager", "Processing pending entity %s operation=%s", new Object[] {
            entity, operation1.a()
        });
    /* block-local class not found */
    class a {}

        a1.a(entity, operation1);
        operation1.a(false);
          goto _L4
        map;
        com.fitbit.e.a.e("SyncManager", map);
        operation1.a(true);
_L9:
        if (!flag1) goto _L6; else goto _L5
_L5:
        com.fitbit.e.a.a("SyncManager", "Error while sending update to the server for entity: %s", new Object[] {
            entity
        });
        if (obj == null) goto _L8; else goto _L7
_L7:
        obj = list.iterator();
        Operation operation;
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break MISSING_BLOCK_LABEL_650;
            }
            operation = (Operation)((Iterator) (obj)).next();
        } while (operation.d() || operation.a() != com.fitbit.data.domain.Operation.OperationType.CREATE);
        flag1 = true;
_L10:
        Object obj1;
        if (flag1)
        {
            ao1.delete(entity);
            com.fitbit.e.a.a("SyncManager", "Failed on creation. Removed from repository:%s", new Object[] {
                entity
            });
        } else
        {
            entity.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
            ao1.save(entity);
            com.fitbit.e.a.a("SyncManager", "Failed to update or delete. Set SYNCED for entry %s", new Object[] {
                entity
            });
        }
          goto _L8
        obj1;
label1:
        {
            com.fitbit.e.a.e("SyncManager", ((Throwable) (obj1)));
            if (!com.fitbit.data.bl.exceptions.ServerCommunicationException.ServerErrorType.a.equals(((ServerCommunicationException) (obj1)).f()) && ((ServerCommunicationException) (obj1)).e() != 400 && ((ServerCommunicationException) (obj1)).e() != 401 && ((ServerCommunicationException) (obj1)).e() != 403 && ((ServerCommunicationException) (obj1)).e() != 404)
            {
                break label1;
            }
            obj = obj1;
            flag1 = true;
        }
          goto _L4
        operation1.a(true);
        flag1 = true;
          goto _L9
        obj1;
        com.fitbit.e.a.e("SyncManager", ((Throwable) (obj1)));
        operation1.a(true);
        flag1 = true;
          goto _L9
_L6:
        if (map == null)
        {
            if (list.isEmpty() || ((Operation)list.get(list.size() - 1)).a() == com.fitbit.data.domain.Operation.OperationType.DELETE)
            {
                ao1.delete(entity);
                com.fitbit.e.a.a("SyncManager", "Removed from repository: %s", new Object[] {
                    entity
                });
            } else
            {
                entity.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.SYNCED);
                ao1.save(entity);
                com.fitbit.e.a.a("SyncManager", "Set SYNCED for entry %s", new Object[] {
                    entity
                });
            }
        } else
        {
            a(iterator2, iterator1);
            throw map;
        }
          goto _L8
        flag1 = false;
          goto _L10
    }

    public abstract com.fitbit.data.bl.a.a[] a(ai ai)
        throws ServerCommunicationException;

    protected transient com.fitbit.data.bl.a.a[] a(boolean flag, com.fitbit.data.bl.a.a aa[])
    {
        com.fitbit.data.bl.a.a aa1[];
label0:
        {
            if (!flag)
            {
                aa1 = aa;
                if (aa != null)
                {
                    break label0;
                }
            }
            aa1 = new com.fitbit.data.bl.a.a[0];
        }
        return aa1;
    }

    public bs b()
    {
        return c;
    }

    public String c()
    {
        return "SyncPendingObjectOperation";
    }
}
