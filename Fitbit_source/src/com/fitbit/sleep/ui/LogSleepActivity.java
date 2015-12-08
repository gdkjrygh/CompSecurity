// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.sleep.ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TimePicker;
import com.fitbit.data.bl.ay;
import com.fitbit.data.domain.SleepLogEntry;
import com.fitbit.e.a;
import com.fitbit.galileo.service.GalileoServicesStateListener;
import com.fitbit.sleep.ui.landing.DeleteSleepLogConfirmationDialog;
import com.fitbit.sleep.ui.landing.SleepLoggingLandingActivity;
import com.fitbit.ui.FitbitActivity;
import com.fitbit.ui.dialogs.CalendarPickerDialogFragment;
import com.fitbit.ui.s;
import com.fitbit.util.ad;
import com.fitbit.util.bf;
import com.fitbit.util.bn;
import com.fitbit.util.bq;
import com.fitbit.util.f;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.fitbit.sleep.ui:
//            SleepTimePickerDialogFragment

public class LogSleepActivity extends FitbitActivity
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, com.fitbit.sleep.ui.landing.DeleteSleepLogConfirmationDialog.a
{
    static final class ErrorType extends Enum
    {

        public static final ErrorType a;
        public static final ErrorType b;
        private static final ErrorType c[];

        public static ErrorType valueOf(String s1)
        {
            return (ErrorType)Enum.valueOf(com/fitbit/sleep/ui/LogSleepActivity$ErrorType, s1);
        }

        public static ErrorType[] values()
        {
            return (ErrorType[])c.clone();
        }

        static 
        {
            a = new ErrorType("SYNC", 0);
            b = new ErrorType("LOG_EXISTS", 1);
            c = (new ErrorType[] {
                a, b
            });
        }

        private ErrorType(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    public static final class States extends Enum
    {

        public static final States a;
        public static final States b;
        private static final States c[];

        public static States valueOf(String s1)
        {
            return (States)Enum.valueOf(com/fitbit/sleep/ui/LogSleepActivity$States, s1);
        }

        public static States[] values()
        {
            return (States[])c.clone();
        }

        static 
        {
            a = new States("CREATE", 0);
            b = new States("EDIT", 1);
            c = (new States[] {
                a, b
            });
        }

        private States(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private class a extends com.fitbit.util.f.a
    {

        final LogSleepActivity a;
        private boolean b;
        private ErrorType c;
        private SleepLogEntry d;

        public void a(Activity activity)
        {
            if (GalileoServicesStateListener.f().c() == com.fitbit.galileo.service.GalileoServicesStateListener.GalileoState.a)
            {
                if (!com.fitbit.util.o.j(d.getLogDate(), d.b()))
                {
                    Object obj = new ArrayList();
                    SleepLogEntry sleeplogentry = ay.a().a(d.getEntityId());
                    if (sleeplogentry != null)
                    {
                        ((List) (obj)).add(sleeplogentry);
                    } else
                    {
                        com.fitbit.e.a.a("LogSleepActivity", "Can't find sleep log with id = %d", new Object[] {
                            d.getEntityId()
                        });
                    }
                    ay.a().a(((List) (obj)), activity);
                    obj = new SleepLogEntry();
                    ((SleepLogEntry) (obj)).a(d.a());
                    ((SleepLogEntry) (obj)).a(d.e());
                    ((SleepLogEntry) (obj)).i(d.m());
                    ((SleepLogEntry) (obj)).c(d.m());
                    ((SleepLogEntry) (obj)).setLogDate(d.b());
                    d = ((SleepLogEntry) (obj));
                }
                b = ay.a().a(d);
                if (b)
                {
                    ay.a().a(d, activity);
                    return;
                } else
                {
                    com.fitbit.e.a.a("LogSleepActivity", "LogSleepActivity uuid = %s, id= %s", new Object[] {
                        LogSleepActivity.k(a), LogSleepActivity.l(a)
                    });
                    c = ErrorType.b;
                    return;
                }
            } else
            {
                c = com.fitbit.sleep.ui.ErrorType.a;
                b = false;
                return;
            }
        }

        public void a(Object obj)
        {
            b((Activity)obj);
        }

        public void b(Activity activity)
        {
            if (b)
            {
                a.g();
                return;
            }
            if (c == null) goto _L2; else goto _L1
_L1:
            com.fitbit.e.a.a("LogSleepActivity", "Logging sleep was canceled because of %s", new Object[] {
                c
            });
            static class _cls9
            {

                static final int a[];
                static final int b[];

                static 
                {
                    b = new int[ErrorType.values().length];
                    try
                    {
                        b[com.fitbit.sleep.ui.ErrorType.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        b[ErrorType.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    a = new int[States.values().length];
                    try
                    {
                        a[States.b.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.fitbit.sleep.ui.States.a.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            _cls9.b[c.ordinal()];
            JVM INSTR tableswitch 1 2: default 72
        //                       1 84
        //                       2 97;
               goto _L2 _L3 _L4
_L2:
            LogSleepActivity.m(a).set(false);
            return;
_L3:
            com.fitbit.ui.s.a(activity, 0x7f08053e, 1).i();
            continue; /* Loop/switch isn't completed */
_L4:
            com.fitbit.ui.s.a(activity, 0x7f0804bf, 1).i();
            if (true) goto _L2; else goto _L5
_L5:
        }

        public void b(Object obj)
        {
            a((Activity)obj);
        }

        public a(Activity activity, SleepLogEntry sleeplogentry)
        {
            a = LogSleepActivity.this;
            super(activity);
            b = true;
            c = null;
            d = sleeplogentry;
        }
    }

    private static class b extends bf
    {

        private UUID a;
        private Long b;

        protected SleepLogEntry a()
        {
            if (a != null)
            {
                return ay.a().a(a);
            } else
            {
                return ay.a().a(b);
            }
        }

        protected Object f_()
        {
            return a();
        }

        public b(Context context, UUID uuid, Long long1)
        {
            super(context);
            a = uuid;
            b = long1;
        }
    }

    private class c
    {

        final LogSleepActivity a;
        private EditText b;
        private EditText c;
        private TextView d;

        void a(android.view.View.OnClickListener onclicklistener)
        {
            c.setOnClickListener(onclicklistener);
        }

        void a(Date date)
        {
            c(date);
            b(date);
        }

        void a(boolean flag)
        {
            b.setEnabled(flag);
        }

        void b(android.view.View.OnClickListener onclicklistener)
        {
            b.setOnClickListener(onclicklistener);
        }

        void b(Date date)
        {
            if (c != null)
            {
                date = com.fitbit.util.format.e.m(a, date);
                c.setText(date);
            }
        }

        void c(Date date)
        {
            if (b != null)
            {
                date = com.fitbit.util.format.e.j(a, date);
                b.setText(date);
            }
        }

        c(int i1, int j1)
        {
            a = LogSleepActivity.this;
            super();
            logsleepactivity = findViewById(i1);
            c = (EditText)findViewById(0x7f11045d);
            c.setId(bq.a());
            b = (EditText)findViewById(0x7f11045c);
            b.setId(bq.a());
            d = (TextView)findViewById(0x7f11045b);
            d.setId(bq.a());
            d.setText(j1);
        }
    }


    protected static final String a = "EXTRA_STATE";
    protected static final String b = "EXTRA_LOG_DATE";
    protected static final String c = "EXTRA_SLEEP_LOG_ENTRY_UUID";
    protected static final String d = "EXTRA_SLEEP_LOG_ENTRY_ID";
    protected static final String e = "hasChanges";
    protected static final String f = "savedStartDate";
    protected static final String g = "savedEndDate";
    private static final String h = "LogSleepActivity";
    private static final String i = "startDatePicker";
    private static final String j = "endDatePicker";
    private static final String k = "startTimePicker";
    private static final String l = "endTimePicker";
    private static final String m = "com.fitbit.sleep.ui.LogSleepActivity.DELETE_LOG_DIALOG";
    private final android.app.DatePickerDialog.OnDateSetListener A = new android.app.DatePickerDialog.OnDateSetListener() {

        final LogSleepActivity a;

        public void onDateSet(DatePicker datepicker, int i1, int j1, int k1)
        {
            com.fitbit.sleep.ui.LogSleepActivity.a(a);
            LogSleepActivity.b(a).set(1, i1);
            LogSleepActivity.b(a).set(2, j1);
            LogSleepActivity.b(a).set(5, k1);
            LogSleepActivity.c(a);
            LogSleepActivity.d(a);
        }

            
            {
                a = LogSleepActivity.this;
                super();
            }
    };
    private final android.app.DatePickerDialog.OnDateSetListener B = new android.app.DatePickerDialog.OnDateSetListener() {

        final LogSleepActivity a;

        public void onDateSet(DatePicker datepicker, int i1, int j1, int k1)
        {
            com.fitbit.sleep.ui.LogSleepActivity.a(a);
            com.fitbit.sleep.ui.LogSleepActivity.e(a).set(1, i1);
            com.fitbit.sleep.ui.LogSleepActivity.e(a).set(2, j1);
            com.fitbit.sleep.ui.LogSleepActivity.e(a).set(5, k1);
            com.fitbit.sleep.ui.LogSleepActivity.f(a);
            LogSleepActivity.d(a);
        }

            
            {
                a = LogSleepActivity.this;
                super();
            }
    };
    private android.app.TimePickerDialog.OnTimeSetListener C;
    private android.app.TimePickerDialog.OnTimeSetListener D;
    private AtomicBoolean E;
    private States n;
    private Date o;
    private Long p;
    private UUID q;
    private View r;
    private SleepLogEntry s;
    private Calendar t;
    private Calendar u;
    private Calendar v;
    private Calendar w;
    private Boolean x;
    private c y;
    private c z;

    public LogSleepActivity()
    {
        p = Long.valueOf(-1L);
        x = new Boolean(false);
        C = new android.app.TimePickerDialog.OnTimeSetListener() {

            final LogSleepActivity a;

            public void onTimeSet(TimePicker timepicker, int i1, int j1)
            {
                com.fitbit.sleep.ui.LogSleepActivity.a(a);
                LogSleepActivity.b(a).set(11, i1);
                LogSleepActivity.b(a).set(12, j1);
                if (i1 == com.fitbit.sleep.ui.LogSleepActivity.e(a).get(11) && j1 == com.fitbit.sleep.ui.LogSleepActivity.e(a).get(12))
                {
                    com.fitbit.sleep.ui.LogSleepActivity.e(a).add(12, 1);
                }
                LogSleepActivity.c(a);
                LogSleepActivity.d(a);
            }

            
            {
                a = LogSleepActivity.this;
                super();
            }
        };
        D = new android.app.TimePickerDialog.OnTimeSetListener() {

            final LogSleepActivity a;

            public void onTimeSet(TimePicker timepicker, int i1, int j1)
            {
                com.fitbit.sleep.ui.LogSleepActivity.a(a);
                com.fitbit.sleep.ui.LogSleepActivity.e(a).set(11, i1);
                com.fitbit.sleep.ui.LogSleepActivity.e(a).set(12, j1);
                if (i1 == LogSleepActivity.b(a).get(11) && j1 == LogSleepActivity.b(a).get(12))
                {
                    LogSleepActivity.b(a).add(12, -1);
                }
                com.fitbit.sleep.ui.LogSleepActivity.f(a);
                LogSleepActivity.d(a);
            }

            
            {
                a = LogSleepActivity.this;
                super();
            }
        };
        E = new AtomicBoolean(false);
    }

    public static Intent a(Context context, SleepLogEntry sleeplogentry, Date date)
    {
        context = new Intent(context, com/fitbit/sleep/ui/LogSleepActivity);
        context.putExtra("EXTRA_LOG_DATE", date);
        context.putExtra("EXTRA_STATE", States.b);
        if (sleeplogentry.getUuid() != null)
        {
            context.putExtra("EXTRA_SLEEP_LOG_ENTRY_UUID", sleeplogentry.getUuid());
            return context;
        } else
        {
            context.putExtra("EXTRA_SLEEP_LOG_ENTRY_ID", sleeplogentry.getEntityId());
            return context;
        }
    }

    public static Intent a(Context context, Date date)
    {
        context = new Intent(context, com/fitbit/sleep/ui/LogSleepActivity);
        context.putExtra("EXTRA_LOG_DATE", date);
        context.putExtra("EXTRA_STATE", com.fitbit.sleep.ui.States.a);
        return context;
    }

    private static Calendar a(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.clear(10);
        calendar.clear(11);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        calendar.set(11, 23);
        calendar.add(6, -1);
        return calendar;
    }

    static void a(LogSleepActivity logsleepactivity)
    {
        logsleepactivity.l();
    }

    static Calendar b(LogSleepActivity logsleepactivity)
    {
        return logsleepactivity.t;
    }

    private static Calendar b(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.clear(10);
        calendar.clear(11);
        calendar.clear(12);
        calendar.clear(13);
        calendar.clear(14);
        if (com.fitbit.util.o.i(date))
        {
            calendar.set(11, 10);
            date = Calendar.getInstance();
            if (date.compareTo(calendar) == 1)
            {
                return calendar;
            } else
            {
                return date;
            }
        } else
        {
            calendar.set(11, 7);
            return calendar;
        }
    }

    static void c(LogSleepActivity logsleepactivity)
    {
        logsleepactivity.n();
    }

    static void d(LogSleepActivity logsleepactivity)
    {
        logsleepactivity.k();
    }

    static Calendar e(LogSleepActivity logsleepactivity)
    {
        return logsleepactivity.u;
    }

    static void f(LogSleepActivity logsleepactivity)
    {
        logsleepactivity.m();
    }

    static void g(LogSleepActivity logsleepactivity)
    {
        logsleepactivity.p();
    }

    private void h()
    {
        if (v != null)
        {
            t = (Calendar)v.clone();
        }
        if (w != null)
        {
            u = (Calendar)w.clone();
        }
        i();
    }

    static void h(LogSleepActivity logsleepactivity)
    {
        logsleepactivity.r();
    }

    private void i()
    {
        SleepTimePickerDialogFragment sleeptimepickerdialogfragment = (SleepTimePickerDialogFragment)getSupportFragmentManager().findFragmentByTag("startTimePicker");
        if (sleeptimepickerdialogfragment != null)
        {
            sleeptimepickerdialogfragment.a(C);
        }
        sleeptimepickerdialogfragment = (SleepTimePickerDialogFragment)getSupportFragmentManager().findFragmentByTag("endTimePicker");
        if (sleeptimepickerdialogfragment != null)
        {
            sleeptimepickerdialogfragment.a(D);
        }
    }

    static void i(LogSleepActivity logsleepactivity)
    {
        logsleepactivity.q();
    }

    private void j()
    {
        y = new c(0x7f110159, 0x7f0804cc);
        y.a(new android.view.View.OnClickListener() {

            final LogSleepActivity a;

            public void onClick(View view)
            {
                LogSleepActivity.g(a);
            }

            
            {
                a = LogSleepActivity.this;
                super();
            }
        });
        y.b(new android.view.View.OnClickListener() {

            final LogSleepActivity a;

            public void onClick(View view)
            {
                LogSleepActivity.h(a);
            }

            
            {
                a = LogSleepActivity.this;
                super();
            }
        });
        z = new c(0x7f11015b, 0x7f0804ca);
        z.a(new android.view.View.OnClickListener() {

            final LogSleepActivity a;

            public void onClick(View view)
            {
                LogSleepActivity.i(a);
            }

            
            {
                a = LogSleepActivity.this;
                super();
            }
        });
        z.b(new android.view.View.OnClickListener() {

            final LogSleepActivity a;

            public void onClick(View view)
            {
                LogSleepActivity.j(a);
            }

            
            {
                a = LogSleepActivity.this;
                super();
            }
        });
        com.fitbit.sleep.ui._cls9.a[n.ordinal()];
        JVM INSTR tableswitch 1 2: default 128
    //                   1 180
    //                   2 190;
           goto _L1 _L2 _L3
_L1:
        k();
        if (q != null || p.longValue() >= 0L)
        {
            r.setVisibility(4);
            E.set(true);
            getSupportLoaderManager().initLoader(25, null, this);
        }
        return;
_L2:
        setTitle(0x7f080174);
        continue; /* Loop/switch isn't completed */
_L3:
        setTitle(0x7f08039c);
        x = Boolean.valueOf(true);
        if (true) goto _L1; else goto _L4
_L4:
    }

    static void j(LogSleepActivity logsleepactivity)
    {
        logsleepactivity.s();
    }

    static UUID k(LogSleepActivity logsleepactivity)
    {
        return logsleepactivity.q;
    }

    private void k()
    {
        y.a(t.getTime());
        z.a(u.getTime());
    }

    static Long l(LogSleepActivity logsleepactivity)
    {
        return logsleepactivity.p;
    }

    private void l()
    {
        if (!x.booleanValue())
        {
            x = Boolean.valueOf(true);
        }
    }

    static AtomicBoolean m(LogSleepActivity logsleepactivity)
    {
        return logsleepactivity.E;
    }

    private void m()
    {
        if (com.fitbit.util.o.a(t, u) > 0)
        {
            t.set(1, u.get(1));
            t.set(6, u.get(6) - 1);
            return;
        } else
        {
            t.set(1, u.get(1));
            t.set(6, u.get(6));
            return;
        }
    }

    private void n()
    {
        if (com.fitbit.util.o.a(t, u) > 0)
        {
            u.set(1, t.get(1));
            u.set(6, t.get(6) + 1);
            if (u.getTime().getTime() > u())
            {
                u.add(6, -1);
                com.fitbit.util.o.a(t);
                if (u.get(11) == t.get(11) && u.get(12) == t.get(12))
                {
                    t.add(12, -1);
                }
            }
            return;
        } else
        {
            u.set(1, t.get(1));
            u.set(6, t.get(6));
            return;
        }
    }

    private void o()
    {
        Intent intent = SleepLoggingLandingActivity.a(this);
        intent.setFlags(0x4000000);
        startActivity(intent);
    }

    private void p()
    {
        SleepTimePickerDialogFragment sleeptimepickerdialogfragment = new SleepTimePickerDialogFragment(C, t.get(11), t.get(12));
        ad.a(getSupportFragmentManager(), "startTimePicker", sleeptimepickerdialogfragment);
    }

    private void q()
    {
        SleepTimePickerDialogFragment sleeptimepickerdialogfragment = new SleepTimePickerDialogFragment(D, u.get(11), u.get(12));
        ad.a(getSupportFragmentManager(), "endTimePicker", sleeptimepickerdialogfragment);
    }

    private void r()
    {
        CalendarPickerDialogFragment calendarpickerdialogfragment = (CalendarPickerDialogFragment)getSupportFragmentManager().findFragmentByTag("startDatePicker");
        if (calendarpickerdialogfragment != null)
        {
            calendarpickerdialogfragment.dismiss();
        }
        CalendarPickerDialogFragment.a(A, t.get(1), t.get(2), t.get(5), v(), u()).show(getSupportFragmentManager(), "startDatePicker");
    }

    private void s()
    {
        CalendarPickerDialogFragment calendarpickerdialogfragment = (CalendarPickerDialogFragment)getSupportFragmentManager().findFragmentByTag("endDatePicker");
        if (calendarpickerdialogfragment != null)
        {
            calendarpickerdialogfragment.dismiss();
        }
        CalendarPickerDialogFragment.a(B, u.get(1), u.get(2), u.get(5), v(), u()).show(getSupportFragmentManager(), "endDatePicker");
    }

    private Calendar t()
    {
        return new GregorianCalendar(bn.a());
    }

    private long u()
    {
        Calendar calendar = t();
        com.fitbit.util.o.c(calendar);
        return calendar.getTime().getTime();
    }

    private long v()
    {
        Calendar calendar = t();
        calendar.setTime(o);
        calendar.add(2, -2);
        return calendar.getTime().getTime();
    }

    private void w()
    {
        if (!x.booleanValue())
        {
            com.fitbit.e.a.a("LogSleepActivity", "Sleep log hasn't any changes", new Object[0]);
            g();
        } else
        {
            Date date = t.getTime();
            long l1 = u.getTimeInMillis() - t.getTimeInMillis();
            long l2 = l1 / 60000L;
            SleepLogEntry sleeplogentry;
            if (s != null)
            {
                sleeplogentry = s;
            } else
            {
                sleeplogentry = new SleepLogEntry();
            }
            sleeplogentry.a(date);
            sleeplogentry.a((int)l1);
            sleeplogentry.i((int)l2);
            sleeplogentry.c((int)l2);
            if (s == null)
            {
                sleeplogentry.setLogDate(u.getTime());
            }
            if (E.compareAndSet(false, true))
            {
                com.fitbit.util.f.a(new a(this, sleeplogentry));
                return;
            }
        }
    }

    private void x()
    {
        if (s != null && E.compareAndSet(false, true))
        {
            DeleteSleepLogConfirmationDialog deletesleeplogconfirmationdialog = DeleteSleepLogConfirmationDialog.a(this, s);
            ad.a(getSupportFragmentManager(), "com.fitbit.sleep.ui.LogSleepActivity.DELETE_LOG_DIALOG", deletesleeplogconfirmationdialog);
        }
    }

    public void a(Loader loader, SleepLogEntry sleeplogentry)
    {
        if (sleeplogentry == null)
        {
            o();
            return;
        } else
        {
            s = sleeplogentry;
            t.setTime(sleeplogentry.a());
            u.setTimeInMillis(sleeplogentry.a().getTime() + (long)sleeplogentry.e());
            h();
            k();
            loader = AnimationUtils.loadAnimation(this, 0x10a0000);
            r.startAnimation(loader);
            r.setVisibility(0);
            E.set(false);
            return;
        }
    }

    public void e()
    {
        E.set(false);
        o();
        finish();
    }

    public void f()
    {
        E.set(false);
    }

    public void g()
    {
        o();
        finish();
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        if (bundle != null)
        {
            x = (Boolean)bundle.getSerializable("hasChanges");
            w = (Calendar)bundle.getSerializable("savedEndDate");
            v = (Calendar)bundle.getSerializable("savedStartDate");
        }
        bundle = getIntent();
        if (getIntent().hasExtra("EXTRA_STATE"))
        {
            n = (States)bundle.getSerializableExtra("EXTRA_STATE");
        }
        if (getIntent().hasExtra("EXTRA_SLEEP_LOG_ENTRY_UUID"))
        {
            q = (UUID)bundle.getSerializableExtra("EXTRA_SLEEP_LOG_ENTRY_UUID");
        }
        if (getIntent().hasExtra("EXTRA_SLEEP_LOG_ENTRY_ID"))
        {
            p = (Long)bundle.getSerializableExtra("EXTRA_SLEEP_LOG_ENTRY_ID");
        }
        if (getIntent().hasExtra("EXTRA_LOG_DATE"))
        {
            o = (Date)bundle.getSerializableExtra("EXTRA_LOG_DATE");
        }
        t = a(o);
        u = b(o);
        h();
        setContentView(0x7f040032);
        r = findViewById(0x1020002);
        j();
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new b(this, q, p);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(0x7f12000c, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (SleepLogEntry)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (super.onOptionsItemSelected(menuitem))
        {
            return true;
        }
        int i1 = menuitem.getItemId();
        if (i1 == 0x7f1104df)
        {
            x();
            return true;
        }
        if (i1 == 0x7f110094)
        {
            w();
            return true;
        } else
        {
            return false;
        }
    }

    public boolean onPrepareOptionsMenu(Menu menu)
    {
        MenuItem menuitem = menu.findItem(0x7f1104df);
        boolean flag;
        if (States.b == n)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        menuitem.setVisible(flag);
        return super.onPrepareOptionsMenu(menu);
    }

    protected void onResume()
    {
        super.onResume();
        y.a(t.getTime());
        z.a(u.getTime());
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        v = (Calendar)t.clone();
        w = (Calendar)u.clone();
        bundle.putSerializable("hasChanges", x);
        bundle.putSerializable("savedEndDate", w);
        bundle.putSerializable("savedStartDate", v);
    }
}
