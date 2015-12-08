// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrg

public static final class zzA extends zzrh
{

    public int level;
    public int zzhK;
    public int zzhL;

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
            if (obj instanceof zzA)
            {
                obj = (zzA)obj;
                flag = flag1;
                if (level == ((level) (obj)).level)
                {
                    flag = flag1;
                    if (zzhK == ((zzhK) (obj)).zzhK)
                    {
                        flag = flag1;
                        if (zzhL == ((zzhL) (obj)).zzhL)
                        {
                            return zza(((zzrh) (obj)));
                        }
                    }
                }
            }
        }
        return flag;
    }

    public int hashCode()
    {
        return (((level + 527) * 31 + zzhK) * 31 + zzhL) * 31 + zzBI();
    }

    public zzBI zzA()
    {
        level = 1;
        zzhK = 0;
        zzhL = 0;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (level != 1)
        {
            i = j + zzrg.zzA(1, level);
        }
        j = i;
        if (zzhK != 0)
        {
            j = i + zzrg.zzA(2, zzhK);
        }
        i = j;
        if (zzhL != 0)
        {
            i = j + zzrg.zzA(3, zzhL);
        }
        return i;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (level != 1)
        {
            zzrg1.zzy(1, level);
        }
        if (zzhK != 0)
        {
            zzrg1.zzy(2, zzhK);
        }
        if (zzhL != 0)
        {
            zzrg1.zzy(3, zzhL);
        }
        super.zza(zzrg1);
    }

    public ()
    {
        zzA();
    }
}
