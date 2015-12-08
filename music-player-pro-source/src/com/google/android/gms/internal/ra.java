// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            qq, qp, qu, qz, 
//            qo, qw

public interface ra
{
    public static final class a extends qq
    {

        public String azr[];
        public String azs[];
        public int azt[];

        public void a(qp qp1)
            throws IOException
        {
            boolean flag = false;
            if (azr != null && azr.length > 0)
            {
                for (int i = 0; i < azr.length; i++)
                {
                    String s = azr[i];
                    if (s != null)
                    {
                        qp1.b(1, s);
                    }
                }

            }
            if (azs != null && azs.length > 0)
            {
                for (int j = 0; j < azs.length; j++)
                {
                    String s1 = azs[j];
                    if (s1 != null)
                    {
                        qp1.b(2, s1);
                    }
                }

            }
            if (azt != null && azt.length > 0)
            {
                for (int k = ((flag) ? 1 : 0); k < azt.length; k++)
                {
                    qp1.t(3, azt[k]);
                }

            }
            super.a(qp1);
        }

        public qw b(qo qo1)
            throws IOException
        {
            return y(qo1);
        }

        protected int c()
        {
            boolean flag = false;
            int k2 = super.c();
            int i;
            int k;
            if (azr != null && azr.length > 0)
            {
                i = 0;
                int j = 0;
                int l;
                int k1;
                for (l = 0; i < azr.length; l = k1)
                {
                    String s = azr[i];
                    int i2 = j;
                    k1 = l;
                    if (s != null)
                    {
                        k1 = l + 1;
                        i2 = j + qp.dk(s);
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
            if (azs != null)
            {
                k = i;
                if (azs.length > 0)
                {
                    k = 0;
                    int i1 = 0;
                    int l1;
                    int j2;
                    for (l1 = 0; k < azs.length; l1 = j2)
                    {
                        String s1 = azs[k];
                        k2 = i1;
                        j2 = l1;
                        if (s1 != null)
                        {
                            j2 = l1 + 1;
                            k2 = i1 + qp.dk(s1);
                        }
                        k++;
                        i1 = k2;
                    }

                    k = i + i1 + l1 * 1;
                }
            }
            i = k;
            if (azt != null)
            {
                i = k;
                if (azt.length > 0)
                {
                    int j1 = 0;
                    for (i = ((flag) ? 1 : 0); i < azt.length; i++)
                    {
                        j1 += qp.gZ(azt[i]);
                    }

                    i = k + j1 + azt.length * 1;
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
                    if (qu.equals(azr, ((a) (obj)).azr))
                    {
                        flag = flag1;
                        if (qu.equals(azs, ((a) (obj)).azs))
                        {
                            flag = flag1;
                            if (qu.equals(azt, ((a) (obj)).azt))
                            {
                                return a(((qq) (obj)));
                            }
                        }
                    }
                }
            }
            return flag;
        }

        public int hashCode()
        {
            return (((qu.hashCode(azr) + 527) * 31 + qu.hashCode(azs)) * 31 + qu.hashCode(azt)) * 31 + rQ();
        }

        public a sa()
        {
            azr = qz.azo;
            azs = qz.azo;
            azt = qz.azj;
            ayW = null;
            azh = -1;
            return this;
        }

        public a y(qo qo1)
            throws IOException
        {
            do
            {
                int i = qo1.rz();
                switch (i)
                {
                default:
                    if (a(qo1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    int j1 = qz.b(qo1, 10);
                    String as[];
                    int j;
                    if (azr == null)
                    {
                        j = 0;
                    } else
                    {
                        j = azr.length;
                    }
                    as = new String[j1 + j];
                    j1 = j;
                    if (j != 0)
                    {
                        System.arraycopy(azr, 0, as, 0, j);
                        j1 = j;
                    }
                    for (; j1 < as.length - 1; j1++)
                    {
                        as[j1] = qo1.readString();
                        qo1.rz();
                    }

                    as[j1] = qo1.readString();
                    azr = as;
                    break;

                case 18: // '\022'
                    int k1 = qz.b(qo1, 18);
                    String as1[];
                    int k;
                    if (azs == null)
                    {
                        k = 0;
                    } else
                    {
                        k = azs.length;
                    }
                    as1 = new String[k1 + k];
                    k1 = k;
                    if (k != 0)
                    {
                        System.arraycopy(azs, 0, as1, 0, k);
                        k1 = k;
                    }
                    for (; k1 < as1.length - 1; k1++)
                    {
                        as1[k1] = qo1.readString();
                        qo1.rz();
                    }

                    as1[k1] = qo1.readString();
                    azs = as1;
                    break;

                case 24: // '\030'
                    int l1 = qz.b(qo1, 24);
                    int ai[];
                    int l;
                    if (azt == null)
                    {
                        l = 0;
                    } else
                    {
                        l = azt.length;
                    }
                    ai = new int[l1 + l];
                    l1 = l;
                    if (l != 0)
                    {
                        System.arraycopy(azt, 0, ai, 0, l);
                        l1 = l;
                    }
                    for (; l1 < ai.length - 1; l1++)
                    {
                        ai[l1] = qo1.rC();
                        qo1.rz();
                    }

                    ai[l1] = qo1.rC();
                    azt = ai;
                    break;

                case 26: // '\032'
                    int j2 = qo1.gS(qo1.rG());
                    int i1 = qo1.getPosition();
                    int i2;
                    for (i2 = 0; qo1.rL() > 0; i2++)
                    {
                        qo1.rC();
                    }

                    qo1.gU(i1);
                    int ai1[];
                    if (azt == null)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = azt.length;
                    }
                    ai1 = new int[i2 + i1];
                    i2 = i1;
                    if (i1 != 0)
                    {
                        System.arraycopy(azt, 0, ai1, 0, i1);
                        i2 = i1;
                    }
                    for (; i2 < ai1.length; i2++)
                    {
                        ai1[i2] = qo1.rC();
                    }

                    azt = ai1;
                    qo1.gT(j2);
                    break;
                }
            } while (true);
        }

        public a()
        {
            sa();
        }
    }

    public static final class b extends qq
    {

        public int azu;
        public String azv;
        public String version;

        public void a(qp qp1)
            throws IOException
        {
            if (azu != 0)
            {
                qp1.t(1, azu);
            }
            if (!azv.equals(""))
            {
                qp1.b(2, azv);
            }
            if (!version.equals(""))
            {
                qp1.b(3, version);
            }
            super.a(qp1);
        }

        public qw b(qo qo1)
            throws IOException
        {
            return z(qo1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (azu != 0)
            {
                i = j + qp.v(1, azu);
            }
            j = i;
            if (!azv.equals(""))
            {
                j = i + qp.j(2, azv);
            }
            i = j;
            if (!version.equals(""))
            {
                i = j + qp.j(3, version);
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
            if (azu != ((b) (obj)).azu) goto _L4; else goto _L5
_L5:
            if (azv != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((b) (obj)).azv != null) goto _L4; else goto _L8
_L8:
            if (version != null)
            {
                break MISSING_BLOCK_LABEL_92;
            }
            flag = flag1;
            if (((b) (obj)).version != null) goto _L4; else goto _L9
_L9:
            return a(((qq) (obj)));
_L7:
            if (!azv.equals(((b) (obj)).azv))
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
            int k = azu;
            int i;
            if (azv == null)
            {
                i = 0;
            } else
            {
                i = azv.hashCode();
            }
            if (version != null)
            {
                j = version.hashCode();
            }
            return ((i + (k + 527) * 31) * 31 + j) * 31 + rQ();
        }

        public b sb()
        {
            azu = 0;
            azv = "";
            version = "";
            ayW = null;
            azh = -1;
            return this;
        }

        public b z(qo qo1)
            throws IOException
        {
_L6:
            int i = qo1.rz();
            i;
            JVM INSTR lookupswitch 4: default 48
        //                       0: 57
        //                       8: 59
        //                       18: 183
        //                       26: 194;
               goto _L1 _L2 _L3 _L4 _L5
_L1:
            if (a(qo1, i)) goto _L6; else goto _L2
_L2:
            return this;
_L3:
            int j = qo1.rC();
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
                azu = j;
                break;
            }
            continue; /* Loop/switch isn't completed */
_L4:
            azv = qo1.readString();
            continue; /* Loop/switch isn't completed */
_L5:
            version = qo1.readString();
            if (true) goto _L6; else goto _L7
_L7:
        }

        public b()
        {
            sb();
        }
    }

    public static final class c extends qq
    {

        public d azA[];
        public b azB;
        public byte azC[];
        public byte azD[];
        public byte azE[];
        public a azF;
        public String azG;
        public long azH;
        public long azw;
        public int azx;
        public int azy;
        public boolean azz;
        public String tag;

        public c A(qo qo1)
            throws IOException
        {
            do
            {
                int i = qo1.rz();
                switch (i)
                {
                default:
                    if (a(qo1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 8: // '\b'
                    azw = qo1.rB();
                    break;

                case 18: // '\022'
                    tag = qo1.readString();
                    break;

                case 26: // '\032'
                    int k = qz.b(qo1, 26);
                    d ad[];
                    int j;
                    if (azA == null)
                    {
                        j = 0;
                    } else
                    {
                        j = azA.length;
                    }
                    ad = new d[k + j];
                    k = j;
                    if (j != 0)
                    {
                        System.arraycopy(azA, 0, ad, 0, j);
                        k = j;
                    }
                    for (; k < ad.length - 1; k++)
                    {
                        ad[k] = new d();
                        qo1.a(ad[k]);
                        qo1.rz();
                    }

                    ad[k] = new d();
                    qo1.a(ad[k]);
                    azA = ad;
                    break;

                case 50: // '2'
                    azC = qo1.readBytes();
                    break;

                case 58: // ':'
                    if (azF == null)
                    {
                        azF = new a();
                    }
                    qo1.a(azF);
                    break;

                case 66: // 'B'
                    azD = qo1.readBytes();
                    break;

                case 74: // 'J'
                    if (azB == null)
                    {
                        azB = new b();
                    }
                    qo1.a(azB);
                    break;

                case 80: // 'P'
                    azz = qo1.rD();
                    break;

                case 88: // 'X'
                    azx = qo1.rC();
                    break;

                case 96: // '`'
                    azy = qo1.rC();
                    break;

                case 106: // 'j'
                    azE = qo1.readBytes();
                    break;

                case 114: // 'r'
                    azG = qo1.readString();
                    break;

                case 120: // 'x'
                    azH = qo1.rF();
                    break;
                }
            } while (true);
        }

        public void a(qp qp1)
            throws IOException
        {
            if (azw != 0L)
            {
                qp1.b(1, azw);
            }
            if (!tag.equals(""))
            {
                qp1.b(2, tag);
            }
            if (azA != null && azA.length > 0)
            {
                for (int i = 0; i < azA.length; i++)
                {
                    d d1 = azA[i];
                    if (d1 != null)
                    {
                        qp1.a(3, d1);
                    }
                }

            }
            if (!Arrays.equals(azC, qz.azq))
            {
                qp1.a(6, azC);
            }
            if (azF != null)
            {
                qp1.a(7, azF);
            }
            if (!Arrays.equals(azD, qz.azq))
            {
                qp1.a(8, azD);
            }
            if (azB != null)
            {
                qp1.a(9, azB);
            }
            if (azz)
            {
                qp1.b(10, azz);
            }
            if (azx != 0)
            {
                qp1.t(11, azx);
            }
            if (azy != 0)
            {
                qp1.t(12, azy);
            }
            if (!Arrays.equals(azE, qz.azq))
            {
                qp1.a(13, azE);
            }
            if (!azG.equals(""))
            {
                qp1.b(14, azG);
            }
            if (azH != 0L)
            {
                qp1.c(15, azH);
            }
            super.a(qp1);
        }

        public qw b(qo qo1)
            throws IOException
        {
            return A(qo1);
        }

        protected int c()
        {
            int i = super.c();
            int j = i;
            if (azw != 0L)
            {
                j = i + qp.d(1, azw);
            }
            i = j;
            if (!tag.equals(""))
            {
                i = j + qp.j(2, tag);
            }
            j = i;
            if (azA != null)
            {
                j = i;
                if (azA.length > 0)
                {
                    for (j = 0; j < azA.length;)
                    {
                        d d1 = azA[j];
                        int k = i;
                        if (d1 != null)
                        {
                            k = i + qp.c(3, d1);
                        }
                        j++;
                        i = k;
                    }

                    j = i;
                }
            }
            i = j;
            if (!Arrays.equals(azC, qz.azq))
            {
                i = j + qp.b(6, azC);
            }
            j = i;
            if (azF != null)
            {
                j = i + qp.c(7, azF);
            }
            i = j;
            if (!Arrays.equals(azD, qz.azq))
            {
                i = j + qp.b(8, azD);
            }
            j = i;
            if (azB != null)
            {
                j = i + qp.c(9, azB);
            }
            i = j;
            if (azz)
            {
                i = j + qp.c(10, azz);
            }
            j = i;
            if (azx != 0)
            {
                j = i + qp.v(11, azx);
            }
            i = j;
            if (azy != 0)
            {
                i = j + qp.v(12, azy);
            }
            j = i;
            if (!Arrays.equals(azE, qz.azq))
            {
                j = i + qp.b(13, azE);
            }
            i = j;
            if (!azG.equals(""))
            {
                i = j + qp.j(14, azG);
            }
            j = i;
            if (azH != 0L)
            {
                j = i + qp.e(15, azH);
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
            if (!(obj instanceof c)) goto _L4; else goto _L3
_L3:
            obj = (c)obj;
            flag = flag1;
            if (azw != ((c) (obj)).azw) goto _L4; else goto _L5
_L5:
            if (tag != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((c) (obj)).tag != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (azx != ((c) (obj)).azx) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (azy != ((c) (obj)).azy) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (azz != ((c) (obj)).azz) goto _L4; else goto _L11
_L11:
            flag = flag1;
            if (!qu.equals(azA, ((c) (obj)).azA)) goto _L4; else goto _L12
_L12:
            if (azB != null) goto _L14; else goto _L13
_L13:
            flag = flag1;
            if (((c) (obj)).azB != null) goto _L4; else goto _L15
_L15:
            flag = flag1;
            if (!Arrays.equals(azC, ((c) (obj)).azC)) goto _L4; else goto _L16
_L16:
            flag = flag1;
            if (!Arrays.equals(azD, ((c) (obj)).azD)) goto _L4; else goto _L17
_L17:
            flag = flag1;
            if (!Arrays.equals(azE, ((c) (obj)).azE)) goto _L4; else goto _L18
_L18:
            if (azF != null) goto _L20; else goto _L19
_L19:
            flag = flag1;
            if (((c) (obj)).azF != null) goto _L4; else goto _L21
_L21:
            if (azG != null)
            {
                break MISSING_BLOCK_LABEL_274;
            }
            flag = flag1;
            if (((c) (obj)).azG != null) goto _L4; else goto _L22
_L22:
            flag = flag1;
            if (azH == ((c) (obj)).azH)
            {
                return a(((qq) (obj)));
            }
              goto _L4
_L7:
            if (!tag.equals(((c) (obj)).tag))
            {
                return false;
            }
              goto _L8
_L14:
            if (!azB.equals(((c) (obj)).azB))
            {
                return false;
            }
              goto _L15
_L20:
            if (!azF.equals(((c) (obj)).azF))
            {
                return false;
            }
              goto _L21
            if (!azG.equals(((c) (obj)).azG))
            {
                return false;
            }
              goto _L22
        }

        public int hashCode()
        {
            int l = 0;
            int i1 = (int)(azw ^ azw >>> 32);
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
            j1 = azx;
            k1 = azy;
            if (azz)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            l1 = qu.hashCode(azA);
            if (azB == null)
            {
                j = 0;
            } else
            {
                j = azB.hashCode();
            }
            i2 = Arrays.hashCode(azC);
            j2 = Arrays.hashCode(azD);
            k2 = Arrays.hashCode(azE);
            if (azF == null)
            {
                k = 0;
            } else
            {
                k = azF.hashCode();
            }
            if (azG != null)
            {
                l = azG.hashCode();
            }
            return (((k + ((((j + ((c1 + (((i + (i1 + 527) * 31) * 31 + j1) * 31 + k1) * 31) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + k2) * 31) * 31 + l) * 31 + (int)(azH ^ azH >>> 32)) * 31 + rQ();
        }

        public c sc()
        {
            azw = 0L;
            tag = "";
            azx = 0;
            azy = 0;
            azz = false;
            azA = d.sd();
            azB = null;
            azC = qz.azq;
            azD = qz.azq;
            azE = qz.azq;
            azF = null;
            azG = "";
            azH = 0L;
            ayW = null;
            azh = -1;
            return this;
        }

        public c()
        {
            sc();
        }
    }

    public static final class d extends qq
    {

        private static volatile d azI[];
        public String fv;
        public String value;

        public static d[] sd()
        {
            if (azI == null)
            {
                synchronized (qu.azg)
                {
                    if (azI == null)
                    {
                        azI = new d[0];
                    }
                }
            }
            return azI;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        public d B(qo qo1)
            throws IOException
        {
            do
            {
                int i = qo1.rz();
                switch (i)
                {
                default:
                    if (a(qo1, i))
                    {
                        continue;
                    }
                    // fall through

                case 0: // '\0'
                    return this;

                case 10: // '\n'
                    fv = qo1.readString();
                    break;

                case 18: // '\022'
                    value = qo1.readString();
                    break;
                }
            } while (true);
        }

        public void a(qp qp1)
            throws IOException
        {
            if (!fv.equals(""))
            {
                qp1.b(1, fv);
            }
            if (!value.equals(""))
            {
                qp1.b(2, value);
            }
            super.a(qp1);
        }

        public qw b(qo qo1)
            throws IOException
        {
            return B(qo1);
        }

        protected int c()
        {
            int j = super.c();
            int i = j;
            if (!fv.equals(""))
            {
                i = j + qp.j(1, fv);
            }
            j = i;
            if (!value.equals(""))
            {
                j = i + qp.j(2, value);
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
            return a(((qq) (obj)));
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
            return ((i + 527) * 31 + j) * 31 + rQ();
        }

        public d se()
        {
            fv = "";
            value = "";
            ayW = null;
            azh = -1;
            return this;
        }

        public d()
        {
            se();
        }
    }

}
