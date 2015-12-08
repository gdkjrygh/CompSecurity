// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.friends.ui;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.LoaderManager;
import android.support.v4.content.Loader;
import android.text.TextUtils;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.fitbit.FitBitApplication;
import com.fitbit.analytics.google.ga.AnalyticsContainer;
import com.fitbit.analytics.google.ga.d;
import com.fitbit.data.bl.an;
import com.fitbit.data.bl.cw;
import com.fitbit.data.bl.s;
import com.fitbit.data.domain.Profile;
import com.fitbit.data.domain.RankedUser;
import com.fitbit.mixpanel.f;
import com.fitbit.savedstate.LoadSavedState;
import com.fitbit.savedstate.UISavedState;
import com.fitbit.settings.ui.ProfileActivity;
import com.fitbit.ui.fragments.FitbitFragment;
import com.fitbit.ui.loadable.LoadablePicassoImageView;
import com.fitbit.util.ap;
import com.fitbit.util.bj;
import com.fitbit.util.fonts.FitbitFont;
import com.fitbit.util.format.e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.fitbit.friends.ui:
//            b, AddFriendsActivity, ProfilePhotoUploader, ConversationActivity

public class LeaderboardFragment extends FitbitFragment
    implements android.support.v4.app.LoaderManager.LoaderCallbacks, android.view.View.OnClickListener, android.widget.AdapterView.OnItemClickListener
{
    private static final class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        private static final State f[];

        public static State valueOf(String s1)
        {
            return (State)Enum.valueOf(com/fitbit/friends/ui/LeaderboardFragment$State, s1);
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

        private State(String s1, int i1)
        {
            super(s1, i1);
        }
    }

    private static class a extends com.fitbit.ui.a.c
    {

        public static final int a = 0;
        public static final int b = 1;
        public static final int c = 2;
        private static final int d = 3;
        private final Profile e;
        private final android.view.View.OnClickListener f;

        public boolean b(int i1)
        {
            return TextUtils.equals(e.F(), ((RankedUser)getItem(i1)).F());
        }

        public long getItemId(int i1)
        {
            return (long)i1;
        }

        public int getItemViewType(int i1)
        {
            RankedUser rankeduser = (RankedUser)getItem(i1);
            if (b(i1))
            {
                return 2;
            }
            return !rankeduser.s() ? 1 : 0;
        }

        public View getView(int i1, View view, ViewGroup viewgroup)
        {
            Context context = viewgroup.getContext();
            int j1 = getItemViewType(i1);
            View view1;
            a a2;
            Object obj;
            TextView textview;
            boolean flag;
            if (j1 == 2 || j1 == 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            obj = (RankedUser)getItem(i1);
            if (j1 == 2 && e != null)
            {
                ((RankedUser) (obj)).g(e.G());
            }
            view1 = view;
            if (view == null)
            {
                view = View.inflate(viewgroup.getContext(), 0x7f040108, null);
                a a1 = new a(this, view, j1);
                view.setTag(a1);
                view1 = view;
                if (j1 == 2)
                {
                    view.setBackgroundColor(viewgroup.getContext().getResources().getColor(0x7f0f00aa));
                    view1 = view;
                    if (TextUtils.equals(((RankedUser) (obj)).F(), e.F()))
                    {
                        view1 = view;
                        if (!((RankedUser) (obj)).H())
                        {
                            a1.b.setImageResource(0x7f020330);
                            a1.b.setOnClickListener(f);
                            view1 = view;
                        }
                    }
                }
            }
            a2 = (a)view1.getTag();
            if (j1 == 2 && ((RankedUser) (obj)).H() || j1 != 2)
            {
                a2.b.a(((RankedUser) (obj)).G());
            }
            textview = a2.c;
            if (j1 == 2)
            {
                view = viewgroup.getContext().getString(0x7f08037d);
            } else
            {
                view = ((RankedUser) (obj)).P();
            }
            textview.setText(view);
            viewgroup = a2.a;
            if (j1 == 2 && !((RankedUser) (obj)).s())
            {
                view = "-";
            } else
            {
                view = Long.toString(i1 + 1);
            }
            viewgroup.setText(view);
            if (flag)
            {
                viewgroup = com.fitbit.util.format.e.e(((RankedUser) (obj)).a());
                obj = a2.d;
                view = viewgroup;
                if (TextUtils.isEmpty(viewgroup))
                {
                    view = context.getString(0x7f08056f);
                }
                ((TextView) (obj)).setText(view);
                com.fitbit.util.fonts.a.a(context, a2.c, FitbitFont.g);
                a2.c.setTextColor(0xff000000);
                return view1;
            } else
            {
                a2.d.setText(0x7f08056f);
                a2.a.setText("");
                com.fitbit.util.fonts.a.a(context, a2.c, FitbitFont.h);
                a2.c.setTextColor(0xff888888);
                return view1;
            }
        }

        public int getViewTypeCount()
        {
            return 3;
        }

        public a(Profile profile, android.view.View.OnClickListener onclicklistener)
        {
            super(new ArrayList(), false);
            e = profile;
            f = onclicklistener;
        }
    }

    class a.a
    {

        final TextView a;
        final LoadablePicassoImageView b;
        final TextView c;
        final TextView d;
        final a e;

        public a.a(a a1, View view, int i1)
        {
            e = a1;
            super();
            b = (LoadablePicassoImageView)view.findViewById(0x7f110330);
            c = (TextView)view.findViewById(0x7f110252);
            a = (TextView)view.findViewById(0x7f11037e);
            d = (TextView)view.findViewById(0x7f110376);
        }
    }

    static class b
    {

        private List a;
        private List b;
        private int c;

        static int a(b b1, int i1)
        {
            b1.c = i1;
            return i1;
        }

        static List a(b b1, List list)
        {
            b1.a = list;
            return list;
        }

        private boolean a()
        {
            return a.size() == 0 && b.size() == 0;
        }

        static boolean a(b b1)
        {
            return b1.a();
        }

        static int b(b b1)
        {
            return b1.c;
        }

        static List b(b b1, List list)
        {
            b1.b = list;
            return list;
        }

        static List c(b b1)
        {
            return b1.a;
        }

        static List d(b b1)
        {
            return b1.b;
        }

        b()
        {
        }
    }

    private static class c extends bj
    {

        private boolean a;
        private final Profile b;

        public b b()
        {
            RankedUser rankeduser;
            b b1;
            b1 = new b();
            b.a(b1, new ArrayList());
            b.b(b1, new ArrayList());
            b.a(b1, -1);
            List list = com.fitbit.data.bl.s.a(getContext()).a(b.F());
            rankeduser = null;
            for (Iterator iterator = list.iterator(); iterator.hasNext();)
            {
                RankedUser rankeduser1 = (RankedUser)iterator.next();
                if (TextUtils.equals(rankeduser1.F(), b.F()))
                {
                    rankeduser = rankeduser1;
                }
                if (rankeduser1.s())
                {
                    b.c(b1).add(rankeduser1);
                } else
                {
                    com.fitbit.friends.ui.b.d(b1).add(rankeduser1);
                }
            }

            if (!b.c(b1).contains(rankeduser) || !b.c()) goto _L2; else goto _L1
_L1:
            b.c(b1).remove(rankeduser);
_L4:
            com.fitbit.data.bl.s.a(com.fitbit.friends.ui.b.d(b1));
            return b1;
_L2:
            if (b.c(b1).contains(rankeduser))
            {
                b.a(b1, b.c(b1).indexOf(rankeduser));
            } else
            if (!b.c())
            {
                if (com.fitbit.friends.ui.b.d(b1).contains(rankeduser))
                {
                    com.fitbit.friends.ui.b.d(b1).remove(rankeduser);
                }
                RankedUser rankeduser2 = rankeduser;
                if (rankeduser == null)
                {
                    rankeduser2 = new RankedUser();
                    rankeduser2.f(b.F());
                    rankeduser2.g(b.G());
                    rankeduser2.k(b.P());
                }
                b.c(b1).add(rankeduser2);
                b.a(b1, b.c(b1).size() - 1);
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

        protected Intent f()
        {
            return cw.a(getContext(), a);
        }

        public Object f_()
        {
            return b();
        }

        public c(Context context, IntentFilter intentfilter, boolean flag, Profile profile)
        {
            super(context, intentfilter);
            a = false;
            a = flag;
            b = profile;
        }
    }


    private static final String a = "fullFriendsList";
    private static final String b = "Friends";
    private static final int c = -1;
    private static final int d = 201;
    private static final int e = 202;
    private static final int f = 203;
    private ListView g;
    private View h;
    private View i;
    private View j;
    private View k;
    private View l;
    private Button m;
    private ProgressBar n;
    private boolean o;
    private boolean p;
    private a q;
    private State r;
    private ProfilePhotoUploader s;
    private Profile t;
    private View u;

    public LeaderboardFragment()
    {
    }

    public static LeaderboardFragment a()
    {
        return new LeaderboardFragment();
    }

    static ProfilePhotoUploader a(LeaderboardFragment leaderboardfragment)
    {
        return leaderboardfragment.s;
    }

    private void a(Context context)
    {
        if (u != null && g.getFooterViewsCount() > 0)
        {
            g.removeFooterView(u);
        }
        u = LayoutInflater.from(context).inflate(0x7f0401d6, g, false);
        g.addFooterView(u, null, false);
    }

    private void a(Context context, List list)
    {
        if (u != null && g.getFooterViewsCount() > 0)
        {
            g.removeFooterView(u);
        }
        u = LayoutInflater.from(context).inflate(0x7f04019e, g, false);
        g.addFooterView(u, list, true);
    }

    private void a(View view)
    {
        h.setVisibility(8);
        UISavedState.e(false);
    }

    private void a(State state)
    {
        if (r == state)
        {
            return;
        }
        static class _cls5
        {

            static final int a[];
            static final int b[];

            static 
            {
                b = new int[com.fitbit.savedstate.LoadSavedState.Status.values().length];
                try
                {
                    b[com.fitbit.savedstate.LoadSavedState.Status.c.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[com.fitbit.savedstate.LoadSavedState.Status.a.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                a = new int[State.values().length];
                try
                {
                    a[State.a.ordinal()] = 1;
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
                    a[com.fitbit.friends.ui.State.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.fitbit.friends.ui.State.d.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls5.a[state.ordinal()];
        JVM INSTR tableswitch 1 5: default 52
    //                   1 58
    //                   2 101
    //                   3 149
    //                   4 261
    //                   5 320;
           goto _L1 _L2 _L3 _L4 _L5 _L6
_L1:
        r = state;
        return;
_L2:
        i.setVisibility(4);
        j.setVisibility(4);
        l.setVisibility(4);
        g.setVisibility(4);
        k.setVisibility(4);
        continue; /* Loop/switch isn't completed */
_L3:
        i.setVisibility(4);
        j.setVisibility(4);
        l.setVisibility(4);
        g.setVisibility(0);
        k.setVisibility(4);
        a(((View) (null)));
        continue; /* Loop/switch isn't completed */
_L4:
        g.setVisibility(4);
        k.setVisibility(4);
        if (r == com.fitbit.friends.ui.State.e)
        {
            i.setVisibility(0);
            l.setVisibility(4);
            j.setVisibility(0);
            m.setVisibility(4);
            n.setVisibility(0);
        } else
        {
            i.setVisibility(4);
            j.setVisibility(4);
            l.setVisibility(0);
            l.setAnimation(AnimationUtils.loadAnimation(getActivity(), 0x7f050009));
        }
        continue; /* Loop/switch isn't completed */
_L5:
        i.setVisibility(0);
        j.setVisibility(0);
        l.setVisibility(4);
        g.setVisibility(4);
        m.setVisibility(0);
        n.setVisibility(4);
        k.setVisibility(4);
        continue; /* Loop/switch isn't completed */
_L6:
        i.setVisibility(0);
        j.setVisibility(4);
        l.setVisibility(4);
        g.setVisibility(4);
        k.setVisibility(0);
        g();
        if (true) goto _L1; else goto _L7
_L7:
    }

    private void a(String s1, String s2, com.fitbit.data.domain.Message.MessageType messagetype, String s3)
    {
        (new com.fitbit.friends.ui.b(getActivity(), s1, s2, messagetype, s3, "fullFriendsList")).e();
    }

    static boolean a(LeaderboardFragment leaderboardfragment, boolean flag)
    {
        leaderboardfragment.o = flag;
        return flag;
    }

    static void b(LeaderboardFragment leaderboardfragment)
    {
        leaderboardfragment.h();
    }

    static ListView c(LeaderboardFragment leaderboardfragment)
    {
        return leaderboardfragment.g;
    }

    private void c()
    {
        if (r == com.fitbit.friends.ui.State.e)
        {
            a(State.c);
            getActivity().startService(cw.a(getActivity(), true));
        }
    }

    private void d()
    {
        a(((View) (null)));
        AddFriendsActivity.a(getActivity());
    }

    private void f()
    {
        s = new ProfilePhotoUploader(getParentFragment(), new ProfilePhotoUploader.a() {

            final LeaderboardFragment a;

            public void a()
            {
                LeaderboardFragment.a(a, true);
                a.getLoaderManager().restartLoader(141, null, a);
            }

            public void b()
            {
            }

            public void c()
            {
                com.fitbit.ui.s.a(a.getActivity(), 0x7f080568, 0).i();
            }

            
            {
                a = LeaderboardFragment.this;
                super();
            }
        });
    }

    private void g()
    {
        if (UISavedState.w())
        {
            h.setVisibility(0);
        }
    }

    private void h()
    {
        s.a();
    }

    public void a(Loader loader, b b1)
    {
        boolean flag;
        flag = false;
        loader = LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.c);
        _cls5.b[loader.ordinal()];
        JVM INSTR tableswitch 1 2: default 40
    //                   1 233
    //                   2 243;
           goto _L1 _L2 _L3
_L1:
        int i1;
        if (b.a(b1))
        {
            loader = com.fitbit.friends.ui.State.d;
        } else
        {
            loader = State.b;
        }
        a(((State) (loader)));
        loader = getActivity();
        if (r != State.b || loader == null) goto _L5; else goto _L4
_L4:
        i1 = 0;
_L8:
        if (i1 >= q.size())
        {
            break MISSING_BLOCK_LABEL_279;
        }
        if (!TextUtils.equals(((RankedUser)q.get(i1)).F(), t.F())) goto _L7; else goto _L6
_L6:
        if (q.isEmpty() || i1 != b.b(b1))
        {
            flag = true;
        }
        q.clear();
        q.addAll(b.c(b1));
        if (u != null)
        {
            g.removeFooterView(u);
        }
        if (p)
        {
            q.addAll(com.fitbit.friends.ui.b.d(b1));
            a(((Context) (loader)));
        } else
        {
            a(((Context) (loader)), com.fitbit.friends.ui.b.d(b1));
        }
        q.notifyDataSetChanged();
        if (flag && loader != null)
        {
            g.post(new Runnable(loader, b1) {

                final Context a;
                final b b;
                final LeaderboardFragment c;

                public void run()
                {
                    int j1 = ap.a(a, 53.3F);
                    LeaderboardFragment.c(c).setSelectionFromTop(b.b(b), Math.round((float)(LeaderboardFragment.c(c).getHeight() - j1) / 2.0F));
                }

            
            {
                c = LeaderboardFragment.this;
                a = context;
                b = b1;
                super();
            }
            });
        }
_L5:
        return;
_L2:
        a(com.fitbit.friends.ui.State.e);
        break MISSING_BLOCK_LABEL_56;
_L3:
        a(State.c);
        break MISSING_BLOCK_LABEL_56;
_L7:
        i1++;
          goto _L8
        i1 = -1;
          goto _L6
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        super.onActivityResult(i1, j1, intent);
        (new Handler()).postDelayed(new Runnable(i1, j1, intent) {

            final int a;
            final int b;
            final Intent c;
            final LeaderboardFragment d;

            public void run()
            {
                android.support.v4.app.Fragment fragment = d.getParentFragment();
                Object obj = fragment;
                if (fragment == null)
                {
                    obj = d;
                }
                switch (a)
                {
                default:
                    return;

                case 4906: 
                    android.net.Uri uri = ProfilePhotoUploader.a(b, c);
                    LeaderboardFragment.a(d).a(((android.support.v4.app.Fragment) (obj)), b, uri);
                    return;

                case 4907: 
                    android.net.Uri uri1 = ProfilePhotoUploader.b(b, c);
                    LeaderboardFragment.a(d).a(((android.support.v4.app.Fragment) (obj)), b, uri1);
                    return;

                case 4908: 
                    obj = ProfilePhotoUploader.c(b, c);
                    break;
                }
                LeaderboardFragment.a(d).a(b, ((android.net.Uri) (obj)));
            }

            
            {
                d = LeaderboardFragment.this;
                a = i1;
                b = j1;
                c = intent;
                super();
            }
        }, 200L);
    }

    public void onClick(View view)
    {
        if (view.getId() == m.getId())
        {
            c();
        } else
        {
            if (view.getId() == 0x7f1102c7)
            {
                d();
                return;
            }
            if (view.getId() == h.getId())
            {
                a(view);
                return;
            }
        }
    }

    public boolean onContextItemSelected(MenuItem menuitem)
    {
        if (menuitem.getItemId() > 203 || menuitem.getItemId() < 201)
        {
            return false;
        }
        Object obj = (android.widget.AdapterView.AdapterContextMenuInfo)menuitem.getMenuInfo();
        obj = g.getItemAtPosition(((android.widget.AdapterView.AdapterContextMenuInfo) (obj)).position);
        if (obj instanceof RankedUser)
        {
            obj = (RankedUser)obj;
        } else
        {
            obj = null;
        }
        if (obj == null) goto _L2; else goto _L1
_L1:
        menuitem.getItemId();
        JVM INSTR tableswitch 201 203: default 96
    //                   201 102
    //                   202 120
    //                   203 138;
           goto _L2 _L3 _L4 _L5
_L2:
        return super.onContextItemSelected(menuitem);
_L3:
        a(((RankedUser) (obj)).F(), ((RankedUser) (obj)).P(), com.fitbit.data.domain.Message.MessageType.CHEER, null);
        return true;
_L4:
        a(((RankedUser) (obj)).F(), ((RankedUser) (obj)).P(), com.fitbit.data.domain.Message.MessageType.TAUNT, null);
        return true;
_L5:
        ConversationActivity.a(getActivity(), ((RankedUser) (obj)).F(), ((RankedUser) (obj)).P(), ((RankedUser) (obj)).G(), "fullFriendsList");
        return true;
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        t = an.a().b();
        boolean flag;
        if (bundle == null)
        {
            flag = false;
        } else
        {
            flag = bundle.getBoolean("inactive");
        }
        p = flag;
    }

    public void onCreateContextMenu(ContextMenu contextmenu, View view, android.view.ContextMenu.ContextMenuInfo contextmenuinfo)
    {
        if (view.equals(g))
        {
            view = (android.widget.AdapterView.AdapterContextMenuInfo)contextmenuinfo;
            contextmenuinfo = ((android.view.ContextMenu.ContextMenuInfo) (q.getItem(((android.widget.AdapterView.AdapterContextMenuInfo) (view)).position)));
            if (!q.b(((android.widget.AdapterView.AdapterContextMenuInfo) (view)).position) && (contextmenuinfo instanceof RankedUser))
            {
                contextmenu.setHeaderTitle(((RankedUser)contextmenuinfo).P());
                contextmenu.add(0, 201, 201, 0x7f0802cd);
                contextmenu.add(0, 202, 202, 0x7f08035e);
                contextmenu.add(0, 203, 203, 0x7f0805a4);
            }
        }
    }

    public Loader onCreateLoader(int i1, Bundle bundle)
    {
        a(State.c);
        return new c(getActivity(), cw.c(), o, t);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = layoutinflater.inflate(0x7f0400b0, viewgroup, false);
        g = (ListView)layoutinflater.findViewById(0x7f110086);
        h = layoutinflater.findViewById(0x7f110432);
        i = layoutinflater.findViewById(0x7f1100ea);
        j = layoutinflater.findViewById(0x7f1100a4);
        k = layoutinflater.findViewById(0x7f1102c2);
        l = layoutinflater.findViewById(0x7f110122);
        m = (Button)layoutinflater.findViewById(0x7f1103d5);
        n = (ProgressBar)layoutinflater.findViewById(0x7f11009b);
        layoutinflater.findViewById(0x7f1102c7).setOnClickListener(this);
        m.setOnClickListener(this);
        h.setOnClickListener(this);
        return layoutinflater;
    }

    public void onItemClick(AdapterView adapterview, View view, int i1, long l1)
    {
        adapterview = ((AdapterView) (adapterview.getItemAtPosition(i1)));
        if (adapterview instanceof RankedUser)
        {
            startActivity(ProfileActivity.b(getActivity(), (RankedUser)adapterview));
        } else
        if (adapterview instanceof List)
        {
            p = true;
            a(view.getContext());
            q.addAll((List)adapterview);
            q.notifyDataSetChanged();
            return;
        }
    }

    public void onLoadFinished(Loader loader, Object obj)
    {
        a(loader, (b)obj);
    }

    public void onLoaderReset(Loader loader)
    {
    }

    public void onResume()
    {
        super.onResume();
        FitBitApplication.a().c().a(0x7f11000a).a("Friends");
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("inactive", p);
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        com.fitbit.mixpanel.f.c("Social: View Leaderboard");
        if (LoadSavedState.a(com.fitbit.savedstate.LoadSavedState.DataType.c) == com.fitbit.savedstate.LoadSavedState.Status.a)
        {
            a(State.c);
        } else
        {
            a(State.a);
        }
        getLoaderManager().restartLoader(141, null, this);
        getActivity().setTitle(0x7f0802fb);
        q = new a(t, new android.view.View.OnClickListener() {

            final LeaderboardFragment a;

            public void onClick(View view1)
            {
                LeaderboardFragment.b(a);
            }

            
            {
                a = LeaderboardFragment.this;
                super();
            }
        });
        a(view.getContext());
        g.setAdapter(q);
        g.setOnItemClickListener(this);
        registerForContextMenu(g);
        f();
    }
}
