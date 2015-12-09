// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import com.fitbit.data.domain.device.Device;
import com.fitbit.ui.s;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardPagerFragment

class a
    implements com.fitbit.util.._cls8
{

    final Device a;
    final DashboardPagerFragment b;

    public void a()
    {
        s.a(b.getActivity(), 0x7f08008d, 1).i();
    }

    public void b()
    {
        DashboardPagerFragment.b(b, a);
    }

    public void c()
    {
        s.a(b.getActivity(), 0x7f08008d, 1).i();
    }

    (DashboardPagerFragment dashboardpagerfragment, Device device)
    {
        b = dashboardpagerfragment;
        a = device;
        super();
    }
}
