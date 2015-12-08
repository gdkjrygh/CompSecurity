// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.okhttp;

import com.squareup.okhttp.internal.k;
import java.io.IOException;
import okio.d;

// Referenced classes of package com.squareup.okhttp:
//            r

public abstract class u
{

    public u()
    {
    }

    public static u a(r r, byte abyte0[])
    {
        int i = abyte0.length;
        if (abyte0 == null)
        {
            throw new NullPointerException("content == null");
        } else
        {
            k.a(abyte0.length, i);
            return new u(r, i, abyte0) {

                final r a;
                final int b;
                final byte c[];
                final int d = 0;

                public final r a()
                {
                    return a;
                }

                public final void a(d d1)
                    throws IOException
                {
                    d1.c(c, d, b);
                }

                public final long b()
                {
                    return (long)b;
                }

            
            {
                a = r;
                b = i;
                c = abyte0;
                super();
            }
            };
        }
    }

    public abstract r a();

    public abstract void a(d d)
        throws IOException;

    public long b()
        throws IOException
    {
        return -1L;
    }
}
