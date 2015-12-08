// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

public class bzv extends bmb
{

    private static final String a = bzv.getSimpleName();
    private static final int b[] = {
        21, 26
    };
    private final brd e = new bzw(this);
    private final mti f = new bzx(this);
    private final Context g;
    private final bra h;
    private final noj i;
    private final bzo j;
    private final cag k;
    private final bpz l;
    private final bnl m;
    private final bvd n;
    private final Executor o;
    private final noq p;
    private final int q;
    private boolean r;
    private Set s;

    public bzv(bmb bmb1, Context context, bra bra1, noj noj1, ckx ckx, ckx ckx1, chq chq, 
            cuu cuu, cko cko, cjs cjs, dfl dfl1, bld bld, bmm bmm, buf buf, 
            bzo bzo1, cag cag1, Executor executor, Executor executor1, bpz bpz1, bnl bnl1, boolean flag)
    {
        super(bmb1);
        new bzy(this, this, new bxg[] {
            bxg.c
        });
        g = (Context)b.a(context, "context", null);
        h = (bra)b.a(bra1, "progressController", null);
        i = (noj)b.a(noj1, "movieMakerProvider", null);
        j = (bzo)b.a(bzo1, "exportedVideoTracker", null);
        k = (cag)b.a(cag1, "backgroundTaskManager", null);
        l = (bpz)b.a(bpz1, "onInvalidUriDetectedListener", null);
        m = (bnl)b.a(bnl1, "gservicesSettings", null);
        o = (Executor)b.a(executor, "mainThreadExecutor", null);
        p = (noq)olm.a(context, noq);
        q = ((mmr)olm.a(context, mmr)).d();
        bmb1 = e;
        bra1.f.add(bmb1);
        n = new bvd(context, noj1, q, ckx, ckx1, chq, cuu, buf, bld, bmm, dfl1, executor1, executor, cko, cjs, new cac(this), flag);
        s = Collections.synchronizedSet(new HashSet());
    }

