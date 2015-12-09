// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.bl;

import com.fasterxml.jackson.core.JsonParser;
import com.fitbit.data.a.a;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.b;
import java.io.IOException;
import java.text.ParseException;
import java.util.UUID;

// Referenced classes of package com.fitbit.data.bl:
//            ActivityBusinessLogic

class c
    implements Runnable
{

    final ActivityLogEntry a;
    final com.fitbit.runtrack.data.b b;
    final JsonParser c;
    final ActivityBusinessLogic d;

    public void run()
    {
        Object obj;
        if (a.p() != null)
        {
            com.fitbit.runtrack.data.ExerciseSession exercisesession = b.a(UUID.fromString(a.p().a()));
            b.h(exercisesession);
        }
        obj = com.fitbit.data.a.a.a(c, a.a().getServerId(), a.p());
        a.a(((b) (obj)));
        obj = ((com.fitbit.runtrack.data.a) (obj)).c();
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        b.g(((com.fitbit.runtrack.data.ExerciseSession) (obj)));
        return;
        Object obj1;
        obj1;
_L2:
        com.fitbit.e.a.f(com.fitbit.data.bl.ActivityBusinessLogic.a, "Could not parse out a date from the activity details", ((Throwable) (obj1)), new Object[0]);
        return;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    (ActivityBusinessLogic activitybusinesslogic, ActivityLogEntry activitylogentry, com.fitbit.runtrack.data.b b1, JsonParser jsonparser)
    {
        d = activitybusinesslogic;
        a = activitylogentry;
        b = b1;
        c = jsonparser;
        super();
    }
}
