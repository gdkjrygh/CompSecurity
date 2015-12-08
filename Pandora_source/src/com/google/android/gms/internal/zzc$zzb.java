// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr, 
//            zznq, zzob, zzny

public static final class zze extends zzns
{

    private static volatile zzaNT zzge[];
    public int name;
    public int zzgf[];
    public int zzgg;
    public boolean zzgh;
    public boolean zzgi;

    public static zze[] zzd()
    {
        if (zzge == null)
        {
            synchronized (zznw.zzaNS)
            {
                if (zzge == null)
                {
                    zzge = new zzge[0];
                }
            }
        }
        return zzge;
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
            if (obj instanceof zzge)
            {
                obj = (zzge)obj;
                flag = flag1;
                if (zznw.equals(zzgf, ((zzgf) (obj)).zzgf))
                {
                    flag = flag1;
                    if (zzgg == ((zzgg) (obj)).zzgg)
                    {
                        flag = flag1;
                        if (name == ((name) (obj)).name)
                        {
                            flag = flag1;
                            if (zzgh == ((zzgh) (obj)).zzgh)
                            {
                                flag = flag1;
                                if (zzgi == ((zzgi) (obj)).zzgi)
                                {
                                    return zza(((zzns) (obj)));
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
        int i = zznw.hashCode(zzgf);
        int j = zzgg;
        int k = name;
        char c;
        if (zzgh)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        if (!zzgi)
        {
            c1 = '\u04D5';
        }
        return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + c1) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (zzgi)
        {
            zznr1.zzb(1, zzgi);
        }
        zznr1.zzx(2, zzgg);
        if (zzgf != null && zzgf.length > 0)
        {
            for (int i = 0; i < zzgf.length; i++)
            {
                zznr1.zzx(3, zzgf[i]);
            }

        }
        if (name != 0)
        {
            zznr1.zzx(4, name);
        }
        if (zzgh)
        {
            zznr1.zzb(6, zzgh);
        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzc(zznq1);
    }

    protected int zzc()
    {
        int j = 0;
        int k = super.zzc();
        int i = k;
        if (zzgi)
        {
            i = k + zznr.zzc(1, zzgi);
        }
        k = zznr.zzz(2, zzgg) + i;
        if (zzgf != null && zzgf.length > 0)
        {
            for (i = 0; i < zzgf.length; i++)
            {
                j += zznr.zzju(zzgf[i]);
            }

            j = k + j + zzgf.length * 1;
        } else
        {
            j = k;
        }
        i = j;
        if (name != 0)
        {
            i = j + zznr.zzz(4, name);
        }
        j = i;
        if (zzgh)
        {
            j = i + zznr.zzc(6, zzgh);
        }
        return j;
    }

    public zzgh zzc(zznq zznq1)
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
                zzgi = zznq1.zzzC();
                break;

            case 16: // '\020'
                zzgg = zznq1.zzzB();
                break;

            case 24: // '\030'
                int l = zzob.zzb(zznq1, 24);
                int ai[];
                int j;
                if (zzgf == null)
                {
                    j = 0;
                } else
                {
                    j = zzgf.length;
                }
                ai = new int[l + j];
                l = j;
                if (j != 0)
                {
                    System.arraycopy(zzgf, 0, ai, 0, j);
                    l = j;
                }
                for (; l < ai.length - 1; l++)
                {
                    ai[l] = zznq1.zzzB();
                    zznq1.zzzy();
                }

                ai[l] = zznq1.zzzB();
                zzgf = ai;
                break;

            case 26: // '\032'
                int j1 = zznq1.zzjn(zznq1.zzzF());
                int k = zznq1.getPosition();
                int i1;
                for (i1 = 0; zznq1.zzzK() > 0; i1++)
                {
                    zznq1.zzzB();
                }

                zznq1.zzjp(k);
                int ai1[];
                if (zzgf == null)
                {
                    k = 0;
                } else
                {
                    k = zzgf.length;
                }
                ai1 = new int[i1 + k];
                i1 = k;
                if (k != 0)
                {
                    System.arraycopy(zzgf, 0, ai1, 0, k);
                    i1 = k;
                }
                for (; i1 < ai1.length; i1++)
                {
                    ai1[i1] = zznq1.zzzB();
                }

                zzgf = ai1;
                zznq1.zzjo(j1);
                break;

            case 32: // ' '
                name = zznq1.zzzB();
                break;

            case 48: // '0'
                zzgh = zznq1.zzzC();
                break;
            }
        } while (true);
    }

    public C zze()
    {
        zzgf = zzob.zzaNV;
        zzgg = 0;
        name = 0;
        zzgh = false;
        zzgi = false;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zze();
    }
}
