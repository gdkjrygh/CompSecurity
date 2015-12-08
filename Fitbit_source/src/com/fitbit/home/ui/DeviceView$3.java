// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.home.ui;

import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.util.a.b;

// Referenced classes of package com.fitbit.home.ui:
//            DeviceView

class a
    implements Runnable
{

    final DeviceView a;

    public void run()
    {
        b b1;
        if (com.fitbit.home.ui.DeviceView.b(a).h() == DeviceVersion.MOTIONBIT || com.fitbit.home.ui.DeviceView.b(a).h() == DeviceVersion.ULTRA || com.fitbit.home.ui.DeviceView.b(a).h() == DeviceVersion.CLASSIC || com.fitbit.home.ui.DeviceView.b(a).h() == DeviceVersion.ARIA)
        {
            b1 = new b(a.h, com.fitbit.home.ui.DeviceView.b(a).h().getDeviceIcon());
        } else
        {
            b1 = new b(a.h, DeviceView.c(a).a());
        }
        a.h.startAnimation(b1);
    }

    icassoImageView(DeviceView deviceview)
    {
        a = deviceview;
        super();
    }
}
