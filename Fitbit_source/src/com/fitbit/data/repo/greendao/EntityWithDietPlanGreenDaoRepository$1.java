// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.Entity;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            EntityWithDietPlanGreenDaoRepository

class val.entities
    implements Runnable
{

    final EntityWithDietPlanGreenDaoRepository this$0;
    final List val$entities;

    public void run()
    {
        Entity entity;
        for (Iterator iterator = val$entities.iterator(); iterator.hasNext(); add(entity))
        {
            entity = (Entity)iterator.next();
        }

    }

    ()
    {
        this$0 = final_entitywithdietplangreendaorepository;
        val$entities = List.this;
        super();
    }
}
