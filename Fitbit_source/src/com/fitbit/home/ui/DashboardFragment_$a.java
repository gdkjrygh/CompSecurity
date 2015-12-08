// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import android.os.Bundle;
import java.util.Calendar;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment_, DashboardFragment

public static class <init>
{

    private Bundle a;

    public DashboardFragment a()
    {
        DashboardFragment_ dashboardfragment_ = new DashboardFragment_();
        dashboardfragment_.setArguments(a);
        return dashboardfragment_;
    }

    public a a(Calendar calendar)
    {
        a.putSerializable("date", calendar);
        return this;
    }

    private ()
    {
        a = new Bundle();
    }

    a(a a1)
    {
        this();
    }
}
