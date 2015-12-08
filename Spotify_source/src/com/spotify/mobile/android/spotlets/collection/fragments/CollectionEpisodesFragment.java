// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.collection.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import com.spotify.android.paste.graphics.SpotifyIcon;
import com.spotify.android.paste.widget.SectionHeaderView;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.spotlets.offline.service.OfflineService;
import com.spotify.mobile.android.spotlets.show.adapter.EpisodeAdapter;
import com.spotify.mobile.android.ui.activity.RemoveAllEpisodesActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.view.LoadingView;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import dmz;
import eoo;
import eor;
import epg;
import fii;
import fij;
import fio;
import fip;
import fiy;
import fop;
import fos;
import fpe;
import ftg;
import ftm;
import fuf;
import fxy;
import fyw;
import fzr;
import fzs;
import fzt;
import gfp;
import ggl;
import ggn;
import gin;
import gio;
import gip;
import giq;
import gjf;
import gnl;
import u;

public final class CollectionEpisodesFragment extends Fragment
    implements fxy
{

    private static final gfp Y;
    private static final gfp Z;
    private static final gfp aa;
    private static final gip b = gip.b("episodes_media_type");
    final epg a = new epg() {

        final CollectionEpisodesFragment a;

        public final void a(Object obj)
        {
            byte byte0 = 8;
            boolean flag1 = true;
            obj = (fip)obj;
            if (a.o())
            {
                boolean flag;
                if (((fio[])((fip) (obj)).getItems()).length == 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!((fip) (obj)).isLoading() || !flag)
                {
                    CollectionEpisodesFragment.a(a).a((fio[])((fip) (obj)).getItems());
                    if (CollectionEpisodesFragment.b(a).e())
                    {
                        CollectionEpisodesFragment.b(a).b();
                    }
                    CollectionEpisodesFragment.d(a).post(new Runnable(this, flag) {

                        private boolean a;
                        private _cls1 b;

                        public final void run()
                        {
                            if (CollectionEpisodesFragment.c(b.a) != null && !a)
                            {
                                CollectionEpisodesFragment.d(b.a).onRestoreInstanceState(CollectionEpisodesFragment.c(b.a));
                                CollectionEpisodesFragment.e(b.a);
                            }
                        }

            
            {
                b = _pcls1;
                a = flag;
                super();
            }
                    });
                    if (CollectionEpisodesFragment.f(a).d())
                    {
                        CollectionEpisodesFragment.f(a).b();
                    }
                    obj = CollectionEpisodesFragment.g(a);
                    int i1;
                    if (flag)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = 8;
                    }
                    ((View) (obj)).setVisibility(i1);
                    obj = CollectionEpisodesFragment.d(a);
                    i1 = byte0;
                    if (!flag)
                    {
                        i1 = 0;
                    }
                    ((ListView) (obj)).setVisibility(i1);
                    CollectionEpisodesFragment.h(a).d(3);
                    obj = a;
                    if (flag)
                    {
                        flag1 = false;
                    }
                    ((CollectionEpisodesFragment) (obj)).a(flag1);
                    if (CollectionEpisodesFragment.i(a) && flag)
                    {
                        CollectionEpisodesFragment.j(a).a();
                    }
                }
            }
        }

        public final void a(String s1)
        {
            CollectionEpisodesFragment.f(a).b();
            Logger.c("Failed to load list of episodes %s", new Object[] {
                s1
            });
        }

            
            {
                a = CollectionEpisodesFragment.this;
                super();
            }
    };
    private fzs aA;
    private fzs aB;
    private final android.widget.AdapterView.OnItemClickListener aC = new android.widget.AdapterView.OnItemClickListener() {

        private CollectionEpisodesFragment a;

        public final void onItemClick(AdapterView adapterview, View view, int i1, long l1)
        {
            i1 = CollectionEpisodesFragment.h(a).b(i1);
            i1;
            JVM INSTR tableswitch 0 3: default 44
        //                       0 68
        //                       1 125
        //                       2 124
        //                       3 237;
               goto _L1 _L2 _L3 _L4 _L5
_L4:
            break; /* Loop/switch isn't completed */
_L1:
            throw new AssertionError((new StringBuilder("Unexpected section ")).append(i1).toString());
_L2:
            a.a(RemoveAllEpisodesActivity.a(a.k()), 1);
            CollectionEpisodesFragment.p(a);
            fop.a(a.k(), CollectionEpisodesFragment.k(a), new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.ds));
_L7:
            return;
_L3:
            for (i1 = 0; i1 < CollectionEpisodesFragment.a(a).getCount(); i1++)
            {
                adapterview = CollectionEpisodesFragment.a(a).a(i1);
                if (adapterview.m())
                {
                    OfflineService.a(a.k(), adapterview.b(), false);
                }
            }

            CollectionEpisodesFragment.p(a);
            fop.a(a.k(), CollectionEpisodesFragment.k(a), new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.O, com.spotify.mobile.android.util.ClientEvent.SubEvent.dt));
            CollectionEpisodesFragment.j(a).a();
            return;
