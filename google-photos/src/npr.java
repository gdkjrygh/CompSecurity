// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

final class npr
    implements npx
{

    private static final onh b = new onh("visual_debug_network_req", true);
    long a;
    private final List c = Collections.synchronizedList(new LinkedList());
    private final npt d;
    private final Context e;
    private int f;
    private lzq g;
    private mcj h;
    private mce i;
    private int j;
    private double k;
    private double l;
    private long m;
    private long n;
    private long o;

    npr(Context context)
    {
        j = 0;
        k = 0.0D;
        m = 0L;
        n = 0L;
        o = 0L;
        e = context;
        d = new npl(context);
    }

    static lzq a(npr npr1)
    {
        return npr1.g;
    }

    private void a(double d1, double d2)
    {
        this;
        JVM INSTR monitorenter ;
        l = l + (d1 - l) * d2;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void a(long l1)
    {
        this;
        JVM INSTR monitorenter ;
        if (k != 0.0D) goto _L2; else goto _L1
_L1:
        List list;
        myf myf1;
        list = ((mmv)olm.a(e, mmv)).a();
        myf1 = (myf)olm.a(e, myf);
        int i1 = 0;
_L7:
        if (i1 >= list.size()) goto _L4; else goto _L3
_L3:
        if (!myf1.a(npm.a, ((Integer)list.get(i1)).intValue())) goto _L6; else goto _L5
_L5:
        i1 = 1;
_L8:
        if (i1 == 0)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        d();
        ((mcp)olm.a(e, mcp)).a().a(e, g).a(new nps(this));
        l = l1;
        k = k + 1.0D;
_L9:
        e();
        this;
        JVM INSTR monitorexit ;
        return;
_L6:
        i1++;
          goto _L7
_L4:
        i1 = 0;
          goto _L8
_L2:
        if (k > 5D)
        {
            break MISSING_BLOCK_LABEL_221;
        }
        double d1 = 1.0D / k;
        a(l1, d1);
        k = k + 1.0D;
          goto _L9
        Exception exception;
        exception;
        throw exception;
        double d2 = l - (double)l1;
        if (d2 < 0.0D)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        if (d2 <= 1500000D)
        {
            break MISSING_BLOCK_LABEL_255;
        }
        a(l1, 0.5D);
          goto _L9
        if (d2 <= 400000D)
        {
            break MISSING_BLOCK_LABEL_275;
        }
        a(l1, 0.29999999999999999D);
          goto _L9
        if (d2 <= 100000D)
        {
            break MISSING_BLOCK_LABEL_295;
        }
        a(l1, 0.20000000000000001D);
          goto _L9
        a(l1, 0.10000000000000001D);
          goto _L9
    }

    private void b(npy npy1)
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = Log.isLoggable("NetworkSpeedPredictor", 3);
        if (flag) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        Locale locale = Locale.getDefault();
        npy1.a;
        JVM INSTR tableswitch 1 5: default 269
    //                   1 256
    //                   2 296
    //                   3 282
    //                   4 303
    //                   5 289;
           goto _L3 _L4 _L5 _L6 _L7 _L8
_L15:
        double d1;
        double d2;
        int i1;
        long l1;
        long l2;
        long l3;
        long l4;
        i1 = npy1.b.length;
        d1 = (double)(npy1.f - npy1.e) / 1000D;
        l1 = npy1.e;
        l2 = npy1.f;
        l3 = npy1.h;
        l4 = (long)((double)npy1.h / ((double)(npy1.f - npy1.e) / 1000D));
        d2 = l;
        j;
        JVM INSTR tableswitch -2 2: default 276
    //                   -2 263
    //                   -1 328
    //                   0 310
    //                   1 322
    //                   2 316;
           goto _L9 _L10 _L11 _L12 _L13 _L14
_L11:
        break MISSING_BLOCK_LABEL_328;
_L16:
        String s;
        String.format(locale, "Type: %s (%d), Time: %f (start: %d, end: %d), Bytes down %d, New network speed: %d,Average network speed: %f, Network classification: %s", new Object[] {
            s, Integer.valueOf(i1), Double.valueOf(d1), Long.valueOf(l1), Long.valueOf(l2), Long.valueOf(l3), Long.valueOf(l4), Double.valueOf(d2), npy1
        });
          goto _L1
        npy1;
        throw npy1;
_L4:
        s = "image download";
          goto _L15
_L10:
        npy1 = "Very low speed";
          goto _L16
_L3:
        s = "unknown";
          goto _L15
_L9:
        npy1 = "Unknown";
          goto _L16
_L6:
        s = "image upload";
          goto _L15
_L8:
        s = "remote api call";
          goto _L15
_L5:
        s = "video download";
          goto _L15
_L7:
        s = "video upload";
          goto _L15
_L12:
        npy1 = "Unknown speed";
          goto _L16
_L14:
        npy1 = "High speed";
          goto _L16
_L13:
        npy1 = "Average speed";
          goto _L16
        npy1 = "Low speed";
          goto _L16
    }

    private mci c()
    {
        if (h == null)
        {
            h = (mcj)olm.a(e, mcj);
            i = (mce)olm.a(e, mce);
        }
        d();
        return h.a();
    }

    private void d()
    {
        if (g == null)
        {
            lzs lzs1 = (lzs)olm.a(e, lzs);
            mch mch1 = (mch)olm.a(e, mch);
            mcf mcf1 = (mcf)olm.a(e, mcf);
            g = lzs1.a(e.getApplicationContext()).a(mch1).a(mcf1).a();
            g.a();
        } else
        if (!g.c())
        {
            g.a();
            return;
        }
    }

    private void e()
    {
        this;
        JVM INSTR monitorenter ;
        if (l <= 2000000D) goto _L2; else goto _L1
_L1:
        int i1 = 2;
_L4:
        if (i1 != j)
        {
            j = i1;
        }
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        if (l > 550000D)
        {
            i1 = 1;
            continue; /* Loop/switch isn't completed */
        }
        double d1 = l;
        if (d1 > 150000D)
        {
            i1 = -1;
        } else
        {
            i1 = -2;
        }
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        throw exception;
    }

    private void f()
    {
        boolean flag;
label0:
        {
            flag = false;
            synchronized (c)
            {
                if (!c.isEmpty())
                {
                    break label0;
                }
            }
            return;
        }
        npy npy1 = (npy)c.get(0);
        if (npy1 == null) goto _L2; else goto _L1
_L1:
        if (!npy1.a(7200)) goto _L2; else goto _L3
_L3:
        int i1 = 1;
_L8:
        if (c.size() >= 25)
        {
            i1 = 1;
        }
        if (i1 == 0) goto _L5; else goto _L4
_L4:
        int j1;
        n = 0L;
        o = 0L;
        m = 0L;
        j1 = c.size();
        double d1;
        npy npy2;
        for (i1 = ((flag) ? 1 : 0); i1 >= j1; i1++)
        {
            break MISSING_BLOCK_LABEL_196;
        }

        npy2 = (npy)c.get(i1);
        if (!npy2.a(7200))
        {
            o = o + npy2.g;
            n = n + npy2.h;
            m = m + (npy2.f - npy2.d);
        }
        break MISSING_BLOCK_LABEL_287;
        if (m == 0L || n == 0L)
        {
            break MISSING_BLOCK_LABEL_296;
        }
        break MISSING_BLOCK_LABEL_254;
_L6:
        l1 = (long)(d1 / ((double)l1 / 1000D));
        long l1;
        for (; l1 <= 0L; l1 = 0L)
        {
            break MISSING_BLOCK_LABEL_235;
        }

        d.a(l1);
        c.clear();
_L5:
        list;
        JVM INSTR monitorexit ;
        return;
        exception;
        list;
        JVM INSTR monitorexit ;
        throw exception;
        d1 = n;
        l1 = m;
          goto _L6
_L2:
        i1 = 0;
        if (true) goto _L8; else goto _L7
_L7:
    }

    final int a()
    {
        this;
        JVM INSTR monitorenter ;
        double d1 = l;
        int i1 = (int)d1;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

    final void a(mck mck1)
    {
        this;
        JVM INSTR monitorenter ;
        double d1 = k;
        if (d1 <= 5D) goto _L2; else goto _L1
_L1:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        long l1 = mck1.a();
        if (l1 > 0L)
        {
            break MISSING_BLOCK_LABEL_75;
        }
        if (!Log.isLoggable("NetworkSpeedPredictor", 3)) goto _L1; else goto _L3
_L3:
        (new StringBuilder(61)).append("Herrevad did not return a valid speed : ").append(l1).append(".");
          goto _L1
        mck1;
        throw mck1;
        if (Log.isLoggable("NetworkSpeedPredictor", 3))
        {
            (new StringBuilder(41)).append("Herrevad returned : ").append(l1).append(".");
        }
        k = 6D;
        l = l1;
        a = l1;
        e();
          goto _L1
    }

    public final void a(npy npy1)
    {
        Object obj;
        Object obj1;
        npy npy2;
        int i1;
        long l3;
        if ((npy1.h != 0L || npy1.g != 0L) && npy1.d != npy1.f)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        if (i1 == 0) goto _L2; else goto _L1
_L1:
        obj = c;
        obj;
        JVM INSTR monitorenter ;
        obj1 = c.listIterator();
_L7:
        if (!((ListIterator) (obj1)).hasNext()) goto _L4; else goto _L3
_L3:
        npy2 = (npy)((ListIterator) (obj1)).next();
        if (npy2.d > npy1.f) goto _L4; else goto _L5
_L5:
        if (Math.max(npy1.d, npy2.d) >= Math.min(npy1.f, npy2.f)) goto _L7; else goto _L6
_L6:
        if (npy1.d < npy2.d)
        {
            long l1 = npy2.d;
            npy2.d = npy1.d;
            long l6 = m;
            m = (l1 - npy1.d) + l6;
        }
        if (npy1.f > npy2.f)
        {
            long l2 = npy2.f;
            npy2.f = npy1.f;
            long l7 = m;
            m = (npy1.f - l2) + l7;
        }
        npy2.g = npy2.g + npy1.g;
        npy2.h = npy2.h + npy1.h;
        i1 = 1;
          goto _L8
_L13:
        do
        {
            if (!((ListIterator) (obj1)).hasPrevious())
            {
                break;
            }
            if (((npy)((ListIterator) (obj1)).previous()).d >= npy1.d)
            {
                continue;
            }
            ((ListIterator) (obj1)).next();
            break;
        } while (true);
        ((ListIterator) (obj1)).add(npy1);
        m = m + (npy1.f - npy1.d);
_L14:
        obj;
        JVM INSTR monitorexit ;
        o = o + npy1.g;
        n = n + npy1.h;
        f();
_L2:
        obj = ((mmv)olm.a(e, mmv)).a();
        obj1 = (myf)olm.a(e, myf);
        i1 = 0;
_L11:
        if (i1 >= ((List) (obj)).size())
        {
            break MISSING_BLOCK_LABEL_752;
        }
        l3 = ((myf) (obj1)).b(npm.b, ((Integer)((List) (obj)).get(i1)).intValue()).longValue();
        if (l3 == -1L) goto _L10; else goto _L9
_L9:
        i1 = (int)l3;
_L12:
        if (i1 != -1)
        {
            long l8 = npy1.h;
            long l4 = npy1.g;
            if (l8 > 10000L)
            {
                f = f + 1;
                if (f >= i1)
                {
                    obj = c();
                    ((mci) (obj)).a((int)(npy1.f - npy1.e) * 1000).b(l8);
                    if (l4 < 1000L)
                    {
                        long l9 = npy1.e;
                        long l12 = npy1.d;
                        long l14 = npy1.k * 1000L;
                        ((mci) (obj)).a((int)((l9 - l12) * 1000L - l14)).a("serverTime", String.valueOf(l14));
                    }
                    i.a().a(g, ((mci) (obj)));
                    f = 0;
                }
            }
            if (l4 > 10000L)
            {
                obj = c();
                long l10 = (int)(npy1.f - npy1.e) * 1000;
                long l13 = npy1.k * 1000L;
                ((mci) (obj)).c(l4).a(l10 - l13).a("serverTime", String.valueOf(l13));
                i.a().a(g, ((mci) (obj)));
            }
        }
        if (npy1.h > 15000L)
        {
            long l5 = npy1.e;
            long l11 = npy1.f;
            if (l5 != l11)
            {
                a((long)((double)npy1.h / ((double)(l11 - l5) / 1000D)));
                b(npy1);
            }
        }
        return;
        npy1;
        obj;
        JVM INSTR monitorexit ;
        throw npy1;
_L10:
        i1++;
          goto _L11
        i1 = -1;
          goto _L12
_L4:
        i1 = 0;
_L8:
        if (i1 != 0) goto _L14; else goto _L13
    }

    final int b()
    {
        this;
        JVM INSTR monitorenter ;
        int i1 = j;
        this;
        JVM INSTR monitorexit ;
        return i1;
        Exception exception;
        exception;
        throw exception;
    }

}
