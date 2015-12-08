// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzc, zzww, zzwr, 
//            zzwq, zzwy

public static final class zzg extends zzws
{

    private static volatile zzaHM zzfu[];
    public String zzfv;
    public long zzfw;
    public long zzfx;
    public boolean zzfy;
    public long zzfz;

    public static zzg[] zzf()
    {
        if (zzfu == null)
        {
            synchronized (zzww.zzaHL)
            {
                if (zzfu == null)
                {
                    zzfu = new zzfu[0];
                }
            }
        }
        return zzfu;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean equals(Object obj)
    {
        boolean flag1 = false;
        if (obj != this) goto _L2; else goto _L1
_L1:
        boolean flag = true;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (!(obj instanceof zzfu))
        {
            continue; /* Loop/switch isn't completed */
        }
        obj = (zzfu)obj;
        if (zzfv != null)
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (((zzfv) (obj)).zzfv != null)
        {
            continue; /* Loop/switch isn't completed */
        }
_L5:
        flag = flag1;
        if (zzfw == ((zzfw) (obj)).zzfw)
        {
            flag = flag1;
            if (zzfx == ((zzfx) (obj)).zzfx)
            {
                flag = flag1;
                if (zzfy == ((zzfy) (obj)).zzfy)
                {
                    flag = flag1;
                    if (zzfz == ((zzfz) (obj)).zzfz)
                    {
                        return zza(((zzws) (obj)));
                    }
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        if (!zzfv.equals(((zzfv) (obj)).zzfv))
        {
            return false;
        }
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public final int hashCode()
    {
        int i;
        char c;
        int j;
        int k;
        if (zzfv == null)
        {
            i = 0;
        } else
        {
            i = zzfv.hashCode();
        }
        j = (int)(zzfw ^ zzfw >>> 32);
        k = (int)(zzfx ^ zzfx >>> 32);
        if (zzfy)
        {
            c = '\u04CF';
        } else
        {
            c = '\u04D5';
        }
        return ((c + (((i + 527) * 31 + j) * 31 + k) * 31) * 31 + (int)(zzfz ^ zzfz >>> 32)) * 31 + zzvL();
    }

    public final void zza(zzwr zzwr1)
    {
        if (!zzfv.equals(""))
        {
            zzwr1.zzb(1, zzfv);
        }
        if (zzfw != 0L)
        {
            zzwr1.zzb(2, zzfw);
        }
        if (zzfx != 0x7fffffffL)
        {
            zzwr1.zzb(3, zzfx);
        }
        if (zzfy)
        {
            zzwr1.zzb(4, zzfy);
        }
        if (zzfz != 0L)
        {
            zzwr1.zzb(5, zzfz);
        }
        super.zza(zzwr1);
    }

    public final zzwy zzb(zzwq zzwq1)
    {
        return zzd(zzwq1);
    }

    protected final int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (!zzfv.equals(""))
        {
            i = j + zzwr.zzj(1, zzfv);
        }
        j = i;
        if (zzfw != 0L)
        {
            j = i + zzwr.zzd(2, zzfw);
        }
        i = j;
        if (zzfx != 0x7fffffffL)
        {
            i = j + zzwr.zzd(3, zzfx);
        }
        j = i;
        if (zzfy)
        {
            j = i + zzwr.zzc(4, zzfy);
        }
        i = j;
        if (zzfz != 0L)
        {
            i = j + zzwr.zzd(5, zzfz);
        }
        return i;
    }

    public final zzfz zzd(zzwq zzwq1)
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
                zzfv = zzwq1.readString();
                break;

            case 16: // '\020'
                zzfw = zzwq1.zzvw();
                break;

            case 24: // '\030'
                zzfx = zzwq1.zzvw();
                break;

            case 32: // ' '
                zzfy = zzwq1.zzvy();
                break;

            case 40: // '('
                zzfz = zzwq1.zzvw();
                break;
            }
        } while (true);
    }

    public final w zzg()
    {
        zzfv = "";
        zzfw = 0L;
        zzfx = 0x7fffffffL;
        zzfy = false;
        zzfz = 0L;
        zzaHB = null;
        zzaHM = -1;
        return this;
    }

    public ()
    {
        zzg();
    }
}