_L5:
            if (!CollectionEpisodesFragment.i(a))
            {
                adapterview = ((AdapterView) (view.getTag()));
                if (adapterview instanceof fio)
                {
                    adapterview = (fio)adapterview;
                    CollectionEpisodesFragment.p(a);
                    fop.a(a.k(), CollectionEpisodesFragment.k(a), ClientEventFactory.a("episodes", com.spotify.mobile.android.util.ClientEvent.SubEvent.ak, adapterview.b(), Long.valueOf(l1)));
                    PlayerTrack aplayertrack[] = new PlayerTrack[CollectionEpisodesFragment.a(a).getCount() - CollectionEpisodesFragment.a(a).b];
                    int j1 = 0;
                    adapterview = com.spotify.mobile.android.spotlets.show.model.Show.MediaType.d;
                    for (i1 = 0; i1 < CollectionEpisodesFragment.a(a).getCount();)
                    {
                        fio fio1 = CollectionEpisodesFragment.a(a).a(i1);
                        view = adapterview;
                        int k1 = j1;
                        if (!fio1.isHeader())
                        {
                            if ((long)j1 == l1)
                            {
                                adapterview = fio1.s();
                            }
                            view = fio1.r();
                            aplayertrack[j1] = PlayerTrack.create(fio1.b(), view);
                            k1 = j1 + 1;
                            view = adapterview;
                        }
                        i1++;
                        adapterview = view;
                        j1 = k1;
                    }

                    view = PlayerContext.create(CollectionEpisodesFragment.k(a).toString(), aplayertrack);
                    com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).skipToIndex(0, (int)l1).suppressions(new String[] {
                        "mft"
                    }).playerOptionsOverride(false, false, false).build();
                    CollectionEpisodesFragment.q(a).play(view, playoptions);
                    if (adapterview == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c)
                    {
                        CollectionEpisodesFragment.r(a);
                        fos.a(a.k(), CollectionEpisodesFragment.k(a).toString());
                        return;
                    }
                }
            }
            if (true) goto _L7; else goto _L6
