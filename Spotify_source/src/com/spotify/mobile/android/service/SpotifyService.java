// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.service;

import android.app.ActivityManager;
import android.app.KeyguardManager;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.ServiceConnection;
import android.content.pm.PackageInfo;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.TrafficStats;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.Looper;
import android.os.Process;
import android.os.ResultReceiver;
import android.os.SystemClock;
import android.view.KeyEvent;
import bb;
import byg;
import com.facebook.AppEventsLogger;
import com.google.common.base.Optional;
import com.nielsen.app.sdk.AppSdk;
import com.spotify.cosmos.android.Cosmos;
import com.spotify.cosmos.android.DeferredResolver;
import com.spotify.cosmos.android.RemoteNativeRouter;
import com.spotify.cosmos.android.Resolver;
import com.spotify.cosmos.android.Subscription;
import com.spotify.cosmos.router.NativeRouter;
import com.spotify.cosmos.router.Response;
import com.spotify.mobile.android.connect.ConnectManager;
import com.spotify.mobile.android.connect.DiscoveryClient;
import com.spotify.mobile.android.core.internal.ConnectivityListener;
import com.spotify.mobile.android.core.internal.LocalFilePlayer;
import com.spotify.mobile.android.core.internal.SoundDriver;
import com.spotify.mobile.android.cosmos.JsonCallbackReceiver;
import com.spotify.mobile.android.cosmos.player.v2.Player;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.cosmos.player.v2.PlayerTrack;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import com.spotify.mobile.android.model.TermsAndConditionsModel;
import com.spotify.mobile.android.orbit.NativeOrbitFactory;
import com.spotify.mobile.android.orbit.OrbitFactory;
import com.spotify.mobile.android.orbit.OrbitProviderObservable;
import com.spotify.mobile.android.orbit.OrbitServiceInterface;
import com.spotify.mobile.android.orbit.OrbitServiceObserver;
import com.spotify.mobile.android.orbit.OrbitSessionInterface;
import com.spotify.mobile.android.spotlets.ads.model.AdSlot;
import com.spotify.mobile.android.spotlets.ads.model.Format;
import com.spotify.mobile.android.spotlets.ads.model.Sponsorships;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.spotlets.collection.service.CollectionService;
import com.spotify.mobile.android.spotlets.playlist.activity.AddToPlaylistActivity;
import com.spotify.mobile.android.ui.fragments.logic.Flags;
import com.spotify.mobile.android.ui.page.DebugFlag;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientEvent;
import com.spotify.mobile.android.util.ClientEventFactory;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.SpotifyLink;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.mobile.android.util.tracking.AppStartupTimerMessage;
import com.spotify.mobile.android.util.tracking.ViewLoadTimerMessage;
import com.spotify.mobile.android.util.viewuri.Verified;
import com.spotify.mobile.android.util.viewuri.ViewUri;
import com.spotify.music.MainActivity;
import com.spotify.music.internal.provider.SpotifyProvider;
import com.spotify.music.internal.service.DeleteCacheService;
import com.spotify.music.spotlets.FeatureIdentifier;
import com.spotify.music.spotlets.radio.service.RadioActionsService;
import ctz;
import dlc;
import dld;
import dle;
import dll;
import dmz;
import dtk;
import dtw;
import dtx;
import dur;
import dus;
import dut;
import duu;
import duv;
import duw;
import dux;
import dvb;
import dvc;
import dvd;
import dve;
import dvf;
import dvg;
import dvi;
import dvk;
import dvn;
import dvo;
import dvp;
import dvq;
import dvt;
import dvu;
import dvv;
import dvw;
import dvy;
import dwa;
import dwb;
import dwc;
import dwd;
import dwe;
import dwf;
import dwg;
import dwx;
import dxc;
import dyz;
import dza;
import dzc;
import dze;
import dzv;
import dzw;
import dzy;
import eaa;
import eab;
import eac;
import ead;
import eae;
import eaf;
import eag;
import ecw;
import ecx;
import edt;
import edy;
import eej;
import een;
import eez;
import efg;
import efh;
import fdo;
import fiy;
import flb;
import fmd;
import fmu;
import fmw;
import fmx;
import fne;
import fnf;
import fng;
import fni;
import fnj;
import fnk;
import fnm;
import fno;
import fnq;
import fop;
import fqk;
import fqo;
import fqr;
import fqs;
import fqv;
import frc;
import frd;
import fre;
import fys;
import gbo;
import gbq;
import gbw;
import gcf;
import gcl;
import gcr;
import gea;
import gek;
import get;
import gey;
import gfi;
import gfk;
import ggc;
import ggi;
import ghf;
import ghq;
import gin;
import gio;
import gip;
import giq;
import gjb;
import gkb;
import gkc;
import gke;
import gms;
import gnd;
import hew;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.spotify.mobile.android.service:
//            StateRestoreFileDeleter, BluetoothServiceManager, LoginActivity, ForceInCollection, 
//            LoggerProvider, GaiaJacksonModel

