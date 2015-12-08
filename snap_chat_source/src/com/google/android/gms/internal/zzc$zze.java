// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzc, zzww, zzwr, 
//            zzwq, zzwy

public static final class zzj extends zzws
{

    private static volatile zzaHM zzfD[];
    public int key;
    public int value;

    public static zzj[] zzi()
    {
        if (zzfD == null)
        {
            synchronized (zzww.zzaHL)
            {
                if (zzfD == null)
                {
                    zzfD = new zzfD[0];
                }
            }
        }
        return zzfD;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

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
            if (obj instanceof zzfD)
            {
                obj = (zzfD)obj;
                flag = flag1;
                if (key == ((key) (obj)).key)
                {
                    flag = flag1;
                    if (value == ((value) (obj)).value)
                    {
                        return zza(((zzws) (obj)));
                    }
                }
            }
        }
        return flag;
    }

    public final int hashCode()
    {
        return ((key + 527) * 31 + value) * 31 + zzvL();
    }

    public final void zza(zzwr zzwr1)
    {
        zzwr1.zzy(1, key);
        zzwr1.zzy(2, value);
        super.zza(zzwr1);
    }

    public final zzwy zzb(zzwq zzwq1)
    {
        return zzf(zzwq1);
    }

    protected final int zzc()
    {
        return super.zzc() + zzwr.zzA(1, key) + zzwr.zzA(2, value);
    }

    public final value zzf(zzwq zzwq1)
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

            case 8: // '\b'
                key = zzwq1.zzvx();
                break;

            case 16: // '\020'
                value = zzwq1.zzvx();
                break;
            }
        } while (true);
    }

    public final x zzj()
    {
        key = 0;
        value = 0;
        zzaHB = null;
        zzaHM = -1;
        return this;
    }

    public ()
    {
        zzj();
    }
}
