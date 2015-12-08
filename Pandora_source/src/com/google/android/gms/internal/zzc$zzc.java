// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznw, zznr, 
//            zznq, zzny

public static final class zzg extends zzns
{

    private static volatile zzaNT zzgj[];
    public String zzgk;
    public long zzgl;
    public long zzgm;
    public boolean zzgn;
    public long zzgo;

    public static zzg[] zzf()
    {
        if (zzgj == null)
        {
            synchronized (zznw.zzaNS)
            {
                if (zzgj == null)
                {
                    zzgj = new zzgj[0];
                }
            }
        }
        return zzgj;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
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
        if (!(obj instanceof zzgj))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (zzgj)obj;
        if (zzgk != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((zzgk) (obj)).zzgk != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (zzgl == ((zzgl) (obj)).zzgl)
        {
            flag = flag1;
            if (zzgm == ((zzgm) (obj)).zzgm)
            {
                flag = flag1;
                if (zzgn == ((zzgn) (obj)).zzgn)
                {
                    flag = flag1;
                    if (zzgo == ((zzgo) (obj)).zzgo)
                    {
                        return zza(((zzns) (obj)));
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!zzgk.equals(((zzgk) (obj)).zzgk))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public int hashCode()
    {
        int i;
        char c;
        int j;
        int k;
        if (zzgk == null)
        {
            i = 0;
        } else
        {
            i = zzgk.hashCode();
        }
        j = (int)(zzgl ^ zzgl >>> 32);
        k = (int)(zzgm ^ zzgm >>> 32);
        if (zzgn)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + (int)(zzgo ^ zzgo >>> 32)) * 31 + zzzP();
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (!zzgk.equals(""))
        {
            zznr1.zzb(1, zzgk);
        }
        if (zzgl != 0L)
        {
            zznr1.zzb(2, zzgl);
        }
        if (zzgm != 0x7fffffffL)
        {
            zznr1.zzb(3, zzgm);
        }
        if (zzgn)
        {
            zznr1.zzb(4, zzgn);
        }
        if (zzgo != 0L)
        {
            zznr1.zzb(5, zzgo);
        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzd(zznq1);
    }

    protected int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (!zzgk.equals(""))
        {
            i = j + zznr.zzj(1, zzgk);
        }
        j = i;
        if (zzgl != 0L)
        {
            j = i + zznr.zzd(2, zzgl);
        }
        i = j;
        if (zzgm != 0x7fffffffL)
        {
            i = j + zznr.zzd(3, zzgm);
        }
        j = i;
        if (zzgn)
        {
            j = i + zznr.zzc(4, zzgn);
        }
        i = j;
        if (zzgo != 0L)
        {
            i = j + zznr.zzd(5, zzgo);
        }
        return i;
    }

    public zzgo zzd(zznq zznq1)
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
                zzgk = zznq1.readString();
                break;

            case 16: // '\020'
                zzgl = zznq1.zzzA();
                break;

            case 24: // '\030'
                zzgm = zznq1.zzzA();
                break;

            case 32: // ' '
                zzgn = zznq1.zzzC();
                break;

            case 40: // '('
                zzgo = zznq1.zzzA();
                break;
            }
        } while (true);
    }

    public A zzg()
    {
        zzgk = "";
        zzgl = 0L;
        zzgm = 0x7fffffffL;
        zzgn = false;
        zzgo = 0L;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public ()
    {
        zzg();
    }
}
