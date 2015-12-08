// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.challenges.ui;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.support.v4.content.LocalBroadcastManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.core.a;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.bl.ChallengesUtils;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.dg;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.i;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.challenges.Challenge;
import com.fitbit.data.domain.challenges.ChallengeType;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.savedstate.e;
import com.fitbit.ui.StateSupportFragment;
import com.fitbit.util.bf;
import com.fitbit.util.o;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import se.emilsjolander.stickylistheaders.StickyListHeadersListView;
import se.emilsjolander.stickylistheaders.h;

// Referenced classes of package com.fitbit.challenges.ui:
//            a, InvitationExpiredDialogFragment, IncomingInvitationActivity, ChallengeActivity, 
//            OutgoingInvitationActivity, ChallengeHeaderView, ChallengePlaceholderView, ChallengeItemView, 
//            ChallengeTypeContainerView

public class ChallengesFragment extends StateSupportFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, ChallengeItemView.a, ChallengeTypeItemView.a
{
    public static final class AbstractChallengeKind extends Enum
    {

        public static final AbstractChallengeKind a;
        public static final AbstractChallengeKind b;
        private static final AbstractChallengeKind c[];

        public static AbstractChallengeKind valueOf(String s)
        {
            return (AbstractChallengeKind)Enum.valueOf(com/fitbit/challenges/ui/ChallengesFragment$AbstractChallengeKind, s);
        }

        public static AbstractChallengeKind[] values()
        {
            return (AbstractChallengeKind[])c.clone();
        }

        static 
        {
            a = new AbstractChallengeKind("AbstractChallengeKindSpecific", 0);
            b = new AbstractChallengeKind("AbstractChallengeKindType", 1);
            c = (new AbstractChallengeKind[] {
                a, b
            });
        }

        private AbstractChallengeKind(String s, int i)
        {
            super(s, i);
        }
    }

