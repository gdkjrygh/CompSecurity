// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            o, ma

class q
    implements o
{

    private ma kl;
    private byte km[];
    private final int kn;

    public q(int i)
    {
        kn = i;
        reset();
    }

    public void b(int i, long l)
        throws IOException
    {
        kl.b(i, l);
    }

    public void b(int i, String s)
        throws IOException
    {
        kl.b(i, s);
    }

    public void reset()
    {
        km = new byte[kn];
        kl = ma.q(km);
    }

    public byte[] z()
        throws IOException
    {
        int i = kl.nL();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return km;
        } else
        {
            byte abyte0[] = new byte[km.length - i];
            System.arraycopy(km, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }
}
