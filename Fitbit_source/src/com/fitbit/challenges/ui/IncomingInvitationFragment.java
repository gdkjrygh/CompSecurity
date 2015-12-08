// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.Spannable;
import android.text.TextUtils;
import android.text.style.StyleSpan;
import android.view.View;
import android.widget.TextView;
import com.fitbit.challenges.ui.a.b;
import com.fitbit.challenges.ui.a.c;
import com.fitbit.challenges.ui.a.d;
import com.fitbit.data.bl.ChallengesUtils;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.User;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.data.domain.challenges.ChallengeUser;
import com.fitbit.device.ui.setup.choose.ChooseTrackerActivity;
import com.fitbit.e.a;
import com.fitbit.home.ui.i;
import com.fitbit.ui.s;
import com.fitbit.util.ad;
import com.fitbit.util.f;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeStateSupportFragment, HorizontalListView, RequiredFeaturesDialogFragment, InvitationExpiredDialogFragment, 
//            TimeDifferenceDialogFragment, ChallengeActivity, ComplexDialogFragment, ChallengeGameplayActivity

public class IncomingInvitationFragment extends ChallengeStateSupportFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, ComplexDialogFragment.a
{

    public static final String a = "DIALOG_DEVICE_REQUIRED";
    public static final String b = "DIALOG_INVITE_EXPIRED";
    public static final String c = "com.fitbit.challenges.ui.IncomingInvitationFragment";
    public static final int d = 1;
    public static final int e = 2;
    public static final String f = "com.fitbit.challenges.ui.TAG_DLG_CHALLENGES_APP_UPDATE";
    public static final String g = "DIALOG_TIME_DIFFERENCE";
    private static final int r = 4210;
    private static final int s = 1000;
    private static final float x = 0.15F;
    private Profile A;
    private a B;
    private ServerCommunicationException C;
    private c D;
    private b E;
    private i F;
    private boolean G;
    private com.fitbit.data.bl.ChallengesUtils.d H;
    protected com.fitbit.galileo.ui.sync.b h;
    protected View i;
    protected TextView j;
    protected TextView k;
    protected TextView l;
    protected HorizontalListView m;
    protected TextView n;
    protected TextView o;
    protected TextView p;
    protected String q;
    private Challenge y;
    private ChallengeType z;

    public IncomingInvitationFragment()
    {
        F = new i();
        H = new _cls1();
    }

    static Challenge a(IncomingInvitationFragment incominginvitationfragment)
    {
        return incominginvitationfragment.y;
    }

    static void a(IncomingInvitationFragment incominginvitationfragment, boolean flag)
    {
        incominginvitationfragment.a(flag);
    }

    private void a(boolean flag)
    {
        n.setEnabled(flag);
        p.setEnabled(flag);
        o.setEnabled(flag);
    }

    static void b(IncomingInvitationFragment incominginvitationfragment)
    {
        incominginvitationfragment.o();
    }

    static InvitationExpiredDialogFragment.a c(IncomingInvitationFragment incominginvitationfragment)
    {
        return incominginvitationfragment.p();
    }

    static com.fitbit.util.SimpleConfirmDialogFragment.a d(IncomingInvitationFragment incominginvitationfragment)
    {
        return incominginvitationfragment.s();
    }

    private void l()
    {
        getActivity().getSupportLoaderManager().restartLoader(221, null, this);
    }

