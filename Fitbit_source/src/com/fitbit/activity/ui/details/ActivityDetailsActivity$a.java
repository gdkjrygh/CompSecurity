// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import android.content.Context;
import android.content.Intent;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.data.bl.fd;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.util.a;
import com.fitbit.util.az;
import java.util.Date;

// Referenced classes of package com.fitbit.activity.ui.details:
//            ActivityDetailsActivity, a

private static class b extends az
{

    private final ActivityType a;
    private final Date b;

    protected boolean a(String s)
    {
        return s.equals(fs.a().c());
    }

    protected void b()
    {
        fs.a().a(this);
    }

    protected void d()
    {
        fs.a().b(this);
    }

    protected com.fitbit.activity.ui.details.a e()
    {
        Object obj = fs.a();
        com.fitbit.data.domain.sResourceType sresourcetype = a.a();
        obj = ((fs) (obj)).a(sresourcetype, b);
        double d3 = com.fitbit.util.a.a(a.c());
        double d2 = ((TimeSeriesObject) (obj)).b();
        double d1 = d2;
        if (sresourcetype == com.fitbit.data.domain.sResourceType.DISTANCE)
        {
            d1 = com.fitbit.util.a.b(d2);
        }
        return new com.fitbit.activity.ui.details.a(d1, d3);
    }

    protected Intent f()
    {
        return fd.a(getContext(), false, a.a(), b, b);
    }

    protected Object f_()
    {
        return e();
    }

    public eType(Context context, ActivityType activitytype, Date date)
    {
        super(context);
        a = activitytype;
        b = date;
    }
}
