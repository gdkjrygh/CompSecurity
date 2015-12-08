// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            ph, pf, pg, pn, 
//            pl, pq, pm, pi

public interface com.google.android.gms.internal.c
{
    public static final class a extends ph
    {

        public int fn;
        public int fo;
        public int level;

        public a a(pf pf1)
            throws IOException
        {
_L6:
            int k = pf1.qi();
            k;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       16: 103
        //                       24: 114;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (a(pf1, k)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int l = pf1.ql();
            switch (l)
            {
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
                level = l;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            fn = pf1.ql();
            continue; /* Loop/switch isn't completed */
_L5:
            fo = pf1.ql();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public void a(pg pg1)
            throws IOException
        {
            if (level != 1)
            {
                pg1.s(1, level);
            }
            if (fn != 0)
            {
                pg1.s(2, fn);
            }
            if (fo != 0)
            {
                pg1.s(3, fo);
            }
            super.a(pg1);
        }

        public a b()
        {
            level = 1;
            fn = 0;
            fo = 0;
            awJ = null;
            awU = -1;
            return this;
        }

        public pn b(pf pf1)
            throws IOException
        {
            return a(pf1);
        }

        protected int c()
        {
            int l = super.c();
            int k = l;
            if (level != 1)
            {
                k = l + pg.u(1, level);
            }
            l = k;
            if (fn != 0)
            {
                l = k + pg.u(2, fn);
            }
            k = l;
            if (fo != 0)
            {
                k = l + pg.u(3, fo);
            }
            return k;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof a)
                {
                    obj = (a)obj;
                    flag = flag1;
                    if (level == ((a) (obj)).level)
                    {
                        flag = flag1;
                        if (fn == ((a) (obj)).fn)
                        {
                            flag = flag1;
                            if (fo == ((a) (obj)).fo)
                            {
                                return a(((ph) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (((level + 527) * 31 + fn) * 31 + fo) * 31 + qz();
        }

        public a()
        {
            b();
        }
    }

    public static final class b extends ph
    {

        private static volatile b fp[];
        public int fq[];
        public int fr;
        public boolean fs;
        public boolean ft;
        public int name;

        public static b[] d()
        {
            if (fp == null)
            {
                synchronized (pl.awT)
                {
                    if (fp == null)
                    {
                        fp = new b[0];
                    }
                }
            }
            return fp;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(pg pg1)
            throws IOException
        {
            if (ft)
            {
                pg1.b(1, ft);
            }
            pg1.s(2, fr);
            if (fq != null && fq.length > 0)
            {
                for (int k = 0; k < fq.length; k++)
                {
                    pg1.s(3, fq[k]);
                }

            }
            if (name != 0)
            {
                pg1.s(4, name);
            }
            if (fs)
            {
                pg1.b(6, fs);
            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return c(pf1);
        }

        protected int c()
        {
            int l = 0;
            int i1 = super.c();
            int k = i1;
            if (ft)
            {
                k = i1 + pg.c(1, ft);
            }
            i1 = pg.u(2, fr) + k;
            if (fq != null && fq.length > 0)
            {
                for (k = 0; k < fq.length; k++)
                {
                    l += pg.gw(fq[k]);
                }

                l = i1 + l + fq.length * 1;
            } else
            {
                l = i1;
            }
            k = l;
            if (name != 0)
            {
                k = l + pg.u(4, name);
            }
            l = k;
            if (fs)
            {
                l = k + pg.c(6, fs);
            }
            return l;
        }

        public b c(pf pf1)
            throws IOException
        {
            do
            {
                int k = pf1.qi();
                switch (k)
                {
                default:
                    if (a(pf1, k))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    ft = pf1.qm();
                    break;

                case 16: // '\020'
                    fr = pf1.ql();
                    break;

                case 24: // '\030'
                    int j1 = pq.b(pf1, 24);
                    int ai[];
                    int l;
                    if (fq == null)
                    {
                        l = 0;
                    } else
                    {
                        l = fq.length;
                    }
                    ai = new int[j1 + l];
                    j1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(fq, 0, ai, 0, l);
                        j1 = l;
                    }
                    for (; j1 < ai.length - 1; j1++)
                    {
                        ai[j1] = pf1.ql();
                        pf1.qi();
                    }

                    ai[j1] = pf1.ql();
                    fq = ai;
                    break;

                case 26: // '\032'
                    int l1 = pf1.gp(pf1.qp());
                    int i1 = pf1.getPosition();
                    int k1;
                    for (k1 = 0; pf1.qu() > 0; k1++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(i1);
                    int ai1[];
                    if (fq == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = fq.length;
                    }
                    ai1 = new int[k1 + i1];
                    k1 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(fq, 0, ai1, 0, i1);
                        k1 = i1;
                    }
                    for (; k1 < ai1.length; k1++)
                    {
                        ai1[k1] = pf1.ql();
                    }

                    fq = ai1;
                    pf1.gq(l1);
                    break;

                case 32: // ' '
                    name = pf1.ql();
                    break;

                case 48: // '0'
                    fs = pf1.qm();
                    break;
                }
            } while (true);
        }

        public b e()
        {
            fq = pq.awW;
            fr = 0;
            name = 0;
            fs = false;
            ft = false;
            awJ = null;
            awU = -1;
            return this;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof b)
                {
                    obj = (b)obj;
                    flag = flag1;
                    if (pl.equals(fq, ((b) (obj)).fq))
                    {
                        flag = flag1;
                        if (fr == ((b) (obj)).fr)
                        {
                            flag = flag1;
                            if (name == ((b) (obj)).name)
                            {
                                flag = flag1;
                                if (fs == ((b) (obj)).fs)
                                {
                                    flag = flag1;
                                    if (ft == ((b) (obj)).ft)
                                    {
                                        return a(((ph) (obj)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            char c2 = '\u04CF';
            int k = pl.hashCode(fq);
            int l = fr;
            int i1 = name;
            char c1;
            if (fs)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            if (!ft)
            {
                c2 = '\u04D5';
            }
            return ((c1 + (((k + 527) * 31 + l) * 31 + i1) * 31) * 31 + c2) * 31 + qz();
        }

        public b()
        {
            e();
        }
    }

    public static final class c extends ph
    {

        private static volatile c fu[];
        public String fv;
        public long fw;
        public long fx;
        public boolean fy;
        public long fz;

        public static c[] f()
        {
            if (fu == null)
            {
                synchronized (pl.awT)
                {
                    if (fu == null)
                    {
                        fu = new c[0];
                    }
                }
            }
            return fu;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(pg pg1)
            throws IOException
        {
            if (!fv.equals(""))
            {
                pg1.b(1, fv);
            }
            if (fw != 0L)
            {
                pg1.b(2, fw);
            }
            if (fx != 0x7fffffffL)
            {
                pg1.b(3, fx);
            }
            if (fy)
            {
                pg1.b(4, fy);
            }
            if (fz != 0L)
            {
                pg1.b(5, fz);
            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return d(pf1);
        }

        protected int c()
        {
            int l = super.c();
            int k = l;
            if (!fv.equals(""))
            {
                k = l + pg.j(1, fv);
            }
            l = k;
            if (fw != 0L)
            {
                l = k + pg.d(2, fw);
            }
            k = l;
            if (fx != 0x7fffffffL)
            {
                k = l + pg.d(3, fx);
            }
            l = k;
            if (fy)
            {
                l = k + pg.c(4, fy);
            }
            k = l;
            if (fz != 0L)
            {
                k = l + pg.d(5, fz);
            }
            return k;
        }

        public c d(pf pf1)
            throws IOException
        {
            do
            {
                int k = pf1.qi();
                switch (k)
                {
                default:
                    if (a(pf1, k))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    fv = pf1.readString();
                    break;

                case 16: // '\020'
                    fw = pf1.qk();
                    break;

                case 24: // '\030'
                    fx = pf1.qk();
                    break;

                case 32: // ' '
                    fy = pf1.qm();
                    break;

                case 40: // '('
                    fz = pf1.qk();
                    break;
                }
            } while (true);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            if (obj != this) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            return flag;
_L2:
            flag = flag1;
            if (!(obj instanceof c))
            {
                continue; /* Loop/switch isn't completed */
            }
            obj = (c)obj;
            if (fv != null)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((c) (obj)).fv != null)
            {
                continue; /* Loop/switch isn't completed */
            }
_L5:
            flag = flag1;
            if (fw == ((c) (obj)).fw)
            {
                flag = flag1;
                if (fx == ((c) (obj)).fx)
                {
                    flag = flag1;
                    if (fy == ((c) (obj)).fy)
                    {
                        flag = flag1;
                        if (fz == ((c) (obj)).fz)
                        {
                            return a(((ph) (obj)));
                        }
                    }
                }
            }
            if (true) goto _L4; else goto _L3
_L3:
            if (!fv.equals(((c) (obj)).fv))
            {
                return false;
            }
              goto _L5
            if (true) goto _L4; else goto _L6
_L6:
        }

        public c g()
        {
            fv = "";
            fw = 0L;
            fx = 0x7fffffffL;
            fy = false;
            fz = 0L;
            awJ = null;
            awU = -1;
            return this;
        }

        public int hashCode()
        {
            int k;
            char c1;
            int l;
            int i1;
            if (fv == null)
            {
                k = 0;
            } else
            {
                k = fv.hashCode();
            }
            l = (int)(fw ^ fw >>> 32);
            i1 = (int)(fx ^ fx >>> 32);
            if (fy)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            return ((c1 + (((k + 527) * 31 + l) * 31 + i1) * 31) * 31 + (int)(fz ^ fz >>> 32)) * 31 + qz();
        }

        public c()
        {
            g();
        }
    }

    public static final class d extends ph
    {

        public d.a fA[];
        public d.a fB[];
        public c fC[];

        public void a(pg pg1)
            throws IOException
        {
            boolean flag = false;
            if (fA != null && fA.length > 0)
            {
                for (int k = 0; k < fA.length; k++)
                {
                    d.a a1 = fA[k];
                    if (a1 != null)
                    {
                        pg1.a(1, a1);
                    }
                }

            }
            if (fB != null && fB.length > 0)
            {
                for (int l = 0; l < fB.length; l++)
                {
                    d.a a2 = fB[l];
                    if (a2 != null)
                    {
                        pg1.a(2, a2);
                    }
                }

            }
            if (fC != null && fC.length > 0)
            {
                for (int i1 = ((flag) ? 1 : 0); i1 < fC.length; i1++)
                {
                    c c1 = fC[i1];
                    if (c1 != null)
                    {
                        pg1.a(3, c1);
                    }
                }

            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return e(pf1);
        }

        protected int c()
        {
            boolean flag = false;
            int k = super.c();
            int l = k;
            if (fA != null)
            {
                l = k;
                if (fA.length > 0)
                {
                    for (l = 0; l < fA.length;)
                    {
                        d.a a1 = fA[l];
                        int k1 = k;
                        if (a1 != null)
                        {
                            k1 = k + pg.c(1, a1);
                        }
                        l++;
                        k = k1;
                    }

                    l = k;
                }
            }
            k = l;
            if (fB != null)
            {
                k = l;
                if (fB.length > 0)
                {
                    k = l;
                    for (int i1 = 0; i1 < fB.length;)
                    {
                        d.a a2 = fB[i1];
                        int l1 = k;
                        if (a2 != null)
                        {
                            l1 = k + pg.c(2, a2);
                        }
                        i1++;
                        k = l1;
                    }

                }
            }
            int i2 = k;
            if (fC != null)
            {
                i2 = k;
                if (fC.length > 0)
                {
                    int j1 = ((flag) ? 1 : 0);
                    do
                    {
                        i2 = k;
                        if (j1 >= fC.length)
                        {
                            break;
                        }
                        c c1 = fC[j1];
                        i2 = k;
                        if (c1 != null)
                        {
                            i2 = k + pg.c(3, c1);
                        }
                        j1++;
                        k = i2;
                    } while (true);
                }
            }
            return i2;
        }

        public d e(pf pf1)
            throws IOException
        {
            do
            {
                int k = pf1.qi();
                switch (k)
                {
                default:
                    if (a(pf1, k))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int k1 = pq.b(pf1, 10);
                    d.a aa[];
                    int l;
                    if (fA == null)
                    {
                        l = 0;
                    } else
                    {
                        l = fA.length;
                    }
                    aa = new d.a[k1 + l];
                    k1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(fA, 0, aa, 0, l);
                        k1 = l;
                    }
                    for (; k1 < aa.length - 1; k1++)
                    {
                        aa[k1] = new d.a();
                        pf1.a(aa[k1]);
                        pf1.qi();
                    }

                    aa[k1] = new d.a();
                    pf1.a(aa[k1]);
                    fA = aa;
                    break;

                case 18: // '\022'
                    int l1 = pq.b(pf1, 18);
                    d.a aa1[];
                    int i1;
                    if (fB == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = fB.length;
                    }
                    aa1 = new d.a[l1 + i1];
                    l1 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(fB, 0, aa1, 0, i1);
                        l1 = i1;
                    }
                    for (; l1 < aa1.length - 1; l1++)
                    {
                        aa1[l1] = new d.a();
                        pf1.a(aa1[l1]);
                        pf1.qi();
                    }

                    aa1[l1] = new d.a();
                    pf1.a(aa1[l1]);
                    fB = aa1;
                    break;

                case 26: // '\032'
                    int i2 = pq.b(pf1, 26);
                    c ac[];
                    int j1;
                    if (fC == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = fC.length;
                    }
                    ac = new c[i2 + j1];
                    i2 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(fC, 0, ac, 0, j1);
                        i2 = j1;
                    }
                    for (; i2 < ac.length - 1; i2++)
                    {
                        ac[i2] = new c();
                        pf1.a(ac[i2]);
                        pf1.qi();
                    }

                    ac[i2] = new c();
                    pf1.a(ac[i2]);
                    fC = ac;
                    break;
                }
            } while (true);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof d)
                {
                    obj = (d)obj;
                    flag = flag1;
                    if (pl.equals(fA, ((d) (obj)).fA))
                    {
                        flag = flag1;
                        if (pl.equals(fB, ((d) (obj)).fB))
                        {
                            flag = flag1;
                            if (pl.equals(fC, ((d) (obj)).fC))
                            {
                                return a(((ph) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public d h()
        {
            fA = com.google.android.gms.internal.d.a.r();
            fB = com.google.android.gms.internal.d.a.r();
            fC = c.f();
            awJ = null;
            awU = -1;
            return this;
        }

        public int hashCode()
        {
            return (((pl.hashCode(fA) + 527) * 31 + pl.hashCode(fB)) * 31 + pl.hashCode(fC)) * 31 + qz();
        }

        public d()
        {
            h();
        }
    }

    public static final class e extends ph
    {

        private static volatile e fD[];
        public int key;
        public int value;

        public static e[] i()
        {
            if (fD == null)
            {
                synchronized (pl.awT)
                {
                    if (fD == null)
                    {
                        fD = new e[0];
                    }
                }
            }
            return fD;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(pg pg1)
            throws IOException
        {
            pg1.s(1, key);
            pg1.s(2, value);
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return f(pf1);
        }

        protected int c()
        {
            return super.c() + pg.u(1, key) + pg.u(2, value);
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof e)
                {
                    obj = (e)obj;
                    flag = flag1;
                    if (key == ((e) (obj)).key)
                    {
                        flag = flag1;
                        if (value == ((e) (obj)).value)
                        {
                            return a(((ph) (obj)));
                        }
                    }
                }
            }
            return flag;
        }

        public e f(pf pf1)
            throws IOException
        {
            do
            {
                int k = pf1.qi();
                switch (k)
                {
                default:
                    if (a(pf1, k))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    key = pf1.ql();
                    break;

                case 16: // '\020'
                    value = pf1.ql();
                    break;
                }
            } while (true);
        }

        public int hashCode()
        {
            return ((key + 527) * 31 + value) * 31 + qz();
        }

        public e j()
        {
            key = 0;
            value = 0;
            awJ = null;
            awU = -1;
            return this;
        }

        public e()
        {
            j();
        }
    }

    public static final class f extends ph
    {

        public String fE[];
        public String fF[];
        public d.a fG[];
        public e fH[];
        public b fI[];
        public b fJ[];
        public b fK[];
        public g fL[];
        public String fM;
        public String fN;
        public String fO;
        public a fP;
        public float fQ;
        public boolean fR;
        public String fS[];
        public int fT;
        public String version;

        public static f a(byte abyte0[])
            throws pm
        {
            return (f)pn.a(new f(), abyte0);
        }

        public void a(pg pg1)
            throws IOException
        {
            boolean flag = false;
            if (fF != null && fF.length > 0)
            {
                for (int l = 0; l < fF.length; l++)
                {
                    String s = fF[l];
                    if (s != null)
                    {
                        pg1.b(1, s);
                    }
                }

            }
            if (fG != null && fG.length > 0)
            {
                for (int i1 = 0; i1 < fG.length; i1++)
                {
                    d.a a1 = fG[i1];
                    if (a1 != null)
                    {
                        pg1.a(2, a1);
                    }
                }

            }
            if (fH != null && fH.length > 0)
            {
                for (int j1 = 0; j1 < fH.length; j1++)
                {
                    e e1 = fH[j1];
                    if (e1 != null)
                    {
                        pg1.a(3, e1);
                    }
                }

            }
            if (fI != null && fI.length > 0)
            {
                for (int k1 = 0; k1 < fI.length; k1++)
                {
                    b b1 = fI[k1];
                    if (b1 != null)
                    {
                        pg1.a(4, b1);
                    }
                }

            }
            if (fJ != null && fJ.length > 0)
            {
                for (int l1 = 0; l1 < fJ.length; l1++)
                {
                    b b2 = fJ[l1];
                    if (b2 != null)
                    {
                        pg1.a(5, b2);
                    }
                }

            }
            if (fK != null && fK.length > 0)
            {
                for (int i2 = 0; i2 < fK.length; i2++)
                {
                    b b3 = fK[i2];
                    if (b3 != null)
                    {
                        pg1.a(6, b3);
                    }
                }

            }
            if (fL != null && fL.length > 0)
            {
                for (int j2 = 0; j2 < fL.length; j2++)
                {
                    g g1 = fL[j2];
                    if (g1 != null)
                    {
                        pg1.a(7, g1);
                    }
                }

            }
            if (!fM.equals(""))
            {
                pg1.b(9, fM);
            }
            if (!fN.equals(""))
            {
                pg1.b(10, fN);
            }
            if (!fO.equals("0"))
            {
                pg1.b(12, fO);
            }
            if (!version.equals(""))
            {
                pg1.b(13, version);
            }
            if (fP != null)
            {
                pg1.a(14, fP);
            }
            if (Float.floatToIntBits(fQ) != Float.floatToIntBits(0.0F))
            {
                pg1.b(15, fQ);
            }
            if (fS != null && fS.length > 0)
            {
                for (int k2 = 0; k2 < fS.length; k2++)
                {
                    String s1 = fS[k2];
                    if (s1 != null)
                    {
                        pg1.b(16, s1);
                    }
                }

            }
            if (fT != 0)
            {
                pg1.s(17, fT);
            }
            if (fR)
            {
                pg1.b(18, fR);
            }
            if (fE != null && fE.length > 0)
            {
                for (int l2 = ((flag) ? 1 : 0); l2 < fE.length; l2++)
                {
                    String s2 = fE[l2];
                    if (s2 != null)
                    {
                        pg1.b(19, s2);
                    }
                }

            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return g(pf1);
        }

        protected int c()
        {
            boolean flag = false;
            int j5 = super.c();
            int i1;
            int j1;
            int j3;
            if (fF != null && fF.length > 0)
            {
                int l = 0;
                j1 = 0;
                int k1;
                int l3;
                for (k1 = 0; l < fF.length; k1 = l3)
                {
                    String s = fF[l];
                    int k4 = j1;
                    l3 = k1;
                    if (s != null)
                    {
                        l3 = k1 + 1;
                        k4 = j1 + pg.di(s);
                    }
                    l++;
                    j1 = k4;
                }

                j1 = j5 + j1 + k1 * 1;
            } else
            {
                j1 = j5;
            }
            i1 = j1;
            if (fG != null)
            {
                i1 = j1;
                if (fG.length > 0)
                {
                    i1 = j1;
                    for (j1 = 0; j1 < fG.length;)
                    {
                        d.a a1 = fG[j1];
                        int l1 = i1;
                        if (a1 != null)
                        {
                            l1 = i1 + pg.c(2, a1);
                        }
                        j1++;
                        i1 = l1;
                    }

                }
            }
            j1 = i1;
            if (fH != null)
            {
                j1 = i1;
                if (fH.length > 0)
                {
                    for (j1 = 0; j1 < fH.length;)
                    {
                        e e1 = fH[j1];
                        int i2 = i1;
                        if (e1 != null)
                        {
                            i2 = i1 + pg.c(3, e1);
                        }
                        j1++;
                        i1 = i2;
                    }

                    j1 = i1;
                }
            }
            i1 = j1;
            if (fI != null)
            {
                i1 = j1;
                if (fI.length > 0)
                {
                    i1 = j1;
                    for (j1 = 0; j1 < fI.length;)
                    {
                        b b1 = fI[j1];
                        int j2 = i1;
                        if (b1 != null)
                        {
                            j2 = i1 + pg.c(4, b1);
                        }
                        j1++;
                        i1 = j2;
                    }

                }
            }
            j1 = i1;
            if (fJ != null)
            {
                j1 = i1;
                if (fJ.length > 0)
                {
                    for (j1 = 0; j1 < fJ.length;)
                    {
                        b b2 = fJ[j1];
                        int k2 = i1;
                        if (b2 != null)
                        {
                            k2 = i1 + pg.c(5, b2);
                        }
                        j1++;
                        i1 = k2;
                    }

                    j1 = i1;
                }
            }
            i1 = j1;
            if (fK != null)
            {
                i1 = j1;
                if (fK.length > 0)
                {
                    i1 = j1;
                    for (j1 = 0; j1 < fK.length;)
                    {
                        b b3 = fK[j1];
                        int l2 = i1;
                        if (b3 != null)
                        {
                            l2 = i1 + pg.c(6, b3);
                        }
                        j1++;
                        i1 = l2;
                    }

                }
            }
            j1 = i1;
            if (fL != null)
            {
                j1 = i1;
                if (fL.length > 0)
                {
                    for (j1 = 0; j1 < fL.length;)
                    {
                        g g1 = fL[j1];
                        int i3 = i1;
                        if (g1 != null)
                        {
                            i3 = i1 + pg.c(7, g1);
                        }
                        j1++;
                        i1 = i3;
                    }

                    j1 = i1;
                }
            }
            i1 = j1;
            if (!fM.equals(""))
            {
                i1 = j1 + pg.j(9, fM);
            }
            j1 = i1;
            if (!fN.equals(""))
            {
                j1 = i1 + pg.j(10, fN);
            }
            i1 = j1;
            if (!fO.equals("0"))
            {
                i1 = j1 + pg.j(12, fO);
            }
            j1 = i1;
            if (!version.equals(""))
            {
                j1 = i1 + pg.j(13, version);
            }
            j3 = j1;
            if (fP != null)
            {
                j3 = j1 + pg.c(14, fP);
            }
            i1 = j3;
            if (Float.floatToIntBits(fQ) != Float.floatToIntBits(0.0F))
            {
                i1 = j3 + pg.c(15, fQ);
            }
            j1 = i1;
            if (fS != null)
            {
                j1 = i1;
                if (fS.length > 0)
                {
                    j1 = 0;
                    j3 = 0;
                    int i4;
                    int l4;
                    for (i4 = 0; j1 < fS.length; i4 = l4)
                    {
                        String s1 = fS[j1];
                        j5 = j3;
                        l4 = i4;
                        if (s1 != null)
                        {
                            l4 = i4 + 1;
                            j5 = j3 + pg.di(s1);
                        }
                        j1++;
                        j3 = j5;
                    }

                    j1 = i1 + j3 + i4 * 2;
                }
            }
            j3 = j1;
            if (fT != 0)
            {
                j3 = j1 + pg.u(17, fT);
            }
            i1 = j3;
            if (fR)
            {
                i1 = j3 + pg.c(18, fR);
            }
            j1 = i1;
            if (fE != null)
            {
                j1 = i1;
                if (fE.length > 0)
                {
                    int k3 = 0;
                    int j4 = 0;
                    for (j1 = ((flag) ? 1 : 0); j1 < fE.length;)
                    {
                        String s2 = fE[j1];
                        j5 = k3;
                        int i5 = j4;
                        if (s2 != null)
                        {
                            i5 = j4 + 1;
                            j5 = k3 + pg.di(s2);
                        }
                        j1++;
                        k3 = j5;
                        j4 = i5;
                    }

                    j1 = i1 + k3 + j4 * 2;
                }
            }
            return j1;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            if (obj != this) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            return flag;
_L2:
            flag = flag1;
            if (!(obj instanceof f)) goto _L4; else goto _L3
_L3:
            obj = (f)obj;
            flag = flag1;
            if (!pl.equals(fE, ((f) (obj)).fE)) goto _L4; else goto _L5
_L5:
            flag = flag1;
            if (!pl.equals(fF, ((f) (obj)).fF)) goto _L4; else goto _L6
_L6:
            flag = flag1;
            if (!pl.equals(fG, ((f) (obj)).fG)) goto _L4; else goto _L7
_L7:
            flag = flag1;
            if (!pl.equals(fH, ((f) (obj)).fH)) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!pl.equals(fI, ((f) (obj)).fI)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!pl.equals(fJ, ((f) (obj)).fJ)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!pl.equals(fK, ((f) (obj)).fK)) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (!pl.equals(fL, ((f) (obj)).fL)) goto _L4; else goto _L12
_L12:
            if (fM != null) goto _L14; else goto _L13
_L13:
            flag = flag1;
            if (((f) (obj)).fM != null) goto _L4; else goto _L15
_L15:
            if (fN != null) goto _L17; else goto _L16
_L16:
            flag = flag1;
            if (((f) (obj)).fN != null) goto _L4; else goto _L18
_L18:
            if (fO != null) goto _L20; else goto _L19
_L19:
            flag = flag1;
            if (((f) (obj)).fO != null) goto _L4; else goto _L21
_L21:
            if (version != null) goto _L23; else goto _L22
_L22:
            flag = flag1;
            if (((f) (obj)).version != null) goto _L4; else goto _L24
_L24:
            if (fP != null)
            {
                break MISSING_BLOCK_LABEL_364;
            }
            flag = flag1;
            if (((f) (obj)).fP != null) goto _L4; else goto _L25
_L25:
            flag = flag1;
            if (Float.floatToIntBits(fQ) == Float.floatToIntBits(((f) (obj)).fQ))
            {
                flag = flag1;
                if (fR == ((f) (obj)).fR)
                {
                    flag = flag1;
                    if (pl.equals(fS, ((f) (obj)).fS))
                    {
                        flag = flag1;
                        if (fT == ((f) (obj)).fT)
                        {
                            return a(((ph) (obj)));
                        }
                    }
                }
            }
              goto _L4
_L14:
            if (!fM.equals(((f) (obj)).fM))
            {
                return false;
            }
              goto _L15
_L17:
            if (!fN.equals(((f) (obj)).fN))
            {
                return false;
            }
              goto _L18
_L20:
            if (!fO.equals(((f) (obj)).fO))
            {
                return false;
            }
              goto _L21
_L23:
            if (!version.equals(((f) (obj)).version))
            {
                return false;
            }
              goto _L24
            if (!fP.equals(((f) (obj)).fP))
            {
                return false;
            }
              goto _L25
        }

        public f g(pf pf1)
            throws IOException
        {
            do
            {
                int l = pf1.qi();
                switch (l)
                {
                default:
                    if (a(pf1, l))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int j3 = pq.b(pf1, 10);
                    String as[];
                    int i1;
                    if (fF == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = fF.length;
                    }
                    as = new String[j3 + i1];
                    j3 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(fF, 0, as, 0, i1);
                        j3 = i1;
                    }
                    for (; j3 < as.length - 1; j3++)
                    {
                        as[j3] = pf1.readString();
                        pf1.qi();
                    }

                    as[j3] = pf1.readString();
                    fF = as;
                    break;

                case 18: // '\022'
                    int k3 = pq.b(pf1, 18);
                    d.a aa[];
                    int j1;
                    if (fG == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = fG.length;
                    }
                    aa = new d.a[k3 + j1];
                    k3 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(fG, 0, aa, 0, j1);
                        k3 = j1;
                    }
                    for (; k3 < aa.length - 1; k3++)
                    {
                        aa[k3] = new d.a();
                        pf1.a(aa[k3]);
                        pf1.qi();
                    }

                    aa[k3] = new d.a();
                    pf1.a(aa[k3]);
                    fG = aa;
                    break;

                case 26: // '\032'
                    int l3 = pq.b(pf1, 26);
                    e ae[];
                    int k1;
                    if (fH == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = fH.length;
                    }
                    ae = new e[l3 + k1];
                    l3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(fH, 0, ae, 0, k1);
                        l3 = k1;
                    }
                    for (; l3 < ae.length - 1; l3++)
                    {
                        ae[l3] = new e();
                        pf1.a(ae[l3]);
                        pf1.qi();
                    }

                    ae[l3] = new e();
                    pf1.a(ae[l3]);
                    fH = ae;
                    break;

                case 34: // '"'
                    int i4 = pq.b(pf1, 34);
                    b ab[];
                    int l1;
                    if (fI == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = fI.length;
                    }
                    ab = new b[i4 + l1];
                    i4 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(fI, 0, ab, 0, l1);
                        i4 = l1;
                    }
                    for (; i4 < ab.length - 1; i4++)
                    {
                        ab[i4] = new b();
                        pf1.a(ab[i4]);
                        pf1.qi();
                    }

                    ab[i4] = new b();
                    pf1.a(ab[i4]);
                    fI = ab;
                    break;

                case 42: // '*'
                    int j4 = pq.b(pf1, 42);
                    b ab1[];
                    int i2;
                    if (fJ == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = fJ.length;
                    }
                    ab1 = new b[j4 + i2];
                    j4 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(fJ, 0, ab1, 0, i2);
                        j4 = i2;
                    }
                    for (; j4 < ab1.length - 1; j4++)
                    {
                        ab1[j4] = new b();
                        pf1.a(ab1[j4]);
                        pf1.qi();
                    }

                    ab1[j4] = new b();
                    pf1.a(ab1[j4]);
                    fJ = ab1;
                    break;

                case 50: // '2'
                    int k4 = pq.b(pf1, 50);
                    b ab2[];
                    int j2;
                    if (fK == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = fK.length;
                    }
                    ab2 = new b[k4 + j2];
                    k4 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(fK, 0, ab2, 0, j2);
                        k4 = j2;
                    }
                    for (; k4 < ab2.length - 1; k4++)
                    {
                        ab2[k4] = new b();
                        pf1.a(ab2[k4]);
                        pf1.qi();
                    }

                    ab2[k4] = new b();
                    pf1.a(ab2[k4]);
                    fK = ab2;
                    break;

                case 58: // ':'
                    int l4 = pq.b(pf1, 58);
                    g ag[];
                    int k2;
                    if (fL == null)
                    {
                        k2 = 0;
                    } else
                    {
                        k2 = fL.length;
                    }
                    ag = new g[l4 + k2];
                    l4 = k2;
                    if (k2 != 0)
                    {
                        System.arraycopy(fL, 0, ag, 0, k2);
                        l4 = k2;
                    }
                    for (; l4 < ag.length - 1; l4++)
                    {
                        ag[l4] = new g();
                        pf1.a(ag[l4]);
                        pf1.qi();
                    }

                    ag[l4] = new g();
                    pf1.a(ag[l4]);
                    fL = ag;
                    break;

                case 74: // 'J'
                    fM = pf1.readString();
                    break;

                case 82: // 'R'
                    fN = pf1.readString();
                    break;

                case 98: // 'b'
                    fO = pf1.readString();
                    break;

                case 106: // 'j'
                    version = pf1.readString();
                    break;

                case 114: // 'r'
                    if (fP == null)
                    {
                        fP = new a();
                    }
                    pf1.a(fP);
                    break;

                case 125: // '}'
                    fQ = pf1.readFloat();
                    break;

                case 130: 
                    int i5 = pq.b(pf1, 130);
                    String as1[];
                    int l2;
                    if (fS == null)
                    {
                        l2 = 0;
                    } else
                    {
                        l2 = fS.length;
                    }
                    as1 = new String[i5 + l2];
                    i5 = l2;
                    if (l2 != 0)
                    {
                        System.arraycopy(fS, 0, as1, 0, l2);
                        i5 = l2;
                    }
                    for (; i5 < as1.length - 1; i5++)
                    {
                        as1[i5] = pf1.readString();
                        pf1.qi();
                    }

                    as1[i5] = pf1.readString();
                    fS = as1;
                    break;

                case 136: 
                    fT = pf1.ql();
                    break;

                case 144: 
                    fR = pf1.qm();
                    break;

                case 154: 
                    int j5 = pq.b(pf1, 154);
                    String as2[];
                    int i3;
                    if (fE == null)
                    {
                        i3 = 0;
                    } else
                    {
                        i3 = fE.length;
                    }
                    as2 = new String[j5 + i3];
                    j5 = i3;
                    if (i3 != 0)
                    {
                        System.arraycopy(fE, 0, as2, 0, i3);
                        j5 = i3;
                    }
                    for (; j5 < as2.length - 1; j5++)
                    {
                        as2[j5] = pf1.readString();
                        pf1.qi();
                    }

                    as2[j5] = pf1.readString();
                    fE = as2;
                    break;
                }
            } while (true);
        }

        public int hashCode()
        {
            int l1 = 0;
            int i2 = pl.hashCode(fE);
            int j2 = pl.hashCode(fF);
            int k2 = pl.hashCode(fG);
            int l2 = pl.hashCode(fH);
            int i3 = pl.hashCode(fI);
            int j3 = pl.hashCode(fJ);
            int k3 = pl.hashCode(fK);
            int l3 = pl.hashCode(fL);
            int l;
            int i1;
            int j1;
            int k1;
            char c1;
            int i4;
            if (fM == null)
            {
                l = 0;
            } else
            {
                l = fM.hashCode();
            }
            if (fN == null)
            {
                i1 = 0;
            } else
            {
                i1 = fN.hashCode();
            }
            if (fO == null)
            {
                j1 = 0;
            } else
            {
                j1 = fO.hashCode();
            }
            if (version == null)
            {
                k1 = 0;
            } else
            {
                k1 = version.hashCode();
            }
            if (fP != null)
            {
                l1 = fP.hashCode();
            }
            i4 = Float.floatToIntBits(fQ);
            if (fR)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            return (((c1 + (((k1 + (j1 + (i1 + (l + ((((((((i2 + 527) * 31 + j2) * 31 + k2) * 31 + l2) * 31 + i3) * 31 + j3) * 31 + k3) * 31 + l3) * 31) * 31) * 31) * 31) * 31 + l1) * 31 + i4) * 31) * 31 + pl.hashCode(fS)) * 31 + fT) * 31 + qz();
        }

        public f k()
        {
            fE = pq.axb;
            fF = pq.axb;
            fG = com.google.android.gms.internal.d.a.r();
            fH = e.i();
            fI = b.d();
            fJ = b.d();
            fK = b.d();
            fL = g.l();
            fM = "";
            fN = "";
            fO = "0";
            version = "";
            fP = null;
            fQ = 0.0F;
            fR = false;
            fS = pq.axb;
            fT = 0;
            awJ = null;
            awU = -1;
            return this;
        }

        public f()
        {
            k();
        }
    }

    public static final class g extends ph
    {

        private static volatile g fU[];
        public int fV[];
        public int fW[];
        public int fX[];
        public int fY[];
        public int fZ[];
        public int ga[];
        public int gb[];
        public int gc[];
        public int gd[];
        public int ge[];

        public static g[] l()
        {
            if (fU == null)
            {
                synchronized (pl.awT)
                {
                    if (fU == null)
                    {
                        fU = new g[0];
                    }
                }
            }
            return fU;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(pg pg1)
            throws IOException
        {
            boolean flag = false;
            if (fV != null && fV.length > 0)
            {
                for (int k = 0; k < fV.length; k++)
                {
                    pg1.s(1, fV[k]);
                }

            }
            if (fW != null && fW.length > 0)
            {
                for (int i1 = 0; i1 < fW.length; i1++)
                {
                    pg1.s(2, fW[i1]);
                }

            }
            if (fX != null && fX.length > 0)
            {
                for (int j1 = 0; j1 < fX.length; j1++)
                {
                    pg1.s(3, fX[j1]);
                }

            }
            if (fY != null && fY.length > 0)
            {
                for (int k1 = 0; k1 < fY.length; k1++)
                {
                    pg1.s(4, fY[k1]);
                }

            }
            if (fZ != null && fZ.length > 0)
            {
                for (int l1 = 0; l1 < fZ.length; l1++)
                {
                    pg1.s(5, fZ[l1]);
                }

            }
            if (ga != null && ga.length > 0)
            {
                for (int i2 = 0; i2 < ga.length; i2++)
                {
                    pg1.s(6, ga[i2]);
                }

            }
            if (gb != null && gb.length > 0)
            {
                for (int j2 = 0; j2 < gb.length; j2++)
                {
                    pg1.s(7, gb[j2]);
                }

            }
            if (gc != null && gc.length > 0)
            {
                for (int k2 = 0; k2 < gc.length; k2++)
                {
                    pg1.s(8, gc[k2]);
                }

            }
            if (gd != null && gd.length > 0)
            {
                for (int l2 = 0; l2 < gd.length; l2++)
                {
                    pg1.s(9, gd[l2]);
                }

            }
            if (ge != null && ge.length > 0)
            {
                for (int i3 = ((flag) ? 1 : 0); i3 < ge.length; i3++)
                {
                    pg1.s(10, ge[i3]);
                }

            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return h(pf1);
        }

        protected int c()
        {
            boolean flag = false;
            int k1 = super.c();
            int i1;
            int j1;
            if (fV != null && fV.length > 0)
            {
                int k = 0;
                j1 = 0;
                for (; k < fV.length; k++)
                {
                    j1 += pg.gw(fV[k]);
                }

                j1 = k1 + j1 + fV.length * 1;
            } else
            {
                j1 = k1;
            }
            i1 = j1;
            if (fW != null)
            {
                i1 = j1;
                if (fW.length > 0)
                {
                    i1 = 0;
                    k1 = 0;
                    for (; i1 < fW.length; i1++)
                    {
                        k1 += pg.gw(fW[i1]);
                    }

                    i1 = j1 + k1 + fW.length * 1;
                }
            }
            j1 = i1;
            if (fX != null)
            {
                j1 = i1;
                if (fX.length > 0)
                {
                    j1 = 0;
                    k1 = 0;
                    for (; j1 < fX.length; j1++)
                    {
                        k1 += pg.gw(fX[j1]);
                    }

                    j1 = i1 + k1 + fX.length * 1;
                }
            }
            i1 = j1;
            if (fY != null)
            {
                i1 = j1;
                if (fY.length > 0)
                {
                    i1 = 0;
                    k1 = 0;
                    for (; i1 < fY.length; i1++)
                    {
                        k1 += pg.gw(fY[i1]);
                    }

                    i1 = j1 + k1 + fY.length * 1;
                }
            }
            j1 = i1;
            if (fZ != null)
            {
                j1 = i1;
                if (fZ.length > 0)
                {
                    j1 = 0;
                    k1 = 0;
                    for (; j1 < fZ.length; j1++)
                    {
                        k1 += pg.gw(fZ[j1]);
                    }

                    j1 = i1 + k1 + fZ.length * 1;
                }
            }
            i1 = j1;
            if (ga != null)
            {
                i1 = j1;
                if (ga.length > 0)
                {
                    i1 = 0;
                    k1 = 0;
                    for (; i1 < ga.length; i1++)
                    {
                        k1 += pg.gw(ga[i1]);
                    }

                    i1 = j1 + k1 + ga.length * 1;
                }
            }
            j1 = i1;
            if (gb != null)
            {
                j1 = i1;
                if (gb.length > 0)
                {
                    j1 = 0;
                    k1 = 0;
                    for (; j1 < gb.length; j1++)
                    {
                        k1 += pg.gw(gb[j1]);
                    }

                    j1 = i1 + k1 + gb.length * 1;
                }
            }
            i1 = j1;
            if (gc != null)
            {
                i1 = j1;
                if (gc.length > 0)
                {
                    i1 = 0;
                    k1 = 0;
                    for (; i1 < gc.length; i1++)
                    {
                        k1 += pg.gw(gc[i1]);
                    }

                    i1 = j1 + k1 + gc.length * 1;
                }
            }
            j1 = i1;
            if (gd != null)
            {
                j1 = i1;
                if (gd.length > 0)
                {
                    j1 = 0;
                    k1 = 0;
                    for (; j1 < gd.length; j1++)
                    {
                        k1 += pg.gw(gd[j1]);
                    }

                    j1 = i1 + k1 + gd.length * 1;
                }
            }
            i1 = j1;
            if (ge != null)
            {
                i1 = j1;
                if (ge.length > 0)
                {
                    k1 = 0;
                    for (i1 = ((flag) ? 1 : 0); i1 < ge.length; i1++)
                    {
                        k1 += pg.gw(ge[i1]);
                    }

                    i1 = j1 + k1 + ge.length * 1;
                }
            }
            return i1;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof g)
                {
                    obj = (g)obj;
                    flag = flag1;
                    if (pl.equals(fV, ((g) (obj)).fV))
                    {
                        flag = flag1;
                        if (pl.equals(fW, ((g) (obj)).fW))
                        {
                            flag = flag1;
                            if (pl.equals(fX, ((g) (obj)).fX))
                            {
                                flag = flag1;
                                if (pl.equals(fY, ((g) (obj)).fY))
                                {
                                    flag = flag1;
                                    if (pl.equals(fZ, ((g) (obj)).fZ))
                                    {
                                        flag = flag1;
                                        if (pl.equals(ga, ((g) (obj)).ga))
                                        {
                                            flag = flag1;
                                            if (pl.equals(gb, ((g) (obj)).gb))
                                            {
                                                flag = flag1;
                                                if (pl.equals(gc, ((g) (obj)).gc))
                                                {
                                                    flag = flag1;
                                                    if (pl.equals(gd, ((g) (obj)).gd))
                                                    {
                                                        flag = flag1;
                                                        if (pl.equals(ge, ((g) (obj)).ge))
                                                        {
                                                            return a(((ph) (obj)));
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public g h(pf pf1)
            throws IOException
        {
            do
            {
                int k = pf1.qi();
                switch (k)
                {
                default:
                    if (a(pf1, k))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    int i6 = pq.b(pf1, 8);
                    int ai[];
                    int i1;
                    if (fV == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = fV.length;
                    }
                    ai = new int[i6 + i1];
                    i6 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(fV, 0, ai, 0, i1);
                        i6 = i1;
                    }
                    for (; i6 < ai.length - 1; i6++)
                    {
                        ai[i6] = pf1.ql();
                        pf1.qi();
                    }

                    ai[i6] = pf1.ql();
                    fV = ai;
                    break;

                case 10: // '\n'
                    int i11 = pf1.gp(pf1.qp());
                    int j1 = pf1.getPosition();
                    int j6;
                    for (j6 = 0; pf1.qu() > 0; j6++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(j1);
                    int ai1[];
                    if (fV == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = fV.length;
                    }
                    ai1 = new int[j6 + j1];
                    j6 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(fV, 0, ai1, 0, j1);
                        j6 = j1;
                    }
                    for (; j6 < ai1.length; j6++)
                    {
                        ai1[j6] = pf1.ql();
                    }

                    fV = ai1;
                    pf1.gq(i11);
                    break;

                case 16: // '\020'
                    int k6 = pq.b(pf1, 16);
                    int ai2[];
                    int k1;
                    if (fW == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = fW.length;
                    }
                    ai2 = new int[k6 + k1];
                    k6 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(fW, 0, ai2, 0, k1);
                        k6 = k1;
                    }
                    for (; k6 < ai2.length - 1; k6++)
                    {
                        ai2[k6] = pf1.ql();
                        pf1.qi();
                    }

                    ai2[k6] = pf1.ql();
                    fW = ai2;
                    break;

                case 18: // '\022'
                    int j11 = pf1.gp(pf1.qp());
                    int l1 = pf1.getPosition();
                    int l6;
                    for (l6 = 0; pf1.qu() > 0; l6++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(l1);
                    int ai3[];
                    if (fW == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = fW.length;
                    }
                    ai3 = new int[l6 + l1];
                    l6 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(fW, 0, ai3, 0, l1);
                        l6 = l1;
                    }
                    for (; l6 < ai3.length; l6++)
                    {
                        ai3[l6] = pf1.ql();
                    }

                    fW = ai3;
                    pf1.gq(j11);
                    break;

                case 24: // '\030'
                    int i7 = pq.b(pf1, 24);
                    int ai4[];
                    int i2;
                    if (fX == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = fX.length;
                    }
                    ai4 = new int[i7 + i2];
                    i7 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(fX, 0, ai4, 0, i2);
                        i7 = i2;
                    }
                    for (; i7 < ai4.length - 1; i7++)
                    {
                        ai4[i7] = pf1.ql();
                        pf1.qi();
                    }

                    ai4[i7] = pf1.ql();
                    fX = ai4;
                    break;

                case 26: // '\032'
                    int k11 = pf1.gp(pf1.qp());
                    int j2 = pf1.getPosition();
                    int j7;
                    for (j7 = 0; pf1.qu() > 0; j7++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(j2);
                    int ai5[];
                    if (fX == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = fX.length;
                    }
                    ai5 = new int[j7 + j2];
                    j7 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(fX, 0, ai5, 0, j2);
                        j7 = j2;
                    }
                    for (; j7 < ai5.length; j7++)
                    {
                        ai5[j7] = pf1.ql();
                    }

                    fX = ai5;
                    pf1.gq(k11);
                    break;

                case 32: // ' '
                    int k7 = pq.b(pf1, 32);
                    int ai6[];
                    int k2;
                    if (fY == null)
                    {
                        k2 = 0;
                    } else
                    {
                        k2 = fY.length;
                    }
                    ai6 = new int[k7 + k2];
                    k7 = k2;
                    if (k2 != 0)
                    {
                        System.arraycopy(fY, 0, ai6, 0, k2);
                        k7 = k2;
                    }
                    for (; k7 < ai6.length - 1; k7++)
                    {
                        ai6[k7] = pf1.ql();
                        pf1.qi();
                    }

                    ai6[k7] = pf1.ql();
                    fY = ai6;
                    break;

                case 34: // '"'
                    int l11 = pf1.gp(pf1.qp());
                    int l2 = pf1.getPosition();
                    int l7;
                    for (l7 = 0; pf1.qu() > 0; l7++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(l2);
                    int ai7[];
                    if (fY == null)
                    {
                        l2 = 0;
                    } else
                    {
                        l2 = fY.length;
                    }
                    ai7 = new int[l7 + l2];
                    l7 = l2;
                    if (l2 != 0)
                    {
                        System.arraycopy(fY, 0, ai7, 0, l2);
                        l7 = l2;
                    }
                    for (; l7 < ai7.length; l7++)
                    {
                        ai7[l7] = pf1.ql();
                    }

                    fY = ai7;
                    pf1.gq(l11);
                    break;

                case 40: // '('
                    int i8 = pq.b(pf1, 40);
                    int ai8[];
                    int i3;
                    if (fZ == null)
                    {
                        i3 = 0;
                    } else
                    {
                        i3 = fZ.length;
                    }
                    ai8 = new int[i8 + i3];
                    i8 = i3;
                    if (i3 != 0)
                    {
                        System.arraycopy(fZ, 0, ai8, 0, i3);
                        i8 = i3;
                    }
                    for (; i8 < ai8.length - 1; i8++)
                    {
                        ai8[i8] = pf1.ql();
                        pf1.qi();
                    }

                    ai8[i8] = pf1.ql();
                    fZ = ai8;
                    break;

                case 42: // '*'
                    int i12 = pf1.gp(pf1.qp());
                    int j3 = pf1.getPosition();
                    int j8;
                    for (j8 = 0; pf1.qu() > 0; j8++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(j3);
                    int ai9[];
                    if (fZ == null)
                    {
                        j3 = 0;
                    } else
                    {
                        j3 = fZ.length;
                    }
                    ai9 = new int[j8 + j3];
                    j8 = j3;
                    if (j3 != 0)
                    {
                        System.arraycopy(fZ, 0, ai9, 0, j3);
                        j8 = j3;
                    }
                    for (; j8 < ai9.length; j8++)
                    {
                        ai9[j8] = pf1.ql();
                    }

                    fZ = ai9;
                    pf1.gq(i12);
                    break;

                case 48: // '0'
                    int k8 = pq.b(pf1, 48);
                    int ai10[];
                    int k3;
                    if (ga == null)
                    {
                        k3 = 0;
                    } else
                    {
                        k3 = ga.length;
                    }
                    ai10 = new int[k8 + k3];
                    k8 = k3;
                    if (k3 != 0)
                    {
                        System.arraycopy(ga, 0, ai10, 0, k3);
                        k8 = k3;
                    }
                    for (; k8 < ai10.length - 1; k8++)
                    {
                        ai10[k8] = pf1.ql();
                        pf1.qi();
                    }

                    ai10[k8] = pf1.ql();
                    ga = ai10;
                    break;

                case 50: // '2'
                    int j12 = pf1.gp(pf1.qp());
                    int l3 = pf1.getPosition();
                    int l8;
                    for (l8 = 0; pf1.qu() > 0; l8++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(l3);
                    int ai11[];
                    if (ga == null)
                    {
                        l3 = 0;
                    } else
                    {
                        l3 = ga.length;
                    }
                    ai11 = new int[l8 + l3];
                    l8 = l3;
                    if (l3 != 0)
                    {
                        System.arraycopy(ga, 0, ai11, 0, l3);
                        l8 = l3;
                    }
                    for (; l8 < ai11.length; l8++)
                    {
                        ai11[l8] = pf1.ql();
                    }

                    ga = ai11;
                    pf1.gq(j12);
                    break;

                case 56: // '8'
                    int i9 = pq.b(pf1, 56);
                    int ai12[];
                    int i4;
                    if (gb == null)
                    {
                        i4 = 0;
                    } else
                    {
                        i4 = gb.length;
                    }
                    ai12 = new int[i9 + i4];
                    i9 = i4;
                    if (i4 != 0)
                    {
                        System.arraycopy(gb, 0, ai12, 0, i4);
                        i9 = i4;
                    }
                    for (; i9 < ai12.length - 1; i9++)
                    {
                        ai12[i9] = pf1.ql();
                        pf1.qi();
                    }

                    ai12[i9] = pf1.ql();
                    gb = ai12;
                    break;

                case 58: // ':'
                    int k12 = pf1.gp(pf1.qp());
                    int j4 = pf1.getPosition();
                    int j9;
                    for (j9 = 0; pf1.qu() > 0; j9++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(j4);
                    int ai13[];
                    if (gb == null)
                    {
                        j4 = 0;
                    } else
                    {
                        j4 = gb.length;
                    }
                    ai13 = new int[j9 + j4];
                    j9 = j4;
                    if (j4 != 0)
                    {
                        System.arraycopy(gb, 0, ai13, 0, j4);
                        j9 = j4;
                    }
                    for (; j9 < ai13.length; j9++)
                    {
                        ai13[j9] = pf1.ql();
                    }

                    gb = ai13;
                    pf1.gq(k12);
                    break;

                case 64: // '@'
                    int k9 = pq.b(pf1, 64);
                    int ai14[];
                    int k4;
                    if (gc == null)
                    {
                        k4 = 0;
                    } else
                    {
                        k4 = gc.length;
                    }
                    ai14 = new int[k9 + k4];
                    k9 = k4;
                    if (k4 != 0)
                    {
                        System.arraycopy(gc, 0, ai14, 0, k4);
                        k9 = k4;
                    }
                    for (; k9 < ai14.length - 1; k9++)
                    {
                        ai14[k9] = pf1.ql();
                        pf1.qi();
                    }

                    ai14[k9] = pf1.ql();
                    gc = ai14;
                    break;

                case 66: // 'B'
                    int l12 = pf1.gp(pf1.qp());
                    int l4 = pf1.getPosition();
                    int l9;
                    for (l9 = 0; pf1.qu() > 0; l9++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(l4);
                    int ai15[];
                    if (gc == null)
                    {
                        l4 = 0;
                    } else
                    {
                        l4 = gc.length;
                    }
                    ai15 = new int[l9 + l4];
                    l9 = l4;
                    if (l4 != 0)
                    {
                        System.arraycopy(gc, 0, ai15, 0, l4);
                        l9 = l4;
                    }
                    for (; l9 < ai15.length; l9++)
                    {
                        ai15[l9] = pf1.ql();
                    }

                    gc = ai15;
                    pf1.gq(l12);
                    break;

                case 72: // 'H'
                    int i10 = pq.b(pf1, 72);
                    int ai16[];
                    int i5;
                    if (gd == null)
                    {
                        i5 = 0;
                    } else
                    {
                        i5 = gd.length;
                    }
                    ai16 = new int[i10 + i5];
                    i10 = i5;
                    if (i5 != 0)
                    {
                        System.arraycopy(gd, 0, ai16, 0, i5);
                        i10 = i5;
                    }
                    for (; i10 < ai16.length - 1; i10++)
                    {
                        ai16[i10] = pf1.ql();
                        pf1.qi();
                    }

                    ai16[i10] = pf1.ql();
                    gd = ai16;
                    break;

                case 74: // 'J'
                    int i13 = pf1.gp(pf1.qp());
                    int j5 = pf1.getPosition();
                    int j10;
                    for (j10 = 0; pf1.qu() > 0; j10++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(j5);
                    int ai17[];
                    if (gd == null)
                    {
                        j5 = 0;
                    } else
                    {
                        j5 = gd.length;
                    }
                    ai17 = new int[j10 + j5];
                    j10 = j5;
                    if (j5 != 0)
                    {
                        System.arraycopy(gd, 0, ai17, 0, j5);
                        j10 = j5;
                    }
                    for (; j10 < ai17.length; j10++)
                    {
                        ai17[j10] = pf1.ql();
                    }

                    gd = ai17;
                    pf1.gq(i13);
                    break;

                case 80: // 'P'
                    int k10 = pq.b(pf1, 80);
                    int ai18[];
                    int k5;
                    if (ge == null)
                    {
                        k5 = 0;
                    } else
                    {
                        k5 = ge.length;
                    }
                    ai18 = new int[k10 + k5];
                    k10 = k5;
                    if (k5 != 0)
                    {
                        System.arraycopy(ge, 0, ai18, 0, k5);
                        k10 = k5;
                    }
                    for (; k10 < ai18.length - 1; k10++)
                    {
                        ai18[k10] = pf1.ql();
                        pf1.qi();
                    }

                    ai18[k10] = pf1.ql();
                    ge = ai18;
                    break;

                case 82: // 'R'
                    int j13 = pf1.gp(pf1.qp());
                    int l5 = pf1.getPosition();
                    int l10;
                    for (l10 = 0; pf1.qu() > 0; l10++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(l5);
                    int ai19[];
                    if (ge == null)
                    {
                        l5 = 0;
                    } else
                    {
                        l5 = ge.length;
                    }
                    ai19 = new int[l10 + l5];
                    l10 = l5;
                    if (l5 != 0)
                    {
                        System.arraycopy(ge, 0, ai19, 0, l5);
                        l10 = l5;
                    }
                    for (; l10 < ai19.length; l10++)
                    {
                        ai19[l10] = pf1.ql();
                    }

                    ge = ai19;
                    pf1.gq(j13);
                    break;
                }
            } while (true);
        }

        public int hashCode()
        {
            return ((((((((((pl.hashCode(fV) + 527) * 31 + pl.hashCode(fW)) * 31 + pl.hashCode(fX)) * 31 + pl.hashCode(fY)) * 31 + pl.hashCode(fZ)) * 31 + pl.hashCode(ga)) * 31 + pl.hashCode(gb)) * 31 + pl.hashCode(gc)) * 31 + pl.hashCode(gd)) * 31 + pl.hashCode(ge)) * 31 + qz();
        }

        public g m()
        {
            fV = pq.awW;
            fW = pq.awW;
            fX = pq.awW;
            fY = pq.awW;
            fZ = pq.awW;
            ga = pq.awW;
            gb = pq.awW;
            gc = pq.awW;
            gd = pq.awW;
            ge = pq.awW;
            awJ = null;
            awU = -1;
            return this;
        }

        public g()
        {
            m();
        }
    }

    public static final class h extends ph
    {

        public static final pi gf = pi.a(11, com/google/android/gms/internal/c$h, 810);
        private static final h gg[] = new h[0];
        public int gh[];
        public int gi[];
        public int gj[];
        public int gk;
        public int gl[];
        public int gm;
        public int gn;

        public void a(pg pg1)
            throws IOException
        {
            boolean flag = false;
            if (gh != null && gh.length > 0)
            {
                for (int k = 0; k < gh.length; k++)
                {
                    pg1.s(1, gh[k]);
                }

            }
            if (gi != null && gi.length > 0)
            {
                for (int l = 0; l < gi.length; l++)
                {
                    pg1.s(2, gi[l]);
                }

            }
            if (gj != null && gj.length > 0)
            {
                for (int i1 = 0; i1 < gj.length; i1++)
                {
                    pg1.s(3, gj[i1]);
                }

            }
            if (gk != 0)
            {
                pg1.s(4, gk);
            }
            if (gl != null && gl.length > 0)
            {
                for (int j1 = ((flag) ? 1 : 0); j1 < gl.length; j1++)
                {
                    pg1.s(5, gl[j1]);
                }

            }
            if (gm != 0)
            {
                pg1.s(6, gm);
            }
            if (gn != 0)
            {
                pg1.s(7, gn);
            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return i(pf1);
        }

        protected int c()
        {
            boolean flag = false;
            int j1 = super.c();
            int l;
            int i1;
            if (gh != null && gh.length > 0)
            {
                int k = 0;
                i1 = 0;
                for (; k < gh.length; k++)
                {
                    i1 += pg.gw(gh[k]);
                }

                i1 = j1 + i1 + gh.length * 1;
            } else
            {
                i1 = j1;
            }
            l = i1;
            if (gi != null)
            {
                l = i1;
                if (gi.length > 0)
                {
                    l = 0;
                    j1 = 0;
                    for (; l < gi.length; l++)
                    {
                        j1 += pg.gw(gi[l]);
                    }

                    l = i1 + j1 + gi.length * 1;
                }
            }
            i1 = l;
            if (gj != null)
            {
                i1 = l;
                if (gj.length > 0)
                {
                    i1 = 0;
                    j1 = 0;
                    for (; i1 < gj.length; i1++)
                    {
                        j1 += pg.gw(gj[i1]);
                    }

                    i1 = l + j1 + gj.length * 1;
                }
            }
            l = i1;
            if (gk != 0)
            {
                l = i1 + pg.u(4, gk);
            }
            i1 = l;
            if (gl != null)
            {
                i1 = l;
                if (gl.length > 0)
                {
                    j1 = 0;
                    for (i1 = ((flag) ? 1 : 0); i1 < gl.length; i1++)
                    {
                        j1 += pg.gw(gl[i1]);
                    }

                    i1 = l + j1 + gl.length * 1;
                }
            }
            l = i1;
            if (gm != 0)
            {
                l = i1 + pg.u(6, gm);
            }
            i1 = l;
            if (gn != 0)
            {
                i1 = l + pg.u(7, gn);
            }
            return i1;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            boolean flag;
            if (obj == this)
            {
                flag = true;
            } else
            {
                flag = flag1;
                if (obj instanceof h)
                {
                    obj = (h)obj;
                    flag = flag1;
                    if (pl.equals(gh, ((h) (obj)).gh))
                    {
                        flag = flag1;
                        if (pl.equals(gi, ((h) (obj)).gi))
                        {
                            flag = flag1;
                            if (pl.equals(gj, ((h) (obj)).gj))
                            {
                                flag = flag1;
                                if (gk == ((h) (obj)).gk)
                                {
                                    flag = flag1;
                                    if (pl.equals(gl, ((h) (obj)).gl))
                                    {
                                        flag = flag1;
                                        if (gm == ((h) (obj)).gm)
                                        {
                                            flag = flag1;
                                            if (gn == ((h) (obj)).gn)
                                            {
                                                return a(((ph) (obj)));
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (((((((pl.hashCode(gh) + 527) * 31 + pl.hashCode(gi)) * 31 + pl.hashCode(gj)) * 31 + gk) * 31 + pl.hashCode(gl)) * 31 + gm) * 31 + gn) * 31 + qz();
        }

        public h i(pf pf1)
            throws IOException
        {
            do
            {
                int k = pf1.qi();
                switch (k)
                {
                default:
                    if (a(pf1, k))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    int l2 = pq.b(pf1, 8);
                    int ai[];
                    int l;
                    if (gh == null)
                    {
                        l = 0;
                    } else
                    {
                        l = gh.length;
                    }
                    ai = new int[l2 + l];
                    l2 = l;
                    if (l != 0)
                    {
                        System.arraycopy(gh, 0, ai, 0, l);
                        l2 = l;
                    }
                    for (; l2 < ai.length - 1; l2++)
                    {
                        ai[l2] = pf1.ql();
                        pf1.qi();
                    }

                    ai[l2] = pf1.ql();
                    gh = ai;
                    break;

                case 10: // '\n'
                    int l4 = pf1.gp(pf1.qp());
                    int i1 = pf1.getPosition();
                    int i3;
                    for (i3 = 0; pf1.qu() > 0; i3++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(i1);
                    int ai1[];
                    if (gh == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = gh.length;
                    }
                    ai1 = new int[i3 + i1];
                    i3 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(gh, 0, ai1, 0, i1);
                        i3 = i1;
                    }
                    for (; i3 < ai1.length; i3++)
                    {
                        ai1[i3] = pf1.ql();
                    }

                    gh = ai1;
                    pf1.gq(l4);
                    break;

                case 16: // '\020'
                    int j3 = pq.b(pf1, 16);
                    int ai2[];
                    int j1;
                    if (gi == null)
                    {
                        j1 = 0;
                    } else
                    {
                        j1 = gi.length;
                    }
                    ai2 = new int[j3 + j1];
                    j3 = j1;
                    if (j1 != 0)
                    {
                        System.arraycopy(gi, 0, ai2, 0, j1);
                        j3 = j1;
                    }
                    for (; j3 < ai2.length - 1; j3++)
                    {
                        ai2[j3] = pf1.ql();
                        pf1.qi();
                    }

                    ai2[j3] = pf1.ql();
                    gi = ai2;
                    break;

                case 18: // '\022'
                    int i5 = pf1.gp(pf1.qp());
                    int k1 = pf1.getPosition();
                    int k3;
                    for (k3 = 0; pf1.qu() > 0; k3++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(k1);
                    int ai3[];
                    if (gi == null)
                    {
                        k1 = 0;
                    } else
                    {
                        k1 = gi.length;
                    }
                    ai3 = new int[k3 + k1];
                    k3 = k1;
                    if (k1 != 0)
                    {
                        System.arraycopy(gi, 0, ai3, 0, k1);
                        k3 = k1;
                    }
                    for (; k3 < ai3.length; k3++)
                    {
                        ai3[k3] = pf1.ql();
                    }

                    gi = ai3;
                    pf1.gq(i5);
                    break;

                case 24: // '\030'
                    int l3 = pq.b(pf1, 24);
                    int ai4[];
                    int l1;
                    if (gj == null)
                    {
                        l1 = 0;
                    } else
                    {
                        l1 = gj.length;
                    }
                    ai4 = new int[l3 + l1];
                    l3 = l1;
                    if (l1 != 0)
                    {
                        System.arraycopy(gj, 0, ai4, 0, l1);
                        l3 = l1;
                    }
                    for (; l3 < ai4.length - 1; l3++)
                    {
                        ai4[l3] = pf1.ql();
                        pf1.qi();
                    }

                    ai4[l3] = pf1.ql();
                    gj = ai4;
                    break;

                case 26: // '\032'
                    int j5 = pf1.gp(pf1.qp());
                    int i2 = pf1.getPosition();
                    int i4;
                    for (i4 = 0; pf1.qu() > 0; i4++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(i2);
                    int ai5[];
                    if (gj == null)
                    {
                        i2 = 0;
                    } else
                    {
                        i2 = gj.length;
                    }
                    ai5 = new int[i4 + i2];
                    i4 = i2;
                    if (i2 != 0)
                    {
                        System.arraycopy(gj, 0, ai5, 0, i2);
                        i4 = i2;
                    }
                    for (; i4 < ai5.length; i4++)
                    {
                        ai5[i4] = pf1.ql();
                    }

                    gj = ai5;
                    pf1.gq(j5);
                    break;

                case 32: // ' '
                    gk = pf1.ql();
                    break;

                case 40: // '('
                    int j4 = pq.b(pf1, 40);
                    int ai6[];
                    int j2;
                    if (gl == null)
                    {
                        j2 = 0;
                    } else
                    {
                        j2 = gl.length;
                    }
                    ai6 = new int[j4 + j2];
                    j4 = j2;
                    if (j2 != 0)
                    {
                        System.arraycopy(gl, 0, ai6, 0, j2);
                        j4 = j2;
                    }
                    for (; j4 < ai6.length - 1; j4++)
                    {
                        ai6[j4] = pf1.ql();
                        pf1.qi();
                    }

                    ai6[j4] = pf1.ql();
                    gl = ai6;
                    break;

                case 42: // '*'
                    int k5 = pf1.gp(pf1.qp());
                    int k2 = pf1.getPosition();
                    int k4;
                    for (k4 = 0; pf1.qu() > 0; k4++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(k2);
                    int ai7[];
                    if (gl == null)
                    {
                        k2 = 0;
                    } else
                    {
                        k2 = gl.length;
                    }
                    ai7 = new int[k4 + k2];
                    k4 = k2;
                    if (k2 != 0)
                    {
                        System.arraycopy(gl, 0, ai7, 0, k2);
                        k4 = k2;
                    }
                    for (; k4 < ai7.length; k4++)
                    {
                        ai7[k4] = pf1.ql();
                    }

                    gl = ai7;
                    pf1.gq(k5);
                    break;

                case 48: // '0'
                    gm = pf1.ql();
                    break;

                case 56: // '8'
                    gn = pf1.ql();
                    break;
                }
            } while (true);
        }

        public h n()
        {
            gh = pq.awW;
            gi = pq.awW;
            gj = pq.awW;
            gk = 0;
            gl = pq.awW;
            gm = 0;
            gn = 0;
            awJ = null;
            awU = -1;
            return this;
        }


        public h()
        {
            n();
        }
    }

    public static final class i extends ph
    {

        private static volatile i go[];
        public d.a gp;
        public d gq;
        public String name;

        public static i[] o()
        {
            if (go == null)
            {
                synchronized (pl.awT)
                {
                    if (go == null)
                    {
                        go = new i[0];
                    }
                }
            }
            return go;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public void a(pg pg1)
            throws IOException
        {
            if (!name.equals(""))
            {
                pg1.b(1, name);
            }
            if (gp != null)
            {
                pg1.a(2, gp);
            }
            if (gq != null)
            {
                pg1.a(3, gq);
            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return j(pf1);
        }

        protected int c()
        {
            int l = super.c();
            int k = l;
            if (!name.equals(""))
            {
                k = l + pg.j(1, name);
            }
            l = k;
            if (gp != null)
            {
                l = k + pg.c(2, gp);
            }
            k = l;
            if (gq != null)
            {
                k = l + pg.c(3, gq);
            }
            return k;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            if (obj != this) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            return flag;
_L2:
            flag = flag1;
            if (!(obj instanceof i)) goto _L4; else goto _L3
_L3:
            obj = (i)obj;
            if (name != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((i) (obj)).name != null) goto _L4; else goto _L7
_L7:
            if (gp != null) goto _L9; else goto _L8
_L8:
            flag = flag1;
            if (((i) (obj)).gp != null) goto _L4; else goto _L10
_L10:
            if (gq != null)
            {
                break MISSING_BLOCK_LABEL_111;
            }
            flag = flag1;
            if (((i) (obj)).gq != null) goto _L4; else goto _L11
_L11:
            return a(((ph) (obj)));
_L6:
            if (!name.equals(((i) (obj)).name))
            {
                return false;
            }
              goto _L7
_L9:
            if (!gp.equals(((i) (obj)).gp))
            {
                return false;
            }
              goto _L10
            if (!gq.equals(((i) (obj)).gq))
            {
                return false;
            }
              goto _L11
        }

        public int hashCode()
        {
            int i1 = 0;
            int k;
            int l;
            if (name == null)
            {
                k = 0;
            } else
            {
                k = name.hashCode();
            }
            if (gp == null)
            {
                l = 0;
            } else
            {
                l = gp.hashCode();
            }
            if (gq != null)
            {
                i1 = gq.hashCode();
            }
            return ((l + (k + 527) * 31) * 31 + i1) * 31 + qz();
        }

        public i j(pf pf1)
            throws IOException
        {
            do
            {
                int k = pf1.qi();
                switch (k)
                {
                default:
                    if (a(pf1, k))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    name = pf1.readString();
                    break;

                case 18: // '\022'
                    if (gp == null)
                    {
                        gp = new d.a();
                    }
                    pf1.a(gp);
                    break;

                case 26: // '\032'
                    if (gq == null)
                    {
                        gq = new d();
                    }
                    pf1.a(gq);
                    break;
                }
            } while (true);
        }

        public i p()
        {
            name = "";
            gp = null;
            gq = null;
            awJ = null;
            awU = -1;
            return this;
        }

        public i()
        {
            p();
        }
    }

    public static final class j extends ph
    {

        public i gr[];
        public f gs;
        public String gt;

        public static j b(byte abyte0[])
            throws pm
        {
            return (j)pn.a(new j(), abyte0);
        }

        public void a(pg pg1)
            throws IOException
        {
            if (gr != null && gr.length > 0)
            {
                for (int i1 = 0; i1 < gr.length; i1++)
                {
                    i l = gr[i1];
                    if (l != null)
                    {
                        pg1.a(1, l);
                    }
                }

            }
            if (gs != null)
            {
                pg1.a(2, gs);
            }
            if (!gt.equals(""))
            {
                pg1.b(3, gt);
            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return k(pf1);
        }

        protected int c()
        {
            int i1 = super.c();
            int j1 = i1;
            if (gr != null)
            {
                j1 = i1;
                if (gr.length > 0)
                {
                    int k1 = 0;
                    do
                    {
                        j1 = i1;
                        if (k1 >= gr.length)
                        {
                            break;
                        }
                        i l = gr[k1];
                        j1 = i1;
                        if (l != null)
                        {
                            j1 = i1 + pg.c(1, l);
                        }
                        k1++;
                        i1 = j1;
                    } while (true);
                }
            }
            i1 = j1;
            if (gs != null)
            {
                i1 = j1 + pg.c(2, gs);
            }
            j1 = i1;
            if (!gt.equals(""))
            {
                j1 = i1 + pg.j(3, gt);
            }
            return j1;
        }

        public boolean equals(Object obj)
        {
            boolean flag1 = false;
            if (obj != this) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            return flag;
_L2:
            flag = flag1;
            if (!(obj instanceof j)) goto _L4; else goto _L3
_L3:
            obj = (j)obj;
            flag = flag1;
            if (!pl.equals(gr, ((j) (obj)).gr)) goto _L4; else goto _L5
_L5:
            if (gs != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((j) (obj)).gs != null) goto _L4; else goto _L8
_L8:
            if (gt != null)
            {
                break MISSING_BLOCK_LABEL_95;
            }
            flag = flag1;
            if (((j) (obj)).gt != null) goto _L4; else goto _L9
_L9:
            return a(((ph) (obj)));
_L7:
            if (!gs.equals(((j) (obj)).gs))
            {
                return false;
            }
              goto _L8
            if (!gt.equals(((j) (obj)).gt))
            {
                return false;
            }
              goto _L9
        }

        public int hashCode()
        {
            int i1 = 0;
            int j1 = pl.hashCode(gr);
            int l;
            if (gs == null)
            {
                l = 0;
            } else
            {
                l = gs.hashCode();
            }
            if (gt != null)
            {
                i1 = gt.hashCode();
            }
            return ((l + (j1 + 527) * 31) * 31 + i1) * 31 + qz();
        }

        public j k(pf pf1)
            throws IOException
        {
            do
            {
                int l = pf1.qi();
                switch (l)
                {
                default:
                    if (a(pf1, l))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int j1 = pq.b(pf1, 10);
                    i ai[];
                    int i1;
                    if (gr == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = gr.length;
                    }
                    ai = new i[j1 + i1];
                    j1 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(gr, 0, ai, 0, i1);
                        j1 = i1;
                    }
                    for (; j1 < ai.length - 1; j1++)
                    {
                        ai[j1] = new i();
                        pf1.a(ai[j1]);
                        pf1.qi();
                    }

                    ai[j1] = new i();
                    pf1.a(ai[j1]);
                    gr = ai;
                    break;

                case 18: // '\022'
                    if (gs == null)
                    {
                        gs = new f();
                    }
                    pf1.a(gs);
                    break;

                case 26: // '\032'
                    gt = pf1.readString();
                    break;
                }
            } while (true);
        }

        public j q()
        {
            gr = i.o();
            gs = null;
            gt = "";
            awJ = null;
            awU = -1;
            return this;
        }

        public j()
        {
            q();
        }
    }

}
