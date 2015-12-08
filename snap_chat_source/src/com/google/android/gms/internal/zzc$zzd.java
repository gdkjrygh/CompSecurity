// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzc, zzww, zzwr, 
//            zzwq, zzxb, zzwy

public static final class zzh extends zzws
{

    public zzaHM zzfA[];
    public zzaHM zzfB[];
    public zzaHM zzfC[];

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        boolean flag;
        if (obj == this)
        {
            flag = true;
        } else
        {
            flag = flag1;
            if (obj instanceof zzh)
            {
                obj = (zzh)obj;
                flag = flag1;
                if (zzww.equals(zzfA, ((zzfA) (obj)).zzfA))
                {
                    flag = flag1;
                    if (zzww.equals(zzfB, ((zzfB) (obj)).zzfB))
                    {
                        flag = flag1;
                        if (zzww.equals(zzfC, ((zzfC) (obj)).zzfC))
                        {
                            return zza(((zzws) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return (((zzww.hashCode(zzfA) + 527) * 31 + zzww.hashCode(zzfB)) * 31 + zzww.hashCode(zzfC)) * 31 + zzvL();
    }

    public final void zza(zzwr zzwr1)
    {
        boolean flag = false;
        if (zzfA != null && zzfA.length > 0)
        {
            for (int i = 0; i < zzfA.length; i++)
            {
                zzvL zzvl = zzfA[i];
                if (zzvl != null)
                {
                    zzwr1.zza(1, zzvl);
                }
            }

        }
        if (zzfB != null && zzfB.length > 0)
        {
            for (int j = 0; j < zzfB.length; j++)
            {
                zzvL zzvl1 = zzfB[j];
                if (zzvl1 != null)
                {
                    zzwr1.zza(2, zzvl1);
                }
            }

        }
        if (zzfC != null && zzfC.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < zzfC.length; k++)
            {
                zzvL zzvl2 = zzfC[k];
                if (zzvl2 != null)
                {
                    zzwr1.zza(3, zzvl2);
                }
            }

        }
        super.zza(zzwr1);
    }

    public final zzwy zzb(zzwq zzwq1)
    {
        return zze(zzwq1);
    }

    protected final int zzc()
    {
        boolean flag = false;
        int i = super.zzc();
        int j = i;
        if (zzfA != null)
        {
            j = i;
            if (zzfA.length > 0)
            {
                for (j = 0; j < zzfA.length;)
                {
                    zze zze1 = zzfA[j];
                    int i1 = i;
                    if (zze1 != null)
                    {
                        i1 = i + zzwr.zzc(1, zze1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (zzfB != null)
        {
            i = j;
            if (zzfB.length > 0)
            {
                i = j;
                for (int k = 0; k < zzfB.length;)
                {
                    zze zze2 = zzfB[k];
                    int j1 = i;
                    if (zze2 != null)
                    {
                        j1 = i + zzwr.zzc(2, zze2);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (zzfC != null)
        {
            k1 = i;
            if (zzfC.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= zzfC.length)
                    {
                        break;
                    }
                    zze zze3 = zzfC[l];
                    k1 = i;
                    if (zze3 != null)
                    {
                        k1 = i + zzwr.zzc(3, zze3);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public final  zze(zzwq zzwq1)
    {
        do
        {
            int i = zzwq1.zzvu();
            switch (i)
            {
            default:
                if (zza(zzwq1, i))
                {
                    continue;
                }
                // fall through

            case 0: // '\0'
                return this;

            case 10: // '\n'
                int i1 = zzxb.zzc(zzwq1, 10);
                 a[];
                int j;
                if (zzfA == null)
                {
                    j = 0;
                } else
                {
                    j = zzfA.length;
                }
                a = new zzfA[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(zzfA, 0, a, 0, j);
                    i1 = j;
                }
                for (; i1 < a.length - 1; i1++)
                {
                    a[i1] = new <init>();
                    zzwq1.zza(a[i1]);
                    zzwq1.zzvu();
                }

                a[i1] = new <init>();
                zzwq1.zza(a[i1]);
                zzfA = a;
                break;

            case 18: // '\022'
                int j1 = zzxb.zzc(zzwq1, 18);
                 a1[];
                int k;
                if (zzfB == null)
                {
                    k = 0;
                } else
                {
                    k = zzfB.length;
                }
                a1 = new zzfB[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzfB, 0, a1, 0, k);
                    j1 = k;
                }
                for (; j1 < a1.length - 1; j1++)
                {
                    a1[j1] = new <init>();
                    zzwq1.zza(a1[j1]);
                    zzwq1.zzvu();
                }

                a1[j1] = new <init>();
                zzwq1.zza(a1[j1]);
                zzfB = a1;
                break;

            case 26: // '\032'
                int k1 = zzxb.zzc(zzwq1, 26);
                 a2[];
                int l;
                if (zzfC == null)
                {
                    l = 0;
                } else
                {
                    l = zzfC.length;
                }
                a2 = new zzfC[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(zzfC, 0, a2, 0, l);
                    k1 = l;
                }
                for (; k1 < a2.length - 1; k1++)
                {
                    a2[k1] = new <init>();
                    zzwq1.zza(a2[k1]);
                    zzwq1.zzvu();
                }

                a2[k1] = new <init>();
                zzwq1.zza(a2[k1]);
                zzfC = a2;
                break;
            }
        } while (true);
    }

    public final zzfC zzh()
    {
        zzfA = zzr();
        zzfB = zzr();
        zzfC = zzf();
        zzaHB = null;
        zzaHM = -1;
        return this;
    }

    public ()
    {
        zzh();
    }
}
