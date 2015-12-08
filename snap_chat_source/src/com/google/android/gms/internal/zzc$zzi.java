// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzc, zzww, zzwr, 
//            zzwq, zzwy

public static final class zzp extends zzws
{

    private static volatile zzaHM zzgo[];
    public String name;
    public zzaHM zzgp;
    public zzaHM zzgq;

    public static zzp[] zzo()
    {
        if (zzgo == null)
        {
            synchronized (zzww.zzaHL)
            {
                if (zzgo == null)
                {
                    zzgo = new zzgo[0];
                }
            }
        }
        return zzgo;
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
        if (!(obj instanceof zzgo)) goto _L4; else goto _L3
_L3:
        obj = (zzgo)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (zzgp != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((zzgp) (obj)).zzgp != null) goto _L4; else goto _L10
_L10:
        if (zzgq != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        flag = flag1;
        if (((zzgq) (obj)).zzgq != null) goto _L4; else goto _L11
_L11:
        return zza(((zzws) (obj)));
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
_L9:
        if (!zzgp.equals(((equals) (obj)).zzgp))
        {
            return false;
        }
          goto _L10
        if (!zzgq.equals(((equals) (obj)).zzgq))
        {
            return false;
        }
          goto _L11
    }

    public final int hashCode()
    {
        int k = 0;
        int i;
        int j;
        if (name == null)
        {
            i = 0;
        } else
        {
            i = name.hashCode();
        }
        if (zzgp == null)
        {
            j = 0;
        } else
        {
            j = zzgp.hashCode();
        }
        if (zzgq != null)
        {
            k = zzgq.hashCode();
        }
        return ((j + (i + 527) * 31) * 31 + k) * 31 + zzvL();
    }

    public final void zza(zzwr zzwr1)
    {
        if (!name.equals(""))
        {
            zzwr1.zzb(1, name);
        }
        if (zzgp != null)
        {
            zzwr1.zza(2, zzgp);
        }
        if (zzgq != null)
        {
            zzwr1.zza(3, zzgq);
        }
        super.zza(zzwr1);
    }

    public final zzwy zzb(zzwq zzwq1)
    {
        return zzj(zzwq1);
    }

    protected final int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (!name.equals(""))
        {
            i = j + zzwr.zzj(1, name);
        }
        j = i;
        if (zzgp != null)
        {
            j = i + zzwr.zzc(2, zzgp);
        }
        i = j;
        if (zzgq != null)
        {
            i = j + zzwr.zzc(3, zzgq);
        }
        return i;
    }

    public final zzgq zzj(zzwq zzwq1)
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
                name = zzwq1.readString();
                break;

            case 18: // '\022'
                if (zzgp == null)
                {
                    zzgp = new <init>();
                }
                zzwq1.zza(zzgp);
                break;

            case 26: // '\032'
                if (zzgq == null)
                {
                    zzgq = new <init>();
                }
                zzwq1.zza(zzgq);
                break;
            }
        } while (true);
    }

    public final zzgq zzp()
    {
        name = "";
        zzgp = null;
        zzgq = null;
        zzaHB = null;
        zzaHM = -1;
        return this;
    }

    public ()
    {
        zzp();
    }
}
