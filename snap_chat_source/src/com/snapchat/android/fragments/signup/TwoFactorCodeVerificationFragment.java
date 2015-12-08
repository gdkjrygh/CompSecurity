// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.signup;

import Br;
import Bt;
import CU;
import Dn;
import Eh;
import Ei;
import IC;
import IJ;
import KO;
import Ll;
import OJ;
import RK;
import Ur;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import com.snapchat.android.LandingPageActivity;
import com.snapchat.android.SnapchatApplication;
import com.snapchat.android.api2.LoginTask;
import com.snapchat.android.util.AlertDialogUtils;
import com.snapchat.android.util.debug.ReleaseManager;
import java.util.HashSet;
import java.util.Set;
import javax.inject.Provider;

// Referenced classes of package com.snapchat.android.fragments.signup:
//            GenericCodeVerificationFragment

public class TwoFactorCodeVerificationFragment extends GenericCodeVerificationFragment
{

    public KO d;
    private String e;
    private String f;
    private String g;
    private final Provider h;
    private com.snapchat.android.api2.LoginTask.a i = new com.snapchat.android.api2.LoginTask.a() {

        private TwoFactorCodeVerificationFragment a;

        public final void R_()
        {
            if (ReleaseManager.f())
            {
                throw new RuntimeException("Username required for two-factor authentication");
            } else
            {
                a.getActivity().onBackPressed();
                return;
            }
        }

        public final void a()
        {
        }

        public final void a(int l, String s)
        {
            a.b.setClickable(true);
            a.a.setEnabled(true);
            a.c.setVisibility(8);
            a.t();
            a.a(s);
        }

        public final void a(RK rk)
        {
            a.getActivity().onBackPressed();
        }

        public final void b(RK rk)
        {
            if (a.isAdded())
            {
                TwoFactorCodeVerificationFragment twofactorcodeverificationfragment = a;
                if (Bt.q() != null)
                {
                    FragmentActivity fragmentactivity = twofactorcodeverificationfragment.getActivity();
                    Intent intent = new Intent(fragmentactivity, com/snapchat/android/LandingPageActivity);
                    intent.addFlags(0x4000000);
                    intent.putExtra("recovery_code_used", IJ.a(rk.w()));
                    twofactorcodeverificationfragment.startActivity(intent);
                    fragmentactivity.finish();
                    return;
                }
            }
        }

        public final void c()
        {
            if (ReleaseManager.f())
            {
                throw new RuntimeException("Verification required for two-factor authentication");
            } else
            {
                a.getActivity().onBackPressed();
                return;
            }
        }

            
            {
                a = TwoFactorCodeVerificationFragment.this;
                super();
            }
    };
    private final Set j;
    private Eh k = new Eh() {

        private TwoFactorCodeVerificationFragment a;

        public final void a(CU cu)
        {
label0:
            {
                int l = Ei.a(cu);
                if (TwoFactorCodeVerificationFragment.a(a).contains(Integer.valueOf(l)) && (cu instanceof Dn))
                {
                    TwoFactorCodeVerificationFragment.a(a).remove(Integer.valueOf(l));
                    cu = (Dn)cu;
                    if (!((Dn) (cu)).b)
                    {
                        break label0;
                    }
                    a.getActivity().onBackPressed();
                }
                return;
            }
            cu = ((Dn) (cu)).a;
            a.c.setVisibility(8);
            a.b.setClickable(true);
            a.a.setEnabled(true);
            if (IJ.a(cu.a()))
            {
                a.a.setText("");
                a.a.requestFocus();
                a.s();
            } else
            {
                AlertDialogUtils.a(a.getActivity(), cu.b());
            }
            a.t();
        }

            
            {
                a = TwoFactorCodeVerificationFragment.this;
                super();
            }
    };

    public TwoFactorCodeVerificationFragment()
    {
        Provider provider = Br.UNSAFE_USER_PROVIDER;
        Ei.a();
        this(provider);
    }

    private TwoFactorCodeVerificationFragment(Provider provider)
    {
        j = new HashSet();
        SnapchatApplication.getDIComponent().a(this);
        h = provider;
    }

    public static final TwoFactorCodeVerificationFragment a(String s, String s1, String s2)
    {
        TwoFactorCodeVerificationFragment twofactorcodeverificationfragment = new TwoFactorCodeVerificationFragment();
        Bundle bundle = new Bundle(3);
        bundle.putString("phone_number", s);
        bundle.putString("login_name", s1);
        bundle.putString("pre_auth_token", s2);
        twofactorcodeverificationfragment.setArguments(bundle);
        return twofactorcodeverificationfragment;
    }

    static Set a(TwoFactorCodeVerificationFragment twofactorcodeverificationfragment)
    {
        return twofactorcodeverificationfragment.j;
    }

    public final void h()
    {
        (new LoginTask(f, a.getText().toString(), i, g, d, h)).execute();
    }

    public final void m()
    {
        Set set = j;
        Ei ei = Ei.a();
        FragmentActivity fragmentactivity = getActivity();
        String s = g;
        Intent intent = ei.c(fragmentactivity);
        intent.putExtra("op_code", 1022);
        intent.putExtra("action", "requestTwoFactorCode");
        intent.putExtra("pre_auth_token", s);
        set.add(Integer.valueOf(ei.a(fragmentactivity, intent)));
    }

    public final String n()
    {
        return IC.a(null, 0x7f080306, new Object[] {
            e
        });
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        if (bundle != null)
        {
            e = bundle.getString("phone_number", null);
            f = bundle.getString("login_name", null);
            g = bundle.getString("pre_auth_token", null);
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f040109, null);
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
        Ei.a().b(1022, k);
        j.clear();
    }

    public void onResume()
    {
        super.onResume();
        Ei.a().a(1022, k);
    }

    public void onVerificationCodeReceivedEvent(OJ oj)
    {
        super.onVerificationCodeReceivedEvent(oj);
    }
}
