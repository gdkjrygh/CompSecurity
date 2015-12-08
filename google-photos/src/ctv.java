// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicBoolean;

public class ctv
    implements cve
{

    private static final String a = ctv.getSimpleName();
    private final Context b;
    private final noj c;
    private final int d;
    private final cjs e;
    private final ckx f;
    private final ckx g;
    private final chq h;
    private final cuu i;
    private final buf j;
    private final Executor k;
    private final Executor l;
    private final dfl m;
    private final cko n;
    private cvf o;
    private k p;
    private cue q;
    private Thread r;

    public ctv(Context context, noj noj1, int i1, cjs cjs1, ckx ckx1, ckx ckx2, chq chq1, 
            cuu cuu1, buf buf1, Executor executor, Executor executor1, dfl dfl1, cko cko1)
    {
        b = (Context)b.a(context, "context", null);
        c = (noj)b.a(noj1, "movieMakerProvider", null);
        d = i1;
        e = (cjs)b.a(cjs1, "mediaExtractorFactory", null);
        f = (ckx)b.a(ckx1, "audioDecoderPool", null);
        g = (ckx)b.a(ckx2, "videoDecoderPool", null);
        h = (chq)b.a(chq1, "renderContext", null);
        i = (cuu)b.a(cuu1, "renderer", null);
        j = (buf)b.a(buf1, "stateTracker", null);
        k = (Executor)b.a(executor, "mainThreadExecutor", null);
        l = (Executor)b.a(executor1, "decoderExecutor", null);
        m = (dfl)b.a(dfl1, "playerThreadFactory", null);
        n = (cko)b.a(cko1, "bitmapFactory", null);
    }

    static buf a(ctv ctv1)
    {
        return ctv1.j;
    }

    static Thread a(ctv ctv1, Thread thread)
    {
        ctv1.r = null;
        return null;
    }

    static void a(ctv ctv1, cuc cuc, chp chp)
    {
        try
        {
            b.a(chp, "renderSink", null);
            ctv1.h.a(new ctx(ctv1, cuc, chp));
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ctv ctv1)
        {
            Log.e(a, "render context not initialized", ctv1);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ctv ctv1)
        {
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ctv ctv1)
        {
            Log.e(a, "unexpected exception from render context", ctv1);
        }
    }

    static int b(ctv ctv1)
    {
        return ctv1.d;
    }

    static cue c(ctv ctv1)
    {
        return ctv1.q;
    }

    static cvf d(ctv ctv1)
    {
        return ctv1.o;
    }

    static Executor e(ctv ctv1)
    {
        return ctv1.k;
    }

    static ckx f(ctv ctv1)
    {
        return ctv1.g;
    }

    static ckx g(ctv ctv1)
    {
        return ctv1.f;
    }

    static String g()
    {
        return a;
    }

    static Thread h(ctv ctv1)
    {
        return ctv1.r;
    }

    public final void T_()
    {
        if (q != null)
        {
            cue cue1 = q;
            synchronized (cue1.b)
            {
                if (cue1.d != cuk.b)
                {
                    cue1.a.add(cul.a(cuk.b));
                    if (cue1.d == cuk.d)
                    {
                        cue1.e.c = true;
                    }
                }
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean U_()
    {
        return q != null && (q.a() || q.b());
    }

    public final void a()
    {
        if (d())
        {
            r.interrupt();
            r = null;
            if (o != null)
            {
                o.a(0, false);
            }
        }
    }

    public final void a(long l1)
    {
        if (q != null)
        {
            q.a(l1);
        }
    }

    public final void a(cqf cqf1)
    {
        cue cue1 = q;
        Object obj = cue1.b;
        obj;
        JVM INSTR monitorenter ;
        cue1.f = (cqf)b.a(cqf1, "storyboard", null);
        cqf1 = cue1.a.iterator();
        do
        {
            if (!cqf1.hasNext())
            {
                break;
            }
            cul cul1 = (cul)cqf1.next();
            if (cul1.a == cuk.f)
            {
                cue1.a.remove(cul1);
            }
        } while (true);
        break MISSING_BLOCK_LABEL_83;
        cqf1;
        obj;
        JVM INSTR monitorexit ;
        throw cqf1;
        cue1.a.add(cul.a(cuk.f));
        obj;
        JVM INSTR monitorexit ;
    }

    public final void a(cqf cqf1, cuc cuc, chp chp)
    {
        c.b(r, "mPlayerThread", "Existing player thread still running.");
        r = m.a(new ctw(this, cuc, chp), "player");
        q = new cue(b, c, e, f, g, h, i, j, n, cqf1, false, l, k, new ctz(this, r), p);
        r.setPriority(10);
        r.start();
    }

    public final void a(cvf cvf1)
    {
        o = cvf1;
    }

    public final void a(k k1)
    {
        p = k1;
    }

    public final void b()
    {
        if (q != null)
        {
            cue cue1 = q;
            synchronized (cue1.b)
            {
                if (cue1.d != cuk.a)
                {
                    cue1.a.add(cul.a(cuk.a));
                    if (cue1.d == cuk.d)
                    {
                        cue1.e.c = true;
                    }
                }
            }
            return;
        } else
        {
            return;
        }
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean d()
    {
        return r != null;
    }

    public final void f()
    {
        if (q != null)
        {
            q.c.set(true);
        }
    }

}
