// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.twofa;

import CU;
import Df;
import Eh;
import Ei;
import Gc;
import IC;
import Mf;
import Oi;
import Ur;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.twofa:
//            TwoFactorSettingsEnabledFragment, RecoveryCodePasswordValidationFragment

public class RecoveryCodeFragment extends SnapchatFragment
{

    protected Button a;
    protected ProgressBar b;
    private View c;
    private Button d;
    private boolean e;
    private final Set f;
    private final Ei g;
    private Eh h = new Eh() {

        private RecoveryCodeFragment a;

        public final void a(CU cu)
        {
label0:
            {
                int i = Ei.a(cu);
                if (RecoveryCodeFragment.a(a).contains(Integer.valueOf(i)))
                {
                    RecoveryCodeFragment.a(a).remove(Integer.valueOf(i));
                    if (cu instanceof Df)
                    {
                        a.b.setVisibility(8);
                        a.a.setText(0x7f0802fd);
                        a.a.setClickable(true);
                        cu = (Df)cu;
                        if (!((Df) (cu)).b)
                        {
                            break label0;
                        }
                        Mf.a().a(new Oi(new RecoveryCodePasswordValidationFragment()));
                    }
                }
                return;
            }
            cu = ((Df) (cu)).a;
            RecoveryCodeFragment.a(a, cu);
        }

            
            {
                a = RecoveryCodeFragment.this;
                super();
            }
    };

    public RecoveryCodeFragment()
    {
        this(Ei.a());
    }

    private RecoveryCodeFragment(Ei ei)
    {
        f = new HashSet();
        g = ei;
    }

    static Set a(RecoveryCodeFragment recoverycodefragment)
    {
        return recoverycodefragment.f;
    }

    private void a(Ur ur)
    {
        if (ur.a().booleanValue())
        {
            ur = IC.a(null, 0x7f0802fb, new Object[] {
                ur.b()
            });
            Gc gc = new Gc(getActivity());
            gc.g = ur;
            ur = gc.b(0x7f0802fa).a(0x7f080300, null);
            ur.k = false;
            ur.b();
            return;
        } else
        {
            Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, ur.b()));
            return;
        }
    }

    static void a(RecoveryCodeFragment recoverycodefragment, Ur ur)
    {
        recoverycodefragment.a(ur);
    }

    static Ei b(RecoveryCodeFragment recoverycodefragment)
    {
        return recoverycodefragment.g;
    }

    public static RecoveryCodeFragment h()
    {
        RecoveryCodeFragment recoverycodefragment = new RecoveryCodeFragment();
        Bundle bundle = new Bundle();
        bundle.putBoolean("show_skip_button", true);
        recoverycodefragment.setArguments(bundle);
        return recoverycodefragment;
    }

    static void m()
    {
        n();
    }

    private static void n()
    {
        Mf.a().a(new Oi(new TwoFactorSettingsEnabledFragment(), com/snapchat/android/fragments/settings/twofa/TwoFactorSettingsEnabledFragment.getSimpleName(), LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag()));
    }

    public final boolean f()
    {
        if (!e)
        {
            if (d(com/snapchat/android/fragments/settings/twofa/TwoFactorSettingsEnabledFragment.getSimpleName()))
            {
                return true;
            } else
            {
                return super.f();
            }
        } else
        {
            n();
            return true;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = getArguments();
        boolean flag;
        if (bundle != null && bundle.getBoolean("show_skip_button"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = flag;
        mFragmentLayout = layoutinflater.inflate(0x7f040106, viewgroup, false);
        c = d(0x7f0d0541);
        a = (Button)d(0x7f0d0545);
        b = (ProgressBar)d(0x7f0d0546);
        ((TextView)d(0x7f0d0544)).setText(0x7f0802fc);
        a.setOnClickListener(new android.view.View.OnClickListener() {

            private RecoveryCodeFragment a;

            public final void onClick(View view)
            {
                RecoveryCodeFragment.a(a).add(Integer.valueOf(RecoveryCodeFragment.b(a).b(a.getActivity())));
                a.a.setClickable(false);
                a.a.setText("");
                a.b.setVisibility(0);
            }

            
            {
                a = RecoveryCodeFragment.this;
                super();
            }
        });
        d = (Button)d(0x7f0d0543);
        d.setOnClickListener(new android.view.View.OnClickListener() {

            public final void onClick(View view)
            {
                RecoveryCodeFragment.m();
            }

        });
        if (e)
        {
            d.setVisibility(0);
            c.setVisibility(8);
        } else
        {
            d.setVisibility(8);
            c.setVisibility(0);
            d(0x7f0d0540).setOnClickListener(new android.view.View.OnClickListener() {

                private RecoveryCodeFragment a;

                public final void onClick(View view)
                {
                    a.getActivity().onBackPressed();
                }

            
            {
                a = RecoveryCodeFragment.this;
                super();
            }
            });
        }
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        g.b(1023, h);
        f.clear();
    }

    public void onResume()
    {
        super.onResume();
        g.a(1023, h);
    }

    public void onVisible()
    {
        super.onVisible();
        Intent intent = getActivity().getIntent();
        if (intent != null && !TextUtils.isEmpty(intent.getStringExtra("recovery_code_message_key")))
        {
            Ur ur = (new Ur()).a(Boolean.valueOf(intent.getBooleanExtra("recovery_code_succeed_key", false))).a(intent.getStringExtra("recovery_code_message_key"));
            intent.removeExtra("recovery_code_succeed_key");
            intent.removeExtra("recovery_code_message_key");
            a(ur);
        }
    }
}
