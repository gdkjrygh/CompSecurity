// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.greendao;

import com.fitbit.data.domain.DietPlan;
import com.fitbit.data.domain.Entity;
import com.fitbit.data.domain.c;
import de.greenrobot.dao.Property;
import de.greenrobot.dao.query.DeleteQueryExt;
import de.greenrobot.dao.query.QueryBuilder;
import de.greenrobot.dao.query.WhereCondition;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.greendao:
//            EntityWithDietPlanGreenDaoRepository, DietPlanDao

class this._cls0
    implements Runnable
{

    final EntityWithDietPlanGreenDaoRepository this$0;

    public void run()
    {
        ArrayList arraylist = new ArrayList();
        for (Iterator iterator = getPendingEntries().iterator(); iterator.hasNext(); arraylist.add(((c)(Entity)iterator.next()).a().getEntityId())) { }
        (new DeleteQueryExt(EntityWithDietPlanGreenDaoRepository.access$000(EntityWithDietPlanGreenDaoRepository.this).queryBuilder().where(this._fld0.notIn(arraylist), new WhereCondition[0]).buildDelete())).executeDeleteAndClearCache();
    }

    ()
    {
        this$0 = EntityWithDietPlanGreenDaoRepository.this;
        super();
    }
}
