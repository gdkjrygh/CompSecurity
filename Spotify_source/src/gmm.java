// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.spotify.mobile.android.cosmos.player.v2.PlayerFactory;
import com.spotify.mobile.android.devtools.MethodTraceScope;
import com.spotify.mobile.android.http.WebgateTokenManager;
import com.spotify.mobile.android.orbit.OrbitLibraryLoader;
import com.spotify.mobile.android.spotlets.ads.AdEventReporter;
import com.spotify.mobile.android.spotlets.ads.rules.AdRules;
import com.spotify.mobile.android.spotlets.follow.FollowManager;
import com.spotify.mobile.android.ui.stuff.BadgesFactory;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.ClientInfo;
import com.spotify.mobile.android.util.LockScreenController;
import com.spotify.mobile.android.util.PRNGFixes;
import com.spotify.mobile.android.util.ProcessIdentifier;
import com.spotify.mobile.android.util.logging.LogLevel;
import com.spotify.mobile.android.util.logging.Logger;
import com.spotify.music.spotlets.tracking.Tracking;
import java.util.EnumSet;
import java.util.Random;
import java.util.concurrent.Callable;

public class gmm
{

    private static boolean a;
    private static boolean b;
    private static boolean c;

    public gmm()
    {
    }

    public static void a(final Context final_context)
    {
        gmm;
        JVM INSTR monitorenter ;
        boolean flag = a;
        if (!flag) goto _L2; else goto _L1
_L1:
        gmm;
        JVM INSTR monitorexit ;
        return;
_L2:
        MethodTraceScope.b.a();
        dmz.a(true);
        Object obj = new gpx(final_context);
        fos fos1 = new fos();
        gcm gcm1 = new gcm();
        gcz gcz1 = new gcz(final_context);
        gbs gbs1 = new gbs(final_context);
        fop fop1 = new fop();
        for for1 = new for();
        ClientInfo clientinfo = new ClientInfo(final_context);
        ggb ggb1 = new ggb();
        gni gni1 = new gni();
        giq giq1 = new giq();
        WebgateTokenManager webgatetokenmanager = new WebgateTokenManager(final_context, gni1, giq1);
        dms dms1 = new dms(final_context, webgatetokenmanager);
        dmz.a(gni, gni1);
        dmz.a(dup, new dum());
        dmz.a(gpx, ((dmx) (obj)));
        dmz.a(gpy, new gpz());
        dmz.a(fos, fos1);
        dmz.a(fop, fop1);
        dmz.a(for, for1);
        dmz.a(gcm, gcm1);
        dmz.a(ggc, new ggc());
        dmz.a(com/spotify/mobile/android/util/ClientInfo, clientinfo);
        dmz.a(gcz, gcz1);
        dmz.a(gcr, new gcr(gcz1));
        dmz.a(gcq, gbs1);
        dmz.a(gfr, new gfr(gbs1, gcz1));
        dmz.a(ghm, new ghm(gcz1));
        dmz.a(ftz, new ftz());
        dmz.a(com/spotify/mobile/android/ui/stuff/BadgesFactory, new BadgesFactory());
        dmz.a(com/spotify/mobile/android/spotlets/follow/FollowManager, new FollowManager(final_context));
        dmz.a(gft, new gft(final_context, new gvs(dms1.b), new Callable() {

            public final Object call()
            {
                return Boolean.valueOf(false);
            }

        }));
        dmz.a(gjj, new gjj());
        dmz.a(exw, new dna(final_context) {

            private Context a;

            public final Object a()
            {
                return new exw(a);
            }

            
            {
                a = context;
                super();
            }
        });
        dmz.a(eej, new eej(final_context));
        dmz.a(com/spotify/mobile/android/spotlets/ads/rules/AdRules, new dna() {

            public final Object a()
            {
                return new AdRules();
            }

        });
        dmz.a(efg, new dna(final_context) {

            private Context a;

            public final Object a()
            {
                return new efg(a);
            }

            
            {
                a = context;
                super();
            }
        });
        dmz.a(exv, new exv(gcz1));
        dmz.a(gdy, new gdy(final_context));
        dmz.a(epx, new epy());
        dmz.a(egs, new egs());
        dmz.a(eba, new eba());
        dmz.a(edd, new edd());
        dmz.a(dxd, new dxd());
        dmz.a(ggb, ggb1);
        dmz.a(gew, new gew());
        dmz.a(giq, giq1);
        dmz.a(com/spotify/mobile/android/http/WebgateTokenManager, webgatetokenmanager);
        dmz.a(dms, dms1);
        dmz.a(gfz, new dna() {

            public final Object a()
            {
                return new gfz();
            }

        });
        dmz.a(ghc, new dna(final_context) {

            private Context a;

            public final Object a()
            {
                return new ghc(a);
            }

            
            {
                a = context;
                super();
            }
        });
        dmz.a(fjm, new fjm());
        dmz.a(get, new dna(final_context) {

            private Context a;

            public final Object a()
            {
                return new get(a);
            }

            
            {
                a = context;
                super();
            }
        });
        dmz.a(edz, new dna(final_context) {

            private Context a;

            public final Object a()
            {
                return new edz(a);
            }

            
            {
                a = context;
                super();
            }
        });
        dmz.a(dxd, new dxd());
        dmz.a(dzz, new dzz());
        dmz.a(gkb, new gkb());
        dmz.a(gkz, new gkz());
        dmz.a(glg, new glg());
        dmz.a(gky, new gky());
        dmz.a(glo, new glo());
        dmz.a(gki, new gki());
        dmz.a(glx, new glx());
        dmz.a(eem, new eem());
        dmz.a(gla, new gla());
        dmz.a(gli, new gli());
        dmz.a(gke, new gke());
        dmz.a(gkl, new gkl());
        dmz.a(gmf, new gmf());
        dmz.a(gkg, new gko());
        dmz.a(gkt, new gkt());
        dmz.a(gmv, new gmv(new Random()));
        dmz.a(com/spotify/music/spotlets/tracking/Tracking, new gpt(new gpq(), new gpu()));
        dmz.a(efq, new efq());
        dmz.a(gow, new gow());
        dmz.a(faf, new dna() {

            public final Object a()
            {
                return new faf();
            }

        });
        dmz.a(ear, new ear(final_context));
        dmz.a(eca, new eca());
        dmz.a(com/spotify/mobile/android/spotlets/ads/AdEventReporter, new AdEventReporter(final_context, gni1));
        dmz.a(gqe, new gqe(final_context));
        dmz.a(gqf, new gqg());
        dmz.a(fsd, new dna() {

            public final Object a()
            {
                return new fsd();
            }

        });
        dmz.a(fsi, new dna() {

            public final Object a()
            {
                return new fsi();
            }

        });
        dmz.a(com/spotify/mobile/android/cosmos/player/v2/PlayerFactory, new PlayerFactory());
        dmz.a(fix, new fix(final_context, giq1, gni1));
        dmz.a(fdn, new fdn(final_context, giq1, gni1));
        dmz.a(far, new far());
        dmz.a(gcb, new gcc(final_context));
        dmz.a(gqc, new gqc());
        dmz.a(ekl, new ekm());
        dmz.a(eaq, new eaq());
        dmz.a(eke, new eke());
        dmz.a(eay, new dna(final_context) {

            private Context a;

            public final Object a()
            {
                return new eay(a);
            }

            
            {
                a = context;
                super();
            }
        });
        dmz.a(ecb, new dna(final_context) {

            private Context a;

            public final Object a()
            {
                return new ecb(a);
            }

            
            {
                a = context;
                super();
            }
        });
        dmz.a(gnq, new gnq(final_context));
        dmz.a(glj, new glj());
        dmz.a(fqc, new fqc());
        dmz.a(fpt, fpz.a(final_context));
        dmz.a(gff, new gff(final_context));
        dmz.a(gob, new gob());
        dmz.a(efk, new efk());
        dmz.a(dwa, new dwa());
        dmz.a(gpw, new gpw());
        dmz.a(gps, new dna() {

            public final Object a()
            {
                return new gps(new gpr[] {
                    new gpv()
                });
            }

        });
        dmz.a(eeu, new eeu());
        dmz.a(com/spotify/mobile/android/orbit/OrbitLibraryLoader, new OrbitLibraryLoader());
        dmz.a(frl, new dna() {

            public final Object a()
            {
                return new frl();
            }

        });
        dmz.a(ffm, new ffm());
        dmz.a(ffg, new ffg());
        dmz.a(edt, new edt(final_context));
        dmz.a(gct, new gct((Application)final_context));
        dmz.a(frb, frb.a());
        dmz.a(eei, new eei());
        dmz.a(gnw, gnw.a(final_context, giq1));
        dmz.a(dwg, new dwg(final_context.getApplicationContext()));
        dmz.a(ghh, new ghh(final_context.getResources()));
        dmz.a(gml, new dna(final_context) {

            private Context a;

            public final Object a()
            {
                return new gml(new gmh(a.getApplicationContext()));
            }

            
            {
                a = context;
                super();
            }
        });
        dmz.a(flv, new flv());
        dmz.a(edp, new edp());
        dmz.a(edr, new edr());
        dmz.a(gim, new gil());
        dmz.a(ekn, new ekn());
        dmz.a(fmu, new fmu());
        dmz.a(dit, new fzy());
        dmz.a(gnb, new gnc());
        dmz.a(eez, new eez(final_context.getApplicationContext()));
        dmz.a(dzy, new dzy());
        dmz.a(edw, new edw());
        dmz.a(dmj, new dmr());
        dmz.a(dmo, new dmo());
        dmz.a(edf, new edf(final_context));
        dmz.a(dun, new dun(final_context));
        dmz.a(false);
        Assertion.a(new gfo(), Assertion.a);
        obj = (new ProcessIdentifier(final_context)).a();
        ((gew)dmz.a(gew)).a = ((com.spotify.mobile.android.util.ProcessIdentifier.ProcessType) (obj));
        b = false;
        c = false;
        b = true;
        c = true;
        if (((gew)dmz.a(gew)).a == com.spotify.mobile.android.util.ProcessIdentifier.ProcessType.a)
        {
            if (b)
            {
                (new gmz(final_context, new gcs())).a();
            }
            ((gmv)dmz.a(gmv)).c();
        }
        flag = gmt.a();
        if (flag)
        {
            break MISSING_BLOCK_LABEL_1796;
        }
        PRNGFixes.a();
_L4:
        ((ekl)dmz.a(ekl)).a(final_context);
        a = true;
        MethodTraceScope.b.b();
        if (true) goto _L1; else goto _L3
_L3:
        final_context;
        throw final_context;
        Exception exception;
        exception;
        Assertion.a("Could not apply PRNGFixes", exception);
          goto _L4
    }

