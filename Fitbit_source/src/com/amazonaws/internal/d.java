// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.internal;

import java.io.IOException;
import java.io.InputStream;
import java.security.DigestInputStream;
import java.security.MessageDigest;

// Referenced classes of package com.amazonaws.internal:
//            c

public class d extends DigestInputStream
    implements c
{

    static final boolean a;
    private static final int b = 2048;

    public d(InputStream inputstream, MessageDigest messagedigest)
    {
        super(inputstream, messagedigest);
    }

    public final boolean d()
    {
        if (in instanceof c)
        {
            return ((c)in).d();
        } else
        {
            return false;
        }
    }

    public final long skip(long l)
        throws IOException
    {
        if (l > 0L)
        {
            byte abyte0[] = new byte[(int)Math.min(2048L, l)];
            int i;
            long l1;
            for (l1 = l; l1 > 0L; l1 -= i)
            {
                i = read(abyte0, 0, (int)Math.min(l1, abyte0.length));
                if (i == -1)
                {
                    if (l1 == l)
                    {
                        l = -1L;
                    } else
                    {
                        l -= l1;
                    }
                    return l;
                }
            }

            if (!a && l1 != 0L)
            {
                throw new AssertionError();
            }
        }
        return l;
    }

    static 
    {
        boolean flag;
        if (!com/amazonaws/internal/d.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }
}