    private void m()
    {
        if (y == null)
        {
            i.setVisibility(8);
            return;
        }
        i.setVisibility(0);
        k.setText(y.e());
        l.setText(F.a(getActivity(), y.B(), 0x7f0800ce, 0x7f0800cf));
        String s1 = y.h();
        String s3 = y.I().g().P();
        String s2 = getString(0x7f08059c, new Object[] {
            s3, s1
        });
        com.fitbit.e.a.a("com.fitbit.challenges.ui.IncomingInvitationFragment", "res = %s, inviterDisplayName = %s, challengeName = %s", new Object[] {
            s2, s3, s1
        });
        j.setText(s2);
        if (!TextUtils.isEmpty(s1))
        {
            Spannable spannable = (Spannable)j.getText();
            int i1 = s2.indexOf(s1);
            int j1 = s1.length() + i1;
            if (i1 > 0 && j1 > 0 && i1 <= j1)
            {
                spannable.setSpan(new StyleSpan(1), i1, j1, 33);
            }
        }
    /* block-local class not found */
    class a {}

        B.a(y);
    }

    private void n()
    {
        com.fitbit.util.SimpleConfirmDialogFragment simpleconfirmdialogfragment = ChallengesUtils.a(getActivity(), H);
        if (simpleconfirmdialogfragment != null)
        {
            com.fitbit.e.a.a("com.fitbit.challenges.ui.IncomingInvitationFragment", "null != fragment", new Object[0]);
            ad.a(getActivity().getSupportFragmentManager(), "com.fitbit.challenges.ui.TAG_DLG_CHALLENGES_APP_UPDATE", simpleconfirmdialogfragment);
        }
    }

    private void o()
    {
        if (z != null)
        {
            if (z.o())
            {
                v.setVisibility(0);
                a(false);
                d d1 = e();
                D = new c(getActivity(), z, y, d1);
                com.fitbit.util.f.a(D);
                return;
            } else
            {
                com.fitbit.e.a.a("com.fitbit.challenges.ui.IncomingInvitationFragment", "false == challengeType.isChallengeTypeSupported()", new Object[0]);
                n();
                return;
            }
        }
        if (y != null)
        {
            com.fitbit.e.a.a("com.fitbit.challenges.ui.IncomingInvitationFragment", "challengeType is null, showAppUpdateDialog", new Object[0]);
            n();
            return;
        } else
        {
            G = true;
            return;
        }
    }

    private InvitationExpiredDialogFragment.a p()
    {
        return new _cls5();
    }

    private TimeDifferenceDialogFragment.a q()
    {
        return new _cls6();
    }

    private d r()
    {
        return new _cls7(getActivity());
    }

    private com.fitbit.util.SimpleConfirmDialogFragment.a s()
    {
        return new _cls8();
    }

    protected void a()
    {
        l();
        B = new a();
        m.a(B);
        m.a(0.15F);
        m.a(1000L);
        c(false);
        m();
        android.support.v4.app.FragmentManager fragmentmanager = getFragmentManager();
        com.fitbit.challenges.ui.RequiredFeaturesDialogFragment.a(fragmentmanager, "DIALOG_DEVICE_REQUIRED", this);
        com.fitbit.challenges.ui.InvitationExpiredDialogFragment.a(fragmentmanager, "DIALOG_INVITE_EXPIRED", p());
        com.fitbit.challenges.ui.TimeDifferenceDialogFragment.b(getActivity(), fragmentmanager, "DIALOG_TIME_DIFFERENCE", y, A, q());
    }

    protected void a(int i1)
    {
        if (i1 == 2)
        {
            getActivity().finish();
        } else
        if (i1 == 1)
        {
            com.fitbit.e.a.a("com.fitbit.challenges.ui.IncomingInvitationFragment", "Start ChallengeActivity with challengeId = %s", new Object[] {
                q
            });
            startActivity(com.fitbit.challenges.ui.ChallengeActivity.a(getActivity(), q, true));
            getActivity().finish();
            return;
        }
    }

    protected void a(int i1, Intent intent)
    {
        if (intent != null && intent.getExtras() != null && intent.hasExtra("EXTRA_CANCEL_RESULT_REASON"))
        {
            intent = intent.getExtras().getString("EXTRA_CANCEL_RESULT_REASON");
            com.fitbit.ui.s.a(getActivity(), intent, 1).i();
        } else
        if (i1 == -1)
        {
            o();
            return;
        }
    }

