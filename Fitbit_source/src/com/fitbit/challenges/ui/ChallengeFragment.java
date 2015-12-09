// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.content.LocalBroadcastManager;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import com.fitbit.FitbitMobile.GCMNotification;
import com.fitbit.challenges.ui.progress.ChallengeProgressFragment;
import com.fitbit.challenges.ui.progress.ChallengeProgressFragment_;
import com.fitbit.challenges.ui.pulldown.BaseLayout;
import com.fitbit.data.bl.ChallengesUtils;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.data.domain.challenges.ChallengeUser;
import com.fitbit.e.a;
import com.fitbit.util.ad;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.fitbit.challenges.ui:
//            ChallengeMessagesFragment, ChallengeGameplayActivity, AddPlayersActivity, ChallengeOptionsActivity, 
//            ChallengeMessagesFragment_

public class ChallengeFragment extends Fragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, com.fitbit.util.PushNotificationsController.a
{

    public static final int a = 3;
    private static final String c = "ChallengeInfoFragment";
    private static final short d = 629;
    private static final short e = 885;
    private static final String f = "challenge_id";
    private static final String g = "challenge";
    private static final String h = "exception";
    private static final String i = "open_progress";
    private static final String j = "com.fitbit.challenges.ui.TAG_DLG_CHALLENGES_APP_UPDATE";
    private static final String k = "com.fitbit.challenges.ui.ChallengeMessagesFragment.TAG";
    private static final String l = "PROGRESS_TAG";
    BroadcastReceiver b;
    private boolean m;
    private String n;
    private Challenge o;
    private ChallengeType p;
    private Profile q;
    private ServerCommunicationException r;
    private BaseLayout s;
    private Set t;
    private ChallengeMessagesFragment u;
    private ChallengeProgressFragment v;

    public ChallengeFragment()
    {
        b = new _cls1();
    }

    public static ChallengeFragment a(String s1, Challenge challenge, ServerCommunicationException servercommunicationexception, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("challenge_id", s1);
        bundle.putParcelable("challenge", challenge);
        bundle.putSerializable("exception", servercommunicationexception);
        bundle.putBoolean("open_progress", flag);
        s1 = new ChallengeFragment();
        s1.setArguments(bundle);
        return s1;
    }

    static ServerCommunicationException a(ChallengeFragment challengefragment, ServerCommunicationException servercommunicationexception)
    {
        challengefragment.r = servercommunicationexception;
        return servercommunicationexception;
    }

    static Challenge a(ChallengeFragment challengefragment, Challenge challenge)
    {
        challengefragment.o = challenge;
        return challenge;
    }

    private void a()
    {
        IntentFilter intentfilter = new IntentFilter("com.fitbit.challenges.ui.ChallengeProgressFragment.DATA_LOAD_COMPLETED_ACTION");
        intentfilter.addAction("com.fitbit.challenges.ui.ChallengeMessagesFragment.DATA_LOAD_COMPLETED_ACTION");
        intentfilter.addAction("com.fitbit.challenges.ui.ChallengeMessagesFragment.FOCUS_RECEIVED_ACTION");
        intentfilter.addAction("com.fitbit.challenges.ui.ChallengeMessagesFragment.SCROLL_ACTION");
        intentfilter.addAction("com.fitbit.challenges.ui.ChallengeMessagesFragment.RELOAD_CHALLENGE_ACTION");
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(b, intentfilter);
    }

    private void a(int i1)
    {
        if (3 == i1)
        {
            getActivity().setResult(2);
            getActivity().finish();
        }
    }

    private void a(int i1, Intent intent)
    {
        com.fitbit.e.a.a("ChallengeInfoFragment", "OnActivityResult, progressFragment = %s, messageFragment = %s, RESULT = %s", new Object[] {
            v, u, Integer.valueOf(i1)
        });
        if (-1 == i1)
        {
            if (v != null)
            {
                v.onActivityResult(4904, i1, intent);
            }
            if (u != null)
            {
                u.onActivityResult(4904, i1, intent);
            }
        }
    }

