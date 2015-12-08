// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.playlist.fragments.legacy_orbit;

import al;
import am;
import an;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.ToggleButton;
import com.google.common.base.Optional;
import com.spotify.android.paste.widget.EmptyView;
import com.spotify.android.paste.widget.prettylist.StickyListView;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.cosmos.RequestBuilder;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.ads.model.SponsorshipAdData;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.spotlets.ads.sponsorship.SponsoredHeaderView;
import com.spotify.mobile.android.spotlets.offline.flags.OfflineSyncSwitchVisibility;
import com.spotify.mobile.android.spotlets.tinkerbell.Onboarding;
import com.spotify.mobile.android.spotlets.tinkerbell.TooltipContainer;
import com.spotify.mobile.android.ui.activity.CoverImageActivity;
import com.spotify.mobile.android.ui.activity.upsell.ondemand.OnDemandUpsellVariationFlag;
import com.spotify.mobile.android.ui.contextmenu.model.menu.SpotifyContextMenu;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.DownloadHeaderView;
import com.spotify.mobile.android.ui.view.FilterHeaderView;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.ui.view.ShufflePlayHeaderView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.squareup.picasso.Picasso;
import cu;
import da;
import dff;
import dfr;
import dft;
import dgf;
import dgn;
import dgo;
import dgp;
import dja;
import djb;
import djc;
import djd;
import djr;
import dmz;
import dny;
import dnz;
import dob;
import dod;
import dto;
import dtt;
import dub;
import duc;
import eda;
import edb;
import edp;
import edr;
import efg;
import efi;
import efj;
import efm;
import eoh;
import eoi;
import eoo;
import evp;
import evq;
import evr;
import evs;
import evv;
import evw;
import evx;
import evz;
import ewa;
import ewb;
import ewg;
import ewh;
import ewi;
import fcv;
import fdn;
import fjm;
import fjn;
import fka;
import fon;
import fop;
import for;
import fos;
import fpe;
import frl;
import frq;
import frr;
import frs;
import frt;
import ftg;
import ftm;
import ftr;
import fts;
import ftt;
import fuf;
import fuj;
import fve;
import fwv;
import fww;
import fwx;
import fwy;
import fwz;
import fxa;
import fxd;
import fxy;
import fys;
import fyw;
import fzr;
import fzs;
import fzt;
import gad;
import gap;
import gas;
import gaw;
import gbg;
import gbv;
import gbz;
import gca;
import gcg;
import gex;
import gfp;
import gft;
import gge;
import ggf;
import ggi;
import ggl;
import ggn;
import ggq;
import ggt;
import giq;
import gjf;
import gjm;
import gms;
import gnl;
import gwb;
import java.util.ArrayList;
import java.util.EnumSet;
import java.util.List;
import u;

