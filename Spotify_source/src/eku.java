// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.browse.datasource.RequestType;
import com.spotify.mobile.android.spotlets.browse.model.Playable;
import com.spotify.mobile.android.spotlets.browse.model.Playlist;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public final class eku extends al
    implements android.widget.AbsListView.OnScrollListener, fxy, fyx, gck
{

    private View Y;
    private View Z;
    private ViewGroup aa;
    private ListView ab;
    private ViewGroup ac;
    private ImageView ad;
    private ImageView ae;
    private TextView af;
    private TextView ag;
    private View ah;
    private LoadingView ai;
    private String aj;
    private gcj ak;
    private ggl al;
    private boolean am;
    private boolean an;
    private gjf ao;
    private ele ap;
    private elf aq;
    private final elr ar;
    private Flags as;
    private ekv at;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver au;
    private DeferredResolver av;
    private Player aw;
    private elb ax;
    private elb ay;
    private eky b;

    public eku()
    {
        ar = new elr(new elq(com.spotify.mobile.android.util.ClientEvent.SubEvent.I, ViewUri.s, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.h));
        at = new ekv();
        au = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private eku a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                Object obj = playerstate.track();
                if (obj != null)
                {
                    obj = ((PlayerTrack) (obj)).uri();
                } else
                {
                    obj = "";
                }
                eku.a(a).a(playerstate.entityUri(), ((String) (obj)));
            }

            
            {
                a = eku.this;
                super();
            }
        };
        ax = new elb() {

            private eku a;

            public final void a(List list, Map map, int i1, boolean flag, RequestType requesttype)
            {
                eku.b(a);
                eku.c(a).setVisibility(0);
                eku.d(a).b();
                break MISSING_BLOCK_LABEL_29;
                if (a.o() && i1 >= eku.a(a).a())
                {
                    eku.a(a, flag);
                    if (!eku.e(a).d())
                    {
                        eku.e(a).b();
                    }
                    eku.f(a).setVisibility(8);
                    if (list != null)
                    {
                        map = eku.a(a);
                        ((eky) (map)).a.addAll(list);
                        map.a(((eky) (map)).b.a(), ((eky) (map)).b.b());
                        eku.a(a).notifyDataSetChanged();
                        return;
                    }
                }
                return;
            }

            
            {
                a = eku.this;
                super();
            }
        };
        ay = new elb() {

            final eku a;

            public final void a(List list, Map map, int i1, boolean flag, RequestType requesttype)
            {
                if (!a.o())
                {
                    return;
                }
                if (list != null && !list.isEmpty())
                {
                    list = (Playlist)list.get(0);
                    map = new android.view.View.OnClickListener(this, list) {

                        private Playlist a;
                        private _cls3 b;

                        public final void onClick(View view)
                        {
                            if (b.a.o())
                            {
                                eku.h(b.a).a(b.a.k(), -1, "overview", b.a.a(b.a.k(), eku.g(b.a)), ((Playable) (a)).c);
                            }
                        }

            
            {
                b = _pcls3;
                a = playlist;
                super();
            }
                    };
                    requesttype = new android.view.View.OnTouchListener(this) {

                        private _cls3 a;

                        public final boolean onTouch(View view, MotionEvent motionevent)
                        {
                            switch (motionevent.getAction())
                            {
                            default:
                                eku.i(a.a).setVisibility(8);
                                return false;

                            case 0: // '\0'
                                eku.i(a.a).setVisibility(0);
                                return false;

                            case 2: // '\002'
                                eku.i(a.a).setVisibility(0);
                                return false;

                            case 1: // '\001'
                                eku.i(a.a).setVisibility(8);
                                return false;
                            }
                        }

            
            {
                a = _pcls3;
                super();
            }
                    };
                    gwb gwb1 = ((gft)dmz.a(gft)).a().a(list.a());
                    gwb1.a(eku.j(a), null);
                    eku.j(a).setOnClickListener(map);
                    eku.j(a).setOnTouchListener(requesttype);
                    gwb1.a(dgf.a);
                    gwb1.a(eku.k(a), null);
                    eku.l(a).setText(((Playlist) (list)).b);
                    eku.l(a).setOnClickListener(map);
                    eku.l(a).setOnTouchListener(requesttype);
                    eku.m(a).setText(((Playlist) (list)).e);
                    eku.m(a).setOnClickListener(map);
                    eku.m(a).setOnTouchListener(requesttype);
                    return;
                } else
                {
                    eku.n(a).setVisibility(8);
                    return;
                }
            }

            
            {
                a = eku.this;
                super();
            }
        };
    }

    private void H()
    {
        if (as == null)
        {
            return;
        } else
        {
            aq.a(0, 10);
            J();
            return;
        }
    }

    private void J()
    {
        if (as == null)
        {
            return;
        }
        this;
        JVM INSTR monitorenter ;
        int i1 = b.a();
        if (i1 <= 0 || i1 >= 10)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        this;
        JVM INSTR monitorexit ;
        throw exception;
        if (!am)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        am = true;
        this;
        JVM INSTR monitorexit ;
        if (b.a() != 0)
        {
            Z.setVisibility(0);
        }
        ap.a(b.a() / 10, 10);
        return;
    }

    public static eku a(String s, String s1, Flags flags)
    {
        Bundle bundle = new Bundle();
        bundle.putString("title", s);
        bundle.putString("country", s1);
        s = new eku();
        s.f(bundle);
        fyw.a(s, flags);
        return s;
    }

    static eky a(eku eku1)
    {
        return eku1.b;
    }

    static boolean a(eku eku1, boolean flag)
    {
        eku1.an = flag;
        return flag;
    }

    static boolean b(eku eku1)
    {
        eku1.am = false;
        return false;
    }

    static ListView c(eku eku1)
    {
        return eku1.ab;
    }

    static LoadingView d(eku eku1)
    {
        return eku1.ai;
    }

    static gjf e(eku eku1)
    {
        return eku1.ao;
    }

    static View f(eku eku1)
    {
        return eku1.Z;
    }

    static Flags g(eku eku1)
    {
        return eku1.as;
    }

    static elr h(eku eku1)
    {
        return eku1.ar;
    }

    static View i(eku eku1)
    {
        return eku1.ah;
    }

    static ImageView j(eku eku1)
    {
        return eku1.ae;
    }

    static ImageView k(eku eku1)
    {
        return eku1.ad;
    }

    static TextView l(eku eku1)
    {
        return eku1.af;
    }

    static TextView m(eku eku1)
    {
        return eku1.ag;
    }

    static ViewGroup n(eku eku1)
    {
        return eku1.ac;
    }

    public final void A()
    {
        super.A();
        al.b();
    }

    public final void B()
    {
        super.B();
        av.destroy();
        ap.b();
        aq.b();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "browse:new_releases";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        as = fyw.a(this);
        aa = (ViewGroup)layoutinflater.inflate(0x7f030078, viewgroup, false);
        ai = LoadingView.a(LayoutInflater.from(k()));
        aa.addView(ai);
        ai.a();
        ab = (ListView)aa.findViewById(0x102000a);
        ab.setVisibility(8);
        viewgroup = ab;
        ac = (RelativeLayout)layoutinflater.inflate(0x7f03003f, null);
        ad = (ImageView)ac.findViewById(0x7f1102f2);
        ae = (ImageView)ac.findViewById(0x7f11026a);
        af = (TextView)ac.findViewById(0x7f11026e);
        ag = (TextView)ac.findViewById(0x7f1102ef);
        ah = ac.findViewById(0x7f1102f4);
        viewgroup.addHeaderView(ac);
        return aa;
    }

    public final Flags a()
    {
        return as;
    }

    public final String a(Context context, Flags flags)
    {
        if (aj != null)
        {
            return aj;
        } else
        {
            return context.getString(0x7f080158);
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aj = g().getString("title");
        ak = new gcj(k(), this);
        av = Cosmos.getResolver(k());
        ao = gjf.a(k(), "spotify:app:browse:new_releases");
        ao.c(bundle);
        ao.a();
        al = ggn.a(k(), ViewUri.s);
        b = new eky(k().getResources().getInteger(0x7f0e0001), at, FeatureIdentifier.d, gnl.a(this));
        bundle = g().getString("country");
        ap = new ele(k(), ax, bundle, this);
        aq = new elf(k(), ay, bundle, "new-releases-header", "new-releases-header", this);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        Z = LayoutInflater.from(k()).inflate(0x7f030071, null);
        view = z_();
        view.setOnScrollListener(this);
        View view1 = new View(k());
        view1.setLayoutParams(new android.widget.AbsListView.LayoutParams(0, l().getDimensionPixelSize(0x7f0c008c)));
        view.addHeaderView(view1);
        Y = els.a(aa);
        view.addFooterView(Z);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            view = bundle.getParcelableArrayList("new_releases");
            ax.a(view, null, view.size(), false, RequestType.e);
            view = bundle.getParcelable("list");
            if (view != null)
            {
                z_().onRestoreInstanceState(view);
            }
        } else
        {
            H();
        }
        u().a(0x7f110066, null, ak);
        a(((android.widget.ListAdapter) (b)));
    }

    public final void c()
    {
        super.c();
        FeatureIdentifier featureidentifier = gnl.a(g());
        aw = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(av, ViewUri.s.toString(), FeatureIdentifier.d, featureidentifier);
        aw.registerPlayerStateObserver(at);
        aw.registerPlayerStateObserver(au);
    }

    public final void d()
    {
        super.d();
        ao.c();
        ((elg) (ap)).a.a();
        ((elg) (aq)).a.a();
        aw.unregisterPlayerStateObserver(at);
        aw.unregisterPlayerStateObserver(au);
        av.disconnect();
    }

    public final void d(boolean flag)
    {
        if (flag)
        {
            Y.setVisibility(8);
            z_().setVisibility(0);
            H();
            return;
        } else
        {
            Y.setVisibility(0);
            z_().setVisibility(8);
            return;
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        ArrayList arraylist = new ArrayList();
        for (int i1 = 0; i1 < b.a(); i1++)
        {
            arraylist.add(b.a(i1));
        }

        bundle.putParcelableArrayList("new_releases", arraylist);
        bundle.putParcelable("list", z_().onSaveInstanceState());
        ao.a(bundle);
    }

    public final void onScroll(AbsListView abslistview, int i1, int j1, int k1)
    {
        if (i1 + j1 >= (k1 - 5) + 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0 && !an)
        {
            J();
        }
    }

    public final void onScrollStateChanged(AbsListView abslistview, int i1)
    {
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.d;
    }

    public final void z()
    {
        super.z();
        al.a();
    }
}
