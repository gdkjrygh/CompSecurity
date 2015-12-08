// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import android.os.SystemClock;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.repo.ao;
import com.fitbit.e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            EntityMerger

private class a
    implements Runnable
{
    class a
    {

        public EntityMerger.MergeStatus a;
        final EntityMerger.f b;

        a()
        {
            b = EntityMerger.f.this;
            super();
            a = com.fitbit.data.bl.EntityMerger.MergeStatus.a;
        }
    }


    final s a;
    final a b = new a();
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
        arraylist1 = new ArrayList(EntityMerger.b(c).a(com.fitbit.data.bl.EntityMerger.a(c)));
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
        com.fitbit.data.bl.EntityMerger.a(c).addAll(((List) (obj)));
        if (obj != null && ((List) (obj)).size() != 0)
        {
            b.a = rgeStatus.b;
        }
        EntityMerger.f(c).b(((List) (obj)));
        obj2 = EntityMerger.g(c).a(((List) (obj2)));
        com.fitbit.data.bl.EntityMerger.a(c).saveAll(((Iterable) (obj2)));
        EntityMerger.g(c).b(((List) (obj2)));
        obj1 = EntityMerger.h(c).a(((List) (obj1)));
        if (obj1 != null && ((List) (obj1)).size() != 0)
        {
            b.a = rgeStatus.c;
        }
        com.fitbit.data.bl.EntityMerger.a(c).deleteAll(((Iterable) (obj1)));
        EntityMerger.h(c).b(((List) (obj1)));
        com.fitbit.e.a.a("EntityMerger", String.format("Repo %s Processed %d inserts, %d updates, %d deletes in %dms", new Object[] {
            com.fitbit.data.bl.EntityMerger.a(c).getName(), Integer.valueOf(((List) (obj)).size()), Integer.valueOf(((List) (obj2)).size()), Integer.valueOf(((List) (obj1)).size()), Long.valueOf(SystemClock.uptimeMillis() - l)
        }), new Object[0]);
        return;
        obj = null;
          goto _L3
    }

    public rgeStatus.a(EntityMerger entitymerger, rgeStatus.a a1)
    {
        c = entitymerger;
        super();
        a = a1;
    }
}
