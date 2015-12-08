// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zzrg

final class zzrp
{

    final int a;
    final byte b[];

    zzrp(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    int a()
    {
        return 0 + zzrg.h(a) + b.length;
    }

    void a(zzrg zzrg1)
    {
        zzrg1.g(a);
        zzrg1.d(b);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof zzrp))
            {
                return false;
            }
            obj = (zzrp)obj;
            if (a != ((zzrp) (obj)).a || !Arrays.equals(b, ((zzrp) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (a + 527) * 31 + Arrays.hashCode(b);
    }
}
