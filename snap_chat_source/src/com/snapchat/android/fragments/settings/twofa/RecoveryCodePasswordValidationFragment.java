// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import CU;
import Df;
import Dh;
import Eh;
import Ei;
import IC;
import Mf;
import Oi;
import Ur;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.fragments.settings.BasePasswordValidationFragment;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.twofa:
//            RecoveryCodeFragment, TwoFactorSettingsEnabledFragment

public class RecoveryCodePasswordValidationFragment extends BasePasswordValidationFragment
{

    private final Set d;
    private final Ei e;
    private Eh f = new Eh() {

        private RecoveryCodePasswordValidationFragment a;

        public final void a(CU cu)
        {
            int i = Ei.a(cu);
            if (RecoveryCodePasswordValidationFragment.a(a).contains(Integer.valueOf(i)))
            {
                RecoveryCodePasswordValidationFragment.a(a).remove(Integer.valueOf(i));
                if (cu instanceof Dh)
                {
                    RecoveryCodePasswordValidationFragment.a(a, (Dh)cu);
                } else
                if (cu instanceof Df)
                {
                    RecoveryCodePasswordValidationFragment.a(a, (Df)cu);
                    return;
                }
            }
        }

            
            {
                a = RecoveryCodePasswordValidationFragment.this;
                super();
            }
    };

    public RecoveryCodePasswordValidationFragment()
    {
        this(Ei.a());
    }

    private RecoveryCodePasswordValidationFragment(Ei ei)
    {
        d = new HashSet();
        e = ei;
    }

    static Set a(RecoveryCodePasswordValidationFragment recoverycodepasswordvalidationfragment)
    {
        return recoverycodepasswordvalidationfragment.d;
    }

    static void a(RecoveryCodePasswordValidationFragment recoverycodepasswordvalidationfragment, Df df)
    {
        if (df.b)
        {
            recoverycodepasswordvalidationfragment.b.setVisibility(8);
            recoverycodepasswordvalidationfragment.c.setVisibility(8);
            recoverycodepasswordvalidationfragment.a(IC.a(null, 0x7f0801ee, new Object[0]));
            return;
        } else
        {
            df = df.a;
            recoverycodepasswordvalidationfragment = recoverycodepasswordvalidationfragment.getActivity().getIntent();
            recoverycodepasswordvalidationfragment.putExtra("recovery_code_succeed_key", df.a());
            recoverycodepasswordvalidationfragment.putExtra("recovery_code_message_key", df.b());
            Mf.a().a(new Oi(new RecoveryCodeFragment(), com/snapchat/android/fragments/settings/twofa/RecoveryCodeFragment.getSimpleName(), com/snapchat/android/fragments/settings/twofa/TwoFactorSettingsEnabledFragment.getSimpleName()));
            return;
        }
    }

    static void a(RecoveryCodePasswordValidationFragment recoverycodepasswordvalidationfragment, Dh dh)
    {
        if (dh.a)
        {
            recoverycodepasswordvalidationfragment.d.add(Integer.valueOf(recoverycodepasswordvalidationfragment.e.b(recoverycodepasswordvalidationfragment.getActivity())));
            return;
        } else
        {
            recoverycodepasswordvalidationfragment.b.setVisibility(8);
            recoverycodepasswordvalidationfragment.c.setVisibility(8);
            recoverycodepasswordvalidationfragment.a(dh.b);
            return;
        }
    }

    static EditText b(RecoveryCodePasswordValidationFragment recoverycodepasswordvalidationfragment)
    {
        return recoverycodepasswordvalidationfragment.a;
    }

    static Ei c(RecoveryCodePasswordValidationFragment recoverycodepasswordvalidationfragment)
    {
        return recoverycodepasswordvalidationfragment.e;
    }

    static Button d(RecoveryCodePasswordValidationFragment recoverycodepasswordvalidationfragment)
    {
        return recoverycodepasswordvalidationfragment.b;
    }

    static Button e(RecoveryCodePasswordValidationFragment recoverycodepasswordvalidationfragment)
    {
        return recoverycodepasswordvalidationfragment.b;
    }

    static View f(RecoveryCodePasswordValidationFragment recoverycodepasswordvalidationfragment)
    {
        return recoverycodepasswordvalidationfragment.c;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        ((TextView)d(0x7f0d046d)).setText(0x7f080301);
        ((TextView)d(0x7f0d046e)).setText(0x7f0802ea);
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private RecoveryCodePasswordValidationFragment a;

            public final void onClick(View view)
            {
                RecoveryCodePasswordValidationFragment.a(a).add(Integer.valueOf(RecoveryCodePasswordValidationFragment.c(a).b(a.getActivity(), RecoveryCodePasswordValidationFragment.b(a).getText().toString())));
                RecoveryCodePasswordValidationFragment.d(a).setClickable(false);
                RecoveryCodePasswordValidationFragment.e(a).setText("");
                RecoveryCodePasswordValidationFragment.f(a).setVisibility(0);
            }

            
            {
                a = RecoveryCodePasswordValidationFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        e.b(1016, f);
        e.b(1023, f);
        d.clear();
    }

    public void onResume()
    {
        super.onResume();
        e.a(1016, f);
        e.a(1023, f);
    }
}
