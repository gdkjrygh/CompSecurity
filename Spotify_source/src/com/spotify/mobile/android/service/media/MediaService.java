// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service.media;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.Uri;
import android.os.Handler;
import android.os.IBinder;
import android.text.TextUtils;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.base.Optional;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.cosmos.player.v2.PlayOrigin;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerContext;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerOptions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.service.media.search.WebApiSearch;
import com.spotify.mobile.android.service.session.SessionState;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.model.ExternalAccessoryData;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.collection.util.CollectionContains;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.framework.flag.NoFlags;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.radio.model.RadioStationsModel;
import ctz;
import dmz;
import dti;
import dvk;
import dwh;
import dwk;
import dwx;
import dxc;
import dxd;
import dzs;
import dzz;
import ean;
import eao;
import ear;
import eas;
import eat;
import eau;
import eav;
import eaw;
import eax;
import eay;
import eaz;
import eba;
import ebf;
import ebi;
import ebj;
import ebm;
import ebn;
import ebo;
import ebp;
import ebq;
import ebr;
import ebs;
import ebu;
import ebv;
import ebw;
import ebx;
import ecb;
import ecc;
import ece;
import eda;
import edb;
import edd;
import enl;
import eol;
import ezu;
import fdq;
import fos;
import fyx;
import gex;
import gng;
import gni;
import gou;
import gow;
import gpg;
import gpi;
import gpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

// Referenced classes of package com.spotify.mobile.android.service.media:
//            MediaAction

public class MediaService extends Service
    implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver, dwx, eda, fyx, gpi
{

    public ebf a;
    public Flags b;
    public Optional c;
    public Optional d;
    public eas e;
    public Player f;
    public PlayerState g;
    public WebApiSearch h;
    public ean i;
    private boolean j;
    private AdEventReporter k;
    private eao l;
    private eay m;
    private ecb n;
    private fos o;
    private dzs p;
    private edb q;
    private Handler r;
    private ebi s[];
    private dxc t;
    private dwh u;
    private gou v;
    private ear w;
    private Resolver x;
    private final ObjectMapper y;
    private dwk z;

    public MediaService()
    {
        l = new eao(this);
        b = new NoFlags("No flags available yet");
        c = Optional.c(null);
        d = Optional.c(null);
        e = new eas();
        y = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
        z = new dwk() {

            private MediaService a;

            public final void a(Object obj)
            {
                MediaService.a(a).b(this);
                MediaService.b(a);
            }

            public final void b()
            {
                MediaService.a(a).b(this);
            }

            
            {
                a = MediaService.this;
                super();
            }
        };
    }

    static Optional a(MediaService mediaservice, Optional optional)
    {
        mediaservice.d = optional;
        return optional;
    }

    static dwh a(MediaService mediaservice)
    {
        return mediaservice.u;
    }

    public static void a(Context context, ServiceConnection serviceconnection)
    {
        Intent intent = new Intent();
        intent.setClass(context, com/spotify/mobile/android/service/media/MediaService);
        dvk.a(context, intent, serviceconnection, com/spotify/mobile/android/service/media/MediaService.getSimpleName());
    }

    private void a(PlayerState playerstate)
    {
        r.postDelayed(new Runnable(playerstate) {

            final MediaService a;
            private PlayerState b;

            public final void run()
            {
                if (b.track() != null)
                {
                    (new CollectionContains(MediaService.g(a))).a(b.track().uri(), new eol(this) {

                        private _cls6 a;

                        public final void a(String s1)
                        {
                            MediaService.a(a.a, Optional.b(new eaz(false, false)));
                            MediaService.f(a.a).a((eaz)MediaService.h(a.a).c());
                        }

                        public final void a(String s1, boolean flag)
                        {
                            if (s1 != null)
                            {
                                MediaService.a(a.a, Optional.b(new eaz(flag, true)));
                                MediaService.f(a.a).a((eaz)MediaService.h(a.a).c());
                            }
                        }

            
            {
                a = _pcls6;
                super();
            }
                    });
                }
            }

            
            {
                a = MediaService.this;
                b = playerstate;
                super();
            }
        }, 500L);
    }

    public static void b(Context context, ServiceConnection serviceconnection)
    {
        dvk.a(context, serviceconnection, com/spotify/mobile/android/service/media/MediaService.getSimpleName());
    }

    static void b(MediaService mediaservice)
    {
        mediaservice.t();
    }

    static Player c(MediaService mediaservice)
    {
        return mediaservice.f;
    }

    static ean d(MediaService mediaservice)
    {
        return mediaservice.i;
    }

    static Flags e(MediaService mediaservice)
    {
        return mediaservice.b;
    }

    static eas f(MediaService mediaservice)
    {
        return mediaservice.e;
    }

