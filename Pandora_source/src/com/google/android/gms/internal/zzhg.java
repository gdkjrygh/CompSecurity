// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import com.google.android.gms.common.internal.zzu;

// Referenced classes of package com.google.android.gms.internal:
//            zzhp

public final class zzhg extends zzhp
{
    public static final class zza
    {

        public final int zzSP;
        public final int zzSQ;

        public boolean equals(Object obj)
        {
            boolean flag1 = true;
            if (obj instanceof zza) goto _L2; else goto _L1
_L1:
            boolean flag = false;
_L4:
            return flag;
_L2:
            flag = flag1;
            if (this == obj) goto _L4; else goto _L3
_L3:
            obj = (zza)obj;
            if (((zza) (obj)).zzSP != zzSP)
            {
                break; /* Loop/switch isn't completed */
            }
            flag = flag1;
            if (((zza) (obj)).zzSQ == zzSQ) goto _L4; else goto _L5
_L5:
            return false;
        }

        public int hashCode()
        {
            return zzu.hashCode(new Object[] {
                Integer.valueOf(zzSP), Integer.valueOf(zzSQ)
            });
        }

        public zza(int i, int j)
        {
            zzSP = i;
            zzSQ = j;
        }
    }


    public zzhg()
    {
        super(10);
    }
}
