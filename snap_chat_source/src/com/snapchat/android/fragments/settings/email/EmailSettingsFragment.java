// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.email;

import Bt;
import CU;
import CZ;
import Dj;
import Eh;
import Ei;
import IC;
import IJ;
import Iq;
import Jo;
import LY;
import Mf;
import Oi;
import UA;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.util.emoji.Emoji;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.email:
//            EmailPasswordValidationFragment, EmailVerificationSentFragment

public class EmailSettingsFragment extends SnapchatFragment
{

    private EditText a;
    private TextView b;
    private Button c;
    private Button d;
    private View e;
    private View f;
    private TextView g;
    private TextView h;
    private String i;
    private String j;
    private final Set k;
    private final Ei l;
    private Eh m = new Eh() {

        private EmailSettingsFragment a;

        public final void a(CU cu)
        {
            int i1 = Ei.a(cu);
            if (EmailSettingsFragment.a(a).contains(Integer.valueOf(i1)))
            {
                EmailSettingsFragment.a(a).remove(Integer.valueOf(i1));
                if (cu instanceof Dj)
                {
                    EmailSettingsFragment.a(a, ((Dj)cu).b);
                } else
                if (cu instanceof CZ)
                {
                    EmailSettingsFragment.a(a, (CZ)cu);
                    return;
                }
            }
        }

            
            {
                a = EmailSettingsFragment.this;
                super();
            }
    };

    public EmailSettingsFragment()
    {
        Bt.a();
        this(Ei.a());
    }

    private EmailSettingsFragment(Ei ei)
    {
        k = new HashSet();
        l = ei;
    }

    static Set a(EmailSettingsFragment emailsettingsfragment)
    {
        return emailsettingsfragment.k;
    }

    static void a(EmailSettingsFragment emailsettingsfragment, CZ cz)
    {
        if (cz.b)
        {
            Mf.a().a(new Oi(new EmailPasswordValidationFragment(emailsettingsfragment.a.getText().toString())));
            return;
        }
        cz = cz.a;
        if (cz != null && IJ.a(cz.a()))
        {
            if (TextUtils.isEmpty(Bt.bw()))
            {
                emailsettingsfragment.m();
                emailsettingsfragment.h();
                return;
            } else
            {
                Mf.a().a(new Oi(new EmailVerificationSentFragment()));
                return;
            }
        } else
        {
            emailsettingsfragment.m();
            emailsettingsfragment.h();
            emailsettingsfragment.a(cz.b());
            return;
        }
    }

