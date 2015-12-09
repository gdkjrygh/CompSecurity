// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr, 
//            zznq, zzob, zzny

public static final class zzh extends zzns
{

    public zzaNT zzgp[];
    public zzaNT zzgq[];
    public zzaNT zzgr[];

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
            if (obj instanceof zzh)
            {
                obj = (zzh)obj;
                flag = flag1;
                if (zznw.equals(zzgp, ((zzgp) (obj)).zzgp))
                {
                    flag = flag1;
                    if (zznw.equals(zzgq, ((zzgq) (obj)).zzgq))
                    {
                        flag = flag1;
                        if (zznw.equals(zzgr, ((zzgr) (obj)).zzgr))
                        {
                            return zza(((zzns) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((zznw.hashCode(zzgp) + 527) * 31 + zznw.hashCode(zzgq)) * 31 + zznw.hashCode(zzgr)) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        boolean flag = false;
        if (zzgp != null && zzgp.length > 0)
        {
            for (int i = 0; i < zzgp.length; i++)
            {
                zzzP zzzp = zzgp[i];
                if (zzzp != null)
                {
                    zznr1.zza(1, zzzp);
                }
            }

        }
        if (zzgq != null && zzgq.length > 0)
        {
            for (int j = 0; j < zzgq.length; j++)
            {
                zzzP zzzp1 = zzgq[j];
                if (zzzp1 != null)
                {
                    zznr1.zza(2, zzzp1);
                }
            }

        }
        if (zzgr != null && zzgr.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < zzgr.length; k++)
            {
                zzzP zzzp2 = zzgr[k];
                if (zzzp2 != null)
                {
                    zznr1.zza(3, zzzp2);
                }
            }

        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zze(zznq1);
    }

    protected int zzc()
    {
        boolean flag = false;
        int i = super.zzc();
        int j = i;
        if (zzgp != null)
        {
            j = i;
            if (zzgp.length > 0)
            {
                for (j = 0; j < zzgp.length;)
                {
                    zze zze1 = zzgp[j];
                    int i1 = i;
                    if (zze1 != null)
                    {
                        i1 = i + zznr.zzc(1, zze1);
                    }
                    j++;
                    i = i1;
                }

                j = i;
            }
        }
        i = j;
        if (zzgq != null)
        {
            i = j;
            if (zzgq.length > 0)
            {
                i = j;
                for (int k = 0; k < zzgq.length;)
                {
                    zze zze2 = zzgq[k];
                    int j1 = i;
                    if (zze2 != null)
                    {
                        j1 = i + zznr.zzc(2, zze2);
                    }
                    k++;
                    i = j1;
                }

            }
        }
        int k1 = i;
        if (zzgr != null)
        {
            k1 = i;
            if (zzgr.length > 0)
            {
                int l = ((flag) ? 1 : 0);
                do
                {
                    k1 = i;
                    if (l >= zzgr.length)
                    {
                        break;
                    }
                    zze zze3 = zzgr[l];
                    k1 = i;
                    if (zze3 != null)
                    {
                        k1 = i + zznr.zzc(3, zze3);
                    }
                    l++;
                    i = k1;
                } while (true);
            }
        }
        return k1;
    }

    public  zze(zznq zznq1)
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
                int i1 = zzob.zzb(zznq1, 10);
                 a[];
                int j;
                if (zzgp == null)
                {
                    j = 0;
                } else
                {
                    j = zzgp.length;
                }
                a = new zzgp[i1 + j];
                i1 = j;
                if (j != 0)
                {
                    System.arraycopy(zzgp, 0, a, 0, j);
                    i1 = j;
                }
                for (; i1 < a.length - 1; i1++)
                {
                    a[i1] = new <init>();
                    zznq1.zza(a[i1]);
                    zznq1.zzzy();
                }

                a[i1] = new <init>();
                zznq1.zza(a[i1]);
                zzgp = a;
                break;

            case 18: // '\022'
                int j1 = zzob.zzb(zznq1, 18);
                 a1[];
                int k;
                if (zzgq == null)
                {
                    k = 0;
                } else
                {
                    k = zzgq.length;
                }
                a1 = new zzgq[j1 + k];
                j1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzgq, 0, a1, 0, k);
                    j1 = k;
                }
                for (; j1 < a1.length - 1; j1++)
                {
                    a1[j1] = new <init>();
                    zznq1.zza(a1[j1]);
                    zznq1.zzzy();
                }

                a1[j1] = new <init>();
                zznq1.zza(a1[j1]);
                zzgq = a1;
                break;

            case 26: // '\032'
                int k1 = zzob.zzb(zznq1, 26);
                 a2[];
                int l;
                if (zzgr == null)
                {
                    l = 0;
                } else
                {
                    l = zzgr.length;
                }
                a2 = new zzgr[k1 + l];
                k1 = l;
                if (l != 0)
                {
                    System.arraycopy(zzgr, 0, a2, 0, l);
                    k1 = l;
                }
                for (; k1 < a2.length - 1; k1++)
                {
                    a2[k1] = new <init>();
                    zznq1.zza(a2[k1]);
                    zznq1.zzzy();
                }

                a2[k1] = new <init>();
                zznq1.zza(a2[k1]);
                zzgr = a2;
                break;
            }
        } while (true);
    }

    public zzgr zzh()
    {
        zzgp = zzr();
        zzgq = zzr();
        zzgr = zzf();
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zzh();
    }
}
