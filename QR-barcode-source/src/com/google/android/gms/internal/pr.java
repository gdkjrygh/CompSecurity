// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            ph, pg, pl, pq, 
//            pf, pn

public interface pr
{
    public static final class a extends ph
    {

        public String axe[];
        public String axf[];
        public int axg[];

        public void a(pg pg1)
            throws IOException
        {
            boolean flag = false;
            if (axe != null && axe.length > 0)
            {
                for (int i = 0; i < axe.length; i++)
                {
                    String s = axe[i];
                    if (s != null)
                    {
                        pg1.b(1, s);
                    }
                }

            }
            if (axf != null && axf.length > 0)
            {
                for (int j = 0; j < axf.length; j++)
                {
                    String s1 = axf[j];
                    if (s1 != null)
                    {
                        pg1.b(2, s1);
                    }
                }

            }
            if (axg != null && axg.length > 0)
            {
                for (int k = ((flag) ? 1 : 0); k < axg.length; k++)
                {
                    pg1.s(3, axg[k]);
                }

            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return v(pf1);
        }

        protected int c()
        {
            boolean flag = false;
            int k2 = super.c();
            int i;
            int k;
            if (axe != null && axe.length > 0)
            {
                i = 0;
                int j = 0;
                int l;
                int k1;
                for (l = 0; i < axe.length; l = k1)
                {
                    String s = axe[i];
                    int i2 = j;
                    k1 = l;
                    if (s != null)
                    {
                        k1 = l + 1;
                        i2 = j + pg.di(s);
                    }
                    i++;
                    j = i2;
                }

                i = k2 + j + l * 1;
            } else
            {
                i = k2;
            }
            k = i;
            if (axf != null)
            {
                k = i;
                if (axf.length > 0)
                {
                    k = 0;
                    int i1 = 0;
                    int l1;
                    int j2;
                    for (l1 = 0; k < axf.length; l1 = j2)
                    {
                        String s1 = axf[k];
                        k2 = i1;
                        j2 = l1;
                        if (s1 != null)
                        {
                            j2 = l1 + 1;
                            k2 = i1 + pg.di(s1);
                        }
                        k++;
                        i1 = k2;
                    }

                    k = i + i1 + l1 * 1;
                }
            }
            i = k;
            if (axg != null)
            {
                i = k;
                if (axg.length > 0)
                {
                    int j1 = 0;
                    for (i = ((flag) ? 1 : 0); i < axg.length; i++)
                    {
                        j1 += pg.gw(axg[i]);
                    }

                    i = k + j1 + axg.length * 1;
                }
            }
            return i;
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
                    if (pl.equals(axe, ((a) (obj)).axe))
                    {
                        flag = flag1;
                        if (pl.equals(axf, ((a) (obj)).axf))
                        {
                            flag = flag1;
                            if (pl.equals(axg, ((a) (obj)).axg))
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
            return (((pl.hashCode(axe) + 527) * 31 + pl.hashCode(axf)) * 31 + pl.hashCode(axg)) * 31 + qz();
        }

        public a qJ()
        {
            axe = pq.axb;
            axf = pq.axb;
            axg = pq.awW;
            awJ = null;
            awU = -1;
            return this;
        }

        public a v(pf pf1)
            throws IOException
        {
            do
            {
                int i = pf1.qi();
                switch (i)
                {
                default:
                    if (a(pf1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int j1 = pq.b(pf1, 10);
                    String as[];
                    int j;
                    if (axe == null)
                    {
                        j = 0;
                    } else
                    {
                        j = axe.length;
                    }
                    as = new String[j1 + j];
                    j1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(axe, 0, as, 0, j);
                        j1 = j;
                    }
                    for (; j1 < as.length - 1; j1++)
                    {
                        as[j1] = pf1.readString();
                        pf1.qi();
                    }

                    as[j1] = pf1.readString();
                    axe = as;
                    break;

                case 18: // '\022'
                    int k1 = pq.b(pf1, 18);
                    String as1[];
                    int k;
                    if (axf == null)
                    {
                        k = 0;
                    } else
                    {
                        k = axf.length;
                    }
                    as1 = new String[k1 + k];
                    k1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(axf, 0, as1, 0, k);
                        k1 = k;
                    }
                    for (; k1 < as1.length - 1; k1++)
                    {
                        as1[k1] = pf1.readString();
                        pf1.qi();
                    }

                    as1[k1] = pf1.readString();
                    axf = as1;
                    break;

                case 24: // '\030'
                    int l1 = pq.b(pf1, 24);
                    int ai[];
                    int l;
                    if (axg == null)
                    {
                        l = 0;
                    } else
                    {
                        l = axg.length;
                    }
                    ai = new int[l1 + l];
                    l1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(axg, 0, ai, 0, l);
                        l1 = l;
                    }
                    for (; l1 < ai.length - 1; l1++)
                    {
                        ai[l1] = pf1.ql();
                        pf1.qi();
                    }

                    ai[l1] = pf1.ql();
                    axg = ai;
                    break;

                case 26: // '\032'
                    int j2 = pf1.gp(pf1.qp());
                    int i1 = pf1.getPosition();
                    int i2;
                    for (i2 = 0; pf1.qu() > 0; i2++)
                    {
                        pf1.ql();
                    }

                    pf1.gr(i1);
                    int ai1[];
                    if (axg == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = axg.length;
                    }
                    ai1 = new int[i2 + i1];
                    i2 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(axg, 0, ai1, 0, i1);
                        i2 = i1;
                    }
                    for (; i2 < ai1.length; i2++)
                    {
                        ai1[i2] = pf1.ql();
                    }

                    axg = ai1;
                    pf1.gq(j2);
                    break;
                }
            } while (true);
        }

        public a()
        {
            qJ();
        }
    }

