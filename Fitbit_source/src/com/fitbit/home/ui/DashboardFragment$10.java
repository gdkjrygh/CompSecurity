// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import com.fitbit.data.domain.device.Device;
import com.fitbit.ui.s;

// Referenced classes of package com.fitbit.home.ui:
//            DashboardFragment

class a
    implements com.fitbit.util..a
{

    final Device a;
    final DashboardFragment b;

    public void a()
    {
        s.a(b.getActivity(), 0x7f08008e, 1).i();
    }

    public void b()
    {
        b.a(a);
    }

    public void c()
    {
        s.a(b.getActivity(), 0x7f08008e, 1).i();
    }

    (DashboardFragment dashboardfragment, Device device)
    {
        b = dashboardfragment;
        a = device;
        super();
    }
}
