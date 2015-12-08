// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzd, zznw, zznr, 
//            zznq, zzob, zzny

public static final class zzs extends zzns
{

    private static volatile zzaNT zzhj[];
    public int type;
    public String zzhk;
    public zzaNT zzhl[];
    public zzaNT zzhm[];
    public zzaNT zzhn[];
    public String zzho;
    public String zzhp;
    public long zzhq;
    public boolean zzhr;
    public zzaNT zzhs[];
    public int zzht[];
    public boolean zzhu;

    public static zzs[] zzr()
    {
        if (zzhj == null)
        {
            synchronized (zznw.zzaNS)
            {
                if (zzhj == null)
                {
                    zzhj = new zzhj[0];
                }
            }
        }
        return zzhj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
        if (!(obj instanceof zzhj)) goto _L4; else goto _L3
_L3:
        obj = (zzhj)obj;
        flag = flag1;
        if (type != ((type) (obj)).type) goto _L4; else goto _L5
_L5:
        if (zzhk != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zzhk) (obj)).zzhk != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!zznw.equals(zzhl, ((zzhl) (obj)).zzhl)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!zznw.equals(zzhm, ((zzhm) (obj)).zzhm)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!zznw.equals(zzhn, ((zzhn) (obj)).zzhn)) goto _L4; else goto _L11
_L11:
        if (zzho != null) goto _L13; else goto _L12
_L12:
        flag = flag1;
        if (((zzho) (obj)).zzho != null) goto _L4; else goto _L14
