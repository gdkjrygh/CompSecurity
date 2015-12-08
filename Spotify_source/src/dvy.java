// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Service;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerRestrictions;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.widget.SpotifyWidget;
import com.squareup.picasso.Picasso;
import java.util.Map;
import java.util.Set;

public final class dvy
    implements android.os.Handler.Callback
{

    private Service a;
    private Player b;
    private Resolver c;
    private Uri d;
    private Bitmap e;
    private Handler f;
    private Handler g;
    private Intent h;
    private dvz i;
    private final Object j = new Object();
    private gbn k;
    private boolean l;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver m;

    public dvy(Service service, HandlerThread handlerthread, gbn gbn1)
    {
        g = new Handler(Looper.getMainLooper());
        m = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private dvy a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                synchronized (a)
                {
                    if (dvy.a(a))
                    {
                        dvy.b(a).removeMessages(1001);
                        dvy.b(a).sendEmptyMessage(1001);
                    }
                }
                return;
                exception;
                playerstate;
                JVM INSTR monitorexit ;
                throw exception;
            }

            
            {
                a = dvy.this;
                super();
            }
        };
        k = gbn1;
        f = new Handler(handlerthread.getLooper(), this);
        i = new dvz(this, (byte)0);
        a = service;
        h = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
        h.setComponent(new ComponentName(a, com/spotify/music/spotlets/widget/SpotifyWidget));
    }

    static Bitmap a(dvy dvy1, Bitmap bitmap)
    {
        dvy1.e = bitmap;
        return bitmap;
    }

    static boolean a(dvy dvy1)
    {
        return dvy1.l;
    }

    static Handler b(dvy dvy1)
    {
        return dvy1.f;
    }

    static Object c(dvy dvy1)
    {
        return dvy1.j;
    }

    static Uri d(dvy dvy1)
    {
        return dvy1.d;
    }

    private void d()
    {
        boolean flag1 = true;
        Object obj = h.getExtras();
        if (obj != null)
        {
            ((Bundle) (obj)).clear();
        }
        obj = b.getLastPlayerState();
        if (obj == null || ((PlayerState) (obj)).track() == null)
        {
            e();
            return;
        }
        h.putExtra("track_uri", ((PlayerState) (obj)).track().uri());
        h.putExtra("track_name", (String)((PlayerState) (obj)).track().metadata().get("title"));
        h.putExtra("artist_name", (String)((PlayerState) (obj)).track().metadata().get("artist_name"));
        h.putExtra("album_name", (String)((PlayerState) (obj)).track().metadata().get("album_title"));
        h.putExtra("paused", ((PlayerState) (obj)).isPaused());
        if (e != null)
        {
            h.putExtra("cover", e);
        }
        h.putExtra("is_prev_enabled", ((PlayerState) (obj)).restrictions().disallowSkippingPrevReasons().isEmpty());
        h.putExtra("is_next_enabled", ((PlayerState) (obj)).restrictions().disallowSkippingNextReasons().isEmpty());
        Intent intent = h;
        PlayerTrack playertrack = ((PlayerState) (obj)).track();
        boolean flag;
        if (playertrack.metadata().containsKey("is_advertisement") && Boolean.valueOf((String)playertrack.metadata().get("is_advertisement")).booleanValue())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.putExtra("is_ad_playing", flag);
        intent = h;
        playertrack = ((PlayerState) (obj)).track();
        if (playertrack.metadata().containsKey("mft.injection_source") && "fallback".equalsIgnoreCase((String)playertrack.metadata().get("mft.injection_source")))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        intent.putExtra("is_suggested_track", flag);
        intent = h;
        obj = ((PlayerState) (obj)).track();
        if (((PlayerTrack) (obj)).metadata().containsKey("media.type") && "video".equals(((PlayerTrack) (obj)).metadata().get("media.type")))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        intent.putExtra("is_video", flag);
        k.a(a, h);
    }

    private void e()
    {
        Intent intent = new Intent("android.appwidget.action.APPWIDGET_UPDATE");
        intent.setComponent(new ComponentName(a, com/spotify/music/spotlets/widget/SpotifyWidget));
        intent.putExtra("track_uri", null);
        intent.putExtra("track_name", null);
        intent.putExtra("artist_name", null);
        intent.putExtra("album_name", null);
        intent.putExtra("paused", true);
        intent.putExtra("cover", null);
        intent.putExtra("is_prev_enabled", false);
        intent.putExtra("is_next_enabled", false);
        intent.putExtra("is_ad_playing", false);
        intent.putExtra("is_suggested_track", false);
        intent.putExtra("is_video", false);
        k.a(a, intent);
    }

    static void e(dvy dvy1)
    {
        dvy1.d();
    }

    static dvz f(dvy dvy1)
    {
        return dvy1.i;
    }

    public final void a()
    {
        this;
        JVM INSTR monitorenter ;
        if (!l)
        {
            c = Cosmos.getResolver(a);
            c.connect();
            b = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(c, ViewUri.O.toString(), FeatureIdentifier.ag, FeatureIdentifier.ag);
            b.registerPlayerStateObserver(m);
            l = true;
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final void b()
    {
        this;
        JVM INSTR monitorenter ;
        if (l)
        {
            b.unregisterPlayerStateObserver(m);
            c.destroy();
            e();
            l = false;
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
        this;
        JVM INSTR monitorenter ;
        if (l)
        {
            f.removeMessages(1001);
            f.sendEmptyMessage(1001);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean handleMessage(Message message)
    {
        if (message.what != 1001) goto _L2; else goto _L1
_L1:
        Object obj = b.getLastPlayerState();
        if (obj != null && ((PlayerState) (obj)).track() != null) goto _L3; else goto _L2
_L2:
        return true;
_L3:
        message = ((Message) (j));
        message;
        JVM INSTR monitorenter ;
        obj = dto.a((String)((PlayerState) (obj)).track().metadata().get("image_url"));
        if (((Uri) (obj)).equals(d))
        {
            break MISSING_BLOCK_LABEL_120;
        }
        d = ((Uri) (obj));
        e = null;
        i.a = ((Uri) (obj));
        obj = new Runnable(((Uri) (obj))) {

            private Uri a;
            private dvy b;

            public final void run()
            {
                ((gft)dmz.a(gft)).a().a(a).a(0x7f0c0167, 0x7f0c0167).b().a(dvy.f(b));
            }

            
            {
                b = dvy.this;
                a = uri;
                super();
            }
        };
        g.post(((Runnable) (obj)));
          goto _L2
        Exception exception;
        exception;
        message;
        JVM INSTR monitorexit ;
        throw exception;
        d();
          goto _L2
    }
}
