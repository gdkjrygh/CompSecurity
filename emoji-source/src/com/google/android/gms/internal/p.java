// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import java.io.IOException;

// Referenced classes of package com.google.android.gms.internal:
//            n, lz

class p
    implements n
{

    private lz kn;
    private byte ko[];
    private final int kp;

    public p(int i)
    {
        kp = i;
        reset();
    }

    public byte[] A()
        throws IOException
    {
        int i = kn.nQ();
        if (i < 0)
        {
            throw new IOException();
        }
        if (i == 0)
        {
            return ko;
        } else
        {
            byte abyte0[] = new byte[ko.length - i];
            System.arraycopy(ko, 0, abyte0, 0, abyte0.length);
            return abyte0;
        }
    }

    public void b(int i, long l)
        throws IOException
    {
        kn.b(i, l);
    }

    public void b(int i, String s)
        throws IOException
    {
        kn.b(i, s);
    }

    public void reset()
    {
        ko = new byte[kp];
        kn = lz.q(ko);
    }
}
