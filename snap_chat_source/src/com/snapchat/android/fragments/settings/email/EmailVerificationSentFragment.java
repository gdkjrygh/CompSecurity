// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.fragments.settings.email;

import Bt;
import CU;
import Dj;
import Eh;
import Ei;
import IC;
import Mf;
import Oi;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.snapchat.android.fragments.addfriends.LeftSwipeContentFragment;
import com.snapchat.android.util.eventbus.ShowDialogEvent;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.snapchat.android.fragments.settings.email:
//            EmailSettingsFragment

public class EmailVerificationSentFragment extends SnapchatFragment
{

    private View a;
    private View b;
    private TextView c;
    private TextView d;
    private Bt e;
    private final Set f;
    private final Ei g;
    private Eh h = new Eh() {

        private EmailVerificationSentFragment a;

        public final void a(CU cu)
        {
label0:
            {
                int i = Ei.a(cu);
                if (EmailVerificationSentFragment.a(a).contains(Integer.valueOf(i)) && (cu instanceof Dj))
                {
                    EmailVerificationSentFragment.a(a).remove(Integer.valueOf(i));
                    cu = ((Dj)cu).b;
                    EmailVerificationSentFragment.b(a).setVisibility(8);
                    EmailVerificationSentFragment.c(a).setVisibility(0);
                    if (!((Dj.a) (cu)).a)
                    {
                        break label0;
                    }
                    cu = new com.snapchat.android.util.eventbus.ShowDialogEvent.a(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.ONE_BUTTON);
                    cu.mTitleResId = 0x7f080124;
                    EmailVerificationSentFragment.d(a);
                    cu.mMessage = IC.a(null, 0x7f080123, new Object[] {
                        Bt.bw()
                    });
                    cu = cu.a();
                    Mf.a().a(cu);
                }
                return;
            }
            Mf.a().a(new ShowDialogEvent(com.snapchat.android.util.eventbus.ShowDialogEvent.DialogType.TOAST, ((Dj.a) (cu)).c));
        }

            
            {
                a = EmailVerificationSentFragment.this;
                super();
            }
    };

    public EmailVerificationSentFragment()
    {
        this(Bt.a(), Ei.a());
    }

    private EmailVerificationSentFragment(Bt bt, Ei ei)
    {
        f = new HashSet();
        e = bt;
        g = ei;
    }

    static Set a(EmailVerificationSentFragment emailverificationsentfragment)
    {
        return emailverificationsentfragment.f;
    }

    static View b(EmailVerificationSentFragment emailverificationsentfragment)
    {
        return emailverificationsentfragment.a;
    }

    static View c(EmailVerificationSentFragment emailverificationsentfragment)
    {
        return emailverificationsentfragment.b;
    }

    static Bt d(EmailVerificationSentFragment emailverificationsentfragment)
    {
        return emailverificationsentfragment.e;
    }

    static Ei e(EmailVerificationSentFragment emailverificationsentfragment)
    {
        return emailverificationsentfragment.g;
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

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        mFragmentLayout = layoutinflater.inflate(0x7f0400cd, viewgroup, false);
        c = (TextView)d(0x7f0d0467);
        c.setText(Bt.bw());
        d = (TextView)d(0x7f0d0468);
        if (Bt.bv())
        {
            d.setText(IC.a(null, 0x7f080126, new Object[] {
                Bt.S()
            }));
            d.setVisibility(0);
        } else
        {
            d.setVisibility(8);
        }
        b = d(0x7f0d0469);
        a = d(0x7f0d046a);
        d(0x7f0d0463).setOnClickListener(new android.view.View.OnClickListener() {

            private EmailVerificationSentFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = EmailVerificationSentFragment.this;
                super();
            }
        });
        b.setOnClickListener(new android.view.View.OnClickListener() {

            private EmailVerificationSentFragment a;

            public final void onClick(View view)
            {
                view = EmailVerificationSentFragment.a(a);
                Ei ei = EmailVerificationSentFragment.e(a);
                FragmentActivity fragmentactivity = a.getActivity();
                Ss.a a1 = Ss.a.VERIFYEMAIL;
                EmailVerificationSentFragment.d(a);
                view.add(Integer.valueOf(ei.a(fragmentactivity, a1, Bt.bw(), null)));
                EmailVerificationSentFragment.b(a).setVisibility(0);
                EmailVerificationSentFragment.c(a).setVisibility(8);
            }

            
            {
                a = EmailVerificationSentFragment.this;
                super();
            }
        });
        c.setOnTouchListener(new android.view.View.OnTouchListener() {

            public final boolean onTouch(View view, MotionEvent motionevent)
            {
                if (motionevent.getAction() == 0)
                {
                    Mf.a().a(new Oi(new EmailSettingsFragment(), com/snapchat/android/fragments/settings/email/EmailSettingsFragment.getSimpleName(), LeftSwipeContentFragment.SETTINGS_FRAGMENT.tag()));
                    return true;
                } else
                {
                    return false;
                }
            }

        });
        return mFragmentLayout;
    }

    public void onPause()
    {
        super.onPause();
        g.b(1012, h);
        f.clear();
    }

    public void onResume()
    {
        super.onResume();
        g.a(1012, h);
    }
}
