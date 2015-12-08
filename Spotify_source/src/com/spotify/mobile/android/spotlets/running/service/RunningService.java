// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.running.service;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Binder;
import android.os.IBinder;
import android.text.TextUtils;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.android.RxCosmos;
import com.spotify.cosmos.android.RxResolver;
import com.spotify.cosmos.android.RxTypedResolver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.spotlets.running.auto.MotionState;
import com.spotify.mobile.android.spotlets.running.model.ContentBucket;
import com.spotify.mobile.android.spotlets.running.model.RunningPlayerContextPage;
import com.spotify.mobile.android.ui.page.DebugFlag;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.spotlets.FeatureIdentifier;
import dmz;
import dup;
import dvk;
import fds;
import fdv;
import fdw;
import fee;
import fem;
import feo;
import fep;
import feq;
import fer;
import fes;
import fet;
import feu;
import fev;
import ffc;
import ffd;
import ffk;
import ffl;
import ffm;
import hew;
import hfb;
import hfg;
import hkf;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class RunningService extends Service
    implements fdw, feu
{

    public ffl a;
    public fee b;
    public fdv c;
    public final Set d = new HashSet();
    public hfg e;
    public SpotifyLink f;
    private final Binder g = new fev(this);
    private ffd h;
    private fep i;

    public RunningService()
    {
        dmz.a(ffm);
    }

    static fep a(RunningService runningservice)
    {
        return runningservice.i;
    }

    public static void a(Context context, ServiceConnection serviceconnection)
    {
        dvk.a(context, serviceconnection, com/spotify/mobile/android/spotlets/running/service/RunningService.getSimpleName());
    }

    public static void a(Context context, ServiceConnection serviceconnection, String s, String s1)
    {
        Intent intent = new Intent(context, com/spotify/mobile/android/spotlets/running/service/RunningService);
        intent.putExtra("uri", s);
        intent.putExtra("username", s1);
        dvk.a(context, intent, serviceconnection, com/spotify/mobile/android/spotlets/running/service/RunningService.getSimpleName());
    }

    public static void a(hfg hfg1)
    {
        if (hfg1 != null && !hfg1.isUnsubscribed())
        {
            hfg1.unsubscribe();
        }
    }

    public final void a()
    {
        fep fep1 = i;
        if (fep1.a != null)
        {
            fep1.a.pause();
        }
    }

    public final void a(double d1)
    {
        if (a != null)
        {
            a.a(d1);
        }
        if (h != null)
        {
            h.a(d1);
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((ffc)iterator.next()).a(d1)) { }
    }

    public final void a(double d1, MotionState motionstate)
    {
        a(d1);
        a(motionstate);
    }

    public final void a(int j)
    {
        String s = fds.a(f, j);
        a(e);
        e = b.a(j).a(((dup)dmz.a(dup)).c()).a(new hfb(s) {

            private String a;
            private RunningService b;

            public final void onCompleted()
            {
                String s1 = a;
            }

            public final void onError(Throwable throwable)
            {
                Logger.b(throwable, "Error while loading tracklists for %s", new Object[] {
                    a
                });
            }

            public final void onNext(Object obj)
            {
                obj = (RunningPlayerContextPage)obj;
                RunningService.a(b).a(a, ((RunningPlayerContextPage) (obj)), null);
            }

            
            {
                b = RunningService.this;
                a = s;
                super();
            }
        });
    }

    public final void a(MotionState motionstate)
    {
        if (a != null)
        {
            a.a(motionstate);
        }
        if (h != null)
        {
            h.a(motionstate);
        }
        for (Iterator iterator = d.iterator(); iterator.hasNext(); ((ffc)iterator.next()).a(motionstate)) { }
    }

    public IBinder onBind(Intent intent)
    {
        Object obj = intent.getStringExtra("username");
        f = new SpotifyLink(intent.getStringExtra("uri"));
        if (i == null)
        {
            new fer();
            intent = FeatureIdentifier.F;
            new feo();
            new fes();
            new fet();
            i = new fep(this, intent);
        }
        intent = b;
        if (!TextUtils.isEmpty(((CharSequence) (obj))))
        {
            ((fee) (intent)).a.onNext(obj);
        }
        intent = b;
        obj = f;
        ((fee) (intent)).b.onNext(obj);
        return g;
    }

    public void onCreate()
    {
        super.onCreate();
        a = ffm.a(this);
        new fem();
        Object obj = DebugFlag.n;
        obj = new RxResolver(RxCosmos.getRouter(this));
        b = new fee(new RxTypedResolver(((RxResolver) (obj)), com/spotify/mobile/android/spotlets/running/model/ContentBucket), new RxTypedResolver(((RxResolver) (obj)), com/spotify/mobile/android/spotlets/running/model/RunningPlayerContextPage));
        h = new ffd(this);
    }

    public void onDestroy()
    {
        if (a != null)
        {
            a.a.a();
        }
        if (i != null)
        {
            fep fep1 = i;
            if (fep1.b != null)
            {
                fep1.b.disconnect();
            }
        }
        if (c != null)
        {
            c.a();
        }
        a(e);
        super.onDestroy();
    }

    public int onStartCommand(Intent intent, int j, int k)
    {
        return 2;
    }

    // Unreferenced inner class com/spotify/mobile/android/spotlets/running/service/RunningService$2

/* anonymous class */
    public final class _cls2
        implements hfb
    {

        private String a;
        private feq b;
        private RunningService c;

        public final void onCompleted()
        {
            String s = a;
        }

        public final void onError(Throwable throwable)
        {
            Logger.b(throwable, "Error while loading tracklists %s", new Object[] {
                a
            });
            b.b();
        }

        public final void onNext(Object obj)
        {
            obj = (RunningPlayerContextPage)obj;
            RunningService.a(c).a(a, ((RunningPlayerContextPage) (obj)), b);
        }

            public 
            {
                c = RunningService.this;
                a = s;
                b = feq1;
                super();
            }
    }

}
