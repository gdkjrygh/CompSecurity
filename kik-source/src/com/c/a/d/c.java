// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.d;

import com.c.a.a.u;
import java.io.InputStream;
import java.io.OutputStream;

// Referenced classes of package com.c.a.d:
//            d

public final class c
{

    private static final OutputStream a = new d();

    public static long a(InputStream inputstream, OutputStream outputstream)
    {
        u.a(inputstream);
        u.a(outputstream);
        byte abyte0[] = new byte[4096];
        long l = 0L;
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                outputstream.write(abyte0, 0, i);
                l += i;
            } else
            {
                return l;
            }
        } while (true);
    }

}
