// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzag, zzrl, zzrg, 
//            zzrq

public static final class zzR extends zzrh
{

    private static volatile zziY zziQ[];
    public int type;
    public String zziR;
    public zziY zziS[];
    public zziY zziT[];
    public zziY zziU[];
    public String zziV;
    public String zziW;
    public long zziX;
    public boolean zziY;
    public zziY zziZ[];
    public int zzja[];
    public boolean zzjb;

    public static zzR[] zzQ()
    {
        if (zziQ == null)
        {
            synchronized (zzrl.zzaWe)
            {
                if (zziQ == null)
                {
                    zziQ = new zziQ[0];
                }
            }
        }
        return zziQ;
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
        if (!(obj instanceof zziQ)) goto _L4; else goto _L3
_L3:
        obj = (zziQ)obj;
        flag = flag1;
        if (type != ((type) (obj)).type) goto _L4; else goto _L5
_L5:
        if (zziR != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zziR) (obj)).zziR != null) goto _L4; else goto _L8
_L8:
        flag = flag1;
        if (!zzrl.equals(zziS, ((zziS) (obj)).zziS)) goto _L4; else goto _L9
_L9:
        flag = flag1;
        if (!zzrl.equals(zziT, ((zziT) (obj)).zziT)) goto _L4; else goto _L10
_L10:
        flag = flag1;
        if (!zzrl.equals(zziU, ((zziU) (obj)).zziU)) goto _L4; else goto _L11
_L11:
        if (zziV != null) goto _L13; else goto _L12
_L12:
        flag = flag1;
        if (((zziV) (obj)).zziV != null) goto _L4; else goto _L14
_L14:
        if (zziW != null)
        {
            break MISSING_BLOCK_LABEL_244;
        }
        flag = flag1;
        if (((zziW) (obj)).zziW != null) goto _L4; else goto _L15
