// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

public final class jkg
    implements jjl, jjm, jkf, jnb
{

    private static final List a;
    private jnd A;
    private IOException B;
    private int C;
    private long D;
    private boolean E;
    private int F;
    private int G;
    private final jkh b;
    private final jmo c;
    private final int d;
    private final SparseArray e;
    private final int f;
    private final Uri g;
    private final jmr h;
    private volatile boolean i;
    private volatile jko j;
    private volatile jjy k;
    private boolean l;
    private int m;
    private jjh n[];
    private long o;
    private boolean p[];
    private boolean q[];
    private boolean r[];
    private int s;
    private long t;
    private long u;
    private long v;
    private boolean w;
    private long x;
    private long y;
    private jna z;

    public transient jkg(Uri uri, jmr jmr, int i1, jkd ajkd[])
    {
        this(uri, jmr, new jmo(0x10000), 0xa00000, ajkd);
    }

    private transient jkg(Uri uri, jmr jmr, jmo jmo1, int i1, int j1, jkd ajkd[])
    {
label0:
        {
            super();
            g = uri;
            h = jmr;
            c = jmo1;
            d = i1;
            f = -1;
            if (ajkd != null)
            {
                uri = ajkd;
                if (ajkd.length != 0)
                {
                    break label0;
                }
            }
            jmr = new jkd[a.size()];
            i1 = 0;
            do
            {
                uri = jmr;
                if (i1 >= jmr.length)
                {
                    break;
                }
                try
                {
                    jmr[i1] = (jkd)((Class)a.get(i1)).newInstance();
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    throw new IllegalStateException("Unexpected error creating default extractor", uri);
                }
                // Misplaced declaration of an exception variable
                catch (Uri uri)
                {
                    throw new IllegalStateException("Unexpected error creating default extractor", uri);
                }
                i1++;
            } while (true);
        }
        b = new jkh(uri, this);
        e = new SparseArray();
        v = 0x8000000000000000L;
    }

    private transient jkg(Uri uri, jmr jmr, jmo jmo1, int i1, jkd ajkd[])
    {
        this(uri, jmr, jmo1, i1, -1, ajkd);
    }

    static int a(jkg jkg1)
    {
        int i1 = jkg1.F;
        jkg1.F = i1 + 1;
        return i1;
    }

    private void b(long l1)
    {
        v = l1;
        E = false;
        if (z.c)
        {
            z.a();
            return;
        } else
        {
            l();
            j();
            return;
        }
    }

    private void j()
    {
        int i1;
        boolean flag;
        flag = false;
        i1 = 0;
        if (!E && !z.c) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if (B == null) goto _L4; else goto _L3
_L3:
        if (B instanceof jkj) goto _L1; else goto _L5
_L5:
        boolean flag1;
        if (A != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        c.b(flag1);
        if (SystemClock.elapsedRealtime() - D < Math.min(((long)C - 1L) * 1000L, 5000L)) goto _L1; else goto _L6
_L6:
        B = null;
        if (l) goto _L8; else goto _L7
_L7:
        for (; i1 < e.size(); i1++)
        {
            ((jki)e.valueAt(i1)).a();
        }

        A = k();
_L9:
        G = F;
        z.a(A, this);
        return;
_L8:
        if (!j.a() && o == -1L)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < e.size(); j1++)
            {
                ((jki)e.valueAt(j1)).a();
            }

            A = k();
            x = t;
            w = true;
        }
        if (true) goto _L9; else goto _L4
_L4:
        y = 0L;
        w = false;
        if (!l)
        {
            A = k();
        } else
        {
            c.b(m());
            if (o != -1L && v >= o)
            {
                E = true;
                v = 0x8000000000000000L;
                return;
            }
            long l1 = v;
            A = new jnd(g, h, b, c, d, j.a(l1));
            v = 0x8000000000000000L;
        }
        G = F;
        z.a(A, this);
        return;
    }

    private jnd k()
    {
        return new jnd(g, h, b, c, d, 0L);
    }

    private void l()
    {
        for (int i1 = 0; i1 < e.size(); i1++)
        {
            ((jki)e.valueAt(i1)).a();
        }

        A = null;
        B = null;
        C = 0;
    }

    private boolean m()
    {
        return v != 0x8000000000000000L;
    }

    public final int a(int i1, long l1, jji jji1, jjk jjk1, boolean flag)
    {
        t = l1;
        if (q[i1])
        {
            q[i1] = false;
            return -5;
        }
        if (flag || m())
        {
            return -2;
        }
        jki jki1 = (jki)e.valueAt(i1);
        if (p[i1])
        {
            jji1.a = jki1.c();
            jji1.b = k;
            p[i1] = false;
            return -4;
        }
        if (jki1.a(jjk1))
        {
            int j1;
            if (jjk1.e < u)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j1 = jjk1.d;
            if (i1 != 0)
            {
                i1 = 0x8000000;
            } else
            {
                i1 = 0;
            }
            jjk1.d = i1 | j1;
            if (w)
            {
                y = x - jjk1.e;
                w = false;
            }
            jjk1.e = jjk1.e + y;
            return -3;
        }
        return !E ? -2 : -1;
    }

    public final jjh a(int i1)
    {
        c.b(l);
        return n[i1];
    }

    public final jjm a()
    {
        s = s + 1;
        return this;
    }

    public final void a(int i1, long l1)
    {
        c.b(l);
        boolean flag;
        if (!r[i1])
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        m = m + 1;
        r[i1] = true;
        p[i1] = true;
        q[i1] = false;
        if (m == 1)
        {
            if (!j.a())
            {
                l1 = 0L;
            }
            t = l1;
            u = l1;
            b(l1);
        }
    }

    public final void a(long l1)
    {
        boolean flag1 = false;
        c.b(l);
        long l2;
        boolean flag2;
        if (m > 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        c.b(flag2);
        if (!j.a())
        {
            l1 = 0L;
        }
        if (m())
        {
            l2 = v;
        } else
        {
            l2 = t;
        }
        t = l1;
        u = l1;
        if (l2 != l1)
        {
            boolean flag;
            int i1;
            if (!m())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            for (i1 = 0; flag && i1 < e.size(); i1++)
            {
                flag &= ((jki)e.valueAt(i1)).b(l1);
            }

            i1 = ((flag1) ? 1 : 0);
            if (!flag)
            {
                b(l1);
                i1 = ((flag1) ? 1 : 0);
            }
            while (i1 < q.length) 
            {
                q[i1] = true;
                i1++;
            }
        }
    }

    public final void a(IOException ioexception)
    {
        B = ioexception;
        int i1;
        if (F > G)
        {
            i1 = 1;
        } else
        {
            i1 = C + 1;
        }
        C = i1;
        D = SystemClock.elapsedRealtime();
        j();
    }

    public final void a(jjy jjy)
    {
        k = jjy;
    }

    public final void a(jko jko1)
    {
        j = jko1;
    }

    public final void b(int i1)
    {
label0:
        {
            c.b(l);
            c.b(r[i1]);
            m = m - 1;
            r[i1] = false;
            if (m == 0)
            {
                t = 0x8000000000000000L;
                if (!z.c)
                {
                    break label0;
                }
                z.a();
            }
            return;
        }
        l();
        c.a(0);
    }

    public final boolean b()
    {
        boolean flag;
        boolean flag2;
        flag = false;
        flag2 = false;
        if (!l) goto _L2; else goto _L1
_L1:
        boolean flag1 = true;
_L4:
        return flag1;
_L2:
        if (z == null)
        {
            z = new jna("Loader:ExtractorSampleSource");
        }
        j();
        flag1 = flag2;
        if (j == null) goto _L4; else goto _L3
_L3:
        flag1 = flag2;
        if (!i) goto _L4; else goto _L5
_L5:
        int i1 = 0;
_L8:
        if (i1 >= e.size())
        {
            break MISSING_BLOCK_LABEL_229;
        }
        if (((jki)e.valueAt(i1)).b()) goto _L7; else goto _L6
_L6:
        i1 = 0;
_L9:
        flag1 = flag2;
        if (i1 != 0)
        {
            int j1 = e.size();
            r = new boolean[j1];
            q = new boolean[j1];
            p = new boolean[j1];
            n = new jjh[j1];
            o = -1L;
            for (i1 = ((flag) ? 1 : 0); i1 < j1; i1++)
            {
                jjh jjh1 = ((jki)e.valueAt(i1)).c();
                n[i1] = jjh1;
                if (jjh1.d != -1L && jjh1.d > o)
                {
                    o = jjh1.d;
                }
            }

            break MISSING_BLOCK_LABEL_234;
        }
          goto _L4
_L7:
        i1++;
          goto _L8
        i1 = 1;
          goto _L9
        l = true;
        return true;
          goto _L8
    }

    public final boolean b(int i1, long l1)
    {
        boolean flag1 = false;
        c.b(l);
        c.b(r[i1]);
        t = l1;
        l1 = t;
        for (int j1 = 0; j1 < r.length; j1++)
        {
            if (!r[j1])
            {
                ((jki)e.valueAt(j1)).a(l1);
            }
        }

        boolean flag;
        if (E)
        {
            flag = true;
        } else
        {
            j();
            flag = flag1;
            if (!m())
            {
                flag = flag1;
                if (!((jki)e.valueAt(i1)).e())
                {
                    return true;
                }
            }
        }
        return flag;
    }

    public final int c()
    {
        return e.size();
    }

    public final jkq c(int i1)
    {
        jki jki2 = (jki)e.get(i1);
        jki jki1 = jki2;
        if (jki2 == null)
        {
            jki1 = new jki(this, c);
            e.put(i1, jki1);
        }
        return jki1;
    }

    public final void d()
    {
        if (B != null)
        {
            if (B instanceof jkj)
            {
                throw B;
            }
            int i1;
            if (f != -1)
            {
                i1 = f;
            } else
            if (j != null && !j.a())
            {
                i1 = 6;
            } else
            {
                i1 = 3;
            }
            if (C > i1)
            {
                throw B;
            }
        }
    }

    public final long e()
    {
        long l2;
        if (E)
        {
            l2 = -3L;
        } else
        {
            if (m())
            {
                return v;
            }
            int i1 = 0;
            long l1 = 0x8000000000000000L;
            for (; i1 < e.size(); i1++)
            {
                l1 = Math.max(l1, ((jki)e.valueAt(i1)).d());
            }

            l2 = l1;
            if (l1 == 0x8000000000000000L)
            {
                return t;
            }
        }
        return l2;
    }

    public final void f()
    {
        int i1;
        boolean flag;
        if (s > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c.b(flag);
        i1 = s - 1;
        s = i1;
        if (i1 == 0 && z != null)
        {
            jna jna1 = z;
            if (jna1.c)
            {
                jna1.a();
            }
            jna1.a.shutdown();
            z = null;
        }
    }

    public final void g()
    {
        i = true;
    }

    public final void h()
    {
        E = true;
    }

    public final void i()
    {
        if (m > 0)
        {
            b(v);
            return;
        } else
        {
            l();
            c.a(0);
            return;
        }
    }

    static 
    {
        a = new ArrayList();
        try
        {
            a.add(Class.forName("jmj").asSubclass(jkd));
        }
        catch (ClassNotFoundException classnotfoundexception5) { }
        try
        {
            a.add(Class.forName("jle").asSubclass(jkd));
        }
        catch (ClassNotFoundException classnotfoundexception4) { }
        try
        {
            a.add(Class.forName("jlf").asSubclass(jkd));
        }
        catch (ClassNotFoundException classnotfoundexception3) { }
        try
        {
            a.add(Class.forName("jkt").asSubclass(jkd));
        }
        catch (ClassNotFoundException classnotfoundexception2) { }
        try
        {
            a.add(Class.forName("jln").asSubclass(jkd));
        }
        catch (ClassNotFoundException classnotfoundexception1) { }
        try
        {
            a.add(Class.forName("jlz").asSubclass(jkd));
        }
        catch (ClassNotFoundException classnotfoundexception)
        {
            return;
        }
    }
}
