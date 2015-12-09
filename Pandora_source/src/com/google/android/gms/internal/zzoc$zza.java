// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzoc, zznw, zzob, 
//            zznq, zznr, zzny

public static final class zzAd extends zzns
{

    public String zzaOd[];
    public String zzaOe[];
    public int zzaOf[];

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
            if (obj instanceof zzAd)
            {
                obj = (zzAd)obj;
                flag = flag1;
                if (zznw.equals(zzaOd, ((zzaOd) (obj)).zzaOd))
                {
                    flag = flag1;
                    if (zznw.equals(zzaOe, ((zzaOe) (obj)).zzaOe))
                    {
                        flag = flag1;
                        if (zznw.equals(zzaOf, ((zzaOf) (obj)).zzaOf))
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
        return (((zznw.hashCode(zzaOd) + 527) * 31 + zznw.hashCode(zzaOe)) * 31 + zznw.hashCode(zzaOf)) * 31 + zzzP();
    }

    public zzzP zzAd()
    {
        zzaOd = zzob.zzaOa;
        zzaOe = zzob.zzaOa;
        zzaOf = zzob.zzaNV;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public zzaNT zzB(zznq zznq1)
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
                int j1 = zzob.zzb(zznq1, 10);
                String as[];
                int j;
                if (zzaOd == null)
                {
                    j = 0;
                } else
                {
                    j = zzaOd.length;
                }
                as = new String[j1 + j];
                j1 = j;
                if (j != 0)
                {
                    System.arraycopy(zzaOd, 0, as, 0, j);
                    j1 = j;
                }
                for (; j1 < as.length - 1; j1++)
                {
                    as[j1] = zznq1.readString();
                    zznq1.zzzy();
                }

                as[j1] = zznq1.readString();
                zzaOd = as;
                break;

            case 18: // '\022'
                int k1 = zzob.zzb(zznq1, 18);
                String as1[];
                int k;
                if (zzaOe == null)
                {
                    k = 0;
                } else
                {
                    k = zzaOe.length;
                }
                as1 = new String[k1 + k];
                k1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzaOe, 0, as1, 0, k);
                    k1 = k;
                }
                for (; k1 < as1.length - 1; k1++)
                {
                    as1[k1] = zznq1.readString();
                    zznq1.zzzy();
                }

                as1[k1] = zznq1.readString();
                zzaOe = as1;
                break;

            case 24: // '\030'
                int l1 = zzob.zzb(zznq1, 24);
                int ai[];
                int l;
                if (zzaOf == null)
                {
                    l = 0;
                } else
                {
                    l = zzaOf.length;
                }
                ai = new int[l1 + l];
                l1 = l;
                if (l != 0)
                {
                    System.arraycopy(zzaOf, 0, ai, 0, l);
                    l1 = l;
                }
                for (; l1 < ai.length - 1; l1++)
                {
                    ai[l1] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai[l1] = zznq1.zzzB();
                zzaOf = ai;
                break;

            case 26: // '\032'
                int j2 = zznq1.zzjn(zznq1.zzzF());
                int i1 = zznq1.getPosition();
                int i2;
                for (i2 = 0; zznq1.zzzK() > 0; i2++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(i1);
                int ai1[];
                if (zzaOf == null)
                {
                    i1 = 0;
                } else
                {
                    i1 = zzaOf.length;
                }
                ai1 = new int[i2 + i1];
                i2 = i1;
                if (i1 != 0)
                {
                    System.arraycopy(zzaOf, 0, ai1, 0, i1);
                    i2 = i1;
                }
                for (; i2 < ai1.length; i2++)
                {
                    ai1[i2] = zznq1.zzzB();
                }

                zzaOf = ai1;
                zznq1.zzjo(j2);
                break;
            }
        } while (true);
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        boolean flag = false;
        if (zzaOd != null && zzaOd.length > 0)
        {
            for (int i = 0; i < zzaOd.length; i++)
            {
                String s = zzaOd[i];
                if (s != null)
                {
                    zznr1.zzb(1, s);
                }
            }

        }
        if (zzaOe != null && zzaOe.length > 0)
        {
            for (int j = 0; j < zzaOe.length; j++)
            {
                String s1 = zzaOe[j];
                if (s1 != null)
                {
                    zznr1.zzb(2, s1);
                }
            }

        }
        if (zzaOf != null && zzaOf.length > 0)
        {
            for (int k = ((flag) ? 1 : 0); k < zzaOf.length; k++)
            {
                zznr1.zzx(3, zzaOf[k]);
            }

        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzB(zznq1);
    }

    protected int zzc()
    {
        boolean flag = false;
        int k2 = super.zzc();
        int i;
        int k;
        if (zzaOd != null && zzaOd.length > 0)
        {
            i = 0;
            int j = 0;
            int l;
            int k1;
            for (l = 0; i < zzaOd.length; l = k1)
            {
                String s = zzaOd[i];
                int i2 = j;
                k1 = l;
                if (s != null)
                {
                    k1 = l + 1;
                    i2 = j + zznr.zzeB(s);
                }
                i++;
                j = i2;
            }

            i = k2 + j + l * 1;
        } else
        {
            i = k2;
        }
        k = i;
        if (zzaOe != null)
        {
            k = i;
            if (zzaOe.length > 0)
            {
                k = 0;
                int i1 = 0;
                int l1;
                int j2;
                for (l1 = 0; k < zzaOe.length; l1 = j2)
                {
                    String s1 = zzaOe[k];
                    k2 = i1;
                    j2 = l1;
                    if (s1 != null)
                    {
                        j2 = l1 + 1;
                        k2 = i1 + zznr.zzeB(s1);
                    }
                    k++;
                    i1 = k2;
                }

                k = i + i1 + l1 * 1;
            }
        }
        i = k;
        if (zzaOf != null)
        {
            i = k;
            if (zzaOf.length > 0)
            {
                int j1 = 0;
                for (i = ((flag) ? 1 : 0); i < zzaOf.length; i++)
                {
                    j1 += zznr.zzju(zzaOf[i]);
                }

                i = k + j1 + zzaOf.length * 1;
            }
        }
        return i;
    }

    public ()
    {
        zzAd();
    }
}
