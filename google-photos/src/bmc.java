// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.os.Build;
import android.preference.PreferenceManager;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.apps.moviemaker.analyzer.postprocess.StabilizationPostProcessor;
import com.google.android.apps.moviemaker.app.ApplicationEnabler;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public final class bmc
    implements bma
{

    private static final int a = b.m(16);
    private static final int b = b.m(4);
    private cyd A;
    private ApplicationEnabler B;
    private blh C;
    private cko D;
    private cko E;
    private csz F;
    private okq G;
    private okq H;
    private bzo I;
    private final Context c;
    private final bld d;
    private final bmm e;
    private final bkq f;
    private final bnl g;
    private final buf h;
    private final dfk i;
    private final dfj j;
    private final chq k;
    private final cit l;
    private final noj m;
    private bqz n;
    private Future o;
    private ckx p;
    private ckt q;
    private crx r;
    private crt s;
    private cjs t;
    private cah u;
    private bws v;
    private dct w;
    private bjx x[];
    private bjx y[];
    private bjn z[];

    public bmc(Context context)
    {
        b.a(context, "context", null);
        c = context.getApplicationContext();
        d = bld.a(context);
        String s1 = Build.DEVICE;
        String s2 = android.os.Build.VERSION.INCREMENTAL;
        WindowManager windowmanager = (WindowManager)context.getSystemService("window");
        DisplayMetrics displaymetrics = new DisplayMetrics();
        windowmanager.getDefaultDisplay().getMetrics(displaymetrics);
        float f1 = (float)displaymetrics.widthPixels / displaymetrics.xdpi;
        float f2 = (float)displaymetrics.heightPixels / displaymetrics.ydpi;
        e = new bmm(s1, s2, Math.sqrt(f1 * f1 + f2 * f2));
        f = new bkq(new File(context.getFilesDir(), "aps"));
        g = (bnl)olm.a(context, bnl);
        h = new buf(f, g);
        l = (cit)olm.a(context, cit);
        h.a(l.b("PluggedInLog"));
        h.a(l.b("PostCaptureLog"));
        h.a(l.b("PostSyncLog"));
        h.a(l.b("ClusteringLog"));
        h.a(l.b("AamEventsLog"));
        i = (dfk)olm.a(context, dfk);
        j = (dfj)olm.a(context, dfj);
        k = (chq)olm.a(context, chq);
        m = (noj)olm.a(context, noj);
        m().a();
    }

    static Context a(bmc bmc1)
    {
        return bmc1.c;
    }

    public final ddh A()
    {
        return dcy.a;
    }

    public final bzo B()
    {
        if (I == null)
        {
            I = new bzo(c);
        }
        return I;
    }

    public final bld a()
    {
        return d;
    }

    public final bmm b()
    {
        return e;
    }

    public final buf c()
    {
        return h;
    }

    public final bkq d()
    {
        return f;
    }

    public final bws e()
    {
        if (v != null)
        {
            return v;
        } else
        {
            v = new bws(new bmf(this, c.getSharedPreferences("soundtrackUsage", 0), c.getResources().getString(c.aO)));
            return v;
        }
    }

    public final cyd f()
    {
        if (A == null)
        {
            A = new cyd(new cye());
        }
        return A;
    }

    public final bqz g()
    {
        if (n == null)
        {
            n = new bqz(PreferenceManager.getDefaultSharedPreferences(c), c.getResources());
        }
        return n;
    }

    public final crx h()
    {
        if (r == null)
        {
            crn crn1 = crn.a(a);
            crn crn2 = crn.a(b);
            if (s == null)
            {
                s = new crt(c, (ckx)olm.a(c, clm), i());
            }
            r = new crx(s, crn1, crn2);
        }
        return r;
    }

    public final cjs i()
    {
        if (t == null)
        {
            t = new cjs(c, m, new okw(z(), y()));
        }
        return t;
    }

    public final ckx j()
    {
        if (p == null)
        {
            bnl bnl1 = g;
            java.util.concurrent.ExecutorService executorservice = i.a(cku, "AudioDecoderBackgroundExecutor");
            p = new ckx(new bmd(this, bnl1), new cku(g, executorservice));
        }
        return p;
    }

    public final ckt k()
    {
        if (q == null)
        {
            java.util.concurrent.ExecutorService executorservice = i.a(ckw, "ClipEditorDecoderBackgroundExecutor");
            q = new ckv(k, g, executorservice);
        }
        return q;
    }

    public final czc l()
    {
        if (o == null)
        {
            FutureTask futuretask = new FutureTask(new bme(this));
            j.b().execute(futuretask);
            o = futuretask;
        }
        return new czf(new czh(o, cza.c));
    }

    public final ApplicationEnabler m()
    {
        if (B == null)
        {
            B = new ApplicationEnabler(c, c.getPackageManager(), g, m, j.a());
        }
        return B;
    }

    public final cah n()
    {
        if (u == null)
        {
            u = new cah((ConnectivityManager)c.getSystemService("connectivity"));
        }
        return u;
    }

    public final dct o()
    {
        if (w == null)
        {
            w = new dct((AudioManager)c.getSystemService("audio"));
        }
        return w;
    }

    public final bjn[] p()
    {
        if (z == null)
        {
            z = (new bjn[] {
                new StabilizationPostProcessor()
            });
        }
        return z;
    }

    public final bjn[] q()
    {
        return bjn.a;
    }

    public final bjx[] r()
    {
        if (x == null)
        {
            x = (new bjx[] {
                new bkw(), new bkx(), new bla(), new bky(true)
            });
        }
        return x;
    }

    public final bjx[] s()
    {
        if (y == null)
        {
            y = (new bjx[] {
                new blc()
            });
        }
        return y;
    }

    public final csz t()
    {
        if (F == null)
        {
            F = new csz(c, g, new cso(0x989680, c, "MusicCache"), new css(c, "MusicDetailCache"), new File(c.getFilesDir(), "soundtrack_list"), new csi(i(), j(), "LocalMusicDetailCache"));
        }
        return F;
    }

    public final File u()
    {
        return c.getDir("AssetCache", 0);
    }

    public final cko v()
    {
        if (D == null)
        {
            D = new cko();
        }
        return D;
    }

    public final cko w()
    {
        if (E == null)
        {
            E = new cko();
        }
        return E;
    }

    public final blh x()
    {
        if (C == null)
        {
            C = new blh(m);
        }
        return C;
    }

    public final okq y()
    {
        if (G == null)
        {
            G = new okq(new File(c.getCacheDir(), "MovieMakerChunkCache"), 0x40000, brv.a, okq.d(), okq.c());
        }
        return G;
    }

    public final okq z()
    {
        if (H == null)
        {
            H = new okq(new File(c.getCacheDir(), "MovieMakerFirstChunkCache"), 0x40000, brv.b, okq.d(), okq.c());
        }
        return H;
    }

}
