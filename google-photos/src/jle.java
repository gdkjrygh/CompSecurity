// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.UUID;

public final class jle
    implements jkd
{

    private static final byte a[] = {
        -94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 
        108, 66, 124, 100, -115, -12
    };
    private final int b;
    private final jnl c;
    private final jnl d;
    private final jnl e;
    private final jnl f;
    private final byte g[];
    private final Stack h;
    private final jlk i;
    private int j;
    private int k;
    private long l;
    private int m;
    private jnl n;
    private long o;
    private int p;
    private int q;
    private int r;
    private int s;
    private jli t;
    private jld u;
    private jkf v;
    private jkq w;
    private boolean x;

    public jle()
    {
        this(0);
    }

    private jle(int i1)
    {
        b = 0;
        f = new jnl(16);
        c = new jnl(jnj.a);
        d = new jnl(4);
        e = new jnl(1);
        g = new byte[16];
        h = new Stack();
        i = new jlk();
        a();
    }

    private void a()
    {
        j = 0;
        m = 0;
    }

    private static void a(jli jli1, jld jld1, jky jky1, jlk jlk1, int i1, byte abyte0[])
    {
        Object obj;
        int ai[];
        int ai1[];
        long al[];
        boolean aflag[];
        int j1;
        int j2;
        int l2;
        int j3;
        boolean flag;
        int l3;
        boolean flag1;
        boolean flag2;
        int j4;
        int i5;
        long l5;
        long l8;
        boolean flag3;
        if (1 == jky1.f(jkx.v))
        {
            flag3 = true;
        } else
        {
            flag3 = false;
        }
        a(flag3);
        if (jky1.d(jkx.s) == null || (i1 & 2) != 0)
        {
            l5 = 0L;
        } else
        {
            obj = jky1.d(jkx.s).ao;
            ((jnl) (obj)).b(8);
            if (jkx.a(((jnl) (obj)).h()) == 1)
            {
                l5 = ((jnl) (obj)).k();
            } else
            {
                l5 = ((jnl) (obj)).g();
            }
        }
        obj = jky1.d(jkx.t).ao;
        ((jnl) (obj)).b(8);
        j3 = jkx.b(((jnl) (obj)).h());
        ((jnl) (obj)).c(4);
        if ((j3 & 1) != 0)
        {
            long l7 = ((jnl) (obj)).k();
            jlk1.b = l7;
            jlk1.c = l7;
        }
        if ((j3 & 2) != 0)
        {
            j1 = ((jnl) (obj)).j() - 1;
        } else
        {
            j1 = jld1.a;
        }
        if ((j3 & 8) != 0)
        {
            j2 = ((jnl) (obj)).j();
        } else
        {
            j2 = jld1.b;
        }
        if ((j3 & 0x10) != 0)
        {
            l2 = ((jnl) (obj)).j();
        } else
        {
            l2 = jld1.c;
        }
        if ((j3 & 0x20) != 0)
        {
            j3 = ((jnl) (obj)).j();
        } else
        {
            j3 = jld1.d;
        }
        jlk1.a = new jld(j1, j2, l2, j3);
        obj = jky1.d(jkx.v);
        jld1 = jlk1.a;
        obj = ((jkz) (obj)).ao;
        ((jnl) (obj)).b(8);
        l3 = jkx.b(((jnl) (obj)).h());
        i5 = ((jnl) (obj)).j();
        if ((l3 & 1) != 0)
        {
            jlk1.b = jlk1.b + (long)((jnl) (obj)).h();
        }
        if ((l3 & 4) != 0)
        {
            j2 = 1;
        } else
        {
            j2 = 0;
        }
        j1 = jld1.d;
        if (j2 != 0)
        {
            j1 = ((jnl) (obj)).j();
        }
        if ((l3 & 0x100) != 0)
        {
            l2 = 1;
        } else
        {
            l2 = 0;
        }
        if ((l3 & 0x200) != 0)
        {
            j3 = 1;
        } else
        {
            j3 = 0;
        }
        if ((l3 & 0x400) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if ((l3 & 0x800) != 0)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        jlk1.d = i5;
        if (jlk1.e == null || jlk1.e.length < jlk1.d)
        {
            int i4 = (i5 * 125) / 100;
            jlk1.e = new int[i4];
            jlk1.f = new int[i4];
            jlk1.g = new long[i4];
            jlk1.h = new boolean[i4];
            jlk1.j = new boolean[i4];
        }
        ai = jlk1.e;
        ai1 = jlk1.f;
        al = jlk1.g;
        aflag = jlk1.h;
        l8 = jli1.g;
        if (jli1.f == jli.a && (i1 & 1) != 0)
        {
            flag2 = true;
        } else
        {
            flag2 = false;
        }
        j4 = 0;
        while (j4 < i5) 
        {
            int k4;
            int l4;
            long l10;
            if (l2 != 0)
            {
                k4 = ((jnl) (obj)).j();
            } else
            {
                k4 = jld1.b;
            }
            if (j3 != 0)
            {
                l4 = ((jnl) (obj)).j();
            } else
            {
                l4 = jld1.c;
            }
            if (j4 == 0 && j2 != 0)
            {
                i1 = j1;
            } else
            if (flag)
            {
                i1 = ((jnl) (obj)).h();
            } else
            {
                i1 = jld1.d;
            }
            if (flag1)
            {
                ai1[j4] = (int)((long)(((jnl) (obj)).h() * 1000) / l8);
            } else
            {
                ai1[j4] = 0;
            }
            al[j4] = jno.a(l5, 1000L, l8);
            ai[j4] = l4;
            if ((i1 >> 16 & 1) == 0 && (!flag2 || j4 == 0))
            {
                flag3 = true;
            } else
            {
                flag3 = false;
            }
            aflag[j4] = flag3;
            l10 = k4;
            j4++;
            l5 = l10 + l5;
        }
        jld1 = jky1.d(jkx.V);
        if (jld1 != null)
        {
            jli1 = jli1.i[jlk1.a.a];
            jld1 = ((jkz) (jld1)).ao;
            int k3 = ((jlj) (jli1)).a;
            jld1.b(8);
            if ((jkx.b(jld1.h()) & 1) == 1)
            {
                jld1.c(8);
            }
            i1 = jld1.d();
            int i3 = jld1.j();
            if (i3 != jlk1.d)
            {
                i1 = jlk1.d;
                throw new jjj((new StringBuilder(41)).append("Length mismatch: ").append(i3).append(", ").append(i1).toString());
            }
            int k2;
            if (i1 == 0)
            {
                jli1 = jlk1.j;
                i1 = 0;
                int k1 = 0;
                do
                {
                    k2 = i1;
                    if (k1 >= i3)
                    {
                        break;
                    }
                    k2 = jld1.d();
                    byte byte0;
                    if (k2 > k3)
                    {
                        byte0 = 1;
                    } else
                    {
                        byte0 = 0;
                    }
                    jli1[k1] = byte0;
                    k1++;
                    i1 += k2;
                } while (true);
            } else
            {
                int l1;
                boolean flag4;
                if (i1 > k3)
                {
                    flag4 = true;
                } else
                {
                    flag4 = false;
                }
                Arrays.fill(jlk1.j, 0, i3, flag4);
                k2 = i1 * i3 + 0;
            }
            jlk1.a(k2);
        }
        jli1 = jky1.d(jkx.W);
        if (jli1 != null)
        {
            jli1 = ((jkz) (jli1)).ao;
            jli1.b(8);
            i1 = jli1.h();
            if ((jkx.b(i1) & 1) == 1)
            {
                jli1.c(8);
            }
            l1 = jli1.j();
            if (l1 != 1)
            {
                throw new jjj((new StringBuilder(40)).append("Unexpected saio entry count: ").append(l1).toString());
            }
            i1 = jkx.a(i1);
            long l9 = jlk1.c;
            int i2;
            long l6;
            if (i1 == 0)
            {
                l6 = jli1.g();
            } else
            {
                l6 = jli1.k();
            }
            jlk1.c = l6 + l9;
        }
        jli1 = jky1.d(jkx.Y);
        if (jli1 != null)
        {
            a(((jkz) (jli1)).ao, 0, jlk1);
        }
        i2 = jky1.ap.size();
        for (i1 = 0; i1 < i2; i1++)
        {
            jli1 = (jkz)jky1.ap.get(i1);
            if (((jkz) (jli1)).an != jkx.X)
            {
                continue;
            }
            jli1 = ((jkz) (jli1)).ao;
            jli1.b(8);
            jli1.a(abyte0, 0, 16);
            if (Arrays.equals(abyte0, a))
            {
                a(((jnl) (jli1)), 16, jlk1);
            }
        }

    }

    private static void a(jnl jnl1, int i1, jlk jlk1)
    {
        jnl1.b(i1 + 8);
        i1 = jkx.b(jnl1.h());
        if ((i1 & 1) != 0)
        {
            throw new jjj("Overriding TrackEncryptionBox parameters is unsupported.");
        }
        boolean flag;
        if ((i1 & 2) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i1 = jnl1.j();
        if (i1 != jlk1.d)
        {
            int j1 = jlk1.d;
            throw new jjj((new StringBuilder(41)).append("Length mismatch: ").append(i1).append(", ").append(j1).toString());
        } else
        {
            Arrays.fill(jlk1.j, 0, i1, flag);
            jlk1.a(jnl1.b());
            jnl1.a(jlk1.l.a, 0, jlk1.k);
            jlk1.l.b(0);
            jlk1.m = false;
            return;
        }
    }

    private static void a(boolean flag)
    {
        if (!flag)
        {
            throw new jjj();
        } else
        {
            return;
        }
    }

    private static void a(boolean flag, String s1)
    {
        if (!flag)
        {
            throw new jjj(s1);
        } else
        {
            return;
        }
    }

    private boolean b(jke jke1)
    {
        boolean flag3 = true;
        boolean flag1;
        if (p == 0)
        {
            int i1 = (int)(i.b - jke1.b());
            if (i1 >= 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            a(flag1, "Offset to sample data was negative.");
            jke1.a(i1);
        }
        if (p >= i.d)
        {
            i1 = (int)(o - jke1.b());
            if (i1 >= 0)
            {
                flag1 = flag3;
            } else
            {
                flag1 = false;
            }
            a(flag1, "Offset to end of mdat was negative.");
            jke1.a(i1);
            a();
            return false;
        }
        if (j == 3)
        {
            q = i.e[p];
            if (i.i)
            {
                Object obj = i.l;
                int j1 = i.a.a;
                int l1 = t.i[j1].a;
                boolean flag2 = i.j[p];
                byte abyte0[] = e.a;
                if (flag2)
                {
                    j1 = 128;
                } else
                {
                    j1 = 0;
                }
                abyte0[0] = (byte)(j1 | l1);
                e.b(0);
                w.a(e, 1);
                w.a(((jnl) (obj)), l1);
                if (!flag2)
                {
                    j1 = l1 + 1;
                } else
                {
                    j1 = ((jnl) (obj)).e();
                    ((jnl) (obj)).c(-2);
                    j1 = j1 * 6 + 2;
                    w.a(((jnl) (obj)), j1);
                    j1 += l1 + 1;
                }
                r = j1;
                q = q + r;
            } else
            {
                r = 0;
            }
            s = 0;
            j = 4;
        }
        if (t.j != -1)
        {
            obj = d.a;
            obj[0] = 0;
            obj[1] = 0;
            obj[2] = 0;
            j1 = t.j;
            l1 = 4 - t.j;
            while (r < q) 
            {
                if (s == 0)
                {
                    jke1.b(d.a, l1, j1);
                    d.b(0);
                    s = d.j();
                    c.b(0);
                    w.a(c, 4);
                    r = r + 4;
                    q = q + l1;
                } else
                {
                    int i2 = w.a(jke1, s, false);
                    r = r + i2;
                    s = s - i2;
                }
            }
        } else
        {
            for (; r < q; r = w.a(jke1, q - r, false) + r) { }
        }
        jke1 = i;
        int k1 = p;
        long l2 = ((jlk) (jke1)).g[k1];
        long l3 = ((jlk) (jke1)).f[k1];
        boolean flag;
        int j2;
        if (i.i)
        {
            k1 = 2;
        } else
        {
            k1 = 0;
        }
        if (i.h[p])
        {
            flag = true;
        } else
        {
            flag = false;
        }
        j2 = i.a.a;
        if (i.i)
        {
            jke1 = t.i[j2].b;
        } else
        {
            jke1 = null;
        }
        w.a((l3 + l2) * 1000L, k1 | flag, q, 0, jke1);
        p = p + 1;
        j = 3;
        return true;
    }

    public final int a(jke jke1, jkk jkk)
    {
_L11:
        j;
        JVM INSTR tableswitch 0 2: default 32
    //                   0 42
    //                   1 814
    //                   2 1765;
           goto _L1 _L2 _L3 _L4
_L1:
        if (b(jke1))
        {
            return 0;
        }
        continue; /* Loop/switch isn't completed */
_L2:
        if (m != 0) goto _L6; else goto _L5
_L5:
        if (jke1.a(f.a, 0, 8, true)) goto _L8; else goto _L7
_L7:
        int i1 = 0;
_L9:
        if (i1 == 0)
        {
            return -1;
        }
        continue; /* Loop/switch isn't completed */
_L8:
        m = 8;
        f.b(0);
        l = f.g();
        k = f.h();
_L6:
        if (l == 1L)
        {
            jke1.b(f.a, 8, 8);
            m = m + 8;
            l = f.k();
        }
        long l3 = jke1.b() - (long)m;
        if (k == jkx.G)
        {
            i.c = l3;
            i.b = l3;
        }
        if (k == jkx.h)
        {
            o = l3 + l;
            if (!x)
            {
                v.a(jko.a);
                x = true;
            }
            if (i.m)
            {
                j = 2;
            } else
            {
                j = 3;
            }
            i1 = 1;
        } else
        {
            i1 = k;
            if (i1 == jkx.b || i1 == jkx.c || i1 == jkx.F || i1 == jkx.L || i1 == jkx.h || i1 == jkx.K || i1 == jkx.G || i1 == jkx.x || i1 == jkx.i || i1 == jkx.y || i1 == jkx.w || i1 == jkx.M || i1 == jkx.s || i1 == jkx.t || i1 == jkx.J || i1 == jkx.H || i1 == jkx.z || i1 == jkx.u || i1 == jkx.v || i1 == jkx.I || i1 == jkx.A || i1 == jkx.B || i1 == jkx.C || i1 == jkx.N || i1 == jkx.V || i1 == jkx.W || i1 == jkx.X || i1 == jkx.Y || i1 == jkx.Z || i1 == jkx.f)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                i1 = k;
                if (i1 == jkx.x || i1 == jkx.z || i1 == jkx.A || i1 == jkx.B || i1 == jkx.C || i1 == jkx.D || i1 == jkx.G || i1 == jkx.H || i1 == jkx.I)
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                if (i1 != 0)
                {
                    long l4 = jke1.b();
                    long l7 = l;
                    h.add(new jky(k, (l4 + l7) - 8L));
                    a();
                } else
                {
                    boolean flag;
                    if (m == 8)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a(flag);
                    if (l <= 0x7fffffffL)
                    {
                        flag = true;
                    } else
                    {
                        flag = false;
                    }
                    a(flag);
                    n = new jnl((int)l);
                    System.arraycopy(f.a, 0, n.a, 0, 8);
                    j = 1;
                }
            } else
            {
                boolean flag1;
                if (l <= 0x7fffffffL)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                a(flag1);
                n = null;
                j = 1;
            }
            i1 = 1;
        }
          goto _L9
_L3:
        int j1 = (int)l - m;
        if (n != null)
        {
            jke1.b(n.a, 8, j1);
            jkk = new jkz(k, n);
            long l8 = jke1.b();
            List list;
            jkz jkz1;
            byte abyte0[];
            int i2;
            int k2;
            long l5;
            if (!h.isEmpty())
            {
                ((jky)h.peek()).a(jkk);
            } else
            if (((jkz) (jkk)).an == jkx.w)
            {
                jkk = ((jkz) (jkk)).ao;
                jkk.b(8);
                j1 = jkx.a(jkk.h());
                jkk.c(4);
                long l12 = jkk.g();
                long al[];
                long al1[];
                int j2;
                long l6;
                long l9;
                long l10;
                if (j1 == 0)
                {
                    l6 = jkk.g();
                    l8 = jkk.g() + l8;
                } else
                {
                    l6 = jkk.k();
                    l8 = jkk.k() + l8;
                }
                jkk.c(2);
                j2 = jkk.e();
                obj = new int[j2];
                jky1 = new long[j2];
                al = new long[j2];
                al1 = new long[j2];
                l10 = jno.a(l6, 0xf4240L, l12);
                j1 = 0;
                l9 = l6;
                l6 = l8;
                l8 = l10;
                for (; j1 < j2; j1++)
                {
                    int l2 = jkk.h();
                    if ((0x80000000 & l2) != 0)
                    {
                        throw new jjj("Unhandled indirect reference");
                    }
                    long l11 = jkk.g();
                    obj[j1] = l2 & 0x7fffffff;
                    jky1[j1] = l6;
                    al1[j1] = l8;
                    l9 += l11;
                    l8 = jno.a(l9, 0xf4240L, l12);
                    al[j1] = l8 - al1[j1];
                    jkk.c(4);
                    l6 += obj[j1];
                }

                jkk = new jkb(((int []) (obj)), jky1, al, al1);
                v.a(jkk);
                x = true;
            }
        } else
        {
            jke1.a(j1);
        }
        for (l5 = jke1.b(); !h.isEmpty() && ((jky)h.peek()).ao == l5;)
        {
            jky jky1 = (jky)h.pop();
            if (jky1.an == jkx.x)
            {
                list = jky1.ap;
                k2 = list.size();
                Object obj = null;
                i2 = 0;
                while (i2 < k2) 
                {
                    jkz1 = (jkz)list.get(i2);
                    jkk = ((jkk) (obj));
                    if (jkz1.an == jkx.N)
                    {
                        jkk = ((jkk) (obj));
                        if (obj == null)
                        {
                            jkk = new jjz("video/mp4");
                        }
                        abyte0 = jkz1.ao.a;
                        obj = new jnl(abyte0);
                        if (((jnl) (obj)).c < 32)
                        {
                            j1 = 0;
                        } else
                        {
                            ((jnl) (obj)).b(0);
                            if (((jnl) (obj)).h() != ((jnl) (obj)).b() + 4)
                            {
                                j1 = 0;
                            } else
                            if (((jnl) (obj)).h() != jkx.N)
                            {
                                j1 = 0;
                            } else
                            {
                                ((jnl) (obj)).b(12);
                                ((jnl) (obj)).c(16);
                                if (((jnl) (obj)).h() != ((jnl) (obj)).b())
                                {
                                    j1 = 0;
                                } else
                                {
                                    j1 = 1;
                                }
                            }
                        }
                        if (j1 == 0)
                        {
                            obj = null;
                        } else
                        {
                            ((jnl) (obj)).b(12);
                            obj = new UUID(((jnl) (obj)).i(), ((jnl) (obj)).i());
                        }
                        jkk.a(((UUID) (obj)), abyte0);
                    }
                    i2++;
                    obj = jkk;
                }
                if (obj != null)
                {
                    v.a(((jjy) (obj)));
                }
                jkk = jky1.e(jkx.I).d(jkx.u).ao;
                jkk.b(16);
                u = new jld(jkk.j() - 1, jkk.j(), jkk.j(), jkk.h());
                t = b.a(jky1.e(jkx.z), jky1.d(jkx.y));
                boolean flag2;
                if (t != null)
                {
                    flag2 = true;
                } else
                {
                    flag2 = false;
                }
                a(flag2);
                w.a(t.h);
            } else
            if (jky1.an == jkx.G)
            {
                jkk = i;
                jkk.d = 0;
                jkk.i = false;
                jkk.m = false;
                jkk = t;
                jld jld1 = u;
                jlk jlk1 = i;
                int k1 = b;
                byte abyte1[] = g;
                boolean flag3;
                if (1 == jky1.f(jkx.H))
                {
                    flag3 = true;
                } else
                {
                    flag3 = false;
                }
                a(flag3);
                a(((jli) (jkk)), jld1, jky1.e(jkx.H), jlk1, k1, abyte1);
                p = 0;
            } else
            if (!h.isEmpty())
            {
                ((jky)h.peek()).a(jky1);
            }
        }

        a();
        continue; /* Loop/switch isn't completed */
_L4:
        int l1 = (int)(i.c - jke1.b());
        boolean flag4;
        if (l1 >= 0)
        {
            flag4 = true;
        } else
        {
            flag4 = false;
        }
        a(flag4, "Offset to encryption data was negative.");
        jke1.a(l1);
        jkk = i;
        jke1.b(((jlk) (jkk)).l.a, 0, ((jlk) (jkk)).k);
        ((jlk) (jkk)).l.b(0);
        jkk.m = false;
        j = 3;
        if (true) goto _L11; else goto _L10
_L10:
    }

    public final void a(jkf jkf1)
    {
        v = jkf1;
        w = jkf1.c(0);
        v.g();
    }

    public final boolean a(jke jke1)
    {
        return jlh.a(jke1);
    }

    public final void b()
    {
        h.clear();
        a();
    }

}
