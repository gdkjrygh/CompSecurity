// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.email;

import CU;
import CZ;
import Dh;
import Eh;
import Ei;
import IC;
import IJ;
import Mf;
import Oi;
import UA;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.fragments.settings.BasePasswordValidationFragment;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.email:
//            EmailVerificationSentFragment, EmailSettingsFragment

public class EmailPasswordValidationFragment extends BasePasswordValidationFragment
{

    private final String d;
    private final Set e;
    private Eh f = new Eh() {

        private EmailPasswordValidationFragment a;

        public final void a(CU cu)
        {
            int i = Ei.a(cu);
            if (EmailPasswordValidationFragment.a(a).contains(Integer.valueOf(i)))
            {
                EmailPasswordValidationFragment.a(a).remove(Integer.valueOf(i));
                if (cu instanceof Dh)
                {
                    EmailPasswordValidationFragment.a(a, (Dh)cu);
                } else
                if (cu instanceof CZ)
                {
                    EmailPasswordValidationFragment.a(a, (CZ)cu);
                    return;
                }
            }
        }

            
            {
                a = EmailPasswordValidationFragment.this;
                super();
            }
    };
    private final Ei g;

    private EmailPasswordValidationFragment(Ei ei, String s)
    {
        e = new HashSet();
        g = ei;
        d = s;
    }

    public EmailPasswordValidationFragment(String s)
    {
        this(Ei.a(), s);
    }

    static Set a(EmailPasswordValidationFragment emailpasswordvalidationfragment)
    {
        return emailpasswordvalidationfragment.e;
    }

    static void a(EmailPasswordValidationFragment emailpasswordvalidationfragment, CZ cz)
    {
        if (cz.b)
        {
            emailpasswordvalidationfragment.b.setVisibility(8);
            emailpasswordvalidationfragment.c.setVisibility(8);
            emailpasswordvalidationfragment.a(IC.a(null, 0x7f0801ee, new Object[0]));
            return;
        }
        cz = cz.a;
        if (IJ.a(cz.a()))
        {
            Mf.a().a(new Oi(new EmailVerificationSentFragment()));
            return;
        } else
        {
            Intent intent = emailpasswordvalidationfragment.getActivity().getIntent();
            intent.putExtra("change_email_message_key", cz.b());
            intent.putExtra("change_email_key", emailpasswordvalidationfragment.d);
            Mf.a().a(new Oi(new EmailSettingsFragment(), com/snapchat/android/fragments/settings/email/EmailSettingsFragment.getSimpleName(), LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag()));
            return;
        }
    }

    static void a(EmailPasswordValidationFragment emailpasswordvalidationfragment, Dh dh)
    {
        if (dh.a)
        {
            emailpasswordvalidationfragment.e.add(Integer.valueOf(emailpasswordvalidationfragment.g.a(emailpasswordvalidationfragment.getActivity(), emailpasswordvalidationfragment.d)));
            return;
        } else
        {
            emailpasswordvalidationfragment.b.setVisibility(8);
            emailpasswordvalidationfragment.c.setVisibility(8);
            emailpasswordvalidationfragment.a(dh.b);
            return;
        }
    }

    static EditText b(EmailPasswordValidationFragment emailpasswordvalidationfragment)
    {
        return emailpasswordvalidationfragment.a;
    }

    static Ei c(EmailPasswordValidationFragment emailpasswordvalidationfragment)
    {
        return emailpasswordvalidationfragment.g;
    }

    static Button d(EmailPasswordValidationFragment emailpasswordvalidationfragment)
    {
        return emailpasswordvalidationfragment.b;
    }

    static Button e(EmailPasswordValidationFragment emailpasswordvalidationfragment)
    {
        return emailpasswordvalidationfragment.b;
    }

    static View f(EmailPasswordValidationFragment emailpasswordvalidationfragment)
    {
        return emailpasswordvalidationfragment.c;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        super.onCreateView(layoutinflater, viewgroup, bundle);
        ((TextView)d(0x7f0d046d)).setText(IC.a(null, 0x7f080278, new Object[0]));
        ((TextView)d(0x7f0d046e)).setText(IC.a(null, 0x7f080122, new Object[0]));
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private EmailPasswordValidationFragment a;

            public final void onClick(View view)
            {
                EmailPasswordValidationFragment.a(a).add(Integer.valueOf(EmailPasswordValidationFragment.c(a).b(a.getActivity(), EmailPasswordValidationFragment.b(a).getText().toString())));
                EmailPasswordValidationFragment.d(a).setClickable(false);
                EmailPasswordValidationFragment.e(a).setText("");
                EmailPasswordValidationFragment.f(a).setVisibility(0);
            }

            
            {
                a = EmailPasswordValidationFragment.this;
                super();
            }
        });
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        g.b(1016, f);
        g.b(1015, f);
        e.clear();
    }

    public void onResume()
    {
        super.onResume();
        g.a(1016, f);
        g.a(1015, f);
    }
}
