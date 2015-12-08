// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import java.util.concurrent.PriorityBlockingQueue;

public final class ovo
    implements opl, opn, opp, opr, ops, opv, ovn
{

    public Context a;
    private long b;
    private double c;
    private osy d;
    private osq e;
    private ouz f;
    private ote g;
    private int h;
    private int i;
    private int j;
    private int k;
    private PriorityBlockingQueue l;
    private ovf m;
    private final ovp n;
    private final ovp o;
    private final ovp p;
    private osu q;
    private boolean r;
    private boolean s;

    public ovo()
    {
        b = 0x3200000L;
        c = 0.5D;
        d = osy.a;
        e = osq.a;
        f = ouz.a;
        h = -1;
        i = -1;
        j = -1;
        k = -1;
        n = new ovp();
        o = new ovp();
        p = new ovp();
        s = true;
        l = new PriorityBlockingQueue(10);
    }

    public ovo(opd opd1)
    {
        this();
        opd1.a(this);
    }

    private void a(ovd ovd)
    {
        l.add(ovd);
    }

    private static int[] a(ote ote1, int i1)
    {
        int ai[];
        int k1;
        long l2;
        boolean flag;
        if (i1 > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag);
        l2 = ote1.f / (long)i1;
        ai = new int[i1];
        k1 = 0;
        while (k1 < i1) 
        {
            long l3 = l2 * (long)k1;
            long l5 = l3 + l2;
            long l4 = l3 + (long)(((float)k1 / (float)Math.max(1, i1 - 1)) * (float)l2);
            int j1;
            int l1;
            int i2;
            if (l3 <= l5)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            p.a(flag);
            i2 = ote1.c(l3);
            l1 = ote1.d(l5 - 1L);
            if (i2 == -1 || l1 == -1 || i2 > l1)
            {
                j1 = -1;
            } else
            {
                long l6 = ote1.b(i2);
                l6 = Math.max(Math.min(l4, ote1.b(l1)), l6);
                j1 = ote1.c(l6);
                boolean flag1;
                if (j1 != -1 && j1 <= l1)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                p.b(flag1);
                l1 = ote1.d(l6);
                if (l1 != -1 && l1 >= i2)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                p.b(flag1);
                if (ote1.g[j1] - l4 > l4 - ote1.g[l1])
                {
                    j1 = l1;
                }
            }
            if (j1 != -1)
            {
                ai[k1] = j1;
            } else
            {
                ai[k1] = ote1.a(l3);
            }
            k1++;
        }
        return ai;
    }

    private void j()
    {
        this;
        JVM INSTR monitorenter ;
        if (!r || !s || g == null) goto _L2; else goto _L1
_L1:
        osu osu = q;
        if (osu != null) goto _L3; else goto _L2
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
_L3:
        float f1;
        int i1;
        int j1;
        boolean flag;
        if (a != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        i1 = a.getResources().getDimensionPixelSize(b.Iz);
        f1 = g.a();
        if (f1 <= 1.0F)
        {
            i1 = (int)((float)i1 * f1);
        }
        j1 = Math.round((float)i1 / f1);
        if (i1 == h && j1 == i)
        {
            break MISSING_BLOCK_LABEL_567;
        }
        h = i1;
        i = j1;
        Object obj;
        Exception exception;
        ove ove1;
        int k1;
        long l1;
        long l2;
        for (i1 = 1; i1 == 0; i1 = 0)
        {
            break MISSING_BLOCK_LABEL_321;
        }

        if (h > 0 && i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        l2 = h * i << 2;
        obj = Runtime.getRuntime();
        l1 = (((Runtime) (obj)).maxMemory() - ((Runtime) (obj)).totalMemory()) + ((Runtime) (obj)).freeMemory();
        obj = (ovj)p.a;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_208;
        }
        l1 = (long)((ovj) (obj)).b() + l1;
        i1 = (int)(Math.max(0L, Math.min((long)((double)l1 * c), l1 - b)) / l2);
        obj = a.getResources().getDisplayMetrics();
        k1 = Math.max(((DisplayMetrics) (obj)).widthPixels, ((DisplayMetrics) (obj)).heightPixels);
        j = (int)Math.max(1.0D, Math.ceil(k1 / h));
        k = Math.max(0, Math.min((int)((float)k1 / a.getResources().getDisplayMetrics().density), i1 - j));
        m();
        obj = (ovj)p.a(k());
        if (l != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if ((ove)n.a == null && j > 0)
        {
            ove1 = new ove(a(g, j), ((ovj) (obj)), "Overview", 100);
            a(ove1);
            n.b(ove1);
        }
        if ((ove)o.a == null && k > 0)
        {
            obj = new ove(a(g, k), ouq.b, ((ovj) (obj)), "Seek Preview", 0);
            a(((ovd) (obj)));
            o.b(((ovr) (obj)));
        }
        if (m != null) goto _L2; else goto _L4
_L4:
        if (m == null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        m = new ovf(a, g, h, i, l, d, e, f, q);
        m.start();
          goto _L2
        exception;
        throw exception;
    }

    private ovj k()
    {
        ovj ovj1;
        ovj ovj2;
        boolean flag;
        if (g != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        ovj2 = (ovj)p.a;
        ovj1 = ovj2;
        if (ovj2 == null)
        {
            ovj1 = new ovj(g);
            p.b(ovj1);
        }
        p.b(g.equals(ovj1.a));
        return ovj1;
    }

    private void l()
    {
        this;
        JVM INSTR monitorenter ;
        if (m == null)
        {
            break MISSING_BLOCK_LABEL_34;
        }
        boolean flag;
        if (m != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        m.a();
        m = null;
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void m()
    {
        this;
        JVM INSTR monitorenter ;
        ovr ovr1;
        l();
        ovr1 = n.b(null);
        if (ovr1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        ovr1.a();
        ovr1 = o.b(null);
        if (ovr1 == null)
        {
            break MISSING_BLOCK_LABEL_44;
        }
        ovr1.a();
        l.clear();
        l = new PriorityBlockingQueue(10);
        ovr1 = p.b(null);
        if (ovr1 == null)
        {
            break MISSING_BLOCK_LABEL_83;
        }
        ovr1.a();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public final ove a(long l1, long l2, String s1)
    {
        boolean flag1 = true;
        int i1 = 0;
        int j1;
        boolean flag;
        if (g != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.b(flag);
        if (l1 <= l2)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag);
        j1 = g.a(l1);
        if (j1 == -1)
        {
            throw new IllegalArgumentException();
        }
        int k1 = g.a(l2);
        if (k1 == -1)
        {
            throw new IllegalArgumentException();
        }
        int ai[];
        for (ai = new int[(k1 - j1) + 1]; i1 < ai.length; i1++)
        {
            ai[i1] = j1 + i1;
        }

        s1 = new ove(ai, k(), s1, 10);
        a(((ovd) (s1)));
        return s1;
    }

    public final void a(long l1, long l2)
    {
        ove ove1 = (ove)o.a;
        if (ove1 != null)
        {
            ove1.c.a(l1, l2);
        }
    }

    public final void a(Bundle bundle)
    {
        if (bundle != null)
        {
            g = (ote)bundle.getParcelable("video_meta_data");
            s = bundle.getBoolean("extractor_is_enabled");
        }
    }

    public final void a(osu osu)
    {
        if (q != osu)
        {
            l();
            q = osu;
            j();
        }
    }

    public final void a(ote ote1)
    {
        if (c.c(g, ote1))
        {
            return;
        } else
        {
            m();
            g = ote1;
            j();
            return;
        }
    }

    public final void al_()
    {
        r = true;
        j();
    }

    public final void am_()
    {
        l();
        r = false;
    }

    public final void c()
    {
        m();
    }

    public final ote d()
    {
        return g;
    }

    public final ovr e()
    {
        return p;
    }

    public final void e(Bundle bundle)
    {
        bundle.putParcelable("video_meta_data", g);
        bundle.putBoolean("extractor_is_enabled", s);
    }

    public final ovr f()
    {
        this;
        JVM INSTR monitorenter ;
        ovp ovp1 = n;
        this;
        JVM INSTR monitorexit ;
        return ovp1;
        Exception exception;
        exception;
        throw exception;
    }

    public final ovr g()
    {
        this;
        JVM INSTR monitorenter ;
        ovp ovp1 = o;
        this;
        JVM INSTR monitorexit ;
        return ovp1;
        Exception exception;
        exception;
        throw exception;
    }

    public final void h()
    {
        s = true;
        j();
    }

    public final void i()
    {
        s = false;
        l();
    }
}
