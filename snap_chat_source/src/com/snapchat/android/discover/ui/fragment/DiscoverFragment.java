// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.discover.ui.fragment;

import AS;
import CF;
import CG;
import Cf;
import Ck;
import Cl;
import Jh;
import Jo;
import Og;
import Ow;
import PG;
import PI;
import Sc;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.snapchat.android.Timber;
import com.snapchat.android.analytics.framework.BlizzardEventLogger;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.analytics.DiscoverUsageAnalytics;
import com.snapchat.android.discover.controller.DiscoverMediaCategory;
import com.snapchat.android.discover.model.ChannelPage;
import com.snapchat.android.discover.ui.ChannelGroupView;
import com.snapchat.android.discover.ui.ChannelView;
import com.snapchat.android.discover.ui.DiscoverLoadingStatePresenter;
import com.snapchat.android.discover.ui.EditionViewerMetadata;
import com.snapchat.android.discover.ui.OpenChannelAnimationView;
import com.snapchat.android.discover.util.network.DiscoverEndpointManager;
import com.snapchat.android.util.fragment.SnapchatFragment;
import com.squareup.otto.Bus;
import gR;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ll;
import uL;
import uM;
import uQ;
import vJ;
import vM;
import vR;
import vm;
import vr;
import wJ;
import wL;
import wo;
import ws;

// Referenced classes of package com.snapchat.android.discover.ui.fragment:
//            ChannelSpanSizeLookup, EditionViewerFragment

