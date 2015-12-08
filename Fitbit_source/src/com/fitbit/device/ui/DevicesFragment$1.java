// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import com.fitbit.data.domain.device.Device;
import com.fitbit.ui.s;

// Referenced classes of package com.fitbit.device.ui:
//            DevicesFragment

class a
    implements com.fitbit.util.log.a
{

    final Device a;
    final DevicesFragment b;

    public void a()
    {
        s.a(b.getActivity(), 0x7f08008e, 1).i();
    }

    public void b()
    {
        DevicesFragment.a(b, a);
    }

    public void c()
    {
        s.a(b.getActivity(), 0x7f08008e, 1).i();
    }

    (DevicesFragment devicesfragment, Device device)
    {
        b = devicesfragment;
        a = device;
        super();
    }
}
