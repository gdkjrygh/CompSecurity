// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.content.Context;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.Operation;
import com.fitbit.data.repo.aj;
import com.fitbit.data.repo.ao;
import com.fitbit.e.a;
import com.fitbit.home.ui.g;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            aq, dg, dy

public class l
{

    public l()
    {
    }

    private static Entity a(Entity entity, ao ao1, boolean flag)
    {
        entity.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE);
        Entity entity1 = ao1.getById(entity.getEntityId().longValue());
        if (entity1 != null)
        {
            entity1.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE);
            if (!flag)
            {
                entity1.setServerId(-1L);
            }
            ao1.save(entity1);
            a(entity1, (new StringBuilder()).append("Set PENDING_DELETE: ").append(ao1.getName()).toString());
            com.fitbit.data.bl.aq.a().w().add(new Operation(entity.getEntityId().longValue(), ao1.getName(), com.fitbit.data.domain.Operation.OperationType.DELETE));
            a(entity, "Added pending DELETE operation");
            return entity1;
        } else
        {
            a(entity, "Set PENDING_DELETE failed (cannot find in repo)");
            return entity1;
        }
    }

    private static ao a(Class class1)
    {
        return com.fitbit.data.bl.aq.a().a(class1);
    }

    public static Collection a(List list, Context context)
    {
        Object obj;
        if (list == null || list.isEmpty())
        {
            obj = null;
        } else
        {
            obj = (Entity)list.get(0);
        }
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = a(obj.getClass());
        }
        return a(list, ((ao) (obj)), context);
    }

    public static Collection a(List list, ao ao1, Context context)
    {
        List list1 = Collections.emptyList();
        Object obj = list1;
        if (list != null)
        {
            obj = list1;
            if (!list.isEmpty())
            {
                Date date = new Date();
                obj = new LinkedList();
                list = list.iterator();
                do
                {
                    if (!list.hasNext())
                    {
                        break;
                    }
                    Entity entity = (Entity)list.next();
                    entity.setTimeUpdated(date);
                    entity = a(entity, ao1, true);
                    if (entity != null)
                    {
                        ((Collection) (obj)).add(entity);
                    }
                } while (true);
                a(context);
            }
        }
        return ((Collection) (obj));
    }

    public static void a(Context context)
    {
        if (dg.d().e())
        {
            com.fitbit.e.a.a("CommonEntityOperations", "Sync is in progress... skipping the sync request", new Object[0]);
            return;
        } else
        {
            context.startService(com.fitbit.data.bl.dy.a(context, true));
            return;
        }
    }

    public static void a(Context context, g g1)
    {
        if (g1 == null)
        {
            a(context);
            return;
        }
        if (dg.d().e())
        {
            com.fitbit.e.a.a("CommonEntityOperations", "Sync is in progress... skipping the sync request", new Object[0]);
            return;
        } else
        {
            g1.a(com.fitbit.data.bl.dy.a(context, true));
            return;
        }
    }

    public static void a(Entity entity)
    {
        a(entity, a(entity.getClass()));
    }

    public static void a(Entity entity, Context context)
    {
        a(entity, a(entity.getClass()), context);
    }

    public static void a(Entity entity, ao ao1)
    {
        entity.setTimeUpdated(new Date());
        if (entity.isNew())
        {
            c(entity, ao1);
            return;
        } else
        {
            d(entity, ao1);
            return;
        }
    }

    public static void a(Entity entity, ao ao1, Context context)
    {
        a(entity, ao1);
        a(context);
    }

    public static void a(Entity entity, ao ao1, Context context, g g1)
    {
        a(entity, ao1);
        a(context, g1);
    }

    private static void a(Entity entity, String s)
    {
        com.fitbit.e.a.a("SyncManager", "%s for entity: %s", new Object[] {
            s, entity
        });
    }

    public static void b(Entity entity)
    {
        b(entity, a(entity.getClass()));
    }

    public static void b(Entity entity, ao ao1)
    {
        entity.setTimeUpdated(new Date());
        if (entity.isNew())
        {
            c(entity, ao1);
            return;
        } else
        {
            e(entity, ao1);
            return;
        }
    }

    public static void b(List list, Context context)
    {
        Object obj1 = null;
        Object obj;
        if (list == null || list.isEmpty())
        {
            obj = null;
        } else
        {
            obj = (Entity)list.get(0);
        }
        if (obj == null)
        {
            obj = obj1;
        } else
        {
            obj = a(obj.getClass());
        }
        if (list != null && !list.isEmpty())
        {
            for (list = list.iterator(); list.hasNext(); a((Entity)list.next(), ((ao) (obj)), false)) { }
            a(context);
        }
    }

    private static void c(Entity entity, ao ao1)
    {
        entity.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION);
        ao1.add(entity);
        a(entity, (new StringBuilder()).append("Set PENDING_OPERATION: ").append(ao1.getName()).toString());
        com.fitbit.data.bl.aq.a().w().add(new Operation(entity.getEntityId().longValue(), ao1.getName(), com.fitbit.data.domain.Operation.OperationType.CREATE));
        a(entity, "Added pending CREATE operation");
    }

    private static void d(Entity entity, ao ao1)
    {
        entity.setEntityStatus(com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION);
        Object obj = ao1.getById(entity.getEntityId().longValue());
        if (obj == null)
        {
            entity.setEntityId(null);
            ao1.add(entity);
            obj = new Operation(entity.getEntityId().longValue(), ao1.getName(), com.fitbit.data.domain.Operation.OperationType.CREATE);
        } else
        {
            entity.setServerId(((Entity) (obj)).getServerId());
            ao1.save(entity);
            obj = new Operation(entity.getEntityId().longValue(), ao1.getName(), com.fitbit.data.domain.Operation.OperationType.UPDATE);
        }
        a(entity, (new StringBuilder()).append("Set PENDING_OPERATION: ").append(ao1.getName()).toString());
        com.fitbit.data.bl.aq.a().w().add(((Operation) (obj)));
        if (((Operation) (obj)).a() == com.fitbit.data.domain.Operation.OperationType.CREATE)
        {
            ao1 = "Added pending CREATE operation";
        } else
        {
            ao1 = "Added pending UPDATE operation";
        }
        a(entity, ao1);
    }

    private static void e(Entity entity, ao ao1)
    {
        Object obj = ao1.getById(entity.getEntityId().longValue());
        if (obj == null)
        {
            entity.setEntityId(null);
            ao1.add(entity);
            obj = new Operation(entity.getEntityId().longValue(), ao1.getName(), com.fitbit.data.domain.Operation.OperationType.CREATE);
        } else
        {
            entity.setServerId(((Entity) (obj)).getServerId());
            ao1.save(entity);
            obj = new Operation(entity.getEntityId().longValue(), ao1.getName(), com.fitbit.data.domain.Operation.OperationType.UPDATE);
        }
        a(entity, (new StringBuilder()).append("Set PENDING_OPERATION: ").append(ao1.getName()).toString());
        com.fitbit.data.bl.aq.a().w().add(((Operation) (obj)));
        if (((Operation) (obj)).a() == com.fitbit.data.domain.Operation.OperationType.CREATE)
        {
            ao1 = "Added pending CREATE operation";
        } else
        {
            ao1 = "Added pending UPDATE operation";
        }
        a(entity, ao1);
    }
}
