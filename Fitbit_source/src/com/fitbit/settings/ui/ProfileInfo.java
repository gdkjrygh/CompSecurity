// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.settings.ui;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.DatePicker;
import android.widget.Toast;
import com.fitbit.customui.LengthPicker;
import com.fitbit.customui.ShadowButton;
import com.fitbit.customui.WeightPicker;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.cq;
import com.fitbit.data.bl.gd;
import com.fitbit.data.domain.Gender;
import com.fitbit.data.domain.Length;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.WeightLogEntry;
import com.fitbit.e.a;
import com.fitbit.profile.ui.ProfileSaveModel;
import com.fitbit.profile.ui.b;
import com.fitbit.ui.EditText;
import com.fitbit.ui.FixedFocusScrollView;
import com.fitbit.ui.dialogs.DatePickerFragment;
import com.fitbit.ui.dialogs.GenderDialogFragment;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.ui.s;
import com.fitbit.ui.views.OnboardingGenderPicker;
import com.fitbit.util.bn;
import com.fitbit.util.format.e;
import com.fitbit.util.o;
import com.fitbit.weight.Weight;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class ProfileInfo extends FitbitFragment
    implements android.app.DatePickerDialog.OnDateSetListener, android.view.View.OnFocusChangeListener, com.fitbit.ui.views.OnboardingGenderPicker.a
{
    public static interface a
    {

        public abstract void e();
    }


    private static final String a = "PersonalInfo";
    private static final String b = (new StringBuilder()).append(com/fitbit/settings/ui/ProfileInfo.getName()).append(".FRAGMENT_DATE_PICKER").toString();
    private static final String c = (new StringBuilder()).append(com/fitbit/settings/ui/ProfileInfo.getName()).append(".FRAGMENT_GENDER_PICKER").toString();
    private Profile d;
    private EditText e;
    private FixedFocusScrollView f;
    private EditText g;
    private LengthPicker h;
    private WeightPicker i;
    private EditText j;
    private ShadowButton k;
    private b l;
    private boolean m;
    private ProfileSaveModel n;
    private a o;

    public ProfileInfo()
    {
        m = false;
    }

    private void a(int i1, int j1, int k1)
    {
        int i2 = com.fitbit.util.o.a(getActivity());
        int l1 = i1;
        if (i1 < i2)
        {
            l1 = i2;
        }
        GregorianCalendar gregoriancalendar = new GregorianCalendar(bn.c());
        gregoriancalendar.set(1, l1);
        gregoriancalendar.set(2, j1);
        gregoriancalendar.set(5, k1);
        gregoriancalendar.set(11, 0);
        gregoriancalendar.set(12, 0);
        gregoriancalendar.set(13, 0);
        a(gregoriancalendar.getTime());
    }

    private void a(Gender gender)
    {
        l.a(gender);
        f(true);
    }

    static void a(ProfileInfo profileinfo)
    {
        profileinfo.g();
    }

    private void a(EditText edittext)
    {
        edittext.setInputType(0);
        edittext.setKeyListener(null);
        edittext.setOnFocusChangeListener(this);
    }

    private void a(Date date)
    {
        l.a(date);
        c(true);
    }

    private void a(boolean flag)
    {
        b(flag);
        c(flag);
        d(flag);
        e(flag);
        f(flag);
    }

    static void b(ProfileInfo profileinfo)
    {
        profileinfo.h();
    }

    private void b(boolean flag)
    {
        if (l.a() != null)
        {
            e.setText(l.a());
            if (flag)
            {
                e.setError(null);
            }
        }
    }

    private void c()
    {
        d = an.a().b();
        e.addTextChangedListener(new _cls4());
        f.a(new _cls5());
        a(g);
        a(j);
        if (h != null)
        {
            h.b(1);
        }
        d();
        a(true);
    }

    static void c(ProfileInfo profileinfo)
    {
        profileinfo.i();
    }

    private void c(boolean flag)
    {
        g.setText(com.fitbit.util.format.e.e(getActivity().getApplicationContext(), l.b()));
        if (l.j() == 0 && flag)
        {
            g.setError(null);
        }
    }

    static b d(ProfileInfo profileinfo)
    {
        return profileinfo.l;
    }

    private void d()
    {
        l = new b();
        l.a(d);
        l.a(n);
    }

    private void d(boolean flag)
    {
        h.a(l.c());
        if (flag)
        {
            h.a(null);
        }
    }

    private void e(boolean flag)
    {
        i.a(l.d());
        if (flag)
        {
            i.a(null);
        }
    }

    static boolean e(ProfileInfo profileinfo)
    {
        return profileinfo.m;
    }

    static EditText f(ProfileInfo profileinfo)
    {
        return profileinfo.e;
    }

    private void f()
    {
        e.i();
        g.i();
        h.k();
        i.k();
        j.i();
    }

    private void f(boolean flag)
    {
        int i1 = l.e().getStringId();
        if (i1 > 0)
        {
            j.setText(i1);
        }
        if (flag)
        {
            j.setError(null);
        }
    }

    private void g()
    {
        Calendar calendar = Calendar.getInstance(bn.c());
        calendar.setTime(l.b());
        Object obj = getActivity().getSupportFragmentManager().findFragmentByTag(b);
        if (obj != null)
        {
            getActivity().getSupportFragmentManager().beginTransaction().remove(((android.support.v4.app.Fragment) (obj)));
        }
        obj = new DatePickerFragment();
        ((DatePickerFragment) (obj)).setArguments(DatePickerFragment.a(calendar));
        ((DatePickerFragment) (obj)).a(this);
        ((DatePickerFragment) (obj)).show(getActivity().getSupportFragmentManager(), b);
    }

    private void h()
    {
        GenderDialogFragment genderdialogfragment = (GenderDialogFragment)getActivity().getSupportFragmentManager().findFragmentByTag(c);
        if (genderdialogfragment != null)
        {
            genderdialogfragment.dismiss();
        }
        genderdialogfragment = GenderDialogFragment.c();
        genderdialogfragment.a(l.e());
        genderdialogfragment.a(this);
        genderdialogfragment.show(getFragmentManager(), c);
    }

    private void i()
    {
        d = an.a().b();
        if (d != null && m)
        {
            k();
            a();
            if (j())
            {
                d.e(l.a());
                d.a(l.b());
                d.c(l.c());
                d.b((com.fitbit.data.domain.Length.LengthUnits)l.c().a());
                d.a((com.fitbit.data.domain.WeightLogEntry.WeightUnits)l.d().a());
                d.a(l.e());
                an.a().a(d, getActivity());
                if (l.d() != null)
                {
                    WeightLogEntry weightlogentry = new WeightLogEntry();
                    weightlogentry.a(l.d());
                    weightlogentry.setLogDate(new Date());
                    gd.a().a(weightlogentry, getActivity());
                }
                o.e();
                getActivity().startService(cq.a(getActivity(), new Date(), true, new com.fitbit.data.bl.SyncDataForDayOperation.DailyDataType[] {
                    com.fitbit.data.bl.SyncDataForDayOperation.DailyDataType.b, com.fitbit.data.bl.SyncDataForDayOperation.DailyDataType.a, com.fitbit.data.bl.SyncDataForDayOperation.DailyDataType.c
                }));
                Toast.makeText(getActivity(), 0x7f08045f, 0).show();
                return;
            }
        }
    }

    private boolean j()
    {
        int i1 = l.f();
        boolean flag;
        if (i1 > 0)
        {
            e.c(i1);
            flag = true;
        } else
        {
            e.setError(null);
            flag = false;
        }
        i1 = l.g();
        if (i1 > 0)
        {
            h.c(i1);
            flag = true;
        } else
        {
            h.a(null);
        }
        i1 = l.h();
        if (i1 > 0)
        {
            i.c(i1);
            flag = true;
        } else
        {
            i.a(null);
        }
        i1 = l.i();
        if (i1 > 0)
        {
            j.c(i1);
            flag = true;
        } else
        {
            j.setError(null);
        }
        i1 = l.j();
        if (i1 > 0)
        {
            g.c(i1);
            flag = true;
        } else
        {
            g.setError(null);
        }
        if (flag)
        {
            com.fitbit.e.a.a("PersonalInfo", "hasErrors: %s", new Object[] {
                Boolean.valueOf(flag)
            });
            s.a(getActivity(), getString(0x7f080183), 1).i();
            return false;
        } else
        {
            return true;
        }
    }

    private void k()
    {
        l.a((Length)h.g());
        l.a((Weight)i.g());
    }

    public void a()
    {
        if (e != null && e.getError() != null)
        {
            e.h();
        }
        if (i != null && i.l() != null)
        {
            i.j();
        }
        if (h != null && h.l() != null)
        {
            h.j();
        }
        if (j != null && j.getError() != null)
        {
            j.h();
        }
        if (g != null && g.getError() != null)
        {
            g.h();
        }
    }

    public void a(OnboardingGenderPicker onboardinggenderpicker)
    {
        a(onboardinggenderpicker.a());
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        if (activity instanceof a)
        {
            o = (a)activity;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400c1, viewgroup, false);
        e = (EditText)layoutinflater.findViewById(0x7f110070);
        f = (FixedFocusScrollView)layoutinflater.findViewById(0x7f11006c);
        g = (EditText)layoutinflater.findViewById(0x7f110071);
        h = (LengthPicker)layoutinflater.findViewById(0x7f110072);
        i = (WeightPicker)layoutinflater.findViewById(0x7f110073);
        j = (EditText)layoutinflater.findViewById(0x7f110074);
        k = (ShadowButton)layoutinflater.findViewById(0x7f1102f8);
        g.setOnClickListener(new _cls1());
        j.setOnClickListener(new _cls2());
        k.setOnClickListener(new _cls3());
        c();
        return layoutinflater;
    }

    public void onDateSet(DatePicker datepicker, int i1, int j1, int k1)
    {
        a(i1, j1, k1);
    }

    public void onDetach()
    {
        o = null;
        super.onDetach();
    }

    public void onFocusChange(View view, boolean flag)
    {
        if (!flag || !m || l == null) goto _L2; else goto _L1
_L1:
        if (view != g) goto _L4; else goto _L3
_L3:
        g();
_L6:
        a();
_L2:
        return;
_L4:
        if (view == j)
        {
            h();
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void onPause()
    {
        m = false;
        e.setError(null);
        g.setError(null);
        h.j();
        i.j();
        j.setError(null);
        super.onPause();
    }

    public void onResume()
    {
        m = true;
        super.onResume();
        Profile profile = an.a().b();
        l.c(profile);
        l.b(profile);
        a(false);
        f();
        if (h != null && i != null)
        {
            int i1 = h.p();
            int j1 = i.p();
            DatePickerFragment datepickerfragment;
            if (i1 > j1)
            {
                i.d(i1);
            } else
            {
                h.d(j1);
            }
        }
        datepickerfragment = (DatePickerFragment)getActivity().getSupportFragmentManager().findFragmentByTag(b);
        if (datepickerfragment != null)
        {
            datepickerfragment.a(this);
        }
    }


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls3 {}

}
