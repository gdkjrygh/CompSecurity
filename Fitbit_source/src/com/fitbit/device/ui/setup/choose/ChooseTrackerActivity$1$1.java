// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.device.ui.setup.choose;

import android.os.Handler;
import com.fitbit.pedometer.e;
import com.fitbit.pedometer.service.a;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.device.ui.setup.choose:
//            ChooseTrackerActivity

class a
    implements Runnable
{

    final a a;

    public void run()
    {
        boolean flag = p.l();
        if (flag)
        {
            com.fitbit.pedometer.service.a.b();
            com.fitbit.multipledevice.a.a().b();
        }
        boolean flag1 = e.h();
        ChooseTrackerActivity choosetrackeractivity = a.a;
        if (flag1 && !flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.fitbit.device.ui.setup.choose.ChooseTrackerActivity.a(choosetrackeractivity, flag);
    }

    turer(turer turer)
    {
        a = turer;
        super();
    }

    // Unreferenced inner class com/fitbit/device/ui/setup/choose/ChooseTrackerActivity$1

/* anonymous class */
    class ChooseTrackerActivity._cls1
        implements com.fitbit.pedometer.e.b
    {

        final ChooseTrackerActivity a;

        public void a(e e1)
        {
            if (com.fitbit.pedometer.PedometerAdapterHelper.PedometerManufacturer.b == e1.a())
            {
                com.fitbit.device.ui.setup.choose.ChooseTrackerActivity.a(a).post(new ChooseTrackerActivity._cls1._cls1(this));
            }
        }

        public volatile void a(Object obj)
        {
            a((e)obj);
        }

            
            {
                a = choosetrackeractivity;
                super();
            }
    }

}
