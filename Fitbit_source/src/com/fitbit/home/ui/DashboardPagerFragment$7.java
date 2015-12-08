// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import com.fitbit.data.domain.device.Device;
import com.fitbit.util.SimpleConfirmDialogFragment;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardPagerFragment

class a
    implements com.fitbit.util.nt.a
{

    final Device a;
    final DashboardPagerFragment b;

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        DashboardPagerFragment.b(b, a);
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    a(DashboardPagerFragment dashboardpagerfragment, Device device)
    {
        b = dashboardpagerfragment;
        a = device;
        super();
    }
}