    public static boolean a()
    {
        return b;
    }

    public static boolean b()
    {
        return c;
    }

    public static void onCreate(Application application)
    {
        MethodTraceScope.c.a();
        a(application);
        Object obj1 = EnumSet.of(LogLevel.e);
        Object obj = EnumSet.of(LogLevel.c, LogLevel.d, LogLevel.e);
        obj1 = new ghu(((EnumSet) (obj1)));
        obj = new ghv(((EnumSet) (obj)));
        Logger.a(ghz.b, new ght[] {
            obj1, obj
        });
        if (0.0001D > Math.random())
        {
            Assertion.b("baseline crash, periodicity 10000");
        }
        if (((gew)dmz.a(gew)).a == com.spotify.mobile.android.util.ProcessIdentifier.ProcessType.a)
        {
            (new Handler()).postDelayed(new Runnable(application) {

                private Application a;

                public final void run()
                {
                    ((Tracking)dmz.a(com/spotify/music/spotlets/tracking/Tracking)).a(a);
                }

            
            {
                a = application;
                super();
            }
            }, 10000L);
        }
        ((gcr)dmz.a(gcr)).b = SystemClock.elapsedRealtime();
        if (((gew)dmz.a(gew)).a == com.spotify.mobile.android.util.ProcessIdentifier.ProcessType.a)
        {
            ((OrbitLibraryLoader)dmz.a(com/spotify/mobile/android/orbit/OrbitLibraryLoader)).startLibraryLoading(application, new com.spotify.mobile.android.orbit.OrbitLibraryLoader.LibraryLoader());
            (new giq._cls1("SpSharedPreferencesPreloaderThread", ((giq)dmz.a(giq)).a(application))).start();
        }
        application.registerActivityLifecycleCallbacks(new LockScreenController(application));
        application.registerActivityLifecycleCallbacks((android.app.Application.ActivityLifecycleCallbacks)dmz.a(fmu));
        MethodTraceScope.c.b();
    }
}