public class DiscoverFragment extends SnapchatFragment
    implements Ck, com.snapchat.android.discover.util.network.DiscoverEndpointManager.a, vJ.a
{

    private final DiscoverEndpointManager a;
    private final uM b;
    private final Cl c;
    private final DiscoverLoadingStatePresenter d;
    private final vJ e;
    private final uL f;
    private final wo g;
    private final DiscoverUsageAnalytics h;
    private ws i;
    private ChannelGroupView j;
    private GridLayoutManager k;
    private OpenChannelAnimationView l;
    private View m;
    private TextView n;
    private ImageView o;
    private boolean p;
    private List q;
    private int r;
    private Set s;
    private final android.view.View.OnClickListener t;
    private final android.support.v7.widget.RecyclerView.l u;

    public DiscoverFragment()
    {
        this(DiscoverEndpointManager.a(), uM.a(), Cl.a(), new DiscoverLoadingStatePresenter(), vJ.a(), uL.a(), wo.a(), new DiscoverUsageAnalytics());
    }

    private DiscoverFragment(DiscoverEndpointManager discoverendpointmanager, uM um, Cl cl, DiscoverLoadingStatePresenter discoverloadingstatepresenter, vJ vj, uL ul, wo wo1, 
            DiscoverUsageAnalytics discoverusageanalytics)
    {
        i = null;
        p = false;
        r = -1;
        s = new HashSet();
        t = new android.view.View.OnClickListener() {

            private DiscoverFragment a;

            public final void onClick(View view)
            {
                if (!a.l())
                {
                    DiscoverFragment.a(a).a(com.snapchat.android.discover.ui.DiscoverLoadingStatePresenter.LoadingState.LOADING);
                    a.h();
                }
            }

            
            {
                a = DiscoverFragment.this;
                super();
            }
        };
        u = new android.support.v7.widget.RecyclerView.l() {

            private DiscoverFragment a;

            public final void a(RecyclerView recyclerview, int i1, int j1)
            {
                i1 = DiscoverFragment.f(a).o();
                if (DiscoverFragment.g(a) != -1 && DiscoverFragment.g(a) == i1)
                {
                    return;
                } else
                {
                    a.m();
                    return;
                }
            }

            
            {
                a = DiscoverFragment.this;
                super();
            }
        };
        a = discoverendpointmanager;
        b = um;
        c = cl;
        d = discoverloadingstatepresenter;
        e = vj;
        f = ul;
        g = wo1;
        h = discoverusageanalytics;
    }

    static DiscoverLoadingStatePresenter a(DiscoverFragment discoverfragment)
    {
        return discoverfragment.d;
    }

    private void a(int i1)
    {
        b(i1);
        ChannelSpanSizeLookup channelspansizelookup = new ChannelSpanSizeLookup(i1);
        vR vr1 = new vR(channelspansizelookup);
        k.b = channelspansizelookup;
        j.a(vr1);
        j.removeAllViews();
    }

    private void a(View view)
    {
        if (g.e())
        {
            Rect rect = new Rect();
            Point point = new Point();
            if (view.getGlobalVisibleRect(rect, point))
            {
                wo wo1 = g;
                int i1 = point.x;
                int j1 = rect.width() / 2;
                int k1 = point.y;
                int l1 = rect.height() / 2;
                int i2 = view.getMeasuredWidth() / 2;
                if (wo1.c != null)
                {
                    wo1.c.a(i1 + j1, l1 + k1, i2);
                }
            }
        }
    }

    private void a(ChannelView channelview, wL wl)
    {
        if (channelview == null)
        {
            return;
        } else
        {
            j.post(new Runnable(channelview, wl) {

                private ChannelView a;
                private wL b;
                private DiscoverFragment c;

                public final void run()
                {
                    DiscoverFragment.e(c).a(a, DiscoverFragment.d(c), MediaOpenOrigin.CHAT, b.a, b.b, b.c, b.d);
                }

            
            {
                c = DiscoverFragment.this;
                a = channelview;
                b = wl;
                super();
            }
            });
            return;
        }
    }

    static void a(DiscoverFragment discoverfragment, View view)
    {
        discoverfragment.a(view);
    }

    static void a(DiscoverFragment discoverfragment, ChannelView channelview, wL wl)
    {
        discoverfragment.a(channelview, wl);
    }

    static void a(DiscoverFragment discoverfragment, List list)
    {
        if (list.isEmpty()) goto _L2; else goto _L1
_L1:
        discoverfragment.d.a(com.snapchat.android.discover.ui.DiscoverLoadingStatePresenter.LoadingState.LOADED);
_L8:
        if (list.size() != discoverfragment.i.b())
        {
            discoverfragment.a(list.size());
        }
        discoverfragment.i.a(list);
        discoverfragment.m();
        if (!discoverfragment.g.e()) goto _L4; else goto _L3
_L3:
        list = discoverfragment.g;
        if (((wo) (list)).c == null)
        {
            list = null;
        } else
        {
            list = ((wo) (list)).c.s();
        }
        if (list != null && ((EditionViewerMetadata) (list)).a == MediaOpenOrigin.EXTERNAL && ((EditionViewerMetadata) (list)).b != null) goto _L5; else goto _L4
_L4:
        return;
_L2:
        if (discoverfragment.p)
        {
            Timber.c("DiscoverFragment", "Channels loaded - No Channels.", new Object[0]);
            discoverfragment.d.a(com.snapchat.android.discover.ui.DiscoverLoadingStatePresenter.LoadingState.GENERIC_ERROR);
            discoverfragment.l();
        }
        continue; /* Loop/switch isn't completed */
_L5:
        ChannelView channelview;
        list = ((EditionViewerMetadata) (list)).b.c;
        channelview = (ChannelView)discoverfragment.j.findViewWithTag(list);
        if (channelview != null)
        {
            break; /* Loop/switch isn't completed */
        }
        int i1 = discoverfragment.i.a(list);
        if (i1 >= 0)
        {
            discoverfragment.j.a(discoverfragment. new android.support.v7.widget.RecyclerView.l(list) {

                private String a;
                private DiscoverFragment b;

                public final void a(RecyclerView recyclerview, int j1)
                {
                    super.a(recyclerview, j1);
                    if (j1 == 0)
                    {
                        recyclerview = (ChannelView)DiscoverFragment.b(b).findViewWithTag(a);
                        DiscoverFragment.a(b, ((ChannelView) (recyclerview)).a);
                        DiscoverFragment.b(b).b(this);
                    }
                }

            
            {
                b = DiscoverFragment.this;
                a = s1;
                super();
            }
            });
            discoverfragment.j.a(i1);
            return;
        }
        if (true) goto _L4; else goto _L6
_L6:
        discoverfragment.a(((View) (channelview.a)));
        return;
        if (true) goto _L8; else goto _L7
_L7:
    }

    static ChannelGroupView b(DiscoverFragment discoverfragment)
    {
        return discoverfragment.j;
    }

    private void b(int i1)
    {
        int j1 = getResources().getConfiguration().screenLayout & 0xf;
        float f1 = (float)Jo.b(getActivity()) / (float)Jo.a(getActivity());
        if (i1 <= 12)
        {
            m.setVisibility(8);
            n.setVisibility(8);
            o.setVisibility(0);
            if (j1 == 1 || j1 == 2 && f1 <= 1.65F)
            {
                o.setImageResource(0x7f020121);
            }
            return;
        } else
        {
            m.setVisibility(0);
            n.setVisibility(0);
            o.setVisibility(8);
            return;
        }
    }

    private void b(List list)
    {
        if (mFragmentLayout != null)
        {
            mFragmentLayout.post(new Runnable(list) {

                private List a;
                private DiscoverFragment b;

                public final void run()
                {
                    DiscoverFragment.a(b, a);
                }

            
            {
                b = DiscoverFragment.this;
                a = list;
                super();
            }
            });
        }
    }

    static android.support.v7.widget.RecyclerView.l c(DiscoverFragment discoverfragment)
    {
        return discoverfragment.u;
    }

    static OpenChannelAnimationView d(DiscoverFragment discoverfragment)
    {
        return discoverfragment.l;
    }

    static wo e(DiscoverFragment discoverfragment)
    {
        return discoverfragment.g;
    }

    static GridLayoutManager f(DiscoverFragment discoverfragment)
    {
        return discoverfragment.k;
    }

    static int g(DiscoverFragment discoverfragment)
    {
        return discoverfragment.r;
    }

    private void n()
    {
        if (s.size() == 0)
        {
            return;
        } else
        {
            String s1 = Jh.a(s, "~");
            DiscoverUsageAnalytics discoverusageanalytics = h;
            long l1 = i.b();
            gR gr = new gR();
            gr.discoverCellCount = Long.valueOf(l1);
            gr.discoverPublishersSeen = s1;
            discoverusageanalytics.a.a(gr);
            s.clear();
            r = -1;
            return;
        }
    }

    public final void a(NetworkInfo networkinfo)
    {
        if (c.c())
        {
            f.b();
        }
    }

    public final void a(List list)
    {
        if (!super.mAreLargeUiUpdatesEnabled)
        {
            q = list;
            return;
        } else
        {
            b(list);
            return;
        }
    }

    protected final void a(vM vm1)
    {
        if (!g.e())
        {
            e.c();
        }
        if (vm1.a == 0 && i.b() == 0)
        {
            d.a(com.snapchat.android.discover.ui.DiscoverLoadingStatePresenter.LoadingState.GENERIC_ERROR);
            l();
        }
    }

    public final void a_(boolean flag)
    {
        if (flag)
        {
            n();
        }
    }

    protected final com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode b()
    {
        return com.snapchat.android.ui.window.WindowConfiguration.StatusBarDrawMode.DRAW_BEHIND;
    }

    public final void c()
    {
        com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility compatibility = a.b;
        if (TextUtils.isEmpty(a.b()))
        {
            d.a(com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.NOT_SUPPORTED);
            l();
        } else
        {
            d.a(compatibility);
            if (!l() && compatibility == com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.SUPPORTED)
            {
                h();
                return;
            }
        }
    }

    public final void d()
    {
        super.d();
        Timber.a("DiscoverFragment", "Entering pager window.", new Object[0]);
        if (q != null)
        {
            Timber.a("DiscoverFragment", "Swapping cached channel pages.", new Object[0]);
            b(q);
            q = null;
        }
    }

    protected final void e()
    {
        c.b(this);
        b.b();
        super.e();
    }

    public final boolean f()
    {
        n();
        return g.b();
    }

    protected final Cf g()
    {
        return new Cf(new String[] {
            "DISCOVER"
        });
    }

    protected final void h()
    {
        if (a.b() != null && a.b == com.snapchat.android.discover.util.network.DiscoverEndpointManager.Compatibility.SUPPORTED)
        {
            if (i != null && i.b() == 0)
            {
                d.a(com.snapchat.android.discover.ui.DiscoverLoadingStatePresenter.LoadingState.LOADING);
            }
            Timber.c("DiscoverFragment", "Fetching discover channel list", new Object[0]);
            (new vM(getActivity()) {

                final DiscoverFragment b;

                protected final void a(vM vm1)
                {
                    PG.a(new Runnable(this, vm1) {

                        private vM a;
                        private _cls6 b;

                        public final void run()
                        {
                            b.b.a(a);
                        }

            
            {
                b = _pcls6;
                a = vm1;
                super();
            }
                    });
                }

            
            {
                b = DiscoverFragment.this;
                super(context);
            }
            }).execute();
        }
    }

    public final CF k()
    {
        return new CF() {

            public final boolean a(CG.a a1)
            {
                return CG.h.contains(a1.c);
            }

            public final boolean b(CG.a a1)
            {
                return false;
            }

        };
    }

    protected final boolean l()
    {
        boolean flag = false;
        NetworkInfo networkinfo = c.b();
        if (getActivity() == null || getActivity().getExternalCacheDir() == null)
        {
            Timber.d("DiscoverFragment", "checkForLocalLoadingErrors: No external storage available error.", new Object[0]);
            d.a(com.snapchat.android.discover.ui.DiscoverLoadingStatePresenter.LoadingState.EXTERNAL_STORAGE_UNAVAILABLE);
            flag = true;
        } else
        if (networkinfo == null || !networkinfo.isConnected())
        {
            Timber.d("DiscoverFragment", "checkForLocalLoadingErrors: Network error %s", new Object[] {
                networkinfo
            });
            d.a(com.snapchat.android.discover.ui.DiscoverLoadingStatePresenter.LoadingState.NETWORK_ERROR);
            return true;
        }
        return flag;
    }

    protected final void m()
    {
        if (k == null || i == null || ((vm) (i)).d.size() <= k.o() || k.m() < 0)
        {
            return;
        }
        for (int i1 = k.m(); i1 <= k.o(); i1++)
        {
            s.add(((ChannelPage)((vm) (i)).d.get(i1)).c);
        }

        r = k.o();
    }

    public final void m_()
    {
        n();
        super.m_();
    }

    public void onCreate(Bundle bundle)
    {
        ll.e();
        super.onCreate(bundle);
        bundle = a;
        if (this != null)
        {
            ((DiscoverEndpointManager) (bundle)).a.add(this);
        }
        if (!g.d)
        {
            g.d();
        }
        ll.f();
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ll.e();
        mFragmentLayout = layoutinflater.inflate(0x7f04005d, viewgroup, false);
        m = d(0x7f0d0256);
        n = (TextView)d(0x7f0d0255);
        o = (ImageView)d(0x7f0d0252);
        l = (OpenChannelAnimationView)d(0x7f0d0050);
        i = new ws(getActivity(), g, l);
        d(0x7f0d0253).setOnClickListener(new android.view.View.OnClickListener() {

            private DiscoverFragment a;

            public final void onClick(View view)
            {
                a.getActivity().onBackPressed();
            }

            
            {
                a = DiscoverFragment.this;
                super();
            }
        });
        j = (ChannelGroupView)d(0x7f0d0257);
        getActivity();
        k = new GridLayoutManager();
        a(i.b());
        j.setLayoutManager(k);
        j.setAdapter(i);
        j.setOnScrollListener(u);
        layoutinflater = d;
        viewgroup = mFragmentLayout;
        bundle = i;
        layoutinflater.a = new PI(viewgroup, 0x7f0d0258, 0x7f0d025c, new com.snapchat.android.discover.ui.DiscoverLoadingStatePresenter._cls1(layoutinflater, t));
        layoutinflater.g = viewgroup.findViewById(0x7f0d0259);
        layoutinflater.f = (ChannelGroupView)viewgroup.findViewById(0x7f0d0257);
        layoutinflater.h = bundle;
        b(i.b());
        e.a(this);
        e.b();
        ll.f();
        return mFragmentLayout;
    }

    public void onDestroy()
    {
        super.onDestroy();
        e.b(this);
        a.a.remove(this);
    }

    public void onEditionClose(wJ wj)
    {
        vJ vj = e;
        List list = wj.c;
        vj.e.post(vj.a(new vJ._cls13(vj, list)));
        e.c();
        wj = j.findViewWithTag(wj.a);
        if (wj != null)
        {
            wj.invalidate();
        }
    }

    public void onPagedToDiscoverEvent(wL wl)
    {
        ChannelView channelview = (ChannelView)j.findViewWithTag(wl.a);
        if (channelview != null)
        {
            a(channelview, wl);
        } else
        {
            int i1 = i.a(wl.a);
            if (i1 >= 0)
            {
                j.setOnScrollListener(new android.support.v7.widget.RecyclerView.l(wl) {

                    private wL a;
                    private DiscoverFragment b;

                    public final void a(RecyclerView recyclerview, int j1)
                    {
                        super.a(recyclerview, j1);
                        if (j1 == 0)
                        {
                            recyclerview = (ChannelView)DiscoverFragment.b(b).findViewWithTag(a.a);
                            DiscoverFragment.a(b, recyclerview, a);
                            DiscoverFragment.b(b).setOnScrollListener(DiscoverFragment.c(b));
                        }
                    }

            
            {
                b = DiscoverFragment.this;
                a = wl;
                super();
            }
                });
                j.b(i1);
                return;
            }
        }
    }

    public void onPause()
    {
        super.onPause();
        if (!g.e())
        {
            ws ws1 = i;
            ws1.g.a();
            ws1.a(((vm) (ws1)).d);
        }
        wo wo1 = g;
        if (wo1.e())
        {
            wo1.c.q();
        }
        wo1.d = false;
        wo1.a.a(new Og(true));
    }

    public void onResume()
    {
        ll.e();
        super.onResume();
        d.a(a.b);
        Object obj = f;
        Timber.c("DiscoverMediaManager", "DISCOVER-MEDIA: Checking cache consistency", new Object[0]);
        for (obj = ((uL) (obj)).b.iterator(); ((Iterator) (obj)).hasNext(); ((uQ)((Iterator) (obj)).next()).b()) { }
        if (!g.e())
        {
            f.b();
        }
        if (!l())
        {
            h();
        }
        ll.f();
    }

    public void onSyncAllCompletedEvent(Ow ow)
    {
        p = true;
    }

    protected void onVisible()
    {
        ll.e();
        super.onVisible();
        getActivity().setVolumeControlStream(3);
        b.b();
        Object obj = f;
        DiscoverMediaCategory discovermediacategory = DiscoverMediaCategory.HOME_PAGE;
        if (((uL) (obj)).e.mPreloadMode != Sc.NO_PRELOAD)
        {
            Timber.c("DiscoverMediaManager", "DISCOVER-MEDIA: Retry failed media for context %s", new Object[] {
                discovermediacategory
            });
            obj = ((uL) (obj)).b.iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                uQ uq = (uQ)((Iterator) (obj)).next();
                if (discovermediacategory.equals(uq.d()))
                {
                    uq.c();
                }
            } while (true);
        } else
        {
            Timber.a("DiscoverMediaManager", "DISCOVER-MEDIA: Skipping retry failed media for context %s since settings prevent preload.", new Object[] {
                discovermediacategory
            });
        }
        c.a(this);
        ll.f();
        m();
    }
}
