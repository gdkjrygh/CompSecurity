// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.ca;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.PowerManager;
import android.support.v4.app.FragmentActivity;
import android.support.v4.content.j;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.android.widget.popupmenu.f;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.provider.b;
import com.pandora.android.util.OnListItemEntranceListener;
import com.pandora.android.util.aa;
import com.pandora.android.util.p;
import com.pandora.android.util.s;
import com.pandora.radio.data.PromotedStation;
import com.pandora.radio.data.StationRecommendation;
import com.pandora.radio.data.StationRecommendations;
import com.pandora.radio.data.af;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.aj;
import com.pandora.radio.data.y;
import com.pandora.radio.util.k;
import java.util.ArrayList;
import java.util.Iterator;
import p.cw.c;
import p.dd.ah;
import p.dd.aw;
import p.dd.bo;
import p.di.h;
import p.dk.a;
import p.l.d;
import p.l.g;

// Referenced classes of package p.ca:
//            m, y, t

public class ar extends m
    implements android.widget.AdapterView.OnItemLongClickListener, com.android.widget.popupmenu.f.b
{
    private class a extends ArrayAdapter
    {

        final ar a;
        private LayoutInflater b;
        private aa c;

        private View a(View view, ViewGroup viewgroup)
        {
            if (view != null)
            {
                return view;
            } else
            {
                view = b.inflate(0x7f0400a3, viewgroup, false);
                viewgroup = (TextView)view.findViewById(0x7f1002ac);
                viewgroup.setText(0x7f08025f);
                viewgroup.setPadding(0, 0, 0, 0);
                android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-2, -2);
                layoutparams.setMargins(a.getResources().getDimensionPixelSize(0x7f09008a), 0, 0, 0);
                viewgroup.setLayoutParams(layoutparams);
                return view;
            }
        }

        private View a(View view, ViewGroup viewgroup, StationRecommendation stationrecommendation)
        {
            View view1;
            TextView textview;
            PromotedStation promotedstation;
            if (view == null)
            {
                view = b.inflate(0x7f04008a, viewgroup, false);
            }
            viewgroup = (TextView)view.findViewById(0x7f10011b);
            view1 = view.findViewById(0x7f1002b4);
            textview = (TextView)view.findViewById(0x7f1002b5);
            promotedstation = (PromotedStation)stationrecommendation;
            viewgroup.setText(promotedstation.b());
            stationrecommendation = promotedstation.d();
            viewgroup = stationrecommendation;
            if (com.pandora.android.util.s.a(stationrecommendation))
            {
                viewgroup = getContext().getString(0x7f08021e);
            }
            textview.setText(viewgroup);
            view1.setVisibility(0);
            viewgroup = (ImageView)view.findViewById(0x7f1000b5);
            a(getContext(), promotedstation.m(), ((ImageView) (viewgroup)));
            view.setVisibility(0);
            return view;
        }

        private void a(Context context, String s1, ImageView imageview)
        {
            p.l.g.b(context).a(s1).a(0x7f0200e9).a(imageview);
        }

        private boolean a(StationRecommendation stationrecommendation)
        {
            return stationrecommendation == p.ca.ar.f() || stationrecommendation == p.ca.ar.g();
        }

        private View b(View view, ViewGroup viewgroup, StationRecommendation stationrecommendation)
        {
            if (view == null)
            {
                view = b.inflate(0x7f0400a5, viewgroup, false);
            }
            c.a(stationrecommendation);
            ((TextView)view.findViewById(0x7f10011b)).setText(stationrecommendation.b());
            viewgroup = (TextView)view.findViewById(0x7f10011d);
            viewgroup.setText(stationrecommendation.o());
            viewgroup.setSingleLine(false);
            viewgroup.setMaxLines(2);
            viewgroup.setVisibility(0);
            viewgroup = (ImageView)view.findViewById(0x7f1000b5);
            a(getContext(), stationrecommendation.m(), viewgroup);
            return view;
        }

        private View c(View view, ViewGroup viewgroup, StationRecommendation stationrecommendation)
        {
            int i;
            if (view == null)
            {
                view = b.inflate(0x7f0400a4, viewgroup, false);
            }
            viewgroup = (TextView)view.findViewById(0x7f10011b);
            if (stationrecommendation == p.ca.ar.f())
            {
                i = 0x7f0800a8;
            } else
            {
                i = 0x7f0801a3;
            }
            viewgroup.setText(i);
            return view;
        }

        public void a(View view, StationRecommendation stationrecommendation)
        {
            boolean flag1 = stationrecommendation instanceof PromotedStation;
            p.ca.ar.a(a, stationrecommendation);
            stationrecommendation = view.findViewById(0x7f1002b6);
            f f1 = new f(getContext(), stationrecommendation);
            f1.a(a);
            f1.a().clear();
            int i;
            boolean flag;
            if (!com.pandora.android.util.s.u())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            f1.a(flag);
            if (flag1)
            {
                i = 0x7f12001f;
            } else
            {
                i = 0x7f120020;
            }
            f1.a(i);
            f1.a(new com.android.widget.popupmenu.f.a(this, view, stationrecommendation) {

                final View a;
                final View b;
                final a c;

                public void a(f f1)
                {
                    a.setPressed(false);
                    b.setVisibility(8);
                    p.ca.ar.a(c.a, null);
                }

            
            {
                c = a1;
                a = view;
                b = view1;
                super();
            }
            });
            stationrecommendation.setVisibility(0);
            f1.c();
            view.post(new Runnable(this, view) {

                final View a;
                final a b;

                public void run()
                {
                    a.setPressed(true);
                }

            
            {
                b = a1;
                a = view;
                super();
            }
            });
        }

        public boolean areAllItemsEnabled()
        {
            return true;
        }

        public int getItemViewType(int i)
        {
            StationRecommendation stationrecommendation = (StationRecommendation)getItem(i);
            if (a(stationrecommendation))
            {
                return 1;
            }
            if (stationrecommendation == ar.e())
            {
                return 2;
            }
            return !(stationrecommendation instanceof PromotedStation) ? 0 : 3;
        }

        public View getView(int i, View view, ViewGroup viewgroup)
        {
            StationRecommendation stationrecommendation = (StationRecommendation)getItem(i);
            if (a(stationrecommendation))
            {
                return c(view, viewgroup, stationrecommendation);
            }
            if (stationrecommendation == ar.e())
            {
                return a(view, viewgroup);
            }
            if (stationrecommendation instanceof PromotedStation)
            {
                return a(view, viewgroup, stationrecommendation);
            } else
            {
                return b(view, viewgroup, stationrecommendation);
            }
        }

        public int getViewTypeCount()
        {
            return 4;
        }

        public boolean isEnabled(int i)
        {
            return !a((StationRecommendation)getItem(i));
        }

        public a(FragmentActivity fragmentactivity, StationRecommendations stationrecommendations, aa aa1)
        {
            a = ar.this;
            super(fragmentactivity, 0, p.ca.ar.a(ar.this, stationrecommendations));
            b = (LayoutInflater)fragmentactivity.getSystemService("layout_inflater");
            c = aa1;
        }
    }

    private class b
    {

        final ar a;

        public void a()
        {
            com.pandora.android.provider.b.a.e().b(this);
            com.pandora.android.provider.b.a.b().c(this);
        }

        public void onPromotedStation(ah ah1)
        {
            p.ca.ar.a(a, ah1.a);
            p.ca.ar.b(a);
        }

        public void onStationRecommendations(aw aw1)
        {
            com.pandora.android.util.s.k();
            a.j = aw1.a;
            if (a.j == null || a.j.e())
            {
                a.a(null);
                p.ca.ar.a(a, true);
                return;
            } else
            {
                p.ca.ar.a(a, false);
                p.ca.ar.a(a);
                return;
            }
        }

        public void onUserData(bo bo1)
        {
            p.ca.ar.a(a, bo1.a);
        }

        public b()
        {
            a = ar.this;
            super();
            com.pandora.android.provider.b.a.e().c(this);
            com.pandora.android.provider.b.a.b().b(this);
        }
    }


    private static final StationRecommendation l = new StationRecommendation();
    private static final StationRecommendation m = new StationRecommendation();
    private static final StationRecommendation n = new StationRecommendation();
    protected StationRecommendations j;
    protected com.pandora.radio.util.j k;
    private af o;
    private aa p;
    private StationRecommendation q;
    private boolean r;
    private TextView s;
    private b t;
    private PromotedStation u;
    private p.dk.a v;
    private OnListItemEntranceListener w;

    public ar()
    {
        p = new aa(com.pandora.radio.util.k.j.a);
        w = new OnListItemEntranceListener() {

            final ar a;

            public void a(AbsListView abslistview)
            {
            }

            public void a(AbsListView abslistview, long l1, int i)
            {
                abslistview = (StationRecommendation)((a)a.b()).getItem(i);
                if (abslistview instanceof PromotedStation)
                {
                    abslistview = (PromotedStation)abslistview;
                    abslistview.a();
                    com.pandora.android.provider.b.a.b().o().a(com.pandora.radio.util.k.i.a, abslistview.n(), "station", null);
                    p.df.a.a("StationRecommendationsFragment", "Track promoted station impressions.");
                }
            }

            public void a(AbsListView abslistview, long l1, int i, int i1)
            {
            }

            public void b(AbsListView abslistview, long l1, int i)
            {
            }

            
            {
                a = ar.this;
                super();
            }
        };
        v = com.pandora.android.provider.b.a.b().H();
    }

    static PromotedStation a(ar ar1, PromotedStation promotedstation)
    {
        ar1.u = promotedstation;
        return promotedstation;
    }

    static StationRecommendation a(ar ar1, StationRecommendation stationrecommendation)
    {
        ar1.q = stationrecommendation;
        return stationrecommendation;
    }

    static af a(ar ar1, af af1)
    {
        ar1.o = af1;
        return af1;
    }

    public static ar a(StationRecommendations stationrecommendations, com.pandora.radio.util.j j1)
    {
        ar ar1 = new ar();
        ar1.setArguments(b(stationrecommendations, j1));
        return ar1;
    }

    private void a(StationRecommendation stationrecommendation)
    {
        if (stationrecommendation instanceof PromotedStation)
        {
            PromotedStation promotedstation = (PromotedStation)stationrecommendation;
            PandoraIntent pandoraintent = new PandoraIntent("cmd_create_station");
            pandoraintent.putExtra("intent_music_token", stationrecommendation.n());
            pandoraintent.putExtra("intent_allow_video_ad_opportunity", false);
            pandoraintent.putExtra("intent_promoted_station_campaign_id", promotedstation.c());
            pandoraintent.putExtra("intent_station_creation_source", p.cx.x.e.f.ordinal());
            pandoraintent.putExtra("intent_ad_server_correlation_id", promotedstation.h());
            promotedstation.a(com.pandora.android.provider.b.a.b());
            com.pandora.android.provider.b.a.b().o().b(promotedstation.c());
            com.pandora.android.provider.b.a.C().a(pandoraintent);
        } else
        {
            p.b(stationrecommendation);
            com.pandora.android.util.s.j();
            k.a(stationrecommendation.b(), stationrecommendation.n(), com.pandora.android.provider.b.a.b(), p.cx.x.e.b, null);
        }
        i.f();
    }

    private static void a(y y1)
    {
        y1 = y1.c();
        com.pandora.android.provider.b.a.C().a((new PandoraIntent("show_page")).putExtra("intent_page_name", p.e).putExtra("intent_station_token", y1).putExtra("intent_show_force_screen", true));
    }

    static void a(ar ar1)
    {
        ar1.k();
    }

    static void a(ar ar1, boolean flag)
    {
        ar1.c(flag);
    }

    private static boolean a(ArrayList arraylist, com.pandora.radio.data.StationRecommendations.a a1, StationRecommendation stationrecommendation)
    {
        boolean flag = false;
        if (a1.b() > 0)
        {
            arraylist.add(stationrecommendation);
            for (a1 = a1.iterator(); a1.hasNext(); arraylist.add((StationRecommendation)a1.next())) { }
            flag = true;
        }
        return flag;
    }

    private StationRecommendation[] a(StationRecommendations stationrecommendations)
    {
        ArrayList arraylist = new ArrayList();
        if (stationrecommendations == null || stationrecommendations.e()) goto _L2; else goto _L1
_L1:
        com.pandora.radio.data.StationRecommendations.a a1;
        a1 = stationrecommendations.c();
        stationrecommendations = stationrecommendations.d();
        if (!r) goto _L4; else goto _L3
_L3:
        if (u != null && h())
        {
            arraylist.add(u);
        }
        if (a(arraylist, ((com.pandora.radio.data.StationRecommendations.a) (stationrecommendations)), m))
        {
            arraylist.add(n);
        }
        a(arraylist, a1, l);
_L2:
        return (StationRecommendation[])arraylist.toArray(new StationRecommendation[arraylist.size()]);
_L4:
        a(arraylist, a1, l);
        if (a(arraylist, ((com.pandora.radio.data.StationRecommendations.a) (stationrecommendations)), m))
        {
            arraylist.add(n);
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    static StationRecommendation[] a(ar ar1, StationRecommendations stationrecommendations)
    {
        return ar1.a(stationrecommendations);
    }

    protected static Bundle b(StationRecommendations stationrecommendations, com.pandora.radio.util.j j1)
    {
        Bundle bundle = new Bundle(2);
        bundle.putParcelable("station_recommendation_arg", stationrecommendations);
        bundle.putSerializable("intent_search_result_consumer", j1);
        return bundle;
    }

    private void b(StationRecommendation stationrecommendation)
    {
        if (stationrecommendation instanceof PromotedStation)
        {
            v.a();
            u = null;
            l();
            return;
        } else
        {
            com.pandora.android.util.s.j();
            p.c(stationrecommendation);
            j.a(stationrecommendation, r);
            k();
            (new h()).execute(new Object[] {
                com.pandora.android.provider.b.a.b(), j, stationrecommendation
            });
            return;
        }
    }

    static void b(ar ar1)
    {
        ar1.l();
    }

    private void c(boolean flag)
    {
        TextView textview = s;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    static StationRecommendation e()
    {
        return n;
    }

    static StationRecommendation f()
    {
        return l;
    }

    static StationRecommendation g()
    {
        return m;
    }

    private boolean h()
    {
        aj aj1 = com.pandora.android.provider.b.a.b().k().J();
        return o != null && o.q() && (com.pandora.android.util.s.u() || aj1 == null || !aj1.g());
    }

    private void j()
    {
        if (u != null && u.f())
        {
            v.a(p.dk.a.a.b);
        }
    }

    private void k()
    {
        p.a(com.pandora.android.provider.b.a.b());
        p.a(a(j));
        l();
    }

    private void l()
    {
        if (getView() == null)
        {
            return;
        } else
        {
            a(new a(getActivity(), j, p));
            w.a(m_());
            return;
        }
    }

    public void a(ListView listview, View view, int i, long l1)
    {
        listview = (StationRecommendation)((a)b()).getItem(i);
        if (listview == n)
        {
            a(k);
            return;
        } else
        {
            a(((StationRecommendation) (listview)));
            return;
        }
    }

    protected void a(com.pandora.radio.util.j j1)
    {
        i.a(p.ca.t.a(j1));
    }

    public void b(boolean flag)
    {
        if (!flag)
        {
            j();
        }
        super.b(flag);
    }

    public boolean c()
    {
        j();
        return super.c();
    }

    public CharSequence d()
    {
        return getString(0x7f080221);
    }

    public void onActivityCreated(Bundle bundle)
    {
        super.onActivityCreated(bundle);
        bundle = m_();
        bundle.setOnItemLongClickListener(this);
        bundle.setOnScrollListener(w);
        a(new a(getActivity(), j, p));
        a(true);
    }

    public void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
        bundle = getArguments();
        j = (StationRecommendations)bundle.getParcelable("station_recommendation_arg");
        k = (com.pandora.radio.util.j)bundle.getSerializable("intent_search_result_consumer");
        boolean flag;
        if (com.pandora.android.provider.b.a.b().a(p.dj.b.a.e) || com.pandora.android.provider.b.a.b().a(p.dj.b.a.f))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        r = flag;
    }

    public View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        layoutinflater = super.onCreateView(layoutinflater, viewgroup, bundle);
        s = (TextView)layoutinflater.findViewById(0xff0001);
        s.setText(0x7f0801eb);
        s.setTextSize(0, getResources().getDimension(0x7f0900fd));
        s.setTextColor(getResources().getColor(0x7f0b0053));
        t = new b();
        return layoutinflater;
    }

    public void onDestroyView()
    {
        super.onDestroyView();
        t.a();
        t = null;
    }

    public boolean onItemLongClick(AdapterView adapterview, View view, int i, long l1)
    {
        adapterview = (a)b();
        StationRecommendation stationrecommendation = (StationRecommendation)adapterview.getItem(i);
        if (stationrecommendation != null && stationrecommendation != n)
        {
            adapterview.a(view, stationrecommendation);
        }
        return true;
    }

    public boolean onMenuItemClick(MenuItem menuitem)
    {
        y y1;
        if (q instanceof PromotedStation)
        {
            y1 = ((PromotedStation)q).e();
        } else
        {
            y1 = null;
        }
        menuitem.getItemId();
        JVM INSTR lookupswitch 3: default 60
    //                   2131755033: 62
    //                   2131755806: 76
    //                   2131755809: 83;
           goto _L1 _L2 _L3 _L4
_L1:
        return false;
_L2:
        com.pandora.android.activity.a.a(getActivity(), 1, y1, null, null);
        continue; /* Loop/switch isn't completed */
_L3:
        a(y1);
        continue; /* Loop/switch isn't completed */
_L4:
        b(q);
        if (true) goto _L1; else goto _L5
_L5:
    }

    public void onPause()
    {
        super.onPause();
        if (((PowerManager)getActivity().getSystemService("power")).isScreenOn())
        {
            j();
        }
    }

    public void onStart()
    {
        super.onStart();
        if (j == null || j.e())
        {
            c(true);
            return;
        } else
        {
            c(false);
            p.df.a.a("StationRecommendationsFragment", "Adding in onStart()");
            p.a(a(j));
            return;
        }
    }

    public void onStop()
    {
        super.onStop();
        p.df.a.a("StationRecommendationsFragment", "Flushing stats due to onStop()");
        p.a(com.pandora.android.provider.b.a.b());
    }

    public com.pandora.android.util.af.c v()
    {
        return com.pandora.android.util.af.c.R;
    }

}