    static Resolver g(MediaService mediaservice)
    {
        return mediaservice.x;
    }

    static Optional h(MediaService mediaservice)
    {
        return mediaservice.d;
    }

    private void q()
    {
        if (a != null && s != null)
        {
            a.b(s);
            s = null;
        }
    }

    private boolean r()
    {
        return s() && f.getLastPlayerState().track() != null;
    }

    private boolean s()
    {
        return f.getLastPlayerState() != null;
    }

    private void t()
    {
        if (!((ConnectManager)u.f()).i())
        {
            ((ConnectManager)u.f()).h();
        }
    }

    private Optional u()
    {
        String s1;
        if (q.c())
        {
            s1 = q.g();
        } else
        {
            s1 = null;
        }
        return Optional.c(s1);
    }

    public final Flags a()
    {
        return b;
    }

    public final void a(Uri uri)
    {
        if (!(b instanceof NoFlags))
        {
            ece ece1 = new ece(y);
            if (ece.a(uri, this))
            {
                Resolver resolver = x;
                PlayOrigin playorigin = new PlayOrigin(FeatureIdentifier.j.a(), "4.2.0.739", ViewUri.bJ.toString(), FeatureIdentifier.ah.toString());
                ctz.a(ece.a(uri, this));
                uri = ece.a(uri);
                if (com.spotify.mobile.android.util.SpotifyLink.LinkType.c.equals(((SpotifyLink) (uri)).c))
                {
                    (new enl(this, resolver, uri.d(), ece1.b)).a(ece.a, playorigin);
                }
                return;
            } else
            {
                fos.a(this, ViewUri.bJ, FeatureIdentifier.ah, FeatureIdentifier.ah, uri, b);
                return;
            }
        } else
        {
            Logger.c("Calling playBrowseItem before flags are loaded", new Object[0]);
            return;
        }
    }

    public final void a(SessionState sessionstate)
    {
        Iterator iterator;
        if (sessionstate.e)
        {
            if (s == null)
            {
                String s1 = sessionstate.i;
                if (a != null)
                {
                    s = (new ebi[] {
                        new ebj(this), new ebp(p, m, n, this), new ebr(p, m, n, this), new ebs(p, m, n, this), new ebw(this), new ebx(m, n, this), new ebu(m, n, this), new ebv(m, n, this), new ebn(m, this, s1, this), new ebm(m, this, s1, this), 
                        new ebo(m, this, s1, this), new ebq(this, new fdq(this, x, 15, false, gpl.a(b)))
                    });
                    a.a(s);
                }
            }
            f.registerPlayerStateObserver(this, 0, 50);
            j = true;
        } else
        {
            if (j)
            {
                f.unregisterPlayerStateObserver(this);
            }
            g = null;
            q();
        }
        for (iterator = e.c.iterator(); iterator.hasNext(); ((eax)iterator.next()).a(sessionstate)) { }
    }

    public final void a(ExternalAccessoryData externalaccessorydata)
    {
        k.a(externalaccessorydata);
    }

    public final void a(Flags flags)
    {
        boolean flag = b instanceof NoFlags;
        b = flags;
        a.b = b;
        if (flag)
        {
            q.a(this);
            q.a();
        }
    }

    public final void a(RadioStationsModel radiostationsmodel)
    {
    }

