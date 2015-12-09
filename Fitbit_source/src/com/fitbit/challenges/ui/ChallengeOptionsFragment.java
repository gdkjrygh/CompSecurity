// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import com.fitbit.challenges.ui.a.b;
import com.fitbit.challenges.ui.a.d;
import com.fitbit.challenges.ui.progress.ChallengeProgressIgnoreDialogFragment;
import com.fitbit.data.bl.ChallengesUtils;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.data.domain.challenges.ChallengeUser;
import com.fitbit.settings.ui.ProfileActivity;
import com.fitbit.util.f;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeStateSupportFragment, ChallengeOptionsFragment_, QuitChallengeOptionsDialogFragment

public class ChallengeOptionsFragment extends ChallengeStateSupportFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, ChallengeOptionsNotificationView.a, ChallengeOptionsQuitView.a, OptionsChallengeUserView.a, QuitChallengeOptionsDialogFragment.a, com.fitbit.challenges.ui.progress.ChallengeProgressIgnoreDialogFragment.a
{

    public static final String a = "com.fitbit.challenges.ui.ChallengeOptionsFragment.QUIT_ACTION";
    public static final String b = "DIALOG_QUIT";
    public static final String c = "DIALOG_IGNORE";
    private static final String g = "ChallengeOptionsFragment";
    protected StickyListHeadersListView d;
    String e;
    protected a f;
    private Profile h;
    private ServerCommunicationException i;
    private d j;
    private b k;

    public ChallengeOptionsFragment()
    {
        j = new _cls2(getActivity());
    }

    public static ChallengeOptionsFragment a()
    {
        return ChallengeOptionsFragment_.i().a();
    }

    static ServerCommunicationException a(ChallengeOptionsFragment challengeoptionsfragment, ServerCommunicationException servercommunicationexception)
    {
        challengeoptionsfragment.i = servercommunicationexception;
        return servercommunicationexception;
    }

    static Profile a(ChallengeOptionsFragment challengeoptionsfragment)
    {
        return challengeoptionsfragment.h;
    }

    static Profile a(ChallengeOptionsFragment challengeoptionsfragment, Profile profile)
    {
        challengeoptionsfragment.h = profile;
        return profile;
    }

    static void b(ChallengeOptionsFragment challengeoptionsfragment)
    {
        challengeoptionsfragment.i();
    }

    private void i()
    {
        getLoaderManager().restartLoader(221, null, this);
    }

    public void a(Loader loader, d d1)
    {
        boolean flag = true;
    /* block-local class not found */
    class a {}

        f.a(d1);
        b(false);
        if (i != null)
        {
            a(i, true);
            return;
        }
        c(true);
    /* block-local class not found */
    class d {}

        if (a.a(f).a != null)
        {
            flag = false;
        }
        d(flag);
    }

    public void a(ChallengeUser challengeuser)
    {
        if (h != null && !challengeuser.e(h.F()))
        {
            startActivity(ProfileActivity.a(getActivity(), challengeuser.f()));
        }
    }

    public void a(boolean flag)
    {
        if (a.a(f).a == null)
        {
            return;
        }
    /* block-local class not found */
    class b {}

        b b1;
        if (flag)
        {
            ChallengesUtils.a("Challenges: Turn On Push Notifications", a.a(f).a);
        } else
        {
            ChallengesUtils.a("Challenges: Turn Off Push Notifications", a.a(f).a);
        }
        b1 = new b(getActivity(), flag);
        k = b1;
        com.fitbit.util.f.a(b1);
    }

    protected void b()
    {
        if (e == null)
        {
            throw new RuntimeException("Missing challengeId");
        }
        Object obj = d;
        a a1 = new a(getActivity());
        f = a1;
        ((StickyListHeadersListView) (obj)).a(a1);
        obj = (QuitChallengeOptionsDialogFragment)getFragmentManager().findFragmentByTag("DIALOG_QUIT");
        if (obj != null)
        {
            ((QuitChallengeOptionsDialogFragment) (obj)).a(a.a(f).a);
        }
    }

    protected com.fitbit.savedstate.LoadSavedState.Status c()
    {
        com.fitbit.savedstate.LoadSavedState.Status status = com.fitbit.savedstate.LoadSavedState.Status.a;
        if (a(i) || k != null && a(k.a()))
        {
            status = com.fitbit.savedstate.LoadSavedState.Status.c;
        } else
        if (a.a(f) != null)
        {
            return com.fitbit.savedstate.LoadSavedState.Status.b;
        }
        return status;
    }

    public void d()
    {
        if (a.a(f).a == null)
        {
            return;
        }
        if (com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED == a.a(f).a.i())
        {
            ChallengeProgressIgnoreDialogFragment.b(this).show(getFragmentManager(), "DIALOG_IGNORE");
            return;
        } else
        {
            QuitChallengeOptionsDialogFragment.a(a.a(f).a, this).show(getFragmentManager(), "DIALOG_QUIT");
            return;
        }
    }

    public void e()
    {
        b(true);
    /* block-local class not found */
    class c {}

        com.fitbit.util.f.a(new c(getActivity()));
    }

    protected void f()
    {
        i();
    }

    public void g()
    {
        com.fitbit.util.f.a(new b(getActivity(), a.a(f).a, j));
    }

    public void h()
    {
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        c(false);
        d(false);
        b(true);
        i();
    }

    public Loader onCreateLoader(int l, Bundle bundle)
    {
        b(true);
        return new _cls1(getActivity());
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (d)obj);
    }

    public void onLoaderReset(Loader loader)
    {
        c(false);
    }

    // Unreferenced inner class com/fitbit/challenges/ui/ChallengeOptionsFragment$ItemTypeChallenges
    /* block-local class not found */
    class ItemTypeChallenges {}


    /* member class not found */
    class _cls2 {}


    /* member class not found */
    class _cls1 {}

}
