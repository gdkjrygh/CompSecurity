// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.choose;

import android.app.Activity;
import android.widget.Button;
import android.widget.TextView;
import com.fitbit.bluetooth.g;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceType;
import com.fitbit.data.domain.device.TrackerInfo;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.device.ui.setup.AbstractConfirmDeviceActivity;
import com.fitbit.device.ui.setup.replace.ConfirmReplacePairedDeviceActivity;
import com.fitbit.multipledevice.b;
import com.fitbit.util.p;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui.setup.choose:
//            ConfirmDeviceActivity_, ExplainTrackersActivity

public class ConfirmDeviceActivity extends AbstractConfirmDeviceActivity
{

    private static final int i = 4906;

    public ConfirmDeviceActivity()
    {
    }

    public static void a(Activity activity, int i1)
    {
        ConfirmDeviceActivity_.a(activity).b(i1);
    }

    public static void a(Activity activity, int i1, TrackerType trackertype)
    {
        ConfirmDeviceActivity_.a(activity).a(trackertype).b(i1);
    }

    private void a(TrackerType trackertype)
    {
        e.setVisibility(4);
        d.setText(String.format(getString(0x7f08010d), new Object[] {
            trackertype.a()
        }));
    }

    private void k()
    {
        l();
    }

    private void l()
    {
        e.setVisibility(4);
        d.setText(getText(0x7f08010e));
        d.setBackgroundColor(0);
        d.setClickable(false);
    }

    private void m()
    {
        d.setText(String.format(getString(0x7f08010d), new Object[] {
            g.a()
        }));
    }

    protected void b(int i1)
    {
        if (i1 == -1)
        {
            super.h();
            return;
        } else
        {
            i();
            return;
        }
    }

    protected void e()
    {
label0:
        {
            super.e();
            if (g.d() != null)
            {
                a.setText(g.d().g());
                b.setText(g.d().h());
                if (!g.a().equalsIgnoreCase("aria"))
                {
                    break label0;
                }
                m();
            }
            return;
        }
        if (g.a().equalsIgnoreCase("ultra"))
        {
            l();
            return;
        }
        if (!g.f() || !g.d().b())
        {
            k();
            return;
        } else
        {
            a(g);
            return;
        }
    }

    protected void h()
    {
        List list = p.a();
        List list1 = p.a(list, DeviceType.TRACKER);
        boolean flag = com.fitbit.multipledevice.b.a();
        if (flag && !com.fitbit.multipledevice.b.b())
        {
            if (g == null && !list1.isEmpty())
            {
                a(getString(0x7f080156), false);
                return;
            }
            if (g != null && p.j(list))
            {
                a(getString(0x7f080155), false);
                return;
            }
        }
        if (flag || list1.isEmpty())
        {
            super.h();
            return;
        } else
        {
            Device device = (Device)list1.get(0);
            ConfirmReplacePairedDeviceActivity.a(this, 4906, device.i(), device.h());
            return;
        }
    }

    protected void j()
    {
        ExplainTrackersActivity.a(this);
    }
}
