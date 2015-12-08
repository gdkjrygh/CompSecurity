// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.repo.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.data.bl:
//            ActivityBusinessLogic

class a extends a
{

    final ActivityBusinessLogic a;

    public List a(List list)
    {
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ActivityLogEntry activitylogentry = (ActivityLogEntry)list.next();
            if ((ActivityLogEntry)ActivityBusinessLogic.a(a).getByServerId(activitylogentry.getServerId()) == null)
            {
                arraylist.add(activitylogentry);
            }
        } while (true);
        return arraylist;
    }

    (ActivityBusinessLogic activitybusinesslogic)
    {
        a = activitybusinesslogic;
        super();
    }
}