_L15:
        flag = flag1;
        if (zziX == ((zziX) (obj)).zziX)
        {
            flag = flag1;
            if (zziY == ((zziY) (obj)).zziY)
            {
                flag = flag1;
                if (zzrl.equals(zziZ, ((zziZ) (obj)).zziZ))
                {
                    flag = flag1;
                    if (zzrl.equals(zzja, ((zzja) (obj)).zzja))
                    {
                        flag = flag1;
                        if (zzjb == ((zzjb) (obj)).zzjb)
                        {
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
        }
          goto _L4
_L7:
        if (!zziR.equals(((zziR) (obj)).zziR))
        {
            return false;
        }
          goto _L8
_L13:
        if (!zziV.equals(((zziV) (obj)).zziV))
        {
            return false;
        }
          goto _L14
        if (!zziW.equals(((zziW) (obj)).zziW))
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
        if (zziR == null)
        {
            i = 0;
        } else
        {
            i = zziR.hashCode();
        }
        i1 = zzrl.hashCode(zziS);
        j1 = zzrl.hashCode(zziT);
        k1 = zzrl.hashCode(zziU);
        if (zziV == null)
        {
            j = 0;
        } else
        {
            j = zziV.hashCode();
        }
        if (zziW != null)
        {
            k = zziW.hashCode();
        }
        l1 = (int)(zziX ^ zziX >>> 32);
        if (zziY)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        i2 = zzrl.hashCode(zziZ);
        j2 = zzrl.hashCode(zzja);
        if (!zzjb)
        {
            c1 = '\u04D5';
        }
        return ((((c + (((j + ((((i + (l + 527) * 31) * 31 + i1) * 31 + j1) * 31 + k1) * 31) * 31 + k) * 31 + l1) * 31) * 31 + i2) * 31 + j2) * 31 + c1) * 31 + zzBI();
    }

    protected int zzB()
    {
        boolean flag = false;
        int j = super.zzB() + zzrg.zzA(1, type);
        int i = j;
        if (!zziR.equals(""))
        {
            i = j + zzrg.zzk(2, zziR);
        }
        j = i;
        if (zziS != null)
        {
            j = i;
            if (zziS.length > 0)
            {
                for (j = 0; j < zziS.length;)
                {
                    zzBI zzbi = zziS[j];
                    int k = i;
                    if (zzbi != null)
                    {
                        k = i + zzrg.zzc(3, zzbi);
                    }
                    j++;
                    i = k;
                }

                j = i;
            }
        }
        i = j;
        if (zziT != null)
        {
            i = j;
            if (zziT.length > 0)
            {
                i = j;
                for (j = 0; j < zziT.length;)
                {
                    zzBI zzbi1 = zziT[j];
                    int l = i;
                    if (zzbi1 != null)
                    {
                        l = i + zzrg.zzc(4, zzbi1);
                    }
                    j++;
                    i = l;
                }

            }
        }
        j = i;
        if (zziU != null)
        {
            j = i;
            if (zziU.length > 0)
            {
                for (j = 0; j < zziU.length;)
                {
                    zzBI zzbi2 = zziU[j];
                    int i1 = i;
                    if (zzbi2 != null)
                    {
                        i1 = i + zzrg.zzc(5, zzbi2);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (!zziV.equals(""))
        {
            i = j + zzrg.zzk(6, zziV);
        }
        j = i;
        if (!zziW.equals(""))
        {
            j = i + zzrg.zzk(7, zziW);
        }
        i = j;
        if (zziX != 0L)
        {
            i = j + zzrg.zzd(8, zziX);
        }
        j = i;
        if (zzjb)
        {
            j = i + zzrg.zzc(9, zzjb);
        }
        i = j;
        if (zzja != null)
        {
            i = j;
            if (zzja.length > 0)
            {
                i = 0;
                int j1 = 0;
                for (; i < zzja.length; i++)
                {
                    j1 += zzrg.zzkJ(zzja[i]);
                }

                i = j + j1 + zzja.length * 1;
            }
        }
        j = i;
        if (zziZ != null)
        {
            j = i;
            if (zziZ.length > 0)
            {
                int k1 = ((flag) ? 1 : 0);
                do
                {
                    j = i;
                    if (k1 >= zziZ.length)
                    {
                        break;
                    }
                    zzBI zzbi3 = zziZ[k1];
                    j = i;
                    if (zzbi3 != null)
                    {
                        j = i + zzrg.zzc(11, zzbi3);
                    }
                    k1++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (zziY)
        {
            i = j + zzrg.zzc(12, zziY);
        }
        return i;
    }

    public zziY zzR()
    {
        type = 1;
        zziR = "";
        zziS = zzQ();
        zziT = zzQ();
        zziU = zzQ();
        zziV = "";
        zziW = "";
        zziX = 0L;
        zziY = false;
        zziZ = zzQ();
        zzja = zzrq.zzaWh;
        zzjb = false;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        boolean flag = false;
        zzrg1.zzy(1, type);
        if (!zziR.equals(""))
        {
            zzrg1.zzb(2, zziR);
        }
        if (zziS != null && zziS.length > 0)
        {
            for (int i = 0; i < zziS.length; i++)
            {
                zzaWf zzawf = zziS[i];
                if (zzawf != null)
                {
                    zzrg1.zza(3, zzawf);
                }
            }

        }
        if (zziT != null && zziT.length > 0)
        {
            for (int j = 0; j < zziT.length; j++)
            {
                zzaWf zzawf1 = zziT[j];
                if (zzawf1 != null)
                {
                    zzrg1.zza(4, zzawf1);
                }
            }

        }
        if (zziU != null && zziU.length > 0)
        {
            for (int k = 0; k < zziU.length; k++)
            {
                zzaWf zzawf2 = zziU[k];
                if (zzawf2 != null)
                {
                    zzrg1.zza(5, zzawf2);
                }
            }

        }
        if (!zziV.equals(""))
        {
            zzrg1.zzb(6, zziV);
        }
        if (!zziW.equals(""))
        {
            zzrg1.zzb(7, zziW);
        }
        if (zziX != 0L)
        {
            zzrg1.zzb(8, zziX);
        }
        if (zzjb)
        {
            zzrg1.zzb(9, zzjb);
        }
        if (zzja != null && zzja.length > 0)
        {
            for (int l = 0; l < zzja.length; l++)
            {
                zzrg1.zzy(10, zzja[l]);
            }

        }
        if (zziZ != null && zziZ.length > 0)
        {
            for (int i1 = ((flag) ? 1 : 0); i1 < zziZ.length; i1++)
            {
                zzaWf zzawf3 = zziZ[i1];
                if (zzawf3 != null)
                {
                    zzrg1.zza(11, zzawf3);
                }
            }

        }
        if (zziY)
        {
            zzrg1.zzb(12, zziY);
        }
        super.zza(zzrg1);
    }

    public ()
    {
        zzR();
    }
}