    static boolean a(ChallengeFragment challengefragment)
    {
        return challengefragment.m;
    }

    static boolean a(ChallengeFragment challengefragment, boolean flag)
    {
        challengefragment.m = flag;
        return flag;
    }

    private boolean a(String s1)
    {
        for (Iterator iterator = o.l().iterator(); iterator.hasNext();)
        {
            if (((ChallengeUser)iterator.next()).f().equals(s1))
            {
                return true;
            }
        }

        return false;
    }

    static BaseLayout b(ChallengeFragment challengefragment)
    {
        return challengefragment.s;
    }

    private void b()
    {
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(b);
    }

    private void b(int i1, Intent intent)
    {
        if (-1 == i1 && intent != null && intent.hasExtra("com.fitbit.challenges.ui.AddPlayersFragment.ADDED_PLAYERS_ENCODED_IDS_EXTRA"))
        {
            intent = intent.getExtras().getStringArrayList("com.fitbit.challenges.ui.AddPlayersFragment.ADDED_PLAYERS_ENCODED_IDS_EXTRA");
            if (t != null)
            {
                t.addAll(intent);
            }
        }
    }

    static Challenge c(ChallengeFragment challengefragment)
    {
        return challengefragment.o;
    }

    private void c()
    {
        Object obj = null;
        String s1;
        String s2;
        if (p != null)
        {
            s2 = p.b();
        } else
        {
            s2 = null;
        }
        if (o != null)
        {
            s1 = o.w();
        } else
        {
            s1 = null;
        }
        if (s1 == null)
        {
            s1 = obj;
            if (p != null)
            {
                s1 = p.f();
            }
        }
        com.fitbit.challenges.ui.ChallengeGameplayActivity.a(getActivity(), s2, o.g(), s1);
    }

    static String d(ChallengeFragment challengefragment)
    {
        return challengefragment.n;
    }

    private void d()
    {
        ArrayList arraylist = new ArrayList(o.q());
        arraylist.addAll(t);
        ArrayList arraylist1 = new ArrayList(o.p());
        startActivityForResult(com.fitbit.challenges.ui.AddPlayersActivity.a(getActivity(), o.g(), arraylist1, arraylist, o.u().intValue(), o.t().intValue()), 885);
    }

    private void e()
    {
        com.fitbit.challenges.ui.ChallengeOptionsActivity.a(this, o.g(), 629);
    }

    private boolean f()
    {
        while (o == null || g() || h() || !a(an.a().b().F())) 
        {
            return false;
        }
        return true;
    }

    private boolean g()
    {
        Date date1;
        Object obj;
        date1 = o.C();
        obj = o.i();
        if (obj != com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.COMPLETE) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        Date date;
        date = date1;
        if (obj != com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED)
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = o.E();
        if (date1 != null)
        {
            date = date1;
            if (obj == null)
            {
                continue; /* Loop/switch isn't completed */
            }
            date = date1;
            if (!((Date) (obj)).before(date1))
            {
                continue; /* Loop/switch isn't completed */
            }
        }
        date = ((Date) (obj));
        if (date == null || (new Date()).after(date)) goto _L1; else goto _L3
_L3:
        return false;
    }

    private boolean h()
    {
        boolean flag = false;
        int i1;
        if (o.t() != null)
        {
            i1 = o.t().intValue();
        } else
        {
            i1 = 0;
        }
        if (o.l().size() >= Integer.valueOf(i1).intValue())
        {
            flag = true;
        }
        return flag;
    }

