// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.details;

import android.content.Context;
import android.content.Intent;
import com.fitbit.activity.ui.charts.ActivityType;
import com.fitbit.data.bl.de;
import com.fitbit.data.bl.fs;
import com.fitbit.data.domain.TimeSeriesObject;
import com.fitbit.ui.charts.s;
import com.fitbit.ui.charts.t;
import com.fitbit.util.a;
import com.fitbit.util.ae;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.activity.ui.details:
//            ActivityDetailsHeaderFragment

private static class c extends ae
{

    private final Date a;
    private final Date b;
    private final ActivityType c;

    protected boolean a(String s1)
    {
        return s1.equals(fs.a().c());
    }

    protected void b()
    {
        fs.a().a(this);
    }

    protected void d()
    {
        fs.a().b(this);
    }

    protected t e()
    {
        Object obj = fs.a().a(c.b(), a, b);
        if (ActivityType.c.equals(c))
        {
            t t1 = new t();
            TimeSeriesObject timeseriesobject;
            for (obj = ((List) (obj)).iterator(); ((Iterator) (obj)).hasNext(); t1.a(new s(timeseriesobject.a().getTime(), com.fitbit.util.a.b(timeseriesobject.b()))))
            {
                timeseriesobject = (TimeSeriesObject)((Iterator) (obj)).next();
            }

            return t1;
        } else
        {
            return t.a(((List) (obj)));
        }
    }

    protected Intent f()
    {
        return de.a(getContext(), c.b(), a, b, false);
    }

    protected Object g()
    {
        return e();
    }

    public (Context context, ActivityType activitytype, Date date, Date date1)
    {
        super(context);
        a = date;
        b = date1;
        c = activitytype;
    }
}
