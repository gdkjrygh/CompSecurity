// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import com.pandora.android.activity.BaseFragmentActivity;
import com.pandora.android.activity.HomeTabsActivity;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.provider.b;
import com.pandora.android.util.SearchBox;
import com.pandora.android.util.SearchMusicLayout;
import com.pandora.android.util.aa;
import com.pandora.android.util.s;
import com.pandora.radio.data.MusicSearchData;
import com.pandora.radio.data.SearchDescriptor;
import com.pandora.radio.data.StationRecommendation;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.provider.i;
import com.pandora.radio.provider.k;
import com.pandora.radio.util.j;
import java.security.InvalidParameterException;
import java.util.UUID;
import p.cw.c;
import p.dd.aw;
import p.dd.ay;
import p.df.a;

// Referenced classes of package p.ca:
//            m, aq, y, ar, 
//            t

public class af extends m
    implements com.pandora.android.util.SearchMusicLayout.a
{
    private class a
    {

        final af a;

        public void a()
        {
            b.a.b().c(this);
        }

        public void onStationRecommendations(aw aw1)
        {
            p.ca.af.a(a, aw1.a);
        }

        public void onStationStateChange(ay ay1)
        {
            static class _cls4
            {

                static final int a[];

                static 
                {
                    a = new int[p.dd.ay.a.values().length];
                    try
                    {
                        a[p.dd.ay.a.c.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[p.dd.ay.a.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[p.dd.ay.a.d.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[p.dd.ay.a.a.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (p.ca._cls4.a[ay1.b.ordinal()])
            {
            default:
                throw new InvalidParameterException((new StringBuilder()).append("onStationStateChange called with unknown stationStateChangeType: ").append(ay1.b).toString());

            case 4: // '\004'
                com.pandora.android.util.s.k();
                // fall through

            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                return;
            }
        }

        public a()
        {
            a = af.this;
            super();
            b.a.b().b(this);
        }
    }


    public static final UUID n = UUID.randomUUID();
    static final boolean o;
    protected SearchMusicLayout j;
    protected SearchBox k;
    protected boolean l;
    protected android.view.View.OnClickListener m;
    private View p;
    private j q;
    private boolean r;
    private StationRecommendations s;
    private aa t;
    private aq u;
    private a v;
    private MusicSearchData w;
    private BroadcastReceiver x;

    public af()
    {
        x = new BroadcastReceiver() {

            final af a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                break MISSING_BLOCK_LABEL_5;
                if (!com.pandora.android.util.s.a(context) && context.equals(PandoraIntent.a("action_populate_search_results")))
                {
                    context = (UUID)intent.getSerializableExtra("intent_task_id");
                    if (context == a.j.a || context == af.n)
                    {
                        com.pandora.android.util.s.k();
                        a.m();
                        context = intent.getStringExtra("intent_search_query");
                        if (!com.pandora.android.util.s.a(context))
                        {
                            a.b(context);
                        }
                        context = (MusicSearchData)intent.getParcelableExtra("intent_search_results");
                        if (context != null)
                        {
                            a.j.a(context);
                            return;
                        }
                    }
                }
                return;
            }

            
            {
                a = af.this;
                super();
            }
        };
    }

    static MusicSearchData a(af af1, MusicSearchData musicsearchdata)
    {
        af1.w = musicsearchdata;
        return musicsearchdata;
    }

    public static af a(j j1, boolean flag, boolean flag1)
    {
        return a(j1, flag, flag1, null, null);
    }

    public static af a(j j1, boolean flag, boolean flag1, MusicSearchData musicsearchdata, String s1)
    {
        af af1 = new af();
        af1.setArguments(b(j1, flag, flag1, musicsearchdata, s1));
        return af1;
    }

    private void a(StationRecommendations stationrecommendations)
    {
        Object obj = null;
        com.pandora.radio.data.af af1 = b.a.d();
        boolean flag;
        if (af1 != null && af1.p() && !r)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            stationrecommendations = null;
        }
        s = stationrecommendations;
        if (l)
        {
            stationrecommendations = obj;
            if (b.a.b().y().d())
            {
                stationrecommendations = s;
            }
            u = new aq(getActivity(), stationrecommendations, t, r);
            t.a(u.a());
            if (u.getCount() > 0)
            {
                a(((android.widget.ListAdapter) (u)));
            }
        }
    }

    static void a(af af1, StationRecommendations stationrecommendations)
    {
        af1.a(stationrecommendations);
    }

    protected static Bundle b(j j1, boolean flag, boolean flag1, MusicSearchData musicsearchdata, String s1)
    {
        Bundle bundle = new Bundle(5);
        bundle.putSerializable("intent_search_result_consumer", j1);
        bundle.putParcelable("intent_search_results", musicsearchdata);
        bundle.putSerializable("intent_search_query", s1);
        bundle.putBoolean("intent_search_add_variety", flag);
        bundle.putBoolean("intent_advertiser_station", flag1);
        return bundle;
    }

    private void o()
    {
        if (j != null)
        {
            j.a();
        }
    }

    private void p()
    {
        if (k != null)
        {
            k.c();
        }
    }

    public void a(int i1)
    {
        i.f();
        com.pandora.android.util.s.k();
    }

    public void a(ListView listview, View view, int i1, long l1)
    {
        view = (StationRecommendation)((aq)b()).getItem(i1);
        if (view == k.a)
        {
            a(q);
            return;
        }
        if (view == k.c)
        {
            a(s, q);
            return;
        }
        t.b(view);
        com.pandora.android.util.s.j();
        if (j.c())
        {
            listview = p.cx.x.e.c;
        } else
        {
            listview = p.cx.x.e.d;
        }
        q.a(view.b(), view.n(), b.a.b(), listview, l());
        i.f();
    }

    protected void a(StationRecommendations stationrecommendations, j j1)
    {
        i.a(p.ca.ar.a(stationrecommendations, j1));
    }

    protected void a(j j1)
    {
        i.a(p.ca.t.a(j1));
    }

    public void a(boolean flag, boolean flag1)
    {
label0:
        {
            super.a(flag, flag1);
            if (i != null)
            {
                if (!flag)
                {
                    break label0;
                }
                if (k != null && !j.c())
                {
                    j.a(k, g(), r);
                    p();
                }
            }
            return;
        }
        n();
    }

    public boolean a()
    {
        return false;
    }

    public void b(Bundle bundle)
    {
    }

    protected void b(String s1)
    {
        if (k != null)
        {
            k.setSearchText(s1);
            j.a(k, g(), false);
        }
    }

    public boolean c()
    {
        return false;
    }

    public CharSequence d()
    {
        if (q == null)
        {
            return null;
        } else
        {
            return q.a();
        }
    }

    public void e()
    {
        p.setVisibility(8);
    }

    public void f()
    {
        p.setVisibility(0);
    }

    protected int g()
    {
        return 0x7f080229;
    }

    protected void h()
    {
    }

    protected void j()
    {
        if (k != null)
        {
            j.a(k, g(), r);
        }
    }

    protected void k()
    {
        if (k != null)
        {
            k.d();
        }
    }

    public void k_()
    {
        com.pandora.android.util.s.j();
    }

    public SearchDescriptor l()
    {
        if (w != null)
        {
            return w.e();
        } else
        {
            return null;
        }
    }

    public int l_()
    {
        return HomeTabsActivity.r();
    }

    protected void m()
    {
        if (k != null)
        {
            j.a(k, g(), r);
        }
    }

    protected void n()
    {
        if (j != null)
        {
            j.b();
        }
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        if (t == null)
        {
            t = new aa(com.pandora.radio.util.k.j.d);
        }
        l = true;
        a(s);
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        bundle = (BaseFragmentActivity)getActivity();
        layoutinflater = layoutinflater.inflate(0x7f040046, viewgroup, false);
        j = (SearchMusicLayout)layoutinflater.findViewById(0x7f100126);
        p = layoutinflater.findViewById(0x7f100125);
        k = (SearchBox)layoutinflater.findViewById(0x7f100043);
        viewgroup = getArguments();
        q = (j)viewgroup.getSerializable("intent_search_result_consumer");
        r = viewgroup.getBoolean("intent_search_add_variety");
        j.setSearchResultsShownListener(this);
        j.setSearchResultConsumer(q);
        j.setSearchTextChangedListener(new com.pandora.android.util.SearchBox.b() {

            final af a;

            public void a()
            {
                p.ca.af.a(a, null);
            }

            
            {
                a = af.this;
                super();
            }
        });
        m = new android.view.View.OnClickListener() {

            final af a;

            public void onClick(View view)
            {
                a.j();
            }

            
            {
                a = af.this;
                super();
            }
        };
        w = (MusicSearchData)viewgroup.getParcelable("intent_search_results");
        if (w != null && j.a(w))
        {
            viewgroup = viewgroup.getString("intent_search_query");
            if (!com.pandora.android.util.s.a(viewgroup))
            {
                b(viewgroup);
            }
        } else
        {
            h();
        }
        viewgroup = new PandoraIntentFilter();
        viewgroup.a("action_populate_search_results");
        b.a.C().a(x, viewgroup);
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        v.a();
        v = null;
        try
        {
            b.a.C().a(x);
        }
        catch (Exception exception)
        {
            p.df.a.c("SearchMusicFragment", "exception during onDestroy", exception);
        }
        o();
        if (!com.pandora.android.util.s.u())
        {
            n();
        }
    }

    public void onDetach()
    {
        super.onDetach();
        k = null;
        j.setSearchResultsShownListener(null);
        j.setSearchTextChangedListener(null);
        o();
    }

    public void onPause()
    {
        if (!com.pandora.android.util.s.u())
        {
            k();
        }
        super.onPause();
    }

    public void onResume()
    {
        super.onResume();
        if (!com.pandora.android.util.s.u())
        {
            p();
        }
    }

    public void onStart()
    {
        if (u != null)
        {
            t.a(u.a());
        }
        super.onStart();
    }

    public void onStop()
    {
        super.onStop();
        t.a(b.a.b());
    }

    public void onViewCreated(View view, Bundle bundle)
    {
        super.onViewCreated(view, bundle);
        if (!o && v != null)
        {
            throw new AssertionError();
        }
        v = new a();
        if (k != null && !com.pandora.android.util.s.u())
        {
            j.a(k, g(), false);
            k.requestFocus();
        }
    }

    public com.pandora.android.util.c v()
    {
        return com.pandora.android.util.c.O;
    }

    static 
    {
        boolean flag;
        if (!p/ca/af.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        o = flag;
    }
}