    private static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        private static final State f[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/fitbit/challenges/ui/ChallengesFragment$State, s);
        }

        public static State[] values()
        {
            return (State[])f.clone();
        }

        static 
        {
            a = new State("INITIAL", 0);
            b = new State("NORMAL", 1);
            c = new State("LOADING", 2);
            d = new State("EMPTY", 3);
            e = new State("FAILED", 4);
            f = (new State[] {
                a, b, c, d, e
            });
        }

        private State(String s, int i)
        {
            super(s, i);
        }
    }

    class a extends BaseAdapter
        implements h
    {

        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        private static final long i = 0L;
        private static final long j = 1L;
        private static final long k = 2L;
        protected Context a;
        final ChallengesFragment e;
        private c f;
        private boolean g;
        private int h;

        private List c(int i1)
        {
            i1 = d(i1);
            int j1 = h;
            int k1 = com.fitbit.challenges.ui.c.a(f).size();
            int l1 = h;
            l1 = Math.max(0, Math.min(((i1 + 1) - com.fitbit.challenges.ui.c.a(f).size()) * l1, c.b(f).size()));
            return c.b(f).subList(j1 * (i1 - k1), l1);
        }

        private int d(int i1)
        {
            int j1 = i1;
            if (b())
            {
                j1 = i1 - 1;
            }
            return j1;
        }

        public int a()
        {
            return h;
        }

        public long a(int i1)
        {
label0:
            {
                long l1 = 2L;
                if (!b())
                {
                    if (getItemViewType(i1) != 0)
                    {
                        break label0;
                    }
                    l1 = 0L;
                }
                return l1;
            }
            return 1L;
        }

        public View a(int i1, View view, ViewGroup viewgroup)
        {
            long l1 = a(i1);
            if (view == null)
            {
                if (l1 == 2L)
                {
                    view = new View(e.getActivity());
                } else
                {
                    view = com.fitbit.challenges.ui.ChallengeHeaderView.a(e.getActivity());
                }
            }
            if (l1 != 2L)
            {
                viewgroup = (ChallengeHeaderView)view;
                ChallengesFragment challengesfragment = e;
                if (l1 == 0L)
                {
                    i1 = 0x7f0802cb;
                } else
                {
                    i1 = 0x7f0802c9;
                }
                viewgroup.a(challengesfragment.getString(i1).toUpperCase());
            }
            return view;
        }

        public void a(c c1)
        {
            f = c1;
            notifyDataSetChanged();
        }

        public void a(boolean flag)
        {
            g = flag;
        }

        public void b(int i1)
        {
            h = i1;
        }

        public boolean b()
        {
            return g;
        }

        public c c()
        {
            return f;
        }

        public int getCount()
        {
            int i1 = 0;
            int j1 = 0;
            if (f != null)
            {
                int k1 = com.fitbit.challenges.ui.c.a(f).size();
                i1 = j1;
                if (h != 0)
                {
                    i1 = (int)Math.ceil((double)c.b(f).size() / (double)h);
                }
                i1 += k1;
            }
            j1 = i1;
            if (b())
            {
                j1 = i1 + 1;
            }
            return j1;
        }

        public Object getItem(int i1)
        {
            int j1 = getItemViewType(i1);
            i1 = d(i1);
            if (j1 == 0)
            {
                return com.fitbit.challenges.ui.c.a(f).get(i1);
            } else
            {
                return c.b(f).get(i1 - com.fitbit.challenges.ui.c.a(f).size());
            }
        }

        public long getItemId(int i1)
        {
            return (long)i1;
        }

        public int getItemViewType(int i1)
        {
            byte byte0 = 1;
            if (b() && i1 == 0)
            {
                byte0 = 2;
            } else
            if (d(i1) < com.fitbit.challenges.ui.c.a(f).size())
            {
                return 0;
            }
            return byte0;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            getItemViewType(i1);
            JVM INSTR tableswitch 0 2: default 32
        //                       0 46
        //                       1 121
        //                       2 34;
               goto _L1 _L2 _L3 _L4
_L1:
            return view;
_L4:
            if (view == null)
            {
                return com.fitbit.challenges.ui.ChallengePlaceholderView.a(a);
            }
              goto _L1
_L2:
            Challenge challenge;
            if (view == null)
            {
                view = com.fitbit.challenges.ui.ChallengeItemView.a(a, e);
            } else
            {
                view = (ChallengeItemView)view;
            }
            challenge = (Challenge)getItem(i1);
            if (f != null)
            {
                viewgroup = ChallengesUtils.a(c.b(f), challenge);
            } else
            {
                viewgroup = null;
            }
            view.a(challenge, viewgroup, c.c(f));
            return view;
_L3:
            if (view == null)
            {
                view = com.fitbit.challenges.ui.ChallengeTypeContainerView.a(a, e, h);
            } else
            {
                view = (ChallengeTypeContainerView)view;
            }
            view.a(c(i1));
            return view;
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        public boolean isEnabled(int i1)
        {
            return false;
        }

        public a(Context context)
        {
            e = ChallengesFragment.this;
            super();
            g = false;
            a = context;
        }

        public a(Context context, int i1)
        {
            e = ChallengesFragment.this;
            super();
            g = false;
            a = context;
            h = i1;
        }
    }

    protected static class b extends bf
    {

        private Exception a;
        private com.fitbit.data.bl.ChallengesUtils.b b;
        private boolean c;

        public c a()
        {
            c c1;
            c1 = new c();
            com.fitbit.challenges.ui.c.a(c1, new ArrayList());
            c.b(c1, new ArrayList());
            Profile profile = an.a().b();
            if (profile != null)
            {
                com.fitbit.challenges.ui.c.a(c1, profile);
            }
            Object obj;
            boolean flag1;
            obj = i.a();
            flag1 = c;
            boolean flag;
            flag = flag1;
            if (flag1)
            {
                break MISSING_BLOCK_LABEL_83;
            }
            Object obj1;
            if (((i) (obj)).c().size() == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            dg.d().j(flag, null);
            com.fitbit.challenges.ui.c.a(c1, ((i) (obj)).d());
            obj1 = ((i) (obj)).c();
            obj = new ArrayList();
            if (obj1 == null) goto _L2; else goto _L1
_L1:
            obj1 = ((List) (obj1)).iterator();
            do
            {
                if (!((Iterator) (obj1)).hasNext())
                {
                    break;
                }
                ChallengeType challengetype = (ChallengeType)((Iterator) (obj1)).next();
                if (challengetype.h())
                {
                    ((List) (obj)).add(challengetype);
                }
            } while (true);
              goto _L2
_L4:
            obj = com.fitbit.challenges.ui.c.a(c1).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Challenge challenge = (Challenge)((Iterator) (obj)).next();
                if (challenge.i() == com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED && ChallengesUtils.e(challenge))
                {
                    ((Iterator) (obj)).remove();
                }
            } while (true);
            break; /* Loop/switch isn't completed */
_L2:
            try
            {
                c.b(c1, ((List) (obj)));
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                if (((ServerCommunicationException) (obj)).e() == 404)
                {
                    com.fitbit.e.a.a("ChallengesFragment", "%s\nStatus code - %s", new Object[] {
                        String.valueOf(obj), Integer.valueOf(((ServerCommunicationException) (obj)).e())
                    });
                    com.fitbit.challenges.ui.c.a(c1, Collections.emptyList());
                    c.b(c1, Collections.emptyList());
                } else
                {
                    a(((Exception) (obj)));
                }
            }
            // Misplaced declaration of an exception variable
            catch (Object obj)
            {
                a(((Exception) (obj)));
            }
            if (true) goto _L4; else goto _L3
_L3:
            Collections.sort(com.fitbit.challenges.ui.c.a(c1), b);
            return c1;
        }

        public void a(Exception exception)
        {
            com.fitbit.e.a.a("ChallengesFragment", exception.toString(), new Object[0]);
            a = exception;
        }

        public Exception b()
        {
            return a;
        }

        public Object f_()
        {
            return a();
        }

        public b(Context context, boolean flag)
        {
            super(context);
            b = new com.fitbit.data.bl.ChallengesUtils.b();
            c = flag;
        }
    }

    static class c
    {

        private List a;
        private List b;
        private Profile c;

        static Profile a(c c1, Profile profile)
        {
            c1.c = profile;
            return profile;
        }

        static List a(c c1)
        {
            return c1.b;
        }

        static List a(c c1, List list)
        {
            c1.b = list;
            return list;
        }

        private boolean a()
        {
            return (a == null || a.size() == 0) && (b == null || b.size() == 0);
        }

        static List b(c c1)
        {
            return c1.a;
        }

        static List b(c c1, List list)
        {
            c1.a = list;
            return list;
        }

        static Profile c(c c1)
        {
            return c1.c;
        }

        static boolean d(c c1)
        {
            return c1.a();
        }

        c()
        {
        }
    }


    private static final int k = 2;
    private static final String l = "ChallengesFragment";
    private static final String m = "DIALOG_INVITATION_EXPIRED";
    private static final String n = "Challenges";
    private static final String o = "FORCE_LOAD_PARAM";
    protected StickyListHeadersListView a;
    protected View b;
    protected Button c;
    protected ProgressBar d;
    FragmentManager e;
    protected a f;
    private State p;
    private State q;
    private BroadcastReceiver r;

    public ChallengesFragment()
    {
        r = new BroadcastReceiver() {

            final ChallengesFragment a;

            public void onReceive(Context context, Intent intent)
            {
                boolean flag;
                if (!"com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION_CHALLENGE_INVITE_RECEIVED".equalsIgnoreCase(intent.getAction()))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.fitbit.challenges.ui.ChallengesFragment.a(a, flag);
            }

            
            {
                a = ChallengesFragment.this;
                super();
            }
        };
    }

    private void a(State state)
    {
        if (p == state)
        {
            return;
        }
        static class _cls2
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.values().length];
                try
                {
                    b[com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.INVITED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.ACTIVE.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.COMPLETE.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.fitbit.data.domain.challenges.Challenge.ChallengeStatus.UNKNOWN.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[State.values().length];
                try
                {
                    a[com.fitbit.challenges.ui.State.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[State.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[State.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.fitbit.challenges.ui.State.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.challenges.ui.State.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        com.fitbit.challenges.ui._cls2.a[state.ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 66
    //                   2 101
    //                   3 152
    //                   4 248
    //                   5 299;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        q = p;
        p = state;
        return;
_L2:
        g.setVisibility(4);
        j.setVisibility(4);
        b.setVisibility(4);
        a.setVisibility(4);
        continue; /* Loop/switch isn't completed */
_L3:
        g.setVisibility(4);
        j.setVisibility(4);
        b.setVisibility(4);
        a.setVisibility(0);
        a.setAnimation(AnimationUtils.loadAnimation(getActivity(), 0x7f050009));
        continue; /* Loop/switch isn't completed */
_L4:
        a.setVisibility(4);
        g.setVisibility(4);
        if (p == com.fitbit.challenges.ui.State.e)
        {
            b.setVisibility(4);
            j.setVisibility(0);
            c.setVisibility(4);
            d.setVisibility(0);
        } else
        {
            j.setVisibility(4);
            b.setVisibility(0);
            b.setAnimation(AnimationUtils.loadAnimation(getActivity(), 0x7f050009));
        }
        continue; /* Loop/switch isn't completed */
_L5:
        g.setVisibility(4);
        j.setVisibility(0);
        b.setVisibility(4);
        a.setVisibility(4);
        c.setVisibility(0);
        d.setVisibility(4);
        continue; /* Loop/switch isn't completed */
_L6:
        g.setVisibility(0);
        j.setVisibility(4);
        b.setVisibility(4);
        a.setVisibility(4);
        g.setAnimation(AnimationUtils.loadAnimation(getActivity(), 0x7f050009));
        if (true) goto _L1; else goto _L7
_L7:
    }

    static void a(ChallengesFragment challengesfragment, boolean flag)
    {
        challengesfragment.d(flag);
    }

    private void d(boolean flag)
    {
        a(State.c);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FORCE_LOAD_PARAM", flag);
        getLoaderManager().restartLoader(220, bundle, this);
        com.fitbit.challenges.ui.a.a().a(false);
    }

    private IntentFilter g()
    {
        IntentFilter intentfilter = new IntentFilter();
        intentfilter.addAction("com.fitbit.challenges.ui.ChallengeOptionsFragment.QUIT_ACTION");
        intentfilter.addAction("com.fitbit.challenges.ui.AddPlayersFragment.START_ACTION");
        intentfilter.addAction("com.fitbit.challenges.ui.DeclineChallengeTask.DECLINE_ACTION");
        intentfilter.addAction("com.fitbit.challenges.ui.JoinChallengeTask.JOIN_ACTION");
        intentfilter.addAction("com.fitbit.FitbitMobile.NotificationBroadcastReceiver.ACTION_CHALLENGE_INVITE_RECEIVED");
        return intentfilter;
    }

    protected void a()
    {
        if (p == com.fitbit.challenges.ui.State.e)
        {
            d(true);
        }
    }

    public void a(Loader loader, c c1)
    {
        if (loader != null && (loader instanceof b))
        {
            if (((b)loader).b() != null)
            {
                a(com.fitbit.challenges.ui.State.e);
            } else
            {
                boolean flag;
                if (com.fitbit.challenges.ui.State.a == q && (c1 == null || com.fitbit.challenges.ui.c.a(c1) == null || com.fitbit.challenges.ui.c.a(c1).size() == 0))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                f.a(flag);
                if (flag)
                {
                    f.notifyDataSetChanged();
                }
                if (c1 != null && com.fitbit.challenges.ui.c.a(c1) != null && com.fitbit.challenges.ui.c.a(c1).size() > 0)
                {
                    loader = new ArrayList();
                    for (Iterator iterator = com.fitbit.challenges.ui.c.a(c1).iterator(); iterator.hasNext(); loader.add(((Challenge)iterator.next()).g())) { }
                    com.fitbit.savedstate.e.a(loader);
                }
                if (com.fitbit.challenges.ui.c.d(c1))
                {
                    loader = com.fitbit.challenges.ui.State.d;
                } else
                {
                    loader = State.b;
                }
                a(((State) (loader)));
            }
        }
        loader = getActivity();
        if (State.b == p && loader != null)
        {
            f.a(c1);
        }
    }

    public void a(Challenge challenge)
    {
        switch (_cls2.b[challenge.i().ordinal()])
        {
        default:
            return;

        case 1: // '\001'
            Date date = challenge.E();
            if (date == null || com.fitbit.util.o.b().after(date))
            {
                com.fitbit.challenges.ui.InvitationExpiredDialogFragment.a(getActivity().getSupportFragmentManager(), "DIALOG_INVITATION_EXPIRED", challenge, null);
                return;
            } else
            {
                IncomingInvitationActivity.b(getActivity(), challenge.g());
                return;
            }

        case 2: // '\002'
            startActivity(com.fitbit.challenges.ui.ChallengeActivity.a(getActivity(), challenge.g(), true));
            return;

        case 3: // '\003'
        case 4: // '\004'
            startActivity(com.fitbit.challenges.ui.ChallengeActivity.a(getActivity(), challenge.g(), false));
            return;
        }
    }

    public void a(ChallengeType challengetype)
    {
        startActivity(com.fitbit.challenges.ui.OutgoingInvitationActivity.a(getActivity(), challengetype.f()));
    }

    protected void c()
    {
        getActivity().setTitle(0x7f0802ca);
        StickyListHeadersListView stickylistheaderslistview = a;
        a a1 = new a(getActivity(), 2);
        f = a1;
        stickylistheaderslistview.a(a1);
        registerForContextMenu(a);
        a(com.fitbit.challenges.ui.State.a);
    }

    protected com.fitbit.savedstate.LoadSavedState.Status d()
    {
        return LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.f);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        LocalBroadcastManager.getInstance(getActivity()).registerReceiver(r, g());
        e = getActivity().getSupportFragmentManager();
        d(false);
        if (com.fitbit.challenges.ui.a.a().b())
        {
            com.fitbit.challenges.ui.a.a().a(false);
        }
    }

    public Loader onCreateLoader(int i, Bundle bundle)
    {
        boolean flag = false;
        if (bundle != null)
        {
            flag = bundle.getBoolean("FORCE_LOAD_PARAM", false);
        }
        return new b(getActivity(), flag);
    }

    public void onDestroy()
    {
        LocalBroadcastManager.getInstance(getActivity()).unregisterReceiver(r);
        super.onDestroy();
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (c)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onResume()
    {
        super.onResume();
        if (com.fitbit.challenges.ui.a.a().b())
        {
            d(false);
            com.fitbit.challenges.ui.a.a().a(false);
        }
        ChallengesUtils.a("Challenges: Home", null);
        FitBitApplication.a().c().a(0x7f11000a).a("Challenges");
        com.fitbit.analytics.core.a.a(com.fitbit.analytics.core.Interaction.DEFAULTS.v);
    }
}
