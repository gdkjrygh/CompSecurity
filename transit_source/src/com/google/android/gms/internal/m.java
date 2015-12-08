// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            k, gl

class m
    implements k
{

    private gl dD;
    private byte dE[];
    private final int dF;

    public m(int i)
    {
        dF = i;
        reset();
    }

    public void b(int i, long l)
        throws IOException
    {
        dD.b(i, l);
    }

    public void b(int i, String s)
        throws IOException
    {
        dD.b(i, s);
    }

    public byte[] h()
        throws IOException
    {
        int i = dD.ec();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return dE;
        } else
        {
            byte abyte0[] = new byte[dE.length - i];
            System.arraycopy(dE, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public void reset()
    {
        dE = new byte[dF];
        dD = gl.g(dE);
    }
}
