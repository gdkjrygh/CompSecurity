// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            n, pg

class p
    implements n
{

    private pg kY;
    private byte kZ[];
    private final int la;

    public p(int i)
    {
        la = i;
        reset();
    }

    public byte[] A()
        throws IOException
    {
        int i = kY.qx();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return kZ;
        } else
        {
            byte abyte0[] = new byte[kZ.length - i];
            System.arraycopy(kZ, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public void b(int i, long l)
        throws IOException
    {
        kY.b(i, l);
    }

    public void b(int i, String s)
        throws IOException
    {
        kY.b(i, s);
    }

    public void reset()
    {
        kZ = new byte[la];
        kY = pg.q(kZ);
    }
}
