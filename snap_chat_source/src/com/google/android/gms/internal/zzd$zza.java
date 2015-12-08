// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzd, zzww, zzwr, 
//            zzwq, zzxb, zzwy

public static final class zzs extends zzws
{

    private static volatile zzaHM zzgu[];
    public int type;
    public String zzgA;
    public long zzgB;
    public boolean zzgC;
    public zzaHM zzgD[];
    public int zzgE[];
    public boolean zzgF;
    public String zzgv;
    public zzaHM zzgw[];
    public zzaHM zzgx[];
    public zzaHM zzgy[];
    public String zzgz;

    public static zzs[] zzr()
    {
        if (zzgu == null)
        {
            synchronized (zzww.zzaHL)
            {
                if (zzgu == null)
                {
                    zzgu = new zzgu[0];
                }
            }
        }
        return zzgu;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
        if (!(obj instanceof zzgu)) goto _L4; else goto _L3
_L3:
        obj = (zzgu)obj;
        flag = flag1;
        if (type != ((type) (obj)).type) goto _L4; else goto _L5
_L5:
        if (zzgv != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zzgv) (obj)).zzgv != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!zzww.equals(zzgw, ((zzgw) (obj)).zzgw)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!zzww.equals(zzgx, ((zzgx) (obj)).zzgx)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!zzww.equals(zzgy, ((zzgy) (obj)).zzgy)) goto _L4; else goto _L11
_L11:
        if (zzgz != null) goto _L13; else goto _L12
_L12:
        flag = flag1;
        if (((zzgz) (obj)).zzgz != null) goto _L4; else goto _L14
