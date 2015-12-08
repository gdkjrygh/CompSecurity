// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.i;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.tinder.activities.ActivityVerification;
import com.tinder.c.g;
import com.tinder.c.k;
import com.tinder.e.ai;
import com.tinder.e.aq;
import com.tinder.e.s;
import com.tinder.enums.Gender;
import com.tinder.f.ak;
import com.tinder.managers.ManagerApp;
import com.tinder.managers.z;
import com.tinder.utils.ad;
import com.tinder.utils.v;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

public final class c extends Fragment
    implements android.app.DatePickerDialog.OnDateSetListener, android.view.View.OnClickListener, ai, aq, s
{

    public static String a = "fragment verifyGenderAge";
    z b;
    private Button c;
    private TextView d;
    private TextView e;
    private EditText f;
    private TextView g;
    private k h;
    private g i;
    private Gender j;
    private long k;
    private boolean l;
    private boolean m;

    public c()
    {
    }

    private boolean c()
    {
        if (!l || !m) goto _L2; else goto _L1
_L1:
        if (TextUtils.isEmpty(f.getText()) || TextUtils.isEmpty(g.getText())) goto _L4; else goto _L3
_L3:
        return true;
_L4:
        return false;
_L2:
        if (!l)
        {
            break; /* Loop/switch isn't completed */
        }
        if (TextUtils.isEmpty(f.getText()))
        {
            return false;
        }
        if (true) goto _L3; else goto _L5
_L5:
        if (m)
        {
            if (TextUtils.isEmpty(g.getText()))
            {
                return false;
            }
        } else
        {
            return false;
        }
        if (true) goto _L3; else goto _L6
_L6:
    }

    private void d()
    {
        if (c())
        {
            c.setEnabled(true);
            c.setAlpha(1.0F);
            return;
        } else
        {
            c.setEnabled(false);
            c.setAlpha(0.7F);
            return;
        }
    }

    public final void a()
    {
        g.setText(0x7f060113);
        j = Gender.MALE;
        d();
    }

    public final void b()
    {
        g.setText(0x7f0600c5);
        j = Gender.FEMALE;
        d();
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        ManagerApp.h().a(this);
    }

    public final void onClick(View view)
    {
        view.getId();
        JVM INSTR lookupswitch 6: default 64
    //                   2131624455: 176
    //                   2131624525: 81
    //                   2131624670: 65
    //                   2131624671: 65
    //                   2131624673: 73
    //                   2131624674: 73;
           goto _L1 _L2 _L3 _L4 _L4 _L5 _L5
_L1:
        return;
_L4:
        i.show();
        return;
_L5:
        h.show();
        return;
_L3:
        if (!c()) goto _L1; else goto _L6
_L6:
        view = b;
        Gender gender = j;
        long l1 = k;
        JSONObject jsonobject = new JSONObject();
        if (gender != null)
        {
            try
            {
                jsonobject.put("gender", gender.ordinal());
            }
            // Misplaced declaration of an exception variable
            catch (View view)
            {
                com.tinder.utils.v.b(view.toString());
                return;
            }
        }
        if (l1 == 0L) goto _L8; else goto _L7
_L7:
        jsonobject.put("birth_date", l1);
_L8:
        (new StringBuilder("jsonObject = ")).append(jsonobject.toString());
        view.a(jsonobject, this);
        return;
_L2:
        getActivity().onBackPressed();
        return;
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f03009d, viewgroup, false);
        c = (Button)layoutinflater.findViewById(0x7f0e024d);
        d = (TextView)layoutinflater.findViewById(0x7f0e02de);
        e = (TextView)layoutinflater.findViewById(0x7f0e02e1);
        c = (Button)layoutinflater.findViewById(0x7f0e024d);
        g = (TextView)layoutinflater.findViewById(0x7f0e02e2);
        f = (EditText)layoutinflater.findViewById(0x7f0e02df);
        return layoutinflater;
    }

    public final void onDateSet(DatePicker datepicker, int i1, int j1, int k1)
    {
        datepicker = Calendar.getInstance(Locale.getDefault());
        datepicker.set(i1, j1, k1);
        String s1 = DateFormat.getLongDateFormat(getActivity()).format(datepicker.getTime());
        f.setText(s1);
        (new StringBuilder("Date set ")).append(i1).append(" ").append(j1);
        k = datepicker.getTime().getTime();
        d();
    }

    public final void onMenuItemClick(int i1)
    {
        getActivity().onBackPressed();
    }

    public final void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        ad.b(c);
        e.setText((new StringBuilder()).append(e.getText()).append(":").toString());
        h = new k(getActivity(), this);
        i = new g(getActivity(), this);
        c.setOnClickListener(this);
        ad.b(c);
        f.setOnClickListener(this);
        g.setOnClickListener(this);
        e.setOnClickListener(this);
        d.setOnClickListener(this);
        bundle = getArguments();
        l = bundle.getBoolean("is_age_verification_needed");
        m = bundle.getBoolean("is_gender_verification_needed");
        if (!l)
        {
            f.setVisibility(8);
            d.setVisibility(8);
            view.findViewById(0x7f0e02e0).setVisibility(8);
        }
        if (!m)
        {
            g.setVisibility(8);
            e.setVisibility(8);
            view.findViewById(0x7f0e02e3).setVisibility(8);
        }
        k = 0L;
        d();
    }

    public final void u()
    {
        if (getActivity() != null)
        {
            Toast.makeText(getActivity(), 0x7f06020f, 1).show();
            ActivityVerification activityverification = (ActivityVerification)getActivity();
            activityverification.i = false;
            activityverification.h = false;
            activityverification.g();
        }
    }

    public final void v()
    {
        if (getActivity() != null)
        {
            Toast.makeText(getActivity(), 0x7f0600b8, 1).show();
        }
    }

}
