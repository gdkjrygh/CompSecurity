// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.fitbit.data.bl.ChallengesUtils;
import com.fitbit.data.domain.NamedTime;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.device.ui.setup.choose.ChooseTrackerActivity;
import com.fitbit.e.a;
import com.fitbit.galileo.ui.sync.b;
import com.fitbit.runtrack.ui.FitbitFragment;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.ui.s;
import com.fitbit.util.ad;
import com.fitbit.util.p;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.fitbit.challenges.ui:
//            StartChallengeButton, ChallengeGameplayActivity, ComplexDialogFragment, AddPlayersActivity, 
//            RequiredFeaturesDialogFragment

public class OutgoingInvitationFragment extends FitbitFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener, ComplexDialogFragment.a
{

    public static final String a = "com.fitbit.challenges.ui.OutgoingInvitationFragment";
    protected static final String b = "DIALOG_DEVICE_REQUIRED";
    public static final String c = "com.fitbit.challenges.ui.TAG_DLG_CHALLENGES_APP_UPDATE";
    private static final String d = "challenge_type";
    private static final String e = "challenge_rematch";
    private static final String f = "challenge_rematch_source";
    private b g;
    private View h;
    private View i;
    private TextView j;
    private TextView k;
    private LoadablePicassoImageView l;
    private ViewGroup m;
    private Challenge n;
    private String o;
    private ChallengeType p;
    private com.fitbit.data.bl.ChallengesUtils.RematchSource q;
    private a r;
    private Date s;
    private boolean t;

    public OutgoingInvitationFragment()
    {
    }

    public static OutgoingInvitationFragment a(Challenge challenge, String s1, com.fitbit.data.bl.ChallengesUtils.RematchSource rematchsource)
    {
        Bundle bundle = new Bundle();
        bundle.putString("challenge_type", s1);
        bundle.putParcelable("challenge_rematch", challenge);
        bundle.putSerializable("challenge_rematch_source", rematchsource);
        challenge = new OutgoingInvitationFragment();
        challenge.setArguments(bundle);
        return challenge;
    }

    static LoadablePicassoImageView a(OutgoingInvitationFragment outgoinginvitationfragment)
    {
        return outgoinginvitationfragment.l;
    }

    static Date a(OutgoingInvitationFragment outgoinginvitationfragment, Date date)
    {
        outgoinginvitationfragment.s = date;
        return date;
    }

    private void a(int i1, Intent intent)
    {
        if (intent != null && intent.getExtras() != null && intent.hasExtra("EXTRA_CANCEL_RESULT_REASON"))
        {
            intent = intent.getExtras().getString("EXTRA_CANCEL_RESULT_REASON");
            com.fitbit.ui.s.a(getActivity(), intent, 1).i();
        } else
        if (i1 == -1)
        {
            c();
            return;
        }
    }

    private void a(boolean flag)
    {
        int j1 = 0;
        int i1 = p.a().size();
        if (flag)
        {
            i1 = 0;
        }
        if (m.getChildCount() > i1)
        {
            for (int k1 = m.getChildCount(); j1 < k1 - i1; j1++)
            {
                m.getChildAt(j1).setVisibility(8);
            }

        }
    }

    static View b(OutgoingInvitationFragment outgoinginvitationfragment)
    {
        return outgoinginvitationfragment.i;
    }

    private void d()
    {
        if (p != null)
        {
            a();
            k.setText(p.c());
            j.setText(p.d());
    /* block-local class not found */
    class b {}

            l.a(new b(getActivity(), l), new b(getActivity(), l));
            l.a(p.g());
            m.setVisibility(0);
            return;
        } else
        {
            m.setVisibility(8);
            return;
        }
    }

    private void e()
    {
        List list = p.a();
        for (int i1 = 0; i1 < list.size(); i1++)
        {
            StartChallengeButton startchallengebutton = (StartChallengeButton)m.getChildAt(i1);
            startchallengebutton.a((NamedTime)list.get(i1));
            startchallengebutton.setVisibility(0);
        }

    }

    private void f()
    {
        StartChallengeButton startchallengebutton;
        android.widget.LinearLayout.LayoutParams layoutparams;
        for (; m.getChildCount() < p.a().size(); m.addView(startchallengebutton, layoutparams))
        {
            startchallengebutton = new StartChallengeButton(getActivity());
            startchallengebutton.setOnClickListener(new _cls1());
            layoutparams = new android.widget.LinearLayout.LayoutParams(-1, getResources().getDimensionPixelSize(0x7f0a0058));
            layoutparams.leftMargin = getResources().getDimensionPixelSize(0x7f0a0059);
            layoutparams.topMargin = getResources().getDimensionPixelSize(0x7f0a005a);
            layoutparams.rightMargin = getResources().getDimensionPixelSize(0x7f0a0059);
        }

    }

    private void g()
    {
        String s1;
        if (p != null)
        {
            s1 = p.b();
        } else
        {
            s1 = null;
        }
        com.fitbit.challenges.ui.ChallengeGameplayActivity.a(getActivity(), s1, null, o);
    }

