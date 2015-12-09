// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            zznr

final class r
{

    final int a;
    final byte b[];

    r(int i, byte abyte0[])
    {
        a = i;
        b = abyte0;
    }

    int a()
    {
        return 0 + zznr.zzjz(a) + b.length;
    }

    void a(zznr zznr1)
        throws IOException
    {
        zznr1.zzjy(a);
        zznr1.zzz(b);
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof r))
            {
                return false;
            }
            obj = (r)obj;
            if (a != ((r) (obj)).a || !Arrays.equals(b, ((r) (obj)).b))
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
