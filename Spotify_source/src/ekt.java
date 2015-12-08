// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.devsmart.android.ui.HorizontalListView;
import com.google.common.collect.ImmutableList;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.CardView;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.porcelain.PorcelainAdapter;
import com.spotify.mobile.android.porcelain.json.item.PorcelainJsonItem;
import com.spotify.mobile.android.porcelain.metrics.PorcelainMetricsLogger;
import com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.Playable;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.spotlets.browse.view.CoverCardHorizontal;
import com.spotify.mobile.android.spotlets.tinkerbell.Onboarding;
import com.spotify.mobile.android.spotlets.tinkerbell.TooltipContainer;
import com.spotify.mobile.android.ui.NavigationItem;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class ekt extends Fragment
    implements NavigationItem, eda, fxy, fyx
{

    private PorcelainJsonItem Y;
    private ViewGroup Z;
    private PorcelainAdapter a;
    private final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver aA = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

        private PlayerTrack a;
        private ekt b;

        public final void onPlayerStateReceived(PlayerState playerstate)
        {
            Object obj = playerstate.track();
            if (!PlayerTrackUtil.areUidsEqual(((PlayerTrack) (obj)), a))
            {
                a = ((PlayerTrack) (obj));
                if (obj != null)
                {
                    obj = ((PlayerTrack) (obj)).uri();
                } else
                {
                    obj = "";
                }
                if (ekt.a(b) != null)
                {
                    ekt.a(b).a(playerstate.entityUri(), ((String) (obj)));
                    return;
                }
            }
        }

            
            {
                b = ekt.this;
                super();
            }
    };
    private final eqn aB = new eqn() {

        private ekt a;

        public final void a(Object obj)
        {
            ekt.a(a, null);
            ekt.f(a);
        }

        public final void b(Object obj)
        {
            obj = (PorcelainJsonItem)obj;
            ekt.a(a, ((PorcelainJsonItem) (obj)));
            ekt.f(a);
        }

            
            {
                a = ekt.this;
                super();
            }
    };
    private final elb aC = new elb() {

        private ekt a;

        public final void a(List list, Map map, int l, boolean flag, RequestType requesttype)
        {
            Assertion.a(RequestType.b, requesttype);
            if (!ekt.g(a).d())
            {
                ekt.g(a).b();
            }
            if (!a.o())
            {
                return;
            }
            if (list != null)
            {
                elw.a(a.k().getResources(), list);
            }
            ekt.f(a);
        }

            
            {
                a = ekt.this;
                super();
            }
    };
    private final elb aD = new elb() {

        private ekt a;

        public final void a(List list, Map map, int l, boolean flag, RequestType requesttype)
        {
            Assertion.a(RequestType.a, requesttype);
            if (!ekt.g(a).d())
            {
                ekt.g(a).b();
            }
            if (a.o())
            {
                ekt.a(a).a.clear();
                if (list != null)
                {
                    requesttype = ekt.a(a);
                    ((ekx) (requesttype)).a.addAll(list);
                    requesttype.a(((ekx) (requesttype)).b.a(), ((ekx) (requesttype)).b.b());
                }
                ekt.a(a).notifyDataSetChanged();
                if (map != null)
                {
                    ekt.a(a, (String)map.get("label"));
                    if (!TextUtils.isEmpty(ekt.h(a)))
                    {
                        ekt.i(a).setText(ekt.h(a));
                    }
                }
                if (list != null && !list.isEmpty())
                {
                    ekt.k(a).a(ekt.j(a), ((Playlist)list.get(0)).a());
                    return;
                }
            }
        }

            
            {
                a = ekt.this;
                super();
            }
    };
    private final dpx aE = new dpx() {

        private ekt b;

        public final void a(PorcelainNavigationLink porcelainnavigationlink, int l, int i1)
        {
            final class _cls4
            {

                static final int a[];

                static 
                {
                    a = new int[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.values().length];
                    try
                    {
                        a[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.b.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.c.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[com.spotify.mobile.android.porcelain.subitem.PorcelainNavigationLink.Type.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            switch (_cls4.a[porcelainnavigationlink.getType().ordinal()])
            {
            default:
                return;

            case 1: // '\001'
                ekt.d(b).a(b.j(), l, porcelainnavigationlink.getUri(), porcelainnavigationlink.getTargetTitle());
                return;

            case 2: // '\002'
                ekt ekt1 = b;
                gms gms1 = gms.a(b.j(), porcelainnavigationlink.getUri());
                porcelainnavigationlink = porcelainnavigationlink.getTargetTitle();
                if (porcelainnavigationlink == null)
                {
                    porcelainnavigationlink = "";
                }
                ekt1.a(gms1.a((String)porcelainnavigationlink).a);
                return;

            case 3: // '\003'
                b.a(new Intent("android.intent.action.VIEW", Uri.parse(porcelainnavigationlink.getUri())));
                return;
            }
        }

        public final void a(drz drz, int l)
        {
        }

            
            {
                b = ekt.this;
                super();
            }
    };
    private ggl aa;
    private View ab;
    private ImageView ac;
    private dpt ad;
    private String ae;
    private gjf af;
    private RecyclerView ag;
    private ekx ah;
    private String ai;
    private TextView aj;
    private HorizontalListView ak;
    private ViewGroup al;
    private final elr am;
    private final elp an;
    private final elo ao;
    private fjm ap;
    private eld aq;
    private elc ar;
    private Flags as;
    private gji at;
    private Player au;
    private Resolver av;
    private eou aw;
    private PorcelainMetricsLogger ax;
    private boolean ay;
    private final ekv az = new ekv();
    private List b;

    public ekt()
    {
        am = new elr(new elq(com.spotify.mobile.android.util.ClientEvent.SubEvent.M, ViewUri.r, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.i));
        an = new elp(new elq(com.spotify.mobile.android.util.ClientEvent.SubEvent.I, ViewUri.r, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.i));
        ao = new elo(new elq(com.spotify.mobile.android.util.ClientEvent.SubEvent.I, ViewUri.r, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.i));
        ap = (fjm)dmz.a(fjm);
    }

    private void J()
    {
        b = elw.a(k().getResources());
        cuq cuq1 = ImmutableList.h();
        if (Y != null)
        {
            cuq1.c(Y);
        }
        cuq1.b(cuv.a(b, (ctv)ely.a.b()));
        ad.a(dpa.a("genres", cuq1.a()));
        a.c();
    }

    static PorcelainJsonItem a(ekt ekt1, PorcelainJsonItem porcelainjsonitem)
    {
        ekt1.Y = porcelainjsonitem;
        return porcelainjsonitem;
    }

    private dhu a(String s, int l, android.view.View.OnClickListener onclicklistener)
    {
        Object obj = k().obtainStyledAttributes(new int[] {
            0x7f010108
        });
        android.graphics.drawable.Drawable drawable = ((TypedArray) (obj)).getDrawable(0);
        ((TypedArray) (obj)).recycle();
        obj = dhv.c(k(), null);
        ((dhu) (obj)).e(true);
        View view = ((dhu) (obj)).v();
        dgo.a(view, drawable);
        view.setOnClickListener(onclicklistener);
        onclicklistener = (dhx)((dhu) (obj)).u();
        onclicklistener.a(s);
        if (l != 0)
        {
            onclicklistener.d().setImageResource(l);
        }
        return ((dhu) (obj));
    }

    public static ekt a(String s, String s1, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putString("country", s1);
        s = new ekt();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static ekx a(ekt ekt1)
    {
        return ekt1.ah;
    }

    static String a(ekt ekt1, String s)
    {
        ekt1.ai = s;
        return s;
    }

    static fjm b(ekt ekt1)
    {
        return ekt1.ap;
    }

    static elr c(ekt ekt1)
    {
        return ekt1.am;
    }

    static elp d(ekt ekt1)
    {
        return ekt1.an;
    }

    static elo e(ekt ekt1)
    {
        return ekt1.ao;
    }

    static void f(ekt ekt1)
    {
        ekt1.J();
    }

    static gjf g(ekt ekt1)
    {
        return ekt1.af;
    }

    static String h(ekt ekt1)
    {
        return ekt1.ai;
    }

    static TextView i(ekt ekt1)
    {
        return ekt1.aj;
    }

    static ImageView j(ekt ekt1)
    {
        return ekt1.ac;
    }

    static gji k(ekt ekt1)
    {
        return ekt1.at;
    }

    public final void A()
    {
        edb.a(k()).b(this);
        super.A();
        aa.b();
    }

    public final com.spotify.mobile.android.ui.NavigationItem.NavigationGroup A_()
    {
        return com.spotify.mobile.android.ui.NavigationItem.NavigationGroup.d;
    }

    public final void B()
    {
        super.B();
        aq.b();
        ar.b();
        av.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "browse";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        as = fyw.a(this);
        a(true);
        ah = new ekx(az, FeatureIdentifier.c, gnl.a(this));
        Z = (ViewGroup)layoutinflater.inflate(0x7f03007c, viewgroup, false);
        layoutinflater = (LinearLayout)layoutinflater.inflate(0x7f03007a, null);
        viewgroup = (RelativeLayout)layoutinflater.findViewById(0x7f1102f1);
        ac = (ImageView)layoutinflater.findViewById(0x7f1102f2);
        bundle = new LinearLayout(k());
        bundle.setOrientation(1);
        viewgroup.addView(bundle);
        viewgroup = k();
        Object obj = viewgroup.getString(0x7f080156);
        TextView textview = (TextView)LayoutInflater.from(k()).inflate(0x7f03007b, bundle, false);
        textview.setText(((CharSequence) (obj)));
        bundle.addView(textview);
        aj = textview;
        aj.setId(0x7f11001e);
        int l = ((gcz)dmz.a(gcz)).b();
        int i1 = dft.b(56F, l());
        l = CardView.a(l, 3, l().getDimensionPixelSize(0x7f0c0132), i1, l().getDimensionPixelOffset(0x7f0c0133));
        obj = new HorizontalListView(k(), null);
        ((HorizontalListView) (obj)).setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, l));
        ak = ((HorizontalListView) (obj));
        ak.setId(0x7f11001d);
        ak.a(ah);
        bundle.addView(ak);
        ak.setOnItemClickListener(new android.widget.AdapterView.OnItemClickListener() {

            private ekt a;

            public final void onItemClick(AdapterView adapterview, View view, int j1, long l1)
            {
                if (a.k() == null)
                {
                    return;
                }
                view = ((CoverCardHorizontal)view).a;
                adapterview = ((Playlist) (view)).b;
                view = ((Playable) (view)).c;
                if (j1 == 0)
                {
                    ekt.b(a);
                    fjm.a(TooltipContainer.a(a.k()));
                }
                u u1 = a.k();
                gip gip1 = Onboarding.a;
                String s = gip1.a;
                AsyncTask.execute(new fjl._cls2(u1, gip1));
                ekt.c(a).a(a.k(), j1, "featured", adapterview, view);
            }

            
            {
                a = ekt.this;
                super();
            }
        });
        bundle = new SectionHeaderView(k());
        bundle.a("");
        bundle.c().setTextSize(0.0F);
        layoutinflater.addView(bundle);
        bundle = a(viewgroup.getString(0x7f08016d), 0x7f020197, new android.view.View.OnClickListener() {

            private ekt a;

            public final void onClick(View view)
            {
                view = gms.a(a.k(), "spotify:charts:root").a;
                a.a(view);
            }

            
            {
                a = ekt.this;
                super();
            }
        });
        bundle.v().setId(0x7f110019);
        layoutinflater.addView(bundle.v());
        bundle = viewgroup.getString(0x7f080158);
        bundle = a(((String) (bundle)), 0x7f020195, new android.view.View.OnClickListener(viewgroup, bundle) {

            private Activity a;
            private String b;
            private ekt c;

            public final void onClick(View view)
            {
                ekt.d(c).a(a, -1, "new_releases", b);
            }

            
            {
                c = ekt.this;
                a = activity;
                b = s;
                super();
            }
        });
        bundle.v().setId(0x7f110020);
        layoutinflater.addView(bundle.v());
        if (((Integer)as.a(fys.i)).intValue() == 1)
        {
            bundle = viewgroup.getString(0x7f080157);
            bundle = a(((String) (bundle)), 0x7f0201aa, new android.view.View.OnClickListener(viewgroup, bundle) {

                private Activity a;
                private String b;
                private ekt c;

                public final void onClick(View view)
                {
                    ekt.d(c).a(a, -1, "highlights", b);
                }

            
            {
                c = ekt.this;
                a = activity;
                b = s;
                super();
            }
            });
            bundle.v().setId(0x7f11001f);
            layoutinflater.addView(bundle.v());
        } else
        {
            bundle = viewgroup.getString(0x7f080288);
            bundle = a(((String) (bundle)), 0x7f020196, new android.view.View.OnClickListener(viewgroup, bundle) {

                private Activity a;
                private String b;
                private ekt c;

                public final void onClick(View view)
                {
                    view = ekt.e(c);
                    Activity activity = a;
                    String s = b;
                    Intent intent = gms.a(activity, "spotify:internal:discover").a(s).a;
                    intent.putExtra("referer", ViewUri.n);
                    activity.startActivity(intent);
                    ((elo) (view)).a.a(activity, -1, s, "spotify:internal:discover", null);
                }

            
            {
                c = ekt.this;
                a = activity;
                b = s;
                super();
            }
            });
            bundle.v().setId(0x7f11001c);
            layoutinflater.addView(bundle.v());
        }
        if ("Enabled".equals(as.a(fys.aF)))
        {
            viewgroup = a(viewgroup.getString(0x7f0802c5), 0, new android.view.View.OnClickListener() {

                private ekt a;

                public final void onClick(View view)
                {
                    view = gms.a(a.k(), ers.a).a;
                    a.a(view);
                }

            
            {
                a = ekt.this;
                super();
            }
            });
            bundle = new dfz(k(), SpotifyIcon.aq);
            bundle.setColorFilter(dgo.b(k(), 0x7f0101ca), android.graphics.PorterDuff.Mode.MULTIPLY);
            ((dhx)viewgroup.u()).d().setImageDrawable(bundle);
            viewgroup.v().setId(0x7f11001b);
            layoutinflater.addView(viewgroup.v());
        }
        viewgroup = new SectionHeaderView(k());
        viewgroup.a(k().getString(0x7f080153).toUpperCase(Locale.getDefault()));
        viewgroup.b(false);
        layoutinflater.addView(viewgroup);
        al = layoutinflater;
        ad = new dpt(ImmutableList.a(drc.a("browse-header", al)), ImmutableList.d());
        ag = (RecyclerView)Z.findViewById(0x102000a);
        ag.a(new dos(k()));
        layoutinflater = PorcelainAdapter.e();
        layoutinflater.c = aE;
        viewgroup = dqe.a(k());
        viewgroup.a = (com.spotify.mobile.android.porcelain.delegates.PorcelainRenderDelegate.PorcelainImageDelegate)ctz.a(new eks(k()));
        layoutinflater.b = viewgroup.a();
        a = layoutinflater.a(k());
        ag.a(a);
        ag.a(null);
        a.a(ad);
        return Z;
    }

    public final Flags a()
    {
        return as;
    }

    public final String a(Context context, Flags flags)
    {
        if (ae != null)
        {
            return ae;
        } else
        {
            return context.getString(0x7f080159);
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        u u1 = k();
        ae = g().getString("title");
        String s = g().getString("country");
        b = elw.a(l());
        af = gjf.a(u1, "spotify:app:browse");
        af.c(bundle);
        af.a();
        aa = ggn.a(u1, ViewUri.r);
        aq = new eld(u1, aC, s, l(), this);
        av = Cosmos.getResolver(u1);
        aw = eou.a(com/spotify/mobile/android/porcelain/json/item/PorcelainJsonItem, av, new Handler());
        ax = new dro(u1, new gjo(ViewUri.r));
        ar = new elc(u1, aD, s, this);
        dmz.a(gjj);
        at = gjj.a(u1);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        ab = els.a(Z);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            aC.a(bundle.getParcelableArrayList("genres"), null, 0, false, RequestType.b);
            ai = bundle.getString("featuredPlaylistsLabel");
            if (!TextUtils.isEmpty(ai))
            {
                aj.setText(ai);
            }
            ay = bundle.getBoolean("impressionLogged", false);
            Y = (PorcelainJsonItem)bundle.getParcelable("promoItem");
            ag.d().a(bundle.getParcelable("layoutState"));
        }
        J();
        ((fpe)k()).a(this, a(((Context) (k())), as));
        ((fpe)k()).P_();
        if (!ay)
        {
            ax.a();
            ay = true;
        }
    }

    public final void a(SessionState sessionstate)
    {
        if (sessionstate.j)
        {
            ab.setVisibility(8);
            ag.setVisibility(0);
            if (as != null)
            {
                ar.a(0, 12);
                aq.a(0, 100);
                sessionstate = eta.a(l(), "hm://hubview/android/v1/music/promotion-link", as);
                if (((Boolean)as.a(fys.M)).booleanValue())
                {
                    aw.a(RequestBuilder.get(sessionstate).build(), 5000L).a(aB);
                }
            }
            return;
        } else
        {
            ab.setVisibility(0);
            ag.setVisibility(8);
            return;
        }
    }

    public final void c()
    {
        super.c();
        av.connect();
        FeatureIdentifier featureidentifier = gnl.a(g());
        au = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(av, ViewUri.r.toString(), FeatureIdentifier.c, featureidentifier);
        au.registerPlayerStateObserver(aA);
        au.registerPlayerStateObserver(az);
    }

    public final void d()
    {
        super.d();
        au.unregisterPlayerStateObserver(aA);
        au.unregisterPlayerStateObserver(az);
        af.c();
        ((elg) (aq)).a.a();
        ((elg) (ar)).a.a();
        aw.a();
        av.disconnect();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        ArrayList arraylist;
        if (b instanceof ArrayList)
        {
            arraylist = (ArrayList)b;
        } else
        {
            arraylist = new ArrayList(b);
        }
        bundle.putParcelableArrayList("genres", arraylist);
        bundle.putParcelable("layoutState", ag.d().e());
        bundle.putString("featuredPlaylistsLabel", ai);
        bundle.putParcelable("promoItem", Y);
        bundle.putBoolean("impressionLogged", ay);
        af.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.c;
    }

    public final void z()
    {
        super.z();
        edb.a(k()).a(this);
        aa.a();
    }
}
