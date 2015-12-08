// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


// Referenced classes of package com.google.android.gms.internal:
//            zzws, zzc, zzwq, zzwr, 
//            zzwy

public static final class zzb extends zzws
{

    public int level;
    public int zzfn;
    public int zzfo;

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
            if (obj instanceof zzb)
            {
                obj = (zzb)obj;
                flag = flag1;
                if (level == ((level) (obj)).level)
                {
                    flag = flag1;
                    if (zzfn == ((zzfn) (obj)).zzfn)
                    {
                        flag = flag1;
                        if (zzfo == ((zzfo) (obj)).zzfo)
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
        return (((level + 527) * 31 + zzfn) * 31 + zzfo) * 31 + zzvL();
    }

    public final zzvL zza(zzwq zzwq1)
    {
_L6:
        int i = zzwq1.zzvu();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   16: 103
    //                   24: 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (zza(zzwq1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = zzwq1.zzvx();
        switch (j)
        {
        case 1: // '\001'
        case 2: // '\002'
        case 3: // '\003'
            level = j;
            break;
        }
        continue; /* Loop/switch isn't completed */
_L4:
        zzfn = zzwq1.zzvx();
        continue; /* Loop/switch isn't completed */
_L5:
        zzfo = zzwq1.zzvx();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public final void zza(zzwr zzwr1)
    {
        if (level != 1)
        {
            zzwr1.zzy(1, level);
        }
        if (zzfn != 0)
        {
            zzwr1.zzy(2, zzfn);
        }
        if (zzfo != 0)
        {
            zzwr1.zzy(3, zzfo);
        }
        super.zza(zzwr1);
    }

    public final  zzb()
    {
        level = 1;
        zzfn = 0;
        zzfo = 0;
        zzaHB = null;
        zzaHM = -1;
        return this;
    }

    public final zzwy zzb(zzwq zzwq1)
    {
        return zza(zzwq1);
    }

    protected final int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (level != 1)
        {
            i = j + zzwr.zzA(1, level);
        }
        j = i;
        if (zzfn != 0)
        {
            j = i + zzwr.zzA(2, zzfn);
        }
        i = j;
        if (zzfo != 0)
        {
            i = j + zzwr.zzA(3, zzfo);
        }
        return i;
    }

    public ()
    {
        zzb();
    }
}
