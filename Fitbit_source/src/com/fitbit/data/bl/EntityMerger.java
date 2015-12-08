// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.os.SystemClock;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.repo.ao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EntityMerger
{
    public static final class MergeStatus extends Enum
    {

        public static final MergeStatus a;
        public static final MergeStatus b;
        public static final MergeStatus c;
        private static final MergeStatus d[];

        public static MergeStatus valueOf(String s)
        {
            return (MergeStatus)Enum.valueOf(com/fitbit/data/bl/EntityMerger$MergeStatus, s);
        }

        public static MergeStatus[] values()
        {
            return (MergeStatus[])d.clone();
        }

        static 
        {
            a = new MergeStatus("DATA_UPDATED", 0);
            b = new MergeStatus("DATA_ADDED", 1);
            c = new MergeStatus("DATA_DELETED", 2);
            d = (new MergeStatus[] {
                a, b, c
            });
        }

        private MergeStatus(String s, int j)
        {
            super(s, j);
        }
    }

    public static interface a
    {

        public abstract boolean a(Object obj);
    }

    public static interface b
    {

        public abstract boolean a(Object obj, Object obj1);
    }

    public static class c
        implements e
    {

        public Entity a(Entity entity, Entity entity1)
        {
            entity1.setEntityId(entity.getEntityId());
            static class _cls1
            {

                static final int a[];

                static 
                {
                    a = new int[com.fitbit.data.domain.Entity.EntityStatus.values().length];
                    try
                    {
                        a[com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.fitbit.data.domain.Entity.EntityStatus.PENDING_OPERATION.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls1.a[entity.getEntityStatus().ordinal()])
            {
            default:
                return entity1;

            case 1: // '\001'
            case 2: // '\002'
                entity.setServerId(entity1.getServerId());
                break;
            }
            return entity;
        }

        public volatile Object a(Object obj, Object obj1)
        {
            return a((Entity)obj, (Entity)obj1);
        }

        public c()
        {
        }
    }

    public static class d
        implements a
    {

        public boolean a(Entity entity)
        {
            return entity.getServerId() > 0L && entity.getEntityStatus() != com.fitbit.data.domain.Entity.EntityStatus.PENDING_DELETE;
        }

        public volatile boolean a(Object obj)
        {
            return a((Entity)obj);
        }

        public d()
        {
        }
    }

    public static interface e
    {

        public abstract Object a(Object obj, Object obj1);
    }

    private class f
        implements Runnable
    {

        final e a;
        final a b = new a(this);
        final EntityMerger c;

        public void run()
        {
            Object obj1;
            Object obj2;
            ArrayList arraylist;
            ArrayList arraylist1;
            Iterator iterator;
            long l;
            l = SystemClock.uptimeMillis();
            arraylist1 = new ArrayList(EntityMerger.b(c).a(EntityMerger.a(c)));
            obj2 = new ArrayList();
            obj1 = new ArrayList();
            arraylist = new ArrayList();
            iterator = EntityMerger.c(c).iterator();
_L2:
            Object obj;
            Entity entity1;
            if (!iterator.hasNext())
            {
                break; /* Loop/switch isn't completed */
            }
            entity1 = (Entity)iterator.next();
            Iterator iterator1 = arraylist1.iterator();
            do
            {
                if (!iterator1.hasNext())
                {
                    break MISSING_BLOCK_LABEL_487;
                }
                obj = (Entity)iterator1.next();
            } while (!EntityMerger.d(c).a(obj, entity1));
_L3:
            if (obj != null)
            {
                arraylist1.remove(obj);
                ((List) (obj2)).add((Entity)a.a(obj, entity1));
            } else
            {
                arraylist.add(entity1);
            }
            if (true) goto _L2; else goto _L1
_L1:
            obj = arraylist1.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Entity entity = (Entity)((Iterator) (obj)).next();
                if (EntityMerger.e(c).a(entity))
                {
                    ((List) (obj1)).add(entity);
                }
            } while (true);
            obj = EntityMerger.f(c).a(arraylist);
            EntityMerger.a(c).addAll(((List) (obj)));
            if (obj != null && ((List) (obj)).size() != 0)
            {
                b.a = MergeStatus.b;
            }
            EntityMerger.f(c).b(((List) (obj)));
            obj2 = EntityMerger.g(c).a(((List) (obj2)));
            EntityMerger.a(c).saveAll(((Iterable) (obj2)));
            EntityMerger.g(c).b(((List) (obj2)));
            obj1 = EntityMerger.h(c).a(((List) (obj1)));
            if (obj1 != null && ((List) (obj1)).size() != 0)
            {
                b.a = MergeStatus.c;
            }
            EntityMerger.a(c).deleteAll(((Iterable) (obj1)));
            EntityMerger.h(c).b(((List) (obj1)));
            com.fitbit.e.a.a("EntityMerger", String.format("Repo %s Processed %d inserts, %d updates, %d deletes in %dms", new Object[] {
                EntityMerger.a(c).getName(), Integer.valueOf(((List) (obj)).size()), Integer.valueOf(((List) (obj2)).size()), Integer.valueOf(((List) (obj1)).size()), Long.valueOf(SystemClock.uptimeMillis() - l)
            }), new Object[0]);
            return;
            obj = null;
              goto _L3
        }

        public f(e e1)
        {
            c = EntityMerger.this;
            super();
            a = e1;
        }
    }

    class f.a
    {

        public MergeStatus a;
        final f b;

        f.a(f f1)
        {
            b = f1;
            super();
            a = MergeStatus.a;
        }
    }

    public static interface g
    {

        public abstract List a(ao ao1);
    }

    public static class h
        implements b
    {

        public boolean a(Entity entity, Entity entity1)
        {
            return entity.getServerId() == entity1.getServerId();
        }

        public volatile boolean a(Object obj, Object obj1)
        {
            return a((Entity)obj, (Entity)obj1);
        }

        public h()
        {
        }
    }

    public static class i
    {

        public List a(List list)
        {
            return list;
        }

        public void b(List list)
        {
        }

        public i()
        {
        }
    }


    private static final String a = "EntityMerger";
    private final List b;
    private final ao c;
    private final g d;
    private b e;
    private a f;
    private i g;
    private i h;
    private i i;

    public EntityMerger(List list, ao ao1, g g1)
    {
        g = new i();
        h = new i();
        i = new i();
        b = list;
        c = ao1;
        d = g1;
    }

    static ao a(EntityMerger entitymerger)
    {
        return entitymerger.c;
    }

    static g b(EntityMerger entitymerger)
    {
        return entitymerger.d;
    }

    static List c(EntityMerger entitymerger)
    {
        return entitymerger.b;
    }

    static b d(EntityMerger entitymerger)
    {
        return entitymerger.e;
    }

    static a e(EntityMerger entitymerger)
    {
        return entitymerger.f;
    }

    static i f(EntityMerger entitymerger)
    {
        return entitymerger.g;
    }

    static i g(EntityMerger entitymerger)
    {
        return entitymerger.h;
    }

    static i h(EntityMerger entitymerger)
    {
        return entitymerger.i;
    }

    public MergeStatus a()
    {
        return a(((e) (new c())));
    }

    public MergeStatus a(e e1)
    {
        if (e == null)
        {
            e = new h();
        }
        if (f == null)
        {
            f = new d();
        }
        e1 = new f(e1);
        f.a a1 = ((f) (e1)).b;
        c.runInTransaction(e1);
        return a1.a;
    }

    public EntityMerger a(b b1)
    {
        e = b1;
        return this;
    }

    public EntityMerger a(i j)
    {
        i = j;
        return this;
    }

    public void a(a a1)
    {
        f = a1;
    }

    public EntityMerger b(i j)
    {
        g = j;
        return this;
    }

    public EntityMerger c(i j)
    {
        h = j;
        return this;
    }
}
