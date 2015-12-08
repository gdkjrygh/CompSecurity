// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            qq, d, qu, qp, 
//            qo, qz, qw

public static final class s extends qq
{

    private static volatile azh gu[];
    public String gA;
    public long gB;
    public boolean gC;
    public azh gD[];
    public int gE[];
    public boolean gF;
    public String gv;
    public azh gw[];
    public azh gx[];
    public azh gy[];
    public String gz;
    public int type;

    public static s[] r()
    {
        if (gu == null)
        {
            synchronized (qu.azg)
            {
                if (gu == null)
                {
                    gu = new gu[0];
                }
            }
        }
        return gu;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void a(qp qp1)
        throws IOException
    {
        boolean flag = false;
        qp1.t(1, type);
        if (!gv.equals(""))
        {
            qp1.b(2, gv);
        }
        if (gw != null && gw.length > 0)
        {
            for (int i = 0; i < gw.length; i++)
            {
                gu gu1 = gw[i];
                if (gu1 != null)
                {
                    qp1.a(3, gu1);
                }
            }

        }
        if (gx != null && gx.length > 0)
        {
            for (int j = 0; j < gx.length; j++)
            {
                gu gu2 = gx[j];
                if (gu2 != null)
                {
                    qp1.a(4, gu2);
                }
            }

        }
        if (gy != null && gy.length > 0)
        {
            for (int k = 0; k < gy.length; k++)
            {
                gu gu3 = gy[k];
                if (gu3 != null)
                {
                    qp1.a(5, gu3);
                }
            }

        }
        if (!gz.equals(""))
        {
            qp1.b(6, gz);
        }
        if (!gA.equals(""))
        {
            qp1.b(7, gA);
        }
        if (gB != 0L)
        {
            qp1.b(8, gB);
        }
        if (gF)
        {
            qp1.b(9, gF);
        }
        if (gE != null && gE.length > 0)
        {
            for (int i1 = 0; i1 < gE.length; i1++)
            {
                qp1.t(10, gE[i1]);
            }

        }
        if (gD != null && gD.length > 0)
        {
            for (int j1 = ((flag) ? 1 : 0); j1 < gD.length; j1++)
            {
                gu gu4 = gD[j1];
                if (gu4 != null)
                {
                    qp1.a(11, gu4);
                }
            }

        }
        if (gC)
        {
            qp1.b(12, gC);
        }
        super.a(qp1);
    }

    public qw b(qo qo1)
        throws IOException
    {
        return l(qo1);
    }

    protected int c()
    {
        boolean flag = false;
        int j = super.c() + qp.v(1, type);
        int i = j;
        if (!gv.equals(""))
        {
            i = j + qp.j(2, gv);
        }
        j = i;
        if (gw != null)
        {
            j = i;
            if (gw.length > 0)
            {
                for (j = 0; j < gw.length;)
                {
                    l l1 = gw[j];
                    int k = i;
                    if (l1 != null)
                    {
                        k = i + qp.c(3, l1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (gx != null)
        {
            i = j;
            if (gx.length > 0)
            {
                i = j;
                for (j = 0; j < gx.length;)
                {
                    l l2 = gx[j];
                    int i1 = i;
                    if (l2 != null)
                    {
                        i1 = i + qp.c(4, l2);
                    }
                    j++;
                    i = i1;
                }

            }
        }
        j = i;
        if (gy != null)
        {
            j = i;
            if (gy.length > 0)
            {
                for (j = 0; j < gy.length;)
                {
                    l l3 = gy[j];
                    int j1 = i;
                    if (l3 != null)
                    {
                        j1 = i + qp.c(5, l3);
                    }
                    j++;
                    i = j1;
                }

                j = i;
            }
        }
        i = j;
        if (!gz.equals(""))
        {
            i = j + qp.j(6, gz);
        }
        j = i;
        if (!gA.equals(""))
        {
            j = i + qp.j(7, gA);
        }
        i = j;
        if (gB != 0L)
        {
            i = j + qp.d(8, gB);
        }
        j = i;
        if (gF)
        {
            j = i + qp.c(9, gF);
        }
        i = j;
        if (gE != null)
        {
            i = j;
            if (gE.length > 0)
            {
                i = 0;
                int k1 = 0;
                for (; i < gE.length; i++)
                {
                    k1 += qp.gZ(gE[i]);
                }

                i = j + k1 + gE.length * 1;
            }
        }
        j = i;
        if (gD != null)
        {
            j = i;
            if (gD.length > 0)
            {
                int i2 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (i2 >= gD.length)
                    {
                        break;
                    }
                    l l4 = gD[i2];
                    j = i;
                    if (l4 != null)
                    {
                        j = i + qp.c(11, l4);
                    }
                    i2++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (gC)
        {
            i = j + qp.c(12, gC);
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
        if (!(obj instanceof gC)) goto _L4; else goto _L3
_L3:
        obj = (gC)obj;
        flag = flag1;
        if (type != ((type) (obj)).type) goto _L4; else goto _L5
_L5:
        if (gv != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((gv) (obj)).gv != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!qu.equals(gw, ((gw) (obj)).gw)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!qu.equals(gx, ((gx) (obj)).gx)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!qu.equals(gy, ((gy) (obj)).gy)) goto _L4; else goto _L11
_L11:
        if (gz != null) goto _L13; else goto _L12
_L12:
        flag = flag1;
        if (((gz) (obj)).gz != null) goto _L4; else goto _L14
_L14:
        if (gA != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        flag = flag1;
        if (((gA) (obj)).gA != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (gB == ((gB) (obj)).gB)
        {
            flag = flag1;
            if (gC == ((gC) (obj)).gC)
            {
                flag = flag1;
                if (qu.equals(gD, ((gD) (obj)).gD))
                {
                    flag = flag1;
                    if (qu.equals(gE, ((gE) (obj)).gE))
                    {
                        flag = flag1;
                        if (gF == ((gF) (obj)).gF)
                        {
                            return a(((qq) (obj)));
                        }
                    }
                }
            }
        }
          goto _L4
_L7:
        if (!gv.equals(((gv) (obj)).gv))
        {
            return false;
        }
          goto _L8
_L13:
        if (!gz.equals(((gz) (obj)).gz))
        {
            return false;
        }
          goto _L14
        if (!gA.equals(((gA) (obj)).gA))
        {
            return false;
        }
          goto _L15
    }

    public int hashCode()
    {
        char c2 = '\u04CF';
        int k = 0;
        int i1 = type;
        int i;
        int j;
        char c1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        int k2;
        if (gv == null)
        {
            i = 0;
        } else
        {
            i = gv.hashCode();
        }
        j1 = qu.hashCode(gw);
        k1 = qu.hashCode(gx);
        l1 = qu.hashCode(gy);
        if (gz == null)
        {
            j = 0;
        } else
        {
            j = gz.hashCode();
        }
        if (gA != null)
        {
            k = gA.hashCode();
        }
        i2 = (int)(gB ^ gB >>> 32);
        if (gC)
        {
            c1 = '\u04CF';
        } else
        {
            c1 = '\u04D5';
        }
        j2 = qu.hashCode(gD);
        k2 = qu.hashCode(gE);
        if (!gF)
        {
            c2 = '\u04D5';
        }
        return ((((c1 + (((j + ((((i + (i1 + 527) * 31) * 31 + j1) * 31 + k1) * 31 + l1) * 31) * 31 + k) * 31 + i2) * 31) * 31 + j2) * 31 + k2) * 31 + c2) * 31 + rQ();
    }

    public rQ l(qo qo1)
        throws IOException
    {
_L16:
        int i = qo1.rz();
        i;
        JVM INSTR lookupswitch 14: default 132
    //                   0: 142
    //                   8: 144
    //                   18: 212
    //                   26: 223
    //                   34: 354
    //                   42: 485
    //                   50: 616
    //                   58: 627
    //                   64: 638
    //                   72: 649
    //                   80: 660
    //                   82: 904
    //                   90: 1222
    //                   96: 1353;
           goto _L1 _L2 _L3 _L4 _L5 _L6 _L7 _L8 _L9 _L10 _L11 _L12 _L13 _L14 _L15
_L1:
        if (a(qo1, i)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        i = qo1.rC();
        switch (i)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
        case 4: // '\004'
        case 5: // '\005'
        case 6: // '\006'
        case 7: // '\007'
        case 8: // '\b'
            type = i;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        gv = qo1.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        int k = qz.b(qo1, 26);
        rQ arq[];
        if (gw == null)
        {
            i = 0;
        } else
        {
            i = gw.length;
        }
        arq = new gw[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(gw, 0, arq, 0, i);
            k = i;
        }
        for (; k < arq.length - 1; k++)
        {
            arq[k] = new <init>();
            qo1.a(arq[k]);
            qo1.rz();
        }

        arq[k] = new <init>();
        qo1.a(arq[k]);
        gw = arq;
        continue; /* Loop/switch isn't completed */
_L6:
        int i1 = qz.b(qo1, 34);
        rQ arq1[];
        if (gx == null)
        {
            i = 0;
        } else
        {
            i = gx.length;
        }
        arq1 = new gx[i1 + i];
        i1 = i;
        if (i != 0)
        {
            System.arraycopy(gx, 0, arq1, 0, i);
            i1 = i;
        }
        for (; i1 < arq1.length - 1; i1++)
        {
            arq1[i1] = new <init>();
            qo1.a(arq1[i1]);
            qo1.rz();
        }

        arq1[i1] = new <init>();
        qo1.a(arq1[i1]);
        gx = arq1;
        continue; /* Loop/switch isn't completed */
_L7:
        int j1 = qz.b(qo1, 42);
        rQ arq2[];
        if (gy == null)
        {
            i = 0;
        } else
        {
            i = gy.length;
        }
        arq2 = new gy[j1 + i];
        j1 = i;
        if (i != 0)
        {
            System.arraycopy(gy, 0, arq2, 0, i);
            j1 = i;
        }
        for (; j1 < arq2.length - 1; j1++)
        {
            arq2[j1] = new <init>();
            qo1.a(arq2[j1]);
            qo1.rz();
        }

        arq2[j1] = new <init>();
        qo1.a(arq2[j1]);
        gy = arq2;
        continue; /* Loop/switch isn't completed */
_L8:
        gz = qo1.readString();
        continue; /* Loop/switch isn't completed */
_L9:
        gA = qo1.readString();
        continue; /* Loop/switch isn't completed */
_L10:
        gB = qo1.rB();
        continue; /* Loop/switch isn't completed */
_L11:
        gF = qo1.rD();
        continue; /* Loop/switch isn't completed */
_L12:
        int ai[];
        int k1;
        int k2;
        k2 = qz.b(qo1, 80);
        ai = new int[k2];
        k1 = 0;
        i = 0;
_L22:
        if (k1 >= k2) goto _L18; else goto _L17
_L17:
        int l2;
        if (k1 != 0)
        {
            qo1.rz();
        }
        l2 = qo1.rC();
        l2;
        JVM INSTR tableswitch 1 17: default 788
    //                   1 797
    //                   2 797
    //                   3 797
    //                   4 797
    //                   5 797
    //                   6 797
    //                   7 797
    //                   8 797
    //                   9 797
    //                   10 797
    //                   11 797
    //                   12 797
    //                   13 797
    //                   14 797
    //                   15 797
    //                   16 797
    //                   17 797;
           goto _L19 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20 _L20
_L19:
        k1++;
        continue; /* Loop/switch isn't completed */
_L20:
        int i2 = i + 1;
        ai[i] = l2;
        i = i2;
        if (true) goto _L19; else goto _L18
_L18:
        if (i != 0)
        {
            if (gE == null)
            {
                k1 = 0;
            } else
            {
                k1 = gE.length;
            }
            if (k1 == 0 && i == ai.length)
            {
                gE = ai;
            } else
            {
                int ai1[] = new int[k1 + i];
                if (k1 != 0)
                {
                    System.arraycopy(gE, 0, ai1, 0, k1);
                }
                System.arraycopy(ai, 0, ai1, k1, i);
                gE = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L22; else goto _L21
_L21:
_L13:
        int j2;
        j2 = qo1.gS(qo1.rG());
        i = qo1.getPosition();
        k1 = 0;
_L28:
        if (qo1.rL() > 0)
        {
            switch (qo1.rC())
            {
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
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (k1 == 0) goto _L24; else goto _L23
_L23:
        qo1.gU(i);
        if (gE == null)
        {
            i = 0;
        } else
        {
            i = gE.length;
        }
        ai = new int[k1 + i];
        k1 = i;
        if (i != 0)
        {
            System.arraycopy(gE, 0, ai, 0, i);
            k1 = i;
        }
_L26:
        if (qo1.rL() > 0)
        {
            i = qo1.rC();
            switch (i)
            {
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
                ai[k1] = i;
                k1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        gE = ai;
_L24:
        qo1.gT(j2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L26; else goto _L25
_L25:
        if (true) goto _L28; else goto _L27
_L27:
_L14:
        int l1 = qz.b(qo1, 90);
        rQ arq3[];
        int j;
        if (gD == null)
        {
            j = 0;
        } else
        {
            j = gD.length;
        }
        arq3 = new gD[l1 + j];
        l1 = j;
        if (j != 0)
        {
            System.arraycopy(gD, 0, arq3, 0, j);
            l1 = j;
        }
        for (; l1 < arq3.length - 1; l1++)
        {
            arq3[l1] = new <init>();
            qo1.a(arq3[l1]);
            qo1.rz();
        }

        arq3[l1] = new <init>();
        qo1.a(arq3[l1]);
        gD = arq3;
        continue; /* Loop/switch isn't completed */
_L15:
        gC = qo1.rD();
        if (true) goto _L16; else goto _L29
_L29:
    }

    public D s()
    {
        type = 1;
        gv = "";
        gw = r();
        gx = r();
        gy = r();
        gz = "";
        gA = "";
        gB = 0L;
        gC = false;
        gD = r();
        gE = qz.azj;
        gF = false;
        ayW = null;
        azh = -1;
        return this;
    }

    public ()
    {
        s();
    }
}