_L14:
        if (zzgA != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        flag = flag1;
        if (((zzgA) (obj)).zzgA != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (zzgB == ((zzgB) (obj)).zzgB)
        {
            flag = flag1;
            if (zzgC == ((zzgC) (obj)).zzgC)
            {
                flag = flag1;
                if (zzww.equals(zzgD, ((zzgD) (obj)).zzgD))
                {
                    flag = flag1;
                    if (zzww.equals(zzgE, ((zzgE) (obj)).zzgE))
                    {
                        flag = flag1;
                        if (zzgF == ((zzgF) (obj)).zzgF)
                        {
                            return zza(((zzws) (obj)));
                        }
                    }
                }
            }
        }
          goto _L4
_L7:
        if (!zzgv.equals(((zzgv) (obj)).zzgv))
        {
            return false;
        }
          goto _L8
_L13:
        if (!zzgz.equals(((zzgz) (obj)).zzgz))
        {
            return false;
        }
          goto _L14
        if (!zzgA.equals(((zzgA) (obj)).zzgA))
        {
            return false;
        }
          goto _L15
    }

    public final int hashCode()
    {
        char c1 = '\u04CF';
        int k = 0;
        int l = type;
        int i;
        int j;
        char c;
        int i1;
        int j1;
        int k1;
        int l1;
        int i2;
        int j2;
        if (zzgv == null)
        {
            i = 0;
        } else
        {
            i = zzgv.hashCode();
        }
        i1 = zzww.hashCode(zzgw);
        j1 = zzww.hashCode(zzgx);
        k1 = zzww.hashCode(zzgy);
        if (zzgz == null)
        {
            j = 0;
        } else
        {
            j = zzgz.hashCode();
        }
        if (zzgA != null)
        {
            k = zzgA.hashCode();
        }
        l1 = (int)(zzgB ^ zzgB >>> 32);
        if (zzgC)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        i2 = zzww.hashCode(zzgD);
        j2 = zzww.hashCode(zzgE);
        if (!zzgF)
        {
            c1 = '\u04D5';
        }
        return ((((c + (((j + ((((i + (l + 527) * 31) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + k) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + c1) * 31 + zzvL();
    }

    public final void zza(zzwr zzwr1)
    {
        boolean flag = false;
        zzwr1.zzy(1, type);
        if (!zzgv.equals(""))
        {
            zzwr1.zzb(2, zzgv);
        }
        if (zzgw != null && zzgw.length > 0)
        {
            for (int i = 0; i < zzgw.length; i++)
            {
                zzvL zzvl = zzgw[i];
                if (zzvl != null)
                {
                    zzwr1.zza(3, zzvl);
                }
            }

        }
        if (zzgx != null && zzgx.length > 0)
        {
            for (int j = 0; j < zzgx.length; j++)
            {
                zzvL zzvl1 = zzgx[j];
                if (zzvl1 != null)
                {
                    zzwr1.zza(4, zzvl1);
                }
            }

        }
        if (zzgy != null && zzgy.length > 0)
        {
            for (int k = 0; k < zzgy.length; k++)
            {
                zzvL zzvl2 = zzgy[k];
                if (zzvl2 != null)
                {
                    zzwr1.zza(5, zzvl2);
                }
            }

        }
        if (!zzgz.equals(""))
        {
            zzwr1.zzb(6, zzgz);
        }
        if (!zzgA.equals(""))
        {
            zzwr1.zzb(7, zzgA);
        }
        if (zzgB != 0L)
        {
            zzwr1.zzb(8, zzgB);
        }
        if (zzgF)
        {
            zzwr1.zzb(9, zzgF);
        }
        if (zzgE != null && zzgE.length > 0)
        {
            for (int l = 0; l < zzgE.length; l++)
            {
                zzwr1.zzy(10, zzgE[l]);
            }

        }
        if (zzgD != null && zzgD.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < zzgD.length; i1++)
            {
                zzvL zzvl3 = zzgD[i1];
                if (zzvl3 != null)
                {
                    zzwr1.zza(11, zzvl3);
                }
            }

        }
        if (zzgC)
        {
            zzwr1.zzb(12, zzgC);
        }
        super.zza(zzwr1);
    }

    public final zzwy zzb(zzwq zzwq1)
    {
        return zzl(zzwq1);
    }

    protected final int zzc()
    {
        boolean flag = false;
        int j = super.zzc() + zzwr.zzA(1, type);
        int i = j;
        if (!zzgv.equals(""))
        {
            i = j + zzwr.zzj(2, zzgv);
        }
        j = i;
        if (zzgw != null)
        {
            j = i;
            if (zzgw.length > 0)
            {
                for (j = 0; j < zzgw.length;)
                {
                    zzl zzl1 = zzgw[j];
                    int k = i;
                    if (zzl1 != null)
                    {
                        k = i + zzwr.zzc(3, zzl1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (zzgx != null)
        {
            i = j;
            if (zzgx.length > 0)
            {
                i = j;
                for (j = 0; j < zzgx.length;)
                {
                    zzl zzl2 = zzgx[j];
                    int l = i;
                    if (zzl2 != null)
                    {
                        l = i + zzwr.zzc(4, zzl2);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (zzgy != null)
        {
            j = i;
            if (zzgy.length > 0)
            {
                for (j = 0; j < zzgy.length;)
                {
                    zzl zzl3 = zzgy[j];
                    int i1 = i;
                    if (zzl3 != null)
                    {
                        i1 = i + zzwr.zzc(5, zzl3);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (!zzgz.equals(""))
        {
            i = j + zzwr.zzj(6, zzgz);
        }
        j = i;
        if (!zzgA.equals(""))
        {
            j = i + zzwr.zzj(7, zzgA);
        }
        i = j;
        if (zzgB != 0L)
        {
            i = j + zzwr.zzd(8, zzgB);
        }
        j = i;
        if (zzgF)
        {
            j = i + zzwr.zzc(9, zzgF);
        }
        i = j;
        if (zzgE != null)
        {
            i = j;
            if (zzgE.length > 0)
            {
                i = 0;
                int j1 = 0;
                for (; i < zzgE.length; i++)
                {
                    j1 += zzwr.zziw(zzgE[i]);
                }

                i = j + j1 + zzgE.length * 1;
            }
        }
        j = i;
        if (zzgD != null)
        {
            j = i;
            if (zzgD.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (k1 >= zzgD.length)
                    {
                        break;
                    }
                    zzl zzl4 = zzgD[k1];
                    j = i;
                    if (zzl4 != null)
                    {
                        j = i + zzwr.zzc(11, zzl4);
                    }
                    k1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (zzgC)
        {
            i = j + zzwr.zzc(12, zzgC);
        }
        return i;
    }

    public final zzgC zzl(zzwq zzwq1)
    {
_L16:
        int i = zzwq1.zzvu();
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
        if (zza(zzwq1, i)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        i = zzwq1.zzvx();
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
        zzgv = zzwq1.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        int k = zzxb.zzc(zzwq1, 26);
        zzgC azzgc[];
        if (zzgw == null)
        {
            i = 0;
        } else
        {
            i = zzgw.length;
        }
        azzgc = new zzgw[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(zzgw, 0, azzgc, 0, i);
            k = i;
        }
        for (; k < azzgc.length - 1; k++)
        {
            azzgc[k] = new <init>();
            zzwq1.zza(azzgc[k]);
            zzwq1.zzvu();
        }

        azzgc[k] = new <init>();
        zzwq1.zza(azzgc[k]);
        zzgw = azzgc;
        continue; /* Loop/switch isn't completed */
_L6:
        int l = zzxb.zzc(zzwq1, 34);
        zzgC azzgc1[];
        if (zzgx == null)
        {
            i = 0;
        } else
        {
            i = zzgx.length;
        }
        azzgc1 = new zzgx[l + i];
        l = i;
        if (i != 0)
        {
            System.arraycopy(zzgx, 0, azzgc1, 0, i);
            l = i;
        }
        for (; l < azzgc1.length - 1; l++)
        {
            azzgc1[l] = new <init>();
            zzwq1.zza(azzgc1[l]);
            zzwq1.zzvu();
        }

        azzgc1[l] = new <init>();
        zzwq1.zza(azzgc1[l]);
        zzgx = azzgc1;
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = zzxb.zzc(zzwq1, 42);
        zzgC azzgc2[];
        if (zzgy == null)
        {
            i = 0;
        } else
        {
            i = zzgy.length;
        }
        azzgc2 = new zzgy[i1 + i];
        i1 = i;
        if (i != 0)
        {
            System.arraycopy(zzgy, 0, azzgc2, 0, i);
            i1 = i;
        }
        for (; i1 < azzgc2.length - 1; i1++)
        {
            azzgc2[i1] = new <init>();
            zzwq1.zza(azzgc2[i1]);
            zzwq1.zzvu();
        }

        azzgc2[i1] = new <init>();
        zzwq1.zza(azzgc2[i1]);
        zzgy = azzgc2;
        continue; /* Loop/switch isn't completed */
_L8:
        zzgz = zzwq1.readString();
        continue; /* Loop/switch isn't completed */
_L9:
        zzgA = zzwq1.readString();
        continue; /* Loop/switch isn't completed */
_L10:
        zzgB = zzwq1.zzvw();
        continue; /* Loop/switch isn't completed */
_L11:
        zzgF = zzwq1.zzvy();
        continue; /* Loop/switch isn't completed */
_L12:
        int ai[];
        int j1;
        int j2;
        j2 = zzxb.zzc(zzwq1, 80);
        ai = new int[j2];
        j1 = 0;
        i = 0;
_L22:
        if (j1 >= j2) goto _L18; else goto _L17
_L17:
        int k2;
        if (j1 != 0)
        {
            zzwq1.zzvu();
        }
        k2 = zzwq1.zzvx();
        k2;
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
        j1++;
        continue; /* Loop/switch isn't completed */
_L20:
        int l1 = i + 1;
        ai[i] = k2;
        i = l1;
        if (true) goto _L19; else goto _L18
_L18:
        if (i != 0)
        {
            if (zzgE == null)
            {
                j1 = 0;
            } else
            {
                j1 = zzgE.length;
            }
            if (j1 == 0 && i == j2)
            {
                zzgE = ai;
            } else
            {
                int ai1[] = new int[j1 + i];
                if (j1 != 0)
                {
                    System.arraycopy(zzgE, 0, ai1, 0, j1);
                }
                System.arraycopy(ai, 0, ai1, j1, i);
                zzgE = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L22; else goto _L21
_L21:
_L13:
        int i2;
        i2 = zzwq1.zzip(zzwq1.zzvB());
        i = zzwq1.getPosition();
        j1 = 0;
_L28:
        if (zzwq1.zzvG() > 0)
        {
            switch (zzwq1.zzvx())
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
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        if (j1 == 0) goto _L24; else goto _L23
_L23:
        zzwq1.zzir(i);
        if (zzgE == null)
        {
            i = 0;
        } else
        {
            i = zzgE.length;
        }
        ai = new int[j1 + i];
        j1 = i;
        if (i != 0)
        {
            System.arraycopy(zzgE, 0, ai, 0, i);
            j1 = i;
        }
_L26:
        if (zzwq1.zzvG() > 0)
        {
            i = zzwq1.zzvx();
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
                ai[j1] = i;
                j1++;
                break;
            }
            continue; /* Loop/switch isn't completed */
        }
        zzgE = ai;
_L24:
        zzwq1.zziq(i2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L26; else goto _L25
_L25:
        if (true) goto _L28; else goto _L27
_L27:
_L14:
        int k1 = zzxb.zzc(zzwq1, 90);
        zzgC azzgc3[];
        int j;
        if (zzgD == null)
        {
            j = 0;
        } else
        {
            j = zzgD.length;
        }
        azzgc3 = new zzgD[k1 + j];
        k1 = j;
        if (j != 0)
        {
            System.arraycopy(zzgD, 0, azzgc3, 0, j);
            k1 = j;
        }
        for (; k1 < azzgc3.length - 1; k1++)
        {
            azzgc3[k1] = new <init>();
            zzwq1.zza(azzgc3[k1]);
            zzwq1.zzvu();
        }

        azzgc3[k1] = new <init>();
        zzwq1.zza(azzgc3[k1]);
        zzgD = azzgc3;
        continue; /* Loop/switch isn't completed */
_L15:
        zzgC = zzwq1.zzvy();
        if (true) goto _L16; else goto _L29
_L29:
    }

    public final y zzs()
    {
        type = 1;
        zzgv = "";
        zzgw = zzr();
        zzgx = zzr();
        zzgy = zzr();
        zzgz = "";
        zzgA = "";
        zzgB = 0L;
        zzgC = false;
        zzgD = zzr();
        zzgE = zzxb.zzaHO;
        zzgF = false;
        zzaHB = null;
        zzaHM = -1;
        return this;
    }

    public ()
    {
        zzs();
    }
}
