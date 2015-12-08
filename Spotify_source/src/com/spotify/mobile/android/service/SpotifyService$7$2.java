// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.app.PendingIntent;
import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.mobile.android.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.orbit.OrbitServiceObserver;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.MainActivity;
import ctz;
import dmz;
import dux;
import dvp;
import dvv;
import fng;
import fnm;
import fno;
import gea;
import gek;
import get;
import gfi;
import gin;
import gio;

// Referenced classes of package com.spotify.mobile.android.service:
//            SpotifyService

final class a
    implements Runnable
{

    private boolean a;
    private b b;

    public final void run()
    {
        fno fno1 = SpotifyService.i(b.b).d;
        if (a)
        {
            fno1.J_();
            SpotifyService.w(b.b).f.a(com.spotify.mobile.android.provider.c.a, gek.e);
            return;
        } else
        {
            fno1.c();
            SpotifyService.w(b.b).f.b();
            return;
        }
    }

    <init>(<init> <init>1, boolean flag)
    {
        b = <init>1;
        a = flag;
        super();
    }

    // Unreferenced inner class com/spotify/mobile/android/service/SpotifyService$7

/* anonymous class */
    final class SpotifyService._cls7 extends OrbitServiceObserver
    {

        final SpotifyService a;

        public final void onConnectionError(int i)
        {
            SpotifyService spotifyservice = a;
            Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.CONNECTION_ERROR");
            intent.putExtra("error_code", i);
            spotifyservice.sendBroadcast(intent);
        }

        public final void onFeatureError(int i, int j)
        {
            SpotifyService spotifyservice = a;
            Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.FEATURE_ERROR");
            intent.putExtra("feature", i);
            intent.putExtra("error_code", j);
            spotifyservice.sendBroadcast(intent);
        }

        public final void onIncognitoModeDisabledByTimer()
        {
            PendingIntent pendingintent = dvv.a(a);
            SpotifyService.c(a).a(0x7f08036e, 0x7f08036d, pendingintent, 5);
        }

        public final void onLastFmAuthenticationError()
        {
            PendingIntent pendingintent = dvv.a(a);
            SpotifyService.c(a).a(0x7f080370, 0x7f08036f, pendingintent, 4);
        }

        public final void onLoginError(int i)
        {
            SpotifyService spotifyservice = a;
            Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.LOGIN_ERROR");
            intent.putExtra("error_code", i);
            spotifyservice.sendBroadcast(intent);
        }

        public final void onOfflineSyncError(int i)
        {
            SpotifyService spotifyservice = a;
            Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.OFFLINE_SYNC_ERROR");
            intent.putExtra("error_code", i);
            spotifyservice.sendBroadcast(intent);
        }

        public final void onOrbitStarted()
        {
        }

        public final void onOrbitStopped()
        {
            synchronized (SpotifyService.s(a))
            {
                if (SpotifyService.t(a) != null)
                {
                    SpotifyService.t(a).destroy();
                    SpotifyService.u(a);
                }
            }
            SpotifyService.m(a).destroy();
            Logger.c("orbit stopped", new Object[0]);
            SpotifyService.v(a).a.a(1);
            a.stopSelf();
            return;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public final void onPlayTokenLost()
        {
            dvp dvp1 = SpotifyService.c(a);
            SpotifyService spotifyservice = a;
            ctz.a(spotifyservice);
            dvp1.a(0x7f080376, 0x7f080375, PendingIntent.getActivity(spotifyservice, 0, new Intent(spotifyservice, com/spotify/music/MainActivity), 0), 3);
        }

        public final void onPlaybackError(int i, String s)
        {
            if (i == 14)
            {
                ((get)dmz.a(get)).c.b().a(get.a, i).a(get.b, s).a();
            }
            SpotifyService spotifyservice = a;
            Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.PLAYBACK_ERROR");
            intent.putExtra("error_code", i);
            intent.putExtra("uri", s);
            spotifyservice.sendBroadcast(intent);
        }

        public final void onSessionIdle(boolean flag)
        {
            SpotifyService.j(a).post(new SpotifyService._cls7._cls1(flag));
        }

        public final void onSocialError(int i, String s)
        {
            SpotifyService spotifyservice = a;
            Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.SOCIAL_ERROR");
            intent.putExtra("error_code", i);
            intent.putExtra("error_description", s);
            spotifyservice.sendBroadcast(intent);
        }

        public final void onSyncActive(boolean flag)
        {
            SpotifyService.j(a).post(new SpotifyService._cls7._cls2(this, flag));
        }

        public final void onUpdateAvailable(String s)
        {
            SpotifyService spotifyservice = a;
            Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.UPDATE_AVAILABLE");
            intent.setData(Uri.parse(s));
            spotifyservice.sendBroadcast(intent);
        }

            
            {
                a = spotifyservice;
                super();
            }

        // Unreferenced inner class com/spotify/mobile/android/service/SpotifyService$7$1

/* anonymous class */
        final class SpotifyService._cls7._cls1
            implements Runnable
        {

            private boolean a;
            private SpotifyService._cls7 b;

            public final void run()
            {
                fng fng1 = SpotifyService.i(b.a).c;
                if (a)
                {
                    fng1.c();
                    return;
                } else
                {
                    fng1.J_();
                    return;
                }
            }

                    
                    {
                        b = SpotifyService._cls7.this;
                        a = flag;
                        super();
                    }
        }

    }

}
