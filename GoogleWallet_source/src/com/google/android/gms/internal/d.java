// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            xy, yc, yh, xx

public interface d
{
    public static final class a extends xy
    {

        private static volatile a gt[];
        public long gA;
        public boolean gB;
        public a gC[];
        public int gD[];
        public boolean gE;
        public String gu;
        public a gv[];
        public a gw[];
        public a gx[];
        public String gy;
        public String gz;
        public int type;

        private static a[] r()
        {
            if (gt == null)
            {
                synchronized (yc.aYt)
                {
                    if (gt == null)
                    {
                        gt = new a[0];
                    }
                }
            }
            return gt;
            exception;
            obj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private a s()
        {
            type = 1;
            gu = "";
            gv = r();
            gw = r();
            gx = r();
            gy = "";
            gz = "";
            gA = 0L;
            gB = false;
            gC = r();
            gD = yh.aYv;
            gE = false;
            aYj = null;
            aYu = -1;
            return this;
        }

        protected final int c()
        {
            boolean flag = false;
            int j = super.c() + xx.E(1, type);
            int i = j;
            if (!gu.equals(""))
            {
                i = j + xx.j(2, gu);
            }
            j = i;
            if (gv != null)
            {
                j = i;
                if (gv.length > 0)
                {
                    for (j = 0; j < gv.length;)
                    {
                        a a1 = gv[j];
                        int k = i;
                        if (a1 != null)
                        {
                            k = i + xx.c(3, a1);
                        }
                        j++;
                        i = k;
                    }

                    j = i;
                }
            }
            i = j;
            if (gw != null)
            {
                i = j;
                if (gw.length > 0)
                {
                    i = j;
                    for (j = 0; j < gw.length;)
                    {
                        a a2 = gw[j];
                        int l = i;
                        if (a2 != null)
                        {
                            l = i + xx.c(4, a2);
                        }
                        j++;
                        i = l;
                    }

                }
            }
            j = i;
            if (gx != null)
            {
                j = i;
                if (gx.length > 0)
                {
                    for (j = 0; j < gx.length;)
                    {
                        a a3 = gx[j];
                        int i1 = i;
                        if (a3 != null)
                        {
                            i1 = i + xx.c(5, a3);
                        }
                        j++;
                        i = i1;
                    }

                    j = i;
                }
            }
            i = j;
            if (!gy.equals(""))
            {
                i = j + xx.j(6, gy);
            }
            j = i;
            if (!gz.equals(""))
            {
                j = i + xx.j(7, gz);
            }
            i = j;
            if (gA != 0L)
            {
                i = j + xx.d(8, gA);
            }
            j = i;
            if (gE)
            {
                j = i + xx.c(9, gE);
            }
            i = j;
            if (gD != null)
            {
                i = j;
                if (gD.length > 0)
                {
                    i = 0;
                    int j1 = 0;
                    for (; i < gD.length; i++)
                    {
                        j1 += xx.mi(gD[i]);
                    }

                    i = j + j1 + gD.length * 1;
                }
            }
            j = i;
            if (gC != null)
            {
                j = i;
                if (gC.length > 0)
                {
                    int k1 = ((flag) ? 1 : 0);
                    do
                    {
                        j = i;
                        if (k1 >= gC.length)
                        {
                            break;
                        }
                        a a4 = gC[k1];
                        j = i;
                        if (a4 != null)
                        {
                            j = i + xx.c(11, a4);
                        }
                        k1++;
                        i = j;
                    } while (true);
                }
            }
            i = j;
            if (gB)
            {
                i = j + xx.c(12, gB);
            }
            return i;
        }

        public final boolean equals(Object obj)
        {
            boolean flag1 = false;
            if (obj != this) goto _L2; else goto _L1
_L1:
            boolean flag = true;
_L4:
            return flag;
_L2:
            flag = flag1;
            if (!(obj instanceof a)) goto _L4; else goto _L3
_L3:
            obj = (a)obj;
            flag = flag1;
            if (type != ((a) (obj)).type) goto _L4; else goto _L5
_L5:
            if (gu != null) goto _L7; else goto _L6
_L6:
            flag = flag1;
            if (((a) (obj)).gu != null) goto _L4; else goto _L8
_L8:
            flag = flag1;
            if (!yc.equals(gv, ((a) (obj)).gv)) goto _L4; else goto _L9
_L9:
            flag = flag1;
            if (!yc.equals(gw, ((a) (obj)).gw)) goto _L4; else goto _L10
_L10:
            flag = flag1;
            if (!yc.equals(gx, ((a) (obj)).gx)) goto _L4; else goto _L11
_L11:
            if (gy != null) goto _L13; else goto _L12
_L12:
            flag = flag1;
            if (((a) (obj)).gy != null) goto _L4; else goto _L14
_L14:
            if (gz != null)
            {
                break MISSING_BLOCK_LABEL_244;
            }
            flag = flag1;
            if (((a) (obj)).gz != null) goto _L4; else goto _L15
_L15:
            flag = flag1;
            if (gA == ((a) (obj)).gA)
            {
                flag = flag1;
                if (gB == ((a) (obj)).gB)
                {
                    flag = flag1;
                    if (yc.equals(gC, ((a) (obj)).gC))
                    {
                        flag = flag1;
                        if (yc.equals(gD, ((a) (obj)).gD))
                        {
                            flag = flag1;
                            if (gE == ((a) (obj)).gE)
                            {
                                return a(((xy) (obj)));
                            }
                        }
                    }
                }
            }
              goto _L4
_L7:
            if (!gu.equals(((a) (obj)).gu))
            {
                return false;
            }
              goto _L8
_L13:
            if (!gy.equals(((a) (obj)).gy))
            {
                return false;
            }
              goto _L14
            if (!gz.equals(((a) (obj)).gz))
            {
                return false;
            }
              goto _L15
        }

        public final int hashCode()
        {
            char c2 = '\u04CF';
            int k = 0;
            int l = type;
            int i;
            int j;
            char c1;
            int i1;
            int j1;
            int k1;
            int l1;
            int i2;
            int j2;
            if (gu == null)
            {
                i = 0;
            } else
            {
                i = gu.hashCode();
            }
            i1 = yc.hashCode(gv);
            j1 = yc.hashCode(gw);
            k1 = yc.hashCode(gx);
            if (gy == null)
            {
                j = 0;
            } else
            {
                j = gy.hashCode();
            }
            if (gz != null)
            {
                k = gz.hashCode();
            }
            l1 = (int)(gA ^ gA >>> 32);
            if (gB)
            {
                c1 = '\u04CF';
            } else
            {
                c1 = '\u04D5';
            }
            i2 = yc.hashCode(gC);
            j2 = yc.hashCode(gD);
            if (!gE)
            {
                c2 = '\u04D5';
            }
            return ((((c1 + (((j + ((((i + (l + 527) * 31) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + k) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + c2) * 31 + vL();
        }

        public final void writeTo(xx xx1)
            throws IOException
        {
            boolean flag = false;
            xx1.C(1, type);
            if (!gu.equals(""))
            {
                xx1.b(2, gu);
            }
            if (gv != null && gv.length > 0)
            {
                for (int i = 0; i < gv.length; i++)
                {
                    a a1 = gv[i];
                    if (a1 != null)
                    {
                        xx1.a(3, a1);
                    }
                }

            }
            if (gw != null && gw.length > 0)
            {
                for (int j = 0; j < gw.length; j++)
                {
                    a a2 = gw[j];
                    if (a2 != null)
                    {
                        xx1.a(4, a2);
                    }
                }

            }
            if (gx != null && gx.length > 0)
            {
                for (int k = 0; k < gx.length; k++)
                {
                    a a3 = gx[k];
                    if (a3 != null)
                    {
                        xx1.a(5, a3);
                    }
                }

            }
            if (!gy.equals(""))
            {
                xx1.b(6, gy);
            }
            if (!gz.equals(""))
            {
                xx1.b(7, gz);
            }
            if (gA != 0L)
            {
                xx1.b(8, gA);
            }
            if (gE)
            {
                xx1.b(9, gE);
            }
            if (gD != null && gD.length > 0)
            {
                for (int l = 0; l < gD.length; l++)
                {
                    xx1.C(10, gD[l]);
                }

            }
            if (gC != null && gC.length > 0)
            {
                for (int i1 = ((flag) ? 1 : 0); i1 < gC.length; i1++)
                {
                    a a4 = gC[i1];
                    if (a4 != null)
                    {
                        xx1.a(11, a4);
                    }
                }

            }
            if (gB)
            {
                xx1.b(12, gB);
            }
            super.writeTo(xx1);
        }

        public a()
        {
            s();
        }
    }

}
