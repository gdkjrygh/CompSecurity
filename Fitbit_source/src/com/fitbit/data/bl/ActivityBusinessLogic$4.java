// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.repo.ao;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            ActivityBusinessLogic

class a
    implements a
{

    final List a;
    final ActivityBusinessLogic b;

    public List a(ao ao1)
    {
        ArrayList arraylist = new ArrayList(a.size());
        for (Iterator iterator = a.iterator(); iterator.hasNext(); arraylist.add(Long.valueOf(((ActivityLogEntry)iterator.next()).getServerId()))) { }
        return ao1.getByServerId(arraylist);
    }

    (ActivityBusinessLogic activitybusinesslogic, List list)
    {
        b = activitybusinesslogic;
        a = list;
        super();
    }
}