    public void a(Loader loader, Pair pair)
    {
        if (r != null)
        {
            break MISSING_BLOCK_LABEL_194;
        }
        o = (Challenge)pair.first;
        p = (ChallengeType)pair.second;
        if (p == null) goto _L2; else goto _L1
_L1:
        ChallengesUtils.a("Challenges: Loaded", o);
        if (!p.o()) goto _L4; else goto _L3
_L3:
        t = new HashSet();
        v.a(p);
        v.a(q);
        v.a(o);
        u.a(o);
        if (o.i().equals(com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.COMPLETE))
        {
            getActivity().invalidateOptionsMenu();
        }
_L2:
        return;
_L4:
        com.fitbit.e.a.a("ChallengeInfoFragment", "false == challengeType.isChallengeTypeSupported()", new Object[0]);
        loader = ChallengesUtils.a(getActivity(), new _cls3());
        if (loader == null) goto _L2; else goto _L5
_L5:
        com.fitbit.e.a.a("ChallengeInfoFragment", "null != fragment", new Object[0]);
        ad.a(getActivity().getSupportFragmentManager(), "com.fitbit.challenges.ui.TAG_DLG_CHALLENGES_APP_UPDATE", loader);
        return;
        u.a(r);
        return;
    }

    public boolean a(GCMNotification gcmnotification)
    {
        return u.a(gcmnotification);
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        switch (i1)
        {
        default:
            return;

        case 4904: 
            a(j1, intent);
            return;

        case 629: 
            a(j1);
            return;

        case 885: 
            b(j1, intent);
            return;
        }
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        setHasOptionsMenu(true);
        n = getArguments().getString("challenge_id");
        o = (Challenge)getArguments().getParcelable("challenge");
        r = (ServerCommunicationException)getArguments().getSerializable("exception");
        m = getArguments().getBoolean("open_progress", false);
        q = an.a().b();
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        return new _cls2(getActivity());
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuinflater)
    {
        super.onCreateOptionsMenu(menu, menuinflater);
        if (o != null && o.i().equals(com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.COMPLETE))
        {
            menuinflater.inflate(0x7f120004, menu);
            return;
        } else
        {
            menuinflater.inflate(0x7f120003, menu);
            return;
        }
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f040088, viewgroup, false);
        s = (BaseLayout)layoutinflater.findViewById(0x7f110258);
        return layoutinflater;
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (Pair)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        menuitem.getItemId();
        JVM INSTR lookupswitch 4: default 48
    //                   2131821104: 74
    //                   2131821780: 54
    //                   2131821781: 60
    //                   2131821782: 67;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        return super.onOptionsItemSelected(menuitem);
_L3:
        c();
_L7:
        return true;
_L4:
        d();
        continue; /* Loop/switch isn't completed */
_L5:
        e();
        continue; /* Loop/switch isn't completed */
_L2:
        v.l();
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onPause()
    {
        super.onPause();
        b();
    }

    public void onPrepareOptionsMenu(Menu menu)
    {
        menu.findItem(0x7f1104d5).setVisible(f());
        super.onPrepareOptionsMenu(menu);
    }

    public void onResume()
    {
        a();
        s.b();
        s.a();
        super.onResume();
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        view = getChildFragmentManager();
        bundle = view.beginTransaction();
        v = ChallengeProgressFragment_.m().a();
        v.a(s);
        bundle.replace(0x7f11025c, v, "PROGRESS_TAG");
        bundle.setTransition(4099);
        u = (ChallengeMessagesFragment)view.findFragmentByTag("com.fitbit.challenges.ui.ChallengeMessagesFragment.TAG");
        if (u == null)
        {
            u = ChallengeMessagesFragment_.g().a(n).a();
            bundle.add(0x7f11025a, u, "com.fitbit.challenges.ui.ChallengeMessagesFragment.TAG");
            bundle.setTransition(4099);
        }
        bundle.commit();
        getLoaderManager().restartLoader(221, null, this);
    }

    /* member class not found */
    class _cls1 {}


    /* member class not found */
    class _cls3 {}


    /* member class not found */
    class _cls2 {}

}
