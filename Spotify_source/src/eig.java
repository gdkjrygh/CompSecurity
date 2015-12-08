// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ToggleButton;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter;
import com.spotify.mobile.android.spotlets.artist.model.ArtistModel;
import com.spotify.mobile.android.spotlets.artist.model.Image;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.List;

public final class eig extends eie
    implements dod, fon
{

    private ejz ab;
    private eiz ac;
    private Verified ad;
    private String ae;
    private gjf af;
    private FollowManager ag;
    private eso ah;
    private RxFollowersCountResolver ai;
    private hfg aj;
    private boolean ak;
    private boolean al;
    private fop am;
    private Player an;
    private Resolver ao;
    private esp ap;
    private hfb aq;
    private eka ar;
    private an as;
    private final com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver at = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

        private eig a;

        public final void onPlayerStateReceived(PlayerState playerstate)
        {
            ejz ejz1 = eig.a(a);
            if (playerstate.track() != null && TextUtils.equals(ejz1.k.toString(), playerstate.entityUri()))
            {
                if (!TextUtils.equals(ejz1.m, playerstate.track().uri()))
                {
                    ejz1.m = playerstate.track().uri();
                    if (ejz1.i != null)
                    {
                        ejz1.i.a(playerstate.track().uri());
                    }
                }
            } else
            {
                ejz1.m = null;
                if (ejz1.i != null)
                {
                    ejz1.i.a(null);
                    return;
                }
            }
        }

            
            {
                a = eig.this;
                super();
            }
    };

    public eig()
    {
        ag = (FollowManager)dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager);
        am = (fop)dmz.a(fop);
        ap = new esp() {

            private eig a;

            public final void a(eso eso1)
            {
                eig.a(a, eso1);
                eig.a(a, eso1.d);
                eig.a(a).a(eso1.d, eso1.c, eso1.b);
            }

            
            {
                a = eig.this;
                super();
            }
        };
        aq = new hfb() {

            private eig a;

            public final void onCompleted()
            {
            }

            public final void onError(Throwable throwable)
            {
                Logger.b(throwable, "Failed to get followed count for %s", new Object[] {
                    eig.b(a)
                });
            }

            public final void onNext(Object obj)
            {
                obj = (com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver.Count)obj;
                eig.a(a, eig.c(a).a(eig.b(a).toString()));
                if (eig.d(a) == null)
                {
                    eig.a(a, new eso(eig.b(a).toString(), ((com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver.Count) (obj)).getFollowersCount(), ((com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver.Count) (obj)).getFollowingCount(), eig.e(a)));
                } else
                {
                    eig.d(a).c = ((com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver.Count) (obj)).getFollowersCount();
                    eig.d(a).b = ((com.spotify.mobile.android.spotlets.follow.RxFollowersCountResolver.Count) (obj)).getFollowingCount();
                }
                eig.c(a).a(eig.d(a));
            }

            
            {
                a = eig.this;
                super();
            }
        };
        ar = new eka() {

            private eig a;

            public final void a()
            {
                eig.g(a);
                Object obj1 = a.k();
                Object obj2 = eig.f(a);
                Object obj;
                boolean flag;
                if (eig.e(a))
                {
                    obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.bJ;
                } else
                {
                    obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.bI;
                }
                fop.a(((Context) (obj1)), ((Verified) (obj2)), ClientEventFactory.a("artist", ((com.spotify.mobile.android.util.ClientEvent.SubEvent) (obj)), null, null));
                obj = eig.c(a);
                obj1 = eig.b(a).toString();
                if (!eig.e(a))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                obj2 = a.Z;
                ((FollowManager) (obj)).a(((String) (obj1)), flag);
            }

            
            {
                a = eig.this;
                super();
            }
        };
        as = new an() {

            private final String a[] = {
                "is_followed"
            };
            private eig b;

            public final da a(Bundle bundle)
            {
                return new cu(b.k(), dth.a(eig.b(b).toString()), a, null, null);
            }

            public final void a()
            {
            }

            public final void a(Object obj)
            {
                obj = (Cursor)obj;
                if (b.o() && ((Cursor) (obj)).moveToFirst())
                {
                    eig.a(b, eig.c(b).a(eig.b(b).toString()));
                    if (eig.d(b) != null)
                    {
                        eig.a(b, eig.d(b).d);
                        eig.a(b).a(eig.d(b).d, eig.d(b).c, eig.d(b).b);
                    } else
                    {
                        eig.a(b, gcw.a(((Cursor) (obj)), 0));
                        if (eig.h(b) != null)
                        {
                            eig.h(b).unsubscribe();
                        }
                        eig.a(b, eig.j(b).a(eig.b(b).toString()).a(((dup)dmz.a(dup)).c()).a(eig.i(b)));
                    }
                    eig.c(b).a(eig.b(b).toString(), eig.k(b));
                }
            }

            
            {
                b = eig.this;
                super();
            }
        };
    }

    static ejz a(eig eig1)
    {
        return eig1.ab;
    }

    static eso a(eig eig1, eso eso)
    {
        eig1.ah = eso;
        return eso;
    }

    static hfg a(eig eig1, hfg hfg1)
    {
        eig1.aj = hfg1;
        return hfg1;
    }

    static boolean a(eig eig1, boolean flag)
    {
        eig1.ak = flag;
        return flag;
    }

    static eiz b(eig eig1)
    {
        return eig1.ac;
    }

    static FollowManager c(eig eig1)
    {
        return eig1.ag;
    }

    static eso d(eig eig1)
    {
        return eig1.ah;
    }

    static boolean e(eig eig1)
    {
        return eig1.ak;
    }

    static Verified f(eig eig1)
    {
        return eig1.ad;
    }

    static fop g(eig eig1)
    {
        return eig1.am;
    }

    static hfg h(eig eig1)
    {
        return eig1.aj;
    }

    static hfb i(eig eig1)
    {
        return eig1.aq;
    }

    static RxFollowersCountResolver j(eig eig1)
    {
        return eig1.ai;
    }

    static esp k(eig eig1)
    {
        return eig1.ap;
    }

    public final void A()
    {
        super.A();
        dmz.a(gcm);
    }

    public final void B()
    {
        super.B();
        ao.destroy();
        ag.b(ac.toString(), ap);
        if (aj != null)
        {
            aj.unsubscribe();
        }
    }

    protected final View H()
    {
        return ab.h;
    }

    public final String I()
    {
        return (new StringBuilder("artist:")).append(ac).toString();
    }

    public final Uri a()
    {
        return Uri.parse(ac.c());
    }

    public final View a(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        Z = fyw.a(this);
        ab = new ejz(k(), this, ac, gnl.a(this), Z, al);
        ab.j = ar;
        ab.a();
        af = gjf.a(k(), super.a.toString());
        af.c(bundle);
        af.a();
        return super.a(layoutinflater, viewgroup, bundle);
    }

    public final String a(Context context, Flags flags)
    {
        if (ae == null)
        {
            return context.getString(0x7f0800c3);
        } else
        {
            return ae;
        }
    }

    public final void a(Bundle bundle)
    {
        super.a(bundle);
        bundle = g().getString("artist_uri");
        ae = g().getString("title");
        ac = ejh.a(bundle);
        ad = ViewUri.an.a(ac.c());
        ai = new RxFollowersCountResolver(new RxResolver(RxCosmos.getRouter(k())));
        ao = Cosmos.getResolver(k());
        ao.connect();
        an = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(ao, ac.toString(), FeatureIdentifier.K, gnl.a(this));
        al = g().getBoolean("is_sub_fragment");
        boolean flag;
        if (!al)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a(flag);
    }

    public final void a(Menu menu, MenuInflater menuinflater)
    {
        menu.clear();
        b(menu);
    }

    public final void a(SessionState sessionstate)
    {
        super.a(sessionstate);
        ejz ejz1 = ab;
        boolean flag = sessionstate.j;
        ejz1.e.a.setEnabled(flag);
    }

    protected final void a(ArtistModel artistmodel)
    {
        int i1;
        i1 = 0;
        ab.a(artistmodel);
        ae = artistmodel.getInfoSafe().name;
        if (k() != null)
        {
            k().q_();
        }
        a(((View) (ab.d)));
        if (!af.d())
        {
            af.b();
        }
        a(ae);
        k().q_();
        if (!g().getBoolean("autoplay", false)) goto _L2; else goto _L1
_L1:
        g().putBoolean("autoplay", false);
        if (!gex.a(Z)) goto _L4; else goto _L3
_L3:
        Object obj = g().getString("track_uri");
        if (!artistmodel.topTracks.isEmpty()) goto _L6; else goto _L5
_L5:
        Assertion.a("Top tracks is empty", (new StringBuilder("artist uri: ")).append(ac).toString());
_L2:
        u().a(0x7f110065, null, as);
        return;
_L6:
        int l;
        int j1;
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            l = 0;
        } else
        {
            j1 = artistmodel.findTopTrackIndex(((String) (obj)));
            l = j1;
            if (j1 < 0)
            {
                Logger.b("Couldn't find track (%s) in artist's (%s) top tracks", new Object[] {
                    obj, artistmodel.uri
                });
                l = 0;
            }
        }
        artistmodel = ab;
        j1 = com.spotify.mobile.android.spotlets.artist.adapters.ArtistSectionedListAdapter.Section.c.ordinal();
        if (!((ejz) (artistmodel)).i.c(j1))
        {
            l = -1;
        } else
        {
            if (((ejz) (artistmodel)).i.a(j1))
            {
                i1 = 1;
            }
            l = l + ((ejz) (artistmodel)).i.e(j1) + i1;
        }
        if (l >= 0)
        {
            artistmodel = ab;
            obj = ((ejz) (artistmodel)).i.getView(l, null, ((ejz) (artistmodel)).d);
            ((ejz) (artistmodel)).n.onClick(((View) (obj)));
        }
        continue; /* Loop/switch isn't completed */
