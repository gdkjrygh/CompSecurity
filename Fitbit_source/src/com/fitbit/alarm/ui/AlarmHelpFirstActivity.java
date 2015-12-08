// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.support.v4.app.Fragment;
import android.widget.ImageView;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.device.Device;
import com.fitbit.data.domain.device.DeviceVersion;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.alarm.ui:
//            AlarmHelpFirstActivity_, AlarmHelpSecondActivity

public class AlarmHelpFirstActivity extends FitbitActivity
{

    private static final int e = 100;
    protected String a;
    protected String b;
    protected ImageView c;
    protected ImageView d;

    public AlarmHelpFirstActivity()
    {
    }

    public static void a(Fragment fragment, int i, Device device)
    {
        if (device != null)
        {
            AlarmHelpFirstActivity_.a(fragment).a(device.h().name()).b(device.d()).b();
        }
    }

    protected void a()
    {
        AlarmHelpSecondActivity.a(this, 100, p.c(b));
    }

    protected void b()
    {
label0:
        {
            Object obj = an.a().b();
            if (obj != null)
            {
                obj = p.c(((Profile) (obj)).s());
                if (obj == null || ((Device) (obj)).h() != DeviceVersion.ONE)
                {
                    break label0;
                }
                c.setVisibility(0);
                d.setVisibility(8);
            }
            return;
        }
        c.setVisibility(8);
        d.setVisibility(0);
    }

    protected void c_(int i)
    {
        if (i == -1)
        {
            setResult(-1);
            finish();
        }
    }
}
