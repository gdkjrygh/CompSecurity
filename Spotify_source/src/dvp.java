// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.text.TextUtils;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.service.ForceInCollection;
import com.spotify.mobile.android.spotlets.collection.util.CollectionContains;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.MainActivity;
import com.spotify.music.spotlets.FeatureIdentifier;
import java.util.Set;

public final class dvp
    implements gel
{

    public Context a;
    public eco b;
    public boolean c;
    public ForceInCollection d;
    public boolean e;
    private gek f;
    private ecq g;
    private bb h;
    private boolean i;
    private Resolver j;
    private Player k;
    private CollectionContains l;
    private String m;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver n;

    public dvp(Service service, gek gek1)
    {
        d = ForceInCollection.b;
        n = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private dvp a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                a.a(a.d);
                if (playerstate.track() == null)
                {
                    return;
                } else
                {
                    a.a(playerstate);
                    return;
                }
            }

            
            {
                a = dvp.this;
                super();
            }
        };
        a = service;
        b = new eco(service);
        f = gek1;
    }

    private boolean f()
    {
        if (g != null)
        {
            boolean flag;
            if (k == null)
            {
                flag = true;
            } else
            {
                Object obj = k.getLastPlayerState();
                if (obj == null)
                {
                    flag = true;
                } else
                {
                    obj = ((PlayerState) (obj)).track();
                    if (obj == null)
                    {
                        flag = true;
                    } else
                    if (PlayerTrackUtil.isAd(((PlayerTrack) (obj))) || !PlayerTrackUtil.isVideo(((PlayerTrack) (obj))))
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
            }
            if (flag)
            {
                return true;
            }
        }
        return false;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!i)
        {
            f.a.add(this);
            j = Cosmos.getResolver(a);
            j.connect();
            l = new CollectionContains(j);
            k = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(j, ViewUri.bE.toString(), FeatureIdentifier.ad, FeatureIdentifier.ad);
            k.registerPlayerStateObserver(n);
            i = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void a(int i1, int j1, PendingIntent pendingintent, int k1)
    {
        Object obj = a.getResources();
        String s = ((Resources) (obj)).getString(i1);
        obj = ((Resources) (obj)).getString(j1);
        bb bb1 = new bb(a);
        bb1.a(pendingintent);
        bb1.a(s);
        bb1.c(s);
        bb1.b(((CharSequence) (obj)));
        bb1.a(0x7f020203);
        bb1.d();
        ((NotificationManager)a.getSystemService("notification")).notify(k1, bb1.g());
    }

    final void a(PlayerState playerstate)
    {
        boolean flag1;
        flag1 = true;
        break MISSING_BLOCK_LABEL_3;
        if (!e && playerstate != null)
        {
            Object obj = playerstate.track();
            if (obj != null)
            {
                obj = ((PlayerTrack) (obj)).uri();
                boolean flag2 = ecm.a(playerstate);
                boolean flag;
                if ((new SpotifyLink(((String) (obj)))).c == com.spotify.mobile.android.util.SpotifyLink.LinkType.P)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (TextUtils.equals(m, ((CharSequence) (obj))))
                {
                    flag1 = false;
                }
                if (flag1)
                {
                    d = ForceInCollection.b;
                }
                if (!flag2 && !flag && flag1)
                {
                    l.a(((String) (obj)), new eol(((String) (obj))) {

                        private String a;
                        private dvp b;

                        public final void a(String s)
                        {
                        }

                        public final void a(String s, boolean flag3)
                        {
                            if (TextUtils.equals(a, s))
                            {
                                dvp dvp1 = b;
                                if (flag3)
                                {
                                    s = ForceInCollection.a;
                                } else
                                {
                                    s = ForceInCollection.b;
                                }
                                dvp1.d = s;
                                b.a(b.d);
                            }
                        }

            
            {
                b = dvp.this;
                a = s;
                super();
            }
                    });
                }
                m = ((String) (obj));
                return;
            }
        }
        return;
    }

    public final void a(ForceInCollection forceincollection)
    {
        if (f() && (g instanceof ecm))
        {
            d = forceincollection;
            if (e)
            {
                d = ForceInCollection.b;
            }
            g.a(d, k);
        }
    }

    public final void a(ecq ecq1)
    {
        if (!f() || ecq1 == null) goto _L2; else goto _L1
_L1:
        if (!g.getClass().equals(ecq1.getClass()))
        {
            g.a();
        }
_L4:
        g = ecq1;
        if (f() && i)
        {
            m = null;
            a(k.getLastPlayerState());
            g.a(ForceInCollection.b, k);
        }
        return;
_L2:
        if (f() && ecq1 == null)
        {
            g.a();
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (i)
        {
            f.a.remove(this);
            if (f())
            {
                g.a();
            }
            d();
            k.unregisterPlayerStateObserver(n);
            j.destroy();
            i = false;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void c()
    {
        if (h == null)
        {
            h = new bb(a);
        }
        int i1 = f.b;
        int j1 = f.c;
        int k1 = f.d;
        Object obj = new Intent(a, com/spotify/music/MainActivity);
        obj = PendingIntent.getActivity(a, 0, ((Intent) (obj)), 0);
        Resources resources = a.getResources();
        h.a(((PendingIntent) (obj)));
        h.a(resources.getString(0x7f080374));
        h.b(resources.getQuantityString(0x7f090011, j1, new Object[] {
            Integer.valueOf(i1), Integer.valueOf(j1), Integer.valueOf(k1)
        }));
        h.c(resources.getString(0x7f080374));
        h.a(0x7f020203);
        h.b();
        h.c();
        b.a(2, h.g());
    }

    public final void d()
    {
        h = null;
        b.a(2);
    }

    public final void e()
    {
        if (c)
        {
            c();
        }
    }
}
