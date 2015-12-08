// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.password;

import CU;
import Dh;
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
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.fragments.settings.BasePasswordValidationFragment;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.password:
//            ChangePasswordFragment

public class PasswordValidationFragment extends BasePasswordValidationFragment
{

    private final Ei d;
    private final Set e;
    private Eh f = new Eh() {

        private PasswordValidationFragment a;

        public final void a(CU cu)
        {
            int i = Ei.a(cu);
            if (PasswordValidationFragment.a(a).contains(Integer.valueOf(i)))
            {
                PasswordValidationFragment.a(a).remove(Integer.valueOf(i));
                if (cu instanceof Dh)
                {
                    PasswordValidationFragment.a(a, (Dh)cu);
                }
            }
        }

            
            {
                a = PasswordValidationFragment.this;
                super();
            }
    };

    public PasswordValidationFragment()
    {
        this(Ei.a());
    }

    private PasswordValidationFragment(Ei ei)
    {
        e = new HashSet();
        d = ei;
    }

    static Set a(PasswordValidationFragment passwordvalidationfragment)
    {
        return passwordvalidationfragment.e;
    }

    static void a(PasswordValidationFragment passwordvalidationfragment, Dh dh)
    {
        if (dh.a)
        {
            Mf.a().a(new Oi(new ChangePasswordFragment(), com/snapchat/android/fragments/settings/password/ChangePasswordFragment.getSimpleName(), LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag()));
            return;
        } else
        {
            passwordvalidationfragment.b.setVisibility(8);
            passwordvalidationfragment.c.setVisibility(8);
            passwordvalidationfragment.a(dh.b);
            return;
        }
    }

    static EditText b(PasswordValidationFragment passwordvalidationfragment)
    {
        return passwordvalidationfragment.a;
    }

    static Ei c(PasswordValidationFragment passwordvalidationfragment)
    {
        return passwordvalidationfragment.d;
    }

    static Button d(PasswordValidationFragment passwordvalidationfragment)
    {
        return passwordvalidationfragment.b;
    }

    static Button e(PasswordValidationFragment passwordvalidationfragment)
    {
        return passwordvalidationfragment.b;
    }

    static View f(PasswordValidationFragment passwordvalidationfragment)
    {
        return passwordvalidationfragment.c;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        ((TextView)d(0x7f0d046d)).setText(IC.a(null, 0x7f080289, new Object[0]));
        ((TextView)d(0x7f0d046e)).setText(IC.a(null, 0x7f0801c2, new Object[0]));
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private PasswordValidationFragment a;

            public final void onClick(View view)
            {
                PasswordValidationFragment.a(a).add(Integer.valueOf(PasswordValidationFragment.c(a).b(a.getActivity(), PasswordValidationFragment.b(a).getText().toString())));
                PasswordValidationFragment.d(a).setClickable(false);
                PasswordValidationFragment.e(a).setText("");
                PasswordValidationFragment.f(a).setVisibility(0);
            }

            
            {
                a = PasswordValidationFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        d.b(1016, f);
        e.clear();
    }

    public void onResume()
    {
        super.onResume();
        d.a(1016, f);
    }
}
