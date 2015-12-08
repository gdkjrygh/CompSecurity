// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            zzrh, zzaf, zzrl, zzrg

public static final class zzO extends zzrh
{

    private static volatile zziM zziK[];
    public String name;
    public zziM zziL;
    public zziM zziM;

    public static zzO[] zzN()
    {
        if (zziK == null)
        {
            synchronized (zzrl.zzaWe)
            {
                if (zziK == null)
                {
                    zziK = new zziK[0];
                }
            }
        }
        return zziK;
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
        if (!(obj instanceof zziK)) goto _L4; else goto _L3
_L3:
        obj = (zziK)obj;
        if (name != null) goto _L6; else goto _L5
_L5:
        flag = flag1;
        if (((name) (obj)).name != null) goto _L4; else goto _L7
_L7:
        if (zziL != null) goto _L9; else goto _L8
_L8:
        flag = flag1;
        if (((zziL) (obj)).zziL != null) goto _L4; else goto _L10
_L10:
        if (zziM != null)
        {
            break MISSING_BLOCK_LABEL_111;
        }
        flag = flag1;
        if (((zziM) (obj)).zziM != null) goto _L4; else goto _L11
_L11:
        return zza(((zzrh) (obj)));
_L6:
        if (!name.equals(((name) (obj)).name))
        {
            return false;
        }
          goto _L7
_L9:
        if (!zziL.equals(((equals) (obj)).zziL))
        {
            return false;
        }
          goto _L10
        if (!zziM.equals(((equals) (obj)).zziM))
        {
            return false;
        }
          goto _L11
    }

    public int hashCode()
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
        if (zziL == null)
        {
            j = 0;
        } else
        {
            j = zziL.hashCode();
        }
        if (zziM != null)
        {
            k = zziM.hashCode();
        }
        return ((j + (i + 527) * 31) * 31 + k) * 31 + zzBI();
    }

    protected int zzB()
    {
        int j = super.zzB();
        int i = j;
        if (!name.equals(""))
        {
            i = j + zzrg.zzk(1, name);
        }
        j = i;
        if (zziL != null)
        {
            j = i + zzrg.zzc(2, zziL);
        }
        i = j;
        if (zziM != null)
        {
            i = j + zzrg.zzc(3, zziM);
        }
        return i;
    }

    public zziM zzO()
    {
        name = "";
        zziL = null;
        zziM = null;
        zzaVU = null;
        zzaWf = -1;
        return this;
    }

    public void zza(zzrg zzrg1)
        throws IOException
    {
        if (!name.equals(""))
        {
            zzrg1.zzb(1, name);
        }
        if (zziL != null)
        {
            zzrg1.zza(2, zziL);
        }
        if (zziM != null)
        {
            zzrg1.zza(3, zziM);
        }
        super.zza(zzrg1);
    }

    public ()
    {
        zzO();
    }
}
