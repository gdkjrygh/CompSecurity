// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrg

final class zzrp
{

    final int tag;
    final byte zzaWg[];

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzrp))
            {
                return false;
            }
            obj = (zzrp)obj;
            if (tag != ((zzrp) (obj)).tag || !Arrays.equals(zzaWg, ((zzrp) (obj)).zzaWg))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(zzaWg);
    }

    int zzB()
    {
        return 0 + zzrg.zzkO(tag) + zzaWg.length;
    }

    void zza(zzrg zzrg1)
        throws IOException
    {
        zzrg1.zzkN(tag);
        zzrg1.zzD(zzaWg);
    }
}
