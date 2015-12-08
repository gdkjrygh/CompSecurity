// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrl, zzrg

public static final class zzG extends zzrh
{

    public zzhY zzhW[];
    public zzhY zzhX[];
    public zzhY zzhY[];

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
            if (obj instanceof zzG)
            {
                obj = (zzG)obj;
                flag = flag1;
                if (zzrl.equals(zzhW, ((zzhW) (obj)).zzhW))
                {
                    flag = flag1;
                    if (zzrl.equals(zzhX, ((zzhX) (obj)).zzhX))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzhY, ((zzhY) (obj)).zzhY))
                        {
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((zzrl.hashCode(zzhW) + 527) * 31 + zzrl.hashCode(zzhX)) * 31 + zzrl.hashCode(zzhY)) * 31 + zzBI();
    }

    protected int zzB()
    {
        boolean flag = false;
        int i = super.zzB();
        int j = i;
        if (zzhW != null)
        {
            j = i;
            if (zzhW.length > 0)
            {
                for (j = 0; j < zzhW.length;)
                {
                    zzBI zzbi = zzhW[j];
                    int i1 = i;
                    if (zzbi != null)
                    {
                        i1 = i + zzrg.zzc(1, zzbi);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (zzhX != null)
        {
            i = j;
            if (zzhX.length > 0)
            {
                i = j;
                for (int k = 0; k < zzhX.length;)
                {
                    zzBI zzbi1 = zzhX[k];
                    int j1 = i;
                    if (zzbi1 != null)
                    {
                        j1 = i + zzrg.zzc(2, zzbi1);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (zzhY != null)
        {
            k1 = i;
            if (zzhY.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= zzhY.length)
                    {
                        break;
                    }
                    zzBI zzbi2 = zzhY[l];
                    k1 = i;
                    if (zzbi2 != null)
                    {
                        k1 = i + zzrg.zzc(3, zzbi2);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public zzhY zzG()
    {
        zzhW = zzQ();
        zzhX = zzQ();
        zzhY = zzE();
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        boolean flag = false;
        if (zzhW != null && zzhW.length > 0)
        {
            for (int i = 0; i < zzhW.length; i++)
            {
                zzaWf zzawf = zzhW[i];
                if (zzawf != null)
                {
                    zzrg1.zza(1, zzawf);
                }
            }

        }
        if (zzhX != null && zzhX.length > 0)
        {
            for (int j = 0; j < zzhX.length; j++)
            {
                zzaWf zzawf1 = zzhX[j];
                if (zzawf1 != null)
                {
                    zzrg1.zza(2, zzawf1);
                }
            }

        }
        if (zzhY != null && zzhY.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < zzhY.length; k++)
            {
                zzaWf zzawf2 = zzhY[k];
                if (zzawf2 != null)
                {
                    zzrg1.zza(3, zzawf2);
                }
            }

        }
        super.zza(zzrg1);
    }

    public ()
    {
        zzG();
    }
}
