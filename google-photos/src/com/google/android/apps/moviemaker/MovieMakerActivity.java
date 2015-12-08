// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.moviemaker;

import am;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.Toast;
import b;
import bhq;
import bhr;
import bhs;
import bht;
import bhy;
import bic;
import bin;
import bjf;
import bjh;
import bjl;
import bjq;
import blw;
import bma;
import bmb;
import bnl;
import bnu;
import boj;
import boz;
import bpa;
import bpe;
import bpi;
import brv;
import buf;
import buh;
import bul;
import bws;
import bww;
import bxb;
import bxd;
import bxg;
import bxh;
import bxi;
import bzg;
import bzv;
import c;
import cag;
import cal;
import can;
import cap;
import ceb;
import cha;
import chq;
import chu;
import chx;
import cis;
import cko;
import clm;
import clx;
import crr;
import crx;
import cue;
import cuu;
import cuz;
import cwr;
import ddf;
import ded;
import dfb;
import dff;
import dfg;
import dfi;
import dfj;
import dfk;
import dfm;
import dfn;
import gfh;
import gfk;
import java.io.File;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import mmr;
import mmv;
import mnk;
import mpk;
import mti;
import mtj;
import mua;
import mue;
import nfp;
import nfq;
import noj;
import noq;
import nuu;
import nxv;
import olm;
import opz;
import p;
import pwp;
import rv;
import ss;
import su;

