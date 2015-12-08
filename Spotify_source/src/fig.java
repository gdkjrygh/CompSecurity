// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.common.collect.Maps;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.HeaderView;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.util.CollectionState;
import com.spotify.mobile.android.spotlets.show.adapter.EpisodeAdapter;
import com.spotify.mobile.android.spotlets.show.model.Covers;
import com.spotify.mobile.android.spotlets.show.model.Show;
import com.spotify.mobile.android.spotlets.videoplayer.FullScreenSwitchHelper;
import com.spotify.mobile.android.ui.ActionBarManager;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class fig extends Fragment
    implements fxy
{

    private final List Y = new ArrayList();
    private final List Z = new ArrayList();
    final epg a = new epg() {

        private fig a;

        public final void a(Object obj)
        {
            fir fir1;
label0:
            {
                fir1 = (fir)obj;
                a.o();
                if (a.o())
                {
                    boolean flag;
                    if (((fio[])fir1.getItems()).length == 0)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    fir1.isLoading();
                    if (!fir1.isLoading() || !flag)
                    {
                        if (fig.v(a) != com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c || fiy.c(fig.w(a)))
                        {
                            break label0;
                        }
                        fig.x(a).b(new int[] {
                            3
                        });
                        if (fig.y(a).d())
                        {
                            fig.y(a).b();
                        }
                    }
                }
                return;
            }
            fig.c(a, fir1.a().e());
            fig.A(a).a(fig.z(a));
            fig.A(a).a((fio[])fir1.getItems());
            fig.x(a).d(0);
            obj = a;
            Show show;
            Picasso picasso;
            boolean flag1;
            boolean flag2;
            if (fir1.getUnrangedLength() > ((fio[])fir1.getItems()).length)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            fig.a(((fig) (obj)), flag2);
            fig.c(a, fir1.getUnrangedLength());
            if (fig.B(a).a || fig.C(a).a || fig.D(a).a)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            if (flag1)
            {
                fig.x(a).b(new int[] {
                    1
                });
                fig.x(a).a(new int[] {
                    3
                });
            } else
            if (fig.E(a) == 0)
            {
                fig.x(a).a(new int[] {
                    1
                });
                fig.x(a).b(new int[] {
                    3
                });
            } else
            {
                fig.x(a).a(new int[] {
                    1
                });
                fig.x(a).a(new int[] {
                    3
                });
            }
            if (!TextUtils.isEmpty(fig.z(a)))
            {
                fig.b(a).a_(fig.z(a));
            }
            obj = fig.f(a).getLastPlayerState();
            if (fig.F(a) && obj != null && TextUtils.equals(fig.G(a), ((PlayerState) (obj)).entityUri()))
            {
                fig.f(a).updateWithContext(fig.H(a));
                fig.b(a, false);
            }
            show = fir1.a();
            fig.d(a, show.a());
            fig.e(a, show.c().getUri());
            fig.f(a, show.f());
            if (show.c() != null)
            {
                obj = show.c().getImageUri(com.spotify.mobile.android.spotlets.show.model.Covers.Size.c);
            } else
            {
                obj = "";
            }
            obj = dto.a(((String) (obj)));
            picasso = ((gft)dmz.a(gft)).a();
            picasso.a(((android.net.Uri) (obj))).a(dgf.a).a(fig.u(a).d(), null);
            picasso.a(((android.net.Uri) (obj))).a(dff.c(a.k())).a(fig.t(a).b(), null);
            fig.t(a).b().setScaleType(android.widget.ImageView.ScaleType.CENTER_CROP);
            CoverImageActivity.a(a.k(), fig.t(a).b(), ((android.net.Uri) (obj)));
            fig.I(a).a(fiw.a(show.f()));
            fig.c(a, show.g());
            fig.J(a);
            fig.K(a).setText(a.l().getString(0x7f0804e7, new Object[] {
                show.d()
            }).toUpperCase(a.l().getConfiguration().locale));
            obj = a;
            if (((fio[])fir1.getItems()).length > 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((fig) (obj)).a(flag2);
            ((fpe)a.k()).P_();
            obj = fig.L(a);
            if (flag1 || fig.E(a) > 0)
            {
                flag2 = true;
            } else
            {
                flag2 = false;
            }
            ((View) (obj)).setEnabled(flag2);
            if (fig.M(a).e())
            {
                fig.M(a).b();
            }
            if (!fig.N(a))
            {
                fig.a(a, fir1);
                fig.O(a);
            }
            fig.x(a).a(new int[] {
                2
            });
        }

        public final void a(String s1)
        {
            Logger.c("Failed to load show: %s", new Object[] {
                s1
            });
            fig.P(a);
        }

            
            {
                a = fig.this;
                super();
            }
    };
    private boolean aA;
    private boolean aB;
    private boolean aC;
    private boolean aD;
    private boolean aE;
    private int aF;
    private int aG;
    private int aH;
    private int aI;
    private Resolver aJ;
    private Player aK;
    private gdk aL;
    private gfp aM;
    private gat aN;
    private fop aO;
    private fos aP;
    private gkl aQ;
    private com.spotify.mobile.android.spotlets.show.model.Show.MediaType aR;
    private com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder aS;
    private Bundle aT;
    private dir aU;
    private HeaderView aV;
    private eqx aW;
    private ListView aX;
    private Parcelable aY;
    private LoadingView aZ;
    private final gfp aa;
    private final gfp ab;
    private fix ac;
    private gdk ad;
    private gdk ae;
    private gdk af;
    private gdk ag;
    private ggl ah;
    private gjf ai;
    private Flags aj;
    private fih ak;
    private fim al;
    private ftg am;
    private EpisodeAdapter an;
    private Verified ao;
    private String ap;
    private String aq;
    private String ar;
    private String as;
    private String at;
    private String au;
    private boolean av;
    private boolean aw;
    private boolean ax;
    private boolean ay;
    private boolean az;
    final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver b = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

        private fig a;

        public final void onPlayerStateReceived(PlayerState playerstate)
        {
            if (!fig.Q(a))
            {
                fig.b(a).a(fig.R(a), a.a);
                fig.b(a).b(a.a);
            }
            fig.S(a);
            fig.a(a, playerstate);
        }

            
            {
                a = fig.this;
                super();
            }
    };
    private TextView ba;
    private TextView bb;
    private ToggleButton bc;
    private View bd;
    private View be;
    private FrameLayout bf;
    private LinearLayout bg;
    private VideoSurfaceView bh;
    private LinearLayout bi;
    private LinearLayout bj;
    private TextView bk;
    private View bl;
    private EmptyView bm;
    private FullScreenSwitchHelper bn;
    private ecx bo;
    private final ecw bp = new ecw() {

        private fig a;

        public final void a(boolean flag)
        {
            if (flag)
            {
                fig.a(a).connect();
                if (fig.b(a) != null)
                {
                    fig.b(a).b(a.a);
                }
                if (fig.c(a))
                {
                    fig.e(a).a(fig.d(a));
                }
                if (fig.f(a) != null)
                {
                    fig.f(a).registerPlayerStateObserver(a.b);
                }
            }
        }

            
            {
                a = fig.this;
                super();
            }
    };
    private final fzs bq = new fzs() {

        final fig a;

        public final void a()
        {
            if (fig.q(a))
            {
                return;
            }
            fig.d(a, true);
            fig.A(a).a(true);
            fig.u(a).c().post(new Runnable(this) {

                private _cls13 a;

                public final void run()
                {
                    fig.u(a.a).b(false);
                }

            
            {
                a = _pcls13;
                super();
            }
            });
            if (!fig.T(a))
            {
                fig.u(a).a().a(null);
            }
            fig.U(a);
            ((fpe)a.k()).P_();
            fig.W(a);
            fop.a(a.k(), fig.V(a), new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.du));
        }

            
            {
                a = fig.this;
                super();
            }
    };
    private final fzs br = new fzs() {

        final fig a;

        public final void a()
        {
            if (!fig.q(a))
            {
                return;
            }
            fig.d(a, false);
            fig.A(a).a(false);
            if (!fig.T(a))
            {
                fig.u(a).a().a(fig.u(a).b());
            }
            fig.u(a).c().post(new Runnable(this) {

                private _cls14 a;

                public final void run()
                {
                    fig.u(a.a).c(false);
                }

            
            {
                a = _pcls14;
                super();
            }
            });
            fig.U(a);
            fig.t(a).a(fig.s(a));
            fig.u(a).a(fig.s(a));
            ((fpe)a.k()).P_();
            fig.W(a);
            fop.a(a.k(), fig.V(a), new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.S, com.spotify.mobile.android.util.ClientEvent.SubEvent.du));
        }

            
            {
                a = fig.this;
                super();
            }
    };
    private final android.widget.AdapterView.OnItemClickListener bs = new android.widget.AdapterView.OnItemClickListener() {

        private fig a;

        public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
        {
            while (fig.q(a) || i1 < fig.g(a).getHeaderViewsCount()) 
            {
                return;
            }
            adapterview = (fio)view.getTag();
            fig.W(a);
            fop.a(a.k(), fig.V(a), ClientEventFactory.a("show", com.spotify.mobile.android.util.ClientEvent.SubEvent.ak, adapterview.b(), Long.valueOf(l1)));
            fig.a(a, l1);
            fig.o(a);
        }

            
            {
                a = fig.this;
                super();
            }
    };
    private final gdl bt = new gdl() {

        final fig a;

        public final void a(Context context, gdk gdk1)
        {
            for (context = fig.X(a).iterator(); context.hasNext();)
            {
                ((gdk)context.next()).a = false;
            }

            if (gdk1.c == fig.Y(a).c)
            {
                fig.a(a, fig.Z(a));
            } else
            {
                fig.a(a, gdk1);
            }
            fig.Y(a).a = true;
            fig.aa(a).setText(fig.Y(a).b);
            fig.b(a).a(fig.B(a).a, fig.D(a).a, fig.C(a).a);
            fig.b(a).b(a.a);
            context = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.Z);
            context.a("saved", String.valueOf(fig.B(a).a));
            context.a("offlined", String.valueOf(fig.D(a).a));
            context.a("unplayed", String.valueOf(fig.C(a).a));
            fig.W(a);
            fop.a(a.k(), fig.V(a), context);
            fig.u(a).c().post(new Runnable(this) {

                private _cls16 a;

                public final void run()
                {
label0:
                    {
                        if (fig.g(a.a).getFirstVisiblePosition() >= fig.g(a.a).getHeaderViewsCount())
                        {
                            if (!fig.T(a.a))
                            {
                                break label0;
                            }
                            fig.g(a.a).setSelection(0);
                        }
                        return;
                    }
                    fig.u(a.a).b(false);
                }

            
            {
                a = _pcls16;
                super();
            }
            });
        }

            
            {
                a = fig.this;
                super();
            }
    };
    private final gav bu = new gav() {

        private fig a;

        public final void a(gfp gfp2)
        {
            fig.a(a, gfp2);
            fig.b(a).a(fig.ab(a));
            fig.b(a).b(a.a);
            ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.aa);
            clientevent.a("order", fig.ab(a).a());
            clientevent.a("reversed", String.valueOf(gfp2.b()));
            fig.W(a);
            fop.a(a.k(), fig.V(a), clientevent);
            fig.ac(a).a(fig.G(a), fig.ab(a).a());
            fig.b(a, true);
        }

            
            {
                a = fig.this;
                super();
            }
    };
    private final android.view.View.OnClickListener bv = new android.view.View.OnClickListener() {

        private fig a;

        public final void onClick(View view)
        {
            fig.ad(a).a(a.k(), fig.Z(a));
        }

            
            {
                a = fig.this;
                super();
            }
    };
    private final epd bw = new epd() {

        private fig a;

        protected final int a()
        {
            return 10;
        }

        protected final void a(int i1)
        {
            if (fig.af(a) - 10 <= i1)
            {
                fig.d(a, i1 + 100);
                fig.b(a).a(Integer.valueOf(0), Integer.valueOf(fig.af(a)));
                fig.x(a).b(new int[] {
                    2
                });
                fig.b(a).b(a.a);
            }
        }

        protected final boolean b()
        {
            return fig.ae(a);
        }

            
            {
                a = fig.this;
                super();
            }
    };

    public fig()
    {
        gfp gfp1 = new gfp("publishDate", 0x7f080520, true);
        gfp1.d = new gfp("name");
        aa = gfp1;
        gfp1 = (new gfp("publishDate", 0x7f080520, true)).a(true);
        gfp1.d = new gfp("name");
        ab = gfp1;
        aG = 100;
        aI = -1;
        aO = (fop)dmz.a(fop);
        aP = (fos)dmz.a(fos);
        aQ = (gkl)dmz.a(gkl);
        aR = com.spotify.mobile.android.spotlets.show.model.Show.MediaType.d;
        aS = com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder.a;
    }

    static EpisodeAdapter A(fig fig1)
    {
        return fig1.an;
    }

    static gdk B(fig fig1)
    {
        return fig1.ae;
    }

    static gdk C(fig fig1)
    {
        return fig1.af;
    }

    static gdk D(fig fig1)
    {
        return fig1.ag;
    }

    static int E(fig fig1)
    {
        return fig1.aH;
    }

    static boolean F(fig fig1)
    {
        return fig1.aB;
    }

    static String G(fig fig1)
    {
        return fig1.ap;
    }

    static PlayerContext H(fig fig1)
    {
        return fig1.J();
    }

    private void H()
    {
        while (!aD || aR == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c && !aC || !aZ.d()) 
        {
            return;
        }
        aZ.b();
    }

    static eqx I(fig fig1)
    {
        return fig1.aW;
    }

    private PlayerContext J()
    {
        int i1 = 0;
        PlayerTrack aplayertrack[] = new PlayerTrack[an.getCount() - an.b];
        int k1;
        for (int j1 = 0; i1 < an.getCount(); j1 = k1)
        {
            fio fio1 = an.a(i1);
            k1 = j1;
            if (!fio1.isHeader())
            {
                Map map = fio1.r();
                map.put("artist_name", as);
                map.put("entity_uri", ap);
                aplayertrack[j1] = PlayerTrack.create(fio1.b(), map);
                k1 = j1 + 1;
            }
            i1++;
        }

        String s1 = ap;
        java.util.HashMap hashmap = Maps.b();
        hashmap.put("context_description", as);
        hashmap.put("image_url", at);
        hashmap.put("context_long_description", au);
        return PlayerContext.create(s1, aplayertrack, hashmap);
    }

    static void J(fig fig1)
    {
        ToggleButton togglebutton = fig1.bc;
        int i1;
        if (fig1.av)
        {
            i1 = 0x7f0804e9;
        } else
        {
            i1 = 0x7f0804e8;
        }
        togglebutton.setText(i1);
        fig1.bc.setChecked(fig1.av);
    }

    static TextView K(fig fig1)
    {
        return fig1.ba;
    }

    static View L(fig fig1)
    {
        return fig1.bd;
    }

    static gjf M(fig fig1)
    {
        return fig1.ai;
    }

    static boolean N(fig fig1)
    {
        return fig1.aE;
    }

    static boolean O(fig fig1)
    {
        fig1.aE = true;
        return true;
    }

    static void P(fig fig1)
    {
        if (fig1.bm != null)
        {
            fig1.bm.setVisibility(0);
        }
    }

    static boolean Q(fig fig1)
    {
        return fig1.aC;
    }

    static Bundle R(fig fig1)
    {
        return fig1.aT;
    }

    static boolean S(fig fig1)
    {
        fig1.aC = true;
        return true;
    }

    static boolean T(fig fig1)
    {
        return fig1.ax;
    }

    static void U(fig fig1)
    {
        fig1.a();
    }

    static Verified V(fig fig1)
    {
        return fig1.ao;
    }

    static fop W(fig fig1)
    {
        return fig1.aO;
    }

    static List X(fig fig1)
    {
        return fig1.Y;
    }

    static gdk Y(fig fig1)
    {
        return fig1.aL;
    }

    static gdk Z(fig fig1)
    {
        return fig1.ad;
    }

    static int a(fig fig1, int i1)
    {
        fig1.aI = i1;
        return i1;
    }

    static Resolver a(fig fig1)
    {
        return fig1.aJ;
    }

    static com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder a(fig fig1, com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder consumptionorder)
    {
        fig1.aS = consumptionorder;
        return consumptionorder;
    }

    static com.spotify.mobile.android.spotlets.show.model.Show.MediaType a(fig fig1, com.spotify.mobile.android.spotlets.show.model.Show.MediaType mediatype)
    {
        fig1.aR = mediatype;
        return mediatype;
    }

    public static fig a(String s1, Flags flags, String s2, boolean flag)
    {
        Bundle bundle = new Bundle();
        bundle.putString("uri", s1);
        bundle.putString("original_uri", s1);
        s1 = new fig();
        if (s2 != null)
        {
            bundle.putString("episode_uri", s2);
        }
        bundle.putBoolean("auto_play", flag);
        s1.f(bundle);
        ctz.a(flags);
        fyw.a(s1, flags);
        return s1;
    }

    static gdk a(fig fig1, gdk gdk1)
    {
        fig1.aL = gdk1;
        return gdk1;
    }

    static gfp a(fig fig1, gfp gfp1)
    {
        fig1.aM = gfp1;
        return gfp1;
    }

    static String a(fig fig1, String s1)
    {
        fig1.ar = s1;
        return s1;
    }

    private void a()
    {
        StickyListView stickylistview = aU.a();
        stickylistview.a(true);
        int i1;
        if (aw && !ax)
        {
            i1 = aF;
        } else
        {
            i1 = 0;
        }
        be.setPadding(be.getPaddingLeft(), i1, be.getPaddingRight(), be.getPaddingBottom());
        if (aw)
        {
            aU.a(null);
            stickylistview.a(be);
            stickylistview.b(be);
            aV.a(null);
            aU.a(null);
            ((fpe)k()).a(this, b(0x7f0804eb));
            return;
        }
        if (!ax)
        {
            aU.a(be);
            return;
        } else
        {
            stickylistview.a(be);
            stickylistview.b(be);
            return;
        }
    }

    private void a(LayoutInflater layoutinflater)
    {
        aN = new gat(k(), layoutinflater, bu);
        aN.a(Y);
        aN.a(Z, aM);
        Object obj = new SectionHeaderView(k());
        ((SectionHeaderView) (obj)).setClickable(true);
        ((SectionHeaderView) (obj)).b(true);
        bd = gae.a(k(), SpotifyIcon.aQ);
        bd.setEnabled(false);
        bd.setOnClickListener(new android.view.View.OnClickListener() {

            private fig a;

            public final void onClick(View view)
            {
                fig.aj(a).a(view);
            }

            
            {
                a = fig.this;
                super();
            }
        });
        ((SectionHeaderView) (obj)).a(bd);
        bb = ((SectionHeaderView) (obj)).c();
        bb.setText(b(aL.b));
        ((SectionHeaderView) (obj)).setBackgroundColor(dgo.b(k(), 0x1010054));
        be = ((View) (obj));
        obj = new android.widget.AbsListView.LayoutParams(-1, -2);
        be.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        aF = ActionBarManager.a(k());
        aV = new HeaderView(k());
        Object obj1;
        int i1;
        if (ax)
        {
            obj = fzx.b(this, aV);
        } else
        {
            obj = fzx.a(this, aV);
        }
        aU = ((dir) (obj));
        aU.a(dgo.b(k(), 0x7f0101c6));
        obj = LayoutInflater.from(k()).inflate(0x7f0300c5, null);
        ba = (TextView)((View) (obj)).findViewById(0x7f1102ef);
        ba.setVisibility(0);
        bc = (ToggleButton)((View) (obj)).findViewById(0x7f1103f9);
        obj1 = bc;
        if (fiy.a(aj))
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        ((ToggleButton) (obj1)).setVisibility(i1);
        bc.setOnClickListener(new android.view.View.OnClickListener() {

            private fig a;

            public final void onClick(View view)
            {
                fig.W(a);
                u u1 = a.k();
                Verified verified = fig.V(a);
                if (fig.al(a))
                {
                    view = com.spotify.mobile.android.util.ClientEvent.SubEvent.bJ;
                } else
                {
                    view = com.spotify.mobile.android.util.ClientEvent.SubEvent.bI;
                }
                fop.a(u1, verified, ClientEventFactory.a("show", view, null, null));
                if (fig.al(a))
                {
                    CollectionService.b(a.k(), fig.G(a), fig.V(a).toString(), fig.w(a), com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.b);
                } else
                {
                    CollectionService.a(a.k(), fig.G(a), fig.V(a).toString(), fig.w(a), com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.b);
                }
                fig.J(a);
            }

            
            {
                a = fig.this;
                super();
            }
        });
        bl = ((View) (obj));
        aV.a(bl);
        obj = aU.g();
        ((View) (obj)).setVisibility(4);
        bf.addView(((View) (obj)), 0);
        aZ.b = ((View) (obj));
        aZ.a = new gao(k(), ((View) (obj)));
        aX = aU.c();
        aX.setOnItemClickListener(bs);
        aX.setOnItemLongClickListener(new fuf(k()));
        aX.setOnScrollListener(bw);
        aX.setFastScrollEnabled(true);
        aV.a(" ");
        aU.a(" ");
        a();
        aW = new eqx(k());
        obj = aW;
        i1 = l().getInteger(0x7f0e001a);
        ((eqx) (obj)).a.setMaxLines(i1);
        aV.a(new ftn(aW));
        obj = layoutinflater.inflate(0x7f030050, null);
        ((View) (obj)).findViewById(0x7f11025e).setOnClickListener(bv);
        obj1 = eoo.a(k(), 0x7f0803cf);
        an = new EpisodeAdapter(k(), ao, aj, true);
        an.a(aw);
        an.a(aq);
        am = new ftg(k());
        am.a(an, null, 0);
        am.a(new ftm(((View) (obj)), false), null, 1);
        am.a(new ftm(((View) (obj1)), false), null, 3);
        layoutinflater = layoutinflater.inflate(0x7f030072, aX, false);
        am.a(new ftm(layoutinflater, false), null, 2);
        am.d(0);
        am.a(new int[] {
            1, 2, 3
        });
        aX.setAdapter(am);
    }

    private void a(PlayerState playerstate)
    {
        if (an == null)
        {
            return;
        }
        if (playerstate != null && playerstate.track() != null)
        {
            boolean flag = TextUtils.equals("context", playerstate.track().provider());
            boolean flag2 = TextUtils.equals("queue", playerstate.track().provider());
            boolean flag3 = TextUtils.equals(ap, (CharSequence)playerstate.track().metadata().get("entity_uri"));
            boolean flag4 = TextUtils.equals(ap, playerstate.entityUri());
            if (flag && flag4 || flag2 && flag3)
            {
                EpisodeAdapter episodeadapter = an;
                String s1 = playerstate.track().uri();
                boolean flag1;
                if (playerstate.isPlaying() && !playerstate.isPaused())
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                episodeadapter.a(s1, flag1);
                d(true);
                if (aI >= 0)
                {
                    c(aI);
                    aI = -1;
                }
                H();
                return;
            }
        }
        an.a(null, false);
        d(false);
        if (aI >= 0)
        {
            c(aI);
            aI = -1;
        }
        H();
    }

    static void a(fig fig1, long l1)
    {
        com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).skipToIndex(0, (int)l1).suppressions(new String[] {
            "mft"
        }).playerOptionsOverride(false, false, false).build();
        fig1.aK.play(fig1.J(), playoptions);
    }

    static void a(fig fig1, Bundle bundle)
    {
        fig1.c(bundle);
    }

    static void a(fig fig1, LayoutInflater layoutinflater)
    {
        fig1.a(layoutinflater);
    }

    static void a(fig fig1, PlayerState playerstate)
    {
        fig1.a(playerstate);
    }

    static void a(fig fig1, fir fir)
    {
        fig1.aX.post(fig1. new Runnable(fir) {

            private fir a;
            private fig b;

            public final void run()
            {
                boolean flag1 = false;
                if (fig.k(b) == null) goto _L2; else goto _L1
_L1:
                fig.g(b).onRestoreInstanceState(fig.k(b));
                fig.l(b);
                fig.a(b, null);
                fig.m(b);
                fig.i(b);
                fig.j(b);
_L4:
                if (!fig.q(b))
                {
                    if (fig.r(b) != null)
                    {
                        fig.r(b).setText(fig.s(b));
                    }
                    if (!fig.c(b))
                    {
                        fig.t(b).a(fig.s(b));
                        fig.u(b).a(fig.s(b));
                    }
                }
                return;
_L2:
                if (!TextUtils.isEmpty(fig.n(b)))
                {
                    boolean flag2 = b.g().getBoolean("auto_play", false);
                    int i1 = 0;
                    do
                    {
label0:
                        {
                            boolean flag = flag1;
                            if (i1 < ((fio[])a.getItems()).length)
                            {
                                fio fio1 = ((fio[])a.getItems())[i1];
                                if (!fig.n(b).equals(fio1.b()))
                                {
                                    break label0;
                                }
                                flag = flag1;
                                if (fio1.j())
                                {
                                    flag = true;
                                    if (flag2)
                                    {
                                        fig.a(b, i1);
                                        fig.a(b, i1);
                                        fig.o(b);
                                        fig.b(b, fig.n(b));
                                    } else
                                    {
                                        fig.b(b, i1);
                                    }
                                }
                            }
                            if (!flag)
                            {
                                fig.i(b);
                                fig.j(b);
                            }
                            fig.a(b, null);
                            fig.m(b);
                            continue; /* Loop/switch isn't completed */
                        }
                        i1++;
                    } while (true);
                }
                if (!fig.p(b))
                {
                    fig.i(b);
                    fig.h(b);
                    fig.j(b);
                } else
                {
                    fig.i(b);
                    fig.j(b);
                }
                if (true) goto _L4; else goto _L3
_L3:
            }

            
            {
                b = fig.this;
                a = fir1;
                super();
            }
        });
    }

    static boolean a(fig fig1, boolean flag)
    {
        fig1.aA = flag;
        return flag;
    }

    static TextView aa(fig fig1)
    {
        return fig1.bb;
    }

    static gfp ab(fig fig1)
    {
        return fig1.aM;
    }

    static fix ac(fig fig1)
    {
        return fig1.ac;
    }

    static gdl ad(fig fig1)
    {
        return fig1.bt;
    }

    static boolean ae(fig fig1)
    {
        return fig1.aA;
    }

    static int af(fig fig1)
    {
        return fig1.aG;
    }

    static com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder ag(fig fig1)
    {
        return fig1.aS;
    }

    static FrameLayout ah(fig fig1)
    {
        return fig1.bf;
    }

    static ggl ai(fig fig1)
    {
        return fig1.ah;
    }

    static gat aj(fig fig1)
    {
        return fig1.aN;
    }

    static fos ak(fig fig1)
    {
        return fig1.aP;
    }

    static boolean al(fig fig1)
    {
        return fig1.av;
    }

    static fih b(fig fig1)
    {
        return fig1.ak;
    }

    public static String b(Intent intent)
    {
        return intent.getStringExtra("episode_uri");
    }

    private void b(LayoutInflater layoutinflater)
    {
        VideoSurfaceView videosurfaceview;
        Point point;
        Object obj;
        int i1;
        if (gfv.b(k()))
        {
            i1 = gfv.c(k());
        } else
        {
            i1 = 0;
        }
        bh = new VideoSurfaceView(k(), false);
        bh.a(aj);
        bi = new LinearLayout(k());
        bi.setLayoutParams(new android.widget.AbsListView.LayoutParams(-1, -2));
        bi.setBackgroundColor(gcg.b(k(), 0x7f0f0036));
        bi.setPadding(0, i1, 0, 0);
        bi.setVisibility(8);
        bi.addView(bh);
        bg.addView(bi, 0);
        obj = k();
        videosurfaceview = bh;
        point = new Point();
        ((Activity) (obj)).getWindowManager().getDefaultDisplay().getSize(point);
        obj = videosurfaceview.getLayoutParams();
        obj.width = point.x;
        obj.height = (int)((float)point.x / 1.77F);
        videosurfaceview.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        bj = (LinearLayout)layoutinflater.inflate(0x7f0300c6, null);
        bk = (TextView)bj.findViewById(0x7f11026e);
        bh.setOnClickListener(new android.view.View.OnClickListener() {

            private fig a;

            public final void onClick(View view)
            {
                fig.ak(a);
                fos.a(a.k(), fig.V(a).toString());
            }

            
            {
                a = fig.this;
                super();
            }
        });
    }

    static void b(fig fig1, int i1)
    {
        fig1.c(i1);
    }

    static void b(fig fig1, LayoutInflater layoutinflater)
    {
        fig1.b(layoutinflater);
    }

    static void b(fig fig1, String s1)
    {
        for (PlayerState playerstate = fig1.aK.getLastPlayerState(); playerstate == null || playerstate.track() == null || !playerstate.isPlaying() || playerstate.isPaused() || !s1.equals(playerstate.track().uri());)
        {
            return;
        }

        fig1.a(fig1.aK.getLastPlayerState());
    }

    static boolean b(fig fig1, boolean flag)
    {
        fig1.aB = flag;
        return flag;
    }

    static int c(fig fig1, int i1)
    {
        fig1.aH = i1;
        return i1;
    }

    static String c(fig fig1, String s1)
    {
        fig1.aq = s1;
        return s1;
    }

    private void c(int i1)
    {
        aX.post(new Runnable(i1) {

            private int a;
            private fig b;

            public final void run()
            {
                if (a > 2)
                {
                    if (fig.c(b))
                    {
                        fig.g(b).setSelection(a + fig.g(b).getHeaderViewsCount());
                    } else
                    {
                        fig.g(b).setSelection(a - fig.g(b).getHeaderViewsCount());
                    }
                } else
                {
                    fig.h(b);
                }
                fig.i(b);
                fig.j(b);
            }

            
            {
                b = fig.this;
                a = i1;
                super();
            }
        });
    }

    private void c(Bundle bundle)
    {
        if (o())
        {
            if (as == null)
            {
                as = b(0x7f0804ea);
            }
            ap = g().getString("uri");
            Y.clear();
            Object obj;
            int i1;
            if (aR == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c)
            {
                gdk gdk1 = new gdk(bt, 0x7f0802cb);
                gdk1.c = 0;
                ad = gdk1;
            } else
            {
                obj = new gdk(bt, 0x7f0802ca);
                obj.c = 0;
                ad = ((gdk) (obj));
            }
            obj = new gdk(bt, 0x7f0802cd);
            obj.c = 1;
            ae = ((gdk) (obj));
            obj = new gdk(bt, 0x7f0802ce);
            obj.c = 2;
            af = ((gdk) (obj));
            obj = new gdk(bt, 0x7f0802cc);
            obj.c = 3;
            ag = ((gdk) (obj));
            Y.add(ad);
            if (fiy.d(aj))
            {
                Y.add(ae);
            }
            if (aR == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.b && fiy.a(aj))
            {
                Y.add(ag);
            }
            Y.add(af);
            gdk gdk3;
            if (bundle != null)
            {
                i1 = bundle.getInt("filter", 0);
            } else
            {
                i1 = 0;
            }
            for (obj = Y.iterator(); ((Iterator) (obj)).hasNext();)
            {
                gdk gdk2 = (gdk)((Iterator) (obj)).next();
                if (i1 == gdk2.c)
                {
                    aL = gdk2;
                    gdk2.a = true;
                } else
                {
                    gdk2.a = false;
                }
            }

            obj = aL;
            gdk3 = ad;
            if (obj == null)
            {
                obj = gdk3;
            }
            aL = (gdk)obj;
            if (aS == com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder.c)
            {
                obj = ab;
            } else
            {
                obj = aa;
            }
            Z.clear();
            Z.add(obj);
            aM = ac.a(ap, ((gfp) (obj)), Z);
            ao = ViewUri.bM.a(ap);
            ah = ggn.a(k(), ao);
            fop.a(k(), ao, (new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.R)).a("saved", g().getString("original_uri")));
            ai = gjf.a(k(), ao.toString());
            if (gjf.b(bundle))
            {
                ai.c(bundle);
            }
            aK = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(aJ, ao.toString(), FeatureIdentifier.C, gnl.a(this));
            aK.registerPlayerStateObserver(b);
            if (ak == null)
            {
                ak = new fik(k(), aJ, ap);
            }
            ak.a(Integer.valueOf(0), Integer.valueOf(aG));
            ak.a(ae.a, ag.a, af.a);
            ak.a(aM);
            if (!TextUtils.isEmpty(aq))
            {
                ak.a_(aq);
                return;
            }
        }
    }

    public static boolean c(Intent intent)
    {
        return intent.getBooleanExtra("auto_play", false);
    }

    static boolean c(fig fig1)
    {
        return fig1.az;
    }

    static boolean c(fig fig1, boolean flag)
    {
        fig1.av = flag;
        return flag;
    }

    static int d(fig fig1, int i1)
    {
        fig1.aG = i1;
        return i1;
    }

    static VideoSurfaceView d(fig fig1)
    {
        return fig1.bh;
    }

    static String d(fig fig1, String s1)
    {
        fig1.as = s1;
        return s1;
    }

    private void d(boolean flag)
    {
        while (aR != com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c || flag && ax || az == flag) 
        {
            return;
        }
        az = flag;
        LinearLayout linearlayout = bi;
        int i1;
        if (flag)
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        linearlayout.setVisibility(i1);
        if (flag)
        {
            aU.a().a(null);
            aV.a(null);
            bj.addView(bl);
            aX.addHeaderView(bj);
            aX.addHeaderView(be);
            bk.setText(as);
            aV.a(null);
            aU.a(null);
            ((fpe)k()).a(this, " ");
            ((fpe)k()).P_();
            aQ.a(bh);
            return;
        } else
        {
            aX.removeHeaderView(be);
            aX.removeHeaderView(bj);
            bj.removeView(bl);
            aV.a(as);
            aV.a(bl);
            aU.a(as);
            aU.a().a(aU.b());
            aQ.b(bh);
            return;
        }
    }

    static boolean d(fig fig1, boolean flag)
    {
        fig1.aw = flag;
        return flag;
    }

    static gkl e(fig fig1)
    {
        return fig1.aQ;
    }

    static String e(fig fig1, String s1)
    {
        fig1.at = s1;
        return s1;
    }

    static Player f(fig fig1)
    {
        return fig1.aK;
    }

    static String f(fig fig1, String s1)
    {
        fig1.au = s1;
        return s1;
    }

    static ListView g(fig fig1)
    {
        return fig1.aX;
    }

    static void h(fig fig1)
    {
        if (fig1.av && !fig1.az)
        {
            fig1.aU.b(false);
        }
        fig1.ay = true;
    }

    static boolean i(fig fig1)
    {
        fig1.aD = true;
        return true;
    }

    static void j(fig fig1)
    {
        fig1.H();
    }

    static Parcelable k(fig fig1)
    {
        return fig1.aY;
    }

    static Parcelable l(fig fig1)
    {
        fig1.aY = null;
        return null;
    }

    static boolean m(fig fig1)
    {
        fig1.ay = true;
        return true;
    }

    static String n(fig fig1)
    {
        return fig1.ar;
    }

    static void o(fig fig1)
    {
        if (fig1.ax && fig1.aR == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c)
        {
            PlayerState playerstate = fig1.aK.getLastPlayerState();
            fig1 = flo.a(fig1.k());
            fig1.c = playerstate;
            fig1.a().a(FeatureIdentifier.C);
        }
    }

    static boolean p(fig fig1)
    {
        return fig1.ay;
    }

    static boolean q(fig fig1)
    {
        return fig1.aw;
    }

    static TextView r(fig fig1)
    {
        return fig1.bk;
    }

    static String s(fig fig1)
    {
        return fig1.as;
    }

    static HeaderView t(fig fig1)
    {
        return fig1.aV;
    }

    static dir u(fig fig1)
    {
        return fig1.aU;
    }

    static com.spotify.mobile.android.spotlets.show.model.Show.MediaType v(fig fig1)
    {
        return fig1.aR;
    }

    static Flags w(fig fig1)
    {
        return fig1.aj;
    }

    static ftg x(fig fig1)
    {
        return fig1.am;
    }

    static LoadingView y(fig fig1)
    {
        return fig1.aZ;
    }

    static String z(fig fig1)
    {
        return fig1.aq;
    }

    public final void A()
    {
        super.A();
        if (ah != null)
        {
            ggl ggl1 = ah;
            boolean flag;
            if (ggl1.c != -1L && ggl1.c != -2L)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            if (flag)
            {
                ah.b();
            }
        }
    }

    public final void B()
    {
        super.B();
        aJ.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return "show";
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        aj = fyw.a(this);
        bg = new LinearLayout(k());
        bg.setOrientation(1);
        bg.setBackgroundColor(dgo.b(k(), 0x1010054));
        bg.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        bm = new EmptyView(k());
        bm.a(b(0x7f0804e6));
        bm.a(new dfz(k(), SpotifyIcon.aI));
        bm.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-1, -1));
        bm.setVisibility(8);
        bg.addView(bm);
        bf = new FrameLayout(k());
        bf.setBackgroundColor(dgo.b(k(), 0x1010054));
        bf.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        bg.addView(bf);
        aZ = LoadingView.a(layoutinflater);
        aZ.a();
        bf.addView(aZ);
        if (aR != com.spotify.mobile.android.spotlets.show.model.Show.MediaType.d)
        {
            a(layoutinflater);
            b(layoutinflater);
            ai.a();
        }
        return bg;
    }

    public final String a(Context context, Flags flags)
    {
        return "";
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        aT = bundle;
        a(false);
        ac = (fix)dmz.a(fix);
        aj = fyw.a(this);
        ar = g().getString("episode_uri");
        ax = ggi.b(k());
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            aY = bundle.getParcelable("list");
            aw = bundle.getBoolean("edit_mode", false);
            aG = bundle.getInt("range_length", 100);
            aR = com.spotify.mobile.android.spotlets.show.model.Show.MediaType.values()[bundle.getInt("media_type", com.spotify.mobile.android.spotlets.show.model.Show.MediaType.d.ordinal())];
            aS = com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder.values()[bundle.getInt("consumption_order", com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder.a.ordinal())];
        }
        aJ = Cosmos.getResolver(k());
        bn = FullScreenSwitchHelper.a(bundle);
        bn.a(k(), FeatureIdentifier.C);
        fin fin = new fin(bundle) {

            private Bundle a;
            private fig b;

            public final void a(Show show, fio fio1)
            {
                b.g().putString("uri", show.b());
                fig.d(b, show.a());
                fig.c(b, show.e());
                fig.a(b, show.h());
                if (TextUtils.isEmpty(fig.n(b)) && fig.ag(b) != com.spotify.mobile.android.spotlets.show.model.Show.ConsumptionOrder.d && show.g())
                {
                    fig.a(b, fig.z(b));
                }
                fig fig1 = b;
                if (fio1 != null)
                {
                    fio1 = fio1.s();
                } else
                {
                    fio1 = show.i();
                }
                fig.a(fig1, fio1);
                fig.s(b);
                if (show.g())
                {
                    show = "is";
                } else
                {
                    show = "not";
                }
                fig.ag(b);
                fig.n(b);
                fig.v(b);
                fig.a(b, a);
                if (fig.ah(b) != null && b.o())
                {
                    fig.a(b, b.b(a));
                    fig.b(b, b.b(a));
                    fig.M(b).a();
                }
                if (b.q())
                {
                    fig.ai(b).a();
                }
            }

            public final void a(Throwable throwable)
            {
                Logger.b(throwable, "Failed to load show.", new Object[0]);
                fig fig1 = b;
                throwable.getMessage();
                fig.P(fig1);
            }

            
            {
                b = fig.this;
                a = bundle;
                super();
            }
        };
        if (al == null)
        {
            String s1 = g().getString("uri");
            al = new fim(k(), s1, aJ, fin);
        }
        if (aR == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.d)
        {
            bundle = al;
            if (((fim) (bundle)).b != null)
            {
                ((fim) (bundle)).b.b(new String[] {
                    ((fim) (bundle)).a.d()
                });
                return;
            } else
            {
                Assertion.a("Decorator is null! Unknown link passed in constructor.");
                return;
            }
        } else
        {
            c(bundle);
            return;
        }
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        if (o())
        {
            if (aw)
            {
                fzr.a(k(), menu, ao, br);
                return;
            }
            if (fiy.a(aj))
            {
                u u1 = k();
                Verified verified = ao;
                boolean flag = av;
                String s1 = ap;
                Flags flags = aj;
                if (flag)
                {
                    menuinflater = CollectionState.a;
                } else
                {
                    menuinflater = CollectionState.c;
                }
                fzt.a(u1, menu, verified, menuinflater, false, s1, flags);
            }
            if (aR == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.b && fiy.a(aj) && aH > 0)
            {
                fzt.a(k(), menu, ao, bq, 0x7f0803a5);
                return;
            }
        }
    }

    public final void c()
    {
        super.c();
        ecw ecw1 = bp;
        bo = new ecx(j(), (ecw)ctz.a(ecw1));
    }

    public final void d()
    {
        super.d();
        bo.a.destroy();
        if (ak != null)
        {
            ak.a();
        }
        aJ.disconnect();
        if (az)
        {
            aQ.b(bh);
        }
        if (aK != null)
        {
            aK.unregisterPlayerStateObserver(b);
        }
    }

    public final void e()
    {
        super.e();
        if (ai != null && ai.e())
        {
            ai.c();
        }
        if (aN != null)
        {
            aN.dismiss();
        }
        aC = false;
        d(false);
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        if (ai != null)
        {
            ai.a(bundle);
        }
        if (ak != null)
        {
            ak.a(bundle);
        }
        if (aX != null)
        {
            bundle.putParcelable("list", aX.onSaveInstanceState());
        }
        bundle.putBoolean("edit_mode", aw);
        bundle.putInt("media_type", aR.ordinal());
        bundle.putInt("consumption_order", aS.ordinal());
        bundle.putInt("range_length", aG);
        if (aL != null)
        {
            bundle.putInt("filter", aL.c);
        }
        if (aK != null)
        {
            bn.a = az;
            bn.a(bundle, k(), aK.getLastPlayerState());
        }
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.C;
    }

    public final void z()
    {
        super.z();
        if (ah != null)
        {
            ah.a();
        }
    }
}
