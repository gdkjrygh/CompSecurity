// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

public class bvm
{

    private static final String e = bvm.getSimpleName();
    public final dfl a;
    public final boolean b;
    public final Object c = new Object();
    public Thread d;
    private final Object f = new Object();
    private volatile boolean g;
    private volatile boolean h;
    private final Context i;
    private final noj j;
    private final int k;
    private final ckx l;
    private final ckx m;
    private final chq n;
    private final cuu o;
    private final buf p;
    private final Executor q;
    private final Executor r;
    private final cko s;
    private final cjs t;
    private final bvp u;

    public bvm(Context context, noj noj1, int i1, ckx ckx1, ckx ckx2, chq chq1, cuu cuu1, 
            buf buf1, dfl dfl1, Executor executor, Executor executor1, cko cko1, cjs cjs1, boolean flag, 
            bvp bvp1)
    {
        g = false;
        h = false;
        i = (Context)b.a(context, "context", null);
        j = (noj)b.a(noj1, "movieMakerProvider", null);
        k = i1;
        l = (ckx)b.a(ckx1, "audioDecoderPool", null);
        m = (ckx)b.a(ckx2, "videoDecoderPool", null);
        n = (chq)b.a(chq1, "renderContext", null);
        o = (cuu)b.a(cuu1, "renderer", null);
        p = (buf)b.a(buf1, "stateTracker", null);
        a = (dfl)b.a(dfl1, "threadFactory", null);
        q = (Executor)b.a(executor, "decoderExecutor", null);
        r = (Executor)b.a(executor1, "mainThreadExecutor", null);
        s = (cko)b.a(cko1, "bitmapFactory", null);
        t = (cjs)b.a(cjs1, "mediaExtractorFactory", null);
        b = flag;
        u = (bvp)b.a(bvp1, "callbacks", null);
    }

    static FileOutputStream a(bvm bvm1, File file)
    {
        return a(file);
    }

    private static FileOutputStream a(File file)
    {
        file.getParentFile().mkdirs();
        try
        {
            String s1 = String.valueOf(file.getAbsolutePath());
            if (s1.length() != 0)
            {
                "Saving movie into ".concat(s1);
            } else
            {
                new String("Saving movie into ");
            }
            return new FileOutputStream(file);
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            throw new IllegalStateException("Failed to open movie output file.", file);
        }
    }

    static Object a(bvm bvm1)
    {
        return bvm1.f;
    }

    static void a(bvm bvm1, bvs bvs1)
    {
        Object obj1 = null;
        Object obj;
        bvm1.o.a();
        bvm1.m.a();
        obj = bvm1.n.a(bvs1.b, bvs1.c);
        bvm1.o.b();
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
          goto _L1
        obj1;
        bvs1 = ((bvs) (obj));
        obj = obj1;
_L6:
        Log.e(e, "Failed to create thumbnail", ((Throwable) (obj)));
        dee.a(bvs1);
        dee.a(bvm1.m);
        dee.a(bvm1.o);
        cqf cqf1;
        bum bum1;
        long l1;
        try
        {
            bvm1.n.b();
        }
        // Misplaced declaration of an exception variable
        catch (bvs bvs1)
        {
            Log.w(e, "exception while disabling recording", bvs1);
        }
        bvm1.o.b();
        return;
_L1:
        obj1 = bvm1.o;
        cqf1 = bvs1.a;
        l1 = bvs1.a.m();
        bvs1 = bvs1.d;
        bum1 = new bum();
        bum1.a = l1;
        (new cue(bvm1.i, bvm1.j, bvm1.t, bvm1.l, bvm1.m, bvm1.n, ((cuu) (obj1)), bvm1.p, bvm1.s, cqf1, true, bvm1.q, bvm1.r, new bvo(bvm1, bvs1), null)).a(cuc.c(l1), bum1, ((chp) (obj)), bvm1.k);
        if (Thread.interrupted())
        {
            throw new InterruptedException();
        }
          goto _L2
        bvs1;
_L4:
        dee.a(((ded) (obj)));
        dee.a(bvm1.m);
        dee.a(bvm1.o);
        try
        {
            bvm1.n.b();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            Log.w(e, "exception while disabling recording", ((Throwable) (obj)));
        }
        bvm1.o.b();
        throw bvs1;
_L2:
        dee.a(((ded) (obj)));
        dee.a(bvm1.m);
        dee.a(bvm1.o);
        try
        {
            bvm1.n.b();
        }
        // Misplaced declaration of an exception variable
        catch (bvs bvs1)
        {
            Log.w(e, "exception while disabling recording", bvs1);
        }
        bvm1.o.b();
        return;
        bvs1;
        obj = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        obj = bvs1;
        bvs1 = ((bvs) (obj1));
        if (true) goto _L4; else goto _L3
_L3:
        obj;
        bvs1 = ((bvs) (obj1));
        if (true) goto _L6; else goto _L5
_L5:
    }

    static boolean a(bvm bvm1, boolean flag)
    {
        bvm1.g = flag;
        return flag;
    }

    static chq b(bvm bvm1)
    {
        return bvm1.n;
    }

    static String b()
    {
        return e;
    }

    static boolean b(bvm bvm1, boolean flag)
    {
        bvm1.h = flag;
        return flag;
    }

    static void c(bvm bvm1, boolean flag)
    {
        synchronized (bvm1.c)
        {
            if (bvm1.d == Thread.currentThread())
            {
                bvm1.d = null;
            }
            bvm1.r.execute(new bvn(bvm1, flag));
        }
        return;
        bvm1;
        obj;
        JVM INSTR monitorexit ;
        throw bvm1;
    }

    static boolean c(bvm bvm1)
    {
        return bvm1.g;
    }

    static boolean d(bvm bvm1)
    {
        return bvm1.h;
    }

    static bvp e(bvm bvm1)
    {
        return bvm1.u;
    }

    public final void a()
    {
        synchronized (c)
        {
            if (d != null)
            {
                d.interrupt();
                d = null;
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

}
