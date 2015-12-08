// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import Bt;
import CU;
import Dj;
import Eh;
import Ei;
import IC;
import Jo;
import Mf;
import OJ;
import Oi;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.telephony.PhoneNumberUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.fragments.signup.GenericCodeVerificationFragment;
import com.snapchat.android.util.AlertDialogUtils;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.twofa:
//            RecoveryCodeFragment, TwoFactorSettingsEnabledFragment

public class TwoFAEnableCodeConfirmationFragment extends GenericCodeVerificationFragment
{

    private final Ei d;
    private final Set e;
    private Eh f = new Eh() {

        private TwoFAEnableCodeConfirmationFragment a;

        public final void a(CU cu)
        {
            int i = Ei.a(cu);
            if (TwoFAEnableCodeConfirmationFragment.a(a).contains(Integer.valueOf(i)))
            {
                TwoFAEnableCodeConfirmationFragment.a(a).remove(Integer.valueOf(i));
                if (cu instanceof Dj)
                {
                    cu = (Dj)cu;
                    Dj.a a1 = ((Dj) (cu)).b;
                    TwoFAEnableCodeConfirmationFragment.b(a).setVisibility(8);
                    TwoFAEnableCodeConfirmationFragment.c(a).setClickable(true);
                    TwoFAEnableCodeConfirmationFragment.d(a).setEnabled(true);
                    if (((Dj) (cu)).a == Ss.a.ENABLETWOFA)
                    {
                        if (a1.a)
                        {
                            Mf.a().a(new Oi(RecoveryCodeFragment.h(), com/snapchat/android/fragments/settings/twofa/TwoFactorSettingsEnabledFragment.getSimpleName(), LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag()));
                        } else
                        {
                            TwoFAEnableCodeConfirmationFragment.a(a, a1.c);
                        }
                    } else
                    if (a1.a)
                    {
                        TwoFAEnableCodeConfirmationFragment.e(a).setText("");
                        TwoFAEnableCodeConfirmationFragment.f(a).requestFocus();
                        TwoFAEnableCodeConfirmationFragment.g(a);
                    } else
                    {
                        AlertDialogUtils.a(a.getActivity(), a1.c);
                    }
                    TwoFAEnableCodeConfirmationFragment.h(a);
                }
            }
        }

            
            {
                a = TwoFAEnableCodeConfirmationFragment.this;
                super();
            }
    };

    public TwoFAEnableCodeConfirmationFragment()
    {
        Bt.a();
        this(Ei.a());
    }

    private TwoFAEnableCodeConfirmationFragment(Ei ei)
    {
        e = new HashSet();
        d = ei;
    }

    static Set a(TwoFAEnableCodeConfirmationFragment twofaenablecodeconfirmationfragment)
    {
        return twofaenablecodeconfirmationfragment.e;
    }

    static void a(TwoFAEnableCodeConfirmationFragment twofaenablecodeconfirmationfragment, String s)
    {
        twofaenablecodeconfirmationfragment.a(s);
    }

    static ProgressBar b(TwoFAEnableCodeConfirmationFragment twofaenablecodeconfirmationfragment)
    {
        return twofaenablecodeconfirmationfragment.c;
    }

    static Button c(TwoFAEnableCodeConfirmationFragment twofaenablecodeconfirmationfragment)
    {
        return twofaenablecodeconfirmationfragment.b;
    }

    static EditText d(TwoFAEnableCodeConfirmationFragment twofaenablecodeconfirmationfragment)
    {
        return twofaenablecodeconfirmationfragment.a;
    }

    static EditText e(TwoFAEnableCodeConfirmationFragment twofaenablecodeconfirmationfragment)
    {
        return twofaenablecodeconfirmationfragment.a;
    }

    static EditText f(TwoFAEnableCodeConfirmationFragment twofaenablecodeconfirmationfragment)
    {
        return twofaenablecodeconfirmationfragment.a;
    }

    static void g(TwoFAEnableCodeConfirmationFragment twofaenablecodeconfirmationfragment)
    {
        twofaenablecodeconfirmationfragment.s();
    }

    static void h(TwoFAEnableCodeConfirmationFragment twofaenablecodeconfirmationfragment)
    {
        twofaenablecodeconfirmationfragment.t();
    }

    public final void h()
    {
        e.add(Integer.valueOf(d.a(getActivity(), Ss.a.ENABLETWOFA, a.getText().toString(), null)));
    }

    public final void m()
    {
        e.add(Integer.valueOf(d.a(getActivity(), Ss.a.SENDTWOFACODE, a.getText().toString(), null)));
    }

    public final String n()
    {
        return IC.a(null, 0x7f0802eb, new Object[] {
            PhoneNumberUtils.formatNumber(Bt.d())
        });
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040101, null);
        d(0x7f0d052d).setOnClickListener(new android.view.View.OnClickListener() {

            private TwoFAEnableCodeConfirmationFragment a;

            public final void onClick(View view)
            {
                Jo.a(a.getActivity(), a.getView());
                a.getActivity().onBackPressed();
            }

            
            {
                a = TwoFAEnableCodeConfirmationFragment.this;
                super();
            }
        });
        o();
        p();
        q();
        s();
        t();
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

    public void onVerificationCodeReceivedEvent(OJ oj)
    {
        super.onVerificationCodeReceivedEvent(oj);
    }
}