    public void a(Loader loader, b b1)
    {
        boolean flag = true;
        b(false);
    /* block-local class not found */
    class b {}

        C = com.fitbit.challenges.ui.b.b(b1);
        if (com.fitbit.challenges.ui.b.b(b1) != null)
        {
            a(com.fitbit.challenges.ui.b.b(b1), true, ((android.content.DialogInterface.OnClickListener) (new _cls3())));
        } else
        {
            c(true);
            if (com.fitbit.challenges.ui.b.a(b1) != null)
            {
                y = com.fitbit.challenges.ui.b.a(b1);
            }
            if (com.fitbit.challenges.ui.b.c(b1) != null)
            {
                z = com.fitbit.challenges.ui.b.c(b1);
            }
            if (com.fitbit.challenges.ui.b.d(b1) != null)
            {
                A = com.fitbit.challenges.ui.b.d(b1);
            }
            m();
            if (G)
            {
                G = false;
                o();
            }
        }
        if (y != null)
        {
            flag = false;
        }
        d(flag);
    }

    public void a(ComplexDialogFragment complexdialogfragment, int i1)
    {
        switch (i1)
        {
        default:
            throw new UnsupportedOperationException("Unsupported dialog item selected in Incoming invittion");

        case 2131231929: 
            ChooseTrackerActivity.a(this, h, 4904);
            complexdialogfragment.dismiss();
            // fall through

        case 2131231426: 
            return;

        case 2131231035: 
            complexdialogfragment.dismiss();
            f();
            return;
        }
    }

    public void b()
    {
        ChallengesUtils.a("Challenges: Join", y);
        d();
    }

    protected com.fitbit.savedstate.LoadSavedState.Status c()
    {
        if (a(C))
        {
            return com.fitbit.savedstate.LoadSavedState.Status.c;
        }
        if (y != null)
        {
            return com.fitbit.savedstate.LoadSavedState.Status.b;
        } else
        {
            return com.fitbit.savedstate.LoadSavedState.Status.a;
        }
    }

    public void d()
    {
        if (y != null && A != null)
        {
            com.fitbit.challenges.ui.TimeDifferenceDialogFragment.a(getActivity(), getFragmentManager(), "DIALOG_TIME_DIFFERENCE", y, A, q());
        }
    }

    public d e()
    {
        return new _cls4(getActivity());
    }

    public void f()
    {
        v.setVisibility(0);
        d d1 = r();
        E = new b(getActivity(), y, d1);
        com.fitbit.util.f.a(E);
    }

    public void g()
    {
        if (z != null && z.o())
        {
            startActivityForResult(com.fitbit.challenges.ui.ChallengeActivity.a(getActivity(), q, true), 4210);
            return;
        } else
        {
            com.fitbit.e.a.a("com.fitbit.challenges.ui.IncomingInvitationFragment", "false == challengeType.isChallengeTypeSupported() or challengeType is nul, challengeType = %s", new Object[] {
                z
            });
            n();
            return;
        }
    }

    public void h()
    {
        Object obj = null;
        String s1;
        String s2;
        if (z != null)
        {
            s2 = z.b();
        } else
        {
            s2 = null;
        }
        if (y != null)
        {
            s1 = y.w();
        } else
        {
            s1 = null;
        }
        if (s1 == null)
        {
            s1 = obj;
            if (z != null)
            {
                s1 = z.f();
            }
        }
        com.fitbit.challenges.ui.ChallengeGameplayActivity.a(getActivity(), s2, q, s1);
    }

    public void i()
    {
        l();
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        b(true);
        return new _cls2(getActivity());
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (b)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        v.setVisibility(8);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls5 {}


    /* member class not found */
    class _cls6 {}


    /* member class not found */
    class _cls7 {}


    /* member class not found */
    class _cls8 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls4 {}


    /* member class not found */
    class _cls2 {}

}
