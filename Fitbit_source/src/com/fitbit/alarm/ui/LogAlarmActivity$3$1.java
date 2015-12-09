// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.support.v7.widget.SwitchCompat;
import com.fitbit.data.bl.b;
import com.fitbit.data.domain.Alarm;
import com.fitbit.ui.WeekDaySelectionView;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.p;

// Referenced classes of package com.fitbit.alarm.ui:
//            LogAlarmActivity

class a
    implements Runnable
{

    final upportFragmentManager a;

    public void run()
    {
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment(0x7f08042e, 0);
        SimpleConfirmDialogFragment.a(simpleconfirmdialogfragment, 0x7f08052f, 0x7f08031c, null);
        ad.a(a.a.getSupportFragmentManager(), "alarms_dialog", simpleconfirmdialogfragment);
    }

    nt(nt nt)
    {
        a = nt;
        super();
    }

    // Unreferenced inner class com/fitbit/alarm/ui/LogAlarmActivity$3

/* anonymous class */
    class LogAlarmActivity._cls3 extends com.fitbit.util.f.a
    {

        final LogAlarmActivity a;
        private boolean b;

        public void a(LogAlarmActivity logalarmactivity)
        {
            com.fitbit.data.domain.device.Device device = p.a(Long.valueOf(a.j));
            if (device == null)
            {
                return;
            }
            if (com.fitbit.alarm.ui.LogAlarmActivity.b(a) == null)
            {
                LogAlarmActivity.a(a, new Alarm());
            }
            if (com.fitbit.alarm.ui.LogAlarmActivity.b(a).isNew() && !com.fitbit.data.bl.b.a().c(device))
            {
                b = false;
                a.runOnUiThread(new LogAlarmActivity._cls3._cls1(this));
                return;
            } else
            {
                java.util.Set set = a.f.c();
                boolean flag = LogAlarmActivity.c(a).isChecked();
                boolean flag1 = com.fitbit.alarm.ui.LogAlarmActivity.b(a).a();
                com.fitbit.data.bl.b.a().a(logalarmactivity, com.fitbit.alarm.ui.LogAlarmActivity.b(a), device, set, flag, flag1);
                return;
            }
        }

        public void a(Object obj)
        {
            b((LogAlarmActivity)obj);
        }

        public void b(LogAlarmActivity logalarmactivity)
        {
            super.a(logalarmactivity);
            LogAlarmActivity.a(a, false);
            if (b)
            {
                a.setResult(-1);
                a.finish();
            }
        }

        public void b(Object obj)
        {
            a((LogAlarmActivity)obj);
        }

            
            {
                a = logalarmactivity;
                super(logalarmactivity1);
                b = true;
            }
    }

}
