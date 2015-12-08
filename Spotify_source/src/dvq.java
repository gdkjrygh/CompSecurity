// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.AudioManager;
import android.net.Uri;
import android.os.Build;
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
import com.spotify.mobile.android.spotlets.video.VideoPlayerMetadata;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.Change;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.internal.receiver.MediaButtonReceiver;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.squareup.picasso.Picasso;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

public final class dvq
    implements android.os.Handler.Callback, eah
{

    public static final gip a = gip.b("send_playback_broadcasts");
    final Context b;
    public final ghf c;
    final AudioManager d;
    boolean e;
    dvs f;
    PlayerState g;
    Handler h;
    private final boolean i;
    private gfi j;
    private dvr k;
    private Uri l;
    private Bitmap m;
    private Handler n;
    private Handler o;
    private final gin p;
    private final eag q;
    private Player r;
    private Resolver s;
    private Runnable t;
    private com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver u;

    public dvq(Context context, gin gin1, HandlerThread handlerthread, eag eag1)
    {
        t = new Runnable() {

            private dvq a;

            public final void run()
            {
                dvq.a(a).sendEmptyMessage(1001);
            }

            
            {
                a = dvq.this;
                super();
            }
        };
        u = new com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver() {

            private dvq a;

            public final void onPlayerStateReceived(PlayerState playerstate)
            {
                dvq dvq1 = a;
                if (!dvq1.e) goto _L2; else goto _L1
_L1:
                EnumSet enumset;
                Object obj;
                dvq1.f = new dvs(playerstate);
                dvq1.h.removeMessages(1001);
                dvq1.h.sendEmptyMessage(1001);
                obj = dvq1.g;
                enumset = EnumSet.noneOf(com/spotify/mobile/android/util/Change);
                if (obj != null) goto _L4; else goto _L3
_L3:
                Collections.addAll(enumset, Change.values());
_L14:
                long l1 = System.currentTimeMillis();
                if (!dvq1.d() || dvq.a(playerstate)) goto _L6; else goto _L5
_L5:
                Iterator iterator;
                obj = new Intent();
                iterator = enumset.iterator();
_L12:
                if (!iterator.hasNext()) goto _L6; else goto _L7
_L7:
                Change change;
                change = (Change)iterator.next();
                if (((Intent) (obj)).getExtras() != null)
                {
                    ((Intent) (obj)).getExtras().clear();
                }
                final class _cls5
                {

                    static final int a[];

                    static 
                    {
                        a = new int[Change.values().length];
                        try
                        {
                            a[Change.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror3) { }
                        try
                        {
                            a[Change.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror2) { }
                        try
                        {
                            a[Change.c.ordinal()] = 3;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[Change.d.ordinal()] = 4;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                _cls5.a[change.ordinal()];
                JVM INSTR tableswitch 1 4: default 180
            //                           1 474
            //                           2 491
            //                           3 509
            //                           4 104;
                   goto _L8 _L9 _L10 _L11 _L12
_L8:
                ((Intent) (obj)).putExtra("timeSent", l1);
                dvq1.b.sendStickyBroadcast(((Intent) (obj)));
                  goto _L12
_L4:
                if (((PlayerState) (obj)).isPaused() != playerstate.isPaused())
                {
                    enumset.add(Change.b);
                }
                if (((PlayerState) (obj)).isPlaying() != playerstate.isPlaying())
                {
                    enumset.add(Change.b);
                }
                if (!((PlayerState) (obj)).restrictions().disallowSkippingPrevReasons().equals(playerstate.restrictions().disallowSkippingPrevReasons()))
                {
                    enumset.add(Change.c);
                }
                if (!((PlayerState) (obj)).restrictions().disallowSkippingNextReasons().equals(playerstate.restrictions().disallowSkippingNextReasons()))
                {
                    enumset.add(Change.c);
                }
                if (dvq.a(((PlayerState) (obj))) != dvq.a(playerstate))
                {
                    enumset.add(Change.c);
                }
                if (((PlayerState) (obj)).duration() != playerstate.duration())
                {
                    enumset.add(Change.b);
                }
                if (((PlayerState) (obj)).currentPlaybackPosition() != playerstate.currentPlaybackPosition())
                {
                    enumset.add(Change.b);
                }
                if (dvq.b(((PlayerState) (obj))) != dvq.b(playerstate))
                {
                    enumset.add(Change.c);
                }
                if (((PlayerState) (obj)).track() == null && playerstate.track() != null || ((PlayerState) (obj)).track() != null && playerstate.track() == null)
                {
                    enumset.add(Change.a);
                } else
                if (((PlayerState) (obj)).track() != null && playerstate.track() != null && !((PlayerState) (obj)).track().uri().equals(playerstate.track().uri()))
                {
                    enumset.add(Change.a);
                }
                continue; /* Loop/switch isn't completed */
_L9:
                dvh.b(((Intent) (obj)), playerstate);
                ((Intent) (obj)).setAction("com.spotify.music.metadatachanged");
                  goto _L8
_L10:
                dvh.a(((Intent) (obj)), playerstate);
                ((Intent) (obj)).setAction("com.spotify.music.playbackstatechanged");
                  goto _L8
_L11:
                ((Intent) (obj)).setAction("com.spotify.music.queuechanged");
                  goto _L8
_L6:
                if (dvq1.d.isBluetoothA2dpOn())
                {
                    dvq1.a(playerstate, enumset);
                }
                dvq1.g = playerstate;
_L2:
                return;
                if (true) goto _L14; else goto _L13
_L13:
            }

            
            {
                a = dvq.this;
                super();
            }
        };
        b = context;
        p = gin1;
        h = new Handler(handlerthread.getLooper(), this);
        n = new Handler(context.getMainLooper());
        d = (AudioManager)context.getSystemService("audio");
        gin1 = new Intent("android.intent.action.MEDIA_BUTTON");
        gin1.setComponent(new ComponentName(context.getPackageName(), com/spotify/music/internal/receiver/MediaButtonReceiver.getName()));
        gin1 = PendingIntent.getBroadcast(context.getApplicationContext(), 0, gin1, 0);
        if (a())
        {
            context = new ghe(context, gin1, handlerthread.getLooper());
        } else
        {
            context = new ghb(context, gin1);
        }
        c = new ghg(context);
        i = c.c();
        k = new dvr(this, null, (byte)0);
        q = eag1;
        f = new dvs(null);
        o = new Handler(Looper.getMainLooper());
    }

    static Bitmap a(dvq dvq1, Bitmap bitmap)
    {
        dvq1.m = bitmap;
        return bitmap;
    }

    static Handler a(dvq dvq1)
    {
        return dvq1.h;
    }

    private static void a(Intent intent)
    {
        intent.putExtra("id", 1);
        intent.putExtra("playing", true);
    }

    static boolean a()
    {
label0:
        {
            boolean flag2 = false;
            dmz.a(gcz);
            String s1;
            boolean flag;
            boolean flag1;
            if (gcz.a() == 19)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 = flag2;
            if (!flag)
            {
                break label0;
            }
            dmz.a(gcz);
            s1 = gcz.g().toLowerCase(Locale.US);
            if (!s1.contains("huawei"))
            {
                flag1 = flag2;
                if (!s1.contains("acer"))
                {
                    break label0;
                }
            }
            flag1 = true;
        }
        return flag1;
    }

    static boolean a(PlayerState playerstate)
    {
        return playerstate.track() != null && playerstate.track().metadata().containsKey("is_advertisement") && Boolean.valueOf((String)playerstate.track().metadata().get("is_advertisement")).booleanValue();
    }

    static Bitmap b(dvq dvq1, Bitmap bitmap)
    {
        while (!dvq1.i || !gcl.a && !gcl.h || bitmap.getConfig() != null && !gcl.h) 
        {
            return bitmap;
        }
        return bitmap.copy(android.graphics.Bitmap.Config.ARGB_8888, false);
    }

    static Uri b(dvq dvq1)
    {
        return dvq1.l;
    }

    static boolean b(PlayerState playerstate)
    {
        return playerstate.track() != null && playerstate.track().metadata().containsKey("mft.injection_source") && "fallback".equalsIgnoreCase((String)playerstate.track().metadata().get("mft.injection_source"));
    }

    static Runnable c(dvq dvq1)
    {
        return dvq1.t;
    }

    static boolean c(PlayerState playerstate)
    {
        return playerstate.track() != null && playerstate.track().metadata().containsKey("media.type") && "video".equals(playerstate.track().metadata().get("media.type"));
    }

    static Handler d(dvq dvq1)
    {
        return dvq1.o;
    }

    static boolean d(PlayerState playerstate)
    {
        return a(playerstate);
    }

    private void e()
    {
        long l2 = 0L;
        Object obj = new ej();
        dvs dvs1 = f;
        ((ej) (obj)).a("android.media.metadata.TITLE", dvs1.b);
        ((ej) (obj)).a("android.media.metadata.ALBUM", dvs1.c);
        ((ej) (obj)).a("android.media.metadata.ARTIST", dvs1.d);
        ((ej) (obj)).a("android.media.metadata.ALBUM_ARTIST", dvs1.e);
        ((ej) (obj)).a("android.media.metadata.DURATION", dvs1.f);
        if (m != null)
        {
            ((ej) (obj)).a("android.media.metadata.ALBUM_ART", m);
        }
        c.a(((ej) (obj)).a());
        obj = new gi();
        dvs1 = f;
        long l1;
        long l3;
        if (dvs1.i)
        {
            l1 = 512L;
        } else
        {
            l1 = 0L;
        }
        l3 = (int)(l1 | 0L);
        if (dvs1.j)
        {
            l1 = 16L;
        } else
        {
            l1 = 0L;
        }
        l3 = (int)(l1 | l3);
        l1 = l2;
        if (dvs1.k)
        {
            l1 = 32L;
        }
        ((gi) (obj)).a((int)(l3 | l1));
        ((gi) (obj)).a(dvs1.h, dvs1.l);
        c.a(((gi) (obj)).a());
    }

    static boolean e(dvq dvq1)
    {
        return dvq1.e;
    }

    static void f(dvq dvq1)
    {
        dvq1.e();
    }

    static dvr g(dvq dvq1)
    {
        return dvq1.k;
    }

    static Context h(dvq dvq1)
    {
        return dvq1.b;
    }

    final void a(PlayerState playerstate, EnumSet enumset)
    {
        Intent intent;
        intent = new Intent();
        enumset = enumset.iterator();
_L6:
        Change change;
        if (!enumset.hasNext())
        {
            break MISSING_BLOCK_LABEL_205;
        }
        change = (Change)enumset.next();
        if (intent.getExtras() != null)
        {
            intent.getExtras().clear();
        }
        _cls5.a[change.ordinal()];
        JVM INSTR tableswitch 1 4: default 88
    //                   1 99
    //                   2 119
    //                   3 13
    //                   4 13;
           goto _L1 _L2 _L3 _L4 _L4
_L4:
        continue; /* Loop/switch isn't completed */
_L1:
        break; /* Loop/switch isn't completed */
_L2:
        break; /* Loop/switch isn't completed */
_L7:
        b.sendBroadcast(intent);
        if (true) goto _L6; else goto _L5
_L5:
        dvh.b(intent, playerstate);
        a(intent);
        intent.setAction("com.android.music.metachanged");
          goto _L7
_L3:
        dvh.a(intent, playerstate);
        a(intent);
        if (Build.MANUFACTURER.equalsIgnoreCase("samsung"))
        {
            Intent intent1 = new Intent("com.samsung.music.playstatechanged");
            boolean flag;
            if (!playerstate.isPaused() && playerstate.isPlaying())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            intent.putExtra("playing", flag);
            b.sendBroadcast(intent1);
        }
        intent.setAction("com.android.music.playstatechanged");
          goto _L7
          goto _L7
    }

    public final void a(VideoPlayerMetadata videoplayermetadata)
    {
        if (e)
        {
            f = new dvs(videoplayermetadata);
            h.removeMessages(1001);
            h.sendEmptyMessage(1001);
        }
    }

    public final void b()
    {
        if (!e)
        {
            s = Cosmos.getResolver(b);
            s.connect();
            r = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(s, ViewUri.P.toString(), FeatureIdentifier.ae, FeatureIdentifier.ae);
            r.registerPlayerStateObserver(u);
            if (q != null)
            {
                q.a(this);
            }
            f = new dvs(r.getLastPlayerState());
            h.sendEmptyMessage(1001);
            e = true;
        }
    }

    public final void c()
    {
        if (e)
        {
            r.unregisterPlayerStateObserver(u);
            o.removeCallbacks(t);
            s.destroy();
            if (q != null)
            {
                q.b(this);
            }
            e = false;
        }
    }

    final boolean d()
    {
        boolean flag1 = false;
        this;
        JVM INSTR monitorenter ;
        if (p.f(a)) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
        if (j != null)
        {
            break MISSING_BLOCK_LABEL_71;
        }
        j = new gfi(b, new gfk() {

            private dvq a;

            public final void a(gfi gfi1, Cursor cursor)
            {
                if (!cursor.moveToFirst())
                {
                    Assertion.b("Could not load broadcast preference");
                    return;
                }
                synchronized (a)
                {
                    gin gin1 = ((giq)dmz.a(giq)).b(dvq.h(a));
                    boolean flag2 = gcw.a(cursor, 0);
                    cursor = gin1.b();
                    cursor.a(dvq.a, flag2);
                    cursor.b();
                }
                gfi1.b();
                return;
                gfi1;
                dvq1;
                JVM INSTR monitorexit ;
                throw gfi1;
            }

            
            {
                a = dvq.this;
                super();
            }
        });
        j.a(dtx.a, new String[] {
            "post_to_facebook"
        });
        flag = flag1;
_L4:
        this;
        JVM INSTR monitorexit ;
        return flag;
_L2:
        flag = p.a(a, false);
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    public final boolean handleMessage(Message message)
    {
label0:
        {
            if (message.what == 1001)
            {
                if (f.a != null)
                {
                    break label0;
                }
                l = null;
                message = (new ej()).a();
                c.a(message);
                message = (new gi()).a(1, -1L).a();
                c.a(message);
            }
            return true;
        }
        message = f.g;
        if (message != null && !message.equals(l))
        {
            l = message;
            k = new dvr(this, message, (byte)0);
            message = new Runnable(message) {

                private Uri a;
                private dvq b;

                public final void run()
                {
                    ((gft)dmz.a(gft)).a().a(a).a(dvq.g(b));
                }

            
            {
                b = dvq.this;
                a = uri;
                super();
            }
            };
            n.post(message);
            return true;
        } else
        {
            e();
            return true;
        }
    }

}
