// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            n, qp

class p
    implements n
{

    private qp lb;
    private byte lc[];
    private final int ld;

    public p(int i)
    {
        ld = i;
        reset();
    }

    public byte[] D()
        throws IOException
    {
        int i = lb.rO();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return lc;
        } else
        {
            byte abyte0[] = new byte[lc.length - i];
            System.arraycopy(lc, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public void b(int i, long l)
        throws IOException
    {
        lb.b(i, l);
    }

    public void b(int i, String s)
        throws IOException
    {
        lb.b(i, s);
    }

    public void reset()
    {
        lc = new byte[ld];
        lb = qp.q(lc);
    }
}