    static void a(EmailSettingsFragment emailsettingsfragment, Dj.a a1)
    {
        emailsettingsfragment.e.setVisibility(8);
        if (a1.a)
        {
            Mf.a().a(new Oi(new EmailVerificationSentFragment()));
            return;
        } else
        {
            emailsettingsfragment.m();
            emailsettingsfragment.h();
            Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, a1.c));
            return;
        }
    }

    private void a(String s)
    {
        if (!TextUtils.isEmpty(s))
        {
            f.setVisibility(0);
            g.setText(s);
            g.setVisibility(0);
            return;
        } else
        {
            f.setVisibility(8);
            g.setVisibility(8);
            return;
        }
    }

    static EditText b(EmailSettingsFragment emailsettingsfragment)
    {
        return emailsettingsfragment.a;
    }

    static View c(EmailSettingsFragment emailsettingsfragment)
    {
        return emailsettingsfragment.f;
    }

    static TextView d(EmailSettingsFragment emailsettingsfragment)
    {
        return emailsettingsfragment.g;
    }

    static void e(EmailSettingsFragment emailsettingsfragment)
    {
        emailsettingsfragment.m();
    }

    static void f(EmailSettingsFragment emailsettingsfragment)
    {
        emailsettingsfragment.a(((String) (null)));
    }

    static Ei g(EmailSettingsFragment emailsettingsfragment)
    {
        return emailsettingsfragment.l;
    }

    static Button h(EmailSettingsFragment emailsettingsfragment)
    {
        return emailsettingsfragment.c;
    }

    static View i(EmailSettingsFragment emailsettingsfragment)
    {
        return emailsettingsfragment.e;
    }

    static Button j(EmailSettingsFragment emailsettingsfragment)
    {
        return emailsettingsfragment.d;
    }

    private void m()
    {
        if (!TextUtils.isEmpty(a.getText()))
        {
            if (TextUtils.equals(a.getText(), Bt.S()) && Bt.bv())
            {
                h.setVisibility(0);
            } else
            {
                h.setVisibility(8);
            }
            if (n())
            {
                b.setText(j);
                return;
            } else
            {
                b.setText(i);
                return;
            }
        } else
        {
            h.setVisibility(8);
            b.setText(i);
            return;
        }
    }

    private boolean n()
    {
        return TextUtils.equals(a.getText(), Bt.bw()) || TextUtils.isEmpty(Bt.bw()) && TextUtils.equals(a.getText(), Bt.S()) && !Bt.bv();
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BELOW_FOR_ADJUSTABLE_UI;
    }

    public final void e()
    {
        super.e();
        Jo.a(getActivity(), ac().getDecorView().getRootView());
    }

    public final boolean f()
    {
        if (d(LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag()))
        {
            return true;
        } else
        {
            return super.f();
        }
    }

    protected final void h()
    {
        e.setVisibility(8);
        if (!TextUtils.isEmpty(a.getText()) && (!TextUtils.isEmpty(Bt.bw()) || !TextUtils.equals(Bt.S(), a.getText()) || !Bt.bv()))
        {
            if (n())
            {
                c.setVisibility(0);
                c.setText(0x7f080311);
                c.setClickable(true);
                d.setVisibility(8);
            } else
            {
                c.setVisibility(8);
                d.setVisibility(0);
                d.setText(0x7f080216);
                d.setClickable(true);
            }
            if (a.requestFocus())
            {
                Jo.g(getActivity());
            }
            return;
        } else
        {
            c.setVisibility(8);
            d.setVisibility(8);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f04006f, viewgroup, false);
        i = IC.a(null, 0x7f080128, new Object[0]);
        j = IC.a(null, 0x7f08012b, new Object[0]);
        h = (TextView)d(0x7f0d02b0);
        h.setText(getResources().getString(0x7f08012a, new Object[] {
            LY.a(Emoji.OK_HAND_SIGN)
        }));
        d(0x7f0d02a9).setOnClickListener(new android.view.View.OnClickListener() {

            private EmailSettingsFragment a;

            public final void onClick(View view)
            {
                Jo.a(a.getActivity(), a.getView());
                a.getActivity().onBackPressed();
            }

            
            {
                a = EmailSettingsFragment.this;
                super();
            }
        });
        b = (TextView)d(0x7f0d02ac);
        d = (Button)d(0x7f0d02b3);
        layoutinflater = d;
        getActivity().getAssets();
        Iq.a(layoutinflater);
        e = d(0x7f0d02b4);
        c = (Button)d(0x7f0d02b2);
        layoutinflater = c;
        getActivity().getAssets();
        Iq.a(layoutinflater);
        f = d(0x7f0d02ae);
        g = (TextView)d(0x7f0d02af);
        f.setOnClickListener(new android.view.View.OnClickListener() {

            private EmailSettingsFragment a;

            public final void onClick(View view)
            {
                EmailSettingsFragment.b(a).setText("");
                EmailSettingsFragment.c(a).setVisibility(8);
                EmailSettingsFragment.d(a).setVisibility(8);
            }

            
            {
                a = EmailSettingsFragment.this;
                super();
            }
        });
        a = (EditText)d(0x7f0d02ad);
        if (TextUtils.isEmpty(Bt.bw())) goto _L2; else goto _L1
_L1:
        a.setText(Bt.bw());
_L4:
        a.addTextChangedListener(new TextWatcher() {

            private EmailSettingsFragment a;

            public final void afterTextChanged(Editable editable)
            {
                EmailSettingsFragment.e(a);
                a.h();
                EmailSettingsFragment.f(a);
            }

            public final void beforeTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            public final void onTextChanged(CharSequence charsequence, int i1, int j1, int k1)
            {
            }

            
            {
                a = EmailSettingsFragment.this;
                super();
            }
        });
        c.setOnClickListener(new android.view.View.OnClickListener() {

            private EmailSettingsFragment a;

            public final void onClick(View view)
            {
                EmailSettingsFragment.a(a).add(Integer.valueOf(EmailSettingsFragment.g(a).a(a.getActivity(), Ss.a.VERIFYEMAIL, null, null)));
                EmailSettingsFragment.h(a).setText("");
                EmailSettingsFragment.h(a).setClickable(false);
                EmailSettingsFragment.i(a).setVisibility(0);
            }

            
            {
                a = EmailSettingsFragment.this;
                super();
            }
        });
        d.setOnClickListener(new android.view.View.OnClickListener() {

            private EmailSettingsFragment a;

            public final void onClick(View view)
            {
                EmailSettingsFragment.a(a).add(Integer.valueOf(EmailSettingsFragment.g(a).a(a.getActivity(), EmailSettingsFragment.b(a).getText().toString())));
                EmailSettingsFragment.j(a).setText("");
                EmailSettingsFragment.j(a).setClickable(false);
                EmailSettingsFragment.i(a).setVisibility(0);
            }

            
            {
                a = EmailSettingsFragment.this;
                super();
            }
        });
        m();
        h();
        return mFragmentLayout;
_L2:
        if (!TextUtils.isEmpty(Bt.S()))
        {
            a.setText(Bt.S());
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void onPause()
    {
        super.onPause();
        l.b(1012, m);
        l.b(1015, m);
        k.clear();
    }

    public void onResume()
    {
        super.onResume();
        l.a(1012, m);
        l.a(1015, m);
    }

    public void onVisible()
    {
        super.onVisible();
        h();
        Intent intent = getActivity().getIntent();
        if (!TextUtils.isEmpty(intent.getStringExtra("change_email_key")))
        {
            a.setText(intent.getStringExtra("change_email_key"));
            intent.removeExtra("change_email_key");
            a(intent.getStringExtra("change_email_message_key"));
            intent.removeExtra("change_email_message_key");
        }
    }
}
