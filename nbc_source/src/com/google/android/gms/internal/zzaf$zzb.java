// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrl, zzrg, 
//            zzrq

public static final class zzD extends zzrh
{

    private static volatile zzhP zzhM[];
    public int name;
    public int zzhN[];
    public int zzhO;
    public boolean zzhP;
    public boolean zzhQ;

    public static zzD[] zzC()
    {
        if (zzhM == null)
        {
            synchronized (zzrl.zzaWe)
            {
                if (zzhM == null)
                {
                    zzhM = new zzhM[0];
                }
            }
        }
        return zzhM;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
            if (obj instanceof zzhM)
            {
                obj = (zzhM)obj;
                flag = flag1;
                if (zzrl.equals(zzhN, ((zzhN) (obj)).zzhN))
                {
                    flag = flag1;
                    if (zzhO == ((zzhO) (obj)).zzhO)
                    {
                        flag = flag1;
                        if (name == ((name) (obj)).name)
                        {
                            flag = flag1;
                            if (zzhP == ((zzhP) (obj)).zzhP)
                            {
                                flag = flag1;
                                if (zzhQ == ((zzhQ) (obj)).zzhQ)
                                {
                                    return zza(((zzrh) (obj)));
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
        char c1 = '\u04CF';
        int i = zzrl.hashCode(zzhN);
        int j = zzhO;
        int k = name;
        char c;
        if (zzhP)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!zzhQ)
        {
            c1 = '\u04D5';
        }
        return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c1) * 31 + zzBI();
    }

    protected int zzB()
    {
        int j = 0;
        int k = super.zzB();
        int i = k;
        if (zzhQ)
        {
            i = k + zzrg.zzc(1, zzhQ);
        }
        k = zzrg.zzA(2, zzhO) + i;
        if (zzhN != null && zzhN.length > 0)
        {
            for (i = 0; i < zzhN.length; i++)
            {
                j += zzrg.zzkJ(zzhN[i]);
            }

            j = k + j + zzhN.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (name != 0)
        {
            i = j + zzrg.zzA(4, name);
        }
        j = i;
        if (zzhP)
        {
            j = i + zzrg.zzc(6, zzhP);
        }
        return j;
    }

    public zzhP zzD()
    {
        zzhN = zzrq.zzaWh;
        zzhO = 0;
        name = 0;
        zzhP = false;
        zzhQ = false;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (zzhQ)
        {
            zzrg1.zzb(1, zzhQ);
        }
        zzrg1.zzy(2, zzhO);
        if (zzhN != null && zzhN.length > 0)
        {
            for (int i = 0; i < zzhN.length; i++)
            {
                zzrg1.zzy(3, zzhN[i]);
            }

        }
        if (name != 0)
        {
            zzrg1.zzy(4, name);
        }
        if (zzhP)
        {
            zzrg1.zzb(6, zzhP);
        }
        super.zza(zzrg1);
    }

    public ()
    {
        zzD();
    }
}
