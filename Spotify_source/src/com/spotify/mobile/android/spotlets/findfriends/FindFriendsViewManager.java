// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.findfriends;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewParent;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Filter;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.RadioGroup;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.mobile.android.spotlets.findfriends.model.FindFriendsModel;
import com.spotify.mobile.android.spotlets.share.ConnectFacebookActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.stuff.ContentViewManager;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import ctz;
import dft;
import dgp;
import dmz;
import esh;
import esi;
import esj;
import esl;
import fop;
import gaa;
import gas;
import gfp;
import java.util.ArrayList;
import java.util.List;

public final class FindFriendsViewManager
{

    public FilterHeaderView a;
    public TabType b;
    public RadioGroup c;
    private ContentViewManager d;
    private LoadingView e;
    private View f;
    private ListView g;
    private LinearLayout h;
    private esj i;
    private esi j;
    private Flags k;
    private final gas l = new gas() {

        private FindFriendsViewManager a;

        public final void a()
        {
        }

        public final void a(gfp gfp)
        {
        }

        public final void a(String s)
        {
            FindFriendsViewManager.a(a).getFilter().filter(s);
            esj esj1 = FindFriendsViewManager.a(a);
            boolean flag;
            if (!TextUtils.isEmpty(s))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            esj1.c = flag;
            FindFriendsViewManager.b().a(FindFriendsViewManager.a(a));
        }

        public final void a(boolean flag)
        {
            if (flag)
            {
                esl esl1 = FindFriendsViewManager.b();
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cp);
                clientevent.a("n_friends", String.valueOf(esl1.c));
                clientevent.a("n_friends", String.valueOf(esl1.d));
                fop fop1 = esl1.a;
                fop.a(esl1.b, ViewUri.p, clientevent);
            }
        }

            
            {
                a = FindFriendsViewManager.this;
                super();
            }
    };
    private android.view.View.OnClickListener m;

    public FindFriendsViewManager(View view, Flags flags)
    {
        b = TabType.a;
        m = new android.view.View.OnClickListener() {

            public final void onClick(View view1)
            {
                view1 = view1.getContext();
                view1.startActivity(new Intent(view1, com/spotify/mobile/android/spotlets/share/ConnectFacebookActivity));
                view1 = FindFriendsViewManager.b();
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.cm);
                fop fop1 = ((esl) (view1)).a;
                fop.a(((esl) (view1)).b, ViewUri.p, clientevent);
            }

        };
        ctz.a(view);
        ctz.a(flags);
        Context context = view.getContext();
        k = flags;
        g = (ListView)view.findViewById(0x102000a);
        flags = l;
        Object obj = g;
        ctz.a(context);
        ctz.a(flags);
        ctz.a(obj);
        Object obj1 = (FilterHeaderView)LayoutInflater.from(context).inflate(0x7f0300c2, null);
        ((FilterHeaderView) (obj1)).setId(0x7f11004c);
        obj1.b = flags;
        ((FilterHeaderView) (obj1)).findViewById(0x7f1103f5).setVisibility(8);
        ((FilterHeaderView) (obj1)).a(0x7f0802d7);
        FilterHeaderView.a(((View) (obj)), ((FilterHeaderView) (obj1)));
        ((ListView) (obj)).setOnScrollListener(new esm._cls1(((FilterHeaderView) (obj1))));
        int i1 = context.getResources().getDimensionPixelSize(0x7f0c00e0);
        ((FilterHeaderView) (obj1)).setPadding(((FilterHeaderView) (obj1)).getPaddingLeft(), i1, ((FilterHeaderView) (obj1)).getPaddingRight(), i1);
        a = ((FilterHeaderView) (obj1));
        ctz.a(context);
        flags = dgp.e(context);
        flags.setId(0x7f11004d);
        flags.setSingleLine(true);
        i1 = dft.a(48F, context.getResources());
        flags.setPadding(i1, 0, i1, 0);
        obj = new FrameLayout(context);
        ((FrameLayout) (obj)).setId(0x7f11004e);
        obj1 = new android.widget.FrameLayout.LayoutParams(-2, -2);
        obj1.gravity = 17;
        i1 = dft.a(15F, context.getResources());
        ((android.widget.FrameLayout.LayoutParams) (obj1)).setMargins(0, i1, 0, i1);
        flags.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj1)));
        ((FrameLayout) (obj)).addView(flags);
        f = ((View) (obj));
        g.addHeaderView(a);
        i = new esj(context, new ArrayList(), k, f);
        j = new esi(context, new ArrayList(), k);
        c = (RadioGroup)view.findViewById(0x7f11033d);
        c.setOnCheckedChangeListener(new android.widget.RadioGroup.OnCheckedChangeListener() {

            private FindFriendsViewManager a;

            public final void onCheckedChanged(RadioGroup radiogroup, int j1)
            {
                j1;
                JVM INSTR tableswitch 2131821374 2131821375: default 24
            //                           2131821374 30
            //                           2131821375 68;
                   goto _L1 _L2 _L3
_L1:
                Assertion.a("If you end up here, FindFriends tab architecture is b0rken");
_L5:
                return;
_L2:
                radiogroup = a;
                if (((FindFriendsViewManager) (radiogroup)).b != TabType.a)
                {
                    radiogroup.b = TabType.a;
                    radiogroup.a(TabType.a.mState);
                    radiogroup.a(true);
                    return;
                }
                continue; /* Loop/switch isn't completed */
_L3:
                radiogroup = a;
                if (((FindFriendsViewManager) (radiogroup)).b != TabType.b)
                {
                    radiogroup.b = TabType.b;
                    radiogroup.a(TabType.b.mState);
                    radiogroup.a(false);
                    return;
                }
                if (true) goto _L5; else goto _L4
_L4:
            }

            
            {
                a = FindFriendsViewManager.this;
                super();
            }
        });
        a(true);
        h = (LinearLayout)view.findViewById(0x7f110342);
        h.findViewById(0x7f110343).setOnClickListener(m);
        e = (LoadingView)view.findViewById(0x7f110340);
        d = (new gaa(context, (EmptyView)view.findViewById(0x7f1102c0), new View(view.getContext()))).b(SpotifyIcon.aT, 0x7f0802a1, 0x7f0802d4).b(0x7f0802a1, 0x7f0802a0).a(0x7f0802ad, 0x7f0802e0).a();
        flags = c();
        view = view.getContext().getApplicationContext();
        ctz.a(view);
        flags.b = view;
        c().a(i);
        c().a(j);
    }

    static esj a(FindFriendsViewManager findfriendsviewmanager)
    {
        return findfriendsviewmanager.i;
    }

    static esl b()
    {
        return c();
    }

    private static esl c()
    {
        return (esl)dmz.a(esh, esl);
    }

    private void d()
    {
        a.a();
        ViewParent viewparent = a.getParent();
        if (viewparent != null)
        {
            viewparent.clearChildFocus(a);
        }
    }

    private void e()
    {
        d();
        h.setVisibility(8);
        g.setVisibility(8);
        g.setAdapter(null);
    }

    final void a(State state)
    {
        ctz.a(state);
        if (state != State.a)
        {
            e.setVisibility(8);
        }
        final class _cls4
        {

            static final int a[];

            static 
            {
                a = new int[State.values().length];
                try
                {
                    a[State.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[State.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[State.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[State.e.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[State.f.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[State.d.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls4.a[state.ordinal()])
        {
        default:
            Assertion.a("If you end up here, FindFriends state architecture is b0rken");
            return;

        case 1: // '\001'
            e();
            d.b(null);
            d.a(e);
            return;

        case 2: // '\002'
            e();
            d.b(null);
            d.d(true);
            return;

        case 3: // '\003'
            e();
            d.c(true);
            return;

        case 4: // '\004'
            h.setVisibility(8);
            d();
            d.b(null);
            if (b == TabType.a)
            {
                if (g.getHeaderViewsCount() == 0)
                {
                    g.setAdapter(null);
                    g.addHeaderView(a);
                }
                g.setAdapter(i);
                g.setSelection(1);
                c().a(true);
            } else
            {
                g.setAdapter(null);
                g.removeHeaderView(a);
                g.setAdapter(j);
                state = c();
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R, com.spotify.mobile.android.util.ClientEvent.SubEvent.cg);
                clientevent.a("n_friends", String.valueOf(((esl) (state)).e));
                clientevent.a("n_friends_not_followed", String.valueOf(((esl) (state)).f));
                fop fop1 = ((esl) (state)).a;
                fop.a(((esl) (state)).b, ViewUri.p, clientevent);
            }
            g.setVisibility(0);
            return;

        case 5: // '\005'
            d();
            d.b(null);
            h.setVisibility(0);
            g.setAdapter(null);
            g.setVisibility(8);
            c().a(false);
            return;

        case 6: // '\006'
            e();
            d.a(true);
            return;
        }
    }

    public final void a(TabType tabtype, State state)
    {
        ctz.a(state);
        tabtype.mState = state;
        if (b == tabtype)
        {
            a(state);
        }
    }

    public final void a(TabType tabtype, FindFriendsModel findfriendsmodel)
    {
        ctz.a(tabtype);
        boolean flag;
        if (findfriendsmodel == null || findfriendsmodel.getResults().isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag)
        {
            a(tabtype, State.b);
            return;
        }
        a(tabtype, State.e);
        if (tabtype == TabType.a)
        {
            tabtype = i;
        } else
        {
            tabtype = j;
        }
        tabtype.clear();
        tabtype.addAll(findfriendsmodel.getResults());
        c().a(i);
        c().a(j);
    }

    public final void a(FindFriendsModel findfriendsmodel, android.view.View.OnClickListener onclicklistener)
    {
        if (findfriendsmodel != null)
        {
            Button button = (Button)f.findViewById(0x7f11004d);
            int i1 = findfriendsmodel.getResults().size();
            ctz.a(button);
            ctz.a(onclicklistener);
            button.setText(button.getContext().getResources().getString(0x7f0802d8, new Object[] {
                Integer.valueOf(i1)
            }));
            button.setOnClickListener(onclicklistener);
        }
    }

    final void a(boolean flag)
    {
        View view = c.findViewById(TabType.b.mResId);
        boolean flag1;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        view.setSelected(flag1);
        c.findViewById(TabType.a.mResId).setSelected(flag);
    }

    public final boolean a()
    {
        return TabType.a == b;
    }

    static 
    {
        dmz.a(esh, esl, new esl());
    }

    private class TabType extends Enum
    {

        public static final TabType a;
        public static final TabType b;
        private static final TabType c[];
        public final int mResId;
        State mState;

        public static TabType valueOf(String s)
        {
            return (TabType)Enum.valueOf(com/spotify/mobile/android/spotlets/findfriends/FindFriendsViewManager$TabType, s);
        }

        public static TabType[] values()
        {
            return (TabType[])c.clone();
        }

        static 
        {
            a = new TabType("FRIENDS", 0, State.a, 0x7f11033e);
            b = new TabType("FEATURED", 1, State.a, 0x7f11033f);
            c = (new TabType[] {
                a, b
            });
        }

        private TabType(String s, int i1, State state, int j1)
        {
            super(s, i1);
            mState = state;
            mResId = j1;
        }
    }


    private class State extends Enum
    {

        public static final State a;
        public static final State b;
        public static final State c;
        public static final State d;
        public static final State e;
        public static final State f;
        private static final State g[];

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/spotify/mobile/android/spotlets/findfriends/FindFriendsViewManager$State, s);
        }

        public static State[] values()
        {
            return (State[])g.clone();
        }

        static 
        {
            a = new State("LOADING", 0);
            b = new State("EMPTY", 1);
            c = new State("ERROR", 2);
            d = new State("OFFLINE", 3);
            e = new State("DISPLAY_SOURCES_CONNECTED", 4);
            f = new State("DISPLAY_NO_SOURCES_CONNECTED", 5);
            g = (new State[] {
                a, b, c, d, e, f
            });
        }

        private State(String s, int i1)
        {
            super(s, i1);
        }
    }

}
