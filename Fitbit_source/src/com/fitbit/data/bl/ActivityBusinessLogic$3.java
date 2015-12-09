// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.repo.ao;
import com.fitbit.data.repo.d;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            ActivityBusinessLogic

class a
    implements a
{

    final quest a;
    final ActivityBusinessLogic b;

    public List a(ao ao)
    {
        return ActivityBusinessLogic.a(b).getOlderThan(a.c, a.b, a.d, a.f, new com.fitbit.data.domain.t.f[] {
            com.fitbit.data.domain.ING_DELETE
        });
    }

    quest(ActivityBusinessLogic activitybusinesslogic, quest quest)
    {
        b = activitybusinesslogic;
        a = quest;
        super();
    }
}