public class SpotifyService extends Service
    implements dvn
{

    public static final gip a = gip.b("video_ads_exoplayer_enabled");
    public static final String b = Integer.toString(0x1908b3e3);
    private static gip f = gip.a("service_crash_count");
    private dzv A;
    private final Handler B = new Handler();
    private fnm C;
    private fnk D;
    private dza E;
    private gnd F;
    private long G;
    private gjb H;
    private dxc I;
    private final ScheduledThreadPoolExecutor J = new ScheduledThreadPoolExecutor(1);
    private final dus K;
    private boolean L;
    private gkc M;
    private boolean N;
    private final gfk O = new dvo(this);
    private eej P;
    private gfi Q;
    private DeferredResolver R;
    private Player S;
    private Subscription T;
    private dvb U;
    private final dvt V = new dvt(this);
    private Locale W;
    private fqr X;
    private frc Y;
    private KeyguardManager Z;
    private final dwx aa = new dwx() {

        private SpotifyService a;

        public final void a(Flags flags)
        {
            a.e = flags;
            (new duw(a.getApplication())).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
            boolean flag2 = fiy.b(flags);
            boolean flag3 = fiy.c(flags);
            boolean flag4 = ((Boolean)flags.a(fys.aC)).booleanValue();
            boolean flag5 = ((String)flags.a(fys.f)).equals("Enabled");
            boolean flag6 = fdo.a(flags);
            boolean flag7 = ((Boolean)flags.a(fys.d)).booleanValue();
            Object obj = DebugFlag.o;
            obj = (eez)dmz.a(eez);
            Flags flags1;
            boolean flag1;
            if (((Boolean)flags.a(fys.aa)).booleanValue() && !ggi.c(((eez) (obj)).a) && "enabled".equals(flags.a(fys.g)))
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            obj.b = flag1;
            obj = (AdRules)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules);
            flags1 = a.e;
            if (flags1 != null)
            {
                ((AdRules) (obj)).a(com.spotify.mobile.android.spotlets.ads.rules.AdRules.StateType.c, ((Boolean)flags1.a(fys.b)).booleanValue());
            }
            SpotifyService.a(a);
            ((giq)dmz.a(giq)).b(a).b().a(SpotifyService.a, flag7).b();
            if (!flag2)
            {
                SpotifyService.e(a).b("audio/episode");
            } else
            {
                SpotifyService.e(a).a("audio/episode");
            }
            if (!flag3)
            {
                SpotifyService.e(a).b("video/episode");
            } else
            {
                SpotifyService.e(a).a("video/episode");
            }
            obj = (efg)dmz.a(efg);
            obj.d = flag5;
            if (((efg) (obj)).d)
            {
                efh efh1 = ((efg) (obj)).c;
                Sponsorships sponsorships = ((efg) (obj)).b;
                boolean flag;
                if (sponsorships == null)
                {
                    flag = true;
                } else
                {
                    long l1 = gcf.b() / 1000L;
                    if (sponsorships.getTTLSeconds() + efh1.b < l1)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                }
                if (flag)
                {
                    ((efg) (obj)).a();
                }
            } else
            {
                obj.b = null;
                ((efg) (obj)).b();
            }
            if (flag5)
            {
                obj = SpotifyService.d(a);
                obj.a = true;
                ((eej) (obj)).a();
            } else
            {
                obj = SpotifyService.d(a);
                obj.a = false;
                ((eej) (obj)).a();
            }
            obj = SpotifyService.b(a);
            if (((DiscoveryClient) (obj)).c != flag4)
            {
                obj.c = flag4;
                if (((DiscoveryClient) (obj)).d.a == com.spotify.mobile.android.connect.DiscoveryClient.DiscoveryConfiguration.FeatureFlagOverrideValue.a)
                {
                    ((DiscoveryClient) (obj)).g();
                }
            }
            obj = SpotifyService.c(a);
            obj.e = flag6;
            ((dvp) (obj)).a(((dvp) (obj)).d);
            obj = (dwg)dmz.a(dwg);
            if (dwg.a(flags))
            {
                obj.b = AppSdk.getInstance(((dwg) (obj)).a, ((dwg) (obj)).a(), ((com.nielsen.app.sdk.IAppNotifier) (obj)));
            } else
            {
                obj.b = null;
            }
            ((fmu)dmz.a(fmu)).a.get();
        }

            
            {
                a = SpotifyService.this;
                super();
            }
    };
    private ecx ab;
    private final ecw ac = new ecw() {

        final SpotifyService a;

        public final void a(boolean flag)
        {
            if (flag)
            {
                JsonCallbackReceiver jsoncallbackreceiver = new JsonCallbackReceiver(this, com/spotify/mobile/android/service/GaiaJacksonModel) {

                    final _cls8 a;

                    protected final void onError(Throwable throwable, com.spotify.mobile.android.cosmos.ParsingCallbackReceiver.ErrorCause errorcause)
                    {
                        Logger.b(throwable, "Unable to connect to gaia resolver due to: %s", new Object[] {
                            errorcause.name()
                        });
                    }

                    protected final void onResolved(Response response, Object obj)
                    {
                        response = (GaiaJacksonModel)obj;
                        SpotifyService.j(a.a).post(new Runnable(this, response) {

                            private GaiaJacksonModel a;
                            private _cls1 b;

                            public final void run()
                            {
                                Object obj1;
label0:
                                {
                                    obj1 = SpotifyService.i(b.a.a);
                                    Object obj = a;
                                    ctz.a(((fnm) (obj1)).B);
                                    obj1 = ((fnm) (obj1)).B;
                                    ctz.a(obj);
                                    obj = Optional.b(Boolean.valueOf(((GaiaJacksonModel) (obj)).isActive()));
                                    if (!((fmd) (obj1)).a.equals(obj))
                                    {
                                        obj1.a = ((Optional) (obj));
                                        if (!((Boolean)((Optional) (obj)).c()).booleanValue())
                                        {
                                            break label0;
                                        }
                                        ((fmd) (obj1)).b.N_();
                                    }
                                    return;
                                }
                                ((fmd) (obj1)).b.b();
                            }

            
            {
                b = _pcls1;
                a = gaiajacksonmodel;
                super();
            }
                        });
                    }

            
            {
                a = _pcls8;
                super(null, class1);
            }
                };
                SpotifyService.a(a, SpotifyService.k(a).subscribe("sp://gaia/v1/", jsoncallbackreceiver));
            }
        }

            
            {
                a = SpotifyService.this;
                super();
            }
    };
    private final BroadcastReceiver ad = new BroadcastReceiver() {

        private SpotifyService a;

        public final void onReceive(Context context, Intent intent)
        {
            SpotifyService.r(a);
        }

            
            {
                a = SpotifyService.this;
                super();
            }
    };
    private OrbitServiceObserver ae;
    public dur c;
    public Handler d;
    Flags e;
    private boolean g;
    private volatile boolean h;
    private boolean i;
    private final dux j = (dux)dmz.a(com/spotify/mobile/android/service/SpotifyService, dux);
    private OrbitServiceInterface k;
    private eae l;
    private eaa m;
    private eac n;
    private ConnectManager o;
    private ConnectivityListener p;
    private DiscoveryClient q;
    private HandlerThread r;
    private RemoteNativeRouter s;
    private final Object t = new Object();
    private dvp u;
    private dvy v;
    private dvq w;
    private gfi x;
    private gek y;
    private eag z;

    public SpotifyService()
    {
        new duu();
        l = new dvg();
        m = new dve();
        n = new dvf();
        o = new dvd();
        new gbq();
        K = new dus(J);
        ae = new OrbitServiceObserver() {

            final SpotifyService a;

            public final void onConnectionError(int i1)
            {
                SpotifyService spotifyservice = a;
                Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.CONNECTION_ERROR");
                intent.putExtra("error_code", i1);
                spotifyservice.sendBroadcast(intent);
            }

            public final void onFeatureError(int i1, int j1)
            {
                SpotifyService spotifyservice = a;
                Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.FEATURE_ERROR");
                intent.putExtra("feature", i1);
                intent.putExtra("error_code", j1);
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

            public final void onLoginError(int i1)
            {
                SpotifyService spotifyservice = a;
                Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.LOGIN_ERROR");
                intent.putExtra("error_code", i1);
                spotifyservice.sendBroadcast(intent);
            }

            public final void onOfflineSyncError(int i1)
            {
                SpotifyService spotifyservice = a;
                Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.OFFLINE_SYNC_ERROR");
                intent.putExtra("error_code", i1);
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

            public final void onPlaybackError(int i1, String s1)
            {
                if (i1 == 14)
                {
                    ((get)dmz.a(get)).c.b().a(get.a, i1).a(get.b, s1).a();
                }
                SpotifyService spotifyservice = a;
                Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.PLAYBACK_ERROR");
                intent.putExtra("error_code", i1);
                intent.putExtra("uri", s1);
                spotifyservice.sendBroadcast(intent);
            }

            public final void onSessionIdle(boolean flag)
            {
                SpotifyService.j(a).post(new Runnable(this, flag) {

                    private boolean a;
                    private _cls7 b;

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
                b = _pcls7;
                a = flag;
                super();
            }
                });
            }

            public final void onSocialError(int i1, String s1)
            {
                SpotifyService spotifyservice = a;
                Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.SOCIAL_ERROR");
                intent.putExtra("error_code", i1);
                intent.putExtra("error_description", s1);
                spotifyservice.sendBroadcast(intent);
            }

            public final void onSyncActive(boolean flag)
            {
                SpotifyService.j(a).post(new Runnable(this, flag) {

                    private boolean a;
                    private _cls7 b;

                    public final void run()
                    {
                        fno fno1 = SpotifyService.i(b.a).d;
                        if (a)
                        {
                            fno1.J_();
                            SpotifyService.w(b.a).f.a(com.spotify.mobile.android.provider.Metadata.OfflineSync.a, gek.e);
                            return;
                        } else
                        {
                            fno1.c();
                            SpotifyService.w(b.a).f.b();
                            return;
                        }
                    }

            
            {
                b = _pcls7;
                a = flag;
                super();
            }
                });
            }

            public final void onUpdateAvailable(String s1)
            {
                SpotifyService spotifyservice = a;
                Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.UPDATE_AVAILABLE");
                intent.setData(Uri.parse(s1));
                spotifyservice.sendBroadcast(intent);
            }

            
            {
                a = SpotifyService.this;
                super();
            }
        };
    }

    static Subscription a(SpotifyService spotifyservice, Subscription subscription)
    {
        spotifyservice.T = subscription;
        return subscription;
    }

    static dza a(SpotifyService spotifyservice, dza dza1)
    {
        spotifyservice.E = dza1;
        return dza1;
    }

    static frc a(SpotifyService spotifyservice, frc frc1)
    {
        spotifyservice.Y = frc1;
        return frc1;
    }

    private static String a(Intent intent)
    {
        if (intent.hasExtra("uri"))
        {
            intent = (Verified)intent.getParcelableExtra("uri");
            Assertion.a(intent, "Intent.getParcelableExtra(EXTRA_LOG_EVENT_SOURCE_URI) should not be null.");
            return intent.toString();
        }
        if (intent.hasExtra("uri-string"))
        {
            intent = intent.getStringExtra("uri-string");
            Assertion.a(intent, "Intent.getStringExtra(EXTRA_LOG_EVENT_SOURCE_URI_STRING) should not be null.");
            return intent;
        } else
        {
            Assertion.a("Missing EXTRA_LOG_EVENT_SOURCE_URI in Intent passed to SpotifyService.");
            return "";
        }
    }

    static void a(SpotifyService spotifyservice)
    {
        spotifyservice.i();
    }

    public static boolean a(Context context)
    {
        for (context = ((ActivityManager)context.getSystemService("activity")).getRunningServices(0x7fffffff).iterator(); context.hasNext();)
        {
            android.app.ActivityManager.RunningServiceInfo runningserviceinfo = (android.app.ActivityManager.RunningServiceInfo)context.next();
            if (com/spotify/mobile/android/service/SpotifyService.getName().equals(runningserviceinfo.service.getClassName()))
            {
                return true;
            }
        }

        return false;
    }

    public static boolean a(Context context, ServiceConnection serviceconnection, String s1)
    {
        Intent intent = dvv.a(context, "com.spotify.mobile.android.service.action.START_SERVICE");
        context.startService(intent);
        boolean flag = dvk.a(context, intent, serviceconnection, s1);
        Logger.a("Bind to SpotifyService: %b", new Object[] {
            Boolean.valueOf(flag)
        });
        return flag;
    }

    static DiscoveryClient b(SpotifyService spotifyservice)
    {
        return spotifyservice.q;
    }

    private void b(Intent intent)
    {
        boolean flag = false;
        boolean flag1 = intent.getBooleanExtra("force_previous", false);
        intent = n;
        if (!flag1)
        {
            flag = true;
        }
        intent.b(flag);
    }

    private void b(String s1)
    {
        obj = j.a;
        obj;
        JVM INSTR monitorenter ;
        Object obj1;
        Object obj2;
        Object obj3;
        Object obj4;
        NativeRouter nativerouter;
        OrbitServiceInterface orbitserviceinterface;
        DebugFlag debugflag;
        int i1;
        if (j.a.a() == 1)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            break MISSING_BLOCK_LABEL_55;
        }
        Logger.a("Service already started: %s", new Object[] {
            j.a
        });
        obj;
        JVM INSTR monitorexit ;
        return;
        if (j.b)
        {
            Logger.c("Service is permanently stopped. Killing self....", new Object[0]);
            dwa.a();
        }
        if (j.a.a() == 0)
        {
            Logger.a("Service is shutting down. Need to wait before restarting...", new Object[0]);
            if (!j.a.b())
            {
                Assertion.b("Failed to shutdown Orbit in a timely fashion");
                dwa.a();
            }
        }
        j.a.a(2);
        obj;
        JVM INSTR monitorexit ;
        Logger.a("Starting service: %s", new Object[] {
            s1
        });
        obj2 = new dvw(this);
        obj = ((dvw) (obj2)).a();
        if (obj == null) goto _L2; else goto _L1
_L1:
        obj = new File(((String) (obj)));
        Logger.a("The cache location is a directory? %b", new Object[] {
            Boolean.valueOf(((File) (obj)).isDirectory())
        });
        Logger.a("The cache location is writable? %b", new Object[] {
            Boolean.valueOf(((File) (obj)).canWrite())
        });
        if (!((File) (obj)).isDirectory() || !((File) (obj)).canWrite()) goto _L2; else goto _L3
_L3:
        i1 = 1;
_L5:
        if (i1 == 0)
        {
            s1 = new bb(this);
            s1.a(getString(0x7f080070)).b(getString(0x7f08006f)).a(0x7f020203).c().a(0L).a("err").e().d();
            ((NotificationManager)getSystemService("notification")).notify(14, s1.g());
            j.b = true;
            Logger.c("There is no cache location, giving up starting Core", new Object[0]);
            synchronized (j.a)
            {
                j.a.a(1);
            }
            return;
        }
        break; /* Loop/switch isn't completed */
        obj;
        s1;
        JVM INSTR monitorexit ;
        throw obj;
        s1;
        obj;
        JVM INSTR monitorexit ;
        throw s1;
_L2:
        i1 = 0;
        if (true) goto _L5; else goto _L4
_L4:
        Logger.a("The cache location seems ok", new Object[0]);
        i1 = ((giq)dmz.a(giq)).a(this).a(f, 0);
        Logger.a("Current crash count is %d", new Object[] {
            Integer.valueOf(i1)
        });
        if (!((dvw) (obj2)).a)
        {
            obj2.b = ((dvw) (obj2)).d();
            Logger.a("Using settings location %s", new Object[] {
                ((dvw) (obj2)).b
            });
            obj2.a = true;
        }
        obj1 = ((dvw) (obj2)).b;
        obj2 = ((dvw) (obj2)).a();
        if (i1 >= 5)
        {
            obj3 = StateRestoreFileDeleter.a(((String) (obj1)), ((giq)dmz.a(giq)).a(this));
            if (Math.random() >= 0.98999999999999999D)
            {
                Assertion.b((new StringBuilder("Cleaning state restore files (throttled 99%), policy \"")).append(obj3).append("\"").toString());
            }
        }
        obj3 = g();
        dmz.a(com/spotify/mobile/android/service/SpotifyService, dvi);
        obj4 = dvi.a();
        s = ((RemoteNativeRouter) (obj4));
        Logger.a("Cache path: %s\nSettings path: %s", new Object[] {
            obj2, obj1
        });
        k.setObserver(ae);
        Logger.a("Starting Orbit", new Object[0]);
        nativerouter = (NativeRouter)((RemoteNativeRouter) (obj4)).getNativeRouter();
        obj4 = new OrbitProviderObservable();
        orbitserviceinterface = k;
        debugflag = DebugFlag.p;
        orbitserviceinterface.start(((String) (obj2)), ((String) (obj1)), ((String) (obj3)), false, false, nativerouter, ((com.spotify.mobile.android.orbit.OrbitProviderObserver) (obj4)));
        p = new ConnectivityListener(k, this);
        p.pushToSetter();
        Logger.a("Orbit started", new Object[0]);
        U = new dvb(this);
        obj1 = new fnj(this, U);
        C = new fnm(((fnj) (obj1)));
        l = new eaf(k.getOrbitSession());
        n = new ead(k.getOrbitPlayer());
        m = new eab(k.getOrbitProvider(), getContentResolver(), ((OrbitProviderObservable) (obj4)));
        c = new dur(this);
        obj2 = c;
        SoundDriver.addListener(((dur) (obj2)).d);
        LocalFilePlayer.addListener(((dur) (obj2)).c);
        y = new gek(this);
        B.postDelayed(new Runnable() {

            private SpotifyService a;

            public final void run()
            {
                SpotifyService.l(a);
            }

            
            {
                a = SpotifyService.this;
                super();
            }
        }, 20000L);
        u = new dvp(this, y);
        v = new dvy(this, r, new gbo());
        obj2 = new dll() {

            private SpotifyService a;

            public final void a()
            {
                SpotifyService.e(a).g();
            }

            public final void a(float f1)
            {
                SpotifyService.e(a).a(f1);
            }

            public final void a(String s2)
            {
                SpotifyService.e(a).c(s2);
            }

            public final void a(boolean flag)
            {
                SpotifyService.e(a).a(flag);
            }

            public final com.spotify.mobile.android.connect.ConnectManager.ConnectState b()
            {
                return SpotifyService.e(a).c();
            }

            public final void c()
            {
                SpotifyService.e(a).h();
            }

            
            {
                a = SpotifyService.this;
                super();
            }
        };
        H = new gjb(this);
        w = new dvq(this, ((giq)dmz.a(giq)).b(this), r, z);
        q = new DiscoveryClient(this, ((dll) (obj2)), w);
        x = new gfi(this, O);
        Q = new gfi(this, new dvu((byte)0));
        z = new eag(this, C.p);
        D = new fnk(this, n, C, ((fnj) (obj1)), w, u, ((dll) (obj2)), z);
        j.a.a(3);
        F = new gnd(this);
        obj1 = F;
        ((gnd) (obj1)).a.registerReceiver(((BroadcastReceiver) (obj1)), ((gnd) (obj1)).b);
        F.a();
        obj1 = DebugFlag.a;
        d.post(new Runnable() {

            private SpotifyService a;

            public final void run()
            {
                LoggerProvider.a(a);
            }

            
            {
                a = SpotifyService.this;
                super();
            }
        });
        s1 = new Runnable(s1) {

            private String a;

            public final void run()
            {
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.as, com.spotify.mobile.android.util.ClientEvent.SubEvent.dh);
                clientevent.a("version_code", SpotifyService.b);
                clientevent.a("reason", a);
                dmz.a(fop);
                fop.a(ViewUri.a, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
            }

            
            {
                a = s1;
                super();
            }
        };
        d.post(s1);
        Logger.a("Service fully started", new Object[0]);
        c();
        return;
    }

    static dvp c(SpotifyService spotifyservice)
    {
        return spotifyservice.u;
    }

    private void c(boolean flag)
    {
        N = flag;
        if (M != null)
        {
            M.b(flag);
        }
    }

    static eej d(SpotifyService spotifyservice)
    {
        return spotifyservice.P;
    }

    public static ConnectManager e(SpotifyService spotifyservice)
    {
        return spotifyservice.o;
    }

    private void e()
    {
        if (A != null)
        {
            dzv dzv1 = A;
            dzv1.g.unregisterPlayerStateObserver((com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules));
            if (dzv1.b != null)
            {
                dzv1.b.unsubscribe();
            }
            if (dzv1.c != null)
            {
                dzv1.c.unsubscribe();
            }
            if (dzv1.d != null)
            {
                dzv1.d.unsubscribe();
            }
            if (dzv1.e != null)
            {
                dzv1.e.destroy();
                dzv1.e = null;
            }
            A = null;
        }
    }

    public static eaa f(SpotifyService spotifyservice)
    {
        return spotifyservice.m;
    }

    private boolean f()
    {
        return j.a.a() == 3;
    }

    public static eag g(SpotifyService spotifyservice)
    {
        return spotifyservice.z;
    }

    private String g()
    {
        return ghq.a(getResources().getConfiguration().locale);
    }

    public static eae h(SpotifyService spotifyservice)
    {
        return spotifyservice.l;
    }

    private void h()
    {
        C.e.c();
        if (M != null)
        {
            M.a(true);
        }
    }

    static fnm i(SpotifyService spotifyservice)
    {
        return spotifyservice.C;
    }

    private void i()
    {
        dwe dwe1;
        Object obj;
        Context context;
        boolean flag;
        boolean flag1;
        if (e == null)
        {
            dwe1 = dwe.a;
        } else
        {
            dwe1 = new dwe();
            dwe1.b = ((Boolean)e.a(fys.a)).booleanValue();
            dwe1.c = ((Boolean)e.a(fys.b)).booleanValue();
            dwe1.d = ((Boolean)e.a(fys.e)).booleanValue();
        }
        context = (Context)(new dwf(this)).a.get();
        if (context != null)
        {
            dmz.a(fop);
            boolean flag2;
            if (dwe1.b)
            {
                obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.cY;
            } else
            {
                obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.cZ;
            }
            obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ao, ((com.spotify.mobile.android.util.ClientEvent.SubEvent) (obj)));
            fop.a(context, ViewUri.bN, ((ClientEvent) (obj)));
            if (dwe1.b)
            {
                obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.da;
            } else
            {
                obj = com.spotify.mobile.android.util.ClientEvent.SubEvent.db;
            }
            obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.ao, ((com.spotify.mobile.android.util.ClientEvent.SubEvent) (obj)));
            fop.a(context, ViewUri.bN, ((ClientEvent) (obj)));
        }
        flag1 = ggi.c(this);
        flag2 = dwe1.b;
        flag2 = dwe1.c;
        if (dwe1.a() && !flag1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        flag1 = ((eez)dmz.a(eez)).b;
        if (flag || flag1)
        {
            if (A == null)
            {
                dmz.a(dzy);
                A = dzy.a(this, r.getLooper(), C);
                obj = A;
                ctz.a(dwe1);
                if (((dzv) (obj)).e == null)
                {
                    throw new IllegalStateException("Resolver has been destroyed");
                }
                ((dzv) (obj)).g.registerPlayerStateObserver((com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver)dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules));
                obj.b = ((dzv) (obj)).a(Format.AUDIO, edy.a);
                if (dwe1.d)
                {
                    obj.c = ((dzv) (obj)).a(Format.VIDEO, een.a);
                } else
                {
                    obj.c = ((dzv) (obj)).a(Format.VIDEO, een.b);
                }
                if (dwe1.b)
                {
                    ((dzv) (obj)).a(AdSlot.PREROLL);
                }
                if (dwe1.a())
                {
                    ((dzv) (obj)).a(AdSlot.WATCHNOW);
                }
                ((dzv) (obj)).a(AdSlot.STREAM);
                if (flag1)
                {
                    ((dzv) (obj)).a(AdSlot.MOBILE_SCREENSAVER);
                    obj.d = ((dzv) (obj)).a(AdSlot.MOBILE_SCREENSAVER, (dzw)dmz.a(eez));
                }
            }
            return;
        } else
        {
            e();
            return;
        }
    }

    static Handler j(SpotifyService spotifyservice)
    {
        return spotifyservice.B;
    }

    private void j()
    {
        n.a();
    }

    static DeferredResolver k(SpotifyService spotifyservice)
    {
        return spotifyservice.R;
    }

    private void k()
    {
        n.a(false);
    }

    private void l()
    {
        n.a(true);
    }

    static void l(SpotifyService spotifyservice)
    {
        spotifyservice.g = true;
        Object obj = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.X, com.spotify.mobile.android.util.ClientEvent.SubEvent.ad);
        ((ClientEvent) (obj)).a("deviceNameInfo", (new StringBuilder("[")).append(Build.MANUFACTURER).append("/").append(Build.MODEL).append("/").append(Build.DEVICE).append("/").append(Build.PRODUCT).append("/").append(Build.BRAND).append("]").toString().replaceAll("[,:]", ";"));
        ((ClientEvent) (obj)).a("deviceCpuInfo", (new StringBuilder("[")).append(duu.a()).append("]").toString());
        ((ClientEvent) (obj)).a("androidVersion", (new StringBuilder("[")).append(android.os.Build.VERSION.SDK_INT).append("]").toString());
        dmz.a(fop);
        fop.a(ViewUri.a, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ((ClientEvent) (obj)));
        spotifyservice.X = new fqr(spotifyservice);
        obj = spotifyservice.X;
        obj.b = new fqo(((fqr) (obj)).a);
        ((fqr) (obj)).b.c = ((fqp) (obj));
        ((fqr) (obj)).b.a.a();
        StateRestoreFileDeleter.a(((giq)dmz.a(giq)).a(spotifyservice));
    }

    static OrbitServiceInterface m(SpotifyService spotifyservice)
    {
        return spotifyservice.k;
    }

    private void m()
    {
        n.b();
    }

    static frc n(SpotifyService spotifyservice)
    {
        return spotifyservice.Y;
    }

    private String n()
    {
        if (S != null)
        {
            Object obj = S.getLastPlayerState();
            if (obj != null)
            {
                obj = ((PlayerState) (obj)).track();
                if (obj != null)
                {
                    return ((PlayerTrack) (obj)).uri();
                }
            }
        }
        return "";
    }

    static gjb o(SpotifyService spotifyservice)
    {
        return spotifyservice.H;
    }

    private void o()
    {
        if (((fni) (C.l)).a)
        {
            o.h();
        }
    }

    private void p()
    {
        if (L)
        {
            return;
        } else
        {
            L = true;
            fms fms = C.w;
            q.b.add(fms);
            o.a(q);
            o.a(q);
            o.a(q);
            q.e();
            return;
        }
    }

    static boolean p(SpotifyService spotifyservice)
    {
        return spotifyservice.h;
    }

    static dza q(SpotifyService spotifyservice)
    {
        return spotifyservice.E;
    }

    private void q()
    {
        if (!L)
        {
            return;
        } else
        {
            fms fms = C.w;
            q.b.remove(fms);
            o.b(q);
            o.a(null);
            o.a(null);
            q.f();
            L = false;
            return;
        }
    }

    private void r()
    {
        if (M == null)
        {
            dmz.a(gke);
            M = gke.a(getApplicationContext(), getMainLooper());
            gkc gkc1 = M;
            Assertion.b(gkc1.q, "This VideoPlayer instance was previously released");
            hew hew1 = gkb.a();
            hew.a(new gkc._cls2(gkc1), hew1);
            if (N)
            {
                M.b(true);
            }
        }
    }

    static void r(SpotifyService spotifyservice)
    {
        spotifyservice.h();
    }

    static Object s(SpotifyService spotifyservice)
    {
        return spotifyservice.t;
    }

    private void s()
    {
        if (M != null)
        {
            M.c();
            M = null;
        }
    }

    static RemoteNativeRouter t(SpotifyService spotifyservice)
    {
        return spotifyservice.s;
    }

    static RemoteNativeRouter u(SpotifyService spotifyservice)
    {
        spotifyservice.s = null;
        return null;
    }

    static dux v(SpotifyService spotifyservice)
    {
        return spotifyservice.j;
    }

    static gek w(SpotifyService spotifyservice)
    {
        return spotifyservice.y;
    }

    public final void a()
    {
        S = ((PlayerFactory)dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory)).create(R, ViewUri.bR.toString(), FeatureIdentifier.af, FeatureIdentifier.af);
        Object obj = C;
        obj.A = (Player)ctz.a(S);
        ((fnm) (obj)).A.fetchState(((fnm) (obj)).x);
        ((fnm) (obj)).A.fetchState(((fnm) (obj)).y);
        ((fnm) (obj)).A.fetchState(((fnm) (obj)).z);
        ((fnm) (obj)).A.registerPlayerStateObserver(((fnm) (obj)).x);
        ((fnm) (obj)).A.registerPlayerStateObserver(((fnm) (obj)).y);
        ((fnm) (obj)).A.registerPlayerStateObserver(((fnm) (obj)).z);
        obj = (edt)dmz.a(edt);
        S.registerPlayerStateObserver(((com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver) (obj)));
        new dlc();
        o = new dld(this, B, new dle(R));
        o.a();
        w.b();
        u.a();
        v.a();
        I.a();
        I.a(aa);
        I.a(D);
        obj = P;
        obj.c = true;
        ((eej) (obj)).a();
        p();
        r();
    }

    public final void a(String s1)
    {
        ((gcr)dmz.a(gcr)).a = s1;
    }

    public final void a(boolean flag)
    {
        Intent intent = new Intent("com.spotify.mobile.android.service.broadcast.session.CONNECTION_STATE_CHANGED");
        intent.putExtra("connected", flag);
        sendBroadcast(intent);
    }

    public final void b()
    {
        w.c();
        u.b();
        v.b();
        I.b(aa);
        I.b(D);
        I.b();
        Object obj = P;
        obj.c = false;
        ((eej) (obj)).a();
        q();
        if (T != null)
        {
            T.unsubscribe();
        }
        o = new dvd();
        obj = C;
        ((fnm) (obj)).A.unregisterPlayerStateObserver(((fnm) (obj)).x);
        ((fnm) (obj)).A.unregisterPlayerStateObserver(((fnm) (obj)).y);
        ((fnm) (obj)).A.unregisterPlayerStateObserver(((fnm) (obj)).z);
        obj = (edt)dmz.a(edt);
        if (S != null)
        {
            S.unregisterPlayerStateObserver(((com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver) (obj)));
        }
        R.disconnect();
        s();
    }

    public final void b(boolean flag)
    {
        i = flag;
    }

    public final void c()
    {
        Logger.a("onResume", new Object[0]);
        h = true;
        Object obj = new Runnable(this) {

            private Context a;
            private SpotifyService b;

            public final void run()
            {
                if (SpotifyService.p(b))
                {
                    SpotifyService.a(b, new dza(a, SpotifyService.m(b).getOrbitPushNotifications()));
                    dza dza1 = SpotifyService.q(b);
                    if (dza1.a != null)
                    {
                        ctz.a(dza1.b);
                        ctz.a(dza1.c);
                        dza1.b.a(dtk.a, dyz.a);
                        dza1.c.a(dtw.a, dze.a);
                        return;
                    }
                }
            }

            
            {
                b = SpotifyService.this;
                a = context;
                super();
            }
        };
        d.post(((Runnable) (obj)));
        o.a();
        x.a(dtw.a, new String[] {
            "connected", "current_user", "logged_in"
        });
        Q.a(dtx.a, dvu.a());
        if (i)
        {
            w.b();
            u.a();
            v.a();
            p();
            r();
        }
        BluetoothServiceManager.a(this);
        I = new dxc(this);
        i();
        obj = new IntentFilter("android.intent.action.SCREEN_OFF");
        ((IntentFilter) (obj)).addCategory("android.intent.category.DEFAULT");
        registerReceiver(ad, ((IntentFilter) (obj)));
        obj = P;
        obj.b = true;
        ((eej) (obj)).a();
        if (S != null)
        {
            obj = (edt)dmz.a(edt);
            S.registerPlayerStateObserver(((com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver) (obj)));
        }
        ab = new ecx(this, (ecw)ctz.a(ac));
        obj = new Runnable() {

            public final void run()
            {
                ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.as, com.spotify.mobile.android.util.ClientEvent.SubEvent.df);
                clientevent.a("version_code", SpotifyService.b);
                dmz.a(fop);
                fop.a(ViewUri.a, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
            }

        };
        d.post(((Runnable) (obj)));
    }

    public final void d()
    {
        Logger.a("onPause", new Object[0]);
        if (h)
        {
            Logger.a("onPause: Stopping services", new Object[0]);
            h = false;
            BluetoothServiceManager.b(this);
            w.c();
            q();
            s();
            o.b();
            I.b(aa);
            I.b(D);
            I.b();
            v.b();
            u.b();
            x.b();
            Q.b();
            if (E != null)
            {
                dza dza1 = E;
                if (dza1.a != null)
                {
                    dza1.a.a();
                    dza1.a = null;
                }
                if (dza1.b != null)
                {
                    dza1.b.b();
                    dza1.b = null;
                }
                if (dza1.c != null)
                {
                    dza1.c.b();
                    dza1.c = null;
                }
                if (dza1.d != null)
                {
                    dza1.d.a();
                    dza1.d = null;
                }
            }
            Object obj = P;
            obj.b = false;
            ((eej) (obj)).a();
            e();
            RadioActionsService.a(this);
            unregisterReceiver(ad);
            obj = (edt)dmz.a(edt);
            if (S != null)
            {
                S.unregisterPlayerStateObserver(((com.spotify.mobile.android.cosmos.player.v2.Player.PlayerStateObserver) (obj)));
            }
            ab.a.destroy();
            R.destroy();
        }
        ClientEvent clientevent = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.as, com.spotify.mobile.android.util.ClientEvent.SubEvent.de);
        clientevent.a("version_code", b);
        dmz.a(fop);
        fop.a(ViewUri.a, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, clientevent);
        stopSelf();
    }

    public IBinder onBind(Intent intent)
    {
        StringBuilder stringbuilder = new StringBuilder("bind:");
        String s1;
        if (intent != null)
        {
            s1 = intent.getAction();
        } else
        {
            s1 = "no_intent";
        }
        b(stringbuilder.append(s1).toString());
        if (intent != null && "com.spotify.mobile.service.action.COSMOS_PROXY".equals(intent.getAction()))
        {
            return s;
        } else
        {
            return V;
        }
    }

    public void onConfigurationChanged(Configuration configuration)
    {
        super.onConfigurationChanged(configuration);
        Locale locale = configuration.locale;
        configuration = locale;
        if (locale == null)
        {
            configuration = Locale.ENGLISH;
        }
        if (!configuration.equals(W) && f())
        {
            String s1 = g();
            l.b(s1);
        }
        W = configuration;
    }

    public void onCreate()
    {
        MethodTraceScope.d.a();
        Logger.c("Creating service", new Object[0]);
        setTheme(0x7f0b017e);
        r = new HandlerThread("backgroundUpdater");
        r.start();
        d = new Handler(r.getLooper());
        dmz.a(dwa);
        if (!j.b) goto _L2; else goto _L1
_L1:
        return;
_L2:
        Object obj;
        Object obj1;
        long l1;
        obj = (ClientInfo)dmz.a(com/spotify/mobile/android/util/ClientInfo);
        int i1;
        try
        {
            k = ((OrbitFactory)dmz.a(com/spotify/mobile/android/service/SpotifyService, com/spotify/mobile/android/orbit/OrbitFactory)).createService(this, 0x1908b3e3, ((ClientInfo) (obj)).a.versionName);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Assertion.a("Failed to start orbit due to RuntimeException", ((Throwable) (obj)));
            j.b = true;
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            if (Math.random() >= 0.90000000000000002D)
            {
                Assertion.a((new StringBuilder("Failed to start orbit due to UnsatisfiedLinkError (throttled 90%) CPU Architecture: ")).append(duu.a()).toString(), ((Throwable) (obj)));
            }
            j.b = true;
            dmz.a(ggc);
            ggc.a(getApplicationContext(), 0x7f080554, 1, new Object[0]);
            return;
        }
        if (DeleteCacheService.b(this))
        {
            DeleteCacheService.a(this, new dvw(this));
        }
        if (DeleteCacheService.c(this))
        {
            startService(DeleteCacheService.d(this));
        }
        W = getResources().getConfiguration().locale;
        if (Looper.getMainLooper() == Looper.myLooper())
        {
            (new duv()).execute(new Void[0]);
        }
        P = (eej)dmz.a(eej);
        R = Cosmos.getResolver(this);
        Z = (KeyguardManager)getSystemService("keyguard");
        obj1 = ((giq)dmz.a(giq)).a(this);
        obj = K;
        ctz.a(obj1);
        i1 = Process.myUid();
        l1 = TrafficStats.getUidRxBytes(i1);
        if (l1 == -1L) goto _L1; else goto _L3
_L3:
        if (((gin) (obj1)).f(dus.c)) goto _L5; else goto _L4
_L4:
        ((gin) (obj1)).b().a(dus.c, 0L).a(dus.a, System.currentTimeMillis()).b();
_L7:
        obj1 = new dut(((dus) (obj)), i1, ((gin) (obj1)));
        ((dus) (obj)).e.scheduleWithFixedDelay(((Runnable) (obj1)), 0L, 1L, ((dus) (obj)).d);
        return;
_L5:
        ((gin) (obj1)).b().a(dus.b, l1).b();
        l1 = ((gin) (obj1)).b(dus.c);
        if (l1 > ((dus) (obj)).f)
        {
            obj.f = (long)((double)Math.round((double)l1 / (double)((dus) (obj)).f) * (double)((dus) (obj)).f);
        }
        if (true) goto _L7; else goto _L6
_L6:
    }

    public void onDestroy()
    {
        Logger.c("Destroying service", new Object[0]);
        R.destroy();
        l = new dvg();
        m = new dve();
        n = new dvf();
        o = new dvd();
        Object obj = j.a;
        obj;
        JVM INSTR monitorenter ;
        if (f()) goto _L2; else goto _L1
_L1:
        Logger.c("Service can't shut down unless started first: %s", new Object[] {
            j.a
        });
_L4:
        super.onDestroy();
        return;
_L2:
        j.a.a(0);
        obj;
        JVM INSTR monitorexit ;
        if (!g)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        obj = X;
        if (((fqr) (obj)).b != null)
        {
            fqo fqo1 = ((fqr) (obj)).b;
            fqo1.a.c();
            if (fqo1.d != null)
            {
                fqo1.d.cancel(false);
                fqo1.d = null;
            }
            if (fqo1.b != null)
            {
                fqo1.b.a();
                fqo1.b = null;
            }
            fqo1.c = null;
            obj.b = null;
        }
        if (((fqr) (obj)).c != null)
        {
            ((fqr) (obj)).c.a();
            obj.c = null;
        }
        for (Iterator iterator = ((fqr) (obj)).d.iterator(); iterator.hasNext(); ((fqk)iterator.next()).a()) { }
        break MISSING_BLOCK_LABEL_255;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        ((fqr) (obj)).d.clear();
        Object obj1 = c;
        SoundDriver.removeListener(((dur) (obj1)).d);
        LocalFilePlayer.removeListener(((dur) (obj1)).c);
        obj1 = D.a;
        if (dvb.a && ((dvb) (obj1)).c != null)
        {
            ((dvb) (obj1)).e.unregisterMediaButtonEventReceiver(((dvb) (obj1)).c);
        }
        for (obj1 = ((dvb) (obj1)).b.iterator(); ((Iterator) (obj1)).hasNext(); ((dvc)((Iterator) (obj1)).next()).b()) { }
        C.a();
        m.a();
        if (p != null)
        {
            p.destroy();
            p = null;
        }
        obj1 = F;
        ((gnd) (obj1)).a.unregisterReceiver(((BroadcastReceiver) (obj1)));
        F = null;
        if (Y != null)
        {
            Y.a();
            Y = null;
        }
        if (H != null)
        {
            obj1 = H;
            AppEventsLogger.b();
            obj1.b = null;
            H = null;
        }
        w.c.d();
        obj1 = new ClientEvent(com.spotify.mobile.android.util.ClientEvent.Event.as, com.spotify.mobile.android.util.ClientEvent.SubEvent.dg);
        ((ClientEvent) (obj1)).a("version_code", b);
        dmz.a(fop);
        fop.a(ViewUri.a, com.spotify.mobile.android.util.viewuri.ViewUri.SubView.a, ((ClientEvent) (obj1)));
        Logger.a("Shutting down Orbit", new Object[0]);
        k.stop();
        if (gcl.h)
        {
            r.quitSafely();
        } else
        {
            r.quit();
        }
        J.shutdown();
        if (!j.a.b())
        {
            if (Math.random() >= 0.98999999999999999D)
            {
                Assertion.b("Failed to shutdown Orbit in a timely fashion. (Throttled 99%)");
            }
            dwa.a();
        }
        Logger.a("Orbit has been shut down", new Object[0]);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public int onStartCommand(Intent intent, int i1, int j1)
    {
        Object obj;
        Object obj1;
        obj1 = new StringBuilder("start:");
        if (intent != null)
        {
            obj = intent.getAction();
        } else
        {
            obj = "no_intent";
        }
        b(((StringBuilder) (obj1)).append(((String) (obj))).toString());
        if (intent == null)
        {
            return 2;
        }
        if (!f())
        {
            Logger.c("Service not started - ignoring command: %s", new Object[] {
                j.a
            });
            return 2;
        }
        obj1 = intent.getAction();
        if (obj1 == null)
        {
            return 2;
        }
        obj = C.v;
        ctz.b(((fmx) (obj)).d(), "Trying to enter command handling phase without leaving it first");
        ((fmx) (obj)).J_();
        i1 = -1;
        ((String) (obj1)).hashCode();
        JVM INSTR lookupswitch 46: default 504
    //                   -2085248944: 928
    //                   -2051069492: 794
    //                   -2012270025: 1115
    //                   -2006918790: 911
    //                   -1878584587: 1081
    //                   -1684655716: 730
    //                   -1598778193: 1251
    //                   -1578764477: 1336
    //                   -1419345528: 1353
    //                   -1344581486: 1387
    //                   -1059065230: 810
    //                   -994958126: 1013
    //                   -941834229: 1370
    //                   -864953427: 877
    //                   -684713577: 746
    //                   -619171920: 1217
    //                   -608869466: 894
    //                   -608079327: 945
    //                   -500017448: 843
    //                   -475166351: 1200
    //                   -409951234: 1489
    //                   -379471163: 1166
    //                   -99867023: 1234
    //                   -81747347: 778
    //                   27455181: 1472
    //                   114969116: 1319
    //                   142607439: 962
    //                   356605619: 1268
    //                   392998343: 1302
    //                   503878393: 826
    //                   632255180: 1064
    //                   851110433: 1455
    //                   1017831865: 1183
    //                   1030260072: 1285
    //                   1035746693: 1421
    //                   1188786657: 1404
    //                   1428412983: 860
    //                   1490835106: 1132
    //                   1679004690: 1047
    //                   1713944213: 762
    //                   1749522146: 1149
    //                   1912467758: 1438
    //                   1943921091: 1098
    //                   1962756171: 979
    //                   1962904528: 996
    //                   2089210024: 1030;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15 _L16 _L17 _L18 _L19 _L20 _L21 _L22 _L23 _L24 _L25 _L26 _L27 _L28 _L29 _L30 _L31 _L32 _L33 _L34 _L35 _L36 _L37 _L38 _L39 _L40 _L41 _L42 _L43 _L44 _L45 _L46 _L47
_L1:
        i1;
        JVM INSTR tableswitch 0 45: default 704
    //                   0 1506
    //                   1 1547
    //                   2 1563
    //                   3 1580
    //                   4 1592
    //                   5 1632
    //                   6 1736
    //                   7 1761
    //                   8 1786
    //                   9 1814
    //                   10 1860
    //                   11 2060
    //                   12 2067
    //                   13 2074
    //                   14 2081
    //                   15 2089
    //                   16 2096
    //                   17 2118
    //                   18 2154
    //                   19 2282
    //                   20 2304
    //                   21 2326
    //                   22 2351
    //                   23 712
    //                   24 712
    //                   25 2363
    //                   26 2660
    //                   27 2709
    //                   28 2721
    //                   29 2759
    //                   30 2765
    //                   31 2809
    //                   32 2960
    //                   33 2999
    //                   34 3031
    //                   35 3071
    //                   36 3090
    //                   37 3103
    //                   38 3127
    //                   39 712
    //                   40 3151
    //                   41 3170
    //                   42 3180
    //                   43 3188
    //                   44 3196
    //                   45 3204;
           goto _L48 _L49 _L50 _L51 _L52 _L53 _L54 _L55 _L56 _L57 _L58 _L59 _L60 _L61 _L62 _L63 _L64 _L65 _L66 _L67 _L68 _L69 _L70 _L71 _L72 _L72 _L73 _L74 _L75 _L76 _L77 _L78 _L79 _L80 _L81 _L82 _L83 _L84 _L85 _L86 _L72 _L87 _L88 _L89 _L90 _L91 _L92
_L72:
        break; /* Loop/switch isn't completed */
_L48:
        Assertion.a("Handling unexpected intent", ((String) (obj1)));
_L93:
        ctz.b(((fni) (obj)).a, "Trying to leave command handling phase without entering it first");
        ((fmx) (obj)).c();
        return 2;
_L7:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.session.LOGIN"))
        {
            i1 = 0;
        }
          goto _L1
_L16:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.session.LOGOUT"))
        {
            i1 = 1;
        }
          goto _L1
_L41:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.request.update.WIDGET"))
        {
            i1 = 2;
        }
          goto _L1
_L25:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.session.ERASE_OFFLINE_USER"))
        {
            i1 = 3;
        }
          goto _L1
_L3:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.session.SEND_TO_INBOX"))
        {
            i1 = 4;
        }
          goto _L1
_L12:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.session.LOG_EVENT"))
        {
            i1 = 5;
        }
          goto _L1
_L31:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.session.VIEW_LOAD_TIMER"))
        {
            i1 = 6;
        }
          goto _L1
_L20:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.session.APP_STARTUP_TIMER"))
        {
            i1 = 7;
        }
          goto _L1
_L38:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.session.LOG"))
        {
            i1 = 8;
        }
          goto _L1
_L15:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.session.LOG_VIEW"))
        {
            i1 = 9;
        }
          goto _L1
_L18:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.PLAY_CONTENT"))
        {
            i1 = 10;
        }
          goto _L1
_L5:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.PLAYER_PLAY"))
        {
            i1 = 11;
        }
          goto _L1
_L2:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.PLAYER_PAUSE"))
        {
            i1 = 12;
        }
          goto _L1
_L19:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.TOGGLE_PAUSED"))
        {
            i1 = 13;
        }
          goto _L1
_L28:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.PREVIOUS"))
        {
            i1 = 14;
        }
          goto _L1
_L45:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.NEXT"))
        {
            i1 = 15;
        }
          goto _L1
_L46:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.SEEK"))
        {
            i1 = 16;
        }
          goto _L1
_L13:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.NOTIFICATION_SHUTDOWN"))
        {
            i1 = 17;
        }
          goto _L1
_L47:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.NOTIFICATION_ADD_TO_COLLECTION"))
        {
            i1 = 18;
        }
          goto _L1
_L40:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.SKIP_N_TRACKS_BACKWARDS"))
        {
            i1 = 19;
        }
          goto _L1
_L32:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.SKIP_N_TRACKS_FORWARDS"))
        {
            i1 = 20;
        }
          goto _L1
_L6:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.PLAY_PREVIEW"))
        {
            i1 = 21;
        }
          goto _L1
_L44:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.STOP_PREVIEW"))
        {
            i1 = 22;
        }
          goto _L1
_L4:
        if (((String) (obj1)).equals(".action.player.ADD_PLAY_TIME"))
        {
            i1 = 23;
        }
          goto _L1
_L39:
        if (((String) (obj1)).equals(".action.player.RESET_SKIP_COUNT"))
        {
            i1 = 24;
        }
          goto _L1
_L42:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.media_button"))
        {
            i1 = 25;
        }
          goto _L1
_L23:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.player.REQUEST_AUDIO_SESSION"))
        {
            i1 = 26;
        }
          goto _L1
_L34:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.session.REPORT_AD_URL_CLICKED"))
        {
            i1 = 27;
        }
          goto _L1
_L21:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.client.FOREGROUND"))
        {
            i1 = 28;
        }
          goto _L1
_L17:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.client.WANTS_SERVICE_TO_DIE"))
        {
            i1 = 29;
        }
          goto _L1
_L24:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.log.AB_TESTING"))
        {
            i1 = 30;
        }
          goto _L1
_L8:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.URL_OPEN"))
        {
            i1 = 31;
        }
          goto _L1
_L29:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.log.DEVICE_IDENTIFIER"))
        {
            i1 = 32;
        }
          goto _L1
_L35:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.googleiab.REGISTER_PURCHASES"))
        {
            i1 = 33;
        }
          goto _L1
_L30:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.optintrial.START"))
        {
            i1 = 34;
        }
          goto _L1
_L27:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.RESTART_APP"))
        {
            i1 = 35;
        }
          goto _L1
_L9:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.START_SERVICE"))
        {
            i1 = 36;
        }
          goto _L1
_L10:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.CRASH_SERVICE"))
        {
            i1 = 37;
        }
          goto _L1
_L14:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.log.ACCEPT_USER_TERMS"))
        {
            i1 = 38;
        }
          goto _L1
_L11:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.SET_SERVICE_IDLE_TIMEOUT"))
        {
            i1 = 39;
        }
          goto _L1
_L37:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.FLUSH_CACHES"))
        {
            i1 = 40;
        }
          goto _L1
_L36:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.DEVICE_DISCOVERY_CONFIG"))
        {
            i1 = 41;
        }
          goto _L1
_L43:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.OOM_SERVICE"))
        {
            i1 = 42;
        }
          goto _L1
_L33:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.driver.DISTRACTION_MODE_OFF"))
        {
            i1 = 43;
        }
          goto _L1
_L26:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.driver.DISTRACTION_MODE_ON"))
        {
            i1 = 44;
        }
          goto _L1
_L22:
        if (((String) (obj1)).equals("com.spotify.mobile.android.service.action.video.STATE_CHANGED"))
        {
            i1 = 45;
        }
          goto _L1
_L49:
        ctz.a(this);
        intent = new Intent(this, com/spotify/mobile/android/service/LoginActivity);
        intent.addFlags(0x10000000);
        intent.addFlags(0x10000);
        startActivity(intent);
          goto _L93
_L50:
        l.a();
        e();
          goto _L93
_L51:
        if (v != null)
        {
            v.c();
        }
          goto _L93
_L52:
        l.b();
          goto _L93
_L53:
        obj1 = intent.getStringExtra("username");
        String s3 = intent.getStringExtra("message");
        intent = intent.getDataString();
        l.a(((String) (obj1)), s3, intent);
          goto _L93
_L54:
        obj1 = a(intent);
        String s4 = intent.getStringExtra("context");
        String s7 = intent.getStringExtra("event");
        String s9 = intent.getStringExtra("event_version");
        String s11 = intent.getStringExtra("test_version");
        intent = intent.getStringExtra("json_data");
        Assertion.a(obj1, "Log event requires an uri. Intent.getStringExtra(EXTRA_LOG_EVENT_SOURCE_URI) cannot be null.");
        l.a(((String) (obj1)), s4, s7, s9, s11, intent);
        intent = new Runnable(s7, s9, intent) {

            private String a;
            private String b;
            private String c;
            private SpotifyService d;

            public final void run()
            {
                if (SpotifyService.o(d) != null)
                {
                    gjb gjb1 = SpotifyService.o(d);
                    String s12 = a;
                    String s14 = b;
                    String s15 = c;
                    if (com.spotify.mobile.android.util.ClientEvent.Event.O.toString().equals(s12) && com.spotify.mobile.android.util.ClientEvent.SubEvent.aB.toString().equals(s14))
                    {
                        AppEventsLogger.a(gjb1.a);
                        return;
                    }
                    if (com.spotify.mobile.android.util.ClientEvent.Event.ae.toString().equals(s12))
                    {
                        try
                        {
                            String s13 = (new JSONObject(s15)).getString("account-type");
                            Bundle bundle1 = new Bundle();
                            bundle1.putString("fb_registration_method", s13);
                            if (gjb1.b == null)
                            {
                                gjb1.b = AppEventsLogger.b(gjb1.a);
                            }
                            gjb1.b.a("fb_mobile_complete_registration", bundle1);
                            return;
                        }
                        catch (JSONException jsonexception)
                        {
                            Assertion.a("mangled json in clientevent", jsonexception);
                        }
                        return;
                    }
                }
            }

            
            {
                d = SpotifyService.this;
                a = s1;
                b = s2;
                c = s3;
                super();
            }
        };
        d.post(intent);
          goto _L93
_L55:
        intent = ViewLoadTimerMessage.a(intent);
        Assertion.a(intent, "ViewLoadTimerMessage must not be null for this service call!");
        l.a(intent);
          goto _L93
_L56:
        intent = AppStartupTimerMessage.a(intent);
        Assertion.a(intent, "AppStartupTimerMessage must not be null for this service call!");
        l.a(intent);
          goto _L93
_L57:
        intent = intent.getStringExtra("log_message");
        Assertion.a(intent, "intent.getStringExtra(EXTRA_LOG_MESSAGE) cannot be null.");
        l.a(intent);
          goto _L93
_L58:
        obj1 = (Verified)intent.getParcelableExtra("uri");
        Assertion.a(obj1, "Log view requires an uri. intent.getParcelableExtra(EXTRA_LOG_VIEW_URI) cannot be null.");
        long l1 = intent.getLongExtra("duration", 0L);
        l.a(((Verified) (obj1)), l1);
          goto _L93
_L59:
        obj1 = intent.getData();
        Assertion.a(obj1, (new StringBuilder("Content URI missing from intent: ")).append(intent).toString());
        String s5 = ((Uri) (obj1)).getAuthority();
        Assertion.a(s5, (new StringBuilder("No authority part set for the content uri ")).append(obj1).toString());
        if (s5.equals(SpotifyProvider.a))
        {
            String s6 = ((Uri) (obj1)).getEncodedPath();
            Assertion.a(s6, (new StringBuilder("Content URI path missing: ")).append(obj1).toString());
            obj1 = s6.substring(1);
            long l2 = intent.getLongExtra("row_id", 0L);
            boolean flag = intent.getBooleanExtra("shuffle", false);
            s6 = a(intent);
            String s8 = intent.getStringExtra("feature_identifier");
            String s10 = intent.getStringExtra("referer");
            intent = intent.getStringExtra("event_version");
            U.a();
            U.c();
            n.a(((String) (obj1)), (int)l2, flag, s6, s8, s10, intent);
        }
          goto _L93
_L60:
        k();
          goto _L93
_L61:
        l();
          goto _L93
_L62:
        j();
          goto _L93
_L63:
        b(intent);
          goto _L93
_L64:
        m();
          goto _L93
_L65:
        i1 = intent.getIntExtra("position", 0);
        n.a(i1);
          goto _L93
_L66:
        if (C.o.d())
        {
            n.a(true);
        }
        C.k.c();
          goto _L93
_L67:
        intent = intent.getStringExtra("uri");
        dmz.a(fop);
        fop.a(this, ViewUri.bE, ClientEventFactory.a("notification", com.spotify.mobile.android.util.ClientEvent.SubEvent.O, null, null));
        if (e != null && fdo.a(e))
        {
            intent = AddToPlaylistActivity.a(this, intent, null, e, ViewUri.bE, com.spotify.mobile.android.spotlets.playlist.util.PlaylistLogger.SourceAction.b);
            intent.setFlags(0x30000000);
            startActivity(intent);
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } else
        {
            CollectionService.a(this, intent, ViewUri.bE.toString(), e, com.spotify.mobile.android.spotlets.collection.service.CollectionService.Messaging.a);
        }
        u.a(ForceInCollection.a);
          goto _L93
_L68:
        i1 = intent.getIntExtra("n_tracks_to_skip", 0);
        n.b(i1);
          goto _L93
_L69:
        i1 = intent.getIntExtra("n_tracks_to_skip", 0);
        n.c(i1);
          goto _L93
_L70:
        intent = intent.getStringArrayExtra("preview_track_uris");
        if (intent != null)
        {
            n.a(intent);
        }
          goto _L93
_L71:
        n.c();
          goto _L93
_L73:
        obj1 = (KeyEvent)intent.getParcelableExtra("android.intent.extra.KEY_EVENT");
        if (obj1 == null || ((KeyEvent) (obj1)).getAction() != 1) goto _L93; else goto _L94
_L94:
        if (!((fni) (C.p)).a) goto _L96; else goto _L95
_L95:
        intent = flb.a(this, "com.spotify.music.service.video.action.media_button");
        intent.putExtra("android.intent.extra.KEY_EVENT", ((android.os.Parcelable) (obj1)));
        startService(intent);
          goto _L93
_L96:
        switch (((KeyEvent) (obj1)).getKeyCode())
        {
        case 79: // 'O'
            if (SystemClock.elapsedRealtime() - G < (long)getResources().getInteger(0x7f0e000f))
            {
                n.b();
            } else
            {
                n.a();
            }
            G = SystemClock.elapsedRealtime();
            o();
            break;

        case 126: // '~'
            k();
            o();
            break;

        case 86: // 'V'
        case 127: // '\177'
            l();
            break;

        case 85: // 'U'
            j();
            o();
            break;

        case 87: // 'W'
            if (((fni) (C.q)).a)
            {
                gbq.a(this, ViewUri.bG, n());
            } else
            {
                o();
            }
            m();
            break;

        case 88: // 'X'
            if (((fni) (C.q)).a)
            {
                gbq.a(this, ViewUri.bG, n());
            }
            b(intent);
            break;
        }
        if (true) goto _L93; else goto _L97
_L97:
_L74:
        intent = (ResultReceiver)intent.getParcelableExtra("callback");
        if (intent != null)
        {
            Bundle bundle = new Bundle();
            bundle.putInt("audio_session_id", c.a);
            intent.send(0, bundle);
        }
          goto _L93
_L75:
        l.d();
          goto _L93
_L76:
        if (!Z.inKeyguardRestrictedInputMode())
        {
            C.e.J_();
            if (M != null)
            {
                M.a(false);
            }
        }
          goto _L93
_L77:
        dwa.a();
          goto _L93
_L78:
        String s1 = intent.getStringExtra("flag");
        Assertion.a(s1);
        intent = intent.getStringExtra("value");
        Assertion.a(intent, "ABBA doesn't allow empty flag values");
        l.c(s1, intent);
          goto _L93
_L79:
        Uri uri = intent.getData();
        Intent intent1 = (Intent)intent.getParcelableExtra("log_intent");
        if (uri != null)
        {
            if ((new SpotifyLink(uri.toString())).c != com.spotify.mobile.android.util.SpotifyLink.LinkType.O)
            {
                intent = gms.a(this, uri.toString()).a;
            } else
            {
                intent = dwb.a(uri);
                uri = ((dwc) (intent)).b;
                if (((dwc) (intent)).a)
                {
                    new dwd(this, uri);
                    intent = null;
                } else
                {
                    intent = new Intent("android.intent.action.VIEW", uri);
                }
            }
        } else
        {
            intent = gms.a(this).a;
        }
        if (intent != null)
        {
            intent.addFlags(0x10000000);
            startActivity(intent);
        }
        if (intent1 != null)
        {
            startService(intent1);
        }
          goto _L93
_L80:
        String s2 = intent.getStringExtra("deviceid");
        intent = intent.getStringExtra("googleaid");
        Assertion.a(intent, "Log device identifier requires a google aid.");
        l.b(intent, s2);
          goto _L93
_L81:
        if (X != null)
        {
            intent = X;
            if (((fqr) (intent)).b != null)
            {
                ((fqr) (intent)).b.a.b();
            }
        }
          goto _L93
_L82:
        boolean flag1 = intent.getBooleanExtra("restart_app_opt_in_trial_activation", true);
        if (Y == null)
        {
            intent = new Runnable(flag1) {

                final boolean a;
                final SpotifyService b;

                public final void run()
                {
                    SpotifyService.a(b, new frc(b, new frd(this) {

                        private _cls14 a;

                        public final void a(boolean flag)
                        {
                            if (SpotifyService.n(a.b) != null)
                            {
                                SpotifyService.n(a.b).a();
                                SpotifyService.a(a.b, null);
                            }
                            if (flag && a.a)
                            {
                                gbw gbw1 = new gbw(a.b, SpotifyService.m(a.b).getOrbitSession());
                                gbw1.c = true;
                                gbw1.a();
                            }
                        }

            
            {
                a = _pcls14;
                super();
            }
                    }));
                    frc frc1 = SpotifyService.n(b);
                    boolean flag3 = a;
                    Logger.a("Starting", new Object[0]);
                    frc1.a = flag3;
                    frc1.d.a(dtw.a, fre.a());
                    if (flag3)
                    {
                        dmz.a(ggc);
                        ggc.a(frc1.b, 0x7f080559, 1, new Object[0]);
                    }
                }

            
            {
                b = SpotifyService.this;
                a = flag;
                super();
            }
            };
            d.post(intent);
        }
          goto _L93
_L83:
        d.post(new Runnable() {

            private SpotifyService a;

            public final void run()
            {
                (new gbw(a, SpotifyService.m(a).getOrbitSession())).a();
            }

            
            {
                a = SpotifyService.this;
                super();
            }
        });
          goto _L93
_L84:
        Logger.a("Start service action received.", new Object[0]);
          goto _L93
_L85:
        intent = new Runnable() {

            private SpotifyService a;

            public final void run()
            {
                SpotifyService.m(a).crash();
            }

            
            {
                a = SpotifyService.this;
                super();
            }
        };
        d.postDelayed(intent, 100L);
          goto _L93
_L86:
        intent = (TermsAndConditionsModel)intent.getParcelableExtra("accept_user_terms");
        l.a(intent);
          goto _L93
_L87:
        d.post(new Runnable() {

            private SpotifyService a;

            public final void run()
            {
                SpotifyService.m(a).getOrbitSession().flushCaches();
            }

            
            {
                a = SpotifyService.this;
                super();
            }
        });
          goto _L93
_L88:
        q.g();
          goto _L93
_L89:
        throw new OutOfMemoryError();
_L90:
        c(false);
          goto _L93
_L91:
        c(true);
          goto _L93
_L92:
        boolean flag2 = intent.getBooleanExtra("state_enabled", false);
        intent = C.n;
        if (flag2)
        {
            intent.J_();
        } else
        {
            intent.c();
        }
          goto _L93
    }

    public void onTaskRemoved(Intent intent)
    {
        super.onTaskRemoved(intent);
        Logger.a("Shutting down client since the task was removed!", new Object[0]);
        d();
    }

    public void onTrimMemory(int i1)
    {
        if (i1 == 20)
        {
            h();
        }
    }

    public boolean onUnbind(Intent intent)
    {
        Logger.a("Last client disconnected!", new Object[0]);
        return false;
    }

    static 
    {
        dmz.a(com/spotify/mobile/android/service/SpotifyService, com/spotify/mobile/android/orbit/OrbitFactory, new NativeOrbitFactory());
        dmz.a(com/spotify/mobile/android/service/SpotifyService, dvi, new dvi());
        dmz.a(com/spotify/mobile/android/service/SpotifyService, dux, new dux());
    }
}
