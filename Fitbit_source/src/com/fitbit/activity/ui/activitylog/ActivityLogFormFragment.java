// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.activity.ui.activitylog;

import android.content.Context;
import android.os.Bundle;
import android.os.ParcelUuid;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v7.widget.SwitchCompat;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.text.format.DateUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.CompoundButton;
import android.widget.DatePicker;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.TimePicker;
import android.widget.Toast;
import com.fitbit.activity.a;
import com.fitbit.data.bl.ActivityBusinessLogic;
import com.fitbit.data.bl.an;
import com.fitbit.data.domain.ActivityItem;
import com.fitbit.data.domain.ActivityLevel;
import com.fitbit.data.domain.ActivityLogEntry;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.runtrack.Duration;
import com.fitbit.runtrack.SupportedActivity;
import com.fitbit.ui.TimePickerDialogFragment;
import com.fitbit.ui.dialogs.DatePickerFragment;
import com.fitbit.ui.dialogs.DurationPickerDialogFragment;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.util.bf;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.fitbit.activity.ui.activitylog:
//            c, b, a

public class ActivityLogFormFragment extends FitbitFragment
    implements android.app.DatePickerDialog.OnDateSetListener, android.app.TimePickerDialog.OnTimeSetListener, android.support.v4.app.LoaderManager.LoaderCallbacks, TextWatcher, android.view.View.OnClickListener, android.view.View.OnFocusChangeListener, android.widget.AdapterView.OnItemClickListener, android.widget.CompoundButton.OnCheckedChangeListener, android.widget.SeekBar.OnSeekBarChangeListener
{
    public static class ValidationException extends Exception
    {

        private static final long serialVersionUID = 1L;
        private final int resourceId;

        public ValidationException(int i1, String s1)
        {
            super(s1);
            resourceId = i1;
        }
    }


    private static final String a = "";
    private static final String b = "ALL_IS_EDITABLE";
    private static final int c = 15;
    private static final long d = 0x1b7740L;
    private static final Bundle e = new Bundle();
    private static final String f = "distanceCovered";
    private static final String g = "calories";
    private static final String h = "estimated_calories";
    private static final String i = "startTimeCalendar";
    private static final String j = "duration";
    private static final String k = "date-picker";
    private static final String l = "time-picker";
    private static final String m = "duration-picker";
    private static final String n = "LoaderKey";
    private static final String o = "LogId";
    private static final int p = 0x7f110292;
    private SwitchCompat A;
    private SeekBar B;
    private View C;
    private Calendar D;
    private Duration E;
    private View F;
    private ActivityItem G;
    private Integer H;
    private Integer I;
    private Length J;
    private boolean K;
    private NumberFormat L;
    private NumberFormat M;
    private DateFormat N;
    private DateFormat O;
    private boolean P;
    private Profile Q;
    private double R;
    private double S;
    private TextWatcher T;
    private AutoCompleteTextView q;
    private TextView r;
    private TextView s;
    private TextView t;
    private TextView u;
    private TextView v;
    private TextView w;
    private View x;
    private TextView y;
    private TextView z;

    public ActivityLogFormFragment()
    {
        T = new TextWatcher() {

            final ActivityLogFormFragment a;

            public void afterTextChanged(Editable editable)
            {
                if (com.fitbit.activity.ui.activitylog.ActivityLogFormFragment.a(a))
                {
                    return;
                }
                try
                {
                    if (!TextUtils.isEmpty(editable))
                    {
                        com.fitbit.activity.ui.activitylog.ActivityLogFormFragment.a(a, Integer.valueOf((int)Math.rint(com.fitbit.util.format.e.a(String.valueOf(editable)))));
                    }
                }
                // Misplaced declaration of an exception variable
                catch (Editable editable)
                {
                    com.fitbit.activity.ui.activitylog.ActivityLogFormFragment.a(a, null);
                }
                a.K_();
            }

            public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = ActivityLogFormFragment.this;
                super();
            }
        };
        setArguments(e);
    }

    public static final ActivityLogFormFragment a(ActivityLogEntry activitylogentry, int i1)
    {
        Bundle bundle = new Bundle();
        activitylogentry = activitylogentry.getUuid();
        bundle.putInt("LoaderKey", i1);
        bundle.putParcelable("LogId", new ParcelUuid(activitylogentry));
        activitylogentry = new ActivityLogFormFragment();
        activitylogentry.setArguments(bundle);
        return activitylogentry;
    }

    static Length a(ActivityLogFormFragment activitylogformfragment, Length length)
    {
        activitylogformfragment.J = length;
        return length;
    }

    static Integer a(ActivityLogFormFragment activitylogformfragment, Integer integer)
    {
        activitylogformfragment.H = integer;
        return integer;
    }

    private void a(View view)
    {
        view = getChildFragmentManager().findFragmentByTag("duration-picker");
        FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
        if (view != null)
        {
            fragmenttransaction.remove(view);
        }
        int i1 = E.d();
        int j1 = (int)E.b();
        (new DurationPickerDialogFragment(new c(this), j1, i1)).show(fragmenttransaction, "duration-picker");
    }

    private static void a(Calendar calendar)
    {
        int ai[] = new int[2];
        int[] _tmp = ai;
        ai[0] = 14;
        ai[1] = 13;
        int j1 = ai.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            calendar.clear(ai[i1]);
        }

    }

    static boolean a(ActivityLogFormFragment activitylogformfragment)
    {
        return activitylogformfragment.K;
    }

    static Length b(ActivityLogFormFragment activitylogformfragment)
        throws ParseException
    {
        return activitylogformfragment.h();
    }

    private void b(View view)
    {
        view = getChildFragmentManager().findFragmentByTag("time-picker");
        FragmentTransaction fragmenttransaction = getChildFragmentManager().beginTransaction();
        if (view != null)
        {
            fragmenttransaction.remove(view);
        }
        (new TimePickerDialogFragment(this, D.get(11), D.get(12), 0x7f080522)).show(fragmenttransaction, "time-picker");
    }

    private void b(ActivityItem activityitem)
    {
        q.setTag(0x7f110393, activityitem);
        if (activityitem != G && activityitem != null)
        {
            Bundle bundle = new Bundle();
            bundle.putLong("id", activityitem.getServerId());
            getLoaderManager().initLoader(0x7f110292, bundle, new b(this));
        }
    }

    private void c()
    {
        boolean flag = K;
        K = true;
        H = null;
        w.setText(String.valueOf(I));
        double d1;
        if (R != S)
        {
            d1 = R + (S - R) / 2D;
        } else
        {
            d1 = R;
        }
        if (l())
        {
            Object obj = J.a(com.fitbit.data.domain.Length.LengthUnits.MILES);
            long l1 = E.a(TimeUnit.MILLISECONDS);
            obj = com.fitbit.activity.a.a(G, ((Length) (obj)).b() / ((double)l1 / 3600000D));
            if (obj != null)
            {
                d1 = ((ActivityLevel) (obj)).h();
            } else
            {
                d1 = G.b();
            }
        }
        d1 = Math.max(d1, 1.0D);
        d1 = Math.max(Math.min(S, d1), R);
        B.setOnSeekBarChangeListener(null);
        B.setProgress((int)(((d1 - R) / (S - R)) * 100D));
        B.setOnSeekBarChangeListener(this);
        K = flag;
    }

    private void c(View view)
    {
        view = getChildFragmentManager().findFragmentByTag("date-picker");
        if (view != null)
        {
            getChildFragmentManager().beginTransaction().remove(view);
        }
        view = new DatePickerFragment();
        Bundle bundle = DatePickerFragment.a(D);
        Calendar calendar = Calendar.getInstance();
        calendar.add(2, 1);
        bundle.putLong(DatePickerFragment.b, calendar.getTime().getTime());
        view.setArguments(bundle);
        view.a(this);
        view.show(getActivity().getSupportFragmentManager(), "date-picker");
    }

    static void c(ActivityLogFormFragment activitylogformfragment)
    {
        activitylogformfragment.q();
    }

    private void d()
    {
        View view = x;
        int i1;
        if (n() && G.f())
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        u.setEnabled(P);
        if (n())
        {
            TextView textview = y;
            long l1;
            if (o())
            {
                i1 = 0x7f080439;
            } else
            {
                i1 = 0x7f0804e4;
            }
            textview.setText(i1);
        }
        if (l() && n())
        {
            if (o())
            {
                l1 = Math.round((double)E.a(TimeUnit.MILLISECONDS) / J.b());
                z.setText(com.fitbit.util.format.e.a(getActivity(), l1, TimeUnit.MILLISECONDS));
                return;
            }
            double d1 = J.b() / (double)E.a(TimeUnit.MILLISECONDS);
            if (Q.t() == com.fitbit.data.domain.Length.LengthUnits.MILES)
            {
                i1 = 0x7f0803d4;
            } else
            {
                i1 = 0x7f0802a0;
            }
            z.setText(getString(i1, new Object[] {
                L.format(d1 * 3600000D)
            }));
            return;
        } else
        {
            z.setText("");
            return;
        }
    }

    private void f()
    {
        ActivityItem activityitem1 = G;
        ActivityItem activityitem = activityitem1;
        if (activityitem1 == null)
        {
            activityitem = (ActivityItem)q.getTag(0x7f110393);
        }
        if (activityitem == null && !TextUtils.isEmpty(q.getText()) && TextUtils.getTrimmedLength(q.getText()) > 0)
        {
            q.setText("");
        } else
        if (activityitem != null && !TextUtils.equals(activityitem.a(), q.getText()))
        {
            q.setText(activityitem.a());
            return;
        }
    }

    private void g()
    {
        String s1 = N.format(D.getTime());
        s.setText(s1);
        t.setText(O.format(D.getTime()));
        s1 = DateUtils.formatElapsedTime(E.a(TimeUnit.SECONDS));
        r.setText(s1);
        s.setEnabled(P);
        r.setEnabled(P);
    }

    private Length h()
        throws ParseException
    {
        return new Length(com.fitbit.util.format.e.a(String.valueOf(u.getText())), Q.t());
    }

    private void i()
    {
        if (!n())
        {
            return;
        } else
        {
            j();
            return;
        }
    }

    private void j()
    {
        Iterator iterator = G.d().iterator();
        double d1 = 1.0D;
        double d2 = 1.0D;
        while (iterator.hasNext()) 
        {
            ActivityLevel activitylevel = (ActivityLevel)iterator.next();
            d2 = Math.min(d2, activitylevel.h());
            d1 = Math.max(d1, activitylevel.h());
        }
        d2 = Math.min(d2, G.b());
        d1 = Math.max(d1, G.b());
        d2 = Math.max(1.0D, d2);
        d1 = Math.max(1.0D, d1);
        B.setOnSeekBarChangeListener(null);
        B.setMax(100);
        B.setProgress(50);
        B.setOnSeekBarChangeListener(this);
        R = d2;
        S = d1;
    }

    private void k()
    {
        boolean flag2 = true;
        boolean flag = false;
        if (!n())
        {
            A.setChecked(false);
        }
        Object obj;
        SwitchCompat switchcompat;
        int i1;
        boolean flag1;
        if (m())
        {
            if (!TextUtils.equals(String.valueOf(H), w.getText()))
            {
                w.setText(String.valueOf(H));
            }
        } else
        if (I != null)
        {
            w.setText(String.valueOf(I));
        } else
        {
            w.setText("");
        }
        obj = w;
        if (n() && !A.isChecked())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((TextView) (obj)).setEnabled(flag1);
        F.setEnabled(n());
        obj = A;
        if (n() && !G.f() && S != R)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((SwitchCompat) (obj)).setEnabled(flag1);
        obj = A;
        if (n() && !G.f() && S != R)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((SwitchCompat) (obj)).setVisibility(i1);
        if (S == R)
        {
            A.setChecked(false);
        }
        obj = w;
        if (P && !A.isChecked())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((TextView) (obj)).setEnabled(flag1);
        obj = A;
        if (P && n())
        {
            flag1 = flag2;
        } else
        {
            flag1 = false;
        }
        ((SwitchCompat) (obj)).setEnabled(flag1);
        obj = C;
        if (P && A.isChecked())
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 8;
        }
        ((View) (obj)).setVisibility(i1);
        switchcompat = A;
        if (A.isChecked())
        {
            obj = A.getTextOn();
        } else
        {
            obj = A.getTextOff();
        }
        switchcompat.setText(((CharSequence) (obj)));
    }

    private boolean l()
    {
        return J != null && J.a(0.10000000000000001D, 1.7976931348623157E+308D, com.fitbit.data.domain.Length.LengthUnits.KM);
    }

    private boolean m()
    {
        return H != null;
    }

    private boolean n()
    {
        return G != null && G.e();
    }

    private boolean o()
    {
        return n() && SupportedActivity.a(G.getServerId()) != null;
    }

    private void p()
    {
        if (!n())
        {
            return;
        }
        long l1 = E.a(TimeUnit.MINUTES);
        double d2 = R + (double)((float)B.getProgress() / 100F) * (S - R);
        double d1 = d2;
        if (G.f())
        {
            d1 = d2;
            if (l())
            {
                d1 = com.fitbit.activity.a.a(G, (J.a(com.fitbit.data.domain.Length.LengthUnits.MILES).b() * 3600000D) / (double)E.a(TimeUnit.MILLISECONDS)).h();
            }
        }
        I = Integer.valueOf((int)Math.rint(com.fitbit.activity.a.a(d1 * (double)l1, D.getTime())));
    }

    private void q()
    {
        H = null;
        p();
    }

    protected void K_()
    {
        super.K_();
        K = true;
        g();
        d();
        f();
        k();
        K = false;
    }

    public void a()
    {
        E = new Duration(0x1b7740L);
        D = Calendar.getInstance();
        D.add(14, (int)(-E.a(TimeUnit.MILLISECONDS)));
        G = null;
        a(D);
        K_();
    }

    public void a(int i1, int j1)
    {
        Duration duration = new Duration((long)i1 * 0x36ee80L + (long)j1 * 60000L);
        if (duration.a() != E.a())
        {
            E = duration;
            q();
            K_();
        }
    }

    public void a(Loader loader, ActivityLogEntry activitylogentry)
    {
        b(activitylogentry);
    }

    void a(ActivityItem activityitem)
    {
        G = activityitem;
        if (P)
        {
            I = null;
            H = null;
            J = null;
            u.setText("");
            i();
            p();
        }
        K_();
    }

    public void a(ActivityLogEntry activitylogentry)
        throws ValidationException
    {
        int i1;
        if (G == null)
        {
            throw new ValidationException(0x7f110393, getString(0x7f08044f));
        }
        Object obj = Calendar.getInstance();
        ((Calendar) (obj)).setTime(D.getTime());
        ((Calendar) (obj)).add(14, (int)E.a(TimeUnit.MILLISECONDS));
        if (((Calendar) (obj)).compareTo(Calendar.getInstance()) > 0)
        {
            throw new ValidationException(0x7f110296, getString(0x7f08018b));
        }
        obj = com.fitbit.util.o.a(D.getTime());
        activitylogentry.a(E.a(TimeUnit.MILLISECONDS), TimeUnit.MILLISECONDS);
        activitylogentry.a(new com.fitbit.data.domain.ActivityLogEntry.a(D.getTime()));
        activitylogentry.setLogDate(((Date) (obj)));
        activitylogentry.a(G);
        if (!l() && G.f())
        {
            if (o())
            {
                throw new ValidationException(0x7f11029e, getString(0x7f08044e));
            }
            try
            {
                J = h();
                if (!l())
                {
                    throw new ParseException("Invalid distance entered", 0);
                }
            }
            // Misplaced declaration of an exception variable
            catch (ActivityLogEntry activitylogentry)
            {
                throw new ValidationException(0x7f11029e, getString(0x7f08044e));
            }
        }
        if (G.f())
        {
            activitylogentry.a(J);
        }
        activitylogentry.c(G.a());
        try
        {
            i1 = (int)Math.round(com.fitbit.util.format.e.a(String.valueOf(w.getText())));
        }
        // Misplaced declaration of an exception variable
        catch (ActivityLogEntry activitylogentry)
        {
            throw new ValidationException(0x7f1102a6, getString(0x7f08044b));
        }
        if (i1 > 0)
        {
            break MISSING_BLOCK_LABEL_319;
        }
        throw new ParseException(getString(0x7f08044b), 0x7f1102a6);
        activitylogentry.c(i1);
        activitylogentry.d(i1);
        return;
    }

    public void afterTextChanged(Editable editable)
    {
        while (K || G == null || TextUtils.equals(String.valueOf(editable).trim(), G.a().trim())) 
        {
            return;
        }
        G = null;
        b(((ActivityItem) (null)));
    }

    public void b(ActivityLogEntry activitylogentry)
    {
        a();
        if (activitylogentry == null)
        {
            return;
        }
        D = Calendar.getInstance();
        D.setTime(activitylogentry.e());
        E = new Duration(activitylogentry.a(TimeUnit.MILLISECONDS));
        q.setTag(0x7f110393, activitylogentry.a());
        b(activitylogentry.a());
        J = activitylogentry.b();
        Object obj;
        int i1;
        boolean flag;
        if (activitylogentry.o())
        {
            i1 = activitylogentry.k();
        } else
        {
            i1 = activitylogentry.n();
        }
        obj = Integer.valueOf(i1);
        I = ((Integer) (obj));
        H = ((Integer) (obj));
        obj = A;
        if (!activitylogentry.o())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ((SwitchCompat) (obj)).setChecked(flag);
        P = false;
        K_();
    }

    public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }

    public void onCheckedChanged(CompoundButton compoundbutton, boolean flag)
    {
        if (K || compoundbutton.getId() != 0x7f1102a7)
        {
            return;
        } else
        {
            K_();
            return;
        }
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131821209: 
            a(view);
            return;

        case 2131821206: 
            c(view);
            return;

        case 2131820889: 
            b(view);
            return;

        case 2131821221: 
            c();
            break;
        }
        K_();
    }

    public void onCreate(Bundle bundle)
    {
        Object obj = null;
        super.onCreate(bundle);
        L = DecimalFormat.getNumberInstance();
        L.setMaximumFractionDigits(1);
        M = DecimalFormat.getNumberInstance();
        M.setMaximumFractionDigits(2);
        N = DateFormat.getTimeInstance(3);
        O = DateFormat.getDateInstance();
        Q = an.a().b();
        P = true;
        if (bundle != null)
        {
            P = bundle.getBoolean("ALL_IS_EDITABLE", true);
            int i1 = bundle.getInt("calories", -1);
            Integer integer;
            if (i1 > -1)
            {
                integer = Integer.valueOf(i1);
            } else
            {
                integer = null;
            }
            H = integer;
            i1 = bundle.getInt("estimated_calories", -1);
            integer = obj;
            if (i1 > -1)
            {
                integer = Integer.valueOf(i1);
            }
            I = integer;
            J = (Length)bundle.getParcelable("distanceCovered");
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        bundle = ((ParcelUuid)bundle.getParcelable("LogId")).getUuid();
        return new bf(getActivity(), bundle) {

            final UUID a;
            final ActivityLogFormFragment b;

            protected ActivityLogEntry a()
            {
                return ActivityBusinessLogic.a().a(a);
            }

            protected Object f_()
            {
                return a();
            }

            
            {
                b = ActivityLogFormFragment.this;
                a = uuid;
                super(context);
            }
        };
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04009f, viewgroup, false);
        q = (AutoCompleteTextView)layoutinflater.findViewById(0x7f110292);
        q.setThreshold(0);
        if (TextUtils.isEmpty(q.getText()))
        {
            q.setText("");
        }
        r = (TextView)layoutinflater.findViewById(0x7f110299);
        s = (TextView)layoutinflater.findViewById(0x7f110159);
        t = (TextView)layoutinflater.findViewById(0x7f110296);
        x = layoutinflater.findViewById(0x7f11029a);
        u = (TextView)layoutinflater.findViewById(0x7f11029e);
        v = (TextView)layoutinflater.findViewById(0x7f11029d);
        y = (TextView)layoutinflater.findViewById(0x7f11029f);
        z = (TextView)layoutinflater.findViewById(0x7f1102a1);
        w = (TextView)layoutinflater.findViewById(0x7f1102a6);
        A = (SwitchCompat)layoutinflater.findViewById(0x7f1102a7);
        F = layoutinflater.findViewById(0x7f1102a5);
        B = (SeekBar)layoutinflater.findViewById(0x7f1102a9);
        A.setOnCheckedChangeListener(this);
        C = layoutinflater.findViewById(0x7f1102a8);
        s.setOnClickListener(this);
        t.setOnClickListener(this);
        r.setOnClickListener(this);
        F.setOnClickListener(this);
        w.setOnFocusChangeListener(this);
        B.setOnSeekBarChangeListener(this);
        viewgroup = an.a().b().t();
        v.setText(viewgroup.getDisplayName());
        u.addTextChangedListener(new TextWatcher() {

            final ActivityLogFormFragment a;

            public void afterTextChanged(Editable editable)
            {
                if (com.fitbit.activity.ui.activitylog.ActivityLogFormFragment.a(a))
                {
                    return;
                }
                try
                {
                    com.fitbit.activity.ui.activitylog.ActivityLogFormFragment.a(a, ActivityLogFormFragment.b(a));
                }
                // Misplaced declaration of an exception variable
                catch (Editable editable)
                {
                    com.fitbit.activity.ui.activitylog.ActivityLogFormFragment.a(a, null);
                }
                ActivityLogFormFragment.c(a);
                a.K_();
            }

            public void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = ActivityLogFormFragment.this;
                super();
            }
        });
        a();
        if (bundle != null)
        {
            long l1 = bundle.getLong("startTimeCalendar", -1L);
            if (l1 != -1L)
            {
                D = Calendar.getInstance();
                D.setTimeInMillis(l1);
            }
            E = new Duration(bundle.getLong("duration", 0x1b7740L));
        }
        return layoutinflater;
    }

    public void onDateSet(DatePicker datepicker, int i1, int j1, int k1)
    {
        datepicker = Calendar.getInstance();
        Calendar calendar = Calendar.getInstance();
        calendar.set(i1, j1, k1);
        if (calendar.compareTo(datepicker) > 0)
        {
            Toast.makeText(getActivity(), 0x7f08018b, 0).show();
            return;
        } else
        {
            D.set(i1, j1, k1);
            q();
            K_();
            return;
        }
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (!K)
        {
            if (view.getId() == q.getId() && !flag)
            {
                K_();
            }
            if (view.getId() == w.getId())
            {
                if (flag)
                {
                    w.removeTextChangedListener(T);
                    return;
                } else
                {
                    w.addTextChangedListener(T);
                    return;
                }
            }
        }
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        if (!K)
        {
            if ((adapterview = ((AdapterView) (adapterview.getItemAtPosition(i1)))) instanceof ActivityItem)
            {
                adapterview = (ActivityItem)adapterview;
                getLoaderManager().destroyLoader(0x7f110292);
                b(adapterview);
                K_();
                return;
            }
        }
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ActivityLogEntry)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        a();
    }

    public void onProgressChanged(SeekBar seekbar, int i1, boolean flag)
    {
        if (K)
        {
            return;
        } else
        {
            H = Integer.valueOf((int)Math.rint(com.fitbit.activity.a.a((R + (double)((float)i1 / 100F) * (S - R)) * (double)E.a(TimeUnit.MINUTES), new Date())));
            K_();
            return;
        }
    }

    public void onResume()
    {
        super.onResume();
        DatePickerFragment datepickerfragment = (DatePickerFragment)getActivity().getSupportFragmentManager().findFragmentByTag("date-picker");
        if (datepickerfragment != null)
        {
            datepickerfragment.a(this);
        }
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("ALL_IS_EDITABLE", P);
        bundle.putLong("startTimeCalendar", D.getTimeInMillis());
        bundle.putLong("duration", E.a(TimeUnit.MILLISECONDS));
        if (H != null)
        {
            bundle.putInt("calories", H.intValue());
        }
        if (I != null)
        {
            bundle.putInt("estimated_calories", I.intValue());
        }
        bundle.putParcelable("distanceCovered", J);
    }

    public void onStartTrackingTouch(SeekBar seekbar)
    {
    }

    public void onStopTrackingTouch(SeekBar seekbar)
    {
    }

    public void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
    {
    }

    public void onTimeSet(TimePicker timepicker, int i1, int j1)
    {
        D.set(11, i1);
        D.set(12, j1);
        q();
        K_();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        q.setDropDownAnchor(0x7f11028f);
        q.setAdapter(new com.fitbit.activity.ui.activitylog.a());
        q.setOnItemClickListener(this);
        q.addTextChangedListener(this);
        q.setOnFocusChangeListener(this);
        if ((ParcelUuid)getArguments().getParcelable("LogId") != null)
        {
            getLoaderManager().initLoader(getArguments().getInt("LoaderKey", 0), getArguments(), this);
        }
    }

}