    static bww A(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww B(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww C(bzv bzv1)
    {
        return bzv1.c;
    }

    static bpz D(bzv bzv1)
    {
        return bzv1.l;
    }

    static bww E(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww a(bzv bzv1)
    {
        return bzv1.c;
    }

    private void a(Uri uri)
    {
        if (!i.a())
        {
            c.b(i.a(uri, q));
        }
        o.execute(new bzz(this));
    }

    static void a(bzv bzv1, Uri uri)
    {
        bzv1.a(uri);
    }

    static void a(bzv bzv1, Uri uri, long l1)
    {
        b.b(l1, "timestampMs");
        ContentValues contentvalues = new ContentValues(1);
        contentvalues.put("datetaken", Long.valueOf(l1));
        bzv1.g.getContentResolver().update(uri, contentvalues, null, null);
    }

    static void a(bzv bzv1, String s1)
    {
        bzv1.a(s1);
    }

    static void a(bzv bzv1, mue mue1)
    {
        if (mue1.c())
        {
            bzv1.j();
            return;
        }
        String s1 = mue1.a().getString("path");
        if (s1 == null)
        {
            bzv1.j();
            return;
        }
        mue1 = new File(s1);
        if (!mue1.exists() || mue1.length() == 0L)
        {
            s1 = a;
            mue1 = String.valueOf(mue1.getPath());
            if (mue1.length() != 0)
            {
                mue1 = "finishedGetPreviousExport() - entry doesn't exist or is empty: ".concat(mue1);
            } else
            {
                mue1 = new String("finishedGetPreviousExport() - entry doesn't exist or is empty: ");
            }
            Log.w(s1, mue1);
            bzv1.j();
            return;
        } else
        {
            bzv1.c.b(s1);
            bzv1.a(s1);
            return;
        }
    }

    private void a(String s1)
    {
        if (c.b.G.h)
        {
            Context context = g;
            String s2 = buo.b();
            cab cab1 = new cab(this);
            MediaScannerConnection.scanFile(context, new String[] {
                s1
            }, new String[] {
                s2
            }, cab1);
            return;
        } else
        {
            a(Uri.fromFile(new File(s1)));
            return;
        }
    }

    static boolean a(bzv bzv1, boolean flag)
    {
        bzv1.r = false;
        return false;
    }

    static bww b(bzv bzv1)
    {
        return bzv1.c;
    }

    static boolean c(bzv bzv1)
    {
        return bzv1.r;
    }

    static Set d(bzv bzv1)
    {
        return bzv1.s;
    }

    static bww e(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww f(bzv bzv1)
    {
        return bzv1.c;
    }

    static bra g(bzv bzv1)
    {
        return bzv1.h;
    }

    static bww h(bzv bzv1)
    {
        return bzv1.c;
    }

    static String h()
    {
        return a;
    }

    static noq i(bzv bzv1)
    {
        return bzv1.p;
    }

    static int[] i()
    {
        return b;
    }

    static bww j(bzv bzv1)
    {
        return bzv1.c;
    }

    private void j()
    {
        String s1 = c.b.G.g.a(g);
        Object obj = String.valueOf(s1);
        if (((String) (obj)).length() != 0)
        {
            "saving to video: ".concat(((String) (obj)));
        } else
        {
            new String("saving to video: ");
        }
        c.b(s1);
        obj = c;
        s1 = String.format("%s.tmp", new Object[] {
            s1
        });
        c.a(((bww) (obj)).b.G.e, "mPersistentState.isVideoRendering()");
        ((bww) (obj)).b.N = s1;
        k();
    }

    static bww k(bzv bzv1)
    {
        return bzv1.c;
    }

    private void k()
    {
        Object obj2;
        int i1;
        i1 = 0;
        Object obj = null;
        c.b(null);
        h.a(a);
        obj2 = c.u();
        bvd bvd1 = n;
        cqf cqf1 = c.c.e;
        Object obj1 = c;
        c.a(((bww) (obj1)).b.G.e, "mPersistentState.isVideoRendering()");
        c.a(((bww) (obj1)).b.F, "mPersistentState.savingSize", null);
        obj1 = ((bww) (obj1)).b.F;
        File file = new File(c.t());
        String s1;
        cok cok1;
        boolean flag;
        if (obj2 != null)
        {
            obj = new File(((String) (obj2)));
        }
        s1 = lvd.a(m.a, "moviemaker:override_audio_encoder_name", "");
        flag = lvd.a(m.a, "moviemaker:override_aac_low_complexity", false);
        obj2 = bvd1.b;
        obj2;
        JVM INSTR monitorenter ;
        c.b(bvd1.c, "mEncodingThread", "already started");
        cok1 = cqf1.g;
        if (cok1.a <= cok1.b)
        {
            i1 = 90;
        }
        obj = new bvk(cqf1, ((bvb) (obj1)), i1, file, null, ((File) (obj)), s1, flag);
        bvd1.c = bvd1.a.a(new bvf(bvd1, ((bvk) (obj))), "encoding");
        bvd1.c.start();
        return;
        Exception exception;
        exception;
        obj2;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static bww l(bzv bzv1)
    {
        return bzv1.c;
    }

    private void l()
    {
        (new File((String)c.a(c.s(), "state.getVideoOutputFileName()", null))).delete();
        (new File((String)c.a(c.t(), "state.getTemporarySavingOutputFileName()", null))).delete();
        String s1 = c.u();
        if (s1 != null)
        {
            (new File(s1)).delete();
        }
    }

    static bww m(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww n(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww o(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww p(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww q(bzv bzv1)
    {
        return bzv1.c;
    }

    static Context r(bzv bzv1)
    {
        return bzv1.g;
    }

    static cag s(bzv bzv1)
    {
        return bzv1.k;
    }

    static bww t(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww u(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww v(bzv bzv1)
    {
        return bzv1.c;
    }

    static bzo w(bzv bzv1)
    {
        return bzv1.j;
    }

    static bww x(bzv bzv1)
    {
        return bzv1.c;
    }

    static bww y(bzv bzv1)
    {
        return bzv1.c;
    }

    static void z(bzv bzv1)
    {
        bzv1.l();
    }

    public final void C_()
    {
        k.b(f);
        if (c.p() && !c.r() && !c.q())
        {
            c.i(true);
            p.a(b);
        }
        d();
        super.C_();
    }

    public final void a(caa caa)
    {
        s.add(caa);
    }

    public final void a(caf caf1)
    {
        int i1 = 0;
        c();
        bww bww1;
        cqf cqf1;
        List list;
        long l1;
        boolean flag;
        if (c.b.F != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.a(flag, "saving size needs to be set before #start");
        c.a(caf1.e, "mode for #start can not be NONE");
        c.a(caf1);
        bww1 = c;
        cqf1 = c.c.e;
        list = Collections.unmodifiableList(cqf1.b);
        long l2;
        for (l1 = System.currentTimeMillis() * 1000L; i1 < list.size(); l1 = l2)
        {
            Object obj = (cnq)list.get(i1);
            l2 = l1;
            if (((cnq) (obj)).d != cnt.d)
            {
                obj = (cnz)Collections.unmodifiableMap(cqf1.a).get(((cnq) (obj)).e);
                l2 = l1;
                if (obj != null)
                {
                    long l3 = ((cnz) (obj)).b().b;
                    l2 = l1;
                    if (l3 != -1L)
                    {
                        l2 = l1;
                        if (l3 > 0L)
                        {
                            l2 = l1;
                            if (l3 < l1)
                            {
                                l2 = l3;
                            }
                        }
                    }
                }
            }
            i1++;
        }

        l1 /= 1000L;
        c.a(bww1.b.G.e, "mPersistentState.isVideoRendering()");
        bww1.b.K = b.b(l1, "timestampMs");
        if (caf1.f)
        {
            j();
            return;
        } else
        {
            caf1 = j;
            Context context = g;
            k.a(new bzt(context, caf1, c.b.X, c.b.p, c.b.ae));
            return;
        }
    }

    public final void b()
    {
        if (c.p())
        {
            if (c.s() != null)
            {
                (new File(c.s())).delete();
            }
            if (c.u() != null)
            {
                (new File(c.u())).delete();
            }
            if (c.t() != null)
            {
                (new File(c.t())).delete();
            }
            c.a(caf.a);
        }
    }

    public final void d()
    {
        c();
        bvd bvd1 = n;
        synchronized (bvd1.b)
        {
            if (bvd1.c != null)
            {
                bvd1.c.interrupt();
                bvd1.c = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void e()
    {
        super.e();
        if (c.p() && (c.r() || c.q()))
        {
            c.a(caf.a);
        }
        k.a(f);
    }

    public final void f()
    {
        Object obj;
        if (!c.c.d)
        {
            r = true;
            return;
        }
        obj = c.b.G;
        if (obj != caf.b) goto _L2; else goto _L1
_L1:
        p.a(21, 1);
_L4:
        obj = c.t();
        if (obj == null)
        {
            Log.w(a, "nothing to resume; restarting save");
            l();
            a(c.b.G);
            return;
        }
        break; /* Loop/switch isn't completed */
_L2:
        if (obj == caf.c)
        {
            p.a(26, 1);
        }
        if (true) goto _L4; else goto _L3
_L3:
        obj = new File(((String) (obj)));
        if (!((File) (obj)).exists())
        {
            Log.w(a, "resume file does not exist; restarting save");
            l();
            a(c.b.G);
            return;
        }
        if (c.u() != null)
        {
            (new File(c.u())).delete();
        }
        Object obj1 = String.format("%s.resume.tmp", new Object[] {
            c.s()
        });
        bww bww1 = c;
        c.a(bww1.b.G.e, "mPersistentState.isVideoRendering()");
        bww1.b.O = ((String) (obj1));
        obj1 = new File(((String) (obj1)));
        ((File) (obj1)).delete();
        if (!((File) (obj)).renameTo(((File) (obj1))))
        {
            Log.w(a, "error renaming temporary output file; restarting save");
            l();
            a(c.b.G);
            return;
        } else
        {
            k();
            return;
        }
    }

    final void g()
    {
        l();
        d();
        p.a(b);
        c.a(caf.a);
    }

}