public class PlaylistFragment extends al
    implements dod, fon, fxy
{

    static final String b[] = {
        "name", "image_uri", "icon_uri"
    };
    boolean Y;
    dja Z;
    private LinearLayout aA;
    private View aB;
    private TextView aC;
    private boolean aD;
    private edb aE;
    private eoh aF;
    private com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status aG;
    private gbv aH;
    private ftg aI;
    private fts aJ;
    private Flags aK;
    private FeatureIdentifier aL;
    private String aM;
    private String aN;
    private gfp aO;
    private boolean aP;
    private ggl aQ;
    private ggq aR;
    private String aS;
    private fop aT;
    private fos aU;
    private for aV;
    private fjm aW;
    private gjf aX;
    private boolean aY;
    private Optional aZ;
    private final List aa = new ArrayList();
    private final gfp ab = new gfp("", 0x7f08051f, false);
    private final gfp ac = new gfp("time_added", 0x7f080522);
    private fdn ad;
    private dob ae;
    private Uri af;
    private Uri ag;
    private Verified ah;
    private Optional ai;
    private boolean aj;
    private evx ak;
    private SponsoredHeaderView al;
    private boolean am;
    private gbz an;
    private ListView ao;
    private int ap;
    private int aq;
    private String ar;
    private View as;
    private ToggleButton at;
    private gbg au;
    private EmptyView av;
    private DownloadHeaderView aw;
    private FilterHeaderView ax;
    private LoadingView ay;
    private EmptyView az;
    private final fuj ba = new fuj() {

        private PlaylistFragment a;

        public final void a(SpotifyContextMenu spotifycontextmenu, Object obj)
        {
            obj = (dnz)obj;
            obj = fve.a(a.k()).a(((dnz) (obj)).e, ((dnz) (obj)).b).a(PlaylistFragment.c(a)).a(true).a(true).a(true).a(PlaylistFragment.a(a).A(), Integer.valueOf(((dnz) (obj)).h)).a(PlaylistFragment.b(a)).a(PlaylistFragment.a(a).a());
            obj.h = PlaylistFragment.a(a).n();
            ((fwv) (obj)).a(spotifycontextmenu);
        }

            
            {
                a = PlaylistFragment.this;
                super();
            }
    };
    private final ftt bb = new ftt() {

        private PlaylistFragment a;

        public final boolean a()
        {
            return true;
        }

        public final boolean b()
        {
            return PlaylistFragment.a(a).r();
        }

            
            {
                a = PlaylistFragment.this;
                super();
            }
    };
    private android.view.View.OnClickListener bc;
    private android.view.View.OnClickListener bd;
    private frt be;
    private evv bf;
    private evs bg;
    private evr bh;
    private ewi bi;
    private ewh bj;
    private fzs bk;
    private ggt bl;
    private gas bm;
    private gap bn;
    private android.view.View.OnClickListener bo;
    private final eda bp = new eda() {

        private PlaylistFragment a;

        public final void a(SessionState sessionstate)
        {
            PlaylistFragment.b(a, sessionstate.j);
            PlaylistFragment.z(a);
        }

            
            {
                a = PlaylistFragment.this;
                super();
            }
    };
    private eoi bq;
    private an br;
    private an bs;
    private gca bt;
    private gca bu;
    private gca bv;
    private gca bw;
    private final gca bx = new gca() {

        private PlaylistFragment b;

        public final void a(EnumSet enumset, EnumSet enumset1)
        {
            if (enumset1.contains(StateFlags.b) && PlaylistFragment.a(b).k() && PlaylistFragment.a(b).n())
            {
                enumset = PlaylistFragment.a(b).a();
                if (PlaylistFragment.s(b).a(enumset, null, PlaylistFragment.P(b)) == null)
                {
                    PlaylistFragment.R(b).a(PlaylistFragment.Q(b));
                }
            }
        }

            
            {
                b = PlaylistFragment.this;
                super();
            }
    };
    private an by;
    private ggf bz;

    public PlaylistFragment()
    {
        an = new gbz(com/spotify/mobile/android/spotlets/playlist/fragments/legacy_orbit/PlaylistFragment$StateFlags);
        aq = -1;
        aG = com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.a;
        aT = (fop)dmz.a(fop);
        aU = (fos)dmz.a(fos);
        aV = (for)dmz.a(for);
        aW = (fjm)dmz.a(fjm);
        bc = new android.view.View.OnClickListener() {

            private PlaylistFragment a;

            public final void onClick(View view)
            {
                view = a;
                boolean flag;
                if (!PlaylistFragment.a(a).l())
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                PlaylistFragment.a(view, flag);
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bd = new android.view.View.OnClickListener() {

            private PlaylistFragment a;

            public final void onClick(View view)
            {
                if (PlaylistFragment.a(a).w() == null)
                {
                    return;
                } else
                {
                    a.k().startActivity(gms.a(a.k(), PlaylistFragment.a(a).w()).a(PlaylistFragment.a(a).b()).a);
                    return;
                }
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        be = new frt() {

            private PlaylistFragment a;

            public final void a(boolean flag)
            {
                if (!PlaylistFragment.d(a).b())
                {
                    return;
                }
                if (flag)
                {
                    PlaylistFragment.e(a).b(new int[] {
                        2
                    });
                    return;
                } else
                {
                    PlaylistFragment.e(a).a(new int[] {
                        2
                    });
                    return;
                }
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bg = new evs() {

            private PlaylistFragment a;

            public final void a()
            {
                PlaylistFragment.f(a).a();
                if (!a.Y)
                {
                    a.Z.a(gcg.b(a.k(), 0x7f0f010f));
                }
                if (PlaylistFragment.g(a) != null)
                {
                    PlaylistFragment.g(a).b(false);
                }
            }

            public final void a(int i1, int j1)
            {
                PlaylistFragment.f(a).a(i1, j1);
                if (!a.Y)
                {
                    a.Z.a(dgo.b(a.k(), 0x7f0101c6));
                }
                if (PlaylistFragment.g(a) != null && !com.spotify.mobile.android.provider.Metadata.OfflineSync.a(i1))
                {
                    PlaylistFragment.g(a).b();
                }
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bh = new evr() {

            private PlaylistFragment a;

            public final void a(boolean flag)
            {
                PlaylistFragment.i(a);
                for.a(a.k(), PlaylistFragment.h(a), flag);
            }

            public final void b(boolean flag)
            {
                Object obj;
                String s1;
                if (flag)
                {
                    obj = com.spotify.mobile.android.util.ClientEvent.Event.i;
                } else
                {
                    obj = com.spotify.mobile.android.util.ClientEvent.Event.m;
                }
                obj = new ClientEvent(((com.spotify.mobile.android.util.ClientEvent.Event) (obj)));
                PlaylistFragment.j(a);
                fop.a(a.k(), PlaylistFragment.c(a), ((ClientEvent) (obj)));
                PlaylistFragment.i(a);
                obj = a.k();
                s1 = PlaylistFragment.a(a).a();
                PlaylistFragment.b(a);
                for.a(((Context) (obj)), s1, flag);
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bi = new ewi() {

            private PlaylistFragment a;

            public final ListView a()
            {
                return PlaylistFragment.k(a);
            }

            public final ViewGroup b()
            {
                return a.Z.f();
            }

            public final DownloadHeaderView c()
            {
                return PlaylistFragment.f(a);
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bk = new fzs() {

            private PlaylistFragment a;

            public final void a()
            {
                a.k().startActivity((new fcv(a.k())).a(PlaylistFragment.a(a).a()).a);
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bl = new ggt() {

            private PlaylistFragment a;

            public final void a_(Uri uri)
            {
                if (uri != null && !Uri.EMPTY.equals(uri))
                {
                    PlaylistFragment.a(a, uri.toString());
                }
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bm = new gas() {

            private PlaylistFragment a;

            public final void a()
            {
                PlaylistFragment.p(a).a(StateFlags.f, false);
            }

            public final void a(gfp gfp1)
            {
                PlaylistFragment.a(a, gfp1);
                PlaylistFragment.s(a).a(PlaylistFragment.a(a).a(), PlaylistFragment.r(a).a());
                PlaylistFragment.q(a);
            }

            public final void a(String s1)
            {
                PlaylistFragment.b(a, s1);
                if (!PlaylistFragment.n(a).isShown())
                {
                    PlaylistFragment.k(a).setSelection(0);
                }
                if (!TextUtils.isEmpty(PlaylistFragment.o(a)))
                {
                    PlaylistFragment.p(a).a(StateFlags.f, true);
                    PlaylistFragment.p(a).a(StateFlags.h, false);
                } else
                {
                    PlaylistFragment.p(a).a(StateFlags.f, false);
                }
                PlaylistFragment.q(a);
            }

            public final void a(boolean flag)
            {
                PlaylistFragment.p(a).a(StateFlags.g, flag);
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bn = new gap() {

            private PlaylistFragment a;

            public final void a(boolean flag)
            {
                PlaylistFragment.t(a).a(flag);
                if (PlaylistFragment.u(a).b())
                {
                    ((ewa)PlaylistFragment.u(a).c()).a();
                }
                PlaylistFragment.g(a).b();
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bo = new android.view.View.OnClickListener() {

            private PlaylistFragment a;

            public final void onClick(View view)
            {
                view = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.U);
                PlaylistFragment.j(a);
                fop.a(a.k(), PlaylistFragment.c(a), view);
                PlaylistFragment.x(a);
                view = a.k();
                Object obj = PlaylistFragment.c(a);
                com.spotify.mobile.android.util.viewuri.ViewUri.SubView subview = com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a;
                FeatureIdentifier featureidentifier = FeatureIdentifier.z;
                FeatureIdentifier featureidentifier1 = PlaylistFragment.v(a);
                Uri uri = PlaylistFragment.w(a);
                PlaylistFragment.b(a);
                fos.a(view, ((Verified) (obj)), subview, featureidentifier, featureidentifier1, uri);
                PlaylistFragment.y(a);
                view = a.k();
                obj = com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type.b;
                fjm.a(TooltipContainer.a(view));
                Onboarding.a(((com.spotify.mobile.android.spotlets.tinkerbell.Onboarding.Type) (obj))).a(view);
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bq = new eoi() {

            private PlaylistFragment a;

            public final void a()
            {
                PlaylistFragment playlistfragment = a;
                PlaylistFragment.B(a).g();
                PlaylistFragment.A(playlistfragment);
            }

            public final void a(com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status status)
            {
                PlaylistFragment.A(a);
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        br = new an() {

            private PlaylistFragment a;

            public final da a(Bundle bundle)
            {
                return new cu(a.k(), PlaylistFragment.h(a), dny.a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                Cursor cursor = (Cursor)obj;
                if (!cursor.moveToFirst() || !duc.a(cursor))
                {
                    return;
                }
                obj = PlaylistFragment.a(a).G();
                ((dny)PlaylistFragment.a(a)).a(cursor, "");
                a.g().putString("playlist_owner_uri", PlaylistFragment.a(a).w());
                a.g().putString("title", PlaylistFragment.a(a).b());
                if (!PlaylistFragment.C(a))
                {
                    PlaylistFragment.a(a, PlaylistFragment.a(a).D(), PlaylistFragment.a(a).E(), PlaylistFragment.a(a).F());
                    String s1 = PlaylistFragment.a(a).b();
                    ((djr)a.Z.a()).a(s1);
                } else
                {
                    ((fpe)a.k()).a(a, PlaylistFragment.a(a).b());
                }
                if (!a.Y)
                {
                    View view = PlaylistFragment.D(a);
                    int i1;
                    if (PlaylistFragment.a(a).B())
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 8;
                    }
                    view.setVisibility(i1);
                }
                ((fpe)a.k()).P_();
                a.u().a(0x7f110091, null, PlaylistFragment.E(a));
                PlaylistFragment.t(a).a(new evq(PlaylistFragment.a(a)));
                if (!TextUtils.equals(PlaylistFragment.a(a).G(), ((CharSequence) (obj))) || !PlaylistFragment.C(a) && PlaylistFragment.F(a))
                {
                    PlaylistFragment.G(a);
                }
                if (!PlaylistFragment.C(a))
                {
                    PlaylistFragment.H(a);
                }
                PlaylistFragment.p(a).a(StateFlags.b, true);
                obj = a;
                PlaylistFragment.I(a);
                PlaylistFragment.A(((PlaylistFragment) (obj)));
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bs = new an() {

            private PlaylistFragment a;

            public final da a(Bundle bundle)
            {
                bundle = dtt.a(PlaylistFragment.a(a).a(), PlaylistFragment.o(a));
                return new cu(a.k(), bundle, dnz.a, null, PlaylistFragment.r(a).a());
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                boolean flag = true;
                obj = (Cursor)obj;
                if (duc.a(((Cursor) (obj))))
                {
                    PlaylistFragment.J(a).b();
                    PlaylistFragment.K(a).b(((Cursor) (obj)));
                    PlaylistFragment.p(a).a(StateFlags.c, true);
                    StateFlags stateflags;
                    if (!TextUtils.isEmpty(PlaylistFragment.o(a)))
                    {
                        PlaylistFragment.p(a).a(StateFlags.d, true);
                        PlaylistFragment.p(a).a(StateFlags.h, true);
                    } else
                    {
                        PlaylistFragment.p(a).a(StateFlags.d, false);
                    }
                    obj = PlaylistFragment.p(a);
                    stateflags = StateFlags.e;
                    if (PlaylistFragment.K(a).getCount() == 0)
                    {
                        flag = false;
                    }
                    ((gbz) (obj)).a(stateflags, flag);
                }
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bt = new gca(EnumSet.of(StateFlags.l, StateFlags.e, StateFlags.h, StateFlags.d)) {

            private PlaylistFragment b;

            public final void a(EnumSet enumset, EnumSet enumset1)
            {
                if (!enumset.contains(StateFlags.l))
                {
                    return;
                } else
                {
                    PlaylistFragment.a(b, enumset.contains(StateFlags.e), enumset.contains(StateFlags.d));
                    return;
                }
            }

            
            {
                b = PlaylistFragment.this;
                super(enumset);
            }
        };
        bu = new gca(EnumSet.of(StateFlags.l, StateFlags.e)) {

            private PlaylistFragment b;

            public final void a(EnumSet enumset, EnumSet enumset1)
            {
                if (!enumset.contains(StateFlags.l) || !enumset.contains(StateFlags.e))
                {
                    PlaylistFragment.g(b).b(false);
                    return;
                } else
                {
                    PlaylistFragment.g(b).b(true);
                    return;
                }
            }

            
            {
                b = PlaylistFragment.this;
                super(enumset);
            }
        };
        bv = new gca(EnumSet.of(StateFlags.g, StateFlags.f)) {

            private PlaylistFragment b;

            public final void a(EnumSet enumset, EnumSet enumset1)
            {
                if (enumset.contains(StateFlags.g) || enumset.contains(StateFlags.f))
                {
                    b.Z.h();
                    return;
                } else
                {
                    b.Z.i();
                    return;
                }
            }

            
            {
                b = PlaylistFragment.this;
                super(enumset);
            }
        };
        bw = new gca(EnumSet.of(StateFlags.b, StateFlags.c, StateFlags.i)) {

            private PlaylistFragment b;

            public final void a(EnumSet enumset, EnumSet enumset1)
            {
                if (!enumset.contains(StateFlags.i))
                {
                    if (enumset.contains(StateFlags.b) && enumset.contains(StateFlags.c))
                    {
                        enumset = b.g();
                        enumset1 = new Bundle();
                        if (enumset == null)
                        {
                            enumset = enumset1;
                        }
                        enumset = (Bundle)enumset;
                        if (PlaylistFragment.L(b) != -1)
                        {
                            PlaylistFragment.k(b).setSelectionFromTop(PlaylistFragment.L(b), 0);
                            PlaylistFragment.p(b).a(StateFlags.j, true);
                            PlaylistFragment.a(b, -1);
                        } else
                        {
                            PlaylistFragment.M(b);
                            PlaylistFragment.p(b).a(StateFlags.k, true);
                        }
                        if (enumset.getBoolean("autoplay", false))
                        {
                            enumset.putBoolean("autoplay", false);
                            if (PlaylistFragment.N(b) == -1 && !PlaylistFragment.K(b).isEmpty())
                            {
                                PlaylistFragment.b(b, 0);
                            }
                            if (PlaylistFragment.N(b) != -1)
                            {
                                int i1 = PlaylistFragment.c(b, PlaylistFragment.N(b));
                                PlaylistFragment.d(b, i1);
                                PlaylistFragment.b(b, -1);
                            }
                        }
                        PlaylistFragment.p(b).a(StateFlags.i, true);
                    }
                } else
                if (enumset1.contains(StateFlags.i))
                {
                    PlaylistFragment.O(b).b();
                    PlaylistFragment.p(b).a(StateFlags.l, true);
                    return;
                }
            }

            
            {
                b = PlaylistFragment.this;
                super(enumset);
            }
        };
        by = new an() {

            private PlaylistFragment a;

            public final da a(Bundle bundle)
            {
                return new cu(a.k(), dub.a(PlaylistFragment.a(a).w()), PlaylistFragment.b, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (((Cursor) (obj)).moveToFirst())
                {
                    String s1 = ((Cursor) (obj)).getString(0);
                    if (!TextUtils.equals(PlaylistFragment.S(a), s1))
                    {
                        PlaylistFragment.c(a, s1);
                        if (!PlaylistFragment.C(a))
                        {
                            PlaylistFragment.H(a);
                            PlaylistFragment.T(a).c(s1.toUpperCase(a.l().getConfiguration().locale));
                        }
                    }
                    if (!PlaylistFragment.C(a))
                    {
                        Object obj1 = ((Cursor) (obj)).getString(1);
                        obj = ((Cursor) (obj)).getString(2);
                        if (!TextUtils.isEmpty(((CharSequence) (obj1))))
                        {
                            obj = obj1;
                        }
                        obj1 = PlaylistFragment.T(a).b;
                        if (!TextUtils.equals(PlaylistFragment.U(a), ((CharSequence) (obj))) || !TextUtils.isEmpty(((CharSequence) (obj))) && ((ImageView) (obj1)).getDrawable() == null)
                        {
                            PlaylistFragment.d(a, ((String) (obj)));
                            ((gft)dmz.a(gft)).a().a(dto.a(((String) (obj)))).a(dff.f(a.k())).b(dff.f(a.k())).a(gft.a(((ImageView) (obj1))));
                        }
                    }
                }
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
        bz = new ggf() {

            private PlaylistFragment a;

            public final void a()
            {
                PlaylistFragment.a(a, -1);
            }

            public final void a(int i1)
            {
                if (PlaylistFragment.k(a) != null)
                {
                    if (i1 > 0)
                    {
                        PlaylistFragment.a(a, i1);
                        gbz gbz1 = PlaylistFragment.p(a);
                        StateFlags stateflags = StateFlags.i;
                        if (gbz1.a.contains(stateflags))
                        {
                            PlaylistFragment.k(a).setSelectionFromTop(PlaylistFragment.L(a), 0);
                        }
                    }
                    if (a.g() != null && a.g().getBoolean("autoplay", false))
                    {
                        PlaylistFragment.b(a, i1);
                    }
                }
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        };
    }

    static void A(PlaylistFragment playlistfragment)
    {
        if (!playlistfragment.aP)
        {
            com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status status;
            if (playlistfragment.aF.c())
            {
                status = playlistfragment.aF.g();
            } else
            {
                status = com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.a;
            }
            playlistfragment.aG = status;
            if (eoh.a(playlistfragment.aG) && playlistfragment.H())
            {
                playlistfragment.L();
                playlistfragment.Z.a(playlistfragment.aA);
                if (!playlistfragment.Y)
                {
                    playlistfragment.Z.b(false);
                }
            } else
            {
                playlistfragment.Z.a(null);
            }
            playlistfragment.K();
        }
    }

    static eoh B(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aF;
    }

    static boolean C(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aP;
    }

    static View D(PlaylistFragment playlistfragment)
    {
        return playlistfragment.as;
    }

    static an E(PlaylistFragment playlistfragment)
    {
        return playlistfragment.by;
    }

    static boolean F(PlaylistFragment playlistfragment)
    {
        return playlistfragment.J();
    }

    static void G(PlaylistFragment playlistfragment)
    {
        android.graphics.drawable.Drawable drawable = dff.e(playlistfragment.k());
        if (!playlistfragment.aP)
        {
            gwb gwb1 = ((gft)dmz.a(gft)).a().a(dto.a(playlistfragment.ae.G())).a(0x7f0c0083, 0x7f0c0083).b().b(drawable);
            if (playlistfragment.J())
            {
                gwb1.a(drawable);
            } else
            {
                gwb1.a();
            }
            if (dgn.a(playlistfragment.k()))
            {
                gwb1.a(gft.a(playlistfragment.Z.c(), (dfr)playlistfragment.Z.g()));
            } else
            {
                gwb1.a(playlistfragment.Z.c(), null);
            }
            ((gft)dmz.a(gft)).a().a(dto.a(playlistfragment.ae.G())).a(dgf.a).a(playlistfragment.Z.d(), null);
            playlistfragment.K();
        }
        ((gft)dmz.a(gft)).a().a(dto.a(playlistfragment.ae.G())).a(drawable).b(drawable).a(0x7f0c0083, 0x7f0c0083).b().a(playlistfragment.az.d(), null);
    }

    static void H(PlaylistFragment playlistfragment)
    {
        String s2 = null;
        String s1;
        StringBuilder stringbuilder;
        if (playlistfragment.ae.z() && playlistfragment.ae.g() >= 0)
        {
            s1 = playlistfragment.l().getQuantityString(0x7f09000b, playlistfragment.ae.g(), new Object[] {
                Integer.valueOf(playlistfragment.ae.g())
            });
        } else
        {
            s1 = null;
        }
        if (!TextUtils.isEmpty(playlistfragment.ar))
        {
            s2 = playlistfragment.a(0x7f0803fb, new Object[] {
                playlistfragment.ar
            }).toUpperCase(playlistfragment.l().getConfiguration().locale);
        }
        stringbuilder = new StringBuilder();
        if (playlistfragment.ae.n())
        {
            playlistfragment.at.setVisibility(8);
        } else
        {
            playlistfragment.at.setVisibility(0);
            playlistfragment.at.setChecked(playlistfragment.ae.l());
        }
        if (!TextUtils.isEmpty(s1))
        {
            stringbuilder.append(s1);
        }
        if (!TextUtils.isEmpty(s2))
        {
            if (stringbuilder.length() != 0)
            {
                if (playlistfragment.Y)
                {
                    stringbuilder.append('\n');
                } else
                {
                    stringbuilder.append(" \u2022 ");
                }
            }
            stringbuilder.append(s2);
        }
        if (stringbuilder.length() != 0)
        {
            ((djr)playlistfragment.Z.a()).a().setVisibility(0);
            ((djr)playlistfragment.Z.a()).b(stringbuilder.toString());
            return;
        } else
        {
            ((djr)playlistfragment.Z.a()).a().setVisibility(8);
            return;
        }
    }

    private boolean H()
    {
        return ((Integer)aK.a(fys.D)).intValue() != 0 && ae.C();
    }

    static com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status I(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aG;
    }

    static gjf J(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aX;
    }

    private boolean J()
    {
        return Z.c().getDrawable() == null;
    }

    static fts K(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aJ;
    }

    private void K()
    {
        if (Z == null)
        {
            return;
        }
        if (eoh.a(aG) && H())
        {
            Z.c().setOnClickListener(new android.view.View.OnClickListener() {

                private PlaylistFragment a;

                public final void onClick(View view)
                {
                    a.k().startActivity((new fcv(a.k())).a(PlaylistFragment.a(a).a()).a);
                }

            
            {
                a = PlaylistFragment.this;
                super();
            }
            });
            return;
        } else
        {
            CoverImageActivity.a(k(), Z.c(), dto.a(ae.G()));
            return;
        }
    }

    static int L(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ap;
    }

    private void L()
    {
        if (!aP) goto _L2; else goto _L1
_L1:
        return;
_L2:
        final class _cls24
        {

            static final int a[];

            static 
            {
                a = new int[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.values().length];
                try
                {
                    a[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.c.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.d.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.e.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[com.spotify.mobile.android.spotlets.collection.service.AnnotateService.Status.f.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        switch (_cls24.a[aG.ordinal()])
        {
        default:
            return;

        case 2: // '\002'
        case 3: // '\003'
            TextView textview = aC;
            int i1;
            if (aD)
            {
                i1 = 0x7f0802ff;
            } else
            {
                i1 = 0x7f080300;
            }
            textview.setText(i1);
            aB.setVisibility(0);
            return;

        case 4: // '\004'
            aC.setText(0x7f0802fe);
            aB.setVisibility(8);
            return;

        case 1: // '\001'
            break;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    static void M(PlaylistFragment playlistfragment)
    {
        if (playlistfragment.Y)
        {
            int i1 = playlistfragment.ax.getHeight();
            playlistfragment.ao.setSelectionFromTop(0, -i1);
            return;
        }
        if (playlistfragment.ae.v() || !gex.a(playlistfragment.aK))
        {
            playlistfragment.Z.b(false);
            return;
        } else
        {
            playlistfragment.Z.a(false);
            return;
        }
    }

    static int N(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aq;
    }

    static LoadingView O(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ay;
    }

    static List P(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aa;
    }

    static gfp Q(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ac;
    }

    static gas R(PlaylistFragment playlistfragment)
    {
        return playlistfragment.bm;
    }

    static String S(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ar;
    }

    static gbg T(PlaylistFragment playlistfragment)
    {
        return playlistfragment.au;
    }

    static String U(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aM;
    }

    static int a(PlaylistFragment playlistfragment, int i1)
    {
        playlistfragment.ap = i1;
        return i1;
    }

    public static PlaylistFragment a(Flags flags)
    {
        PlaylistFragment playlistfragment = new PlaylistFragment();
        fyw.a(playlistfragment, flags);
        return playlistfragment;
    }

    static dob a(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ae;
    }

    static gfp a(PlaylistFragment playlistfragment, gfp gfp1)
    {
        playlistfragment.aO = gfp1;
        return gfp1;
    }

    static String a(PlaylistFragment playlistfragment, String s1)
    {
        playlistfragment.aS = s1;
        return s1;
    }

    static void a(PlaylistFragment playlistfragment, String s1, long l1, int i1)
    {
        Object obj = Html.fromHtml(s1).toString();
        s1 = playlistfragment.au;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            ((gbg) (s1)).a.setVisibility(8);
        } else
        {
            ((gbg) (s1)).a.setVisibility(0);
            ((gbg) (s1)).a.setText(((CharSequence) (obj)));
            ((gbg) (s1)).a.setMaxLines(4);
            ((gbg) (s1)).a.setEllipsize(android.text.TextUtils.TruncateAt.END);
            obj = ((gbg) (s1)).b.getLayoutParams();
            int j1 = s1.getResources().getDimensionPixelSize(0x7f0c00e8);
            obj.width = j1;
            obj.height = j1;
            ((gbg) (s1)).b.setLayoutParams(((android.view.ViewGroup.LayoutParams) (obj)));
        }
        playlistfragment.au.a(l1);
        playlistfragment.au.a(i1);
    }

    static void a(PlaylistFragment playlistfragment, boolean flag)
    {
        Object obj;
        if (flag)
        {
            obj = com.spotify.mobile.android.util.ClientEvent.Event.i;
        } else
        {
            obj = com.spotify.mobile.android.util.ClientEvent.Event.m;
        }
        obj = new ClientEvent(((com.spotify.mobile.android.util.ClientEvent.Event) (obj)));
        fop.a(playlistfragment.k(), playlistfragment.ah, ((ClientEvent) (obj)));
        for.a(playlistfragment.k(), playlistfragment.ae.a(), flag);
    }

    static void a(PlaylistFragment playlistfragment, boolean flag, boolean flag1)
    {
        if (flag)
        {
            playlistfragment.aI.b(new int[] {
                0
            });
            playlistfragment.aI.a(new int[] {
                1
            });
            playlistfragment.az.setVisibility(8);
        } else
        {
            if (flag1)
            {
                playlistfragment.aI.a(new int[] {
                    0
                });
                playlistfragment.av.a(playlistfragment.a(0x7f0803de, new Object[] {
                    playlistfragment.aN
                }));
                playlistfragment.aI.b(new int[] {
                    1
                });
                playlistfragment.az.setVisibility(8);
                return;
            }
            playlistfragment.aI.a(new int[] {
                0
            });
            playlistfragment.aI.a(new int[] {
                1
            });
            playlistfragment.az.setVisibility(0);
            if (!playlistfragment.aP && !playlistfragment.Y)
            {
                playlistfragment.Z.a(false);
                return;
            }
        }
    }

    static int b(PlaylistFragment playlistfragment, int i1)
    {
        playlistfragment.aq = i1;
        return i1;
    }

    static Flags b(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aK;
    }

    static String b(PlaylistFragment playlistfragment, String s1)
    {
        playlistfragment.aN = s1;
        return s1;
    }

    static boolean b(PlaylistFragment playlistfragment, boolean flag)
    {
        playlistfragment.aD = flag;
        return flag;
    }

    static int c(PlaylistFragment playlistfragment, int i1)
    {
        int j1;
        if (playlistfragment.aI.a(0))
        {
            j1 = 1;
        } else
        {
            j1 = 0;
        }
        return j1 + playlistfragment.aI.e(0) + i1;
    }

    static Verified c(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ah;
    }

    static String c(PlaylistFragment playlistfragment, String s1)
    {
        playlistfragment.ar = s1;
        return s1;
    }

    static Optional d(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aZ;
    }

    static String d(PlaylistFragment playlistfragment, String s1)
    {
        playlistfragment.aM = s1;
        return s1;
    }

    static void d(PlaylistFragment playlistfragment, int i1)
    {
        View view = playlistfragment.aI.getView(i1, null, null);
        long l1 = playlistfragment.aI.getItemId(i1);
        playlistfragment.a(playlistfragment.z_(), view, i1 + playlistfragment.ao.getHeaderViewsCount(), l1);
    }

    static ftg e(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aI;
    }

    static DownloadHeaderView f(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aw;
    }

    static ewh g(PlaylistFragment playlistfragment)
    {
        return playlistfragment.bj;
    }

    static Uri h(PlaylistFragment playlistfragment)
    {
        return playlistfragment.af;
    }

    static for i(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aV;
    }

    static fop j(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aT;
    }

    static ListView k(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ao;
    }

    static boolean l(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aj;
    }

    static boolean m(PlaylistFragment playlistfragment)
    {
        playlistfragment.aj = true;
        return true;
    }

    static FilterHeaderView n(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ax;
    }

    static String o(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aN;
    }

    static gbz p(PlaylistFragment playlistfragment)
    {
        return playlistfragment.an;
    }

    static void q(PlaylistFragment playlistfragment)
    {
        playlistfragment.u().b(0x7f110093, null, playlistfragment.bs);
    }

    static gfp r(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aO;
    }

    static fdn s(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ad;
    }

    static evv t(PlaylistFragment playlistfragment)
    {
        return playlistfragment.bf;
    }

    static Optional u(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ai;
    }

    static FeatureIdentifier v(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aL;
    }

    static Uri w(PlaylistFragment playlistfragment)
    {
        return playlistfragment.ag;
    }

    static fos x(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aU;
    }

    static fjm y(PlaylistFragment playlistfragment)
    {
        return playlistfragment.aW;
    }

    static void z(PlaylistFragment playlistfragment)
    {
        playlistfragment.L();
    }

    public final void A()
    {
        super.A();
        aQ.b();
    }

    public final void B()
    {
        super.B();
        aX.c();
        if (aZ.b())
        {
            ((frs)aZ.c()).c();
        }
        bj.a();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return (new StringBuilder("playlist:")).append(ae.a()).toString();
    }

    public final Uri a()
    {
        return Uri.parse(ae.a());
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Object obj;
        aK = fyw.a(this);
        obj = an;
        bundle = ((gbz) (obj)).d;
        bundle;
        JVM INSTR monitorenter ;
        if (((gbz) (obj)).b == null)
        {
            break MISSING_BLOCK_LABEL_1299;
        }
        viewgroup = EnumSet.copyOf(((gbz) (obj)).b);
_L1:
        if (!viewgroup.isEmpty())
        {
            viewgroup.clear();
            ((gbz) (obj)).a(viewgroup);
        }
        int i1;
        boolean flag;
        if (ggi.b(k()) && !aP)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Y = flag;
        viewgroup = k();
        as = gad.a(viewgroup, null);
        as.setOnClickListener(bo);
        ax = FilterHeaderView.a(layoutinflater, aN, aa, aO, bm);
        ax.a(ah, "playlist");
        if (((Boolean)aK.a(fys.aa)).booleanValue() && ((String)aK.a(fys.f)).equals("Enabled"))
        {
            obj = ((efg)dmz.a(efg)).a(ae.a());
            if (obj != null)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            aY = flag;
            if (aY)
            {
                bundle = new SponsoredHeaderView(viewgroup);
                bundle.a = new efm(viewgroup) {

                    private Context a;
                    private PlaylistFragment b;

                    public final void a(SponsorshipAdData sponsorshipaddata)
                    {
                        if (PlaylistFragment.l(b))
                        {
                            return;
                        } else
                        {
                            dmz.a(edr);
                            dne dne = edr.a("", "sponsored-context", sponsorshipaddata.getLineItemId(), sponsorshipaddata.getCreativeId(), "event_viewed", "");
                            dmz.a(fop);
                            fop.a(a, dne);
                            dmz.a(edp);
                            edp.a(sponsorshipaddata.getImpression());
                            dmz.a(edp);
                            edp.a(sponsorshipaddata.getThirdPartyImpression());
                            PlaylistFragment.m(b);
                            return;
                        }
                    }

                    public final void a(SponsorshipAdData sponsorshipaddata, String s1)
                    {
                        if (PlaylistFragment.l(b))
                        {
                            return;
                        } else
                        {
                            dmz.a(edr);
                            sponsorshipaddata = edr.a("", "sponsored-context", sponsorshipaddata.getLineItemId(), sponsorshipaddata.getCreativeId(), s1);
                            dmz.a(fop);
                            fop.a(a, sponsorshipaddata);
                            PlaylistFragment.m(b);
                            return;
                        }
                    }

            
            {
                b = PlaylistFragment.this;
                a = context;
                super();
            }
                };
                bundle.b = ((com.spotify.mobile.android.spotlets.ads.model.Sponsorship) (obj));
                Object obj1 = ae.a();
                Object obj2 = (efg)dmz.a(efg);
                obj = new efj(bundle) {

                    private SponsoredHeaderView a;

                    public final void a(Response response, Object obj4)
                    {
                        response = (SponsorshipAdData)obj4;
                        obj4 = a;
                        obj4.c = response;
                        if (((SponsoredHeaderView) (obj4)).c != null)
                        {
                            ((Activity)((SponsoredHeaderView) (obj4)).getContext()).runOnUiThread(new com.spotify.mobile.android.spotlets.ads.sponsorship.SponsoredHeaderView._cls5(((SponsoredHeaderView) (obj4))));
                        }
                    }

                    public final void a(com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                    {
                        SponsoredHeaderView sponsoredheaderview = a;
                        ((Activity)sponsoredheaderview.getContext()).runOnUiThread(new com.spotify.mobile.android.spotlets.ads.sponsorship.SponsoredHeaderView._cls6(sponsoredheaderview));
                        errorcause.toString();
                    }

            
            {
                a = sponsoredheaderview;
                super();
            }
                };
                obj2 = ((efg) (obj2)).a;
                if (obj1 != null && ((String) (obj1)).length() != 0)
                {
                    synchronized (((efi) (obj2)).b)
                    {
                        obj2.a = ((efi) (obj2)).a + 1;
                    }
                    obj1 = RequestBuilder.get(String.format("%s/%s", new Object[] {
                        "hm://sponsoredplaylist/v1/sponsored", obj1
                    })).build();
                    ((efi) (obj2)).a().resolve(((com.spotify.cosmos.router.Request) (obj1)), new efi._cls1(((efi) (obj2)), ((efi) (obj2)).b(), com/spotify/mobile/android/spotlets/ads/model/SponsorshipAdData, ((efj) (obj))));
                }
                al = bundle;
            }
        }
        at = dgp.a(k(), l().getString(0x7f080303), l().getString(0x7f080302));
        at.setEllipsize(android.text.TextUtils.TruncateAt.END);
        at.setOnClickListener(bc);
        au = new gbg(k());
        au.a(bd);
        au.b(b(0x7f080301));
        if (aP)
        {
            Z = dja.c(k()).b().b(at, 0).a(al).c(ax).a(au).a(false).a(this);
            ax.setBackgroundColor(dgo.b(viewgroup, 0x7f0101c6));
        } else
        if (Y)
        {
            Z = dja.b(k()).b().b(at, 0).c(ax).a(al).a(au).a(false).a(this);
            ax.setBackgroundColor(dgo.b(viewgroup, 0x7f0101c6));
        } else
        {
            Z = dja.a(k()).b().b(at, 0).c(ax).b(as).a(al).a(au).a(true).a(this);
            Z.a(dgo.b(viewgroup, 0x7f0101c6));
            ((djr)Z.a()).a(ae.b());
        }
        bundle = new FrameLayout(viewgroup);
        bundle.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        bundle.addView(Z.b());
        viewgroup = new View(viewgroup);
        viewgroup.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        bundle.addView(viewgroup);
        FilterHeaderView.a(viewgroup, ax);
        viewgroup = ((djr)Z.a()).a();
        viewgroup.setIncludeFontPadding(false);
        viewgroup.setMaxLines(2);
        viewgroup.setEllipsize(android.text.TextUtils.TruncateAt.END);
        viewgroup.setLineSpacing(dft.a(4F, l()), 1.0F);
        bundle.setBackgroundColor(dgo.b(k(), 0x1010054));
        ao = Z.e().a();
        ao.setFastScrollEnabled(true);
        viewgroup = gaw.b(k());
        ao.addHeaderView(viewgroup, null, false);
        aw = (DownloadHeaderView)gaw.a(k());
        aw.c = bn;
        aw.d = ai;
        viewgroup.addView(aw);
        obj = k();
        viewgroup = new EmptyView(((Context) (obj)));
        viewgroup.a(((Context) (obj)).getString(0x7f0803fe));
        viewgroup.b(((Context) (obj)).getString(0x7f0803fd));
        obj1 = viewgroup.d();
        if (ggi.b(((Context) (obj))))
        {
            i1 = 8;
        } else
        {
            i1 = 0;
        }
        ((ImageView) (obj1)).setVisibility(i1);
        viewgroup.a(l().getDimensionPixelSize(0x7f0c0083));
        viewgroup.a();
        flag = ((Boolean)aK.a(fys.N)).booleanValue();
        obj = dgp.b(((Context) (obj)), viewgroup);
        if (flag)
        {
            i1 = 0x7f0803e0;
        } else
        {
            i1 = 0x7f0803df;
        }
        ((Button) (obj)).setText(i1);
        ((Button) (obj)).setOnClickListener(new android.view.View.OnClickListener(flag) {

            private boolean a;
            private PlaylistFragment b;

            public final void onClick(View view)
            {
                u u1 = b.k();
                u u2 = b.k();
                if (a)
                {
                    view = "spotify:hub:music";
                } else
                {
                    view = "spotify:app:browse";
                }
                u1.startActivity(gms.a(u2, view).a);
            }

            
            {
                b = PlaylistFragment.this;
                a = flag;
                super();
            }
        });
        viewgroup.a(((View) (obj)));
        viewgroup.setClickable(true);
        az = viewgroup;
        bundle.addView(az);
        az.setVisibility(8);
        viewgroup = Z.b();
        viewgroup.setVisibility(4);
        ay = LoadingView.a(layoutinflater, k(), viewgroup);
        bundle.addView(ay);
        an.a(bv);
        an.a(bt);
        an.a(bw);
        an.a(bu);
        aJ = new fts(k(), bb, ba, aK);
        av = eoo.a(k(), "");
        aI = new ftg(k());
        viewgroup = new ftr(k());
        aI.e = viewgroup;
        if (aZ.b())
        {
            viewgroup = ((frs)aZ.c()).a(k().getLayoutInflater(), ao, be);
            if (viewgroup.b())
            {
                aI.a(new ftm((View)viewgroup.c(), true), null, 2);
            }
        }
        if (gex.a(aK))
        {
            viewgroup = null;
        } else
        {
            viewgroup = b(0x7f08046d);
        }
        aI.a(aJ, viewgroup, 0);
        aI.a(new ftm(av, false), null, 1);
        aI.a(new int[] {
            1
        });
        a(((android.widget.ListAdapter) (aI)));
        if (!aP)
        {
            aA = (LinearLayout)layoutinflater.inflate(0x7f03011a, null);
            aB = aA.findViewById(0x7f1103a1);
            aC = (TextView)aA.findViewById(0x7f11049c);
        }
        layoutinflater = k();
        viewgroup = ((giq)dmz.a(giq)).b(layoutinflater);
        obj = bi;
        obj1 = ah;
        obj2 = aK;
        new ewg();
        bj = new ewh(layoutinflater, ((ewi) (obj)), viewgroup, ((Verified) (obj1)), ((Flags) (obj2)));
        bj.a(am);
        return bundle;
        viewgroup = EnumSet.copyOf(((gbz) (obj)).a);
          goto _L1
        layoutinflater;
        bundle;
        JVM INSTR monitorexit ;
        throw layoutinflater;
        layoutinflater;
        obj3;
        JVM INSTR monitorexit ;
        throw layoutinflater;
    }

    public final String a(Context context, Flags flags)
    {
        if (ae != null)
        {
            return ae.b();
        } else
        {
            return context.getString(0x7f0803fc);
        }
    }

    public final void a(Bundle bundle)
    {
        Object obj;
        Object obj1;
        Object obj2;
        Flags flags;
        boolean flag;
        boolean flag1 = true;
        super.a(bundle);
        ad = (fdn)dmz.a(fdn);
        obj2 = g();
        aN = ((Bundle) (obj2)).getString("filter");
        aO = gfp.a(((Bundle) (obj2)).getString("sort_order"), aa);
        obj = aO;
        obj1 = ab;
        if (obj == null)
        {
            obj = obj1;
        }
        aO = (gfp)obj;
        aP = ((Bundle) (obj2)).getBoolean("is_sub_fragment");
        aK = fyw.a(this);
        aL = gnl.a(this);
        ae = new dny(((Bundle) (obj2)).getString("playlist_uri"), ((Bundle) (obj2)).getString("playlist_owner_uri"), ((Bundle) (obj2)).getString("title"));
        af = dtt.a(ae.a());
        ag = dtt.b(ae.a());
        aa.clear();
        aa.add(new gfp("name", 0x7f080524));
        aa.add(ac);
        aa.add(new gfp("artist_name", 0x7f08051e));
        aa.add(new gfp("album_name", 0x7f08051d));
        aa.add(ab);
        aO = ad.a(ae.a(), aO, aa);
        an.a(bx);
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            aN = bundle.getString("filter");
        }
        obj = aN;
        if (obj == null)
        {
            obj = "";
        }
        aN = (String)obj;
        if (!aP)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
        ap = -1;
        if (bundle == null)
        {
            obj = ((Bundle) (obj2)).getString("lookup_track_uri");
            if (obj != null)
            {
                (new gge(k(), u(), 0x7f110092, bz)).a(ag, ((String) (obj)), aO.a());
            }
        } else
        {
            ap = bundle.getInt("list_position", -1);
        }
        if (bundle != null)
        {
            aj = bundle.getBoolean("sponsorship_impression_logged");
        }
        aH = new gbv();
        ah = ViewUri.aj.a(ae.a());
        aQ = ggn.a(k(), ah);
        aX = gjf.a(k(), ah.toString());
        aX.c(bundle);
        aF = new eoh(k(), ae.a(), bq);
        obj = new frq(k(), new frr() {

            private PlaylistFragment a;

            public final void a(fjn fjn1)
            {
                if (!a.Y && !a.Z.e().c())
                {
                    fjn1.b = PlaylistFragment.k(a);
                    return;
                } else
                {
                    fjn1.b = null;
                    return;
                }
            }

            public final void b(fjn fjn1)
            {
                fjn1.c = a.Z.e();
            }

            
            {
                a = PlaylistFragment.this;
                super();
            }
        });
        dmz.a(frl);
        obj1 = k();
        obj2 = ah;
        flags = aK;
        if (bundle == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (!gex.a(flags)) goto _L2; else goto _L1
_L1:
        obj = Optional.e();
_L8:
        aZ = ((Optional) (obj));
        new evw();
        bf = evw.a(aK, bg, bh);
        ak = new evx();
        ai = ewb.a(k(), aK, ah);
        if (bundle == null)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        am = flag;
        return;
_L2:
        frl._cls1.a[((OnDemandUpsellVariationFlag)flags.a(fys.aK)).ordinal()];
        JVM INSTR tableswitch 1 4: default 780
    //                   1 790
    //                   2 795
    //                   3 810
    //                   4 824;
           goto _L3 _L4 _L5 _L6 _L7
_L7:
        break MISSING_BLOCK_LABEL_824;
_L3:
        obj = null;
_L9:
        obj = Optional.c(obj);
          goto _L8
_L4:
        obj = null;
          goto _L9
_L5:
        obj = frl.a(((Context) (obj1)), ((Verified) (obj2)), flags, flag, ((frq) (obj)));
          goto _L9
_L6:
        obj = frl.b(((Context) (obj1)), ((Verified) (obj2)), flags, flag);
          goto _L9
        obj = frl.a(((Context) (obj1)), ((Verified) (obj2)), flags, flag);
          goto _L9
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        b(menu);
    }

    public final void a(View view, Bundle bundle)
    {
        super.a(view, bundle);
        view = an;
        bundle = StateFlags.a;
        view.a();
        view.a(bundle, true);
        view.a();
    }

    public final void a(ListView listview, View view, int i1, long l1)
    {
        if (!gex.a(aK))
        {
            ShufflePlayHeaderView.a(aH, as);
            if (aZ.b())
            {
                ((frs)aZ.c()).a(as);
            }
            listview = ClientEventFactory.b(ag, l1);
            fop.a(k(), ah, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, listview);
            return;
        } else
        {
            listview = dtt.a(ae.a(), aN);
            fos.a(k(), ah, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, FeatureIdentifier.z, aL, listview, l1, aK);
            listview = ClientEventFactory.a(listview, l1);
            fop.a(k(), ah, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, listview);
            return;
        }
    }

    public final void b(Menu menu)
    {
        if (o()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (ae.B() && ggi.b(k()))
        {
            as = fzr.a(k(), menu, ah, FeatureIdentifier.z, aL, ag);
        }
        if (!ae.H())
        {
            break; /* Loop/switch isn't completed */
        }
        if (H())
        {
            fzt.a(k(), menu, ah, bk);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
        if (ae.y() || ae.x()) goto _L5; else goto _L4
_L4:
        Flags flags;
        u u4;
        Verified verified3;
        Object obj;
        evv evv;
        Optional optional;
        flags = aK;
        u4 = k();
        verified3 = ah;
        obj = new evq(ae);
        evv = bf;
        optional = ai;
        evz._cls2.a[((OfflineSyncSwitchVisibility)flags.a(fys.aP)).ordinal()];
        JVM INSTR tableswitch 1 2: default 200
    //                   1 823
    //                   2 833;
           goto _L6 _L7 _L8
_L8:
        break MISSING_BLOCK_LABEL_833;
_L6:
        boolean flag = evz.a(((evp) (obj)));
_L9:
        if (flag)
        {
            fzt.a(u4, menu, verified3, ((evp) (obj)).a(), ((evp) (obj)).b(), evz.a(true, evv, optional), evz.a(false, evv, optional));
        }
_L5:
        int i1;
        if (ae.C())
        {
            if (((Integer)aK.a(fys.D)).intValue() == 0)
            {
                u u1 = k();
                Verified verified = ah;
                String s1 = ae.a();
                obj = aK;
                if (!fzt.a(u1))
                {
                    menu.add(0, 0x7f1100dc, 0, 0x7f0803ac).setOnMenuItemClickListener(new fzt._cls17(u1, verified, s1, ((Flags) (obj))));
                }
            } else
            {
                fzt.a(k(), menu, ah, bk);
            }
        }
        if (ae.q())
        {
            fzr.a(k(), menu, ah, ae.a(), ae.b(), aK);
        }
        if (!ae.y() && ae.p())
        {
            fzr.a(k(), menu, ah, ae.b(), k().getString(0x7f0804c2, new Object[] {
                ae.c()
            }), ae.G(), ae.a());
        }
        if (!ae.y() && !ae.x())
        {
            if (ae.n())
            {
                u u2 = k();
                Verified verified1 = ah;
                String s2 = ae.a();
                flag = ae.r();
                if (!fzt.a(u2))
                {
                    if (flag)
                    {
                        i1 = 0x7f0803af;
                    } else
                    {
                        i1 = 0x7f0803a1;
                    }
                    menu.add(0, 0x7f1100de, 0, i1).setOnMenuItemClickListener(new fzt._cls2(u2, verified1, flag, s2));
                }
                if (!ae.r())
                {
                    u2 = k();
                    verified1 = ah;
                    s2 = ae.a();
                    flag = ae.s();
                    if (!fzt.a(u2))
                    {
                        if (flag)
                        {
                            i1 = 0x7f0803b2;
                        } else
                        {
                            i1 = 0x7f0803a9;
                        }
                        menu.add(0, 0x7f1100d9, 0, i1).setOnMenuItemClickListener(new fzt._cls3(u2, verified1, flag, s2));
                    }
                }
            } else
            {
                u u3 = k();
                Verified verified2 = ah;
                String s3 = ae.a();
                boolean flag1 = ae.l();
                if (!fzt.a(u3))
                {
                    if (flag1)
                    {
                        i1 = 0x7f0803b3;
                    } else
                    {
                        i1 = 0x7f0803ae;
                    }
                    menu.add(0, 0x7f1100de, 0, i1).setOnMenuItemClickListener(new fzt._cls14(u3, verified2, flag1, s3));
                }
            }
        }
        if (((Boolean)aK.a(fys.F)).booleanValue() && (ae.u() || !((Boolean)aK.a(fys.H)).booleanValue()) && !ae.n())
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            u2 = k();
            verified1 = ah;
            s2 = aS;
            if (!fzt.a(u2))
            {
                menu.add(0, 0x7f1100dd, 0, 0x7f0803ad).setOnMenuItemClickListener(new fzt._cls8(u2, verified1, s2));
                return;
            }
        }
          goto _L1
_L7:
        flag = evz.a(((evp) (obj)));
          goto _L9
        flag = true;
          goto _L9
    }

    public final void c()
    {
        super.c();
        aX.a();
        if (aY)
        {
            ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.d, true);
        }
        if (((Integer)aK.a(fys.D)).intValue() != 0)
        {
            aF.a();
        }
        if (((Boolean)aK.a(fys.F)).booleanValue())
        {
            aR = ggq.a(k(), u());
            aS = ((String)aK.a(fys.G)).replace("{uri}", ae.a());
            aR.a(aS, bl);
        }
        aE = edb.a(k());
        aE.a(bp);
        if (aZ.b())
        {
            ((frs)aZ.c()).a(aE);
        }
        ak.a(bf);
        evx.a(k(), ak);
        u().a(0x7f110090, null, br);
        u().a(0x7f110093, null, bs);
        if (ae.w() != null)
        {
            u().a(0x7f110091, null, by);
        }
    }

    public final void d()
    {
        super.d();
        u().a(0x7f110090);
        u().a(0x7f110093);
        u().a(0x7f110091);
        if (aE != null)
        {
            aE.b(bp);
        }
        if (aR != null)
        {
            aR.b();
        }
        if (aY)
        {
            ((AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules)).a(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.d, false);
        }
        if (aZ.b())
        {
            ((frs)aZ.c()).b(aE);
        }
        if (aF != null)
        {
            aF.i();
        }
        ak.b(bf);
        evx.b(k(), ak);
        bj.b(false);
    }

    public final void d(Bundle bundle)
    {
        super.d(bundle);
        a(z_());
        z_().setOnItemLongClickListener(new fuf(k()));
    }

    public final void e()
    {
        FilterHeaderView.a(ax);
        ay.clearAnimation();
        ViewGroup viewgroup = (ViewGroup)y();
        if (viewgroup != null)
        {
            viewgroup.removeView(ay);
        }
        an.b(bv);
        an.b(bt);
        an.b(bw);
        an.b(bu);
        super.e();
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        bundle.putString("filter", aN);
        if (ao != null && ao.getFirstVisiblePosition() > 0)
        {
            bundle.putInt("list_position", ao.getFirstVisiblePosition());
        }
        bundle.putBoolean("sponsorship_impression_logged", aj);
        aX.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.z;
    }

    public final void z()
    {
        super.z();
        ay.a();
        aQ.a();
    }

    static 
    {
        com/spotify/mobile/android/spotlets/playlist/fragments/legacy_orbit/PlaylistFragment.getSimpleName();
    }

    private class StateFlags extends Enum
    {

        public static final StateFlags a;
        public static final StateFlags b;
        public static final StateFlags c;
        public static final StateFlags d;
        public static final StateFlags e;
        public static final StateFlags f;
        public static final StateFlags g;
        public static final StateFlags h;
        public static final StateFlags i;
        public static final StateFlags j;
        public static final StateFlags k;
        public static final StateFlags l;
        private static final StateFlags m[];

        public static StateFlags valueOf(String s1)
        {
            return (StateFlags)Enum.valueOf(com/spotify/mobile/android/spotlets/playlist/fragments/legacy_orbit/PlaylistFragment$StateFlags, s1);
        }

        public static StateFlags[] values()
        {
            return (StateFlags[])m.clone();
        }

        static 
        {
            a = new StateFlags("VIEW_CREATED", 0);
            b = new StateFlags("METADATA_LOADED", 1);
            c = new StateFlags("TRACKS_LOADED", 2);
            d = new StateFlags("TRACKS_LOADED_WITH_FILTER", 3);
            e = new StateFlags("HAVE_TRACKS", 4);
            f = new StateFlags("HAVE_FILTER", 5);
            g = new StateFlags("FILTER_FOCUSED", 6);
            h = new StateFlags("FILTER_UPDATE_LOADED", 7);
            i = new StateFlags("LIST_IS_SETUP", 8);
            j = new StateFlags("LIST_SCROLLED_TO_POSITION", 9);
            k = new StateFlags("LIST_SCROLLED_TOP_OFFSET", 10);
            l = new StateFlags("LIST_IS_SHOWN", 11);
            m = (new StateFlags[] {
                a, b, c, d, e, f, g, h, i, j, 
                k, l
            });
        }

        private StateFlags(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
