// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer.upstream.Loader;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;

public final class azz
    implements azl, azm, bdj
{

    final int a;
    final baa b;
    private final ayx c;
    private final bab d;
    private final azy e;
    private final LinkedList f;
    private final List g;
    private final bbw h;
    private final int i;
    private final Handler j;
    private int k;
    private long l;
    private long m;
    private long n;
    private long o;
    private boolean p;
    private Loader q;
    private boolean r;
    private IOException s;
    private int t;
    private long u;
    private azi v;
    private bad w;

    public azz(bab bab1, ayx ayx1, int i1, Handler handler, baa baa, int j1)
    {
        this(bab1, ayx1, i1, handler, baa, j1, (byte)0);
    }

    private azz(bab bab1, ayx ayx1, int i1, Handler handler, baa baa, int j1, byte byte0)
    {
        d = bab1;
        c = ayx1;
        i = i1;
        j = handler;
        b = baa;
        a = j1;
        e = new azy();
        f = new LinkedList();
        g = Collections.unmodifiableList(f);
        h = new bbw(ayx1.b());
        k = 0;
        n = -1L;
    }

    private boolean a(int i1)
    {
        int j1 = 0;
        if (f.size() <= i1)
        {
            return false;
        }
        f.getLast();
        Object obj;
        for (obj = null; f.size() > i1; obj = (azu)f.removeLast()) { }
        bbw bbw1 = h;
        i1 = ((azu) (obj)).b;
        obj = bbw1.a;
        bcb bcb1 = ((bca) (obj)).c;
        i1 = bcb1.a() - i1;
        int k1;
        long l1;
        boolean flag;
        if (i1 >= 0 && i1 <= bcb1.d)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.a(flag);
        if (i1 == 0)
        {
            if (bcb1.e == 0)
            {
                l1 = 0L;
            } else
            {
                if (bcb1.g == 0)
                {
                    i1 = bcb1.a;
                } else
                {
                    i1 = bcb1.g;
                }
                i1--;
                l1 = bcb1.b[i1] + (long)bcb1.c[i1];
            }
        } else
        {
            bcb1.d = bcb1.d - i1;
            bcb1.g = ((bcb1.g + bcb1.a) - i1) % bcb1.a;
            l1 = bcb1.b[bcb1.g];
        }
        obj.h = l1;
        k1 = (int)(((bca) (obj)).h - ((bca) (obj)).g);
        i1 = k1 / 0x10000;
        k1 %= 0x10000;
        i1 = ((bca) (obj)).d.size() - i1 - 1;
        if (k1 == 0)
        {
            i1++;
        }
        for (; j1 < i1; j1++)
        {
            ((bca) (obj)).a.a((bcz)((bca) (obj)).d.removeLast());
        }

        obj.i = (bcz)((bca) (obj)).d.peekLast();
        if (k1 == 0)
        {
            i1 = 0x10000;
        } else
        {
            i1 = k1;
        }
        obj.j = i1;
        if (bbw1.a.a(bbw1.b))
        {
            l1 = bbw1.b.e;
        } else
        {
            l1 = 0x8000000000000000L;
        }
        bbw1.d = l1;
        if (j != null && b != null)
        {
            j.post(new Runnable() {

                public final void run()
                {
                }

            });
        }
        return true;
    }

    private void d(long l1)
    {
        n = l1;
        r = false;
        if (q.b)
        {
            q.a();
            return;
        } else
        {
            h.a();
            f.clear();
            j();
            l();
            return;
        }
    }

    private void j()
    {
        e.b = null;
        k();
    }

    private void k()
    {
        s = null;
        t = 0;
    }

    private void l()
    {
        azv azv1;
        long l1;
        boolean flag1;
        boolean flag2;
        long l2 = SystemClock.elapsedRealtime();
        l1 = m();
        boolean flag;
        if (s != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (q.b || flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if (flag1 || (e.b != null || l1 == -1L) && l2 - o <= 2000L) goto _L2; else goto _L1
_L1:
        o = l2;
        e.a = g.size();
        d.a(g, n, l, e);
        flag2 = a(e.a);
        if (e.b != null) goto _L4; else goto _L3
_L3:
        l1 = -1L;
_L2:
        flag1 = c.a(this, l, l1, flag1);
        if (!flag) goto _L6; else goto _L5
_L5:
        if (l2 - u < Math.min(((long)t - 1L) * 1000L, 5000L)) goto _L8; else goto _L7
_L7:
        s = null;
        azv1 = e.b;
        if (azv1 instanceof azu) goto _L10; else goto _L9
_L9:
        e.a = g.size();
        d.a(g, n, l, e);
        a(e.a);
        if (e.b != azv1) goto _L12; else goto _L11
_L11:
        q.a(azv1, this);
_L8:
        return;
_L4:
        if (flag2)
        {
            l1 = m();
        }
        continue; /* Loop/switch isn't completed */
_L12:
        azv1.c();
        r();
        n();
        return;
_L10:
        if (azv1 == f.getFirst())
        {
            q.a(azv1, this);
            return;
        }
        azu azu1 = (azu)f.removeLast();
        if (azv1 == azu1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bds.b(flag1);
        e.a = g.size();
        d.a(g, n, l, e);
        f.add(azu1);
        if (e.b == azv1)
        {
            q.a(azv1, this);
            return;
        } else
        {
            azv1.c();
            r();
            a(e.a);
            k();
            n();
            return;
        }
_L6:
        if (q.b || !flag1) goto _L8; else goto _L13
_L13:
        n();
        return;
        if (true) goto _L2; else goto _L14
_L14:
    }

    private long m()
    {
        if (o())
        {
            return n;
        }
        azu azu1 = (azu)f.getLast();
        if (azu1.i)
        {
            return -1L;
        } else
        {
            return azu1.g;
        }
    }

    private void n()
    {
        azv azv1 = e.b;
        if (azv1 == null)
        {
            return;
        }
        SystemClock.elapsedRealtime();
        if (azv1 instanceof azu)
        {
            azu azu1 = (azu)azv1;
            bbw bbw1 = h;
            azu1.a = bbw1;
            azu1.b = bbw1.a.c.a();
            f.add(azu1);
            if (o())
            {
                n = -1L;
            }
            p();
        } else
        {
            p();
        }
        q.a(azv1, this);
    }

    private boolean o()
    {
        return n != -1L;
    }

    private void p()
    {
        if (j != null && b != null)
        {
            j.post(new Runnable() {

                public final void run()
                {
                }

            });
        }
    }

    private void q()
    {
        if (j != null && b != null)
        {
            j.post(new Runnable() {

                public final void run()
                {
                }

            });
        }
    }

    private void r()
    {
        if (j != null && b != null)
        {
            j.post(new Runnable() {

                public final void run()
                {
                }

            });
        }
    }

    public final int a(long l1, azj azj1, azk azk1, boolean flag)
    {
        boolean flag2;
        if (k == 3)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        bds.b(flag2);
        bds.b(true);
        l = l1;
        if (p)
        {
            p = false;
            return -5;
        }
        if (flag)
        {
            return -2;
        }
        if (o())
        {
            return -2;
        }
        azu azu1;
        boolean flag1;
        if (!h.c())
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        for (azu1 = (azu)f.getFirst(); flag1 && f.size() > 1 && ((azu)f.get(1)).b == h.b(); azu1 = (azu)f.getFirst())
        {
            f.removeFirst();
        }

        if (w == null || !w.equals(azu1.c))
        {
            bad bad1 = azu1.c;
            l1 = azu1.f;
            if (j != null && b != null)
            {
                j.post(new Runnable(bad1, l1) {

                    private bad a;
                    private long b;
                    private azz c;

                    public final void run()
                    {
                        c.b.a(c.a, a, (int)(b / 1000L));
                    }

            
            {
                c = azz.this;
                a = bad1;
                b = l1;
                super();
            }
                });
            }
            w = azu1.c;
        }
        azi azi1 = azu1.a();
        Object obj = v;
        if (azi1 == obj)
        {
            flag = true;
        } else
        if (obj == null)
        {
            flag = false;
        } else
        {
            flag = azi1.a(((azi) (obj)), true);
        }
        if (!flag)
        {
            d.a(azi1);
            azj1.a = azi1;
            azj1.b = azu1.b();
            v = azi1;
            return -4;
        }
        if (!flag1)
        {
            return !r ? -2 : -1;
        }
        obj = h;
        int i1;
        if (!((bbw) (obj)).d())
        {
            i1 = 0;
        } else
        {
label0:
            {
                bca bca1;
label1:
                {
                    int ai[];
                    bcc bcc1;
                    int k1;
label2:
                    {
                        bca1 = ((bbw) (obj)).a;
                        if (!bca1.c.a(azk1, bca1.e))
                        {
                            break label0;
                        }
                        if (!azk1.a())
                        {
                            break label1;
                        }
                        bcc1 = bca1.e;
                        l1 = bcc1.a;
                        bca1.a(l1, bca1.f.a, 1);
                        l1 = 1L + l1;
                        k1 = bca1.f.a[0];
                        int ai1[];
                        bec bec1;
                        if ((k1 & 0x80) != 0)
                        {
                            i1 = 1;
                        } else
                        {
                            i1 = 0;
                        }
                        k1 &= 0x7f;
                        if (azk1.a.a == null)
                        {
                            azk1.a.a = new byte[16];
                        }
                        bca1.a(l1, azk1.a.a, k1);
                        l1 += k1;
                        if (i1 != 0)
                        {
                            bca1.a(l1, bca1.f.a, 2);
                            l1 += 2L;
                            bca1.f.a(0);
                            k1 = bca1.f.d();
                        } else
                        {
                            k1 = 1;
                        }
                        ai = azk1.a.d;
                        if (ai != null)
                        {
                            azj1 = ai;
                            if (ai.length >= k1)
                            {
                                break label2;
                            }
                        }
                        azj1 = new int[k1];
                    }
label3:
                    {
                        ai1 = azk1.a.e;
                        if (ai1 != null)
                        {
                            ai = ai1;
                            if (ai1.length >= k1)
                            {
                                break label3;
                            }
                        }
                        ai = new int[k1];
                    }
                    aym aym1;
                    byte abyte0[];
                    byte abyte1[];
                    int i2;
                    long l3;
                    if (i1 != 0)
                    {
                        i1 = k1 * 6;
                        bec1 = bca1.f;
                        if (bec1.c < i1)
                        {
                            bec1.a(new byte[i1], i1);
                        }
                        bca1.a(l1, bca1.f.a, i1);
                        long l2 = i1;
                        bca1.f.a(0);
                        for (i1 = 0; i1 < k1; i1++)
                        {
                            azj1[i1] = bca1.f.d();
                            ai[i1] = bca1.f.h();
                        }

                        l1 += l2;
                    } else
                    {
                        azj1[0] = 0;
                        ai[0] = azk1.c - (int)(l1 - bcc1.a);
                    }
                    aym1 = azk1.a;
                    abyte0 = bcc1.b;
                    abyte1 = azk1.a.a;
                    aym1.f = k1;
                    aym1.d = azj1;
                    aym1.e = ai;
                    aym1.b = abyte0;
                    aym1.a = abyte1;
                    aym1.c = 1;
                    if (bej.a >= 16)
                    {
                        aym1.g.set(aym1.f, aym1.d, aym1.e, aym1.b, aym1.a, aym1.c);
                    }
                    i1 = (int)(l1 - bcc1.a);
                    bcc1.a = bcc1.a + (long)i1;
                    azk1.c = azk1.c - i1;
                }
                if (azk1.b != null)
                {
                    azk1.b.capacity();
                }
                if (azk1.b != null)
                {
                    l1 = bca1.e.a;
                    azj1 = azk1.b;
                    for (i1 = azk1.c; i1 > 0;)
                    {
                        bca1.a(l1);
                        k1 = (int)(l1 - bca1.g);
                        i2 = Math.min(i1, 0x10000 - k1);
                        azj1.put(((bcz)bca1.d.peek()).a, k1, i2);
                        l3 = i2;
                        i1 -= i2;
                        l1 = l3 + l1;
                    }

                }
                bca1.a(bca1.c.b());
            }
            obj.c = false;
            i1 = 1;
        }
        if (i1 != 0)
        {
            int j1;
            if (azk1.e < m)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            j1 = azk1.d;
            if (i1 != 0)
            {
                i1 = 0x8000000;
            } else
            {
                i1 = 0;
            }
            azk1.d = i1 | j1;
            return -3;
        } else
        {
            return -2;
        }
    }

    public final azm a()
    {
        boolean flag;
        if (k == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        k = 1;
        return this;
    }

    public final void a(long l1)
    {
        boolean flag;
        if (k == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        bds.b(true);
        k = 3;
        d.b();
        c.a(this, i);
        w = null;
        v = null;
        l = l1;
        m = l1;
        p = false;
        d(l1);
    }

    public final void a(bdl bdl)
    {
        SystemClock.elapsedRealtime();
        bdl = e.b;
        d.a(bdl);
        if (bdl instanceof azu)
        {
            bdl.c();
            q();
            r = ((azu)bdl).i;
        } else
        {
            bdl.c();
            q();
        }
        j();
        l();
    }

    public final void a(bdl bdl, IOException ioexception)
    {
        s = ioexception;
        t = t + 1;
        u = SystemClock.elapsedRealtime();
        if (j != null && b != null)
        {
            j.post(new Runnable() {

                public final void run()
                {
                }

            });
        }
        l();
    }

    public final boolean b()
    {
        boolean flag;
        if (k == 1 || k == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        if (k == 2)
        {
            return true;
        } else
        {
            q = new Loader((new StringBuilder("Loader:")).append(d.a().a).toString());
            k = 2;
            return true;
        }
    }

    public final boolean b(long l1)
    {
label0:
        {
            boolean flag1 = false;
            boolean flag;
            if (k == 3)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            bds.b(flag);
            bds.b(true);
            l = l1;
            l();
            if (!r)
            {
                flag = flag1;
                if (h.c())
                {
                    break label0;
                }
            }
            flag = true;
        }
        return flag;
    }

    public final int c()
    {
        boolean flag;
        if (k == 2 || k == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        return 1;
    }

    public final void c(long l1)
    {
        boolean flag;
        boolean flag1 = false;
        long l2;
        boolean flag2;
        if (k == 3)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        bds.b(flag2);
        if (o())
        {
            l2 = n;
        } else
        {
            l2 = l;
        }
        l = l1;
        m = l1;
        if (l2 == l1)
        {
            return;
        }
        if (o())
        {
            break MISSING_BLOCK_LABEL_195;
        }
        bca bca1 = h.a;
        l2 = bca1.c.a(l1);
        if (l2 == -1L)
        {
            flag = false;
        } else
        {
            bca1.a(l2);
            flag = true;
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        flag = true;
_L1:
        if (flag)
        {
            flag = flag1;
            if (!h.c())
            {
                flag = true;
            }
            for (; flag && f.size() > 1 && ((azu)f.get(1)).b <= h.b(); f.removeFirst()) { }
        } else
        {
            d(l1);
        }
        break MISSING_BLOCK_LABEL_206;
        flag = false;
          goto _L1
        p = true;
        return;
    }

    public final azp d()
    {
        boolean flag;
        if (k == 2 || k == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        bds.b(true);
        return d.a();
    }

    public final void e()
    {
        boolean flag;
        if (k == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        bds.b(true);
        k = 2;
        d.c();
        c.a(this);
        if (q.b)
        {
            q.a();
            return;
        } else
        {
            h.a();
            f.clear();
            j();
            c.a();
            return;
        }
        Exception exception;
        exception;
        c.a(this);
        if (q.b)
        {
            q.a();
        } else
        {
            h.a();
            f.clear();
            j();
            c.a();
        }
        throw exception;
    }

    public final void f()
    {
        if (s != null && t > 3)
        {
            throw s;
        }
        if (e.b == null)
        {
            d.d();
        }
    }

    public final long g()
    {
        long l1;
        boolean flag;
        if (k == 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        if (o())
        {
            l1 = n;
        } else
        {
            if (r)
            {
                return -3L;
            }
            long l2 = h.d;
            l1 = l2;
            if (l2 == 0x8000000000000000L)
            {
                return l;
            }
        }
        return l1;
    }

    public final void h()
    {
        boolean flag;
        if (k != 3)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bds.b(flag);
        if (q != null)
        {
            q.b();
            q = null;
        }
        k = 0;
    }

    public final void i()
    {
        e.b.c();
        r();
        j();
        if (k == 3)
        {
            d(n);
            return;
        } else
        {
            h.a();
            f.clear();
            j();
            c.a();
            return;
        }
    }
}
