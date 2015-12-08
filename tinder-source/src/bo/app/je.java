// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.io.FilterInputStream;
import java.io.InputStream;

public final class je extends FilterInputStream
{

    public je(InputStream inputstream)
    {
        super(inputstream);
    }

    public final long skip(long l)
    {
        long l1;
        long l2;
        for (l1 = 0L; l1 < l; l1 = l2 + l1)
        {
            long l3 = in.skip(l - l1);
            l2 = l3;
            if (l3 != 0L)
            {
                continue;
            }
            if (read() < 0)
            {
                break;
            }
            l2 = 1L;
        }

        return l1;
    }
}
