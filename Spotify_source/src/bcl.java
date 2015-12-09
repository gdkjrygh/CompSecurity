// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public final class bcl
    implements bbx
{

    private static final byte a[] = {
        -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 
        108, 66, 124, 100, -115, -12
    };
    private final bec b;
    private final bec c;
    private final bec d;
    private final bec e;
    private final byte f[];
    private final Stack g;
    private final bcp h;
    private int i;
    private int j;
    private long k;
    private int l;
    private bec m;
    private int n;
    private int o;
    private int p;
    private int q;
    private bcn r;
    private bck s;
    private bbz t;
    private bce u;
    private boolean v;

    public bcl()
    {
        this((byte)0);
    }

    private bcl(byte byte0)
    {
        e = new bec(16);
        b = new bec(beb.a);
        c = new bec(4);
        d = new bec(1);
        f = new byte[16];
        g = new Stack();
        h = new bcp();
        b();
    }

    private void a(bcg bcg1)
    {
        Object obj;
        Object obj2;
        int k2;
        Object obj3 = bcg1.Y;
        int k1 = ((List) (obj3)).size();
        byte abyte0[] = null;
        for (int i1 = 0; i1 < k1;)
        {
            bch bch1 = (bch)((List) (obj3)).get(i1);
            Object obj1 = abyte0;
            if (bch1.W == bcf.H)
            {
                obj1 = abyte0;
                if (abyte0 == null)
                {
                    obj1 = new bbk("video/mp4");
                }
                abyte0 = bch1.X.a;
                ((bbk) (obj1)).a(bcm.a(abyte0), abyte0);
            }
            i1++;
            abyte0 = ((byte []) (obj1));
        }

        if (abyte0 != null)
        {
            t.a(abyte0);
        }
        obj = bcg1.e(bcf.C).d(bcf.o).X;
        ((bec) (obj)).a(16);
        s = new bck(((bec) (obj)).h() - 1, ((bec) (obj)).h(), ((bec) (obj)).h(), ((bec) (obj)).f());
        obj2 = bcg1.e(bcf.t);
        obj = bcg1.d(bcf.s);
        bcg1 = ((bcg) (obj2)).e(bcf.u);
        obj3 = bcg1.d(bcf.F).X;
        ((bec) (obj3)).a(16);
        k2 = ((bec) (obj3)).f();
        if (k2 == bcn.b || k2 == bcn.a || k2 == bcn.c || k2 == bcn.d) goto _L2; else goto _L1
_L1:
        bcg1 = null;
_L14:
        r = bcg1;
        float f1;
        bcg bcg2;
        bec bec1;
        bcj bcj1;
        int j1;
        int l1;
        boolean flag;
        int i2;
        int j2;
        int l2;
        int i3;
        int j3;
        int k3;
        int l3;
        int i4;
        int j4;
        long l4;
        long l5;
        boolean flag1;
        if (r != null)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bds.b(flag1);
        u.a(r.g);
        return;
_L2:
        obj2 = ((bcg) (obj2)).d(bcf.D).X;
        ((bec) (obj2)).a(8);
        l2 = bcf.a(((bec) (obj2)).f());
        if (l2 == 0)
        {
            j1 = 8;
        } else
        {
            j1 = 16;
        }
        ((bec) (obj2)).b(j1);
        i3 = ((bec) (obj2)).f();
        ((bec) (obj2)).b(4);
        j2 = 1;
        j3 = ((bec) (obj2)).b;
        if (l2 == 0)
        {
            j1 = 4;
        } else
        {
            j1 = 8;
        }
        l1 = 0;
_L10:
        flag = j2;
        if (l1 >= j1) goto _L4; else goto _L3
_L3:
        if (((bec) (obj2)).a[j3 + l1] == -1) goto _L6; else goto _L5
_L5:
        flag = false;
_L4:
        if (flag)
        {
            ((bec) (obj2)).b(j1);
            l4 = -1L;
        } else
        if (l2 == 0)
        {
            l4 = ((bec) (obj2)).e();
        } else
        {
            l4 = ((bec) (obj2)).i();
        }
        obj2 = Pair.create(Integer.valueOf(i3), Long.valueOf(l4));
        ((Integer)((Pair) (obj2)).first).intValue();
        l4 = ((Long)((Pair) (obj2)).second).longValue();
        obj = ((bch) (obj)).X;
        ((bec) (obj)).a(8);
        if (bcf.a(((bec) (obj)).f()) == 0)
        {
            j1 = 8;
        } else
        {
            j1 = 16;
        }
        ((bec) (obj)).b(j1);
        l5 = ((bec) (obj)).e();
        if (l4 == -1L)
        {
            l4 = -1L;
        } else
        {
            l4 = bej.a(l4, 0xf4240L, l5);
        }
        obj = bcg1.e(bcf.v).e(bcf.w);
        bcg1 = bcg1.d(bcf.E).X;
        bcg1.a(8);
        if (bcf.a(bcg1.f()) == 0)
        {
            j1 = 8;
        } else
        {
            j1 = 16;
        }
        bcg1.b(j1);
        l5 = bcg1.e();
        bec1 = ((bcg) (obj)).d(bcf.G).X;
        bec1.a(12);
        j2 = bec1.f();
        bcj1 = new bcj(j2);
        j1 = 0;
_L12:
        if (j1 >= j2)
        {
            break MISSING_BLOCK_LABEL_1506;
        }
        l2 = bec1.b;
        i3 = bec1.f();
        if (i3 > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bds.a(flag1, "childAtomSize should be positive");
        l1 = bec1.f();
        if (l1 != bcf.a && l1 != bcf.b && l1 != bcf.M && l1 != bcf.U && l1 != bcf.c && l1 != bcf.d && l1 != bcf.e)
        {
            break MISSING_BLOCK_LABEL_1414;
        }
        bec1.a(l2 + 8);
        bec1.b(24);
        j3 = bec1.d();
        k3 = bec1.d();
        f1 = 1.0F;
        bec1.b(50);
        obj2 = null;
        l1 = bec1.b;
        bcg2 = null;
_L11:
        if (l1 - l2 >= i3) goto _L8; else goto _L7
_L7:
        bec1.a(l1);
        i2 = bec1.b;
        l3 = bec1.f();
        if (l3 == 0 && bec1.b - l2 == i3) goto _L8; else goto _L9
_L6:
        l1++;
          goto _L10
_L9:
        if (l3 > 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        bds.a(flag1, "childAtomSize should be positive");
        i4 = bec1.f();
        if (i4 == bcf.x)
        {
            if (bcg2 == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            bds.b(flag1);
            bec1.a(i2 + 8 + 4);
            i4 = (bec1.c() & 3) + 1;
            if (i4 == 3)
            {
                throw new IllegalStateException();
            }
            bcg1 = new ArrayList();
            j4 = bec1.c();
            for (i2 = 0; i2 < (j4 & 0x1f); i2++)
            {
                bcg1.add(beb.a(bec1));
            }

            j4 = bec1.c();
            for (i2 = 0; i2 < j4; i2++)
            {
                bcg1.add(beb.a(bec1));
            }

            bcg1 = Pair.create(bcg1, Integer.valueOf(i4));
            obj = (List)((Pair) (bcg1)).first;
            bcj1.c = ((Integer)((Pair) (bcg1)).second).intValue();
            bcg1 = "video/avc";
        } else
        if (i4 == bcf.y)
        {
            if (bcg2 == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            bds.b(flag1);
            bcg1 = bci.a(bec1, i2);
            obj = (List)((Pair) (bcg1)).first;
            bcj1.c = ((Integer)((Pair) (bcg1)).second).intValue();
            bcg1 = "video/hevc";
        } else
        if (i4 == bcf.f)
        {
            if (bcg2 == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            bds.b(flag1);
            bcg1 = "video/3gpp";
            obj = obj2;
        } else
        if (i4 == bcf.z)
        {
            if (bcg2 == null)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            bds.b(flag1);
            obj = bci.b(bec1, i2);
            bcg1 = (String)((Pair) (obj)).first;
            obj = Collections.singletonList(((Pair) (obj)).second);
        } else
        if (i4 == bcf.I)
        {
            bcj1.a[j1] = bci.a(bec1, i2, l3);
            bcg1 = bcg2;
            obj = obj2;
        } else
        {
            bcg1 = bcg2;
            obj = obj2;
            if (i4 == bcf.S)
            {
                bec1.a(i2 + 8);
                i2 = bec1.h();
                i4 = bec1.h();
                f1 = (float)i2 / (float)i4;
                bcg1 = bcg2;
                obj = obj2;
            }
        }
        l1 += l3;
        bcg2 = bcg1;
        obj2 = obj;
          goto _L11
_L8:
        if (bcg2 != null)
        {
            bcj1.b = azi.a(bcg2, -1, l4, j3, k3, f1, ((List) (obj2)));
        }
_L13:
        bec1.a(l2 + i3);
        j1++;
          goto _L12
        if (l1 == bcf.h || l1 == bcf.N || l1 == bcf.i)
        {
            bci.a(bec1, l1, l2, i3, l4, bcj1, j1);
        } else
        if (l1 == bcf.T)
        {
            bcj1.b = azi.a("application/ttml+xml", l4);
        } else
        if (l1 == bcf.V)
        {
            bcj1.b = azi.a("application/x-quicktime-tx3g", l4);
        }
          goto _L13
        if (bcj1.b == null)
        {
            bcg1 = null;
        } else
        {
            bcg1 = new bcn(k2, l5, bcj1.b, bcj1.a, bcj1.c);
        }
          goto _L14
    }

    private static void a(bcn bcn1, bck bck1, bcg bcg1, bcp bcp1, byte abyte0[])
    {
        Object obj;
        int ai[];
        int ai1[];
        long al[];
        boolean aflag[];
        int i1;
        int k1;
        int j2;
        int l2;
        boolean flag;
        boolean flag1;
        boolean flag2;
        int k3;
        int j4;
        long l4;
        long l5;
        if (bcg1.d(bcf.m) == null)
        {
            l4 = 0L;
        } else
        {
            obj = bcg1.d(bcf.m).X;
            ((bec) (obj)).a(8);
            if (bcf.a(((bec) (obj)).f()) == 1)
            {
                l4 = ((bec) (obj)).i();
            } else
            {
                l4 = ((bec) (obj)).e();
            }
        }
        obj = bcg1.d(bcf.n).X;
        ((bec) (obj)).a(8);
        l2 = bcf.b(((bec) (obj)).f());
        ((bec) (obj)).b(4);
        if ((l2 & 1) != 0)
        {
            ((bec) (obj)).b(8);
        }
        if ((l2 & 2) != 0)
        {
            i1 = ((bec) (obj)).h() - 1;
        } else
        {
            i1 = bck1.a;
        }
        if ((l2 & 8) != 0)
        {
            k1 = ((bec) (obj)).h();
        } else
        {
            k1 = bck1.b;
        }
        if ((l2 & 0x10) != 0)
        {
            j2 = ((bec) (obj)).h();
        } else
        {
            j2 = bck1.c;
        }
        if ((l2 & 0x20) != 0)
        {
            l2 = ((bec) (obj)).h();
        } else
        {
            l2 = bck1.d;
        }
        bck1 = new bck(i1, k1, j2, l2);
        bcp1.a = bck1.a;
        obj = bcg1.d(bcf.p).X;
        ((bec) (obj)).a(8);
        k1 = bcf.b(((bec) (obj)).f());
        j4 = ((bec) (obj)).h();
        if ((k1 & 1) != 0)
        {
            ((bec) (obj)).b(4);
        }
        if ((k1 & 4) != 0)
        {
            j2 = 1;
        } else
        {
            j2 = 0;
        }
        i1 = bck1.d;
        if (j2 != 0)
        {
            i1 = ((bec) (obj)).h();
        }
        if ((k1 & 0x100) != 0)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        if ((k1 & 0x200) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((k1 & 0x400) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        if ((k1 & 0x800) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        bcp1.b = j4;
        if (bcp1.c == null || bcp1.c.length < bcp1.b)
        {
            k1 = (j4 * 125) / 100;
            bcp1.c = new int[k1];
            bcp1.d = new int[k1];
            bcp1.e = new long[k1];
            bcp1.f = new boolean[k1];
            bcp1.h = new boolean[k1];
        }
        ai = bcp1.c;
        ai1 = bcp1.d;
        al = bcp1.e;
        aflag = bcp1.f;
        l5 = bcn1.f;
        k1 = bcn1.e;
        k1 = bcn.a;
        k3 = 0;
        while (k3 < j4) 
        {
            int l3;
            int i4;
            boolean flag3;
            if (l2 != 0)
            {
                l3 = ((bec) (obj)).h();
            } else
            {
                l3 = bck1.b;
            }
            if (flag)
            {
                i4 = ((bec) (obj)).h();
            } else
            {
                i4 = bck1.c;
            }
            if (k3 == 0 && j2 != 0)
            {
                k1 = i1;
            } else
            if (flag1)
            {
                k1 = ((bec) (obj)).f();
            } else
            {
                k1 = bck1.d;
            }
            if (flag2)
            {
                ai1[k3] = (int)((long)(((bec) (obj)).f() * 1000) / l5);
            } else
            {
                ai1[k3] = 0;
            }
            al[k3] = (1000L * l4) / l5;
            ai[k3] = i4;
            if ((k1 >> 16 & 1) == 0)
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            aflag[k3] = flag3;
            l4 = (long)l3 + l4;
            k3++;
        }
        obj = bcg1.d(bcf.P);
        if (obj != null)
        {
            bcn1 = bcn1.h[bck1.a];
            bck1 = ((bch) (obj)).X;
            int i3 = ((bco) (bcn1)).a;
            bck1.a(8);
            if ((bcf.b(bck1.f()) & 1) == 1)
            {
                bck1.b(8);
            }
            int j1 = bck1.c();
            int j3 = bck1.h();
            if (j3 != bcp1.b)
            {
                throw new IllegalStateException((new StringBuilder("Length mismatch: ")).append(j3).append(", ").append(bcp1.b).toString());
            }
            int k2;
            if (j1 == 0)
            {
                bcn1 = bcp1.h;
                j1 = 0;
                int l1 = 0;
                do
                {
                    k2 = j1;
                    if (l1 >= j3)
                    {
                        break;
                    }
                    k2 = bck1.c();
                    byte byte0;
                    if (k2 > i3)
                    {
                        byte0 = 1;
                    } else
                    {
                        byte0 = 0;
                    }
                    bcn1[l1] = byte0;
                    l1++;
                    j1 += k2;
                } while (true);
            } else
            {
                int i2;
                boolean flag4;
                if (j1 > i3)
                {
                    flag4 = true;
                } else
                {
                    flag4 = false;
                }
                Arrays.fill(bcp1.h, 0, j3, flag4);
                k2 = j1 * j3 + 0;
            }
            bcp1.a(k2);
        }
        bcn1 = bcg1.d(bcf.R);
        if (bcn1 != null)
        {
            a(((bch) (bcn1)).X, 0, bcp1);
        }
        i2 = bcg1.Y.size();
        for (j1 = 0; j1 < i2; j1++)
        {
            bcn1 = (bch)bcg1.Y.get(j1);
            if (((bch) (bcn1)).W != bcf.Q)
            {
                continue;
            }
            bcn1 = ((bch) (bcn1)).X;
            bcn1.a(8);
            bcn1.a(abyte0, 0, 16);
            if (Arrays.equals(abyte0, a))
            {
                a(((bec) (bcn1)), 16, bcp1);
            }
        }

    }

    private static void a(bec bec1, int i1, bcp bcp1)
    {
        bec1.a(i1 + 8);
        i1 = bcf.b(bec1.f());
        if ((i1 & 1) != 0)
        {
            throw new IllegalStateException("Overriding TrackEncryptionBox parameters is unsupported");
        }
        boolean flag;
        if ((i1 & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = bec1.h();
        if (i1 != bcp1.b)
        {
            throw new IllegalStateException((new StringBuilder("Length mismatch: ")).append(i1).append(", ").append(bcp1.b).toString());
        } else
        {
            Arrays.fill(bcp1.h, 0, i1, flag);
            bcp1.a(bec1.b());
            bec1.a(bcp1.j.a, 0, bcp1.i);
            bcp1.j.a(0);
            bcp1.k = false;
            return;
        }
    }

    private void b()
    {
        i = 0;
        l = 0;
    }

    private boolean b(bby bby1)
    {
        if (n >= h.b)
        {
            b();
            return false;
        }
        if (i == 3)
        {
            o = h.c[n];
            if (h.g)
            {
                Object obj = h.j;
                int k1 = r.h[h.a].a;
                boolean flag1 = h.h[n];
                byte abyte0[] = d.a;
                int i1;
                if (flag1)
                {
                    i1 = 128;
                } else
                {
                    i1 = 0;
                }
                abyte0[0] = (byte)(i1 | k1);
                d.a(0);
                u.a(d, 1);
                u.a(((bec) (obj)), k1);
                if (!flag1)
                {
                    i1 = k1 + 1;
                } else
                {
                    i1 = ((bec) (obj)).d();
                    ((bec) (obj)).b(-2);
                    i1 = i1 * 6 + 2;
                    u.a(((bec) (obj)), i1);
                    i1 += k1 + 1;
                }
                p = i1;
                o = o + p;
            } else
            {
                p = 0;
            }
            q = 0;
            i = 4;
        }
        if (r.i != -1)
        {
            obj = c.a;
            obj[0] = 0;
            obj[1] = 0;
            obj[2] = 0;
            i1 = r.i;
            k1 = 4 - r.i;
            while (p < o) 
            {
                if (q == 0)
                {
                    bby1.b(c.a, k1, i1);
                    c.a(0);
                    q = c.h();
                    b.a(0);
                    u.a(b, 4);
                    p = p + 4;
                    o = o + k1;
                } else
                {
                    int l1 = u.a(bby1, q, false);
                    p = p + l1;
                    q = q - l1;
                }
            }
        } else
        {
            for (; p < o; p = u.a(bby1, o - p, false) + p) { }
        }
        bby1 = h;
        int j1 = n;
        long l2 = ((bcp) (bby1)).e[j1];
        long l3 = ((bcp) (bby1)).d[j1];
        boolean flag;
        if (h.g)
        {
            j1 = 2;
        } else
        {
            j1 = 0;
        }
        if (h.f[n])
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (h.g)
        {
            bby1 = r.h[h.a].b;
        } else
        {
            bby1 = null;
        }
        u.a((l3 + l2) * 1000L, j1 | flag, o, 0, bby1);
        n = n + 1;
        i = 3;
        return true;
    }

    public final int a(bby bby1)
    {
_L11:
        i;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 42
    //                   1 753
    //                   2 1326;
           goto _L1 _L2 _L3 _L4
_L1:
        if (b(bby1))
        {
            return 0;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (l != 0) goto _L6; else goto _L5
_L5:
        if (bby1.a(e.a, 0, 8, true)) goto _L8; else goto _L7
_L7:
        int i1 = 0;
_L9:
        if (i1 == 0)
        {
            return -1;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        l = 8;
        e.a(0);
        k = e.e();
        j = e.f();
_L6:
        if (k == 1L)
        {
            bby1.b(e.a, 8, 8);
            l = l + 8;
            k = e.i();
        }
        if (j == bcf.g)
        {
            if (!v)
            {
                t.a(bcd.f);
                v = true;
            }
            if (h.k)
            {
                i = 2;
            } else
            {
                i = 3;
            }
            i1 = 1;
        } else
        {
            i1 = j;
            if (i1 == bcf.a || i1 == bcf.b || i1 == bcf.z || i1 == bcf.F || i1 == bcf.g || i1 == bcf.E || i1 == bcf.A || i1 == bcf.r || i1 == bcf.h || i1 == bcf.s || i1 == bcf.q || i1 == bcf.G || i1 == bcf.m || i1 == bcf.n || i1 == bcf.D || i1 == bcf.B || i1 == bcf.t || i1 == bcf.o || i1 == bcf.p || i1 == bcf.C || i1 == bcf.u || i1 == bcf.v || i1 == bcf.w || i1 == bcf.H || i1 == bcf.P || i1 == bcf.Q || i1 == bcf.R || i1 == bcf.S || i1 == bcf.e)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                i1 = j;
                if (i1 == bcf.r || i1 == bcf.t || i1 == bcf.u || i1 == bcf.v || i1 == bcf.w || i1 == bcf.x || i1 == bcf.A || i1 == bcf.B || i1 == bcf.C)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 != 0)
                {
                    long l2 = bby1.a();
                    long l4 = k;
                    g.add(new bcg(j, (l2 + l4) - 8L));
                    b();
                } else
                {
                    boolean flag;
                    if (l == 8)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    bds.b(flag);
                    if (k <= 0x7fffffffL)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    bds.b(flag);
                    m = new bec((int)k);
                    System.arraycopy(e.a, 0, m.a, 0, 8);
                    i = 1;
                }
            } else
            {
                boolean flag1;
                if (k <= 0x7fffffffL)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                bds.b(flag1);
                m = null;
                i = 1;
            }
            i1 = 1;
        }
          goto _L9
_L3:
        int j1 = (int)k - l;
        Object obj;
        if (m != null)
        {
            bby1.b(m.a, 8, j1);
            obj = new bch(j, m);
            long l3 = bby1.a();
            if (!g.isEmpty())
            {
                ((bcg)g.peek()).Y.add(obj);
            } else
            if (((bch) (obj)).W == bcf.q)
            {
                obj = ((bch) (obj)).X;
                ((bec) (obj)).a(8);
                j1 = bcf.a(((bec) (obj)).f());
                ((bec) (obj)).b(4);
                long l9 = ((bec) (obj)).e();
                int ai[];
                long al[];
                long al1[];
                long al2[];
                int k1;
                long l5;
                long l6;
                long l7;
                if (j1 == 0)
                {
                    l5 = ((bec) (obj)).e();
                    l3 = ((bec) (obj)).e() + l3;
                } else
                {
                    l5 = ((bec) (obj)).i();
                    l3 = ((bec) (obj)).i() + l3;
                }
                ((bec) (obj)).b(2);
                k1 = ((bec) (obj)).d();
                ai = new int[k1];
                al = new long[k1];
                al1 = new long[k1];
                al2 = new long[k1];
                l7 = bej.a(l5, 0xf4240L, l9);
                j1 = 0;
                l6 = l5;
                l5 = l7;
                for (; j1 < k1; j1++)
                {
                    int l1 = ((bec) (obj)).f();
                    if ((0x80000000 & l1) != 0)
                    {
                        throw new IllegalStateException("Unhandled indirect reference");
                    }
                    long l8 = ((bec) (obj)).e();
                    ai[j1] = l1 & 0x7fffffff;
                    al[j1] = l3;
                    al2[j1] = l5;
                    l6 += l8;
                    l5 = bej.a(l6, 0xf4240L, l9);
                    al1[j1] = l5 - al2[j1];
                    ((bec) (obj)).b(4);
                    l3 += ai[j1];
                }

                obj = new bbu(ai, al, al1, al2);
                t.a(((bcd) (obj)));
                v = true;
            }
        } else
        {
            bby1.a(j1);
        }
        for (l3 = bby1.a(); !g.isEmpty() && ((bcg)g.peek()).X == l3;)
        {
            obj = (bcg)g.pop();
            if (((bcg) (obj)).W == bcf.r)
            {
                a(((bcg) (obj)));
            } else
            if (((bcg) (obj)).W == bcf.A)
            {
                Object obj1 = h;
                obj1.b = 0;
                obj1.g = false;
                obj1.k = false;
                obj1 = r;
                bck bck1 = s;
                bcp bcp2 = h;
                byte abyte0[] = f;
                a(((bcn) (obj1)), bck1, ((bcg) (obj)).e(bcf.B), bcp2, abyte0);
                n = 0;
            } else
            if (!g.isEmpty())
            {
                ((bcg)g.peek()).Z.add(obj);
            }
        }

        b();
        continue; /* Loop/switch isn't completed */
_L4:
        bcp bcp1 = h;
        bby1.b(bcp1.j.a, 0, bcp1.i);
        bcp1.j.a(0);
        bcp1.k = false;
        i = 3;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final void a()
    {
        g.clear();
        b();
    }

    public final void a(bbz bbz1)
    {
        t = bbz1;
        u = bbz1.a();
        t.b();
    }

}
