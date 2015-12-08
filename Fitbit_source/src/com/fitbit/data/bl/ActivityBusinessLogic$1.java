// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Entity;
import com.fitbit.e.a;
import java.io.IOException;
import java.util.Date;
import org.json.JSONException;

// Referenced classes of package com.fitbit.data.bl:
//            ActivityBusinessLogic

class a extends a
{

    final ActivityBusinessLogic a;

    public ActivityLogEntry a(ActivityLogEntry activitylogentry, ActivityLogEntry activitylogentry1)
    {
        ActivityLogEntry activitylogentry2;
        activitylogentry2 = (ActivityLogEntry)super.a(activitylogentry, activitylogentry1);
        activitylogentry2.setUuid(activitylogentry.getUuid());
        long l;
        if (activitylogentry1.p() != null)
        {
            activitylogentry2.a(activitylogentry1.p());
        } else
        {
            activitylogentry2.a(activitylogentry.p());
        }
        if (!activitylogentry1.f() || activitylogentry1.v() == null)
        {
            break MISSING_BLOCK_LABEL_98;
        }
        activitylogentry1 = new Date(activitylogentry1.v().());
        if (activitylogentry.v() == null)
        {
            l = 0L;
        } else
        {
            l = activitylogentry.v().();
        }
        if (!activitylogentry1.after(new Date(l)))
        {
            break MISSING_BLOCK_LABEL_98;
        }
        a.a(activitylogentry2);
        return activitylogentry2;
        activitylogentry;
        com.fitbit.e.a.f(com.fitbit.data.bl.ActivityBusinessLogic.a, "Could not refresh details from server", activitylogentry, new Object[0]);
        return activitylogentry2;
        activitylogentry;
_L2:
        com.fitbit.e.a.f(com.fitbit.data.bl.ActivityBusinessLogic.a, "Could not parse server response", activitylogentry, new Object[0]);
        return activitylogentry2;
        activitylogentry;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public volatile Entity a(Entity entity, Entity entity1)
    {
        return a((ActivityLogEntry)entity, (ActivityLogEntry)entity1);
    }

    public volatile Object a(Object obj, Object obj1)
    {
        return a((ActivityLogEntry)obj, (ActivityLogEntry)obj1);
    }

    cationException(ActivityBusinessLogic activitybusinesslogic)
    {
        a = activitybusinesslogic;
        super();
    }
}
