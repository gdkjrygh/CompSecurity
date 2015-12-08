// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.repo.mem;

import com.fitbit.data.domain.ActivitySummaryItem;
import com.fitbit.data.repo.e;
import java.util.List;

// Referenced classes of package com.fitbit.data.repo.mem:
//            a, DataCache

public class b extends a
    implements e
{

    public b()
    {
    }

    public ActivitySummaryItem a()
    {
        DataCache datacache = DataCache.a();
        datacache;
        JVM INSTR monitorenter ;
        Object obj;
        obj = getAll();
        if (((List) (obj)).size() <= 0)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        obj = (ActivitySummaryItem)((List) (obj)).get(0);
        return ((ActivitySummaryItem) (obj));
        datacache;
        JVM INSTR monitorexit ;
        return null;
        Exception exception;
        exception;
        datacache;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public List getAll()
    {
        return DataCache.a().b();
    }
}
