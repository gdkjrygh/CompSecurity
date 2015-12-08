// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.TextureView;
import android.widget.ProgressBar;
import com.google.android.exoplayer.ExoPlaybackException;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrackUtil;
import com.spotify.mobile.android.cosmos.player.v2.internal.LoggingParameters;
import com.spotify.mobile.android.http.NetworkAccessWhileInOfflineModeException;
import com.spotify.mobile.android.ui.page.DebugFlag;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.video.VideoSurfaceView;
import com.spotify.mobile.android.video.drm.DrmException;
import com.spotify.mobile.android.video.exo.DashManifestLoader;
import com.spotify.mobile.android.video.exo.ManifestResponseException;
import com.spotify.mobile.android.video.exo.NoSuitableRepresentationException;
import com.spotify.mobile.android.video.model.TrackWithPlayOrigin;
import com.spotify.mobile.android.video.model.VideoPlayerCommand;
import com.spotify.mobile.android.video.model.VideoPlayerError;
import com.spotify.mobile.android.video.model.VideoPlayerState;
import com.spotify.mobile.android.video.stats.Reason;
import java.io.File;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

public final class gkc extends gkw
    implements gkd, gkm, glm, glw
{

    private static final HashSet v;
    final Context a;
    final Looper b;
    final dup c = (dup)dmz.a(dup);
    ayr d;
    gjz e;
    gkf f;
    gkl g;
    gll h;
    gcf i;
    glv j;
    gki k;
    gkh l;
    glt m;
    boolean n;
    boolean o;
    boolean p;
    public volatile boolean q;
    String r;
    boolean s;
    hfg t;
    hfb u;
    private VideoSurfaceView w;
    private int x;
    private int y;

    public gkc(Context context, Looper looper)
    {
        g = (gkl)dmz.a(gkl);
        dmz.a(glo);
        dmz.a(glx);
        dmz.a(gkb);
        k = (gki)dmz.a(gki);
        r = "";
        u = new hfb() {

            private gkc a;

            public final void onCompleted()
            {
            }

            public final void onError(Throwable throwable)
            {
                Logger.b(throwable, "Error while observing Video Player commands", new Object[0]);
            }

            public final void onNext(Object obj)
            {
                Object obj1;
                obj1 = (VideoPlayerCommand)obj;
                if (((VideoPlayerCommand) (obj1)).type != null)
                {
                    ((VideoPlayerCommand) (obj1)).type.name();
                }
                if (((VideoPlayerCommand) (obj1)).type != com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.a) goto _L2; else goto _L1
_L1:
                a.a(((VideoPlayerCommand) (obj1)).trackWithPlayOrigin, ((VideoPlayerCommand) (obj1)).startReason, ((VideoPlayerCommand) (obj1)).seekToInMs, ((VideoPlayerCommand) (obj1)).initiallyPaused, ((VideoPlayerCommand) (obj1)).loggingParameters.commandInitiatedTime);
_L4:
                return;
_L2:
                if (((VideoPlayerCommand) (obj1)).type != com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.b)
                {
                    break; /* Loop/switch isn't completed */
                }
                obj = a;
                if (!((gkc) (obj)).q)
                {
                    ((gkc) (obj)).l.a(Reason.c, false);
                    ((gkc) (obj)).g();
                    return;
                }
                if (true) goto _L4; else goto _L3
_L3:
                if (((VideoPlayerCommand) (obj1)).type == com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.c)
                {
                    a.k();
                    return;
                }
                if (((VideoPlayerCommand) (obj1)).type != com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.d) goto _L6; else goto _L5
_L5:
                obj = a;
                if (((gkc) (obj)).q)
                {
                    continue; /* Loop/switch isn't completed */
                }
                if (((gkc) (obj)).o) goto _L8; else goto _L7
_L7:
                obj1 = ((gkc) (obj)).e;
                boolean flag;
                if (!((gjz) (obj1)).d && ((gjz) (obj1)).a != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (!flag) goto _L10; else goto _L9
_L9:
                ((gkc) (obj)).a(((gkc) (obj)).e.b, Reason.a.mReason, ((gkc) (obj)).e.g, false, gcf.a());
_L8:
                ((gkc) (obj)).f();
                return;
_L10:
                if (((gkc) (obj)).e.d)
                {
                    if (((gkc) (obj)).p)
                    {
                        ((gkc) (obj)).f.a(gkf.c);
                        return;
                    }
                    ((gkc) (obj)).d.b(true);
                    ((gkc) (obj)).l.b();
                }
                if (true) goto _L8; else goto _L6
_L6:
                if (((VideoPlayerCommand) (obj1)).type != com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.e)
                {
                    continue; /* Loop/switch isn't completed */
                }
                obj = a;
                long l1 = ((VideoPlayerCommand) (obj1)).seekToInMs;
                if (!((gkc) (obj)).q && ((gkc) (obj)).e.d)
                {
                    obj.s = true;
                    ((gkc) (obj)).d.a(l1);
                    obj = ((gkc) (obj)).l;
                    obj1 = ((gkh) (obj)).b;
                    long l2 = ((gkh) (obj)).a.d();
                    if (((gmd) (obj1)).b())
                    {
                        ((gmd) (obj1)).a(((gmd) (obj1)).e, l2);
                        ((gmd) (obj1)).a(((gmd) (obj1)).d, l2, ((gmd) (obj1)).g);
                        if (l1 < l2)
                        {
                            obj1.m = ((gmd) (obj1)).m + 1;
                            obj1.n = ((gmd) (obj1)).n + (l2 - l1);
                        } else
                        {
                            obj1.p = ((gmd) (obj1)).p + 1;
                            obj1.o = ((gmd) (obj1)).o + (l1 - l2);
                        }
                        obj1.e = l1;
                        obj1.d = l1;
                        if (((gmd) (obj1)).g())
                        {
                            ((gmd) (obj1)).h();
                        }
                        if (((gmd) (obj1)).e())
                        {
                            ((gmd) (obj1)).f();
                        }
                        obj1.t = false;
                        return;
                    }
                }
                continue; /* Loop/switch isn't completed */
                if (((VideoPlayerCommand) (obj1)).type != com.spotify.mobile.android.video.model.VideoPlayerCommand.Type.f) goto _L4; else goto _L11
_L11:
                obj = a;
                PlayerTrack aplayertrack[] = ((VideoPlayerCommand) (obj1)).prefetchTracks;
                if (!((gkc) (obj)).q)
                {
                    HashSet hashset = new HashSet();
                    Collections.addAll(hashset, aplayertrack);
                    if (((gkc) (obj)).j != null)
                    {
                        ((gkc) (obj)).j.a(hashset);
                        return;
                    }
                }
                if (true) goto _L4; else goto _L12
_L12:
            }

            
            {
                a = gkc.this;
                super();
            }
        };
        a = context;
        b = looper;
        dmz.a(ggb);
        i = ggb.a();
        e = new gjz();
        q = false;
    }

    private void a(VideoPlayerState videoplayerstate)
    {
        f.a(videoplayerstate);
    }

    private void a(String s1, glp glp1)
    {
        l.a(glp1, e.d);
        if (e.d)
        {
            if (s1.equals("track_unavailable_offline"))
            {
                f.a(gkf.e);
            } else
            {
                s1 = new VideoPlayerError(s1, e);
                f.a(s1);
            }
        }
        d.b(false);
        g();
        f();
    }

    private boolean a(String s1)
    {
        return e.d && s1.equals(e.a);
    }

    private void c(VideoSurfaceView videosurfaceview)
    {
        this;
        JVM INSTR monitorenter ;
        if (videosurfaceview == w && e.d)
        {
            d(videosurfaceview);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        videosurfaceview;
        throw videosurfaceview;
    }

    private void c(boolean flag)
    {
        Intent intent = dvv.a(a, "com.spotify.mobile.android.service.action.video.STATE_CHANGED");
        intent.putExtra("state_enabled", flag);
        a.startService(intent);
    }

    private void d(VideoSurfaceView videosurfaceview)
    {
        videosurfaceview.a(y, x);
        d.a(e.a(), videosurfaceview.g);
        gkh gkh1 = l;
        boolean flag = videosurfaceview.k;
        long l1 = d.g();
        videosurfaceview = gkh1.b;
        if (videosurfaceview.b())
        {
            if (((gmd) (videosurfaceview)).B && !flag)
            {
                ((gmd) (videosurfaceview)).D.add(new gmc(((gmd) (videosurfaceview)).C, l1 - ((gmd) (videosurfaceview)).C));
                videosurfaceview.B = false;
            } else
            if (!((gmd) (videosurfaceview)).B && flag)
            {
                videosurfaceview.C = l1;
                videosurfaceview.B = true;
                return;
            }
        }
    }

    private void d(boolean flag)
    {
        boolean flag1 = true;
        this;
        JVM INSTR monitorenter ;
        if (e.b == null) goto _L2; else goto _L1
_L1:
        Object obj;
        VideoSurfaceView videosurfaceview;
        obj = g.a(e.b.track);
        videosurfaceview = w;
        if (videosurfaceview != null || obj != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        if (w != obj && w != null)
        {
            w.setKeepScreenOn(false);
            w.a();
        }
        if (obj != null) goto _L5; else goto _L4
_L4:
        d.a(e.a());
_L9:
        w = ((VideoSurfaceView) (obj));
        r();
          goto _L2
        obj;
        throw obj;
_L5:
        ((VideoSurfaceView) (obj)).a(y, x);
        DebugFlag debugflag = DebugFlag.g;
        if (!flag) goto _L7; else goto _L6
_L6:
        if (obj != w)
        {
            dmz.a(glj);
            if (!glj.a())
            {
                ((VideoSurfaceView) (obj)).a(e.b.track, d.g());
                ((VideoSurfaceView) (obj)).a(true);
            }
        }
_L7:
        if (w == obj) goto _L9; else goto _L8
_L8:
        if (((VideoSurfaceView) (obj)).d != null)
        {
            ((VideoSurfaceView) (obj)).d.a();
        }
        if (((VideoSurfaceView) (obj)).a == null || !((VideoSurfaceView) (obj)).a.isAvailable())
        {
            flag1 = false;
        }
        if (!flag1) goto _L9; else goto _L10
_L10:
        d(((VideoSurfaceView) (obj)));
          goto _L9
    }

    private VideoPlayerState o()
    {
        boolean flag1 = true;
        gly gly1 = new gly();
        String s1 = e.a;
        gly1.a.playbackId = s1;
        long l1 = d.f();
        gly1.a.durationInMs = Long.valueOf(l1);
        float f1;
        boolean flag;
        if (n())
        {
            f1 = 1.0F;
        } else
        {
            f1 = 0.0F;
        }
        gly1.a.playbackSpeed = f1;
        l1 = d();
        gly1.a.positionAsOfTimestampInMs = Long.valueOf(l1);
        if (d.b() == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        gly1.a.isBuffering = flag;
        if (!d.c())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        gly1.a.isPaused = flag;
        l1 = gcf.a();
        gly1.a.timestamp = l1;
        return gly1.a;
    }

    private void p()
    {
        l.a(Reason.b, true);
        f.a(gkf.a);
        g();
    }

    private void q()
    {
        while (q || !e.d || e.a() == null) 
        {
            return;
        }
        d(true);
    }

    private void r()
    {
        if (w != null)
        {
            VideoSurfaceView videosurfaceview = w;
            boolean flag;
            if (d.c() && v.contains(Integer.valueOf(d.b())))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            videosurfaceview.setKeepScreenOn(flag);
        }
    }

    public final void a()
    {
        if (!q)
        {
            Object obj = l.b;
            if (((gmd) (obj)).b())
            {
                if (!((gmd) (obj)).l.U)
                {
                    gmb gmb1 = ((gmd) (obj)).l;
                    long l1;
                    if (((gmd) (obj)).i > 0L)
                    {
                        l1 = gcf.a() - ((gmd) (obj)).i;
                    } else
                    {
                        l1 = -1L;
                    }
                    gmb1.z = l1;
                    gmb1.U = true;
                }
                if (!((gmd) (obj)).l.V)
                {
                    gmb1 = ((gmd) (obj)).l;
                    gmb1.y = gcf.b() - ((gmd) (obj)).j;
                    gmb1.V = true;
                }
            }
            if (w != null)
            {
                w.b(false);
                obj = w;
                ((VideoSurfaceView) (obj)).a(false);
                if (((VideoSurfaceView) (obj)).d != null)
                {
                    ((VideoSurfaceView) (obj)).d.c();
                    return;
                }
            }
        }
    }

    public final void a(int i1, int j1, float f1)
    {
        if (!q && e.d)
        {
            y = i1;
            x = j1;
            VideoSurfaceView videosurfaceview = g.a(e.b.track);
            if (videosurfaceview != null)
            {
                videosurfaceview.a(i1, j1);
                return;
            }
        }
    }

    public final void a(int i1, bad bad1, int j1)
    {
        if (!q && bad1 != null)
        {
            if (i1 == 1)
            {
                gmd gmd1 = l.b;
                if (gmd1.b())
                {
                    if (gmd1.x == -1L)
                    {
                        gmd1.x = bad1.c;
                    }
                    gmd1.a(gmd1.d, j1, gmd1.g);
                    gmd1.d = j1;
                    gmd1.g = bad1;
                    return;
                }
            } else
            if (i1 == 0)
            {
                l.b.f = bad1;
                return;
            } else
            {
                Logger.b("Unknown event source id for downstream format changed event", new Object[0]);
                return;
            }
        }
    }

    public final void a(long l1)
    {
        if (q)
        {
            return;
        } else
        {
            gmd gmd1 = l.b;
            gmd1.z = gmd1.z + l1;
            return;
        }
    }

    public final void a(android.media.MediaCodec.CryptoException cryptoexception)
    {
        if (q)
        {
            return;
        } else
        {
            cryptoexception.getMessage();
            a("video_playback_error", new glp(cryptoexception));
            return;
        }
    }

    public final void a(ExoPlaybackException exoplaybackexception)
    {
        if (q)
        {
            return;
        }
        Logger.b(exoplaybackexception, "Video playback error", new Object[0]);
        Object obj = exoplaybackexception.getCause();
        if (obj instanceof NetworkAccessWhileInOfflineModeException)
        {
            exoplaybackexception.getMessage();
            a("track_unavailable_offline", new glp(exoplaybackexception));
            return;
        }
        exoplaybackexception.getMessage();
        if (obj == null)
        {
            obj = exoplaybackexception;
        }
        a("video_playback_error", new glp(((Throwable) (obj))));
        Assertion.b("Video playback error", exoplaybackexception);
    }

    public final void a(com.google.android.exoplayer.MediaCodecTrackRenderer.DecoderInitializationException decoderinitializationexception)
    {
        if (q)
        {
            return;
        } else
        {
            decoderinitializationexception.getMessage();
            a("video_playback_error", new glp(decoderinitializationexception));
            return;
        }
    }

    public final void a(VideoSurfaceView videosurfaceview)
    {
        c(videosurfaceview);
    }

    final void a(TrackWithPlayOrigin trackwithplayorigin, String s1, long l1, boolean flag, long l2)
    {
        Object obj;
        ctz.a(trackwithplayorigin);
        ctz.a(trackwithplayorigin.track);
        if (q)
        {
            return;
        }
        if (o && !PlayerTrackUtil.isBackgroundable(trackwithplayorigin.track))
        {
            k();
            f.a(gkf.b);
            return;
        }
        if (p)
        {
            f.a(gkf.c);
            return;
        }
        l.a(Reason.a(s1), false);
        g();
        try
        {
            obj = trackwithplayorigin.track;
            ctz.a(obj);
            if (!((PlayerTrack) (obj)).metadata().containsKey("media.manifest_id"))
            {
                throw new IllegalArgumentException("Could not read manifest id from track");
            }
        }
        // Misplaced declaration of an exception variable
        catch (TrackWithPlayOrigin trackwithplayorigin)
        {
            Logger.c("Could not read manifest id from track", new Object[0]);
            f.a(gkf.d);
            return;
        }
        obj = (String)((PlayerTrack) (obj)).metadata().get("media.manifest_id");
        if (!flag)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        e = new gjz(trackwithplayorigin, flag);
        l = gki.a(a, this, trackwithplayorigin.track);
        l.a(trackwithplayorigin, s1, ((String) (obj)), l1, l2, r);
        d.a(l1);
        s1 = l.b;
        if (s1.b())
        {
            s1.h = gcf.b();
        }
        s1 = h;
        trackwithplayorigin = trackwithplayorigin.playbackId;
        if (gcl.a)
        {
            a(trackwithplayorigin, new UnsupportedOperationException("Error: current api < 16"));
        } else
        {
            ((gll) (s1)).c.a(((String) (obj)), new gll._cls1(s1, this, trackwithplayorigin));
        }
        c(true);
        return;
    }

    public final void a(Exception exception)
    {
        if (q)
        {
            return;
        } else
        {
            exception.getMessage();
            a("video_playback_error", new glp(exception));
            return;
        }
    }

    public final void a(String s1, Exception exception)
    {
        ctz.a(s1);
        if (q)
        {
            return;
        }
        if (!a(s1)) goto _L2; else goto _L1
_L1:
        f();
        Logger.b(exception, "Error creating video/audio renderers", new Object[0]);
        if (!(exception instanceof UnsupportedOperationException)) goto _L4; else goto _L3
_L3:
        s1 = "video_unsopported_platform_version";
_L5:
        if (exception != null)
        {
            exception.getMessage();
        }
        a(s1, new glp(exception));
        return;
_L4:
        if (exception instanceof ManifestResponseException)
        {
            s1 = ((ManifestResponseException)exception).a();
            continue; /* Loop/switch isn't completed */
        }
        if (!(exception instanceof NoSuitableRepresentationException))
        {
            if (exception instanceof NetworkAccessWhileInOfflineModeException)
            {
                s1 = "track_unavailable_offline";
                continue; /* Loop/switch isn't completed */
            }
            if (exception instanceof DrmException)
            {
                int i1 = ((DrmException)exception).mReason;
                Logger.b(exception, "Could not initiate DRM playback with reason %d", new Object[] {
                    Integer.valueOf(i1)
                });
                if (i1 == 2)
                {
                    s1 = "video_unsopported_platform_version";
                } else
                {
                    s1 = "video_playback_error";
                }
                continue; /* Loop/switch isn't completed */
            }
            if (exception instanceof IOException)
            {
                Logger.b(exception, "Could not load manifest with reason %s", new Object[] {
                    exception.getMessage()
                });
            }
        }
        s1 = "video_playback_error";
        if (true) goto _L5; else goto _L2
_L2:
        Logger.b("Got renderers error for video other than the current one, ignoring", new Object[0]);
        return;
    }

    public final void a(String s1, Throwable throwable)
    {
        Logger.b(throwable, "Could not prefetch track with manifestId %s", new Object[] {
            s1
        });
    }

    public final void a(String s1, azq aazq[], Map map, UUID uuid)
    {
        ctz.a(s1);
        ctz.a(aazq);
        ctz.a(map);
        if (!q)
        {
            if (a(s1))
            {
                s1 = e;
                ctz.a(aazq);
                ctz.a(map);
                if (((gjz) (s1)).e != null || ((gjz) (s1)).f != null)
                {
                    Assertion.b("Trying to set renderers and available formats twice on the same playing entity");
                }
                s1.e = aazq;
                s1.f = map;
                d.a(aazq);
                d(false);
                d.b(e.c);
                s1 = l.b;
                if (s1.b())
                {
                    ((gmd) (s1)).l.R = uuid;
                    return;
                }
            } else
            {
                Logger.b("Got renderers for video other than the current one, ignoring.", new Object[0]);
                return;
            }
        }
    }

    public final void a(boolean flag)
    {
        boolean flag1 = true;
        o = flag;
        if (n)
        {
            if (o)
            {
                d.a(false);
            } else
            {
                d.a(true);
            }
            if (o)
            {
                if (e == null || e.b == null || !PlayerTrackUtil.isBackgroundable(e.b.track))
                {
                    flag1 = false;
                }
                if (!flag1)
                {
                    k();
                }
            }
        }
    }

    public final void a(boolean flag, int i1)
    {
        if (!q) goto _L2; else goto _L1
_L1:
        return;
_L2:
        i1;
        JVM INSTR tableswitch 1 5: default 44
    //                   1 92
    //                   2 99
    //                   3 71
    //                   4 78
    //                   5 85;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L3:
        String s1 = "Unknown";
_L9:
        r();
        String s2;
        if (i1 == 5)
        {
            p();
        } else
        if (i1 == 4)
        {
            s = false;
            if (w != null)
            {
                w.b(false);
            }
            if (d.f() - d.g() < 100L)
            {
                p();
            } else
            {
                l.c();
            }
        } else
        if (i1 == 3)
        {
            gmd gmd1 = l.b;
            if (gmd1.b())
            {
                if (!gmd1.u)
                {
                    gmd1.v = gcf.b();
                    gmd1.u = true;
                } else
                if (gmd1.t)
                {
                    gmd1.q = gmd1.q + 1;
                    if (gmd1.s < 0L)
                    {
                        gmd1.s = gcf.b();
                    }
                } else
                if (gmd1.w < 0L)
                {
                    gmd1.w = gcf.b();
                }
            }
            if (w != null)
            {
                if (s)
                {
                    w.b(true);
                } else
                {
                    w.b.setVisibility(0);
                }
            }
        }
        if (i1 != 1)
        {
            f();
            return;
        }
        if (true) goto _L1; else goto _L6
_L6:
        s2 = "Buffering";
          goto _L9
_L7:
        s2 = "Ready";
          goto _L9
_L8:
        s2 = "Ended";
          goto _L9
_L4:
        s2 = "Idle";
          goto _L9
_L5:
        s2 = "Preparing";
          goto _L9
    }

    public final void b()
    {
        gmd gmd1;
        if (!q)
        {
            if ((gmd1 = l.b).b() && !gmd1.l.W)
            {
                gmb gmb1 = gmd1.l;
                gmb1.S = gcf.b() - gmd1.E;
                gmb1.W = true;
                return;
            }
        }
    }

    public final void b(VideoSurfaceView videosurfaceview)
    {
        c(videosurfaceview);
    }

    public final void b(boolean flag)
    {
        p = flag;
        if (n && p && d.c())
        {
            k();
            f.a(gkf.c);
        }
    }

    public final void c()
    {
        Assertion.b(q, "This VideoPlayer instance was already released");
        n = false;
        q = true;
        if (l != null)
        {
            l.a(Reason.c, true);
        }
        if (t != null)
        {
            t.unsubscribe();
        }
        if (d != null)
        {
            e.d = false;
            a(o());
            d.b(this);
        }
        g.a.remove(this);
        if (f != null)
        {
            f.b();
        }
        ((gmv)dmz.a(gmv)).a();
        if (d != null)
        {
            d.e();
        }
        ((gmv)dmz.a(gmv)).b();
        d = null;
        if (j != null)
        {
            j.quit();
        }
        if (m != null)
        {
            glt glt1 = m;
            Exception exception;
            if (glt1.a != null && !glt1.a.a())
            {
                try
                {
                    glt1.a.close();
                }
                catch (IOException ioexception)
                {
                    Logger.c("Error trying to close cache", new Object[0]);
                }
            }
        }
        f = null;
        g = null;
        h = null;
        l = null;
        j = null;
        m = null;
        e = null;
        return;
        exception;
        ((gmv)dmz.a(gmv)).b();
        throw exception;
    }

    public final long d()
    {
        return d.g();
    }

    public final long e()
    {
        return d.f();
    }

    final void f()
    {
        a(o());
    }

    final void g()
    {
        d.d();
        e.d = false;
        e.g = d.g();
        c(false);
        if (w != null)
        {
            w.setKeepScreenOn(false);
            w.a();
        }
        w = null;
    }

    public final void h()
    {
        q();
    }

    public final void i()
    {
        q();
    }

    public final void j()
    {
        q();
    }

    final void k()
    {
        if (q)
        {
            return;
        } else
        {
            d.b(false);
            l.a();
            f();
            return;
        }
    }

    public final void l()
    {
        gmd gmd1;
        if (!q)
        {
            if ((gmd1 = l.b).b())
            {
                gmd1.l.t = gcf.b() - gmd1.h;
                return;
            }
        }
    }

    public final void m()
    {
        gmd gmd1;
        if (!q)
        {
            if ((gmd1 = l.b).b())
            {
                gmd1.E = gcf.b();
                return;
            }
        }
    }

    public final boolean n()
    {
        return e.d && d.b() == 4 && d.c();
    }

    static 
    {
        HashSet hashset = new HashSet();
        v = hashset;
        hashset.add(Integer.valueOf(3));
        v.add(Integer.valueOf(2));
        v.add(Integer.valueOf(4));
    }

    // Unreferenced inner class gkc$2

/* anonymous class */
    public final class _cls2 extends hff
    {

        private gkc a;

        public final void onCompleted()
        {
        }

        public final void onError(Throwable throwable)
        {
            Logger.c("Error subscribing to video feature flags. VideoPlayer cannot initialize.", new Object[0]);
            a.c();
        }

        public final void onNext(Object obj)
        {
            obj = (gka)obj;
            gkc gkc1 = a;
            gkc1.r = ((gka) (obj)).c;
            gkc1.f = ((gkg)dmz.a(gkg)).a(gkc1.a);
            gkq gkq1 = new gkq(new Handler(gkc1.b));
            gkv gkv1 = new gkv(((gka) (obj)).b);
            Object obj1 = gkc1.k;
            obj1 = gkc1.a;
            gcf gcf1 = gkc1.i;
            gkc1.l = gki.a(((Context) (obj1)), gkc1, null);
            dmz.a(gkz);
            gkc1.d = gkz.a();
            gkc1.g.a.add(gkc1);
            gkc1.d.a(gkc1);
            try
            {
                gkc1.m = new glt(new File(gkc1.a.getExternalCacheDir(), "video/segments"));
                gkc1.j = glx.a(gkc1.a, gkc1.m, new Handler(gkc1.b), gkc1, gkq1, gkc1.d.a(), gkv1, ((gka) (obj)).a);
                gkc1.j.start();
            }
            catch (IOException ioexception)
            {
                Logger.c("Could not create segment cache. No segment prefetch / cache will be used.", new Object[0]);
                gkc1.m = null;
            }
            gkc1.h = glo.a(gkc1.a, gkc1.b, gkc1, gkc1.m, gkc1.d.a(), gkq1, gkv1, ((gka) (obj)));
            gkc1.t = gkc1.f.a().b(gkc1.c.a()).a(gkc1.c.c()).a(gkc1.u);
            gkc1.n = true;
            unsubscribe();
        }

            public 
            {
                a = gkc.this;
                super();
            }
    }

}
