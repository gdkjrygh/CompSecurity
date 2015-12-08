// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzns, zzc, zznq, zznr, 
//            zzny

public static final class zzb extends zzns
{

    public int level;
    public int zzgc;
    public int zzgd;

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
            if (obj instanceof zzb)
            {
                obj = (zzb)obj;
                flag = flag1;
                if (level == ((level) (obj)).level)
                {
                    flag = flag1;
                    if (zzgc == ((zzgc) (obj)).zzgc)
                    {
                        flag = flag1;
                        if (zzgd == ((zzgd) (obj)).zzgd)
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
        return (((level + 527) * 31 + zzgc) * 31 + zzgd) * 31 + zzzP();
    }

    public zzzP zza(zznq zznq1)
        throws IOException
    {
_L6:
        int i = zznq1.zzzy();
        i;
        JVM INSTR lookupswitch 4: default 48
    //                   0: 57
    //                   8: 59
    //                   16: 103
    //                   24: 114;
           goto _L1 _L2 _L3 _L4 _L5
_L1:
        if (zza(zznq1, i)) goto _L6; else goto _L2
_L2:
        return this;
_L3:
        int j = zznq1.zzzB();
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
        zzgc = zznq1.zzzB();
        continue; /* Loop/switch isn't completed */
_L5:
        zzgd = zznq1.zzzB();
        if (true) goto _L6; else goto _L7
_L7:
    }

    public void zza(zznr zznr1)
        throws IOException
    {
        if (level != 1)
        {
            zznr1.zzx(1, level);
        }
        if (zzgc != 0)
        {
            zznr1.zzx(2, zzgc);
        }
        if (zzgd != 0)
        {
            zznr1.zzx(3, zzgd);
        }
        super.zza(zznr1);
    }

    public  zzb()
    {
        level = 1;
        zzgc = 0;
        zzgd = 0;
        zzaNI = null;
        zzaNT = -1;
        return this;
    }

    public zzny zzb(zznq zznq1)
        throws IOException
    {
        return zza(zznq1);
    }

    protected int zzc()
    {
        int j = super.zzc();
        int i = j;
        if (level != 1)
        {
            i = j + zznr.zzz(1, level);
        }
        j = i;
        if (zzgc != 0)
        {
            j = i + zznr.zzz(2, zzgc);
        }
        i = j;
        if (zzgd != 0)
        {
            i = j + zznr.zzz(3, zzgd);
        }
        return i;
    }

    public ()
    {
        zzb();
    }
}