    public void a()
    {
        List list = p.a();
        boolean flag1 = p.h();
        if (list != null)
        {
            if (list.size() == 0 && flag1)
            {
                list.add(new NamedTime(getString(0x7f0804ea), null));
            }
            if (flag1)
            {
                f();
            }
            boolean flag;
            if (!flag1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            a(flag);
            if (flag1)
            {
                e();
            }
        }
    }

    public void a(Loader loader, ChallengeType challengetype)
    {
    /* block-local class not found */
    class a {}

        if (r.b() != null)
        {
            r.b();
            new _cls3();
        } else
        {
            if (challengetype != null)
            {
                p = challengetype;
            }
            d();
            if (t)
            {
                t = false;
                c();
                return;
            }
        }
    }

    public void a(ComplexDialogFragment complexdialogfragment, int i1)
    {
        switch (i1)
        {
        default:
            return;

        case 2131231929: 
            ChooseTrackerActivity.a(this, g, 4904);
            break;
        }
        complexdialogfragment.dismiss();
    }

    protected void b()
    {
        if (p.o())
        {
            ChallengesUtils.a(p.f(), s, q);
            c();
        } else
        {
            com.fitbit.e.a.a("com.fitbit.challenges.ui.OutgoingInvitationFragment", "false == challengeType.isChallengeTypeSupported()", new Object[0]);
            com.fitbit.util.SimpleConfirmDialogFragment simpleconfirmdialogfragment = ChallengesUtils.a(getActivity(), new _cls2());
            if (simpleconfirmdialogfragment != null)
            {
                com.fitbit.e.a.a("com.fitbit.challenges.ui.OutgoingInvitationFragment", "null != fragment", new Object[0]);
                ad.a(getActivity().getSupportFragmentManager(), "com.fitbit.challenges.ui.TAG_DLG_CHALLENGES_APP_UPDATE", simpleconfirmdialogfragment);
                return;
            }
        }
    }

    public void c()
    {
        if (!isAdded())
        {
            return;
        }
        if (n != null)
        {
            Bundle bundle = new Bundle();
            bundle.putParcelable("challenge_rematch", n);
            bundle.putLong("startTime", s.getTime());
    /* block-local class not found */
    class c {}

            getLoaderManager().restartLoader(0x7f110270, bundle, new c(getActivity(), "challenge_rematch", "startTime"));
            return;
        }
        if (p != null)
        {
            if (com.fitbit.util.p.e(p.l()))
            {
                startActivity(com.fitbit.challenges.ui.AddPlayersActivity.a(getActivity(), p, s));
                return;
            } else
            {
                com.fitbit.challenges.ui.RequiredFeaturesDialogFragment.a(getFragmentManager(), "DIALOG_DEVICE_REQUIRED", p.d(), new int[] {
                    0x7f0804b9
                }, this);
                return;
            }
        } else
        {
            t = true;
            return;
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        switch (i1)
        {
        default:
            super.onActivityResult(i1, j1, intent);
            return;

        case 4904: 
            a(j1, intent);
            break;
        }
    }

    public void onAttach(Activity activity)
    {
        super.onAttach(activity);
        g = com.fitbit.galileo.ui.sync.b.a(activity);
    }

    public void onClick(View view)
    {
        switch (view.getId())
        {
        default:
            return;

        case 2131821525: 
            getLoaderManager().restartLoader(223, null, this);
            return;

        case 2131821157: 
            g();
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        o = getArguments().getString("challenge_type");
        n = (Challenge)getArguments().getParcelable("challenge_rematch");
        q = (com.fitbit.data.bl.ChallengesUtils.RematchSource)getArguments().getSerializable("challenge_rematch_source");
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        r = new a(getActivity(), o);
        return r;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f04008d, viewgroup, false);
        h = layoutinflater.findViewById(0x7f11026a);
        i = layoutinflater.findViewById(0x7f11026c);
        j = (TextView)layoutinflater.findViewById(0x7f11011f);
        k = (TextView)layoutinflater.findViewById(0x7f110260);
        l = (LoadablePicassoImageView)layoutinflater.findViewById(0x7f11026b);
        m = (ViewGroup)layoutinflater.findViewById(0x7f11026d);
        layoutinflater.findViewById(0x7f110265).setOnClickListener(this);
        com.fitbit.util.b.a.a(getResources().getDrawable(0x7f020226), h);
        return layoutinflater;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (ChallengeType)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (o == null)
        {
            throw new RuntimeException("Missing challenge type");
        }
        d();
        view = (RequiredFeaturesDialogFragment)getFragmentManager().findFragmentByTag("DIALOG_DEVICE_REQUIRED");
        if (view != null)
        {
            view.a(this);
            view.e = (new int[] {
                0x7f0804b9
            });
        }
        getLoaderManager().restartLoader(223, null, this);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}

}
