// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznx, zzny, 
//            zznw, zznr, zznq, zzob

public static final class zzq extends zzns
{

    public zzaNT zzhg[];
    public zzaNT zzhh;
    public String zzhi;

    public static zzq zzb(byte abyte0[])
        throws zznx
    {
        return (zzq)zzny.zza(new <init>(), abyte0);
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
        if (!(obj instanceof <init>)) goto _L4; else goto _L3
_L3:
        obj = (<init>)obj;
        flag = flag1;
        if (!zznw.equals(zzhg, ((zzhg) (obj)).zzhg)) goto _L4; else goto _L5
_L5:
        if (zzhh != null) goto _L7; else goto _L6
_L6:
        flag = flag1;
        if (((zzhh) (obj)).zzhh != null) goto _L4; else goto _L8
_L8:
        if (zzhi != null)
        {
            break MISSING_BLOCK_LABEL_95;
        }
        flag = flag1;
        if (((zzhi) (obj)).zzhi != null) goto _L4; else goto _L9
_L9:
        return zza(((zzns) (obj)));
_L7:
        if (!zzhh.equals(((equals) (obj)).zzhh))
        {
            return false;
        }
          goto _L8
        if (!zzhi.equals(((zzhi) (obj)).zzhi))
        {
            return false;
        }
          goto _L9
    }

    public int hashCode()
    {
        int j = 0;
        int k = zznw.hashCode(zzhg);
        int i;
        if (zzhh == null)
        {
            i = 0;
        } else
        {
            i = zzhh.hashCode();
        }
        if (zzhi != null)
        {
            j = zzhi.hashCode();
        }
        return ((i + (k + 527) * 31) * 31 + j) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (zzhg != null && zzhg.length > 0)
        {
            for (int i = 0; i < zzhg.length; i++)
            {
                zzzP zzzp = zzhg[i];
                if (zzzp != null)
                {
                    zznr1.zza(1, zzzp);
                }
            }

        }
        if (zzhh != null)
        {
            zznr1.zza(2, zzhh);
        }
        if (!zzhi.equals(""))
        {
            zznr1.zzb(3, zzhi);
        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzk(zznq1);
    }

    protected int zzc()
    {
        int i = super.zzc();
        int j = i;
        if (zzhg != null)
        {
            j = i;
            if (zzhg.length > 0)
            {
                int k = 0;
                do
                {
                    j = i;
                    if (k >= zzhg.length)
                    {
                        break;
                    }
                    zzk zzk1 = zzhg[k];
                    j = i;
                    if (zzk1 != null)
                    {
                        j = i + zznr.zzc(1, zzk1);
                    }
                    k++;
                    i = j;
                } while (true);
            }
        }
        i = j;
        if (zzhh != null)
        {
            i = j + zznr.zzc(2, zzhh);
        }
        j = i;
        if (!zzhi.equals(""))
        {
            j = i + zznr.zzj(3, zzhi);
        }
        return j;
    }

    public zzhi zzk(zznq zznq1)
        throws IOException
    {
        do
        {
            int i = zznq1.zzzy();
            switch (i)
            {
            default:
                if (zza(zznq1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int k = zzob.zzb(zznq1, 10);
                zzhi azzhi[];
                int j;
                if (zzhg == null)
                {
                    j = 0;
                } else
                {
                    j = zzhg.length;
                }
                azzhi = new zzhg[k + j];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zzhg, 0, azzhi, 0, j);
                    k = j;
                }
                for (; k < azzhi.length - 1; k++)
                {
                    azzhi[k] = new <init>();
                    zznq1.zza(azzhi[k]);
                    zznq1.zzzy();
                }

                azzhi[k] = new <init>();
                zznq1.zza(azzhi[k]);
                zzhg = azzhi;
                break;

            case 18: // '\022'
                if (zzhh == null)
                {
                    zzhh = new <init>();
                }
                zznq1.zza(zzhh);
                break;

            case 26: // '\032'
                zzhi = zznq1.readString();
                break;
            }
        } while (true);
    }

    public dString zzq()
    {
        zzhg = zzo();
        zzhh = null;
        zzhi = "";
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zzq();
    }
}
