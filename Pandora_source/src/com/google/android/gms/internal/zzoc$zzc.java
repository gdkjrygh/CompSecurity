// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzoc, zznw, zzob, 
//            zznq, zznr, zzny

public static final class zzAf extends zzns
{

    public byte zzaOi[];
    public byte zzaOj[][];
    public boolean zzaOk;

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
            if (obj instanceof zzAf)
            {
                obj = (zzAf)obj;
                flag = flag1;
                if (Arrays.equals(zzaOi, ((zzaOi) (obj)).zzaOi))
                {
                    flag = flag1;
                    if (zznw.zza(zzaOj, ((zzaOj) (obj)).zzaOj))
                    {
                        flag = flag1;
                        if (zzaOk == ((zzaOk) (obj)).zzaOk)
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
        int i = Arrays.hashCode(zzaOi);
        int j = zznw.zza(zzaOj);
        char c;
        if (zzaOk)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return (c + ((i + 527) * 31 + j) * 31) * 31 + zzzP();
    }

    public zzzP zzAf()
    {
        zzaOi = zzob.zzaOc;
        zzaOj = zzob.zzaOb;
        zzaOk = false;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public zzaNT zzD(zznq zznq1)
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
                zzaOi = zznq1.readBytes();
                break;

            case 18: // '\022'
                int k = zzob.zzb(zznq1, 18);
                byte abyte0[][];
                int j;
                if (zzaOj == null)
                {
                    j = 0;
                } else
                {
                    j = zzaOj.length;
                }
                abyte0 = new byte[k + j][];
                k = j;
                if (j != 0)
                {
                    System.arraycopy(zzaOj, 0, abyte0, 0, j);
                    k = j;
                }
                for (; k < abyte0.length - 1; k++)
                {
                    abyte0[k] = zznq1.readBytes();
                    zznq1.zzzy();
                }

                abyte0[k] = zznq1.readBytes();
                zzaOj = abyte0;
                break;

            case 24: // '\030'
                zzaOk = zznq1.zzzC();
                break;
            }
        } while (true);
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (!Arrays.equals(zzaOi, zzob.zzaOc))
        {
            zznr1.zza(1, zzaOi);
        }
        if (zzaOj != null && zzaOj.length > 0)
        {
            for (int i = 0; i < zzaOj.length; i++)
            {
                byte abyte0[] = zzaOj[i];
                if (abyte0 != null)
                {
                    zznr1.zza(2, abyte0);
                }
            }

        }
        if (zzaOk)
        {
            zznr1.zzb(3, zzaOk);
        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzD(zznq1);
    }

    protected int zzc()
    {
        boolean flag = false;
        int j = super.zzc();
        int i = j;
        if (!Arrays.equals(zzaOi, zzob.zzaOc))
        {
            i = j + zznr.zzb(1, zzaOi);
        }
        j = i;
        if (zzaOj != null)
        {
            j = i;
            if (zzaOj.length > 0)
            {
                int k = 0;
                int l = 0;
                for (j = ((flag) ? 1 : 0); j < zzaOj.length;)
                {
                    byte abyte0[] = zzaOj[j];
                    int j1 = k;
                    int i1 = l;
                    if (abyte0 != null)
                    {
                        i1 = l + 1;
                        j1 = k + zznr.zzy(abyte0);
                    }
                    j++;
                    k = j1;
                    l = i1;
                }

                j = i + k + l * 1;
            }
        }
        i = j;
        if (zzaOk)
        {
            i = j + zznr.zzc(3, zzaOk);
        }
        return i;
    }

    public ()
    {
        zzAf();
    }
}
