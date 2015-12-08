// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.heartrate.details;

import android.content.Context;
import android.content.Intent;
import com.fitbit.data.bl.da;
import com.fitbit.data.bl.u;
import com.fitbit.data.domain.heartrate.HeartRateDailySummary;
import com.fitbit.util.az;
import java.util.Date;

// Referenced classes of package com.fitbit.heartrate.details:
//            HeartRateDetailsActivity

private static class a extends az
{

    private Date a;

    protected boolean a(String s)
    {
        return s.equals(u.a().b());
    }

    protected void b()
    {
        u.a().a(this);
    }

    protected void d()
    {
        u.a().b(this);
    }

    public HeartRateDailySummary e()
    {
        return u.a().a(a);
    }

    protected Intent f()
    {
        return da.a(getContext(), a);
    }

    public Object f_()
    {
        return e();
    }

    public (Context context, Date date)
    {
        super(context);
        a = date;
    }
}