    public final void a(eat eat1)
    {
        ezu ezu1 = new ezu(b);
        Optional optional = u();
        if (!optional.b())
        {
            eat1.a(null, null);
        }
        f.fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver(ezu1, optional, eat1) {

            private ezu a;
            private Optional b;
            private eat c;
            private MediaService d;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                ezs ezs = a.a(playerstate, (String)b.c());
                MediaService.f(d).a(ezs, playerstate);
                c.a(ezs, playerstate);
            }

            
            {
                d = MediaService.this;
                a = ezu1;
                b = optional;
                c = eat1;
                super();
            }
        });
    }

    public final void a(eau eau1)
    {
        e.a.add(eau1);
    }

    public final void a(eav eav1)
    {
        e.b.add(eav1);
    }

    public final void a(eaw eaw)
    {
        e.e.add(eaw);
    }

    public final void a(eax eax1)
    {
        e.c.add(eax1);
    }

    public final void a(gpg gpg)
    {
        c = Optional.c(gpg);
        for (Iterator iterator = e.b.iterator(); iterator.hasNext(); ((eav)iterator.next()).a(gpg)) { }
    }

    public final void a(Object obj)
    {
        eas eas1 = e;
        eas1.a.remove(obj);
        eas1.b.remove(obj);
        eas1.c.remove(obj);
        eas1.d.remove(obj);
        eas1.e.remove(obj);
    }

    public final transient void a(String as[])
    {
        ear ear1 = w;
        ear1.a.addAll(Arrays.asList(as));
        ear1.a();
    }

    public final boolean a(String s1)
    {
        String s2 = null;
        if (r())
        {
            s2 = f.getLastPlayerState().track().uri();
        }
        if (MediaAction.a.name().equals(s1) || MediaAction.b.name().equals(s1))
        {
            e();
        } else
        {
            if (MediaAction.e.name().equals(s1))
            {
                j();
                return false;
            }
            if (MediaAction.f.name().equals(s1))
            {
                k();
                return false;
            }
            if (MediaAction.c.name().equals(s1))
            {
                i();
                return false;
            }
            if (MediaAction.d.name().equals(s1))
            {
                h();
                return false;
            }
            if (MediaAction.k.name().equals(s1))
            {
                c();
                return false;
            }
            if (MediaAction.g.name().equals(s1))
            {
                fos.a(this, true);
                return false;
            }
            if (MediaAction.i.name().equals(s1))
            {
                fos.a(this, false);
                return false;
            }
            if (MediaAction.n.name().equals(s1))
            {
                n();
                return false;
            }
            if (MediaAction.o.name().equals(s1))
            {
                m();
                return false;
            }
            if (MediaAction.p.name().equals(s1) || MediaAction.q.name().equals(s1))
            {
                l();
                return false;
            }
            if (s2 != null)
            {
                if (MediaAction.l.name().equals(s1))
                {
                    CollectionService.a(this, s2, ViewUri.bJ.toString(), b, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.a);
                    a(g);
                    return false;
                }
                if (MediaAction.m.name().equals(s1))
                {
                    CollectionService.b(this, s2, ViewUri.bJ.toString(), b, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.a);
                    a(g);
                    return false;
                }
            }
        }
        return false;
    }

    public final Optional b()
    {
        if (q != null && q.c())
        {
            return Optional.c(q.h());
        } else
        {
            return Optional.c(null);
        }
    }

    public final void b(String s1)
    {
        if (!(b instanceof NoFlags))
        {
            fos.a(this, s1, ViewUri.bJ);
            return;
        } else
        {
            Logger.c("Calling playBrowseItem before flags are loaded", new Object[0]);
            return;
        }
    }

    public final transient void b(String as[])
    {
        ear ear1 = w;
        int j1 = as.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            String s1 = as[i1];
            ear1.a.remove(s1);
        }

        ear1.a();
    }

    public final void c()
    {
        if (r())
        {
            b(f.getLastPlayerState().track().uri());
        }
    }

    public final void d()
    {
        Uri uri = dti.a("", false);
        if (!(b instanceof NoFlags))
        {
            fos.a(this, ViewUri.bJ, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, FeatureIdentifier.ah, FeatureIdentifier.ah, uri);
            return;
        } else
        {
            Logger.c("Calling shufflePlayCollectionSongs before flags are loaded", new Object[0]);
            return;
        }
    }

    public final void e()
    {
        ((Player)ctz.a(f)).fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private MediaService a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                if (playerstate.isPaused())
                {
                    MediaService.c(a).resume();
                    return;
                } else
                {
                    MediaService.c(a).pause();
                    return;
                }
            }

            
            {
                a = MediaService.this;
                super();
            }
        }, 0, 0);
    }

    public final void f()
    {
        if (s() && f.getLastPlayerState().isPaused())
        {
            f.resume();
        }
    }

    public final void g()
    {
        if (s() && !f.getLastPlayerState().isPaused())
        {
            f.pause();
        }
    }

    public final void h()
    {
        f.skipToPreviousTrack();
    }

    public final void i()
    {
        f.skipToNextTrack();
    }

    public final void j()
    {
        f.setShufflingContext(true);
    }

    public final void k()
    {
        f.setShufflingContext(false);
    }

    public final void l()
    {
        f.setRepeatingContext(false);
        f.setRepeatingTrack(false);
    }

    public final void m()
    {
        f.setRepeatingContext(false);
        f.setRepeatingTrack(true);
    }

    public final void n()
    {
        f.setRepeatingTrack(false);
        f.setRepeatingContext(true);
    }

    public final void o()
    {
        if (!u.c())
        {
            u.a(z);
            return;
        } else
        {
            t();
            return;
        }
    }

    public IBinder onBind(Intent intent)
    {
        return l;
    }

    public void onCreate()
    {
        super.onCreate();
        m = (eay)dmz.a(eay);
        n = (ecb)dmz.a(ecb);
        r = new Handler();
        a = new ebf(r);
        dmz.a(eba);
        p = eba.a();
        o = (fos)dmz.a(fos);
        dmz.a(edd);
        q = edd.a(this);
        dmz.a(dxd);
        t = dxd.a(this);
        t.a(this);
        t.a();
        dmz.a(dzz);
        u = dzz.a(this);
        u.a();
        w = (ear)dmz.a(ear);
        k = (AdEventReporter)dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter);
        dmz.a(gow);
        v = gow.a(this, this);
        v.a();
        x = Cosmos.getResolver(this);
        x.connect();
        f = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(x, ViewUri.bJ.toString(), FeatureIdentifier.ah, FeatureIdentifier.J);
    }

    public void onDestroy()
    {
        super.onDestroy();
        p.a();
        q();
        for (Iterator iterator = a.a.iterator(); iterator.hasNext(); ((ebi)iterator.next()).a()) { }
        a = null;
        t.b(this);
        q.b(this);
        q.b();
        t.b();
        u.b();
        v.b();
        Object obj = w;
        if (!((ear) (obj)).a.isEmpty())
        {
            ((ear) (obj)).a.clear();
            ((ear) (obj)).a();
        }
        obj = e;
        ((eas) (obj)).a.clear();
        ((eas) (obj)).b.clear();
        ((eas) (obj)).c.clear();
        ((eas) (obj)).d.clear();
        ((eas) (obj)).e.clear();
        x.destroy();
        if (j)
        {
            f.unregisterPlayerStateObserver(this);
        }
    }

    public void onPlayerStateReceived(PlayerState playerstate)
    {
        g = playerstate;
        for (Iterator iterator = e.a.iterator(); iterator.hasNext(); ((eau)iterator.next()).a(playerstate)) { }
        Player player = f;
        Optional optional = u();
        if (optional.b())
        {
            player.fetchState(new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver(new ezu(b), optional) {

                private ezu a;
                private Optional b;
                private MediaService c;

                public final void onPlayerStateReceived(PlayerState playerstate1)
                {
                    ezs ezs = a.a(playerstate1, (String)b.c());
                    MediaService.f(c).a(ezs, playerstate1);
                }

            
            {
                c = MediaService.this;
                a = ezu1;
                b = optional;
                super();
            }
            });
        }
        a(playerstate);
    }

    public final void p()
    {
    }

    // Unreferenced inner class com/spotify/mobile/android/service/media/MediaService$3

