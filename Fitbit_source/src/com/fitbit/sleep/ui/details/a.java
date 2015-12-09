// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui.details;

import android.content.Context;
import com.fitbit.data.bl.ay;
import com.fitbit.data.bl.t;
import com.fitbit.sleep.ui.landing.b;
import com.fitbit.util.az;
import java.util.Date;

public class a extends az
{

    private final long a;

    public a(Context context, long l)
    {
        super(context);
        a = l;
    }

    protected boolean a(String s)
    {
        return ay.a().a(s) || t.a().e().equals(s);
    }

    protected void b()
    {
        ay.a().a(this);
        t.a().a(this);
    }

    protected void d()
    {
        ay.a().b(this);
        t.a().b(this);
    }

    public b e()
    {
        com.fitbit.data.domain.SleepGoal sleepgoal = t.a().h(new Date());
        return new b(ay.a().a(Long.valueOf(a)), sleepgoal);
    }

    public Object f_()
    {
        return e();
    }
}
