// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.verification;

import Bm;
import Bt;
import FT;
import FV;
import HZ;
import Iq;
import OJ;
import UT;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import com.snapchat.android.LoginAndSignupActivity;
import com.snapchat.android.analytics.RegistrationAnalytics;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.fragments.addfriends.NewUserContactBookFragment;
import com.snapchat.android.fragments.captcha.CaptchaFragment;
import com.snapchat.android.ui.window.WindowConfiguration;
import com.snapchat.android.util.RegistrationStringKey;
import com.snapchat.android.util.fragment.SnapchatFragment;
import jB;
import jC;

// Referenced classes of package com.snapchat.android.fragments.verification:
//            PhoneVerificationFragment

public class NewUserPhoneVerificationFragment extends PhoneVerificationFragment
{
    static final class a extends Enum
    {

        public static final a a;
        private static a b;
        private static a c;
        private static a d;
        private static final a i[];
        private final int e;
        private final boolean f;
        private final boolean g;
        private final boolean h;

        static int a(a a1)
        {
            return a1.e;
        }

        public static a a(int j)
        {
            switch (j)
            {
            default:
                return a;

            case 0: // '\0'
                return b;

            case 1: // '\001'
                return c;

            case 2: // '\002'
                return d;
            }
        }

        static boolean b(a a1)
        {
            return a1.f;
        }

        static boolean c(a a1)
        {
            return a1.g;
        }

        static boolean d(a a1)
        {
            return a1.h;
        }

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/snapchat/android/fragments/verification/NewUserPhoneVerificationFragment$a, s);
        }

        public static a[] values()
        {
            return (a[])i.clone();
        }

        static 
        {
            a = new a("NOT_SELECTED", 0, -1, false, false, false);
            b = new a("CONTROL", 1, 0, true, false, false);
            c = new a("TREATMENT1", 2, 1, true, true, false);
            d = new a("TREATMENT2", 3, 2, true, true, true);
            i = (new a[] {
                a, b, c, d
            });
        }

        private a(String s, int j, int k, boolean flag, boolean flag1, boolean flag2)
        {
            super(s, j);
            e = k;
            f = flag;
            g = flag1;
            h = flag2;
        }
    }


    private Button a;
    private int b;
    private a o;

    public NewUserPhoneVerificationFragment()
    {
        this(new WindowConfiguration());
    }

    private NewUserPhoneVerificationFragment(RegistrationAnalytics registrationanalytics, WindowConfiguration windowconfiguration)
    {
        super(registrationanalytics, windowconfiguration);
    }

    public NewUserPhoneVerificationFragment(WindowConfiguration windowconfiguration)
    {
        RegistrationAnalytics registrationanalytics = RegistrationAnalytics.a();
        Bt.a();
        this(registrationanalytics, windowconfiguration);
    }

    private void A()
    {
        a.setVisibility(0);
        a.setOnClickListener(new android.view.View.OnClickListener() {

            private NewUserPhoneVerificationFragment a;

            public final void onClick(View view)
            {
                view = a.c;
                if (Bt.B() || RegistrationAnalytics.b())
                {
                    jC jc = new jC();
                    ((RegistrationAnalytics) (view)).mBlizzardEventLogger.a(jc);
                }
                a.h();
            }

            
            {
                a = NewUserPhoneVerificationFragment.this;
                super();
            }
        });
    }

    protected final void a(UT ut)
    {
        getActivity();
        LoginAndSignupActivity.a(ut);
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    public final boolean f()
    {
        if (Bt.y() || Bt.x())
        {
            (new FV(d)).show();
        } else
        {
            (new FT(d)).show();
        }
        return true;
    }

    protected final void h()
    {
        if (Bt.y() && !Bt.g())
        {
            CaptchaFragment captchafragment = new CaptchaFragment(super.mWindowConfiguration);
            a(b, captchafragment, captchafragment.getClass().getSimpleName());
            return;
        }
        if (Bt.f() || Bt.g() && Bt.i())
        {
            Bt.e(false);
            NewUserContactBookFragment newusercontactbookfragment = new NewUserContactBookFragment(super.mWindowConfiguration);
            a(b, newusercontactbookfragment, com/snapchat/android/fragments/addfriends/NewUserContactBookFragment.getSimpleName());
            return;
        } else
        {
            HZ.a(d);
            return;
        }
    }

    protected final void n()
    {
        if (a.d(o) && a.getVisibility() != 0)
        {
            A();
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        int i = 0;
        super.onCreateView(layoutinflater, viewgroup, bundle);
        b = viewgroup.getId();
        mFragmentLayout.setBackgroundColor(0);
        layoutinflater = getArguments();
        boolean flag;
        if (layoutinflater != null && layoutinflater.containsKey("registrationRecovery") && layoutinflater.getBoolean("registrationRecovery"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        RegistrationStringKey.REG_ENTER_MOBILE_DESC.setTextViewIfNeeded(k);
        RegistrationStringKey.REG_WONT_DISPLAY_MOBILE.setTextViewIfNeeded(l);
        d(0x7f0d0029).setVisibility(0);
        b(false);
        layoutinflater = d(0x7f0d003a);
        if (!flag)
        {
            i = 4;
        }
        layoutinflater.setVisibility(i);
        if (flag)
        {
            d(0x7f0d03ab).setOnClickListener(new android.view.View.OnClickListener() {

                private NewUserPhoneVerificationFragment a;

                public final void onClick(View view)
                {
                    a.d.onBackPressed();
                }

            
            {
                a = NewUserPhoneVerificationFragment.this;
                super();
            }
            });
        }
        a = (Button)d(0x7f0d001b);
        layoutinflater = a;
        getActivity().getAssets();
        Iq.a(layoutinflater);
        if (!Bt.x())
        {
            layoutinflater = Bm.a();
            o = a.a(layoutinflater.a("REGISTER_HIDE_SKIP_PHONE", "experimentId", a.a(a.a)));
            if (a.b(o))
            {
                layoutinflater.b("REGISTER_HIDE_SKIP_PHONE", String.valueOf(a.a(o)));
            }
            if (!a.c(o))
            {
                A();
            }
        }
        e.requestFocus();
        layoutinflater = c;
        if (Bt.B() || RegistrationAnalytics.b())
        {
            viewgroup = new jB();
            ((RegistrationAnalytics) (layoutinflater)).mBlizzardEventLogger.a(viewgroup);
        }
        return mFragmentLayout;
    }

    public void onResume()
    {
        super.onResume();
        if (Bt.e())
        {
            h();
        }
    }

    public void onVerificationCodeReceivedEvent(OJ oj)
    {
        super.onVerificationCodeReceivedEvent(oj);
    }
}
