// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.media.MediaFormat;
import android.os.Bundle;
import android.util.Log;
import java.io.File;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

public class btq extends bmb
{

    static final String a = btq.getSimpleName();
    private static final int g[] = {
        22, 20
    };
    final bsr b = new btu(this, "add");
    final bsr e = new btu(this, "update");
    final bsm f;
    private final Context h;
    private final bqa i;
    private final bra j;
    private final brr k;
    private final bvm l;
    private final bty m;
    private final noq n;
    private boolean o;

    btq(bmb bmb1, Bundle bundle, Context context, noj noj, cag cag, bqa bqa1, bra bra1, 
            brr brr1, ckx ckx, ckx ckx1, chq chq, cuu cuu, cko cko, cjs cjs, 
            dfl dfl1, bld bld, bmm bmm, buf buf, Executor executor, ExecutorService executorservice, boolean flag, 
            noq noq1)
    {
        super(bmb1);
        new btr(this, this, new bxg[] {
            bxg.e
        });
        o = false;
        h = (Context)b.a(context, "context", null);
        i = (bqa)b.a(bqa1, "playerController", null);
        j = (bra)b.a(bra1, "progressController", null);
        k = (brr)b.a(brr1, "spinnerController", null);
        n = (noq)b.a(noq1, "durationEventLogger", null);
        l = new bvm(context, noj, ((mmr)olm.a(context, mmr)).d(), ckx, ckx1, chq, cuu, buf, dfl1, executorservice, executor, cko, cjs, flag, new bts(this));
        m = (bty)olm.a(context, nnw);
        f = (new bsp()).a(b).a(this, String.valueOf(a).concat(".addToOverrideTable"), bundle, cag);
    }

    static Context a(btq btq1)
    {
        return btq1.h;
    }

    static boolean a(btq btq1, boolean flag)
    {
        btq1.o = false;
        return false;
    }

    static bty b(btq btq1)
    {
        return btq1.m;
    }

    static void b(btq btq1, boolean flag)
    {
label0:
        {
            if (((bmb) (btq1)).d)
            {
                btq1.k.a("writing_thumbnail", false);
                btq1.j.b(a);
                if (flag)
                {
                    break label0;
                }
                Log.w(a, "failed to save thumbnail");
            }
            return;
        }
        btq1.n.b(g);
    }

    static File c(btq btq1)
    {
        return btq1.f();
    }

    static noq d(btq btq1)
    {
        return btq1.n;
    }

    static int[] d()
    {
        return g;
    }

    static boolean e(btq btq1)
    {
        return btq1.o;
    }

    private File f()
    {
        Object obj = m;
        String s = c.b.X;
        obj = ((bty) (obj)).b;
        ((buc) (obj)).a();
        obj = ((buc) (obj)).a;
        s = String.valueOf(s);
        String s1 = String.valueOf(".jpg");
        if (s1.length() != 0)
        {
            s = s.concat(s1);
        } else
        {
            s = new String(s);
        }
        return new File(((File) (obj)), s);
    }

    static void f(btq btq1)
    {
        btq1.g();
    }

    private void g()
    {
        j.a(a);
        k.a("writing_thumbnail", true);
        i.k();
        i.m();
        bvm bvm1 = l;
        cqf cqf1 = c.c.e;
        Object obj = bvb.b;
        File file = f();
        MediaFormat mediaformat = buo.a(((bvb) (obj)), bvm1.b);
        obj = cqf1.g;
        int i1;
        int j1;
        if (((cok) (obj)).a > ((cok) (obj)).b)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 != 0)
        {
            obj1 = "width";
        } else
        {
            obj1 = "height";
        }
        j1 = mediaformat.getInteger(((String) (obj1)));
        if (i1 != 0)
        {
            obj1 = "height";
        } else
        {
            obj1 = "width";
        }
        i1 = mediaformat.getInteger(((String) (obj1)));
        bvm1.a();
        synchronized (bvm1.c)
        {
            c.b(bvm1.d, "encodingThread", "already started");
            bvm1.d = bvm1.a.a(new bvq(bvm1, new bvs(cqf1, j1, i1, file)), "encoding");
            bvm1.d.start();
        }
        return;
        exception;
        obj1;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final void C_()
    {
        c();
        l.a();
        super.C_();
    }

    public final void b()
    {
        c();
        String s = String.valueOf(f().getAbsolutePath());
        if (s.length() != 0)
        {
            "saving thumbnail to ".concat(s);
        } else
        {
            new String("saving thumbnail to ");
        }
        if (c.c.m)
        {
            g();
            return;
        } else
        {
            o = true;
            return;
        }
    }

}
