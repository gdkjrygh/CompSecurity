// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrl, zzrg, 
//            zzrq

public static final class zzL extends zzrh
{

    private static volatile zziA zziq[];
    public int zziA[];
    public int zzir[];
    public int zzis[];
    public int zzit[];
    public int zziu[];
    public int zziv[];
    public int zziw[];
    public int zzix[];
    public int zziy[];
    public int zziz[];

    public static zzL[] zzK()
    {
        if (zziq == null)
        {
            synchronized (zzrl.zzaWe)
            {
                if (zziq == null)
                {
                    zziq = new zziq[0];
                }
            }
        }
        return zziq;
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
            if (obj instanceof zziq)
            {
                obj = (zziq)obj;
                flag = flag1;
                if (zzrl.equals(zzir, ((zzir) (obj)).zzir))
                {
                    flag = flag1;
                    if (zzrl.equals(zzis, ((zzis) (obj)).zzis))
                    {
                        flag = flag1;
                        if (zzrl.equals(zzit, ((zzit) (obj)).zzit))
                        {
                            flag = flag1;
                            if (zzrl.equals(zziu, ((zziu) (obj)).zziu))
                            {
                                flag = flag1;
                                if (zzrl.equals(zziv, ((zziv) (obj)).zziv))
                                {
                                    flag = flag1;
                                    if (zzrl.equals(zziw, ((zziw) (obj)).zziw))
                                    {
                                        flag = flag1;
                                        if (zzrl.equals(zzix, ((zzix) (obj)).zzix))
                                        {
                                            flag = flag1;
                                            if (zzrl.equals(zziy, ((zziy) (obj)).zziy))
                                            {
                                                flag = flag1;
                                                if (zzrl.equals(zziz, ((zziz) (obj)).zziz))
                                                {
                                                    flag = flag1;
                                                    if (zzrl.equals(zziA, ((zziA) (obj)).zziA))
                                                    {
                                                        return zza(((zzrh) (obj)));
                                                    }
                                                }
                                            }
                                        }
                                    }
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
        return ((((((((((zzrl.hashCode(zzir) + 527) * 31 + zzrl.hashCode(zzis)) * 31 + zzrl.hashCode(zzit)) * 31 + zzrl.hashCode(zziu)) * 31 + zzrl.hashCode(zziv)) * 31 + zzrl.hashCode(zziw)) * 31 + zzrl.hashCode(zzix)) * 31 + zzrl.hashCode(zziy)) * 31 + zzrl.hashCode(zziz)) * 31 + zzrl.hashCode(zziA)) * 31 + zzBI();
    }

    protected int zzB()
    {
        boolean flag = false;
        int l = super.zzB();
        int j;
        int k;
        if (zzir != null && zzir.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < zzir.length; i++)
            {
                k += zzrg.zzkJ(zzir[i]);
            }

            k = l + k + zzir.length * 1;
        } else
        {
            k = l;
        }
        j = k;
        if (zzis != null)
        {
            j = k;
            if (zzis.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzis.length; j++)
                {
                    l += zzrg.zzkJ(zzis[j]);
                }

                j = k + l + zzis.length * 1;
            }
        }
        k = j;
        if (zzit != null)
        {
            k = j;
            if (zzit.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzit.length; k++)
                {
                    l += zzrg.zzkJ(zzit[k]);
                }

                k = j + l + zzit.length * 1;
            }
        }
        j = k;
        if (zziu != null)
        {
            j = k;
            if (zziu.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziu.length; j++)
                {
                    l += zzrg.zzkJ(zziu[j]);
                }

                j = k + l + zziu.length * 1;
            }
        }
        k = j;
        if (zziv != null)
        {
            k = j;
            if (zziv.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zziv.length; k++)
                {
                    l += zzrg.zzkJ(zziv[k]);
                }

                k = j + l + zziv.length * 1;
            }
        }
        j = k;
        if (zziw != null)
        {
            j = k;
            if (zziw.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziw.length; j++)
                {
                    l += zzrg.zzkJ(zziw[j]);
                }

                j = k + l + zziw.length * 1;
            }
        }
        k = j;
        if (zzix != null)
        {
            k = j;
            if (zzix.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzix.length; k++)
                {
                    l += zzrg.zzkJ(zzix[k]);
                }

                k = j + l + zzix.length * 1;
            }
        }
        j = k;
        if (zziy != null)
        {
            j = k;
            if (zziy.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zziy.length; j++)
                {
                    l += zzrg.zzkJ(zziy[j]);
                }

                j = k + l + zziy.length * 1;
            }
        }
        k = j;
        if (zziz != null)
        {
            k = j;
            if (zziz.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zziz.length; k++)
                {
                    l += zzrg.zzkJ(zziz[k]);
                }

                k = j + l + zziz.length * 1;
            }
        }
        j = k;
        if (zziA != null)
        {
            j = k;
            if (zziA.length > 0)
            {
                l = 0;
                for (j = ((flag) ? 1 : 0); j < zziA.length; j++)
                {
                    l += zzrg.zzkJ(zziA[j]);
                }

                j = k + l + zziA.length * 1;
            }
        }
        return j;
    }

    public zziA zzL()
    {
        zzir = zzrq.zzaWh;
        zzis = zzrq.zzaWh;
        zzit = zzrq.zzaWh;
        zziu = zzrq.zzaWh;
        zziv = zzrq.zzaWh;
        zziw = zzrq.zzaWh;
        zzix = zzrq.zzaWh;
        zziy = zzrq.zzaWh;
        zziz = zzrq.zzaWh;
        zziA = zzrq.zzaWh;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        boolean flag = false;
        if (zzir != null && zzir.length > 0)
        {
            for (int i = 0; i < zzir.length; i++)
            {
                zzrg1.zzy(1, zzir[i]);
            }

        }
        if (zzis != null && zzis.length > 0)
        {
            for (int j = 0; j < zzis.length; j++)
            {
                zzrg1.zzy(2, zzis[j]);
            }

        }
        if (zzit != null && zzit.length > 0)
        {
            for (int k = 0; k < zzit.length; k++)
            {
                zzrg1.zzy(3, zzit[k]);
            }

        }
        if (zziu != null && zziu.length > 0)
        {
            for (int l = 0; l < zziu.length; l++)
            {
                zzrg1.zzy(4, zziu[l]);
            }

        }
        if (zziv != null && zziv.length > 0)
        {
            for (int i1 = 0; i1 < zziv.length; i1++)
            {
                zzrg1.zzy(5, zziv[i1]);
            }

        }
        if (zziw != null && zziw.length > 0)
        {
            for (int j1 = 0; j1 < zziw.length; j1++)
            {
                zzrg1.zzy(6, zziw[j1]);
            }

        }
        if (zzix != null && zzix.length > 0)
        {
            for (int k1 = 0; k1 < zzix.length; k1++)
            {
                zzrg1.zzy(7, zzix[k1]);
            }

        }
        if (zziy != null && zziy.length > 0)
        {
            for (int l1 = 0; l1 < zziy.length; l1++)
            {
                zzrg1.zzy(8, zziy[l1]);
            }

        }
        if (zziz != null && zziz.length > 0)
        {
            for (int i2 = 0; i2 < zziz.length; i2++)
            {
                zzrg1.zzy(9, zziz[i2]);
            }

        }
        if (zziA != null && zziA.length > 0)
        {
            for (int j2 = ((flag) ? 1 : 0); j2 < zziA.length; j2++)
            {
                zzrg1.zzy(10, zziA[j2]);
            }

        }
        super.zza(zzrg1);
    }

    public ()
    {
        zzL();
    }
}
