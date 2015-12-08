// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            pg

final class pp
{

    final byte awV[];
    final int tag;

    pp(int i, byte abyte0[])
    {
        tag = i;
        awV = abyte0;
    }

    void a(pg pg1)
        throws IOException
    {
        pg1.gA(tag);
        pg1.t(awV);
    }

    int c()
    {
        return 0 + pg.gB(tag) + awV.length;
    }

    public boolean equals(Object obj)
    {
        if (obj != this)
        {
            if (!(obj instanceof pp))
            {
                return false;
            }
            obj = (pp)obj;
            if (tag != ((pp) (obj)).tag || !Arrays.equals(awV, ((pp) (obj)).awV))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (tag + 527) * 31 + Arrays.hashCode(awV);
    }
}
