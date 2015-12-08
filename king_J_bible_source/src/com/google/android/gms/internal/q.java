// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            o, ko

class q
    implements o
{

    private ko kk;
    private byte kl[];
    private final int km;

    public q(int i)
    {
        km = i;
        reset();
    }

    public void b(int i, long l)
        throws IOException
    {
        kk.b(i, l);
    }

    public void b(int i, String s)
        throws IOException
    {
        kk.b(i, s);
    }

    public void reset()
    {
        kl = new byte[km];
        kk = ko.o(kl);
    }

    public byte[] z()
        throws IOException
    {
        int i = kk.mv();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return kl;
        } else
        {
            byte abyte0[] = new byte[kl.length - i];
            System.arraycopy(kl, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }
}