/* anonymous class */
    public final class _cls3
        implements ecc
    {

        final MediaService a;
        private String b;

        public final void a()
        {
            Logger.c("onError()", new Object[0]);
            if (MediaService.d(a) != null)
            {
                MediaService.d(a).a(a.getString(0x7f08033f));
            }
        }

        public final void a(com.spotify.mobile.android.service.media.search.WebApiSearch.Response response)
        {
            response.getTracks().getItems().size();
            response = response.getTracks().convertToPlayerTracks();
            if (response.length == 0)
            {
                if (MediaService.d(a) != null)
                {
                    MediaService.d(a).a(a.getString(0x7f080340));
                }
                return;
            }
            response = PlayerContext.create((new StringBuilder("spotify:media-service:search:")).append(Uri.encode(b)).toString(), response);
            com.spotify.mobile.android.cosmos.player.v2.PlayOptions playoptions;
            boolean flag;
            if (!gex.a(MediaService.e(a)))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            playoptions = (new com.spotify.mobile.android.cosmos.player.v2.PlayOptions.Builder()).playerOptionsOverride(flag, true, false).build();
            MediaService.c(a).play(response, playoptions, new com.spotify.mobile.android.cosmos.player.v2.Player.PlayCallback(this) {

                private _cls3 a;

                public final void onPlayForbidden(List list)
                {
                    Logger.c("searchAndPlay() -> onPlayForbidden() reasons: %s", new Object[] {
                        TextUtils.join(", ", list)
                    });
    public final class _cls3
        implements ecc
    {
                    if (MediaService.d(a.a) != null)
                    {
                        MediaService.d(a.a).a(a.a.getString(0x7f08033f));
                    }
                }

                public final void onPlaySuccess()
                {
                }

            
            {
                a = _pcls3;
                super();
            }
            });
        }

            public 
            {
                a = MediaService.this;
                b = s1;
                super();
            }
    }


    // Unreferenced inner class com/spotify/mobile/android/service/media/MediaService$5

/* anonymous class */
    public final class _cls5
        implements com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver
    {

        private boolean a;
        private MediaService b;

        public final void onPlayerStateReceived(PlayerState playerstate)
        {
            if (playerstate.track() != null) goto _L2; else goto _L1
_L1:
            b.d();
_L4:
            if (a && !playerstate.options().repeatingContext() && !playerstate.options().repeatingTrack())
            {
                b.n();
            }
            return;
_L2:
            if (playerstate.isPaused())
            {
                b.f();
            }
            if (true) goto _L4; else goto _L3
_L3:
        }

            public 
            {
                b = MediaService.this;
                a = flag;
                super();
            }
    }

}