_L6:
        }

            
            {
                a = CollectionEpisodesFragment.this;
                super();
            }
    };
    private final android.view.View.OnClickListener aD = new android.view.View.OnClickListener() {

        private CollectionEpisodesFragment a;

        public final void onClick(View view)
        {
            CollectionEpisodesFragment collectionepisodesfragment = a;
            if (view.getId() == 0x7f11036c)
            {
                view = com.spotify.mobile.android.spotlets.show.model.Show.MediaType.b;
            } else
            {
                view = com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c;
            }
            CollectionEpisodesFragment.a(collectionepisodesfragment, view);
            CollectionEpisodesFragment.s(a);
            CollectionEpisodesFragment.u(a).a(CollectionEpisodesFragment.t(a));
            CollectionEpisodesFragment.u(a).b(a.a);
            CollectionEpisodesFragment.v(a).b().a(CollectionEpisodesFragment.a(), CollectionEpisodesFragment.t(a).ordinal()).b();
        }

            
            {
                a = CollectionEpisodesFragment.this;
                super();
            }
    };
    private ggl ab;
    private gjf ac;
    private boolean ad;
    private boolean ae;
    private boolean af;
    private Flags ag;
    private fii ah;
    private ftg ai;
    private EpisodeAdapter aj;
    private Verified ak;
    private Resolver al;
    private Player am;
    private String an;
    private fop ao;
    private fos ap;
    private gin aq;
    private com.spotify.mobile.android.spotlets.show.model.Show.MediaType ar;
    private ListView as;
    private LoadingView at;
    private View au;
    private View av;
    private View aw;
    private View ax;
    private Parcelable ay;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver az;

    public CollectionEpisodesFragment()
    {
        ao = (fop)dmz.a(fop);
        ap = (fos)dmz.a(fos);
        ar = com.spotify.mobile.android.spotlets.show.model.Show.MediaType.b;
        az = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private CollectionEpisodesFragment a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                boolean flag1 = false;
                if (playerstate.track() != null && TextUtils.equals(CollectionEpisodesFragment.k(a).toString(), playerstate.entityUri()))
                {
                    EpisodeAdapter episodeadapter = CollectionEpisodesFragment.a(a);
                    String s1 = playerstate.track().uri();
                    boolean flag = flag1;
                    if (playerstate.isPlaying())
                    {
                        flag = flag1;
                        if (!playerstate.isPaused())
                        {
                            flag = true;
                        }
                    }
                    episodeadapter.a(s1, flag);
                    return;
                } else
                {
                    CollectionEpisodesFragment.a(a).a(null, false);
                    return;
                }
            }

            
            {
                a = CollectionEpisodesFragment.this;
                super();
            }
        };
        aA = new fzs() {

            private CollectionEpisodesFragment a;

            public final void a()
            {
                boolean flag = true;
                if (CollectionEpisodesFragment.i(a))
                {
                    return;
                }
                CollectionEpisodesFragment.a(a, true);
                CollectionEpisodesFragment.a(a).a(CollectionEpisodesFragment.i(a));
                EpisodeAdapter episodeadapter = CollectionEpisodesFragment.a(a);
                if (!CollectionEpisodesFragment.i(a) || !CollectionEpisodesFragment.l(a))
                {
                    flag = false;
                }
                episodeadapter.b(flag);
                CollectionEpisodesFragment.m(a).setVisibility(8);
                if (CollectionEpisodesFragment.n(a))
                {
                    CollectionEpisodesFragment.h(a).b(new int[] {
                        0, 1, 2
                    });
                }
                ((fpe)a.k()).P_();
            }

            
            {
                a = CollectionEpisodesFragment.this;
                super();
            }
        };
        aB = new fzs() {

            private CollectionEpisodesFragment a;

            public final void a()
            {
                if (!CollectionEpisodesFragment.i(a))
                {
                    return;
                }
                CollectionEpisodesFragment.a(a, false);
                CollectionEpisodesFragment.a(a).a(CollectionEpisodesFragment.i(a));
                CollectionEpisodesFragment.a(a).b(CollectionEpisodesFragment.i(a));
                if (CollectionEpisodesFragment.l(a) && fiy.c(CollectionEpisodesFragment.o(a)))
                {
                    CollectionEpisodesFragment.m(a).setVisibility(0);
                }
                if (CollectionEpisodesFragment.n(a))
                {
                    CollectionEpisodesFragment.h(a).a(new int[] {
                        0, 1, 2
                    });
                }
                ((fpe)a.k()).P_();
            }

            
            {
                a = CollectionEpisodesFragment.this;
                super();
            }
        };
    }

    private void H()
    {
        boolean flag1 = true;
        View view = av;
        boolean flag;
        if (ar == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setSelected(flag);
        view = aw;
        if (ar == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        view.setSelected(flag);
    }

    public static CollectionEpisodesFragment a(Flags flags, String s1, Filter filter)
    {
        Bundle bundle = new Bundle();
        CollectionEpisodesFragment collectionepisodesfragment = new CollectionEpisodesFragment();
        bundle.putString("username", s1);
        bundle.putInt("filter", filter.ordinal());
        collectionepisodesfragment.f(bundle);
        fyw.a(collectionepisodesfragment, flags);
        return collectionepisodesfragment;
    }

    static EpisodeAdapter a(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.aj;
    }

    static com.spotify.mobile.android.spotlets.show.model.Show.MediaType a(CollectionEpisodesFragment collectionepisodesfragment, com.spotify.mobile.android.spotlets.show.model.Show.MediaType mediatype)
    {
        collectionepisodesfragment.ar = mediatype;
        return mediatype;
    }

    static gip a()
    {
        return b;
    }

    static boolean a(CollectionEpisodesFragment collectionepisodesfragment, boolean flag)
    {
        collectionepisodesfragment.ad = flag;
        return flag;
    }

    static gjf b(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ac;
    }

    static Parcelable c(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ay;
    }

    static ListView d(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.as;
    }

    static Parcelable e(CollectionEpisodesFragment collectionepisodesfragment)
    {
        collectionepisodesfragment.ay = null;
        return null;
    }

    static LoadingView f(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.at;
    }

    static View g(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.au;
    }

    static ftg h(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ai;
    }

    static boolean i(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ad;
    }

    static fzs j(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.aB;
    }

    static Verified k(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ak;
    }

    static boolean l(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.af;
    }

    static View m(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ax;
    }

    static boolean n(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ae;
    }

    static Flags o(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ag;
    }

    static fop p(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ao;
    }

    static Player q(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.am;
    }

    static fos r(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ap;
    }

    static void s(CollectionEpisodesFragment collectionepisodesfragment)
    {
        collectionepisodesfragment.H();
    }

    static com.spotify.mobile.android.spotlets.show.model.Show.MediaType t(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ar;
    }

    static fii u(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.ah;
    }

    static gin v(CollectionEpisodesFragment collectionepisodesfragment)
    {
        return collectionepisodesfragment.aq;
    }

    public final void A()
    {
        super.A();
        ab.b();
    }

    public final void B()
    {
        super.B();
        al.destroy();
    }

    public final Fragment F()
    {
        return this;
    }

    public final String I()
    {
        return an;
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        ag = fyw.a(this);
        layoutinflater = (ViewGroup)layoutinflater.inflate(0x7f030081, viewgroup, false);
        as = (ListView)layoutinflater.findViewById(0x102000a);
        as.setOnItemClickListener(aC);
        as.setOnItemLongClickListener(new fuf(k()));
        as.setFastScrollEnabled(true);
        viewgroup = (ViewGroup)as.getParent();
        ax = layoutinflater.findViewById(0x7f11036a);
        View view = ax;
        int i1;
        boolean flag;
        if (af && fiy.c(ag))
        {
            i1 = 0;
        } else
        {
            i1 = 8;
        }
        view.setVisibility(i1);
        av = ax.findViewById(0x7f11036c);
        aw = ax.findViewById(0x7f11036b);
        av.setOnClickListener(aD);
        aw.setOnClickListener(aD);
        H();
        at = LoadingView.a(LayoutInflater.from(k()), k(), viewgroup);
        layoutinflater.addView(at);
        viewgroup.setVisibility(4);
        if (af)
        {
            if (ar == com.spotify.mobile.android.spotlets.show.model.Show.MediaType.b)
            {
                u u1 = k();
                eoo._cls3 _lcls3 = new eoo._cls3(u1);
                au = eoo.a(u1, 0x7f0803cb, 0x7f0803c9, 0x7f0803ca, eoo.a(u1, SpotifyIcon.aX), _lcls3);
            } else
            {
                u u2 = k();
                eoo._cls4 _lcls4 = new eoo._cls4(u2);
                au = eoo.a(u2, 0x7f0803cb, 0x7f0803c9, 0x7f0803ca, eoo.a(u2, SpotifyIcon.aX), _lcls4);
            }
        } else
        {
            u u3 = k();
            au = eoo.a(u3, 0x7f0803c8, 0x7f0803c7, 0, eoo.a(u3, SpotifyIcon.q), null);
        }
        au.setVisibility(8);
        viewgroup.addView(au);
        ai = new ftg(k());
        ai.a(new ftm(eor.a(k(), null, 0x7f080194), true), null, 0);
        ai.a(new ftm(eor.a(k(), null, 0x7f080195), true), null, 1);
        viewgroup = new SectionHeaderView(k());
        viewgroup.a(b(0x7f080197));
        viewgroup.b(true);
        ai.a(new ftm(viewgroup), null, 2);
        aj = new EpisodeAdapter(k(), ak, ag, false);
        aj.a(ad);
        viewgroup = aj;
        if (ad && af)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        viewgroup.b(flag);
        ai.a(aj, null, 3);
        ai.a(new int[] {
            3
        });
        as.setAdapter(ai);
        if (!ad || !ae)
        {
            ai.a(new int[] {
                0, 1, 2
            });
        }
        if (ad)
        {
            ax.setVisibility(8);
        }
        ac.a();
        at.a();
        ah.a(bundle, a);
        ah.b(a);
        return layoutinflater;
    }

    public final String a(Context context, Flags flags)
    {
        return an;
    }

    public final void a(int i1, int j1, Intent intent)
    {
        if (i1 == 1 && j1 == -1)
        {
            for (i1 = 0; i1 < aj.getCount(); i1++)
            {
                intent = aj.a(i1);
                OfflineService.a(k(), intent.b(), false);
            }

            aB.a();
        }
    }

    public final void a(Bundle bundle)
    {
        boolean flag1 = true;
        super.a(bundle);
        a(false);
        aq = ((giq)dmz.a(giq)).b(k());
        ag = fyw.a(this);
        int i1 = g().getInt("filter");
        Object obj;
        boolean flag;
        if (i1 < 0 || i1 >= Filter.values().length)
        {
            obj = Filter.a;
        } else
        {
            obj = Filter.values()[i1];
        }
        if (obj == Filter.b)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        af = flag;
        if (obj == Filter.c)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        ae = flag;
        if (obj == Filter.a)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        if (af)
        {
            an = b(0x7f080198);
            ak = ViewUri.bv;
            obj = Y;
        } else
        if (ae)
        {
            an = b(0x7f080193);
            ak = ViewUri.bu;
            obj = Z;
        } else
        {
            an = b(0x7f080196);
            ak = ViewUri.bw;
            obj = aa;
        }
        if (bundle != null)
        {
            bundle.setClassLoader(k().getClassLoader());
            ad = bundle.getBoolean("edit_mode", false);
            if (bundle.containsKey("list"))
            {
                ay = bundle.getParcelable("list");
            }
        }
        if (fiy.c(ag))
        {
            i1 = aq.a(b, com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c.ordinal());
            if (i1 >= 0 && i1 < com.spotify.mobile.android.spotlets.show.model.Show.MediaType.values().length)
            {
                ar = com.spotify.mobile.android.spotlets.show.model.Show.MediaType.values()[i1];
            } else
            {
                ar = com.spotify.mobile.android.spotlets.show.model.Show.MediaType.c;
            }
        }
        ab = ggn.a(k(), ak);
        ac = gjf.a(k(), ak.toString());
        ac.c(bundle);
        al = Cosmos.getResolver(k());
        am = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(al, ak.toString(), u_(), gnl.a(this));
        if (ah == null)
        {
            ah = new fij(k(), al, g().getString("username"));
        }
        ah.a(flag, ae, af);
        ah.a(ar);
        ah.a(((gfp) (obj)));
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        if (!o())
        {
            return;
        }
        if (ad)
        {
            fzr.a(k(), menu, ak, aB);
            return;
        } else
        {
            fzt.a(k(), menu, ak, aA, 0x7f0803a4);
            return;
        }
    }

    public final void c()
    {
        super.c();
        al.connect();
        ah.b(a);
        am.registerPlayerStateObserver(az);
    }

    public final void d()
    {
        super.d();
        ah.a();
        al.disconnect();
        am.unregisterPlayerStateObserver(az);
    }

    public final void e()
    {
        super.e();
        if (ac.e())
        {
            ac.c();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        ac.a(bundle);
        ah.a(bundle);
        bundle.putBoolean("edit_mode", ad);
        if (as != null)
        {
            bundle.putParcelable("list", as.onSaveInstanceState());
        }
    }

    public final FeatureIdentifier u_()
    {
        if (ae)
        {
            return FeatureIdentifier.p;
        } else
        {
            return FeatureIdentifier.o;
        }
    }

    public final void z()
    {
        super.z();
        ab.a();
        ((fpe)k()).a(this, an);
    }

    static 
    {
        gfp gfp1 = new gfp("publishDate", 0x7f080520, true);
        gfp1.d = new gfp("name");
        Y = gfp1;
        gfp1 = new gfp("addTime", 0x7f080522, true);
        gfp1.d = new gfp("name");
        Z = gfp1;
        gfp1 = new gfp("addTime", 0x7f080522, true);
        gfp1.d = new gfp("name");
        aa = gfp1;
    }

    private class Filter extends Enum
    {

        public static final Filter a;
        public static final Filter b;
        public static final Filter c;
        private static final Filter d[];

        public static Filter valueOf(String s1)
        {
            return (Filter)Enum.valueOf(com/spotify/mobile/android/spotlets/collection/fragments/CollectionEpisodesFragment$Filter, s1);
        }

        public static Filter[] values()
        {
            return (Filter[])d.clone();
        }

        static 
        {
            a = new Filter("SAVED", 0);
            b = new Filter("UNPLAYED", 1);
            c = new Filter("OFFLINED", 2);
            d = (new Filter[] {
                a, b, c
            });
        }

        private Filter(String s1, int i1)
        {
            super(s1, i1);
        }
    }

}
