// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.alarm.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.widget.SwitchCompat;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.TimePicker;
import com.fitbit.data.bl.b;
import com.fitbit.data.domain.Alarm;
import com.fitbit.data.domain.device.Device;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.TimePickerDialogFragment;
import com.fitbit.ui.WeekDaySelectionView;
import com.fitbit.util.SimpleConfirmDialogFragment;
import com.fitbit.util.ad;
import com.fitbit.util.bf;
import com.fitbit.util.f;
import com.fitbit.util.format.e;
import com.fitbit.util.p;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Set;

public class LogAlarmActivity extends FitbitActivity
    implements android.app.TimePickerDialog.OnTimeSetListener, android.support.v4.app.LoaderManager.LoaderCallbacks, android.widget.CompoundButton.OnCheckedChangeListener, com.fitbit.ui.WeekDaySelectionView.a
{
    private static class a extends bf
    {

        static final String a = "ARG_ALARM";
        private final long b;

        static Bundle a(long l1)
        {
            Bundle bundle = new Bundle();
            bundle.putLong("ARG_ALARM", l1);
            return bundle;
        }

        public Alarm a()
        {
            Alarm alarm = com.fitbit.data.bl.b.a().a(b);
            if (!alarm.c())
            {
                alarm.b(0);
            }
            return alarm;
        }

        public Object f_()
        {
            return a();
        }

        public a(Context context, long l1)
        {
            super(context);
            b = l1;
        }
    }


    public static final String a = "action";
    public static final String b = "deviceEntityId";
    public static final String c = "alarmId";
    private static final String k = "com.fitbit.alarm.ui.TAG_TIME_PICKER_DIALOG_FRAGMENT";
    private static final String l = "com.fitbit.alarm.ui.TAG_DELETE_DIALOG";
    private static final String m = com/fitbit/alarm/ui/LogAlarmActivity.getSimpleName();
    protected View d;
    protected View e;
    protected WeekDaySelectionView f;
    protected View g;
    protected String h;
    protected long i;
    protected long j;
    private SwitchCompat n;
    private SwitchCompat o;
    private TextView p;
    private Alarm q;
    private boolean r;
    private com.fitbit.util.SimpleConfirmDialogFragment.a s;

    public LogAlarmActivity()
    {
        s = new com.fitbit.util.SimpleConfirmDialogFragment.a() {

            final LogAlarmActivity a;

            public void a(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
                com.fitbit.util.f.a(new com.fitbit.util.f.a(this, a) {

                    final _cls2 a;

                    public void a(Activity activity)
                    {
                        com.fitbit.data.bl.b.a().b(activity, com.fitbit.alarm.ui.LogAlarmActivity.b(a.a));
                    }

                    public void a(Object obj)
                    {
                        b((Activity)obj);
                    }

                    public void b(Activity activity)
                    {
                        super.a(activity);
                    }

                    public void b(Object obj)
                    {
                        a((Activity)obj);
                    }

            
            {
                a = _pcls2;
                super(activity);
            }
                });
                a.setResult(-1);
                a.finish();
            }

            public void b(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
            }

            public void c(SimpleConfirmDialogFragment simpleconfirmdialogfragment)
            {
            }

            
            {
                a = LogAlarmActivity.this;
                super();
            }
        };
    }

    static Alarm a(LogAlarmActivity logalarmactivity, Alarm alarm)
    {
        logalarmactivity.q = alarm;
        return alarm;
    }

    public static void a(Context context, int i1, Device device)
    {
        if (device != null)
        {
            Intent intent = new Intent(context, com/fitbit/alarm/ui/LogAlarmActivity);
            intent.putExtra("deviceEntityId", device.getEntityId());
            ((Activity)context).startActivityForResult(intent, i1);
        }
    }

    public static void a(Context context, Device device)
    {
        if (device != null)
        {
            Intent intent = new Intent(context, com/fitbit/alarm/ui/LogAlarmActivity);
            intent.putExtra("deviceEntityId", device.getEntityId());
            context.startActivity(intent);
        }
    }

    public static void a(Context context, Device device, Alarm alarm)
    {
        if (device != null && alarm != null)
        {
            Intent intent = new Intent(context, com/fitbit/alarm/ui/LogAlarmActivity);
            intent.putExtra("action", "android.intent.action.EDIT");
            intent.putExtra("alarmId", alarm.getEntityId());
            intent.putExtra("deviceEntityId", device.getEntityId());
            context.startActivity(intent);
        }
    }

    static void a(LogAlarmActivity logalarmactivity)
    {
        logalarmactivity.f();
    }

    private void a(Alarm alarm)
    {
        q = alarm;
        p.setText(com.fitbit.util.format.e.n(this, q.h()));
        n.setChecked(q.a());
        o.setChecked(q.c());
        n.setOnCheckedChangeListener(this);
        o.setOnCheckedChangeListener(this);
        f.a(Alarm.e(q.j()));
    }

    static boolean a(LogAlarmActivity logalarmactivity, boolean flag)
    {
        logalarmactivity.r = flag;
        return flag;
    }

    static Alarm b(LogAlarmActivity logalarmactivity)
    {
        return logalarmactivity.q;
    }

    static SwitchCompat c(LogAlarmActivity logalarmactivity)
    {
        return logalarmactivity.o;
    }

    private void f()
    {
        if (q != null)
        {
            Object obj = Calendar.getInstance();
            ((Calendar) (obj)).setTime(q.h());
            obj = new TimePickerDialogFragment(this, ((Calendar) (obj)).get(11), ((Calendar) (obj)).get(12), 0x7f0805cf);
            ad.a(getSupportFragmentManager(), "com.fitbit.alarm.ui.TAG_TIME_PICKER_DIALOG_FRAGMENT", ((android.support.v4.app.Fragment) (obj)));
        }
    }

    private boolean g()
    {
        return "android.intent.action.EDIT".equals(h);
    }

    public void a()
    {
        finish();
    }

    public void a(Loader loader, Alarm alarm)
    {
        if (alarm == null)
        {
            finish();
        } else
        {
            a(alarm);
            if (d.getVisibility() != 0)
            {
                d.setVisibility(0);
                d.setAnimation(AnimationUtils.loadAnimation(this, 0x7f050009));
                return;
            }
        }
    }

    public void a(WeekDaySelectionView weekdayselectionview, Set set)
    {
        if (q != null)
        {
            q.b(Alarm.a(set));
        }
    }

    protected void b()
    {
        SimpleConfirmDialogFragment simpleconfirmdialogfragment = SimpleConfirmDialogFragment.c(s, 0x7f0802d9, 0x7f0802da);
        ad.a(getSupportFragmentManager(), "com.fitbit.alarm.ui.TAG_DELETE_DIALOG", simpleconfirmdialogfragment);
    }

    protected void c()
    {
        if (!r)
        {
            r = true;
            UISavedState.b(false);
            com.fitbit.util.f.a(new com.fitbit.util.f.a(this) {

                final LogAlarmActivity a;
                private boolean b;

                public void a(LogAlarmActivity logalarmactivity)
                {
                    Device device = com.fitbit.util.p.a(Long.valueOf(a.j));
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
                        a.runOnUiThread(new Runnable(this) {

                            final _cls3 a;

                            public void run()
                            {
                                SimpleConfirmDialogFragment simpleconfirmdialogfragment = new SimpleConfirmDialogFragment(0x7f08042e, 0);
                                SimpleConfirmDialogFragment.a(simpleconfirmdialogfragment, 0x7f08052f, 0x7f08031c, null);
                                ad.a(a.a.getSupportFragmentManager(), "alarms_dialog", simpleconfirmdialogfragment);
                            }

            
            {
                a = _pcls3;
                super();
            }
                        });
                        return;
                    } else
                    {
                        Set set = a.f.c();
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
                a = LogAlarmActivity.this;
                super(logalarmactivity1);
                b = true;
            }
            });
        }
    }

    protected void d()
    {
        q.b(n.isChecked());
    }

    protected void e()
    {
        q.c(o.isChecked());
        View view = g;
        int i1;
        if (o.isChecked())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (compoundbutton.getId() == o.getId())
        {
            e();
        } else
        if (compoundbutton.getId() == n.getId())
        {
            d();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        h = getIntent().getStringExtra("action");
        i = getIntent().getLongExtra("alarmId", -1L);
        j = getIntent().getLongExtra("deviceEntityId", -1L);
        setContentView(0x7f040030);
        d = findViewById(0x1020002);
        f.a(this);
        if (g())
        {
            d.setVisibility(4);
            getSupportLoaderManager().initLoader(191, a.a(i), this);
        } else
        {
            bundle = new Alarm();
            bundle.b(true);
            bundle.a(new Date());
            a(bundle);
        }
        a(f, f.c());
        bundle = (TimePickerDialogFragment)getSupportFragmentManager().findFragmentByTag("com.fitbit.alarm.ui.TAG_TIME_PICKER_DIALOG_FRAGMENT");
        if (bundle != null)
        {
            bundle.a(this);
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        long l1;
        if (bundle != null)
        {
            l1 = bundle.getLong("ARG_ALARM");
        } else
        {
            l1 = -1L;
        }
        return new a(this, l1);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f12000b, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Alarm)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 2: default 32
    //                   2131820692: 44
    //                   2131821791: 38;
           goto _L1 _L2 _L3
_L1:
        return super.onOptionsItemSelected(menuitem);
_L3:
        b();
_L5:
        return true;
_L2:
        c();
        if (true) goto _L5; else goto _L4
_L4:
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        menu.findItem(0x7f1104df).setVisible(g());
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onResume()
    {
        super.onResume();
        if (f != null)
        {
            f.b();
        }
        if (q != null && q.h() != null)
        {
            p.setText(com.fitbit.util.format.e.n(this, q.h()));
        }
    }

    public void onSupportContentChanged()
    {
        super.onSupportContentChanged();
        n = (SwitchCompat)findViewById(0x7f110144);
        o = (SwitchCompat)findViewById(0x7f110146);
        e = findViewById(0x7f1100cb);
        d = findViewById(0x1020002);
        f = (WeekDaySelectionView)findViewById(0x7f110148);
        g = findViewById(0x7f110147);
        p = (TextView)findViewById(0x7f110145);
        p.setOnClickListener(new android.view.View.OnClickListener() {

            final LogAlarmActivity a;

            public void onClick(View view)
            {
                LogAlarmActivity.a(a);
            }

            
            {
                a = LogAlarmActivity.this;
                super();
            }
        });
    }

    public void onTimeSet(TimePicker timepicker, int i1, int j1)
    {
        timepicker = new GregorianCalendar();
        timepicker.set(11, i1);
        timepicker.set(12, j1);
        q.a(timepicker.getTime());
        a(q);
    }

}
