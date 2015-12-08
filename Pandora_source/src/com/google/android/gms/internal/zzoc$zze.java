// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzoc, zznw, zznq, 
//            zznr, zzny

public static final class zzAi extends zzns
{

    private static volatile value zzaOz[];
    public String value;
    public String zzgk;

    public static zzAi[] zzAh()
    {
        if (zzaOz == null)
        {
            synchronized (zznw.zzaNS)
            {
                if (zzaOz == null)
                {
                    zzaOz = new zzaOz[0];
                }
            }
        }
        return zzaOz;
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
        if (!(obj instanceof zzaOz)) goto _L4; else goto _L3
_L3:
        obj = (zzaOz)obj;
        if (zzgk != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((zzgk) (obj)).zzgk != null) goto _L4; else goto _L7
_L7:
        if (value != null)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        flag = flag1;
        if (((value) (obj)).value != null) goto _L4; else goto _L8
_L8:
        return zza(((zzns) (obj)));
_L6:
        if (!zzgk.equals(((zzgk) (obj)).zzgk))
        {
            return false;
        }
          goto _L7
        if (!value.equals(((value) (obj)).value))
        {
            return false;
        }
          goto _L8
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (zzgk == null)
        {
            i = 0;
        } else
        {
            i = zzgk.hashCode();
        }
        if (value != null)
        {
            j = value.hashCode();
        }
        return ((i + 527) * 31 + j) * 31 + zzzP();
    }

    public zzzP zzAi()
    {
        zzgk = "";
        value = "";
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public zzaNT zzF(zznq zznq1)
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

            case 18: // '\022'
                value = zznq1.readString();
                break;
            }
        } while (true);
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (!zzgk.equals(""))
        {
            zznr1.zzb(1, zzgk);
        }
        if (!value.equals(""))
        {
            zznr1.zzb(2, value);
        }
        super.zza(zznr1);
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zzF(zznq1);
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
        if (!value.equals(""))
        {
            j = i + zznr.zzj(2, value);
        }
        return j;
    }

    public ()
    {
        zzAi();
    }
}