    public static final class b extends ph
    {

        public int axh;
        public String axi;
        public String version;

        public void a(pg pg1)
            throws IOException
        {
            if (axh != 0)
            {
                pg1.s(1, axh);
            }
            if (!axi.equals(""))
            {
                pg1.b(2, axi);
            }
            if (!version.equals(""))
            {
                pg1.b(3, version);
            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return w(pf1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (axh != 0)
            {
                i = j + pg.u(1, axh);
            }
            j = i;
            if (!axi.equals(""))
            {
                j = i + pg.j(2, axi);
            }
            i = j;
            if (!version.equals(""))
            {
                i = j + pg.j(3, version);
            }
            return i;
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
            if (!(obj instanceof b)) goto _L4; else goto _L3
_L3:
            obj = (b)obj;
            flag = flag1;
            if (axh != ((b) (obj)).axh) goto _L4; else goto _L5
_L5:
            if (axi != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((b) (obj)).axi != null) goto _L4; else goto _L8
_L8:
            if (version != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((b) (obj)).version != null) goto _L4; else goto _L9
_L9:
            return a(((ph) (obj)));
_L7:
            if (!axi.equals(((b) (obj)).axi))
            {
                return false;
            }
              goto _L8
            if (!version.equals(((b) (obj)).version))
            {
                return false;
            }
              goto _L9
        }

        public int hashCode()
        {
            int j = 0;
            int k = axh;
            int i;
            if (axi == null)
            {
                i = 0;
            } else
            {
                i = axi.hashCode();
            }
            if (version != null)
            {
                j = version.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + qz();
        }

        public b qK()
        {
            axh = 0;
            axi = "";
            version = "";
            awJ = null;
            awU = -1;
            return this;
        }

        public b w(pf pf1)
            throws IOException
        {
_L6:
            int i = pf1.qi();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       18: 183
        //                       26: 194;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (a(pf1, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = pf1.ql();
            switch (j)
            {
            case 0: // '\0'
            case 1: // '\001'
            case 2: // '\002'
            case 3: // '\003'
            case 4: // '\004'
            case 5: // '\005'
            case 6: // '\006'
            case 7: // '\007'
            case 8: // '\b'
            case 9: // '\t'
            case 10: // '\n'
            case 11: // '\013'
            case 12: // '\f'
            case 13: // '\r'
            case 14: // '\016'
            case 15: // '\017'
            case 16: // '\020'
            case 17: // '\021'
            case 18: // '\022'
            case 19: // '\023'
            case 20: // '\024'
            case 21: // '\025'
            case 22: // '\026'
                axh = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            axi = pf1.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            version = pf1.readString();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public b()
        {
            qK();
        }
    }

    public static final class c extends ph
    {

        public long axj;
        public int axk;
        public int axl;
        public boolean axm;
        public d axn[];
        public b axo;
        public byte axp[];
        public byte axq[];
        public byte axr[];
        public a axs;
        public String axt;
        public String tag;

        public void a(pg pg1)
            throws IOException
        {
            if (axj != 0L)
            {
                pg1.b(1, axj);
            }
            if (!tag.equals(""))
            {
                pg1.b(2, tag);
            }
            if (axn != null && axn.length > 0)
            {
                for (int i = 0; i < axn.length; i++)
                {
                    d d1 = axn[i];
                    if (d1 != null)
                    {
                        pg1.a(3, d1);
                    }
                }

            }
            if (!Arrays.equals(axp, pq.axd))
            {
                pg1.a(6, axp);
            }
            if (axs != null)
            {
                pg1.a(7, axs);
            }
            if (!Arrays.equals(axq, pq.axd))
            {
                pg1.a(8, axq);
            }
            if (axo != null)
            {
                pg1.a(9, axo);
            }
            if (axm)
            {
                pg1.b(10, axm);
            }
            if (axk != 0)
            {
                pg1.s(11, axk);
            }
            if (axl != 0)
            {
                pg1.s(12, axl);
            }
            if (!Arrays.equals(axr, pq.axd))
            {
                pg1.a(13, axr);
            }
            if (!axt.equals(""))
            {
                pg1.b(14, axt);
            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return x(pf1);
        }

        protected int c()
        {
            int i = super.c();
            int j = i;
            if (axj != 0L)
            {
                j = i + pg.d(1, axj);
            }
            i = j;
            if (!tag.equals(""))
            {
                i = j + pg.j(2, tag);
            }
            j = i;
            if (axn != null)
            {
                j = i;
                if (axn.length > 0)
                {
                    for (j = 0; j < axn.length;)
                    {
                        d d1 = axn[j];
                        int k = i;
                        if (d1 != null)
                        {
                            k = i + pg.c(3, d1);
                        }
                        j++;
                        i = k;
                    }

                    j = i;
                }
            }
            i = j;
            if (!Arrays.equals(axp, pq.axd))
            {
                i = j + pg.b(6, axp);
            }
            j = i;
            if (axs != null)
            {
                j = i + pg.c(7, axs);
            }
            i = j;
            if (!Arrays.equals(axq, pq.axd))
            {
                i = j + pg.b(8, axq);
            }
            j = i;
            if (axo != null)
            {
                j = i + pg.c(9, axo);
            }
            i = j;
            if (axm)
            {
                i = j + pg.c(10, axm);
            }
            j = i;
            if (axk != 0)
            {
                j = i + pg.u(11, axk);
            }
            i = j;
            if (axl != 0)
            {
                i = j + pg.u(12, axl);
            }
            j = i;
            if (!Arrays.equals(axr, pq.axd))
            {
                j = i + pg.b(13, axr);
            }
            i = j;
            if (!axt.equals(""))
            {
                i = j + pg.j(14, axt);
            }
            return i;
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
            if (!(obj instanceof c)) goto _L4; else goto _L3
_L3:
            obj = (c)obj;
            flag = flag1;
            if (axj != ((c) (obj)).axj) goto _L4; else goto _L5
_L5:
            if (tag != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((c) (obj)).tag != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (axk != ((c) (obj)).axk) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (axl != ((c) (obj)).axl) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (axm != ((c) (obj)).axm) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (!pl.equals(axn, ((c) (obj)).axn)) goto _L4; else goto _L12
_L12:
            if (axo != null) goto _L14; else goto _L13
_L13:
            flag = flag1;
            if (((c) (obj)).axo != null) goto _L4; else goto _L15
_L15:
            flag = flag1;
            if (!Arrays.equals(axp, ((c) (obj)).axp)) goto _L4; else goto _L16
_L16:
            flag = flag1;
            if (!Arrays.equals(axq, ((c) (obj)).axq)) goto _L4; else goto _L17
_L17:
            flag = flag1;
            if (!Arrays.equals(axr, ((c) (obj)).axr)) goto _L4; else goto _L18
_L18:
            if (axs != null) goto _L20; else goto _L19
_L19:
            flag = flag1;
            if (((c) (obj)).axs != null) goto _L4; else goto _L21
_L21:
            if (axt != null)
            {
                break MISSING_BLOCK_LABEL_260;
            }
            flag = flag1;
            if (((c) (obj)).axt != null) goto _L4; else goto _L22
_L22:
            return a(((ph) (obj)));
_L7:
            if (!tag.equals(((c) (obj)).tag))
            {
                return false;
            }
              goto _L8
_L14:
            if (!axo.equals(((c) (obj)).axo))
            {
                return false;
            }
              goto _L15
_L20:
            if (!axs.equals(((c) (obj)).axs))
            {
                return false;
            }
              goto _L21
            if (!axt.equals(((c) (obj)).axt))
            {
                return false;
            }
              goto _L22
        }

        public int hashCode()
        {
            int l = 0;
            int i1 = (int)(axj ^ axj >>> 32);
            int i;
            char c1;
            int j;
            int k;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            int k2;
            if (tag == null)
            {
                i = 0;
            } else
            {
                i = tag.hashCode();
            }
            j1 = axk;
            k1 = axl;
            if (axm)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            l1 = pl.hashCode(axn);
            if (axo == null)
            {
                j = 0;
            } else
            {
                j = axo.hashCode();
            }
            i2 = Arrays.hashCode(axp);
            j2 = Arrays.hashCode(axq);
            k2 = Arrays.hashCode(axr);
            if (axs == null)
            {
                k = 0;
            } else
            {
                k = axs.hashCode();
            }
            if (axt != null)
            {
                l = axt.hashCode();
            }
            return ((k + ((((j + ((c1 + (((i + (i1 + 527) * 31) * 31 + j1) * 31 + k1) * 31) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + l) * 31 + qz();
        }

        public c qL()
        {
            axj = 0L;
            tag = "";
            axk = 0;
            axl = 0;
            axm = false;
            axn = d.qM();
            axo = null;
            axp = pq.axd;
            axq = pq.axd;
            axr = pq.axd;
            axs = null;
            axt = "";
            awJ = null;
            awU = -1;
            return this;
        }

        public c x(pf pf1)
            throws IOException
        {
            do
            {
                int i = pf1.qi();
                switch (i)
                {
                default:
                    if (a(pf1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    axj = pf1.qk();
                    break;

                case 18: // '\022'
                    tag = pf1.readString();
                    break;

                case 26: // '\032'
                    int k = pq.b(pf1, 26);
                    d ad[];
                    int j;
                    if (axn == null)
                    {
                        j = 0;
                    } else
                    {
                        j = axn.length;
                    }
                    ad = new d[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(axn, 0, ad, 0, j);
                        k = j;
                    }
                    for (; k < ad.length - 1; k++)
                    {
                        ad[k] = new d();
                        pf1.a(ad[k]);
                        pf1.qi();
                    }

                    ad[k] = new d();
                    pf1.a(ad[k]);
                    axn = ad;
                    break;

                case 50: // '2'
                    axp = pf1.readBytes();
                    break;

                case 58: // ':'
                    if (axs == null)
                    {
                        axs = new a();
                    }
                    pf1.a(axs);
                    break;

                case 66: // 'B'
                    axq = pf1.readBytes();
                    break;

                case 74: // 'J'
                    if (axo == null)
                    {
                        axo = new b();
                    }
                    pf1.a(axo);
                    break;

                case 80: // 'P'
                    axm = pf1.qm();
                    break;

                case 88: // 'X'
                    axk = pf1.ql();
                    break;

                case 96: // '`'
                    axl = pf1.ql();
                    break;

                case 106: // 'j'
                    axr = pf1.readBytes();
                    break;

                case 114: // 'r'
                    axt = pf1.readString();
                    break;
                }
            } while (true);
        }

        public c()
        {
            qL();
        }
    }

    public static final class d extends ph
    {

        private static volatile d axu[];
        public String fv;
        public String value;

        public static d[] qM()
        {
            if (axu == null)
            {
                synchronized (pl.awT)
                {
                    if (axu == null)
                    {
                        axu = new d[0];
                    }
                }
            }
            return axu;
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
            if (!value.equals(""))
            {
                pg1.b(2, value);
            }
            super.a(pg1);
        }

        public pn b(pf pf1)
            throws IOException
        {
            return y(pf1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (!fv.equals(""))
            {
                i = j + pg.j(1, fv);
            }
            j = i;
            if (!value.equals(""))
            {
                j = i + pg.j(2, value);
            }
            return j;
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
            if (!(obj instanceof d)) goto _L4; else goto _L3
_L3:
            obj = (d)obj;
            if (fv != null) goto _L6; else goto _L5
_L5:
            flag = flag1;
            if (((d) (obj)).fv != null) goto _L4; else goto _L7
_L7:
            if (value != null)
            {
                break MISSING_BLOCK_LABEL_79;
            }
            flag = flag1;
            if (((d) (obj)).value != null) goto _L4; else goto _L8
_L8:
            return a(((ph) (obj)));
_L6:
            if (!fv.equals(((d) (obj)).fv))
            {
                return false;
            }
              goto _L7
            if (!value.equals(((d) (obj)).value))
            {
                return false;
            }
              goto _L8
        }

        public int hashCode()
        {
            int j = 0;
            int i;
            if (fv == null)
            {
                i = 0;
            } else
            {
                i = fv.hashCode();
            }
            if (value != null)
            {
                j = value.hashCode();
            }
            return ((i + 527) * 31 + j) * 31 + qz();
        }

        public d qN()
        {
            fv = "";
            value = "";
            awJ = null;
            awU = -1;
            return this;
        }

        public d y(pf pf1)
            throws IOException
        {
            do
            {
                int i = pf1.qi();
                switch (i)
                {
                default:
                    if (a(pf1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    fv = pf1.readString();
                    break;

                case 18: // '\022'
                    value = pf1.readString();
                    break;
                }
            } while (true);
        }

        public d()
        {
            qN();
        }
    }

}
