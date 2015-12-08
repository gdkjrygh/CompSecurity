// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.activity.ui.i;
import com.fitbit.livedata.LiveDataPacket;
import com.fitbit.util.a;
import com.fitbit.util.o;

// Referenced classes of package com.fitbit.activity.ui.details:
//            ActivityDetailsActivity

class a extends i
{

    final ActivityDetailsActivity a;

    protected void a(LiveDataPacket livedatapacket)
    {
        double d = com.fitbit.util.a.a(livedatapacket, com.fitbit.activity.ui.details.ActivityDetailsActivity.a(a).a());
        if (o.j(ActivityDetailsActivity.b(a)) && d > 0.0D)
        {
            com.fitbit.activity.ui.details.ActivityDetailsActivity.a(a, d);
            ActivityDetailsActivity.c(a);
        }
    }

    (ActivityDetailsActivity activitydetailsactivity)
    {
        a = activitydetailsactivity;
        super();
    }
}