_L4:
        ab.b();
        if (true) goto _L2; else goto _L7
_L7:
    }

    public final void b(Menu menu)
    {
        if (o())
        {
            menu.clear();
            Object obj1 = k();
            Object obj2 = ad;
            String s = ac.c();
            Object obj;
            if (b != null)
            {
                obj = b.getInfoSafe().name;
            } else
            {
                obj = "";
            }
            fzr.a(((Context) (obj1)), menu, ((Verified) (obj2)), s, ((String) (obj)), Z);
            obj2 = "";
            if (b != null)
            {
                obj = b.getInfoSafe().portraits;
            } else
            {
                obj = null;
            }
            obj1 = obj2;
            if (obj != null)
            {
                obj1 = obj2;
                if (((List) (obj)).size() != 0)
                {
                    obj1 = ((Image)((List) (obj)).get(0)).uri;
                }
            }
            fzr.a(k(), menu, ad, a(k(), Z), "", ((String) (obj1)), ac.c());
            if (ggi.b(k()))
            {
                menu = fzr.a(k(), menu, ad, FeatureIdentifier.K, gnl.a(this), dth.b(ac.c()));
                ab.a(menu);
                return;
            }
        }
    }

    public final void c()
    {
        super.c();
        ao.connect();
        an.registerPlayerStateObserver(at);
    }

    public final void d()
    {
        super.d();
        ao.disconnect();
        an.unregisterPlayerStateObserver(at);
    }

    public final void e()
    {
        super.e();
        if (af.e())
        {
            af.c();
        }
    }

    public final void e(Bundle bundle)
    {
        super.e(bundle);
        af.a(bundle);
    }

    public final FeatureIdentifier u_()
    {
        return FeatureIdentifier.K;
    }

    public final void z()
    {
        super.z();
        a(ae);
    }
}
