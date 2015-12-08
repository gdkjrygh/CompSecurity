// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.phone;

import Bt;
import CU;
import Dj;
import Eh;
import Ei;
import IC;
import Mf;
import Oi;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.fragments.settings.BasePasswordValidationFragment;
import com.snapchat.android.fragments.settings.SecurityGhostFragment;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

public class PhonePasswordValidationFragment extends BasePasswordValidationFragment
{

    private final Ei d;
    private final Set e;
    private Eh f = new Eh() {

        private PhonePasswordValidationFragment a;

        public final void a(CU cu)
        {
            int i = Ei.a(cu);
            if (PhonePasswordValidationFragment.a(a).contains(Integer.valueOf(i)) && (cu instanceof Dj))
            {
                PhonePasswordValidationFragment.a(a).remove(Integer.valueOf(i));
                PhonePasswordValidationFragment.a(a, ((Dj)cu).b);
            }
        }

            
            {
                a = PhonePasswordValidationFragment.this;
                super();
            }
    };

    public PhonePasswordValidationFragment()
    {
        this(Ei.a());
    }

    private PhonePasswordValidationFragment(Ei ei)
    {
        e = new HashSet();
        d = ei;
    }

    static Set a(PhonePasswordValidationFragment phonepasswordvalidationfragment)
    {
        return phonepasswordvalidationfragment.e;
    }

    static void a(PhonePasswordValidationFragment phonepasswordvalidationfragment, Dj.a a1)
    {
        if (a1.a)
        {
            Mf.a().a(new Oi(SecurityGhostFragment.a(IC.a(null, 0x7f080249, new Object[0]))));
            return;
        } else
        {
            phonepasswordvalidationfragment.b.setVisibility(8);
            phonepasswordvalidationfragment.c.setVisibility(8);
            phonepasswordvalidationfragment.a(a1.c);
            return;
        }
    }

    static EditText b(PhonePasswordValidationFragment phonepasswordvalidationfragment)
    {
        return phonepasswordvalidationfragment.a;
    }

    static Ei c(PhonePasswordValidationFragment phonepasswordvalidationfragment)
    {
        return phonepasswordvalidationfragment.d;
    }

    static Button d(PhonePasswordValidationFragment phonepasswordvalidationfragment)
    {
        return phonepasswordvalidationfragment.b;
    }

    static Button e(PhonePasswordValidationFragment phonepasswordvalidationfragment)
    {
        return phonepasswordvalidationfragment.b;
    }

    static View f(PhonePasswordValidationFragment phonepasswordvalidationfragment)
    {
        return phonepasswordvalidationfragment.c;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        ((TextView)d(0x7f0d046d)).setText(IC.a(null, 0x7f080282, new Object[0]));
        ((TextView)d(0x7f0d046e)).setText(IC.a(null, 0x7f080189, new Object[0]));
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private PhonePasswordValidationFragment a;

            public final void onClick(View view)
            {
                PhonePasswordValidationFragment.a(a).add(Integer.valueOf(PhonePasswordValidationFragment.c(a).a(a.getActivity(), Ss.a.PWCONFIRMPHONENUMBER, Bt.d(), PhonePasswordValidationFragment.b(a).getText().toString())));
                PhonePasswordValidationFragment.d(a).setClickable(false);
                PhonePasswordValidationFragment.e(a).setText("");
                PhonePasswordValidationFragment.f(a).setVisibility(0);
            }

            
            {
                a = PhonePasswordValidationFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        d.b(1012, f);
        e.clear();
    }

    public void onResume()
    {
        super.onResume();
        d.a(1012, f);
    }
}
