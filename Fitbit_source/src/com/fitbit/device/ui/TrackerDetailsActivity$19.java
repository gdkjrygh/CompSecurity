// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui;

import android.support.v7.widget.SwitchCompat;
import android.widget.CompoundButton;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.Device;
import com.fitbit.multipledevice.a;
import com.fitbit.serverinteraction.ServerGateway;

// Referenced classes of package com.fitbit.device.ui:
//            TrackerDetailsActivity

class a
    implements android.widget.angeListener
{

    final Device a;
    final TrackerDetailsActivity b;

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        boolean flag1 = true;
        if (g.a(b))
        {
            compoundbutton = b.e;
            if (!flag)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            compoundbutton.setChecked(flag);
        } else
        {
            if (flag && !ServerGateway.a().d())
            {
                a.a(flag, true);
                com.fitbit.multipledevice.a.a().e();
                return;
            }
            if (a.u() != flag)
            {
                a.b(flag);
                return;
            }
        }
    }

    stener(TrackerDetailsActivity trackerdetailsactivity, Device device)
    {
        b = trackerdetailsactivity;
        a = device;
        super();
    }
}