_L14:
        if (zzhp != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        flag = flag1;
        if (((zzhp) (obj)).zzhp != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (zzhq == ((zzhq) (obj)).zzhq)
        {
            flag = flag1;
            if (zzhr == ((zzhr) (obj)).zzhr)
            {
                flag = flag1;
                if (zznw.equals(zzhs, ((zzhs) (obj)).zzhs))
                {
                    flag = flag1;
                    if (zznw.equals(zzht, ((zzht) (obj)).zzht))
                    {
                        flag = flag1;
                        if (zzhu == ((zzhu) (obj)).zzhu)
                        {
                            return zza(((zzns) (obj)));
                        }
                    }
                }
            }
        }
          goto _L4
_L7:
        if (!zzhk.equals(((zzhk) (obj)).zzhk))
        {
            return false;
        }
          goto _L8
_L13:
        if (!zzho.equals(((zzho) (obj)).zzho))
        {
            return false;
        }
          goto _L14
        if (!zzhp.equals(((zzhp) (obj)).zzhp))
        {
            return false;
        }
          goto _L15
    }

    public int hashCode()
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
        if (zzhk == null)
        {
            i = 0;
        } else
        {
            i = zzhk.hashCode();
        }
        i1 = zznw.hashCode(zzhl);
        j1 = zznw.hashCode(zzhm);
        k1 = zznw.hashCode(zzhn);
        if (zzho == null)
        {
            j = 0;
        } else
        {
            j = zzho.hashCode();
        }
        if (zzhp != null)
        {
            k = zzhp.hashCode();
        }
        l1 = (int)(zzhq ^ zzhq >>> 32);
        if (zzhr)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        i2 = zznw.hashCode(zzhs);
        j2 = zznw.hashCode(zzht);
        if (!zzhu)
        {
            c1 = '\u04D5';
        }
        return ((((c + (((j + ((((i + (l + 527) * 31) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + k) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + c1) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        boolean flag = false;
        zznr1.zzx(1, type);
        if (!zzhk.equals(""))
        {
            zznr1.zzb(2, zzhk);
        }
        if (zzhl != null && zzhl.length > 0)
        {
            for (int i = 0; i < zzhl.length; i++)
            {
                zzzP zzzp = zzhl[i];
                if (zzzp != null)
                {
                    zznr1.zza(3, zzzp);
                }
            }

        }
        if (zzhm != null && zzhm.length > 0)
        {
            for (int j = 0; j < zzhm.length; j++)
            {
                zzzP zzzp1 = zzhm[j];
                if (zzzp1 != null)
                {
                    zznr1.zza(4, zzzp1);
                }
            }

        }
        if (zzhn != null && zzhn.length > 0)
        {
            for (int k = 0; k < zzhn.length; k++)
            {
                zzzP zzzp2 = zzhn[k];
                if (zzzp2 != null)
                {
                    zznr1.zza(5, zzzp2);
                }
            }

        }
        if (!zzho.equals(""))
        {
            zznr1.zzb(6, zzho);
        }
        if (!zzhp.equals(""))
        {
            zznr1.zzb(7, zzhp);
        }
        if (zzhq != 0L)
        {
            zznr1.zzb(8, zzhq);
        }
        if (zzhu)
        {
            zznr1.zzb(9, zzhu);
        }
        if (zzht != null && zzht.length > 0)
        {
            for (int l = 0; l < zzht.length; l++)
            {
                zznr1.zzx(10, zzht[l]);
            }

        }
        if (zzhs != null && zzhs.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < zzhs.length; i1++)
            {
                zzzP zzzp3 = zzhs[i1];
                if (zzzp3 != null)
                {
                    zznr1.zza(11, zzzp3);
                }
            }

        }
        if (zzhr)
        {
            zznr1.zzb(12, zzhr);
        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzl(zznq1);
    }

    protected int zzc()
    {
        boolean flag = false;
        int j = super.zzc() + zznr.zzz(1, type);
        int i = j;
        if (!zzhk.equals(""))
        {
            i = j + zznr.zzj(2, zzhk);
        }
        j = i;
        if (zzhl != null)
        {
            j = i;
            if (zzhl.length > 0)
            {
                for (j = 0; j < zzhl.length;)
                {
                    zzl zzl1 = zzhl[j];
                    int k = i;
                    if (zzl1 != null)
                    {
                        k = i + zznr.zzc(3, zzl1);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (zzhm != null)
        {
            i = j;
            if (zzhm.length > 0)
            {
                i = j;
                for (j = 0; j < zzhm.length;)
                {
                    zzl zzl2 = zzhm[j];
                    int l = i;
                    if (zzl2 != null)
                    {
                        l = i + zznr.zzc(4, zzl2);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (zzhn != null)
        {
            j = i;
            if (zzhn.length > 0)
            {
                for (j = 0; j < zzhn.length;)
                {
                    zzl zzl3 = zzhn[j];
                    int i1 = i;
                    if (zzl3 != null)
                    {
                        i1 = i + zznr.zzc(5, zzl3);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (!zzho.equals(""))
        {
            i = j + zznr.zzj(6, zzho);
        }
        j = i;
        if (!zzhp.equals(""))
        {
            j = i + zznr.zzj(7, zzhp);
        }
        i = j;
        if (zzhq != 0L)
        {
            i = j + zznr.zzd(8, zzhq);
        }
        j = i;
        if (zzhu)
        {
            j = i + zznr.zzc(9, zzhu);
        }
        i = j;
        if (zzht != null)
        {
            i = j;
            if (zzht.length > 0)
            {
                i = 0;
                int j1 = 0;
                for (; i < zzht.length; i++)
                {
                    j1 += zznr.zzju(zzht[i]);
                }

                i = j + j1 + zzht.length * 1;
            }
        }
        j = i;
        if (zzhs != null)
        {
            j = i;
            if (zzhs.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (k1 >= zzhs.length)
                    {
                        break;
                    }
                    zzl zzl4 = zzhs[k1];
                    j = i;
                    if (zzl4 != null)
                    {
                        j = i + zznr.zzc(11, zzl4);
                    }
                    k1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (zzhr)
        {
            i = j + zznr.zzc(12, zzhr);
        }
        return i;
    }

    public zzhr zzl(zznq zznq1)
        throws IOException
    {
_L16:
        int i = zznq1.zzzy();
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
        if (zza(zznq1, i)) goto _L16; else goto _L2
_L2:
        return this;
_L3:
        i = zznq1.zzzB();
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
        zzhk = zznq1.readString();
        continue; /* Loop/switch isn't completed */
_L5:
        int k = zzob.zzb(zznq1, 26);
        zzhr azzhr[];
        if (zzhl == null)
        {
            i = 0;
        } else
        {
            i = zzhl.length;
        }
        azzhr = new zzhl[k + i];
        k = i;
        if (i != 0)
        {
            System.arraycopy(zzhl, 0, azzhr, 0, i);
            k = i;
        }
        for (; k < azzhr.length - 1; k++)
        {
            azzhr[k] = new <init>();
            zznq1.zza(azzhr[k]);
            zznq1.zzzy();
        }

        azzhr[k] = new <init>();
        zznq1.zza(azzhr[k]);
        zzhl = azzhr;
        continue; /* Loop/switch isn't completed */
_L6:
        int l = zzob.zzb(zznq1, 34);
        zzhr azzhr1[];
        if (zzhm == null)
        {
            i = 0;
        } else
        {
            i = zzhm.length;
        }
        azzhr1 = new zzhm[l + i];
        l = i;
        if (i != 0)
        {
            System.arraycopy(zzhm, 0, azzhr1, 0, i);
            l = i;
        }
        for (; l < azzhr1.length - 1; l++)
        {
            azzhr1[l] = new <init>();
            zznq1.zza(azzhr1[l]);
            zznq1.zzzy();
        }

        azzhr1[l] = new <init>();
        zznq1.zza(azzhr1[l]);
        zzhm = azzhr1;
        continue; /* Loop/switch isn't completed */
_L7:
        int i1 = zzob.zzb(zznq1, 42);
        zzhr azzhr2[];
        if (zzhn == null)
        {
            i = 0;
        } else
        {
            i = zzhn.length;
        }
        azzhr2 = new zzhn[i1 + i];
        i1 = i;
        if (i != 0)
        {
            System.arraycopy(zzhn, 0, azzhr2, 0, i);
            i1 = i;
        }
        for (; i1 < azzhr2.length - 1; i1++)
        {
            azzhr2[i1] = new <init>();
            zznq1.zza(azzhr2[i1]);
            zznq1.zzzy();
        }

        azzhr2[i1] = new <init>();
        zznq1.zza(azzhr2[i1]);
        zzhn = azzhr2;
        continue; /* Loop/switch isn't completed */
_L8:
        zzho = zznq1.readString();
        continue; /* Loop/switch isn't completed */
_L9:
        zzhp = zznq1.readString();
        continue; /* Loop/switch isn't completed */
_L10:
        zzhq = zznq1.zzzA();
        continue; /* Loop/switch isn't completed */
_L11:
        zzhu = zznq1.zzzC();
        continue; /* Loop/switch isn't completed */
_L12:
        int ai[];
        int j1;
        int j2;
        j2 = zzob.zzb(zznq1, 80);
        ai = new int[j2];
        j1 = 0;
        i = 0;
_L22:
        if (j1 >= j2) goto _L18; else goto _L17
_L17:
        int k2;
        if (j1 != 0)
        {
            zznq1.zzzy();
        }
        k2 = zznq1.zzzB();
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
            if (zzht == null)
            {
                j1 = 0;
            } else
            {
                j1 = zzht.length;
            }
            if (j1 == 0 && i == ai.length)
            {
                zzht = ai;
            } else
            {
                int ai1[] = new int[j1 + i];
                if (j1 != 0)
                {
                    System.arraycopy(zzht, 0, ai1, 0, j1);
                }
                System.arraycopy(ai, 0, ai1, j1, i);
                zzht = ai1;
            }
        }
        continue; /* Loop/switch isn't completed */
        if (true) goto _L22; else goto _L21
_L21:
_L13:
        int i2;
        i2 = zznq1.zzjn(zznq1.zzzF());
        i = zznq1.getPosition();
        j1 = 0;
_L28:
        if (zznq1.zzzK() > 0)
        {
            switch (zznq1.zzzB())
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
        zznq1.zzjp(i);
        if (zzht == null)
        {
            i = 0;
        } else
        {
            i = zzht.length;
        }
        ai = new int[j1 + i];
        j1 = i;
        if (i != 0)
        {
            System.arraycopy(zzht, 0, ai, 0, i);
            j1 = i;
        }
_L26:
        if (zznq1.zzzK() > 0)
        {
            i = zznq1.zzzB();
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
        zzht = ai;
_L24:
        zznq1.zzjo(i2);
        continue; /* Loop/switch isn't completed */
        if (true) goto _L26; else goto _L25
_L25:
        if (true) goto _L28; else goto _L27
_L27:
_L14:
        int k1 = zzob.zzb(zznq1, 90);
        zzhr azzhr3[];
        int j;
        if (zzhs == null)
        {
            j = 0;
        } else
        {
            j = zzhs.length;
        }
        azzhr3 = new zzhs[k1 + j];
        k1 = j;
        if (j != 0)
        {
            System.arraycopy(zzhs, 0, azzhr3, 0, j);
            k1 = j;
        }
        for (; k1 < azzhr3.length - 1; k1++)
        {
            azzhr3[k1] = new <init>();
            zznq1.zza(azzhr3[k1]);
            zznq1.zzzy();
        }

        azzhr3[k1] = new <init>();
        zznq1.zza(azzhr3[k1]);
        zzhs = azzhr3;
        continue; /* Loop/switch isn't completed */
_L15:
        zzhr = zznq1.zzzC();
        if (true) goto _L16; else goto _L29
_L29:
    }

    public C zzs()
    {
        type = 1;
        zzhk = "";
        zzhl = zzr();
        zzhm = zzr();
        zzhn = zzr();
        zzho = "";
        zzhp = "";
        zzhq = 0L;
        zzhr = false;
        zzhs = zzr();
        zzht = zzob.zzaNV;
        zzhu = false;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zzs();
    }
}
