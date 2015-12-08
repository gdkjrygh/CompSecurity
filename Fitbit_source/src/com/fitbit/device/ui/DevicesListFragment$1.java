// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import com.fitbit.data.bl.fw;
import com.fitbit.data.domain.device.Device;
import com.fitbit.home.ui.g;
import com.fitbit.util.SimpleConfirmDialogFragment;

// Referenced classes of package com.fitbit.device.ui:
//            DevicesListFragment

class a
    implements com.fitbit.util.gment.a
{

    final Device a;
    final DevicesListFragment b;

    public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
        DevicesListFragment.a(b).a(new <init>(b, a));
        DevicesListFragment.a(b).a(fw.a(b.getActivity(), a.c()));
    }

    public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
    {
    }

    (DevicesListFragment deviceslistfragment, Device device)
    {
        b = deviceslistfragment;
        a = device;
        super();
    }
}