public class MovieMakerActivity extends bhy
    implements boz, mti
{

    private static final String h = com/google/android/apps/moviemaker/MovieMakerActivity.getSimpleName();
    private noj A;
    private noq B;
    private bjq C;
    public boj d;
    public bpa e;
    private final dfg i = new dfg();
    private mtj j;
    private dfj k;
    private mmr l;
    private clx m;
    private mpk n;
    private buf o;
    private bnl p;
    private bws q;
    private cko r;
    private crx s;
    private cwr t;
    private bww u;
    private chq v;
    private cuu w;
    private ded x;
    private clm y;
    private cis z;

    public MovieMakerActivity()
    {
    }

    public static mtj a(MovieMakerActivity moviemakeractivity)
    {
        return moviemakeractivity.j;
    }

    public static chq b(MovieMakerActivity moviemakeractivity)
    {
        return moviemakeractivity.v;
    }

    public static MovieMakerActivity b(am am1)
    {
        return (MovieMakerActivity)am1.O_();
    }

    public static cko c(MovieMakerActivity moviemakeractivity)
    {
        return moviemakeractivity.r;
    }

    public static cuu d(MovieMakerActivity moviemakeractivity)
    {
        return moviemakeractivity.w;
    }

    public static ded e(MovieMakerActivity moviemakeractivity)
    {
        return moviemakeractivity.x;
    }

    public static clm f(MovieMakerActivity moviemakeractivity)
    {
        return moviemakeractivity.y;
    }

    public static bpa g(MovieMakerActivity moviemakeractivity)
    {
        return moviemakeractivity.e;
    }

    private void l()
    {
        Intent intent = new Intent();
        if (u.b.ab)
        {
            intent.putExtra("extra_result_message", getString(c.aG));
        }
        setResult(-1, intent);
    }

    public final void a(int i1, Menu menu)
    {
        getMenuInflater().inflate(i1, menu);
    }

    public final void a(Intent intent)
    {
        e.m();
        startActivityForResult(intent, 1);
    }

    public final void a(Uri uri)
    {
        Intent intent = new Intent();
        intent.putExtra("extra_result_generate_bytes_uri", uri);
        setResult(-1, intent);
        finish();
    }

    protected final void a(Bundle bundle)
    {
        super.a(bundle);
        j = (mtj)f.a(mtj);
        B = (noq)f.a(noq);
        f.a(com/google/android/apps/moviemaker/MovieMakerActivity, this);
        l = new mnk(this, super.g);
        f.a(mmr, l);
        k = (dfj)olm.a(this, dfj);
        C = (bjq)olm.a(this, bjq);
        m = (clx)olm.a(this, clx);
        p = (bnl)olm.a(this, bnl);
        A = (noj)olm.a(this, noj);
        A.a(f);
        bundle = (gfk)f.a(gfk);
        n = (mpk)f.a(mpk);
        n.a(b.gE, new bhq(this, bundle));
    }

    public final void a(String s1, mue mue1, mua mua)
    {
        if (cal.a.equals(s1))
        {
            s1 = cal.a(s1, mue1);
            if (s1 != null)
            {
                A.a(this, s1);
            }
        } else
        if (gfh.a.equals(s1))
        {
            mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
            return;
        }
    }

    public final void b(boolean flag)
    {
        rv rv1 = e().a();
        Resources resources = getResources();
        int i1;
        if (flag)
        {
            i1 = b.fa;
        } else
        {
            i1 = b.fb;
        }
        rv1.b(resources.getDrawable(i1));
    }

    public final void c(boolean flag)
    {
        String s1;
        int i1;
        if (flag)
        {
            i1 = c.bk;
        } else
        {
            i1 = c.bj;
        }
        s1 = getString(i1);
        A.a(this, s1);
    }

    public void dump(String s1, FileDescriptor filedescriptor, PrintWriter printwriter, String as[])
    {
        ((nfp)p.b(o, "loggable")).a(new nfq(printwriter, s1));
        super.dump(s1, filedescriptor, printwriter, as);
    }

    protected final void f()
    {
        super.f();
        if (!bpe.b(this))
        {
            if (!p.A_())
            {
                Log.w(h, "Application not enabled. Quitting...");
                (new cha()).show(getFragmentManager(), "UnsupportedVersionDialogFragment");
                return;
            }
        } else
        if (!A.d())
        {
            Log.w(h, "Application not enabled. Quitting...");
            finish();
            return;
        }
        d.e();
        e.a.a(bxg.o).a(bxg.u).a(bxg.t).a(bxg.s);
    }

    public final void g()
    {
        invalidateOptionsMenu();
    }

    public final void h()
    {
        startActivityForResult(new Intent(this, bic), 3);
    }

    public final void i()
    {
        if (!A.a(l.d()))
        {
            j();
            return;
        }
        Uri uri;
        boolean flag;
        if (!u.B() || u.b.ac)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        uri = Uri.parse(String.format("aam://share/%s/%b", new Object[] {
            u.b.X, Boolean.valueOf(flag)
        }));
        j.a(new cal(A, l.d(), u.b.X, uri));
    }

    public final void j()
    {
        if (u.x() == bxd.b)
        {
            j.a(new cal(A, l.d(), u.b.X, Uri.fromFile(new File(u.s()))));
        }
    }

    public void onActivityResult(int i1, int j1, Intent intent)
    {
        if (i1 == 2 && j1 == -1)
        {
            Object obj;
            if (bpe.b(this))
            {
                obj = A.a(this, intent);
            } else
            {
                obj = null;
            }
            if (obj != null && ((List) (obj)).size() > 0)
            {
                Uri uri = (Uri)((List) (obj)).get(0);
                obj = uri;
                if (uri == null)
                {
                    obj = h;
                    String s2 = String.valueOf(intent);
                    Log.w(((String) (obj)), (new StringBuilder(String.valueOf(s2).length() + 51)).append("got null uri from G+ intent. Not adding new media: ").append(s2).toString());
                    obj = uri;
                }
            } else
            {
                Uri uri1 = intent.getData();
                obj = uri1;
                if (uri1 == null)
                {
                    obj = h;
                    String s3 = String.valueOf(intent);
                    Log.w(((String) (obj)), (new StringBuilder(String.valueOf(s3).length() + 48)).append("got null uri from intent. Not adding new media: ").append(s3).toString());
                    obj = uri1;
                }
            }
            if (obj != null)
            {
                String s1 = String.valueOf(obj);
                (new StringBuilder(String.valueOf(s1).length() + 26)).append("GET_CONTENT returned URI: ").append(s1);
                u.b.s = (Uri)b.a(obj, "uri", null);
            } else
            {
                Toast.makeText(this, c.ad, 1).show();
            }
        } else
        if (i1 == 1 && j1 == -1)
        {
            obj = u;
            ((bww) (obj)).b.a(false);
            ((bww) (obj)).c.a();
            ((bww) (obj)).n();
            ((bww) (obj)).o();
            ((bww) (obj)).a(bxg.values());
            u.a(intent);
        }
        if (i1 == 1 && j1 == 0 && u.b().size() == 0 && u.a().size() == 0)
        {
            finish();
        }
        super.onActivityResult(i1, j1, intent);
    }

    public void onBackPressed()
    {
        l();
        if (!e.l())
        {
            super.onBackPressed();
        }
    }

    protected void onCreate(Bundle bundle)
    {
        boolean flag1 = false;
        Intent intent = getIntent();
        boolean flag = flag1;
        if (intent != null)
        {
            flag = flag1;
            if (intent.hasExtra("extra_generate_bytes"))
            {
                flag = flag1;
                if (intent.getBooleanExtra("extra_generate_bytes", false))
                {
                    flag = true;
                }
            }
        }
        super.onCreate(bundle);
        if (bundle == null)
        {
            B.a(20, 2);
        }
        setContentView(c.w);
        if (flag)
        {
            View view = findViewById(b.fL);
            if (view != null)
            {
                ((FrameLayout)view).setBackgroundColor(getResources().getColor(0x106000d));
            }
        }
        ((ViewGroup)findViewById(b.fL)).requestTransparentRegion(new View(this));
        bma bma1 = bpe.a(this).a;
        bpi.a(this, k.a(), bma1.g());
        o = bma1.c();
        q = bma1.e();
        r = bma1.w();
        s = bma1.h();
        c.a(i.a.isEmpty(), "mExecutors must be empty");
        dfm dfm1 = new dfm((dfk)olm.a(this, dfk), i);
        v = (chq)olm.a(this, chq);
        w = new cuz(this, v);
        x = bma1.j();
        y = (clm)olm.a(this, clm);
        t = bin.a(this);
        Object obj = k.b();
        Object obj1 = k.b();
        Object obj2 = C;
        Object obj3 = m;
        Object obj4 = C;
        obj4 = new bjl(bjq.a(t), ((bjq) (obj4)).d, ((bjq) (obj4)).e);
        obj2 = new bjf(bjq.a(((Executor) (obj)), ((Executor) (obj1)), new bjh(((bjq) (obj2)).a, ((bjp) (obj3)), ((bjw) (obj4)), ((bjq) (obj2)).f, ((bjq) (obj2)).c)));
        obj = (ceb)getFragmentManager().findFragmentByTag(ceb.a);
        if (obj == null)
        {
            obj = new ceb();
            getFragmentManager().beginTransaction().add(((android.app.Fragment) (obj)), ceb.a).commit();
        }
        u = ((ceb) (obj)).b;
        if (u == null)
        {
            u = new bww(this, bundle);
            obj.b = (bww)b.a(u, "state", null);
        }
        crr.a(getContentResolver());
        e = bpa.a(this, c(), u);
        z = new cis(this, e);
        new nuu(super.g, new bht(this));
        boolean flag2 = getPackageManager().hasSystemFeature("android.hardware.camera");
        obj3 = new can((nxv)olm.a(this, nxv), (mmv)olm.a(this, mmv));
        obj4 = new cap(this);
        Object obj5 = (dfn)olm.a(this, dfn);
        bww bww1 = u;
        cah cah = bma1.n();
        bpa bpa1 = e;
        crx crx1 = bma1.h();
        cjs cjs = bma1.i();
        ckx ckx = bma1.j();
        clm clm1 = y;
        ckt ckt = bma1.k();
        chq chq1 = v;
        cuu cuu = w;
        cko cko = r;
        obj = k;
        if (((dfj) (obj)).d == null)
        {
            if (((dfj) (obj)).c == null)
            {
                obj.c = ((dfj) (obj)).a.a(dfj, "SerialAsyncTaskExecutor");
            }
            obj.d = new dfb(((dfj) (obj)).c);
        }
        dfb dfb1 = ((dfj) (obj)).d;
        obj = k;
        if (((dfj) (obj)).f == null)
        {
            if (((dfj) (obj)).e == null)
            {
                obj.e = ((dfj) (obj)).a.a(dfj, "NetworkBackgroundThreadExecutor");
            }
            obj.f = new dfb(((dfj) (obj)).e);
        }
        dfb dfb2 = ((dfj) (obj)).f;
        bny bny = bnu.a(this, u, A, bma1.i(), dfm1.a(5, bnu, "metadata-extractor"));
        obj = (dff)((dfn) (obj5)).a.get(bzv);
        if (obj == null)
        {
            obj = new dff(((dfn) (obj5)).b, bzv, null);
            ((dfn) (obj5)).a.put(bzv, obj);
        }
        obj1 = (dff)((dfn) (obj5)).a.get(cue);
        if (obj1 == null)
        {
            obj1 = new dff(((dfn) (obj5)).b, cue, null);
            ((dfn) (obj5)).a.put(cue, obj1);
        }
        obj5 = k;
        if (((dfj) (obj5)).b == null)
        {
            obj5.b = new dfi();
        }
        obj5 = ((dfj) (obj5)).b;
        buf buf1 = o;
        bqz bqz = bma1.g();
        bnl bnl1 = p;
        bld bld = bma1.a();
        bmm bmm = bma1.b();
        bws bws = q;
        dct dct = bma1.o();
        bma1.f();
        bma1.x();
        d = new boj(this, bundle, bww1, cah, this, bpa1, ((bjf) (obj2)), crx1, cjs, ckx, clm1, ckt, chq1, cuu, cko, dfb1, dfb2, bny, ((dfl) (obj)), ((dfl) (obj1)), ((Executor) (obj5)), dfm1, buf1, bqz, bnl1, bld, bmm, bws, dct, flag2, A, new cag(j), ((can) (obj3)), ((cap) (obj4)), bma1.t(), bma1.l(), bma1.y(), bma1.z(), bma1.u(), bma1.A(), new ddf(getCacheDir()), z, bma1.B());
        if (intent != null && !u.b.f)
        {
            u.a(intent);
        }
        j.a(this);
    }

    public boolean onCreateOptionsMenu(Menu menu)
    {
        boj boj1 = d;
        if (!((bmb) (boj1)).d)
        {
            return false;
        } else
        {
            boj1.a.a(b.hD, menu);
            boj1.b.a(menu);
            boj1.b.u();
            return true;
        }
    }

    protected void onDestroy()
    {
        if (isFinishing())
        {
            Object obj = d;
            if (!((boj) (obj)).c.b.af && !((boj) (obj)).c.b.ae)
            {
                ((boj) (obj)).l.b();
            }
            A.f();
            B.a.clear();
            obj = (bzg)olm.a(this, bzg);
            File file = new File(((bzg) (obj)).a.getCacheDir(), "trimmer_remote");
            if (file.exists() && file.isDirectory())
            {
                File afile[] = file.listFiles();
                if (afile != null)
                {
                    int j1 = afile.length;
                    for (int i1 = 0; i1 < j1; i1++)
                    {
                        afile[i1].delete();
                    }

                }
                file.delete();
                ((bzg) (obj)).b.clear();
            }
        }
        i.a();
        super.onDestroy();
    }

    protected void onNewIntent(Intent intent)
    {
        super.onNewIntent(intent);
        u.a(intent);
        setIntent(intent);
    }

    public boolean onOptionsItemSelected(MenuItem menuitem)
    {
        if (!((bmb) (d)).d)
        {
            Log.w(h, "Ignoring menu item press -- controller isn't initialized");
            return false;
        }
        if (menuitem.getItemId() == 0x102002c && !e.b())
        {
            z.a(pwp.e);
            l();
            if (!e.l())
            {
                finish();
            }
            return true;
        } else
        {
            return d.a(menuitem);
        }
    }

    protected void onPause()
    {
        if (((bmb) (d)).d)
        {
            d.C_();
            e.a.b(bxg.o).b(bxg.u).b(bxg.t).b(bxg.s);
        }
        t.b();
        crx crx1;
        try
        {
            v.b(new bhs(this));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.e(h, "render context not initialized", ((Throwable) (obj)));
        }
        crx1 = s;
        synchronized (crx1.b)
        {
            crx1.c = null;
        }
        obj = v;
        if (((chq) (obj)).e == null)
        {
            Log.w(chq.a, "already released");
        } else
        {
            try
            {
                ((chq) (obj)).b(((chq) (obj)).c);
            }
            catch (chx chx1)
            {
                throw c.a("RenderContext initialize()d during release()");
            }
            ((chq) (obj)).e.shutdown();
            obj.e = null;
        }
        A.a(this);
        super.onPause();
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void onResume()
    {
        super.onResume();
        buf buf1 = o;
        Object obj1 = getIntent();
        if (obj1 != null)
        {
            buf1.d.a(new buh(buf1, ((Intent) (obj1))));
        }
        t.a();
        obj1 = v;
        c.b(((chq) (obj1)).e, "mExecutorService", null);
        synchronized (((chq) (obj1)).d)
        {
            dfk dfk1 = ((chq) (obj1)).b;
            int i1 = ((chq) (obj1)).f;
            obj1.f = i1 + 1;
            obj1.e = dfk1.a(chq, (new StringBuilder(13)).append("gl").append(i1).toString());
            obj1.g = new ConcurrentLinkedQueue();
        }
        chq chq1;
        try
        {
            ((chq) (obj1)).b(new chu(((chq) (obj1)), ((chq) (obj1)).e, ((chq) (obj1)).g, getApplicationContext()));
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw c.a("RenderContext release()d during initialize()");
        }
        obj1 = s;
        chq1 = v;
        b.a(chq1, "renderContext", null);
        synchronized (((crx) (obj1)).b)
        {
            obj1.c = chq1;
        }
        try
        {
            v.b(new bhr(this));
            return;
        }
        catch (chx chx1)
        {
            Log.e(h, "render context not initialized", chx1);
        }
        break MISSING_BLOCK_LABEL_235;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
        exception1;
        obj;
        JVM INSTR monitorexit ;
        throw exception1;
    }

    protected void onSaveInstanceState(Bundle bundle)
    {
        bww bww1 = u;
        boolean flag;
        if (u.c.i && (getChangingConfigurations() & 0x80) == 128)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bww1.m(flag);
        super.onSaveInstanceState(bundle);
        bww1 = u;
        bundle.putParcelable(bww.a, bww1.b);
        d.b(bundle);
    }

    protected void onStart()
    {
        super.onStart();
        setVolumeControlStream(3);
    }

    public void onTrimMemory(int i1)
    {
        super.onTrimMemory(i1);
        if (v != null)
        {
            v.a();
        }
        if (i1 >= 60)
        {
            brv brv1 = d.p;
            brv1.e.execute(brv1.f);
        }
    }

}
