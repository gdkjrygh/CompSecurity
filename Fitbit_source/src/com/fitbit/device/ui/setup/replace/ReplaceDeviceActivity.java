// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.replace;

import android.content.Context;
import android.content.Intent;
import android.support.v4.app.Fragment;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.data.domain.device.TrackerType;
import com.fitbit.device.ui.setup.AbstractChooseTrackerActivity;
import com.fitbit.device.ui.setup.choose.ChooseTrackerActivity;
import com.fitbit.mixpanel.MixPanelTrackingHelper;
import com.fitbit.multipledevice.a;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.device.ui.setup.replace:
//            ReplaceDeviceActivity_, ReplaceDeviceAdapter, ConfirmReplaceDeviceActivity

public class ReplaceDeviceActivity extends AbstractChooseTrackerActivity
{

    public static final int f = 4904;

    public ReplaceDeviceActivity()
    {
    }

    private TrackerType a(Device device)
    {
label0:
        {
            if (device == null || e == null)
            {
                break label0;
            }
            Iterator iterator = e.iterator();
            TrackerType trackertype;
            do
            {
                if (!iterator.hasNext())
                {
                    break label0;
                }
                trackertype = (TrackerType)iterator.next();
            } while (!trackertype.a().equalsIgnoreCase(device.j()));
            return trackertype;
        }
        return null;
    }

    public static void a(Context context, int i)
    {
        com.fitbit.device.ui.setup.replace.ReplaceDeviceActivity_.a(context).b(i);
    }

    public static void a(Fragment fragment, int i)
    {
        com.fitbit.device.ui.setup.replace.ReplaceDeviceActivity_.a(fragment).b(i);
    }

    protected ListAdapter a(List list)
    {
        return new ReplaceDeviceAdapter(this, list);
    }

    protected void a(int i, Intent intent)
    {
        if (i == -1)
        {
            setResult(-1, intent);
            finish();
        }
    }

    protected void b(int i, Intent intent)
    {
        a(i, intent);
    }

    public void finish()
    {
        super.finish();
        com.fitbit.multipledevice.a.a().d();
    }

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (P())
        {
            if (i == adapterview.getCount() - 1)
            {
                ChooseTrackerActivity.a(this, 4904);
            } else
            {
                adapterview = (Device)adapterview.getItemAtPosition(i);
                view = a(adapterview);
                if (view != null && view.d() != null)
                {
                    MixPanelTrackingHelper.a(view.a());
                    com.fitbit.device.ui.setup.replace.ConfirmReplaceDeviceActivity.a(this, 2011, view);
                    return;
                }
                if (adapterview.h() == DeviceVersion.MOTIONBIT)
                {
                    MixPanelTrackingHelper.a(adapterview.j());
                    com.fitbit.device.ui.setup.replace.ConfirmReplaceDeviceActivity.a(this, 2011, null);
                    return;
                }
            }
        }
    }
}
