// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznt, zznw, 
//            zznr, zznq, zzob, zzny

public static final class zzn extends zzns
{

    public static final zznt zzgU = zznt.zza(11, com/google/android/gms/internal/zzc$zzh, 810);
    private static final  zzgV[] = new [0];
    public int zzgW[];
    public int zzgX[];
    public int zzgY[];
    public int zzgZ;
    public int zzha[];
    public int zzhb;
    public int zzhc;

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
            if (obj instanceof zzn)
            {
                obj = (zzn)obj;
                flag = flag1;
                if (zznw.equals(zzgW, ((zzgW) (obj)).zzgW))
                {
                    flag = flag1;
                    if (zznw.equals(zzgX, ((zzgX) (obj)).zzgX))
                    {
                        flag = flag1;
                        if (zznw.equals(zzgY, ((zzgY) (obj)).zzgY))
                        {
                            flag = flag1;
                            if (zzgZ == ((zzgZ) (obj)).zzgZ)
                            {
                                flag = flag1;
                                if (zznw.equals(zzha, ((zzha) (obj)).zzha))
                                {
                                    flag = flag1;
                                    if (zzhb == ((zzhb) (obj)).zzhb)
                                    {
                                        flag = flag1;
                                        if (zzhc == ((zzhc) (obj)).zzhc)
                                        {
                                            return zza(((zzns) (obj)));
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
        return (((((((zznw.hashCode(zzgW) + 527) * 31 + zznw.hashCode(zzgX)) * 31 + zznw.hashCode(zzgY)) * 31 + zzgZ) * 31 + zznw.hashCode(zzha)) * 31 + zzhb) * 31 + zzhc) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        boolean flag = false;
        if (zzgW != null && zzgW.length > 0)
        {
            for (int i = 0; i < zzgW.length; i++)
            {
                zznr1.zzx(1, zzgW[i]);
            }

        }
        if (zzgX != null && zzgX.length > 0)
        {
            for (int j = 0; j < zzgX.length; j++)
            {
                zznr1.zzx(2, zzgX[j]);
            }

        }
        if (zzgY != null && zzgY.length > 0)
        {
            for (int k = 0; k < zzgY.length; k++)
            {
                zznr1.zzx(3, zzgY[k]);
            }

        }
        if (zzgZ != 0)
        {
            zznr1.zzx(4, zzgZ);
        }
        if (zzha != null && zzha.length > 0)
        {
            for (int l = ((flag) ? 1 : 0); l < zzha.length; l++)
            {
                zznr1.zzx(5, zzha[l]);
            }

        }
        if (zzhb != 0)
        {
            zznr1.zzx(6, zzhb);
        }
        if (zzhc != 0)
        {
            zznr1.zzx(7, zzhc);
        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzi(zznq1);
    }

    protected int zzc()
    {
        boolean flag = false;
        int l = super.zzc();
        int j;
        int k;
        if (zzgW != null && zzgW.length > 0)
        {
            int i = 0;
            k = 0;
            for (; i < zzgW.length; i++)
            {
                k += zznr.zzju(zzgW[i]);
            }

            k = l + k + zzgW.length * 1;
        } else
        {
            k = l;
        }
        j = k;
        if (zzgX != null)
        {
            j = k;
            if (zzgX.length > 0)
            {
                j = 0;
                l = 0;
                for (; j < zzgX.length; j++)
                {
                    l += zznr.zzju(zzgX[j]);
                }

                j = k + l + zzgX.length * 1;
            }
        }
        k = j;
        if (zzgY != null)
        {
            k = j;
            if (zzgY.length > 0)
            {
                k = 0;
                l = 0;
                for (; k < zzgY.length; k++)
                {
                    l += zznr.zzju(zzgY[k]);
                }

                k = j + l + zzgY.length * 1;
            }
        }
        j = k;
        if (zzgZ != 0)
        {
            j = k + zznr.zzz(4, zzgZ);
        }
        k = j;
        if (zzha != null)
        {
            k = j;
            if (zzha.length > 0)
            {
                l = 0;
                for (k = ((flag) ? 1 : 0); k < zzha.length; k++)
                {
                    l += zznr.zzju(zzha[k]);
                }

                k = j + l + zzha.length * 1;
            }
        }
        j = k;
        if (zzhb != 0)
        {
            j = k + zznr.zzz(6, zzhb);
        }
        k = j;
        if (zzhc != 0)
        {
            k = j + zznr.zzz(7, zzhc);
        }
        return k;
    }

    public zzhc zzi(zznq zznq1)
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

            case 8: // '\b'
                int j2 = zzob.zzb(zznq1, 8);
                int ai[];
                int j;
                if (zzgW == null)
                {
                    j = 0;
                } else
                {
                    j = zzgW.length;
                }
                ai = new int[j2 + j];
                j2 = j;
                if (j != 0)
                {
                    System.arraycopy(zzgW, 0, ai, 0, j);
                    j2 = j;
                }
                for (; j2 < ai.length - 1; j2++)
                {
                    ai[j2] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai[j2] = zznq1.zzzB();
                zzgW = ai;
                break;

            case 10: // '\n'
                int j4 = zznq1.zzjn(zznq1.zzzF());
                int k = zznq1.getPosition();
                int k2;
                for (k2 = 0; zznq1.zzzK() > 0; k2++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(k);
                int ai1[];
                if (zzgW == null)
                {
                    k = 0;
                } else
                {
                    k = zzgW.length;
                }
                ai1 = new int[k2 + k];
                k2 = k;
                if (k != 0)
                {
                    System.arraycopy(zzgW, 0, ai1, 0, k);
                    k2 = k;
                }
                for (; k2 < ai1.length; k2++)
                {
                    ai1[k2] = zznq1.zzzB();
                }

                zzgW = ai1;
                zznq1.zzjo(j4);
                break;

            case 16: // '\020'
                int l2 = zzob.zzb(zznq1, 16);
                int ai2[];
                int l;
                if (zzgX == null)
                {
                    l = 0;
                } else
                {
                    l = zzgX.length;
                }
                ai2 = new int[l2 + l];
                l2 = l;
                if (l != 0)
                {
                    System.arraycopy(zzgX, 0, ai2, 0, l);
                    l2 = l;
                }
                for (; l2 < ai2.length - 1; l2++)
                {
                    ai2[l2] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai2[l2] = zznq1.zzzB();
                zzgX = ai2;
                break;

            case 18: // '\022'
                int k4 = zznq1.zzjn(zznq1.zzzF());
                int i1 = zznq1.getPosition();
                int i3;
                for (i3 = 0; zznq1.zzzK() > 0; i3++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(i1);
                int ai3[];
                if (zzgX == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzgX.length;
                }
                ai3 = new int[i3 + i1];
                i3 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzgX, 0, ai3, 0, i1);
                    i3 = i1;
                }
                for (; i3 < ai3.length; i3++)
                {
                    ai3[i3] = zznq1.zzzB();
                }

                zzgX = ai3;
                zznq1.zzjo(k4);
                break;

            case 24: // '\030'
                int j3 = zzob.zzb(zznq1, 24);
                int ai4[];
                int j1;
                if (zzgY == null)
                {
                    j1 = 0;
                } else
                {
                    j1 = zzgY.length;
                }
                ai4 = new int[j3 + j1];
                j3 = j1;
                if (j1 != 0)
                {
                    System.arraycopy(zzgY, 0, ai4, 0, j1);
                    j3 = j1;
                }
                for (; j3 < ai4.length - 1; j3++)
                {
                    ai4[j3] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai4[j3] = zznq1.zzzB();
                zzgY = ai4;
                break;

            case 26: // '\032'
                int l4 = zznq1.zzjn(zznq1.zzzF());
                int k1 = zznq1.getPosition();
                int k3;
                for (k3 = 0; zznq1.zzzK() > 0; k3++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(k1);
                int ai5[];
                if (zzgY == null)
                {
                    k1 = 0;
                } else
                {
                    k1 = zzgY.length;
                }
                ai5 = new int[k3 + k1];
                k3 = k1;
                if (k1 != 0)
                {
                    System.arraycopy(zzgY, 0, ai5, 0, k1);
                    k3 = k1;
                }
                for (; k3 < ai5.length; k3++)
                {
                    ai5[k3] = zznq1.zzzB();
                }

                zzgY = ai5;
                zznq1.zzjo(l4);
                break;

            case 32: // ' '
                zzgZ = zznq1.zzzB();
                break;

            case 40: // '('
                int l3 = zzob.zzb(zznq1, 40);
                int ai6[];
                int l1;
                if (zzha == null)
                {
                    l1 = 0;
                } else
                {
                    l1 = zzha.length;
                }
                ai6 = new int[l3 + l1];
                l3 = l1;
                if (l1 != 0)
                {
                    System.arraycopy(zzha, 0, ai6, 0, l1);
                    l3 = l1;
                }
                for (; l3 < ai6.length - 1; l3++)
                {
                    ai6[l3] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai6[l3] = zznq1.zzzB();
                zzha = ai6;
                break;

            case 42: // '*'
                int i5 = zznq1.zzjn(zznq1.zzzF());
                int i2 = zznq1.getPosition();
                int i4;
                for (i4 = 0; zznq1.zzzK() > 0; i4++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(i2);
                int ai7[];
                if (zzha == null)
                {
                    i2 = 0;
                } else
                {
                    i2 = zzha.length;
                }
                ai7 = new int[i4 + i2];
                i4 = i2;
                if (i2 != 0)
                {
                    System.arraycopy(zzha, 0, ai7, 0, i2);
                    i4 = i2;
                }
                for (; i4 < ai7.length; i4++)
                {
                    ai7[i4] = zznq1.zzzB();
                }

                zzha = ai7;
                zznq1.zzjo(i5);
                break;

            case 48: // '0'
                zzhb = zznq1.zzzB();
                break;

            case 56: // '8'
                zzhc = zznq1.zzzB();
                break;
            }
        } while (true);
    }

    public B zzn()
    {
        zzgW = zzob.zzaNV;
        zzgX = zzob.zzaNV;
        zzgY = zzob.zzaNV;
        zzgZ = 0;
        zzha = zzob.zzaNV;
        zzhb = 0;
        zzhc = 0;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }


    public ()
    {
        zzn();
    }
}
